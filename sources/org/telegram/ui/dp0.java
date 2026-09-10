package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class dp0 extends gp0 {
    public int G;
    public final bq0 H;

    public dp0(bq0 bq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = bq0Var;
        this.G = 0;
    }

    @Override
    public final void a() {
        bq0 bq0Var = this.H;
        if (bq0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(bq0Var.getParentActivity(), bq0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = bq0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = bq0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        bq0Var.G0();
        bq0Var.A0();
    }
}
