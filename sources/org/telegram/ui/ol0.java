package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class ol0 extends ql0 {
    public int G;
    public final jm0 H;

    public ol0(jm0 jm0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.H = jm0Var;
        this.G = 0;
    }

    @Override
    public final void a() {
        jm0 jm0Var = this.H;
        if (jm0Var.getParentActivity() != null) {
            org.telegram.messenger.g0.p3(jm0Var.getParentActivity(), jm0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = jm0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = jm0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        jm0Var.K0();
        jm0Var.F0();
    }
}
