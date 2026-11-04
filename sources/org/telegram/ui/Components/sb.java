package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;
public class sb extends ya {
    public final ImageView f37962a;
    public final s70 f37963b;

    public sb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i3 = org.telegram.ui.ActionBar.k6.vj;
        getThemedColor(i3);
        ImageView imageView = new ImageView(context);
        this.f37962a = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, b8.mf.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        s70 s70Var = new s70(context, null);
        this.f37963b = s70Var;
        s70Var.setDisablePaddingsOffsetY(true);
        s70Var.setSingleLine();
        org.telegram.ui.ActionBar.r6.V(s70Var, i3, e6Var);
        s70Var.setTypeface(Typeface.SANS_SERIF);
        s70Var.setTextSize(1, 15.0f);
        addView(s70Var, b8.mf.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f37963b.getText();
    }
}
