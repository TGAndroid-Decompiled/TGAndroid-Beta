package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class eo0 extends ho0 {
    public int B;
    public final yo0 C;

    public eo0(yo0 yo0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.C = yo0Var;
        this.B = 0;
    }

    @Override
    public final void a() {
        yo0 yo0Var = this.C;
        if (yo0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(yo0Var.getParentActivity(), yo0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.B != actionBarButtonColor) {
            ImageView imageView = yo0Var.A;
            if (imageView != null) {
                this.B = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = yo0Var.B;
            if (imageView2 != null) {
                this.B = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        org.telegram.ui.Components.lz lzVar = yo0Var.D;
        if (lzVar != null) {
            lzVar.setBackgroundColor(getTabsViewBackgroundColor());
        }
    }
}
