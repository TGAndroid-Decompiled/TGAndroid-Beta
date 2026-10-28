package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;
public class ic extends nb {
    public final ImageView f29299a;
    public final aa0 f29300b;

    public ic(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        int i10 = org.telegram.ui.ActionBar.y6.Hi;
        getThemedColor(i10);
        ImageView imageView = new ImageView(context);
        this.f29299a = imageView;
        org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, kb1.m(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        aa0 aa0Var = new aa0(context, null);
        this.f29300b = aa0Var;
        aa0Var.setDisablePaddingsOffsetY(true);
        aa0Var.setSingleLine();
        org.telegram.ui.ActionBar.f7.V(aa0Var, i10, u6Var);
        aa0Var.setTypeface(Typeface.SANS_SERIF);
        aa0Var.setTextSize(1, 15.0f);
        addView(aa0Var, kb1.m(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f29300b.getText();
    }
}
