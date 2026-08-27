package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class bc extends cb {

    public final ri0 f27063a;

    public final p80 f27064b;

    public final p80 f27065c;
    public final LinearLayout d;

    public final int f27066e;

    public bc(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        this.f27066e = getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        ri0 ri0Var = new ri0(context);
        this.f27063a = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ri0Var, h7.z5.h(56.0f, 48.0f, 8388627));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.Gi);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, h7.z5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        p80 p80Var = new p80(context, null);
        this.f27064b = p80Var;
        p80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p80Var.setTextColor(themedColor);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(p80Var);
        p80 p80Var2 = new p80(context, null);
        this.f27065c = p80Var2;
        p80Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        p80Var2.setTextColor(themedColor);
        p80Var2.setLinkTextColor(themedColor2);
        p80Var2.setTypeface(Typeface.SANS_SERIF);
        p80Var2.setTextSize(1, 13.0f);
        linearLayout.addView(p80Var2);
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        ri0 ri0Var = this.f27063a;
        ri0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            ri0Var.h(this.f27066e, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f27064b.getText()) + ".\n" + ((Object) this.f27065c.getText());
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f27063a.d();
    }
}
