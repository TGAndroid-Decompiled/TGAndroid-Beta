package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class e8 extends ImageReceiver {
    public final org.telegram.ui.ActionBar.d6 f20247a;
    public final f8 f20248b;

    public e8(f8 f8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f20248b = f8Var;
        this.f20247a = d6Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            f8 f8Var = this.f20248b;
            if (f8Var.K == 0) {
                f8Var.K = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = f8Var.K;
                if (i12 == -1 || i12 == 0) {
                    f8Var.K = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19298q5, this.f20247a);
                }
                f8Var.J.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(12.0f), f8Var.K));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
