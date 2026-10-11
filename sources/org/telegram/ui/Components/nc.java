package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nc extends pb {
    public final y9 f29029a;
    public final fa0 f29030b;
    public final fa0 f29031c;

    public nc(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        int i10 = org.telegram.ui.ActionBar.h6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
        y9 y9Var = new y9(context);
        this.f29029a = y9Var;
        addView(y9Var, w7.x5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.Gi);
        LinearLayout e7 = org.telegram.messenger.ai.e(context, 1);
        addView(e7, w7.x5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        fa0 fa0Var = new fa0(context, null);
        this.f29030b = fa0Var;
        fa0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        fa0Var.setTextColor(themedColor);
        fa0Var.setTextSize(1, 14.0f);
        fa0Var.setTypeface(AndroidUtilities.bold());
        e7.addView(fa0Var);
        fa0 fa0Var2 = new fa0(context, null);
        this.f29031c = fa0Var2;
        fa0Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        fa0Var2.setTextColor(themedColor);
        fa0Var2.setLinkTextColor(themedColor2);
        fa0Var2.setTypeface(Typeface.SANS_SERIF);
        fa0Var2.setTextSize(1, 13.0f);
        e7.addView(fa0Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f29030b.getText()) + ".\n" + ((Object) this.f29031c.getText());
    }
}
