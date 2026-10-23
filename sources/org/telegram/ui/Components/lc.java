package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lc extends nb {
    public final w9 f28332a;
    public final y90 f28333b;
    public final y90 f28334c;

    public lc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        w9 w9Var = new w9(context);
        this.f28332a = w9Var;
        addView(w9Var, w7.z5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.k6.Gi;
        getThemedColor(i11);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        y90 y90Var = new y90(context, null);
        this.f28333b = y90Var;
        y90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.r6.W(y90Var, i10, g6Var);
        y90Var.setTextSize(1, 14.0f);
        y90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(y90Var);
        y90 y90Var2 = new y90(context, null);
        this.f28334c = y90Var2;
        y90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.r6.W(y90Var2, i10, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var2, i11, g6Var);
        y90Var2.setTypeface(Typeface.SANS_SERIF);
        y90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(y90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f28333b.getText()) + ".\n" + ((Object) this.f28334c.getText());
    }
}
