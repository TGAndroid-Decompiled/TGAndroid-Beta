package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jc extends lb {
    public final u9 f25275a;
    public final c90 f25276b;
    public final c90 f25277c;

    public jc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        int i10 = org.telegram.ui.ActionBar.i6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        u9 u9Var = new u9(context);
        this.f25275a = u9Var;
        addView(u9Var, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.Gi);
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        addView(f7, w7.x5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        c90 c90Var = new c90(context, null);
        this.f25276b = c90Var;
        c90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        c90Var.setTextColor(themedColor);
        c90Var.setTextSize(1, 14.0f);
        c90Var.setTypeface(AndroidUtilities.bold());
        f7.addView(c90Var);
        c90 c90Var2 = new c90(context, null);
        this.f25277c = c90Var2;
        c90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        c90Var2.setTextColor(themedColor);
        c90Var2.setLinkTextColor(themedColor2);
        c90Var2.setTypeface(Typeface.SANS_SERIF);
        c90Var2.setTextSize(1, 13.0f);
        f7.addView(c90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f25276b.getText()) + ".\n" + ((Object) this.f25277c.getText());
    }
}
