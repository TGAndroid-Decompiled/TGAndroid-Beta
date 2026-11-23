package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
public final class y7 extends ImageReceiver {
    public final org.telegram.ui.ActionBar.i6 K1;
    public final z7 L1;

    public y7(z7 z7Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(null);
        this.L1 = z7Var;
        this.K1 = i6Var;
    }

    @Override
    public final boolean y0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        z7 z7Var = this.L1;
        ImageView imageView = z7Var.K;
        if ((drawable instanceof BitmapDrawable) && z7Var.L == 0) {
            int J0 = org.telegram.messenger.g0.J0(((BitmapDrawable) drawable).getBitmap());
            z7Var.L = J0;
            if (J0 != -1 && J0 != 0) {
                imageView.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), z7Var.L));
            } else {
                int i11 = org.telegram.ui.ActionBar.n6.f29690q5;
                org.telegram.ui.ActionBar.i6 i6Var = this.K1;
                z7Var.L = org.telegram.ui.ActionBar.n6.w0(i11, i6Var);
                org.telegram.ui.ActionBar.u6.B(imageView, org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), z7Var.L), org.telegram.ui.ActionBar.u6.M(i11), i6Var);
            }
            invalidate();
        }
        return super.y0(drawable, str, i7, z10, i10);
    }
}
