package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dc extends eb {
    public final p9 f24225a;
    public final e90 f24226b;
    public final e90 f24227c;

    public dc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        p9 p9Var = new p9(context);
        this.f24225a = p9Var;
        addView(p9Var, k7.b6.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        addView(f10, k7.b6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        e90 e90Var = new e90(context, null);
        this.f24226b = e90Var;
        e90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        e90Var.setTextColor(themedColor);
        e90Var.setTextSize(1, 14.0f);
        e90Var.setTypeface(AndroidUtilities.bold());
        f10.addView(e90Var);
        e90 e90Var2 = new e90(context, null);
        this.f24227c = e90Var2;
        e90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        e90Var2.setTextColor(themedColor);
        e90Var2.setLinkTextColor(themedColor2);
        e90Var2.setTypeface(Typeface.SANS_SERIF);
        e90Var2.setTextSize(1, 13.0f);
        f10.addView(e90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f24226b.getText()) + ".\n" + ((Object) this.f24227c.getText());
    }
}
