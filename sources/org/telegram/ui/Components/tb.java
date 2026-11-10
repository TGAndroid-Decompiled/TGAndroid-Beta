package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;
public class tb extends ya {
    public final ImageView f38268a;
    public final w70 f38269b;

    public tb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i7 = org.telegram.ui.ActionBar.m6.vj;
        getThemedColor(i7);
        ImageView imageView = new ImageView(context);
        this.f38268a = imageView;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ha.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        w70 w70Var = new w70(context, null);
        this.f38269b = w70Var;
        w70Var.setDisablePaddingsOffsetY(true);
        w70Var.setSingleLine();
        org.telegram.ui.ActionBar.t6.U(w70Var, i7, h6Var);
        w70Var.setTypeface(Typeface.SANS_SERIF);
        w70Var.setTextSize(1, 15.0f);
        addView(w70Var, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f38269b.getText();
    }
}
