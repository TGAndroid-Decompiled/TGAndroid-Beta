package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class vb extends ya {
    public final ch0 f38979a;
    public final i6 f38980b;
    public final i6 f38981c;
    public final int d;

    public vb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i7 = org.telegram.ui.ActionBar.m6.vj;
        this.d = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
        ?? imageView = new ImageView(context);
        this.f38979a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ha.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        getThemedColor(org.telegram.ui.ActionBar.m6.uj);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        i6 i6Var = new i6(context, true, true, true);
        this.f38980b = i6Var;
        i6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.Y(i6Var, i7, h6Var);
        i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        i6Var.setEllipsizeByGradient(true);
        linearLayout.addView(i6Var, c8.ha.o(-1, 20));
        i6 i6Var2 = new i6(context, true, true, true);
        this.f38981c = i6Var2;
        i6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.t6.Y(i6Var2, i7, h6Var);
        i6Var2.setTypeface(Typeface.SANS_SERIF);
        i6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        i6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(i6Var2, c8.ha.o(-1, 18));
    }

    public final void c(int i7, String... strArr) {
        ch0 ch0Var = this.f38979a;
        ch0Var.f(2131624226, 32, 32, null);
        for (String str : strArr) {
            ch0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f38980b.getText()) + ".\n" + ((Object) this.f38981c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f38979a.d();
    }
}
