package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class a8 extends ImageReceiver {
    public final org.telegram.ui.ActionBar.c6 f24092a;
    public final b8 f24093b;

    public a8(b8 b8Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f24093b = b8Var;
        this.f24092a = c6Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        if (drawable instanceof BitmapDrawable) {
            b8 b8Var = this.f24093b;
            if (b8Var.G == 0) {
                b8Var.G = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = b8Var.G;
                if (i12 == -1 || i12 == 0) {
                    b8Var.G = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23294q5, this.f24092a);
                }
                b8Var.F.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), b8Var.G));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z10, i11);
    }
}
