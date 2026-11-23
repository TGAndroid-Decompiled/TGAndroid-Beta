package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;
public class yb extends eb {
    public final ImageView f42374a;
    public final m80 f42375b;

    public yb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i7 = org.telegram.ui.ActionBar.m6.yj;
        getThemedColor(i7);
        ImageView imageView = new ImageView(context);
        this.f42374a = imageView;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, h6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ma.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        m80 m80Var = new m80(context, null);
        this.f42375b = m80Var;
        m80Var.setDisablePaddingsOffsetY(true);
        m80Var.setSingleLine();
        org.telegram.ui.ActionBar.t6.U(m80Var, i7, h6Var);
        m80Var.setTypeface(Typeface.SANS_SERIF);
        m80Var.setTextSize(1, 15.0f);
        addView(m80Var, c8.ma.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f42375b.getText();
    }
}
