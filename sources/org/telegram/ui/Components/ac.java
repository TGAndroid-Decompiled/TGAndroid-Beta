package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class ac extends eb {
    public final ph0 f33327a;
    public final n6 f33328b;
    public final n6 f33329c;
    public final int d;

    public ac(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        this.d = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
        ?? imageView = new ImageView(context);
        this.f33327a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ma.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        getThemedColor(org.telegram.ui.ActionBar.n6.xj);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        n6 n6Var = new n6(context, true, true, true);
        this.f33328b = n6Var;
        n6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, i6Var);
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var, c8.ma.o(-1, 20));
        n6 n6Var2 = new n6(context, true, true, true);
        this.f33329c = n6Var2;
        n6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i7, i6Var);
        n6Var2.setTypeface(Typeface.SANS_SERIF);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        n6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var2, c8.ma.o(-1, 18));
    }

    public final void c(int i7, String... strArr) {
        ph0 ph0Var = this.f33327a;
        ph0Var.f(2131624227, 32, 32, null);
        for (String str : strArr) {
            ph0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f33328b.getText()) + ".\n" + ((Object) this.f33329c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f33327a.d();
    }
}
