package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class oo0 extends ro0 {
    public int C;
    public final ip0 D;

    public oo0(ip0 ip0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.D = ip0Var;
        this.C = 0;
    }

    @Override
    public final void a() {
        ip0 ip0Var = this.D;
        if (ip0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(ip0Var.getParentActivity(), ip0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.C != actionBarButtonColor) {
            ImageView imageView = ip0Var.B;
            if (imageView != null) {
                this.C = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = ip0Var.C;
            if (imageView2 != null) {
                this.C = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        org.telegram.ui.Components.sz szVar = ip0Var.E;
        if (szVar != null) {
            szVar.setBackgroundColor(getTabsViewBackgroundColor());
        }
    }
}
