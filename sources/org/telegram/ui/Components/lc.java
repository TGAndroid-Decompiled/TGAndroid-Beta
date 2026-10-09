package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class lc extends qb {
    public final ImageView f28418a;
    public final ea0 f28419b;

    public lc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.Hi);
        ImageView imageView = new ImageView(context);
        this.f28418a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        ea0 ea0Var = new ea0(context, null);
        this.f28419b = ea0Var;
        ea0Var.setDisablePaddingsOffsetY(true);
        ea0Var.setSingleLine();
        ea0Var.setTextColor(themedColor);
        ea0Var.setTypeface(Typeface.SANS_SERIF);
        ea0Var.setTextSize(1, 15.0f);
        addView(ea0Var, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f28419b.getText();
    }
}
