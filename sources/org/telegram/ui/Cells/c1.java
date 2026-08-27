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

    public final int f24149a;

    public final s1 f24150b;

    public c1(int i10, s1 s1Var) {
        this.f24149a = i10;
        this.f24150b = s1Var;
    }

    @Override
    public final void run() {
        boolean zD3;
        switch (this.f24149a) {
            case 0:
                j1 j1Var = this.f24150b.Fc;
                if (j1Var != null) {
                    j1Var.u();
                }
                break;
            default:
                s1 s1Var = this.f24150b;
                c1 c1Var = s1Var.f25410kd;
                MessageObject messageObject = s1Var.f25546u7;
                if (messageObject != null && (zD3 = s1Var.d3(messageObject)) != s1Var.S3) {
                    s1Var.S3 = zD3;
                    if (zD3) {
                        MessageObject messageObject2 = s1Var.f25546u7;
                        s1Var.f25546u7 = null;
                        s1Var.W3(messageObject2, s1Var.G, s1Var.B, s1Var.A, s1Var.C, false);
                    } else {
                        AndroidUtilities.runOnUIThread(c1Var, 1000L);
                        s1Var.Sc = true;
                        int iDp = s1Var.F8 - AndroidUtilities.dp(91.0f);
                        s1Var.P3 = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), org.telegram.ui.ActionBar.g6.H2, iDp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.g6.H2, iDp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                if (!s1Var.S3) {
                    RectF rectF = s1Var.Y4;
                    s1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                    if (s1Var.Sc) {
                        AndroidUtilities.runOnUIThread(c1Var, 1000L);
                    }
                } else {
                    s1Var.invalidate();
                    s1Var.Sc = false;
                }
                break;
        }
    }
}
