package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class e21 implements Runnable {
    public final int f33873a;
    public final h21 f33874b;

    public e21(h21 h21Var, int i10) {
        this.f33873a = i10;
        this.f33874b = h21Var;
    }

    @Override
    public final void run() {
        long j10;
        String str;
        switch (this.f33873a) {
            case 0:
                h21 h21Var = this.f33874b;
                AndroidUtilities.cancelRunOnUIThread(h21Var.K);
                boolean z4 = h21Var.f34739r;
                if (z4) {
                    if (z4 && h21Var.C == null) {
                        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), "qr_matrix", AndroidUtilities.dp(200.0f));
                        h21Var.C = gj0Var;
                        gj0Var.f25170s0 = h21Var;
                        gj0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        h21Var.C.I(1);
                        h21Var.C.start();
                    }
                    String str2 = "";
                    if (h21Var.G == 0 || System.currentTimeMillis() / 1000 >= h21Var.G) {
                        if (h21Var.G != 0) {
                            h21Var.F = null;
                            Utilities.themeQueue.postRunnable(new f21(h21Var, h21Var.getWidth(), h21Var.getHeight(), 2));
                            h21Var.f34740s.q("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (h21Var.G == 0) {
                            j10 = 750;
                        } else {
                            j10 = 1750;
                        }
                        messagesController.requestContactToken(j10, new w3(h21Var, 18));
                    }
                    int i10 = h21Var.G;
                    if (i10 > 0 && h21Var.F != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.no0 no0Var = h21Var.f34740s;
                        StringBuilder sb = new StringBuilder();
                        if (min >= 10) {
                            str = "";
                        } else {
                            str = "0";
                        }
                        sb.append(str);
                        sb.append(min);
                        sb.append(":");
                        if (i11 < 10) {
                            str2 = "0";
                        }
                        sb.append(str2);
                        sb.append(i11);
                        no0Var.q(sb.toString(), true, false);
                    }
                    if (h21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(h21Var.K, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                h21 h21Var2 = this.f33874b;
                h21Var2.P = false;
                Bitmap bitmap = h21Var2.h;
                if (bitmap != null) {
                    h21Var2.h = null;
                    h21Var2.f34742x.d(0.0f, true);
                    Bitmap bitmap2 = h21Var2.f34738n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    h21Var2.f34738n = bitmap;
                    h21Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
