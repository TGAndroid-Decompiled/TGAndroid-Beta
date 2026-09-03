package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class ac extends eb {
    public final ImageView f23358a;
    public final f90 f23359b;

    public ac(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.Hi);
        ImageView imageView = new ImageView(context);
        this.f23358a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.b6.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        f90 f90Var = new f90(context, null);
        this.f23359b = f90Var;
        f90Var.setDisablePaddingsOffsetY(true);
        f90Var.setSingleLine();
        f90Var.setTextColor(themedColor);
        f90Var.setTypeface(Typeface.SANS_SERIF);
        f90Var.setTextSize(1, 15.0f);
        addView(f90Var, k7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f23359b.getText();
    }
}
