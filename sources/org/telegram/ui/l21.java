package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class l21 implements Runnable {
    public final int f38474a;
    public final o21 f38475b;

    public l21(o21 o21Var, int i10) {
        this.f38474a = i10;
        this.f38475b = o21Var;
    }

    @Override
    public final void run() {
        long j10;
        String str;
        switch (this.f38474a) {
            case 0:
                o21 o21Var = this.f38475b;
                AndroidUtilities.cancelRunOnUIThread(o21Var.K);
                boolean z4 = o21Var.f39515r;
                if (z4) {
                    if (z4 && o21Var.C == null) {
                        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        o21Var.C = hj0Var;
                        hj0Var.f27542s0 = o21Var;
                        hj0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        o21Var.C.I(1);
                        o21Var.C.start();
                    }
                    String str2 = "";
                    if (o21Var.G == 0 || System.currentTimeMillis() / 1000 >= o21Var.G) {
                        if (o21Var.G != 0) {
                            o21Var.F = null;
                            Utilities.themeQueue.postRunnable(new m21(o21Var, o21Var.getWidth(), o21Var.getHeight(), 2));
                            o21Var.f39516s.q("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (o21Var.G == 0) {
                            j10 = 750;
                        } else {
                            j10 = 1750;
                        }
                        messagesController.requestContactToken(j10, new w3(o21Var, 18));
                    }
                    int i10 = o21Var.G;
                    if (i10 > 0 && o21Var.F != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.no0 no0Var = o21Var.f39516s;
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
                    if (o21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(o21Var.K, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                o21 o21Var2 = this.f38475b;
                o21Var2.P = false;
                Bitmap bitmap = o21Var2.h;
                if (bitmap != null) {
                    o21Var2.h = null;
                    o21Var2.f39518x.d(0.0f, true);
                    Bitmap bitmap2 = o21Var2.f39514n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    o21Var2.f39514n = bitmap;
                    o21Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
