package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class hc extends mb {
    public final ImageView f24777a;
    public final n90 f24778b;

    public hc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Hi);
        ImageView imageView = new ImageView(context);
        this.f24777a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.y5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        n90 n90Var = new n90(context, null);
        this.f24778b = n90Var;
        n90Var.setDisablePaddingsOffsetY(true);
        n90Var.setSingleLine();
        n90Var.setTextColor(themedColor);
        n90Var.setTypeface(Typeface.SANS_SERIF);
        n90Var.setTextSize(1, 15.0f);
        addView(n90Var, w7.y5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f24778b.getText();
    }
}
