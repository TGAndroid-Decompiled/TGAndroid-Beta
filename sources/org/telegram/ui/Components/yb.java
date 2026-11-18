package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;
public class yb extends eb {
    public final ImageView f42446a;
    public final k80 f42447b;

    public yb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        getThemedColor(i7);
        ImageView imageView = new ImageView(context);
        this.f42446a = imageView;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ma.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        k80 k80Var = new k80(context, null);
        this.f42447b = k80Var;
        k80Var.setDisablePaddingsOffsetY(true);
        k80Var.setSingleLine();
        org.telegram.ui.ActionBar.u6.U(k80Var, i7, i6Var);
        k80Var.setTypeface(Typeface.SANS_SERIF);
        k80Var.setTextSize(1, 15.0f);
        addView(k80Var, c8.ma.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f42447b.getText();
    }
}
