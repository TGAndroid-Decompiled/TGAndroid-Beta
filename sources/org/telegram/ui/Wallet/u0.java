package org.telegram.ui.Wallet;

import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import c8.va;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.id;
import org.telegram.ui.LaunchActivity;
public final class u0 {
    public final CountDownLatch f43202a = new CountDownLatch(1);
    public volatile boolean f43203b;
    public String f43204c;
    public String d;
    public LaunchActivity f43205e;
    public boolean f43206f;
    public int f43207g;
    public CancellationSignal h;
    public AlertDialog f43208i;

    public final void a() {
        if (!this.f43206f && f()) {
            this.f43206f = true;
            e();
            try {
                KeyguardManager keyguardManager = (KeyguardManager) this.f43205e.getSystemService("keyguard");
                Intent intent = null;
                if (keyguardManager != null) {
                    intent = keyguardManager.createConfirmDeviceCredentialIntent(id.M0(2131742970, null), null);
                }
                if (intent == null) {
                    c("AUTH_UNAVAILABLE");
                    return;
                }
                int i7 = va.f5914a;
                int i10 = i7 + 1;
                va.f5914a = i10;
                this.f43207g = i7;
                if (i10 > 22399) {
                    va.f5914a = 22336;
                }
                this.f43205e.startActivityForResult(intent, i7);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                c("AUTH_UNAVAILABLE");
            }
        }
    }

    public final void b() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.f43205e.getSystemService("fingerprint");
        if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
            this.h = new CancellationSignal();
            this.f43208i = new AlertDialog.Builder(this.f43205e).setTitle(id.M0(2131742970, null)).setMessage(id.M0(2131742989, null)).setNegativeButton(id.M0(2131752589, null), new DialogInterface.OnClickListener(this) {
                public final u0 f43100b;

                {
                    this.f43100b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    switch (r2) {
                        case 0:
                            this.f43100b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f43100b.a();
                            return;
                    }
                }
            }).setPositiveButton(id.M0(2131742965, null), new DialogInterface.OnClickListener(this) {
                public final u0 f43100b;

                {
                    this.f43100b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    switch (r2) {
                        case 0:
                            this.f43100b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f43100b.a();
                            return;
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    u0.this.c("AUTH_CANCELED");
                }
            }).show();
            fingerprintManager.authenticate(null, this.h, 0, new k0.a(this, 1), new Handler(Looper.getMainLooper()));
            return;
        }
        a();
    }

    public final void c(String str) {
        CountDownLatch countDownLatch = this.f43202a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.f43204c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.f43205e).setTitle(id.M0(2131742970, null)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.f43205e.getMainExecutor(), new t0(this));
    }

    public final void e() {
        try {
            CancellationSignal cancellationSignal = this.h;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            AlertDialog alertDialog = this.f43208i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f43208i = null;
    }

    public final boolean f() {
        if (!this.f43203b && this.f43202a.getCount() != 0) {
            return true;
        }
        return false;
    }
}
