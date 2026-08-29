package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hc extends jb {
    public final t9 f29161a;
    public final y80 f29162b;
    public final y80 f29163c;

    public hc(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        int i10 = org.telegram.ui.ActionBar.g6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
        t9 t9Var = new t9(context);
        this.f29161a = t9Var;
        addView(t9Var, i7.f6.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.Gi);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        addView(g10, i7.f6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        y80 y80Var = new y80(context, null);
        this.f29162b = y80Var;
        y80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        y80Var.setTextColor(themedColor);
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTypeface(AndroidUtilities.bold());
        g10.addView(y80Var);
        y80 y80Var2 = new y80(context, null);
        this.f29163c = y80Var2;
        y80Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        y80Var2.setTextColor(themedColor);
        y80Var2.setLinkTextColor(themedColor2);
        y80Var2.setTypeface(Typeface.SANS_SERIF);
        y80Var2.setTextSize(1, 13.0f);
        g10.addView(y80Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f29162b.getText()) + ".\n" + ((Object) this.f29163c.getText());
    }
}
