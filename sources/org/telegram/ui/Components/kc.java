package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class kc extends pb {
    public final ImageView f27921a;
    public final fa0 f27922b;

    public kc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Hi);
        ImageView imageView = new ImageView(context);
        this.f27921a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.x5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        fa0 fa0Var = new fa0(context, null);
        this.f27922b = fa0Var;
        fa0Var.setDisablePaddingsOffsetY(true);
        fa0Var.setSingleLine();
        fa0Var.setTextColor(themedColor);
        fa0Var.setTypeface(Typeface.SANS_SERIF);
        fa0Var.setTextSize(1, 15.0f);
        addView(fa0Var, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f27922b.getText();
    }
}
