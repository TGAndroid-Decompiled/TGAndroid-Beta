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
    public final int f20871a;
    public final s1 f20872b;

    public c1(int i10, s1 s1Var) {
        this.f20871a = i10;
        this.f20872b = s1Var;
    }

    @Override
    public final void run() {
        boolean e32;
        switch (this.f20871a) {
            case 0:
                j1 j1Var = this.f20872b.Gc;
                if (j1Var != null) {
                    j1Var.s();
                    return;
                }
                return;
            default:
                s1 s1Var = this.f20872b;
                c1 c1Var = s1Var.f22075ld;
                MessageObject messageObject = s1Var.f22210v7;
                if (messageObject != null && (e32 = s1Var.e3(messageObject)) != s1Var.T3) {
                    s1Var.T3 = e32;
                    if (!e32) {
                        AndroidUtilities.runOnUIThread(c1Var, 1000L);
                        s1Var.Tc = true;
                        int dp = s1Var.G8 - AndroidUtilities.dp(91.0f);
                        s1Var.Q3 = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), org.telegram.ui.ActionBar.j6.H2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.H2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        MessageObject messageObject2 = s1Var.f22210v7;
                        s1Var.f22210v7 = null;
                        s1Var.X3(messageObject2, s1Var.H, s1Var.C, s1Var.B, s1Var.D, false);
                    }
                }
                if (s1Var.T3) {
                    s1Var.invalidate();
                    s1Var.Tc = false;
                    return;
                }
                RectF rectF = s1Var.Z4;
                s1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (s1Var.Tc) {
                    AndroidUtilities.runOnUIThread(c1Var, 1000L);
                    return;
                }
                return;
        }
    }
}
