package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class ac extends eb {
    public final ImageView f23341a;
    public final e90 f23342b;

    public ac(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Hi);
        ImageView imageView = new ImageView(context);
        this.f23341a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.b6.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        e90 e90Var = new e90(context, null);
        this.f23342b = e90Var;
        e90Var.setDisablePaddingsOffsetY(true);
        e90Var.setSingleLine();
        e90Var.setTextColor(themedColor);
        e90Var.setTypeface(Typeface.SANS_SERIF);
        e90Var.setTextSize(1, 15.0f);
        addView(e90Var, k7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f23342b.getText();
    }
}
