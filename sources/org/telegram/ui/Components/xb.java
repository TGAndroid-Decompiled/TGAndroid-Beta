package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class xb extends ya {
    public final fh0 f40302a;
    public final s70 f40303b;
    public final s70 f40304c;
    public final LinearLayout d;
    public final int f40305e;

    public xb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i3 = org.telegram.ui.ActionBar.k6.vj;
        this.f40305e = getThemedColor(i3);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        ?? imageView = new ImageView(context);
        this.f40302a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, b8.mf.h(56.0f, 48.0f, 8388627));
        getThemedColor(i3);
        int i10 = org.telegram.ui.ActionBar.k6.uj;
        getThemedColor(i10);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        s70 s70Var = new s70(context, null);
        this.f40303b = s70Var;
        s70Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.V(s70Var, i3, e6Var);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(s70Var);
        s70 s70Var2 = new s70(context, null);
        this.f40304c = s70Var2;
        s70Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.V(s70Var2, i3, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var2, i10, e6Var);
        s70Var2.setTypeface(Typeface.SANS_SERIF);
        s70Var2.setTextSize(1, 13.0f);
        linearLayout.addView(s70Var2);
    }

    public final void c(int i3, int i10, int i11, String... strArr) {
        fh0 fh0Var = this.f40302a;
        fh0Var.f(i3, i10, i11, null);
        for (String str : strArr) {
            fh0Var.h(this.f40305e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f40303b.getText()) + ".\n" + ((Object) this.f40304c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f40302a.d();
    }
}
