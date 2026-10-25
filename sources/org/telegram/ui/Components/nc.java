package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc extends nb {
    public final ak0 f30951a;
    public final z90 f30952b;
    public final z90 f30953c;
    public final LinearLayout d;
    public final int e;

    public nc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        int i10 = org.telegram.ui.ActionBar.y6.Hi;
        this.e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
        ?? imageView = new ImageView(context);
        this.f30951a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, gb1.l(56.0f, 48.0f, 8388627));
        getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.y6.Gi;
        getThemedColor(i11);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, gb1.m(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        z90 z90Var = new z90(context, null);
        this.f30952b = z90Var;
        z90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.f7.V(z90Var, i10, u6Var);
        z90Var.setTextSize(1, 14.0f);
        z90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(z90Var);
        z90 z90Var2 = new z90(context, null);
        this.f30953c = z90Var2;
        z90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.f7.V(z90Var2, i10, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var2, i11, u6Var);
        z90Var2.setTypeface(Typeface.SANS_SERIF);
        z90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(z90Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        ak0 ak0Var = this.f30951a;
        ak0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            ak0Var.h(this.e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f30952b.getText()) + ".\n" + ((Object) this.f30953c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f30951a.d();
    }
}
