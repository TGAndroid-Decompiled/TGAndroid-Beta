package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class kc extends pb {
    public final ImageView f26664a;
    public final da0 f26665b;

    public kc(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Hi);
        ImageView imageView = new ImageView(context);
        this.f26664a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.a6.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        da0 da0Var = new da0(context, null);
        this.f26665b = da0Var;
        da0Var.setDisablePaddingsOffsetY(true);
        da0Var.setSingleLine();
        da0Var.setTextColor(themedColor);
        da0Var.setTypeface(Typeface.SANS_SERIF);
        da0Var.setTextSize(1, 15.0f);
        addView(da0Var, w7.a6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f26665b.getText();
    }
}
