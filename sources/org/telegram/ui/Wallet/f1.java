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
public final class f1 {
    public final CountDownLatch f44273a = new CountDownLatch(1);
    public volatile boolean f44274b;
    public String f44275c;
    public String d;
    public LaunchActivity f44276e;
    public boolean f44277f;
    public int f44278g;
    public CancellationSignal h;
    public AlertDialog f44279i;

    public final void a() {
        if (!this.f44277f && f()) {
            this.f44277f = true;
            e();
            try {
                KeyguardManager keyguardManager = (KeyguardManager) this.f44276e.getSystemService("keyguard");
                Intent intent = null;
                if (keyguardManager != null) {
                    intent = keyguardManager.createConfirmDeviceCredentialIntent(gd.N0(2131742699, null), null);
                }
                if (intent == null) {
                    c("AUTH_UNAVAILABLE");
                    return;
                }
                int i7 = c8.ab.f4477a;
                int i10 = i7 + 1;
                c8.ab.f4477a = i10;
                this.f44278g = i7;
                if (i10 > 22399) {
                    c8.ab.f4477a = 22336;
                }
                this.f44276e.startActivityForResult(intent, i7);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                c("AUTH_UNAVAILABLE");
            }
        }
    }

    public final void b() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.f44276e.getSystemService("fingerprint");
        if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
            this.h = new CancellationSignal();
            this.f44279i = new AlertDialog.Builder(this.f44276e).setTitle(gd.N0(2131742699, null)).setMessage(gd.N0(2131742718, null)).setNegativeButton(gd.N0(2131752577, null), new DialogInterface.OnClickListener(this) {
                public final f1 f44122b;

                {
                    this.f44122b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    switch (r2) {
                        case 0:
                            this.f44122b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f44122b.a();
                            return;
                    }
                }
            }).setPositiveButton(gd.N0(2131742694, null), new DialogInterface.OnClickListener(this) {
                public final f1 f44122b;

                {
                    this.f44122b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    switch (r2) {
                        case 0:
                            this.f44122b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f44122b.a();
                            return;
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    f1.this.c("AUTH_CANCELED");
                }
            }).show();
            fingerprintManager.authenticate(null, this.h, 0, new k0.a(this, 1), new Handler(Looper.getMainLooper()));
            return;
        }
        a();
    }

    public final void c(String str) {
        CountDownLatch countDownLatch = this.f44273a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.f44275c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.f44276e).setTitle(gd.N0(2131742699, null)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.f44276e.getMainExecutor(), new e1(this));
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
            AlertDialog alertDialog = this.f44279i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        this.f44279i = null;
    }

    public final boolean f() {
        if (!this.f44274b && this.f44273a.getCount() != 0) {
            return true;
        }
        return false;
    }
}
