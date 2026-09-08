package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lc extends nb {
    public final x9 f28159a;
    public final d90 f28160b;
    public final d90 f28161c;

    public lc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        x9 x9Var = new x9(context);
        this.f28159a = x9Var;
        addView(x9Var, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
        addView(f7, w7.x5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        d90 d90Var = new d90(context, null);
        this.f28160b = d90Var;
        d90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        d90Var.setTextColor(themedColor);
        d90Var.setTextSize(1, 14.0f);
        d90Var.setTypeface(AndroidUtilities.bold());
        f7.addView(d90Var);
        d90 d90Var2 = new d90(context, null);
        this.f28161c = d90Var2;
        d90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        d90Var2.setTextColor(themedColor);
        d90Var2.setLinkTextColor(themedColor2);
        d90Var2.setTypeface(Typeface.SANS_SERIF);
        d90Var2.setTextSize(1, 13.0f);
        f7.addView(d90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f28160b.getText()) + ".\n" + ((Object) this.f28161c.getText());
    }
}
