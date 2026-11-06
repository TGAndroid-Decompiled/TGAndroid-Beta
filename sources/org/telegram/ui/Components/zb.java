package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class zb extends za {
    public final ch0 f40927a;
    public final w70 f40928b;
    public final w70 f40929c;
    public final LinearLayout d;
    public final int f40930e;

    public zb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i7 = org.telegram.ui.ActionBar.k6.vj;
        this.f40930e = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        ?? imageView = new ImageView(context);
        this.f40927a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ha.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.k6.uj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        w70 w70Var = new w70(context, null);
        this.f40928b = w70Var;
        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.V(w70Var, i7, f6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(w70Var);
        w70 w70Var2 = new w70(context, null);
        this.f40929c = w70Var2;
        w70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.V(w70Var2, i7, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var2, i10, f6Var);
        w70Var2.setTypeface(Typeface.SANS_SERIF);
        w70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(w70Var2);
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        ch0 ch0Var = this.f40927a;
        ch0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            ch0Var.h(this.f40930e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f40928b.getText()) + ".\n" + ((Object) this.f40929c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f40927a.d();
    }
}
