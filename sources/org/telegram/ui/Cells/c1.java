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
    public final int f23917a;
    public final s1 f23918b;

    public c1(int i10, s1 s1Var) {
        this.f23917a = i10;
        this.f23918b = s1Var;
    }

    @Override
    public final void run() {
        boolean e32;
        switch (this.f23917a) {
            case 0:
                j1 j1Var = this.f23918b.Jc;
                if (j1Var != null) {
                    j1Var.q();
                    return;
                }
                return;
            default:
                s1 s1Var = this.f23918b;
                c1 c1Var = s1Var.f25224od;
                MessageObject messageObject = s1Var.f25363y7;
                if (messageObject != null && (e32 = s1Var.e3(messageObject)) != s1Var.W3) {
                    s1Var.W3 = e32;
                    if (!e32) {
                        AndroidUtilities.runOnUIThread(c1Var, 1000L);
                        s1Var.Wc = true;
                        int dp = s1Var.J8 - AndroidUtilities.dp(91.0f);
                        s1Var.T3 = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), org.telegram.ui.ActionBar.y6.H2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.y6.H2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        MessageObject messageObject2 = s1Var.f25363y7;
                        s1Var.f25363y7 = null;
                        s1Var.Z3(messageObject2, s1Var.K, s1Var.F, s1Var.E, s1Var.G, false);
                    }
                }
                if (s1Var.W3) {
                    s1Var.invalidate();
                    s1Var.Wc = false;
                    return;
                }
                RectF rectF = s1Var.f25045c5;
                s1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (s1Var.Wc) {
                    AndroidUtilities.runOnUIThread(c1Var, 1000L);
                    return;
                }
                return;
        }
    }
}
