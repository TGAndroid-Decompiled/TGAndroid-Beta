package org.telegram.ui.Wallet;

import a8.af;
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
    public final CountDownLatch f37388a = new CountDownLatch(1);
    public volatile boolean f37389b;
    public String f37390c;
    public String d;
    public LaunchActivity e;
    public boolean f37391f;
    public int f37392g;
    public CancellationSignal h;
    public AlertDialog f37393i;

    public final void a() {
        if (!this.f37391f && f()) {
            this.f37391f = true;
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
                int i10 = af.f359a;
                int i11 = i10 + 1;
                af.f359a = i11;
                this.f37392g = i10;
                if (i11 > 22399) {
                    af.f359a = 22336;
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
            this.f37393i = new AlertDialog.Builder(this.e).setTitle(LocaleController.getString(R.string.WalletUnlock)).setMessage(LocaleController.getString(R.string.WalletTouchFingerprint)).setNegativeButton(LocaleController.getString(R.string.Cancel), new DialogInterface.OnClickListener(this) {
                public final v0 f37179b;

                {
                    this.f37179b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    switch (r2) {
                        case 0:
                            this.f37179b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f37179b.a();
                            return;
                    }
                }
            }).setPositiveButton(LocaleController.getString(R.string.WalletUseDevicePasscode), new DialogInterface.OnClickListener(this) {
                public final v0 f37179b;

                {
                    this.f37179b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    switch (r2) {
                        case 0:
                            this.f37179b.c("AUTH_CANCELED");
                            return;
                        default:
                            this.f37179b.a();
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
        CountDownLatch countDownLatch = this.f37388a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.f37390c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.e).setTitle(LocaleController.getString(R.string.WalletUnlock)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.e.getMainExecutor(), new t0(this));
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
            AlertDialog alertDialog = this.f37393i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        this.f37393i = null;
    }

    public final boolean f() {
        if (!this.f37389b && this.f37388a.getCount() != 0) {
            return true;
        }
        return false;
    }
}
