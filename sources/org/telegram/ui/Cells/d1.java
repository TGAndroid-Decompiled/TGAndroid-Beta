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
    public final int f24217a;
    public final t1 f24218b;

    public d1(int i9, t1 t1Var) {
        this.f24217a = i9;
        this.f24218b = t1Var;
    }

    @Override
    public final void run() {
        boolean e32;
        switch (this.f24217a) {
            case 0:
                k1 k1Var = this.f24218b.Fc;
                if (k1Var != null) {
                    k1Var.w();
                    return;
                }
                return;
            default:
                t1 t1Var = this.f24218b;
                d1 d1Var = t1Var.f25456kd;
                MessageObject messageObject = t1Var.f25593u7;
                if (messageObject != null && (e32 = t1Var.e3(messageObject)) != t1Var.S3) {
                    t1Var.S3 = e32;
                    if (!e32) {
                        AndroidUtilities.runOnUIThread(d1Var, 1000L);
                        t1Var.Sc = true;
                        int dp = t1Var.F8 - AndroidUtilities.dp(91.0f);
                        t1Var.P3 = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), org.telegram.ui.ActionBar.f6.H2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.f6.H2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    } else {
                        MessageObject messageObject2 = t1Var.f25593u7;
                        t1Var.f25593u7 = null;
                        t1Var.X3(messageObject2, t1Var.G, t1Var.B, t1Var.A, t1Var.C, false);
                    }
                }
                if (t1Var.S3) {
                    t1Var.invalidate();
                    t1Var.Sc = false;
                    return;
                }
                RectF rectF = t1Var.Y4;
                t1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                if (t1Var.Sc) {
                    AndroidUtilities.runOnUIThread(d1Var, 1000L);
                    return;
                }
                return;
        }
    }
}
