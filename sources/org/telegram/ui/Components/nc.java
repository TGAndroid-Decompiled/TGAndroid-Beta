package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc extends pb {
    public final z9 f27652a;
    public final da0 f27653b;
    public final da0 f27654c;

    public nc(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        z9 z9Var = new z9(context);
        this.f27652a = z9Var;
        addView(z9Var, w7.a6.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.Gi);
        LinearLayout e = org.telegram.messenger.yh.e(context, 1);
        addView(e, w7.a6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        da0 da0Var = new da0(context, null);
        this.f27653b = da0Var;
        da0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        da0Var.setTextColor(themedColor);
        da0Var.setTextSize(1, 14.0f);
        da0Var.setTypeface(AndroidUtilities.bold());
        e.addView(da0Var);
        da0 da0Var2 = new da0(context, null);
        this.f27654c = da0Var2;
        da0Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        da0Var2.setTextColor(themedColor);
        da0Var2.setLinkTextColor(themedColor2);
        da0Var2.setTypeface(Typeface.SANS_SERIF);
        da0Var2.setTextSize(1, 13.0f);
        e.addView(da0Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f27653b.getText()) + ".\n" + ((Object) this.f27654c.getText());
    }
}
