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
public final class v0 {
    public final CountDownLatch f43217a = new CountDownLatch(1);
    public volatile boolean f43218b;
    public String f43219c;
    public String d;
    public LaunchActivity f43220e;
    public boolean f43221f;
    public int f43222g;
    public CancellationSignal h;
    public AlertDialog f43223i;

    public final void a() {
        if (!this.f43221f && f()) {
            this.f43221f = true;
            e();
            try {
                KeyguardManager keyguardManager = (KeyguardManager) this.f43220e.getSystemService("keyguard");
                Intent intent = null;
                if (keyguardManager != null) {
                    intent = keyguardManager.createConfirmDeviceCredentialIntent(id.M0(2131742973, null), null);
                }
                if (intent == null) {
                    c("AUTH_UNAVAILABLE");
                    return;
                }
                int i7 = va.f5911a;
                int i10 = i7 + 1;
                va.f5911a = i10;
                this.f43222g = i7;
                if (i10 > 22399) {
                    va.f5911a = 22336;
                }
                this.f43220e.startActivityForResult(intent, i7);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                c("AUTH_UNAVAILABLE");
            }
        }
    }

    public final void b() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.f43220e.getSystemService("fingerprint");
        if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
            this.h = new CancellationSignal();
            this.f43223i = new AlertDialog.Builder(this.f43220e).setTitle(id.M0(2131742973, null)).setMessage(id.M0(2131742992, null)).setNegativeButton(id.M0(2131752589, null), new DialogInterface.OnClickListener(this) {
                public final v0 f43117b;

                {
                    this.f43117b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    switch (r2) {
                        case 0:
                            this.f43117b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f43117b.a();
                            return;
                    }
                }
            }).setPositiveButton(id.M0(2131742968, null), new DialogInterface.OnClickListener(this) {
                public final v0 f43117b;

                {
                    this.f43117b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    switch (r2) {
                        case 0:
                            this.f43117b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f43117b.a();
                            return;
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    v0.this.c("AUTH_CANCELED");
                }
            }).show();
            fingerprintManager.authenticate(null, this.h, 0, new k0.a(this, 1), new Handler(Looper.getMainLooper()));
            return;
        }
        a();
    }

    public final void c(String str) {
        CountDownLatch countDownLatch = this.f43217a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.f43219c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.f43220e).setTitle(id.M0(2131742973, null)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.f43220e.getMainExecutor(), new u0(this));
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
            AlertDialog alertDialog = this.f43223i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f43223i = null;
    }

    public final boolean f() {
        if (!this.f43218b && this.f43217a.getCount() != 0) {
            return true;
        }
        return false;
    }
}
