package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kc extends mb {
    public final v9 f25729a;
    public final k90 f25730b;
    public final k90 f25731c;

    public kc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        v9 v9Var = new v9(context);
        this.f25729a = v9Var;
        addView(v9Var, w7.y5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout f7 = org.telegram.messenger.rk.f(context, 1);
        addView(f7, w7.y5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        k90 k90Var = new k90(context, null);
        this.f25730b = k90Var;
        k90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        k90Var.setTextColor(themedColor);
        k90Var.setTextSize(1, 14.0f);
        k90Var.setTypeface(AndroidUtilities.bold());
        f7.addView(k90Var);
        k90 k90Var2 = new k90(context, null);
        this.f25731c = k90Var2;
        k90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        k90Var2.setTextColor(themedColor);
        k90Var2.setLinkTextColor(themedColor2);
        k90Var2.setTypeface(Typeface.SANS_SERIF);
        k90Var2.setTextSize(1, 13.0f);
        f7.addView(k90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f25730b.getText()) + ".\n" + ((Object) this.f25731c.getText());
    }
}
