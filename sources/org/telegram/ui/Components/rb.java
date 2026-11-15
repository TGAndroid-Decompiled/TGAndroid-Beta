package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class rb extends va {
    public final fh0 f38941a;
    public final h6 f38942b;
    public final h6 f38943c;
    public final int d;

    public rb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i7 = org.telegram.ui.ActionBar.j6.yj;
        this.d = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
        ?? imageView = new ImageView(context);
        this.f38941a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ja.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        getThemedColor(org.telegram.ui.ActionBar.j6.xj);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ja.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        h6 h6Var = new h6(context, true, true, true);
        this.f38942b = h6Var;
        h6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.q6.Y(h6Var, i7, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setEllipsizeByGradient(true);
        linearLayout.addView(h6Var, c8.ja.o(-1, 20));
        h6 h6Var2 = new h6(context, true, true, true);
        this.f38943c = h6Var2;
        h6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.q6.Y(h6Var2, i7, e6Var);
        h6Var2.setTypeface(Typeface.SANS_SERIF);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        h6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(h6Var2, c8.ja.o(-1, 18));
    }

    public final void c(int i7, String... strArr) {
        fh0 fh0Var = this.f38941a;
        fh0Var.f(2131624227, 32, 32, null);
        for (String str : strArr) {
            fh0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f38942b.getText()) + ".\n" + ((Object) this.f38943c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f38941a.d();
    }
}
