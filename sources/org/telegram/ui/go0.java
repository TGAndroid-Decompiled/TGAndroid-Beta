package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

public final class go0 extends jo0 {
    public int B;
    public final ap0 C;

    public go0(ap0 ap0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.C = ap0Var;
        this.B = 0;
    }

    @Override
    public final void a() {
        ap0 ap0Var = this.C;
        if (ap0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(ap0Var.getParentActivity(), ap0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.B != actionBarButtonColor) {
            ImageView imageView = ap0Var.A;
            if (imageView != null) {
                this.B = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = ap0Var.B;
            if (imageView2 != null) {
                this.B = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        org.telegram.ui.Components.ez ezVar = ap0Var.D;
        if (ezVar != null) {
            ezVar.setBackgroundColor(getTabsViewBackgroundColor());
        }
    }
}
