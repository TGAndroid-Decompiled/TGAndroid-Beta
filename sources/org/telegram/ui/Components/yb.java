package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class yb extends ya {
    public final ch0 f40544a;
    public final w70 f40545b;
    public final w70 f40546c;
    public final LinearLayout d;
    public final int f40547e;

    public yb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i7 = org.telegram.ui.ActionBar.m6.vj;
        this.f40547e = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
        ?? imageView = new ImageView(context);
        this.f40544a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ha.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.m6.uj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        w70 w70Var = new w70(context, null);
        this.f40545b = w70Var;
        w70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.U(w70Var, i7, h6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(w70Var);
        w70 w70Var2 = new w70(context, null);
        this.f40546c = w70Var2;
        w70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.U(w70Var2, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var2, i10, h6Var);
        w70Var2.setTypeface(Typeface.SANS_SERIF);
        w70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(w70Var2);
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        ch0 ch0Var = this.f40544a;
        ch0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            ch0Var.h(this.f40547e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f40545b.getText()) + ".\n" + ((Object) this.f40546c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f40544a.d();
    }
}
