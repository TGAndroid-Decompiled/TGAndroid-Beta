package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class e1 implements Runnable {
    public final int f20222a;
    public final u1 f20223b;

    public e1(int i10, u1 u1Var) {
        this.f20222a = i10;
        this.f20223b = u1Var;
    }

    @Override
    public final void run() {
        boolean e32;
        switch (this.f20222a) {
            case 0:
                l1 l1Var = this.f20223b.Jc;
                if (l1Var != null) {
                    l1Var.s();
                    return;
                }
                return;
            default:
                u1 u1Var = this.f20223b;
                e1 e1Var = u1Var.f21465od;
                MessageObject messageObject = u1Var.f21607y7;
                if (messageObject != null && (e32 = u1Var.e3(messageObject)) != u1Var.W3) {
                    u1Var.W3 = e32;
                    if (!e32) {
                        AndroidUtilities.runOnUIThread(e1Var, 1000L);
                        u1Var.Wc = true;
                        int dp = u1Var.J8 - AndroidUtilities.dp(91.0f);
                        u1Var.T3 = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), org.telegram.ui.ActionBar.h6.H2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.h6.H2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        MessageObject messageObject2 = u1Var.f21607y7;
                        u1Var.f21607y7 = null;
                        u1Var.X3(messageObject2, u1Var.K, u1Var.F, u1Var.E, u1Var.G, false);
                    }
                }
                if (u1Var.W3) {
                    u1Var.invalidate();
                    u1Var.Wc = false;
                    return;
                }
                RectF rectF = u1Var.f21291c5;
                u1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (u1Var.Wc) {
                    AndroidUtilities.runOnUIThread(e1Var, 1000L);
                    return;
                }
                return;
        }
    }
}
