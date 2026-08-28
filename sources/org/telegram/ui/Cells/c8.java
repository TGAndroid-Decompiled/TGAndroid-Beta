package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class c8 extends ImageReceiver {
    public final org.telegram.ui.ActionBar.b6 f24206a;
    public final d8 f24207b;

    public c8(d8 d8Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f24207b = d8Var;
        this.f24206a = b6Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i9, boolean z10, int i10) {
        if (drawable instanceof BitmapDrawable) {
            d8 d8Var = this.f24207b;
            if (d8Var.G == 0) {
                d8Var.G = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i11 = d8Var.G;
                if (i11 == -1 || i11 == 0) {
                    d8Var.G = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23228q5, this.f24206a);
                }
                d8Var.F.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(12.0f), d8Var.G));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i9, z10, i10);
    }
}
