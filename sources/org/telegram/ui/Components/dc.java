package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dc extends eb {
    public final p9 f24242a;
    public final f90 f24243b;
    public final f90 f24244c;

    public dc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
        p9 p9Var = new p9(context);
        this.f24242a = p9Var;
        addView(p9Var, k7.b6.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.Gi);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        addView(f10, k7.b6.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        f90 f90Var = new f90(context, null);
        this.f24243b = f90Var;
        f90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        f90Var.setTextColor(themedColor);
        f90Var.setTextSize(1, 14.0f);
        f90Var.setTypeface(AndroidUtilities.bold());
        f10.addView(f90Var);
        f90 f90Var2 = new f90(context, null);
        this.f24244c = f90Var2;
        f90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        f90Var2.setTextColor(themedColor);
        f90Var2.setLinkTextColor(themedColor2);
        f90Var2.setTypeface(Typeface.SANS_SERIF);
        f90Var2.setTextSize(1, 13.0f);
        f10.addView(f90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f24243b.getText()) + ".\n" + ((Object) this.f24244c.getText());
    }
}
