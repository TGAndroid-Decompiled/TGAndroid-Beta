package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class lc extends qb {
    public final ImageView f28300a;
    public final fa0 f28301b;

    public lc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.Hi);
        ImageView imageView = new ImageView(context);
        this.f28300a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        fa0 fa0Var = new fa0(context, null);
        this.f28301b = fa0Var;
        fa0Var.setDisablePaddingsOffsetY(true);
        fa0Var.setSingleLine();
        fa0Var.setTextColor(themedColor);
        fa0Var.setTypeface(Typeface.SANS_SERIF);
        fa0Var.setTextSize(1, 15.0f);
        addView(fa0Var, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f28301b.getText();
    }
}
