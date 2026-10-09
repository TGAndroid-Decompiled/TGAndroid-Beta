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
public final class v0 {
    public final CountDownLatch f35552a = new CountDownLatch(1);
    public volatile boolean f35553b;
    public String f35554c;
    public String d;
    public LaunchActivity f35555e;
    public boolean f35556f;
    public int f35557g;
    public CancellationSignal h;
    public AlertDialog f35558i;

    public final void a() {
        if (!this.f35556f && f()) {
            this.f35556f = true;
            e();
            try {
                KeyguardManager keyguardManager = (KeyguardManager) this.f35555e.getSystemService("keyguard");
                Intent intent = null;
                if (keyguardManager != null) {
                    intent = keyguardManager.createConfirmDeviceCredentialIntent(LocaleController.getString(R.string.WalletUnlock), null);
                }
                if (intent == null) {
                    c("AUTH_UNAVAILABLE");
                    return;
                }
                int i10 = w7.f6.f49952a;
                int i11 = i10 + 1;
                w7.f6.f49952a = i11;
                this.f35557g = i10;
                if (i11 > 22399) {
                    w7.f6.f49952a = 22336;
                }
                this.f35555e.startActivityForResult(intent, i10);
            } catch (Exception e7) {
                FileLog.e(e7);
                c("AUTH_UNAVAILABLE");
            }
        }
    }

    public final void b() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.f35555e.getSystemService("fingerprint");
        if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
            this.h = new CancellationSignal();
            this.f35558i = new AlertDialog.Builder(this.f35555e).setTitle(LocaleController.getString(R.string.WalletUnlock)).setMessage(LocaleController.getString(R.string.WalletTouchFingerprint)).setNegativeButton(LocaleController.getString(R.string.Cancel), new DialogInterface.OnClickListener(this) {
                public final v0 f35438b;

                {
                    this.f35438b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    switch (r2) {
                        case 0:
                            this.f35438b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f35438b.a();
                            return;
                    }
                }
            }).setPositiveButton(LocaleController.getString(R.string.WalletUseDevicePasscode), new DialogInterface.OnClickListener(this) {
                public final v0 f35438b;

                {
                    this.f35438b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    switch (r2) {
                        case 0:
                            this.f35438b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f35438b.a();
                            return;
                    }
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    v0.this.c("AUTH_CANCELED");
                }
            }).show();
            fingerprintManager.authenticate(null, this.h, 0, new u0(this), new Handler(Looper.getMainLooper()));
            return;
        }
        a();
    }

    public final void c(String str) {
        CountDownLatch countDownLatch = this.f35552a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.f35554c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.f35555e).setTitle(LocaleController.getString(R.string.WalletUnlock)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.f35555e.getMainExecutor(), new t0(this));
    }

    public final void e() {
        try {
            CancellationSignal cancellationSignal = this.h;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            AlertDialog alertDialog = this.f35558i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f35558i = null;
    }

    public final boolean f() {
        if (!this.f35553b && this.f35552a.getCount() != 0) {
            return true;
        }
        return false;
    }
}
