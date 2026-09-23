package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class ic extends nb {
    public final ImageView f24939a;
    public final d90 f24940b;

    public ic(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Hi);
        ImageView imageView = new ImageView(context);
        this.f24939a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        d90 d90Var = new d90(context, null);
        this.f24940b = d90Var;
        d90Var.setDisablePaddingsOffsetY(true);
        d90Var.setSingleLine();
        d90Var.setTextColor(themedColor);
        d90Var.setTypeface(Typeface.SANS_SERIF);
        d90Var.setTextSize(1, 15.0f);
        addView(d90Var, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f24940b.getText();
    }
}
