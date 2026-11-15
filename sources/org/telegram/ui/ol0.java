package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
public final class ol0 extends ql0 {
    public int H;
    public final jm0 I;

    public ol0(jm0 jm0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.I = jm0Var;
        this.H = 0;
    }

    @Override
    public final void a() {
        jm0 jm0Var = this.I;
        if (jm0Var.getParentActivity() != null) {
            org.telegram.messenger.g0.p3(jm0Var.getParentActivity(), jm0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.H != actionBarButtonColor) {
            ImageView imageView = jm0Var.K;
            if (imageView != null) {
                this.H = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = jm0Var.L;
            if (imageView2 != null) {
                this.H = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        jm0Var.K0();
        jm0Var.F0();
    }
}
