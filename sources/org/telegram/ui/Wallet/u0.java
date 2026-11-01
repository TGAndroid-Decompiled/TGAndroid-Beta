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
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.dd;
import org.telegram.ui.LaunchActivity;
public final class u0 {
    public final CountDownLatch f35260a = new CountDownLatch(1);
    public volatile boolean f35261b;
    public String f35262c;
    public String d;
    public LaunchActivity e;
    public boolean f35263f;
    public int f35264g;
    public CancellationSignal h;
    public AlertDialog f35265i;

    public final void a() {
        if (!this.f35263f && f()) {
            this.f35263f = true;
            e();
            try {
                KeyguardManager keyguardManager = (KeyguardManager) this.e.getSystemService("keyguard");
                Intent intent = null;
                if (keyguardManager != null) {
                    intent = keyguardManager.createConfirmDeviceCredentialIntent(dd.L0(2131742996, null), null);
                }
                if (intent == null) {
                    c("AUTH_UNAVAILABLE");
                    return;
                }
                int i10 = w7.k6.f52635a;
                int i11 = i10 + 1;
                w7.k6.f52635a = i11;
                this.f35264g = i10;
                if (i11 > 22399) {
                    w7.k6.f52635a = 22336;
                }
                this.e.startActivityForResult(intent, i10);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                c("AUTH_UNAVAILABLE");
            }
        }
    }

    public final void b() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.e.getSystemService("fingerprint");
        if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
            this.h = new CancellationSignal();
            this.f35265i = new AlertDialog.Builder(this.e).setTitle(dd.L0(2131742996, null)).setMessage(dd.L0(2131743015, null)).setNegativeButton(dd.L0(2131752589, null), new DialogInterface.OnClickListener(this) {
                public final u0 f35113b;

                {
                    this.f35113b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    switch (r2) {
                        case 0:
                            this.f35113b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f35113b.a();
                            return;
                    }
                }
            }).setPositiveButton(dd.L0(2131742991, null), new DialogInterface.OnClickListener(this) {
                public final u0 f35113b;

                {
                    this.f35113b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    switch (r2) {
                        case 0:
                            this.f35113b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f35113b.a();
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
        CountDownLatch countDownLatch = this.f35260a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.f35262c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.e).setTitle(dd.L0(2131742996, null)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.e.getMainExecutor(), new t0(this));
    }

    public final void e() {
        try {
            CancellationSignal cancellationSignal = this.h;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            AlertDialog alertDialog = this.f35265i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        this.f35265i = null;
    }

    public final boolean f() {
        if (!this.f35261b && this.f35260a.getCount() != 0) {
            return true;
        }
        return false;
    }
}
