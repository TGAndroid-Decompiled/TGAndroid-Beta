package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class p21 implements Runnable {
    public final int f39325a;
    public final s21 f39326b;

    public p21(s21 s21Var, int i10) {
        this.f39325a = i10;
        this.f39326b = s21Var;
    }

    @Override
    public final void run() {
        long j3;
        String str;
        switch (this.f39325a) {
            case 0:
                s21 s21Var = this.f39326b;
                AndroidUtilities.cancelRunOnUIThread(s21Var.N);
                boolean z10 = s21Var.f40336r;
                if (z10) {
                    if (z10 && s21Var.F == null) {
                        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        s21Var.F = kj0Var;
                        kj0Var.R(s21Var);
                        s21Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        s21Var.F.K(1);
                        s21Var.F.start();
                    }
                    String str2 = "";
                    if (s21Var.J == 0 || System.currentTimeMillis() / 1000 >= s21Var.J) {
                        if (s21Var.J != 0) {
                            s21Var.I = null;
                            Utilities.themeQueue.postRunnable(new q21(s21Var, s21Var.getWidth(), s21Var.getHeight(), 2));
                            s21Var.f40337s.q("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (s21Var.J == 0) {
                            j3 = 750;
                        } else {
                            j3 = 1750;
                        }
                        messagesController.requestContactToken(j3, new t3(s21Var, 22));
                    }
                    int i10 = s21Var.J;
                    if (i10 > 0 && s21Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.cp0 cp0Var = s21Var.f40337s;
                        StringBuilder sb2 = new StringBuilder();
                        if (min >= 10) {
                            str = "";
                        } else {
                            str = "0";
                        }
                        sb2.append(str);
                        sb2.append(min);
                        sb2.append(":");
                        if (i11 < 10) {
                            str2 = "0";
                        }
                        sb2.append(str2);
                        sb2.append(i11);
                        cp0Var.q(sb2.toString(), true, false);
                    }
                    if (s21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(s21Var.N, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                s21 s21Var2 = this.f39326b;
                s21Var2.S = false;
                Bitmap bitmap = s21Var2.h;
                if (bitmap != null) {
                    s21Var2.h = null;
                    s21Var2.f40339x.d(0.0f, true);
                    Bitmap bitmap2 = s21Var2.f40335n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    s21Var2.f40335n = bitmap;
                    s21Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
