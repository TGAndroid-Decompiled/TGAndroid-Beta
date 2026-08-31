package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class g21 implements Runnable {
    public final int f37072a;
    public final j21 f37073b;

    public g21(j21 j21Var, int i10) {
        this.f37072a = i10;
        this.f37073b = j21Var;
    }

    @Override
    public final void run() {
        long j10;
        String str;
        switch (this.f37072a) {
            case 0:
                j21 j21Var = this.f37073b;
                AndroidUtilities.cancelRunOnUIThread(j21Var.K);
                boolean z4 = j21Var.f37998r;
                if (z4) {
                    if (z4 && j21Var.C == null) {
                        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), "qr_matrix", AndroidUtilities.dp(200.0f));
                        j21Var.C = ij0Var;
                        ij0Var.f27835s0 = j21Var;
                        ij0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        j21Var.C.I(1);
                        j21Var.C.start();
                    }
                    String str2 = "";
                    if (j21Var.G == 0 || System.currentTimeMillis() / 1000 >= j21Var.G) {
                        if (j21Var.G != 0) {
                            j21Var.F = null;
                            Utilities.themeQueue.postRunnable(new h21(j21Var, j21Var.getWidth(), j21Var.getHeight(), 2));
                            j21Var.f37999s.q("", true, true);
                        }
                        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                        if (j21Var.G == 0) {
                            j10 = 750;
                        } else {
                            j10 = 1750;
                        }
                        messagesController.requestContactToken(j10, new w3(j21Var, 18));
                    }
                    int i10 = j21Var.G;
                    if (i10 > 0 && j21Var.F != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.oo0 oo0Var = j21Var.f37999s;
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
                        oo0Var.q(sb.toString(), true, false);
                    }
                    if (j21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(j21Var.K, 1000L);
                        return;
                    }
                    return;
                }
                return;
            default:
                j21 j21Var2 = this.f37073b;
                j21Var2.P = false;
                Bitmap bitmap = j21Var2.h;
                if (bitmap != null) {
                    j21Var2.h = null;
                    j21Var2.f38001x.d(0.0f, true);
                    Bitmap bitmap2 = j21Var2.f37997n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    j21Var2.f37997n = bitmap;
                    j21Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
