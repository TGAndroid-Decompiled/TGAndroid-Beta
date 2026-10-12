package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class d31 implements Runnable {
    public final int f35138a;
    public final g31 f35139b;

    public d31(g31 g31Var, int i10) {
        this.f35138a = i10;
        this.f35139b = g31Var;
    }

    @Override
    public final void run() {
        long j10;
        String str;
        switch (this.f35138a) {
            case 0:
                g31 g31Var = this.f35139b;
                AndroidUtilities.cancelRunOnUIThread(g31Var.N);
                boolean z10 = g31Var.f36293r;
                if (z10) {
                    if (z10 && g31Var.F == null) {
                        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        g31Var.F = yj0Var;
                        yj0Var.R(g31Var);
                        g31Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        g31Var.F.K(1);
                        g31Var.F.start();
                    }
                    String str2 = "";
                    if (g31Var.J == 0 || System.currentTimeMillis() / 1000 >= g31Var.J) {
                        if (g31Var.J != 0) {
                            g31Var.I = null;
                            Utilities.themeQueue.postRunnable(new e31(g31Var, g31Var.getWidth(), g31Var.getHeight(), 2));
                            g31Var.f36294s.t("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (g31Var.J == 0) {
                            j10 = 750;
                        } else {
                            j10 = 1750;
                        }
                        messagesController.requestContactToken(j10, new v3(g31Var, 22));
                    }
                    int i10 = g31Var.J;
                    if (i10 > 0 && g31Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.kp0 kp0Var = g31Var.f36294s;
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
                        kp0Var.t(sb2.toString(), true, false);
                    }
                    if (g31Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(g31Var.N, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                g31 g31Var2 = this.f35139b;
                g31Var2.S = false;
                Bitmap bitmap = g31Var2.h;
                if (bitmap != null) {
                    g31Var2.h = null;
                    g31Var2.f36296x.d(0.0f, true);
                    Bitmap bitmap2 = g31Var2.f36292n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    g31Var2.f36292n = bitmap;
                    g31Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
