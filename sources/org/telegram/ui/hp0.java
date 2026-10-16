package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class hp0 extends kp0 {
    public int G;
    public final eq0 H;

    public hp0(eq0 eq0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.H = eq0Var;
        this.G = 0;
    }

    @Override
    public final void a() {
        eq0 eq0Var = this.H;
        if (eq0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(eq0Var.getParentActivity(), eq0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = eq0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = eq0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        eq0Var.G0();
        eq0Var.A0();
    }
}
