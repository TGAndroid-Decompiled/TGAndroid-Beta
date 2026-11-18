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
import org.telegram.messenger.gd;
import org.telegram.ui.LaunchActivity;
public final class e1 {
    public final CountDownLatch f44100a = new CountDownLatch(1);
    public volatile boolean f44101b;
    public String f44102c;
    public String d;
    public LaunchActivity f44103e;
    public boolean f44104f;
    public int f44105g;
    public CancellationSignal h;
    public AlertDialog f44106i;

    public final void a() {
        if (!this.f44104f && f()) {
            this.f44104f = true;
            e();
            try {
                KeyguardManager keyguardManager = (KeyguardManager) this.f44103e.getSystemService("keyguard");
                Intent intent = null;
                if (keyguardManager != null) {
                    intent = keyguardManager.createConfirmDeviceCredentialIntent(gd.M0(2131742712, null), null);
                }
                if (intent == null) {
                    c("AUTH_UNAVAILABLE");
                    return;
                }
                int i7 = c8.za.f5098a;
                int i10 = i7 + 1;
                c8.za.f5098a = i10;
                this.f44105g = i7;
                if (i10 > 22399) {
                    c8.za.f5098a = 22336;
                }
                this.f44103e.startActivityForResult(intent, i7);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                c("AUTH_UNAVAILABLE");
            }
        }
    }

    public final void b() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.f44103e.getSystemService("fingerprint");
        if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
            this.h = new CancellationSignal();
            this.f44106i = new AlertDialog.Builder(this.f44103e).setTitle(gd.M0(2131742712, null)).setMessage(gd.M0(2131742731, null)).setNegativeButton(gd.M0(2131752578, null), new DialogInterface.OnClickListener(this) {
                public final e1 f43945b;

                {
                    this.f43945b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    switch (r2) {
                        case 0:
                            this.f43945b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f43945b.a();
                            return;
                    }
                }
            }).setPositiveButton(gd.M0(2131742707, null), new DialogInterface.OnClickListener(this) {
                public final e1 f43945b;

                {
                    this.f43945b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    switch (r2) {
                        case 0:
                            this.f43945b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f43945b.a();
                            return;
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    e1.this.c("AUTH_CANCELED");
                }
            }).show();
            fingerprintManager.authenticate(null, this.h, 0, new k0.a(this, 1), new Handler(Looper.getMainLooper()));
            return;
        }
        a();
    }

    public final void c(String str) {
        CountDownLatch countDownLatch = this.f44100a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.f44102c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.f44103e).setTitle(gd.M0(2131742712, null)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.f44103e.getMainExecutor(), new d1(this));
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
            AlertDialog alertDialog = this.f44106i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f44106i = null;
    }

    public final boolean f() {
        if (!this.f44101b && this.f44100a.getCount() != 0) {
            return true;
        }
        return false;
    }
}
