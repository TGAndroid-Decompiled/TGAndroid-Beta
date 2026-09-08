package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class d1 implements Runnable {
    public final int f21752a;
    public final t1 f21753b;

    public d1(int i10, t1 t1Var) {
        this.f21752a = i10;
        this.f21753b = t1Var;
    }

    @Override
    public final void run() {
        boolean e32;
        switch (this.f21752a) {
            case 0:
                k1 k1Var = this.f21753b.Jc;
                if (k1Var != null) {
                    k1Var.s();
                    return;
                }
                return;
            default:
                t1 t1Var = this.f21753b;
                d1 d1Var = t1Var.f23090od;
                MessageObject messageObject = t1Var.f23232y7;
                if (messageObject != null && (e32 = t1Var.e3(messageObject)) != t1Var.W3) {
                    t1Var.W3 = e32;
                    if (!e32) {
                        AndroidUtilities.runOnUIThread(d1Var, 1000L);
                        t1Var.Wc = true;
                        int dp = t1Var.J8 - AndroidUtilities.dp(91.0f);
                        t1Var.T3 = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), org.telegram.ui.ActionBar.j6.H2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.H2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        MessageObject messageObject2 = t1Var.f23232y7;
                        t1Var.f23232y7 = null;
                        t1Var.X3(messageObject2, t1Var.K, t1Var.F, t1Var.E, t1Var.G, false);
                    }
                }
                if (t1Var.W3) {
                    t1Var.invalidate();
                    t1Var.Wc = false;
                    return;
                }
                RectF rectF = t1Var.f22916c5;
                t1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (t1Var.Wc) {
                    AndroidUtilities.runOnUIThread(d1Var, 1000L);
                    return;
                }
                return;
        }
    }
}
