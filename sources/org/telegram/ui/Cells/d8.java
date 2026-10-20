package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class d8 extends ImageReceiver {
    public final org.telegram.ui.ActionBar.d6 f22145a;
    public final e8 f22146b;

    public d8(e8 e8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f22146b = e8Var;
        this.f22145a = d6Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            e8 e8Var = this.f22146b;
            if (e8Var.K == 0) {
                e8Var.K = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = e8Var.K;
                if (i12 == -1 || i12 == 0) {
                    e8Var.K = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21227q5, this.f22145a);
                }
                e8Var.J.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(12.0f), e8Var.K));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
