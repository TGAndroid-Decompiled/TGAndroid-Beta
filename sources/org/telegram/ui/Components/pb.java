package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;
public class pb extends va {
    public final ImageView f38261a;
    public final z70 f38262b;

    public pb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i7 = org.telegram.ui.ActionBar.j6.yj;
        getThemedColor(i7);
        ImageView imageView = new ImageView(context);
        this.f38261a = imageView;
        org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ja.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        z70 z70Var = new z70(context, null);
        this.f38262b = z70Var;
        z70Var.setDisablePaddingsOffsetY(true);
        z70Var.setSingleLine();
        org.telegram.ui.ActionBar.q6.U(z70Var, i7, e6Var);
        z70Var.setTypeface(Typeface.SANS_SERIF);
        z70Var.setTextSize(1, 15.0f);
        addView(z70Var, c8.ja.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f38262b.getText();
    }
}
