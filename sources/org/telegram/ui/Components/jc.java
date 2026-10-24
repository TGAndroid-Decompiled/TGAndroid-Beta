package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jc extends lb {
    public final u9 f27666a;
    public final w90 f27667b;
    public final w90 f27668c;

    public jc(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Hi;
        getThemedColor(i10);
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
        u9 u9Var = new u9(context);
        this.f27666a = u9Var;
        addView(u9Var, w7.z5.i(32.0f, 32.0f, 8388627, 12.0f, 0.0f, 12.0f, 0.0f));
        getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.k6.Gi;
        getThemedColor(i11);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.i(-2.0f, -2.0f, 8388627, 52.0f, 8.0f, 8.0f, 8.0f));
        w90 w90Var = new w90(context, null);
        this.f27667b = w90Var;
        w90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.r6.W(w90Var, i10, g6Var);
        w90Var.setTextSize(1, 14.0f);
        w90Var.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(w90Var);
        w90 w90Var2 = new w90(context, null);
        this.f27668c = w90Var2;
        w90Var2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        org.telegram.ui.ActionBar.r6.W(w90Var2, i10, g6Var);
        org.telegram.ui.ActionBar.r6.I(w90Var2, i11, g6Var);
        w90Var2.setTypeface(Typeface.SANS_SERIF);
        w90Var2.setTextSize(1, 13.0f);
        linearLayout.addView(w90Var2);
    }

    @Override
    public CharSequence getAccessibilityText() {
        return ((Object) this.f27667b.getText()) + ".\n" + ((Object) this.f27668c.getText());
    }
}
