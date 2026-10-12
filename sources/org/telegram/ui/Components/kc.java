package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class kc extends pb {
    public final ImageView f27820a;
    public final ia0 f27821b;

    public kc(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Hi);
        ImageView imageView = new ImageView(context);
        this.f27820a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.w5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        ia0 ia0Var = new ia0(context, null);
        this.f27821b = ia0Var;
        ia0Var.setDisablePaddingsOffsetY(true);
        ia0Var.setSingleLine();
        ia0Var.setTextColor(themedColor);
        ia0Var.setTypeface(Typeface.SANS_SERIF);
        ia0Var.setTextSize(1, 15.0f);
        addView(ia0Var, w7.w5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f27821b.getText();
    }
}
