package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class ac extends eb {
    public final rh0 f33473a;
    public final o6 f33474b;
    public final o6 f33475c;
    public final int d;

    public ac(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i7 = org.telegram.ui.ActionBar.m6.yj;
        this.d = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.wj));
        ?? imageView = new ImageView(context);
        this.f33473a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ma.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        getThemedColor(org.telegram.ui.ActionBar.m6.xj);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        o6 o6Var = new o6(context, true, true, true);
        this.f33474b = o6Var;
        o6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.Y(o6Var, i7, h6Var);
        o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var, c8.ma.o(-1, 20));
        o6 o6Var2 = new o6(context, true, true, true);
        this.f33475c = o6Var2;
        o6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.Y(o6Var2, i7, h6Var);
        o6Var2.setTypeface(Typeface.SANS_SERIF);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        o6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var2, c8.ma.o(-1, 18));
    }

    public final void c(int i7, String... strArr) {
        rh0 rh0Var = this.f33473a;
        rh0Var.f(2131624227, 32, 32, null);
        for (String str : strArr) {
            rh0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f33474b.getText()) + ".\n" + ((Object) this.f33475c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f33473a.d();
    }
}
