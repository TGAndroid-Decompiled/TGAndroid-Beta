package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
public final class c8 extends ImageReceiver {
    public final org.telegram.ui.ActionBar.p6 J1;
    public final d8 K1;

    public c8(d8 d8Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(null);
        this.K1 = d8Var;
        this.J1 = p6Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i10, boolean z10, int i11) {
        d8 d8Var = this.K1;
        ImageView imageView = d8Var.J;
        if ((drawable instanceof BitmapDrawable) && d8Var.K == 0) {
            int J0 = org.telegram.messenger.i0.J0(((BitmapDrawable) drawable).getBitmap());
            d8Var.K = J0;
            if (J0 != -1 && J0 != 0) {
                imageView.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(12.0f), d8Var.K));
            } else {
                int i12 = org.telegram.ui.ActionBar.t6.f21169q5;
                org.telegram.ui.ActionBar.p6 p6Var = this.J1;
                d8Var.K = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
                org.telegram.ui.ActionBar.a7.C(imageView, org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(12.0f), d8Var.K), org.telegram.ui.ActionBar.a7.N(i12), p6Var);
            }
            invalidate();
        }
        return super.x0(drawable, str, i10, z10, i11);
    }
}
