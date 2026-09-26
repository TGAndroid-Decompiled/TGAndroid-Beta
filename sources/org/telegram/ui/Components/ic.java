package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class ic extends nb {
    public final ImageView f25046a;
    public final o90 f25047b;

    public ic(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Hi);
        ImageView imageView = new ImageView(context);
        this.f25046a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.y5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        o90 o90Var = new o90(context, null);
        this.f25047b = o90Var;
        o90Var.setDisablePaddingsOffsetY(true);
        o90Var.setSingleLine();
        o90Var.setTextColor(themedColor);
        o90Var.setTypeface(Typeface.SANS_SERIF);
        o90Var.setTextSize(1, 15.0f);
        addView(o90Var, w7.y5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f25047b.getText();
    }
}
