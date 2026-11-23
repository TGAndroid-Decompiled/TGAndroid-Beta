package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class zb extends db {
    public final qh0 f42810a;
    public final n6 f42811b;
    public final n6 f42812c;

    public zb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i7 = org.telegram.ui.ActionBar.n6.yj;
        getThemedColor(i7);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
        ?? imageView = new ImageView(context);
        this.f42810a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.na.h(56.0f, 48.0f, 8388627));
        getThemedColor(i7);
        getThemedColor(org.telegram.ui.ActionBar.n6.xj);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.na.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        n6 n6Var = new n6(context, true, true, true);
        this.f42811b = n6Var;
        n6Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.Y(n6Var, i7, i6Var);
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var, c8.na.o(-1, 20));
        n6 n6Var2 = new n6(context, true, true, true);
        this.f42812c = n6Var2;
        n6Var2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i7, i6Var);
        n6Var2.setTypeface(Typeface.SANS_SERIF);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        n6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(n6Var2, c8.na.o(-1, 18));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f42811b.getText()) + ".\n" + ((Object) this.f42812c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f42810a.d();
    }
}
