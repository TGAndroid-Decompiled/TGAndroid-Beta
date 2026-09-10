package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kc extends mb {
    public final w9 f24693a;
    public final m90 f24694b;
    public final m90 f24695c;

    public kc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        w9 w9Var = new w9(context);
        this.f24693a = w9Var;
        addView(w9Var, w7.a6.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        addView(f7, w7.a6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        m90 m90Var = new m90(context, null);
        this.f24694b = m90Var;
        m90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        m90Var.setTextColor(themedColor);
        m90Var.setTextSize(1, 14.0f);
        m90Var.setTypeface(AndroidUtilities.bold());
        f7.addView(m90Var);
        m90 m90Var2 = new m90(context, null);
        this.f24695c = m90Var2;
        m90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        m90Var2.setTextColor(themedColor);
        m90Var2.setLinkTextColor(themedColor2);
        m90Var2.setTypeface(Typeface.SANS_SERIF);
        m90Var2.setTextSize(1, 13.0f);
        f7.addView(m90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f24694b.getText()) + ".\n" + ((Object) this.f24695c.getText());
    }
}
