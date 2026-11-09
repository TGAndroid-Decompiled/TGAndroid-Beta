package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class zb extends za {
    public final dh0 f40948a;
    public final x70 f40949b;
    public final x70 f40950c;
    public final LinearLayout d;
    public final int f40951e;

    public zb(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i7 = org.telegram.ui.ActionBar.l6.vj;
        this.f40951e = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.l6.tj));
        ?? imageView = new ImageView(context);
        this.f40948a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ha.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.l6.uj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        x70 x70Var = new x70(context, null);
        this.f40949b = x70Var;
        x70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.s6.U(x70Var, i7, g6Var);
        x70Var.setTextSize(1, 14.0f);
        x70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(x70Var);
        x70 x70Var2 = new x70(context, null);
        this.f40950c = x70Var2;
        x70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.s6.U(x70Var2, i7, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var2, i10, g6Var);
        x70Var2.setTypeface(Typeface.SANS_SERIF);
        x70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(x70Var2);
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        dh0 dh0Var = this.f40948a;
        dh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            dh0Var.h(this.f40951e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f40949b.getText()) + ".\n" + ((Object) this.f40950c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f40948a.d();
    }
}
