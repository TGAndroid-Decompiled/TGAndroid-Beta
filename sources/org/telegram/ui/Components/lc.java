package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lc extends nb {
    public final w9 f25856a;
    public final d90 f25857b;
    public final d90 f25858c;

    public lc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        w9 w9Var = new w9(context);
        this.f25856a = w9Var;
        addView(w9Var, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout f7 = org.telegram.messenger.ul.f(context, 1);
        addView(f7, w7.x5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        d90 d90Var = new d90(context, null);
        this.f25857b = d90Var;
        d90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        d90Var.setTextColor(themedColor);
        d90Var.setTextSize(1, 14.0f);
        d90Var.setTypeface(AndroidUtilities.bold());
        f7.addView(d90Var);
        d90 d90Var2 = new d90(context, null);
        this.f25858c = d90Var2;
        d90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        d90Var2.setTextColor(themedColor);
        d90Var2.setLinkTextColor(themedColor2);
        d90Var2.setTypeface(Typeface.SANS_SERIF);
        d90Var2.setTextSize(1, 13.0f);
        f7.addView(d90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f25857b.getText()) + ".\n" + ((Object) this.f25858c.getText());
    }
}
