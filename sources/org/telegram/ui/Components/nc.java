package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc extends pb {
    public final y9 f28763a;
    public final ia0 f28764b;
    public final ia0 f28765c;

    public nc(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        y9 y9Var = new y9(context);
        this.f28763a = y9Var;
        addView(y9Var, w7.w5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout e7 = org.telegram.messenger.am.e(context, 1);
        addView(e7, w7.w5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        ia0 ia0Var = new ia0(context, null);
        this.f28764b = ia0Var;
        ia0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        ia0Var.setTextColor(themedColor);
        ia0Var.setTextSize(1, 14.0f);
        ia0Var.setTypeface(AndroidUtilities.bold());
        e7.addView(ia0Var);
        ia0 ia0Var2 = new ia0(context, null);
        this.f28765c = ia0Var2;
        ia0Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        ia0Var2.setTextColor(themedColor);
        ia0Var2.setLinkTextColor(themedColor2);
        ia0Var2.setTypeface(Typeface.SANS_SERIF);
        ia0Var2.setTextSize(1, 13.0f);
        e7.addView(ia0Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f28764b.getText()) + ".\n" + ((Object) this.f28765c.getText());
    }
}
