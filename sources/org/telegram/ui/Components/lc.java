package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lc extends nb {
    public final w9 f26093a;
    public final l90 f26094b;
    public final l90 f26095c;

    public lc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        w9 w9Var = new w9(context);
        this.f26093a = w9Var;
        addView(w9Var, w7.y5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout e = org.telegram.messenger.wh.e(context, 1);
        addView(e, w7.y5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        l90 l90Var = new l90(context, null);
        this.f26094b = l90Var;
        l90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        l90Var.setTextColor(themedColor);
        l90Var.setTextSize(1, 14.0f);
        l90Var.setTypeface(AndroidUtilities.bold());
        e.addView(l90Var);
        l90 l90Var2 = new l90(context, null);
        this.f26095c = l90Var2;
        l90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        l90Var2.setTextColor(themedColor);
        l90Var2.setLinkTextColor(themedColor2);
        l90Var2.setTypeface(Typeface.SANS_SERIF);
        l90Var2.setTextSize(1, 13.0f);
        e.addView(l90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f26094b.getText()) + ".\n" + ((Object) this.f26095c.getText());
    }
}
