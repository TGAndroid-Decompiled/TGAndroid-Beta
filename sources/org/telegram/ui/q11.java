package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

public final class q11 implements Runnable {

    public final int f41487a;

    public final t11 f41488b;

    public q11(t11 t11Var, int i10) {
        this.f41487a = i10;
        this.f41488b = t11Var;
    }

    @Override
    public final void run() {
        switch (this.f41487a) {
            case 0:
                t11 t11Var = this.f41488b;
                AndroidUtilities.cancelRunOnUIThread(t11Var.J);
                boolean z10 = t11Var.f42759r;
                if (z10) {
                    if (z10 && t11Var.B == null) {
                        org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), "qr_matrix", AndroidUtilities.dp(200.0f));
                        t11Var.B = oi0Var;
                        oi0Var.f31328r0 = t11Var;
                        oi0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        t11Var.B.I(1);
                        t11Var.B.start();
                    }
                    if (t11Var.F == 0 || System.currentTimeMillis() / 1000 >= t11Var.F) {
                        if (t11Var.F != 0) {
                            t11Var.E = null;
                            Utilities.themeQueue.postRunnable(new r11(t11Var, t11Var.getWidth(), t11Var.getHeight(), 2));
                            t11Var.f42760s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(t11Var.F == 0 ? 750L : 1750L, new x3(t11Var, 18));
                    }
                    int i10 = t11Var.F;
                    if (i10 > 0 && t11Var.E != null) {
                        long jMax = Math.max(0L, (((long) i10) - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (jMax % 60);
                        int iMin = Math.min(99, (int) (jMax / 60));
                        org.telegram.ui.Components.tn0 tn0Var = t11Var.f42760s;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(iMin < 10 ? "0" : "");
                        sb2.append(iMin);
                        sb2.append(":");
                        sb2.append(i11 < 10 ? "0" : "");
                        sb2.append(i11);
                        tn0Var.q(sb2.toString(), true, false);
                    }
                    if (t11Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(t11Var.J, 1000L);
                    }
                    break;
                }
                break;
            default:
                t11 t11Var2 = this.f41488b;
                t11Var2.O = false;
                Bitmap bitmap = t11Var2.h;
                if (bitmap != null) {
                    t11Var2.h = null;
                    t11Var2.f42762x.d(0.0f, true);
                    Bitmap bitmap2 = t11Var2.f42758n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    t11Var2.f42758n = bitmap;
                    t11Var2.invalidate();
                }
                break;
        }
    }
}
