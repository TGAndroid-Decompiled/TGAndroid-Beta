package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public final class z7 extends ImageReceiver {

    public final org.telegram.ui.ActionBar.c6 f26042a;

    public final a8 f26043b;

    public z7(a8 a8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f26043b = a8Var;
        this.f26042a = c6Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            a8 a8Var = this.f26043b;
            if (a8Var.G == 0) {
                a8Var.G = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = a8Var.G;
                if (i12 == -1 || i12 == 0) {
                    a8Var.G = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23283q5, this.f26042a);
                }
                a8Var.F.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), a8Var.G));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
