package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class h8 extends ImageReceiver {
    public final org.telegram.ui.ActionBar.u6 f24210a;
    public final i8 f24211b;

    public h8(i8 i8Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f24211b = i8Var;
        this.f24210a = u6Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            i8 i8Var = this.f24211b;
            if (i8Var.K == 0) {
                i8Var.K = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = i8Var.K;
                if (i12 != -1 && i12 != 0) {
                    i8Var.J.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(12.0f), i8Var.K));
                } else {
                    int i13 = org.telegram.ui.ActionBar.y6.q5;
                    org.telegram.ui.ActionBar.u6 u6Var = this.f24210a;
                    i8Var.K = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
                    org.telegram.ui.ActionBar.f7.C(i8Var.J, org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(12.0f), i8Var.K), org.telegram.ui.ActionBar.f7.N(i13), u6Var);
                }
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
