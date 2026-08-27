package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class yb extends cb {

    public final ri0 f34875a;

    public final j6 f34876b;

    public final j6 f34877c;
    public final int d;

    public yb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        this.d = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        ri0 ri0Var = new ri0(context);
        this.f34875a = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ri0Var, h7.z5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        getThemedColor(org.telegram.ui.ActionBar.g6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, h7.z5.i(-1.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        j6 j6Var = new j6(context, true, true, true);
        this.f34876b = j6Var;
        j6Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        j6Var.setTextColor(themedColor);
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var, h7.z5.n(-1, 20));
        j6 j6Var2 = new j6(context, true, true, true);
        this.f34877c = j6Var2;
        j6Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        j6Var2.setTextColor(themedColor);
        j6Var2.setTypeface(Typeface.SANS_SERIF);
        j6Var2.setTextSize(AndroidUtilities.dp(13.0f));
        j6Var2.setEllipsizeByGradient(true);
        linearLayout.addView(j6Var2, h7.z5.n(-1, 18));
    }

    public final void c(int i10, String... strArr) {
        ri0 ri0Var = this.f34875a;
        ri0Var.f(i10, 32, 32, null);
        for (String str : strArr) {
            ri0Var.h(this.d, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f34876b.getText()) + ".\n" + ((Object) this.f34877c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f34875a.d();
    }
}
