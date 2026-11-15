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
import c8.xa;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.hd;
import org.telegram.ui.LaunchActivity;
public final class u0 {
    public final CountDownLatch f44537a = new CountDownLatch(1);
    public volatile boolean f44538b;
    public String f44539c;
    public String d;
    public LaunchActivity f44540e;
    public boolean f44541f;
    public int f44542g;
    public CancellationSignal h;
    public AlertDialog f44543i;

    public final void a() {
        if (!this.f44541f && f()) {
            this.f44541f = true;
            e();
            try {
                KeyguardManager keyguardManager = (KeyguardManager) this.f44540e.getSystemService("keyguard");
                Intent intent = null;
                if (keyguardManager != null) {
                    intent = keyguardManager.createConfirmDeviceCredentialIntent(hd.M0(2131742970, null), null);
                }
                if (intent == null) {
                    c("AUTH_UNAVAILABLE");
                    return;
                }
                int i7 = xa.f4777a;
                int i10 = i7 + 1;
                xa.f4777a = i10;
                this.f44542g = i7;
                if (i10 > 22399) {
                    xa.f4777a = 22336;
                }
                this.f44540e.startActivityForResult(intent, i7);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                c("AUTH_UNAVAILABLE");
            }
        }
    }

    public final void b() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.f44540e.getSystemService("fingerprint");
        if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
            this.h = new CancellationSignal();
            this.f44543i = new AlertDialog.Builder(this.f44540e).setTitle(hd.M0(2131742970, null)).setMessage(hd.M0(2131742989, null)).setNegativeButton(hd.M0(2131752589, null), new DialogInterface.OnClickListener(this) {
                public final u0 f44419b;

                {
                    this.f44419b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    switch (r2) {
                        case 0:
                            this.f44419b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f44419b.a();
                            return;
                    }
                }
            }).setPositiveButton(hd.M0(2131742965, null), new DialogInterface.OnClickListener(this) {
                public final u0 f44419b;

                {
                    this.f44419b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    switch (r2) {
                        case 0:
                            this.f44419b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f44419b.a();
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
        CountDownLatch countDownLatch = this.f44537a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.f44539c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.f44540e).setTitle(hd.M0(2131742970, null)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.f44540e.getMainExecutor(), new t0(this));
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
            AlertDialog alertDialog = this.f44543i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f44543i = null;
    }

    public final boolean f() {
        if (!this.f44538b && this.f44537a.getCount() != 0) {
            return true;
        }
        return false;
    }
}
