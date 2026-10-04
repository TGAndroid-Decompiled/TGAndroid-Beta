package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class mc extends ob {
    public final w9 f28576a;
    public final q90 f28577b;
    public final q90 f28578c;

    public mc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.i6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
        w9 w9Var = new w9(context);
        this.f28576a = w9Var;
        addView(w9Var, w7.z5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.Gi);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        addView(e7, w7.z5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        q90 q90Var = new q90(context, null);
        this.f28577b = q90Var;
        q90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        q90Var.setTextColor(themedColor);
        q90Var.setTextSize(1, 14.0f);
        q90Var.setTypeface(AndroidUtilities.bold());
        e7.addView(q90Var);
        q90 q90Var2 = new q90(context, null);
        this.f28578c = q90Var2;
        q90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        q90Var2.setTextColor(themedColor);
        q90Var2.setLinkTextColor(themedColor2);
        q90Var2.setTypeface(Typeface.SANS_SERIF);
        q90Var2.setTextSize(1, 13.0f);
        e7.addView(q90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f28577b.getText()) + ".\n" + ((Object) this.f28578c.getText());
    }
}
