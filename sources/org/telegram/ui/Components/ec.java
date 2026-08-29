package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class ec extends jb {
    public final ImageView f27999a;
    public final y80 f28000b;

    public ec(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Hi);
        ImageView imageView = new ImageView(context);
        this.f27999a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, i7.f6.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        y80 y80Var = new y80(context, null);
        this.f28000b = y80Var;
        y80Var.setDisablePaddingsOffsetY(true);
        y80Var.setSingleLine();
        y80Var.setTextColor(themedColor);
        y80Var.setTypeface(Typeface.SANS_SERIF);
        y80Var.setTextSize(1, 15.0f);
        addView(y80Var, i7.f6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f28000b.getText();
    }
}
