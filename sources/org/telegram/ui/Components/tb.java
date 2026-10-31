package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class tb extends ta {
    public final ei0 f30536a;
    public final p80 f30537b;
    public final p80 f30538c;
    public final LinearLayout d;
    public final int e;

    public tb(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        int i10 = org.telegram.ui.ActionBar.t6.vj;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
        ?? imageView = new ImageView(context);
        this.f30536a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.b6.h(56.0f, 48.0f, 8388627));
        getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.t6.uj;
        getThemedColor(i11);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        p80 p80Var = new p80(context, null);
        this.f30537b = p80Var;
        p80Var.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        org.telegram.ui.ActionBar.a7.V(p80Var, i10, p6Var);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTypeface(org.telegram.messenger.i0.o());
        linearLayout.addView(p80Var);
        p80 p80Var2 = new p80(context, null);
        this.f30538c = p80Var2;
        p80Var2.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        org.telegram.ui.ActionBar.a7.V(p80Var2, i10, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var2, i11, p6Var);
        p80Var2.setTypeface(Typeface.SANS_SERIF);
        p80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(p80Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        ei0 ei0Var = this.f30536a;
        ei0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            ei0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f30537b.getText()) + ".\n" + ((Object) this.f30538c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f30536a.d();
    }
}
