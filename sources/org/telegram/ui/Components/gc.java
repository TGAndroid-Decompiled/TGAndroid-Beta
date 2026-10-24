package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;
public class gc extends lb {
    public final ImageView f26618a;
    public final w90 f26619b;

    public gc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        getThemedColor(i10);
        ImageView imageView = new ImageView(context);
        this.f26618a = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.z5.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        w90 w90Var = new w90(context, null);
        this.f26619b = w90Var;
        w90Var.setDisablePaddingsOffsetY(true);
        w90Var.setSingleLine();
        org.telegram.ui.ActionBar.r6.W(w90Var, i10, g6Var);
        w90Var.setTypeface(Typeface.SANS_SERIF);
        w90Var.setTextSize(1, 15.0f);
        addView(w90Var, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f26619b.getText();
    }
}
