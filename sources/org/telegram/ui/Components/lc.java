package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lc extends nb {
    public final w9 f26038a;
    public final o90 f26039b;
    public final o90 f26040c;

    public lc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        w9 w9Var = new w9(context);
        this.f26038a = w9Var;
        addView(w9Var, w7.y5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
        addView(f7, w7.y5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        o90 o90Var = new o90(context, null);
        this.f26039b = o90Var;
        o90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        o90Var.setTextColor(themedColor);
        o90Var.setTextSize(1, 14.0f);
        o90Var.setTypeface(AndroidUtilities.bold());
        f7.addView(o90Var);
        o90 o90Var2 = new o90(context, null);
        this.f26040c = o90Var2;
        o90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        o90Var2.setTextColor(themedColor);
        o90Var2.setLinkTextColor(themedColor2);
        o90Var2.setTypeface(Typeface.SANS_SERIF);
        o90Var2.setTextSize(1, 13.0f);
        f7.addView(o90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f26039b.getText()) + ".\n" + ((Object) this.f26040c.getText());
    }
}
