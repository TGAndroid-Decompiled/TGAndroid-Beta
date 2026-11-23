package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class cc extends db {
    public final qh0 f34012a;
    public final j80 f34013b;
    public final j80 f34014c;
    public final LinearLayout d;
    public final int f34015e;

    public cc(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        this.f34015e = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
        ?? imageView = new ImageView(context);
        this.f34012a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.na.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.n6.xj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.na.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        j80 j80Var = new j80(context, null);
        this.f34013b = j80Var;
        j80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.U(j80Var, i7, i6Var);
        j80Var.setTextSize(1, 14.0f);
        j80Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(j80Var);
        j80 j80Var2 = new j80(context, null);
        this.f34014c = j80Var2;
        j80Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.U(j80Var2, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var2, i10, i6Var);
        j80Var2.setTypeface(Typeface.SANS_SERIF);
        j80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(j80Var2);
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        qh0 qh0Var = this.f34012a;
        qh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            qh0Var.h(this.f34015e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f34013b.getText()) + ".\n" + ((Object) this.f34014c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f34012a.d();
    }
}
