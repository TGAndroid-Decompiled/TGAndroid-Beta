package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class c1 implements Runnable {
    public final int f22631a;
    public final t1 f22632b;

    public c1(int i10, t1 t1Var) {
        this.f22631a = i10;
        this.f22632b = t1Var;
    }

    @Override
    public final void run() {
        boolean e32;
        switch (this.f22631a) {
            case 0:
                k1 k1Var = this.f22632b.Gc;
                if (k1Var != null) {
                    k1Var.r();
                    return;
                }
                return;
            default:
                t1 t1Var = this.f22632b;
                c1 c1Var = t1Var.f23938ld;
                MessageObject messageObject = t1Var.f24073v7;
                if (messageObject != null && (e32 = t1Var.e3(messageObject)) != t1Var.T3) {
                    t1Var.T3 = e32;
                    if (!e32) {
                        AndroidUtilities.runOnUIThread(c1Var, 1000L);
                        t1Var.Tc = true;
                        int dp = t1Var.G8 - AndroidUtilities.dp(91.0f);
                        t1Var.Q3 = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), org.telegram.ui.ActionBar.k6.H2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.H2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        MessageObject messageObject2 = t1Var.f24073v7;
                        t1Var.f24073v7 = null;
                        t1Var.X3(messageObject2, t1Var.H, t1Var.C, t1Var.B, t1Var.D, false);
                    }
                }
                if (t1Var.T3) {
                    t1Var.invalidate();
                    t1Var.Tc = false;
                    return;
                }
                RectF rectF = t1Var.Z4;
                t1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (t1Var.Tc) {
                    AndroidUtilities.runOnUIThread(c1Var, 1000L);
                    return;
                }
                return;
        }
    }
}
