package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class fo0 extends io0 {
    public int B;
    public final zo0 C;

    public fo0(zo0 zo0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.C = zo0Var;
        this.B = 0;
    }

    @Override
    public final void a() {
        zo0 zo0Var = this.C;
        if (zo0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(zo0Var.getParentActivity(), zo0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.B != actionBarButtonColor) {
            ImageView imageView = zo0Var.A;
            if (imageView != null) {
                this.B = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = zo0Var.B;
            if (imageView2 != null) {
                this.B = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        org.telegram.ui.Components.cz czVar = zo0Var.D;
        if (czVar != null) {
            czVar.setBackgroundColor(getTabsViewBackgroundColor());
        }
    }
}
