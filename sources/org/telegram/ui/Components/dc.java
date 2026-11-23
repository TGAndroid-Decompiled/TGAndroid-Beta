package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class dc extends eb {
    public final rh0 f34429a;
    public final m80 f34430b;
    public final m80 f34431c;
    public final LinearLayout d;
    public final int f34432e;

    public dc(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i7 = org.telegram.ui.ActionBar.m6.yj;
        this.f34432e = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.wj));
        ?? imageView = new ImageView(context);
        this.f34429a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.na.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.m6.xj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.na.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        m80 m80Var = new m80(context, null);
        this.f34430b = m80Var;
        m80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.U(m80Var, i7, h6Var);
        m80Var.setTextSize(1, 14.0f);
        m80Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(m80Var);
        m80 m80Var2 = new m80(context, null);
        this.f34431c = m80Var2;
        m80Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.U(m80Var2, i7, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var2, i10, h6Var);
        m80Var2.setTypeface(Typeface.SANS_SERIF);
        m80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(m80Var2);
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        rh0 rh0Var = this.f34429a;
        rh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            rh0Var.h(this.f34432e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f34430b.getText()) + ".\n" + ((Object) this.f34431c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f34429a.d();
    }
}
