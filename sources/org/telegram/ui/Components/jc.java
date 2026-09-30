package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.widget.ImageView;
public class jc extends ob {
    public final ImageView f25400a;
    public final q90 f25401b;

    public jc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Hi);
        ImageView imageView = new ImageView(context);
        this.f25400a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.y5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        q90 q90Var = new q90(context, null);
        this.f25401b = q90Var;
        q90Var.setDisablePaddingsOffsetY(true);
        q90Var.setSingleLine();
        q90Var.setTextColor(themedColor);
        q90Var.setTypeface(Typeface.SANS_SERIF);
        q90Var.setTextSize(1, 15.0f);
        addView(q90Var, w7.y5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f25401b.getText();
    }
}
