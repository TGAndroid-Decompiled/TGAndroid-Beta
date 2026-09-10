package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class hc extends mb {
    public final ImageView f23573a;
    public final m90 f23574b;

    public hc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Hi);
        ImageView imageView = new ImageView(context);
        this.f23573a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.a6.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        m90 m90Var = new m90(context, null);
        this.f23574b = m90Var;
        m90Var.setDisablePaddingsOffsetY(true);
        m90Var.setSingleLine();
        m90Var.setTextColor(themedColor);
        m90Var.setTypeface(Typeface.SANS_SERIF);
        m90Var.setTextSize(1, 15.0f);
        addView(m90Var, w7.a6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f23574b.getText();
    }
}
