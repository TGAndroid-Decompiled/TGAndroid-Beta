package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class ic extends nb {
    public final ImageView f27234a;
    public final x90 f27235b;

    public ic(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Hi);
        ImageView imageView = new ImageView(context);
        this.f27234a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        x90 x90Var = new x90(context, null);
        this.f27235b = x90Var;
        x90Var.setDisablePaddingsOffsetY(true);
        x90Var.setSingleLine();
        x90Var.setTextColor(themedColor);
        x90Var.setTypeface(Typeface.SANS_SERIF);
        x90Var.setTextSize(1, 15.0f);
        addView(x90Var, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f27235b.getText();
    }
}
