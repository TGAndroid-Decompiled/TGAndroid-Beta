package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class pl0 extends rl0 {
    public int G;
    public final km0 H;

    public pl0(km0 km0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.H = km0Var;
        this.G = 0;
    }

    @Override
    public final void a() {
        km0 km0Var = this.H;
        if (km0Var.getParentActivity() != null) {
            org.telegram.messenger.g0.p3(km0Var.getParentActivity(), km0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = km0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = km0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        km0Var.K0();
        km0Var.F0();
    }
}
