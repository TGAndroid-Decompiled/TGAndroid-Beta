package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class e8 extends ImageReceiver {
    public final org.telegram.ui.ActionBar.c6 f21808a;
    public final f8 f21809b;

    public e8(f8 f8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f21809b = f8Var;
        this.f21808a = c6Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            f8 f8Var = this.f21809b;
            if (f8Var.K == 0) {
                f8Var.K = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = f8Var.K;
                if (i12 == -1 || i12 == 0) {
                    f8Var.K = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20798q5, this.f21808a);
                }
                f8Var.J.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(12.0f), f8Var.K));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
