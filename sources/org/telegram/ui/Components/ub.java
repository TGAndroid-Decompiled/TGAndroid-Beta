package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class ub extends va {
    public final fh0 f39987a;
    public final z70 f39988b;
    public final z70 f39989c;
    public final LinearLayout d;
    public final int f39990e;

    public ub(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i7 = org.telegram.ui.ActionBar.j6.yj;
        this.f39990e = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
        ?? imageView = new ImageView(context);
        this.f39987a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ja.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.j6.xj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ja.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        z70 z70Var = new z70(context, null);
        this.f39988b = z70Var;
        z70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.q6.U(z70Var, i7, e6Var);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(z70Var);
        z70 z70Var2 = new z70(context, null);
        this.f39989c = z70Var2;
        z70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.q6.U(z70Var2, i7, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var2, i10, e6Var);
        z70Var2.setTypeface(Typeface.SANS_SERIF);
        z70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(z70Var2);
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        fh0 fh0Var = this.f39987a;
        fh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            fh0Var.h(this.f39990e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f39988b.getText()) + ".\n" + ((Object) this.f39989c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f39987a.d();
    }
}
