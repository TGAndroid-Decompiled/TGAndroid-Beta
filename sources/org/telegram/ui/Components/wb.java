package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class wb extends za {
    public final ch0 f39954a;
    public final j6 f39955b;
    public final j6 f39956c;
    public final int d;

    public wb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i7 = org.telegram.ui.ActionBar.k6.vj;
        this.d = getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
        ?? imageView = new ImageView(context);
        this.f39954a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ha.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        getThemedColor(org.telegram.ui.ActionBar.k6.uj);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        j6 j6Var = new j6(context, true, true, true);
        this.f39955b = j6Var;
        j6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.Z(j6Var, i7, f6Var);
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var, c8.ha.o(-1, 20));
        j6 j6Var2 = new j6(context, true, true, true);
        this.f39956c = j6Var2;
        j6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.r6.Z(j6Var2, i7, f6Var);
        j6Var2.setTypeface(Typeface.SANS_SERIF);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        j6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var2, c8.ha.o(-1, 18));
    }

    public final void c(int i7, String... strArr) {
        ch0 ch0Var = this.f39954a;
        ch0Var.f(2131624226, 32, 32, null);
        for (String str : strArr) {
            ch0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f39955b.getText()) + ".\n" + ((Object) this.f39956c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f39954a.d();
    }
}
