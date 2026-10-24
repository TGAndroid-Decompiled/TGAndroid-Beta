package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ic extends lb {
    public final ak0 f27394a;
    public final o6 f27395b;
    public final o6 f27396c;
    public final int d;

    public ic(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        ?? imageView = new ImageView(context);
        this.f27394a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.z5.h(56.0f, 48.0f, 8388627));
        getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.k6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        o6 o6Var = new o6(context, true, true, true);
        this.f27395b = o6Var;
        o6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.r6.a0(o6Var, i10, g6Var);
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var, w7.z5.n(-1, 20));
        o6 o6Var2 = new o6(context, true, true, true);
        this.f27396c = o6Var2;
        o6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.r6.a0(o6Var2, i10, g6Var);
        o6Var2.setTypeface(Typeface.SANS_SERIF);
        o6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        o6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(o6Var2, w7.z5.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        ak0 ak0Var = this.f27394a;
        ak0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            ak0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f27395b.getText()) + ".\n" + ((Object) this.f27396c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f27394a.d();
    }
}
