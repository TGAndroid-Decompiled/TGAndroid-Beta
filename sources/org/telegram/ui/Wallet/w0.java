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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public final class w0 {
    public final CountDownLatch f35025a = new CountDownLatch(1);
    public volatile boolean f35026b;
    public String f35027c;
    public String d;
    public LaunchActivity e;
    public boolean f35028f;
    public int f35029g;
    public CancellationSignal h;
    public AlertDialog f35030i;

    public final void a() {
        if (!this.f35028f && f()) {
            this.f35028f = true;
            e();
            try {
                KeyguardManager keyguardManager = (KeyguardManager) this.e.getSystemService("keyguard");
                Intent intent = null;
                if (keyguardManager != null) {
                    intent = keyguardManager.createConfirmDeviceCredentialIntent(LocaleController.getString(R.string.WalletUnlock), null);
                }
                if (intent == null) {
                    c("AUTH_UNAVAILABLE");
                    return;
                }
                int i10 = w7.h6.f48701a;
                int i11 = i10 + 1;
                w7.h6.f48701a = i11;
                this.f35029g = i10;
                if (i11 > 22399) {
                    w7.h6.f48701a = 22336;
                }
                this.e.startActivityForResult(intent, i10);
            } catch (Exception e) {
                FileLog.e(e);
                c("AUTH_UNAVAILABLE");
            }
        }
    }

    public final void b() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.e.getSystemService("fingerprint");
        if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
            this.h = new CancellationSignal();
            this.f35030i = new AlertDialog.Builder(this.e).setTitle(LocaleController.getString(R.string.WalletUnlock)).setMessage(LocaleController.getString(R.string.WalletTouchFingerprint)).setNegativeButton(LocaleController.getString(R.string.Cancel), new DialogInterface.OnClickListener(this) {
                public final w0 f34807b;

                {
                    this.f34807b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    switch (r2) {
                        case 0:
                            this.f34807b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f34807b.a();
                            return;
                    }
                }
            }).setPositiveButton(LocaleController.getString(R.string.WalletUseDevicePasscode), new DialogInterface.OnClickListener(this) {
                public final w0 f34807b;

                {
                    this.f34807b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    switch (r2) {
                        case 0:
                            this.f34807b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f34807b.a();
                            return;
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    w0.this.c("AUTH_CANCELED");
                }
            }).show();
            fingerprintManager.authenticate(null, this.h, 0, new v0(this), new Handler(Looper.getMainLooper()));
            return;
        }
        a();
    }

    public final void c(String str) {
        CountDownLatch countDownLatch = this.f35025a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.f35027c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.e).setTitle(LocaleController.getString(R.string.WalletUnlock)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.e.getMainExecutor(), new u0(this));
    }

    public final void e() {
        try {
            CancellationSignal cancellationSignal = this.h;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            AlertDialog alertDialog = this.f35030i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        this.f35030i = null;
    }

    public final boolean f() {
        if (!this.f35026b && this.f35025a.getCount() != 0) {
            return true;
        }
        return false;
    }
}
