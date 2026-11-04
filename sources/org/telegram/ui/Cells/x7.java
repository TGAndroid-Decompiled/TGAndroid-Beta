package org.telegram.ui.Cells;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
public final class x7 extends ImageReceiver {
    public final org.telegram.ui.ActionBar.e6 K1;
    public final y7 L1;

    public x7(y7 y7Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(null);
        this.L1 = y7Var;
        this.K1 = e6Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i3, boolean z10, int i10) {
        y7 y7Var = this.L1;
        ImageView imageView = y7Var.K;
        if ((drawable instanceof BitmapDrawable) && y7Var.L == 0) {
            int J0 = org.telegram.messenger.g0.J0(((BitmapDrawable) drawable).getBitmap());
            y7Var.L = J0;
            if (J0 != -1 && J0 != 0) {
                imageView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), y7Var.L));
            } else {
                int i11 = org.telegram.ui.ActionBar.k6.f28120q5;
                org.telegram.ui.ActionBar.e6 e6Var = this.K1;
                y7Var.L = org.telegram.ui.ActionBar.k6.w0(i11, e6Var);
                org.telegram.ui.ActionBar.r6.C(imageView, org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), y7Var.L), org.telegram.ui.ActionBar.r6.N(i11), e6Var);
            }
            invalidate();
        }
        return super.x0(drawable, str, i3, z10, i10);
    }
}
