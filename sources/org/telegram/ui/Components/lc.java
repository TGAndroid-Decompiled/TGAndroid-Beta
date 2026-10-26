package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lc extends nb {
    public final y9 f30162a;
    public final z90 f30163b;
    public final z90 f30164c;

    public lc(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        int i10 = org.telegram.ui.ActionBar.y6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
        y9 y9Var = new y9(context);
        this.f30162a = y9Var;
        addView(y9Var, gb1.m(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.y6.Gi;
        getThemedColor(i11);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, gb1.m(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        z90 z90Var = new z90(context, null);
        this.f30163b = z90Var;
        z90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.f7.V(z90Var, i10, u6Var);
        z90Var.setTextSize(1, 14.0f);
        z90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(z90Var);
        z90 z90Var2 = new z90(context, null);
        this.f30164c = z90Var2;
        z90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.f7.V(z90Var2, i10, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var2, i11, u6Var);
        z90Var2.setTypeface(Typeface.SANS_SERIF);
        z90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(z90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f30163b.getText()) + ".\n" + ((Object) this.f30164c.getText());
    }
}
