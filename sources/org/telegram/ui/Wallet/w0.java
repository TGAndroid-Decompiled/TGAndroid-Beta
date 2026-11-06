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
import c8.ua;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.hd;
import org.telegram.ui.LaunchActivity;
public final class w0 {
    public final CountDownLatch f43222a = new CountDownLatch(1);
    public volatile boolean f43223b;
    public String f43224c;
    public String d;
    public LaunchActivity f43225e;
    public boolean f43226f;
    public int f43227g;
    public CancellationSignal h;
    public AlertDialog f43228i;

    public final void a() {
        if (!this.f43226f && f()) {
            this.f43226f = true;
            e();
            try {
                KeyguardManager keyguardManager = (KeyguardManager) this.f43225e.getSystemService("keyguard");
                Intent intent = null;
                if (keyguardManager != null) {
                    intent = keyguardManager.createConfirmDeviceCredentialIntent(hd.M0(2131742971, null), null);
                }
                if (intent == null) {
                    c("AUTH_UNAVAILABLE");
                    return;
                }
                int i7 = ua.f5881a;
                int i10 = i7 + 1;
                ua.f5881a = i10;
                this.f43227g = i7;
                if (i10 > 22399) {
                    ua.f5881a = 22336;
                }
                this.f43225e.startActivityForResult(intent, i7);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                c("AUTH_UNAVAILABLE");
            }
        }
    }

    public final void b() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.f43225e.getSystemService("fingerprint");
        if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
            this.h = new CancellationSignal();
            this.f43228i = new AlertDialog.Builder(this.f43225e).setTitle(hd.M0(2131742971, null)).setMessage(hd.M0(2131742990, null)).setNegativeButton(hd.M0(2131752589, null), new DialogInterface.OnClickListener(this) {
                public final w0 f43123b;

                {
                    this.f43123b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    switch (r2) {
                        case 0:
                            this.f43123b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f43123b.a();
                            return;
                    }
                }
            }).setPositiveButton(hd.M0(2131742966, null), new DialogInterface.OnClickListener(this) {
                public final w0 f43123b;

                {
                    this.f43123b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    switch (r2) {
                        case 0:
                            this.f43123b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f43123b.a();
                            return;
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    w0.this.c("AUTH_CANCELED");
                }
            }).show();
            fingerprintManager.authenticate(null, this.h, 0, new k0.a(this, 1), new Handler(Looper.getMainLooper()));
            return;
        }
        a();
    }

    public final void c(String str) {
        CountDownLatch countDownLatch = this.f43222a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.f43224c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.f43225e).setTitle(hd.M0(2131742971, null)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.f43225e.getMainExecutor(), new v0(this));
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
            AlertDialog alertDialog = this.f43228i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f43228i = null;
    }

    public final boolean f() {
        if (!this.f43223b && this.f43222a.getCount() != 0) {
            return true;
        }
        return false;
    }
}
