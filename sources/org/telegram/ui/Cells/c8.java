package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class c8 extends ImageReceiver {
    public final org.telegram.ui.ActionBar.g6 f22660a;
    public final d8 f22661b;

    public c8(d8 d8Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f22661b = d8Var;
        this.f22660a = g6Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        if (drawable instanceof BitmapDrawable) {
            d8 d8Var = this.f22661b;
            if (d8Var.H == 0) {
                d8Var.H = AndroidUtilities.getDominantColor(((BitmapDrawable) drawable).getBitmap());
                int i12 = d8Var.H;
                if (i12 == -1 || i12 == 0) {
                    d8Var.H = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21895q5, this.f22660a);
                }
                d8Var.G.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), d8Var.H));
                invalidate();
            }
        }
        return super.setImageBitmapByKey(drawable, str, i10, z4, i11);
    }
}
