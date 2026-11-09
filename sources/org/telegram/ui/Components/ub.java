package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;
public class ub extends za {
    public final ImageView f38680a;
    public final x70 f38681b;

    public ub(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i7 = org.telegram.ui.ActionBar.l6.vj;
        getThemedColor(i7);
        ImageView imageView = new ImageView(context);
        this.f38680a = imageView;
        org.telegram.ui.ActionBar.s6.s(imageView, i7, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ha.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        x70 x70Var = new x70(context, null);
        this.f38681b = x70Var;
        x70Var.setDisablePaddingsOffsetY(true);
        x70Var.setSingleLine();
        org.telegram.ui.ActionBar.s6.U(x70Var, i7, g6Var);
        x70Var.setTypeface(Typeface.SANS_SERIF);
        x70Var.setTextSize(1, 15.0f);
        addView(x70Var, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f38681b.getText();
    }
}
