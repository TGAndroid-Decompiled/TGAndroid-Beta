package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class dc extends eb {
    public final ph0 f34369a;
    public final k80 f34370b;
    public final k80 f34371c;
    public final LinearLayout d;
    public final int f34372e;

    public dc(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        this.f34372e = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
        ?? imageView = new ImageView(context);
        this.f34369a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ma.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        int i10 = org.telegram.ui.ActionBar.n6.xj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        k80 k80Var = new k80(context, null);
        this.f34370b = k80Var;
        k80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.U(k80Var, i7, i6Var);
        k80Var.setTextSize(1, 14.0f);
        k80Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(k80Var);
        k80 k80Var2 = new k80(context, null);
        this.f34371c = k80Var2;
        k80Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.U(k80Var2, i7, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var2, i10, i6Var);
        k80Var2.setTypeface(Typeface.SANS_SERIF);
        k80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(k80Var2);
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        ph0 ph0Var = this.f34369a;
        ph0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            ph0Var.h(this.f34372e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f34370b.getText()) + ".\n" + ((Object) this.f34371c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f34369a.d();
    }
}
