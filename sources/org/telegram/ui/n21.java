package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class n21 implements Runnable {
    public final int f35738a;
    public final q21 f35739b;

    public n21(q21 q21Var, int i10) {
        this.f35738a = i10;
        this.f35739b = q21Var;
    }

    @Override
    public final void run() {
        long j3;
        String str;
        switch (this.f35738a) {
            case 0:
                q21 q21Var = this.f35739b;
                AndroidUtilities.cancelRunOnUIThread(q21Var.N);
                boolean z10 = q21Var.f36741r;
                if (z10) {
                    if (z10 && q21Var.F == null) {
                        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        q21Var.F = jj0Var;
                        jj0Var.R(q21Var);
                        q21Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        q21Var.F.K(1);
                        q21Var.F.start();
                    }
                    String str2 = "";
                    if (q21Var.J == 0 || System.currentTimeMillis() / 1000 >= q21Var.J) {
                        if (q21Var.J != 0) {
                            q21Var.I = null;
                            Utilities.themeQueue.postRunnable(new o21(q21Var, q21Var.getWidth(), q21Var.getHeight(), 2));
                            q21Var.f36742s.q("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (q21Var.J == 0) {
                            j3 = 750;
                        } else {
                            j3 = 1750;
                        }
                        messagesController.requestContactToken(j3, new t3(q21Var, 22));
                    }
                    int i10 = q21Var.J;
                    if (i10 > 0 && q21Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.xo0 xo0Var = q21Var.f36742s;
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
                        xo0Var.q(sb2.toString(), true, false);
                    }
                    if (q21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(q21Var.N, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                q21 q21Var2 = this.f35739b;
                q21Var2.S = false;
                Bitmap bitmap = q21Var2.h;
                if (bitmap != null) {
                    q21Var2.h = null;
                    q21Var2.f36744x.d(0.0f, true);
                    Bitmap bitmap2 = q21Var2.f36740n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    q21Var2.f36740n = bitmap;
                    q21Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
