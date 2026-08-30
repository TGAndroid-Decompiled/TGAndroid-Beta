package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class mo0 extends po0 {
    public int C;
    public final gp0 D;

    public mo0(gp0 gp0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.D = gp0Var;
        this.C = 0;
    }

    @Override
    public final void a() {
        gp0 gp0Var = this.D;
        if (gp0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(gp0Var.getParentActivity(), gp0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.C != actionBarButtonColor) {
            ImageView imageView = gp0Var.B;
            if (imageView != null) {
                this.C = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = gp0Var.C;
            if (imageView2 != null) {
                this.C = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        org.telegram.ui.Components.qz qzVar = gp0Var.E;
        if (qzVar != null) {
            qzVar.setBackgroundColor(getTabsViewBackgroundColor());
        }
    }
}
