package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.widget.ImageView;
public class ob extends ta {
    public final ImageView f29083a;
    public final p80 f29084b;

    public ob(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        int i10 = org.telegram.ui.ActionBar.t6.vj;
        getThemedColor(i10);
        ImageView imageView = new ImageView(context);
        this.f29083a = imageView;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, p6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.b6.i(24.0f, 24.0f, 8388627, 16.0f, 12.0f, 16.0f, 12.0f));
        p80 p80Var = new p80(context, null);
        this.f29084b = p80Var;
        p80Var.setDisablePaddingsOffsetY(true);
        p80Var.setSingleLine();
        org.telegram.ui.ActionBar.a7.V(p80Var, i10, p6Var);
        p80Var.setTypeface(Typeface.SANS_SERIF);
        p80Var.setTextSize(1, 15.0f);
        addView(p80Var, w7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f29084b.getText();
    }
}
