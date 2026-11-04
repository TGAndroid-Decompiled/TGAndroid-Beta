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
import b8.vf;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.bd;
import org.telegram.ui.LaunchActivity;
public final class t0 {
    public final CountDownLatch f43184a = new CountDownLatch(1);
    public volatile boolean f43185b;
    public String f43186c;
    public String d;
    public LaunchActivity f43187e;
    public boolean f43188f;
    public int f43189g;
    public CancellationSignal h;
    public AlertDialog f43190i;

    public final void a() {
        if (!this.f43188f && f()) {
            this.f43188f = true;
            e();
            try {
                KeyguardManager keyguardManager = (KeyguardManager) this.f43187e.getSystemService("keyguard");
                Intent intent = null;
                if (keyguardManager != null) {
                    intent = keyguardManager.createConfirmDeviceCredentialIntent(bd.M0(2131742980, null), null);
                }
                if (intent == null) {
                    c("AUTH_UNAVAILABLE");
                    return;
                }
                int i3 = vf.f3098a;
                int i10 = i3 + 1;
                vf.f3098a = i10;
                this.f43189g = i3;
                if (i10 > 22399) {
                    vf.f3098a = 22336;
                }
                this.f43187e.startActivityForResult(intent, i3);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                c("AUTH_UNAVAILABLE");
            }
        }
    }

    public final void b() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.f43187e.getSystemService("fingerprint");
        if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
            this.h = new CancellationSignal();
            this.f43190i = new AlertDialog.Builder(this.f43187e).setTitle(bd.M0(2131742980, null)).setMessage(bd.M0(2131742999, null)).setNegativeButton(bd.M0(2131752589, null), new DialogInterface.OnClickListener(this) {
                public final t0 f43070b;

                {
                    this.f43070b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    switch (r2) {
                        case 0:
                            this.f43070b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f43070b.a();
                            return;
                    }
                }
            }).setPositiveButton(bd.M0(2131742975, null), new DialogInterface.OnClickListener(this) {
                public final t0 f43070b;

                {
                    this.f43070b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    switch (r2) {
                        case 0:
                            this.f43070b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f43070b.a();
                            return;
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    t0.this.c("AUTH_CANCELED");
                }
            }).show();
            fingerprintManager.authenticate(null, this.h, 0, new k0.a(this, 1), new Handler(Looper.getMainLooper()));
            return;
        }
        a();
    }

    public final void c(String str) {
        CountDownLatch countDownLatch = this.f43184a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.f43186c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.f43187e).setTitle(bd.M0(2131742980, null)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.f43187e.getMainExecutor(), new s0(this));
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
            AlertDialog alertDialog = this.f43190i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f43190i = null;
    }

    public final boolean f() {
        if (!this.f43185b && this.f43184a.getCount() != 0) {
            return true;
        }
        return false;
    }
}
