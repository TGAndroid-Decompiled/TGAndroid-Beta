package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class jp0 extends mp0 {
    public int G;
    public final gq0 H;

    public jp0(gq0 gq0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.H = gq0Var;
        this.G = 0;
    }

    @Override
    public final void a() {
        gq0 gq0Var = this.H;
        if (gq0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(gq0Var.getParentActivity(), gq0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = gq0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = gq0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        gq0Var.G0();
        gq0Var.A0();
    }
}
