package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a8 extends d8 {
    public final Context E;
    public final j8 F;
    public final int f22560y;

    public a8(j8 j8Var, Context context, Context context2, int i10) {
        super(context);
        this.f22560y = i10;
        this.F = j8Var;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f22560y) {
            case 0:
                da0 da0Var = new da0(this.E);
                da0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.h6.Oi));
                da0Var.setTextSize(1, 17.0f);
                da0Var.setTypeface(AndroidUtilities.bold());
                da0Var.setEllipsize(TextUtils.TruncateAt.END);
                da0Var.setSingleLine(true);
                return da0Var;
            default:
                da0 da0Var2 = new da0(this.E);
                int i10 = org.telegram.ui.ActionBar.h6.Si;
                j8 j8Var = this.F;
                da0Var2.setTextColor(j8Var.getThemedColor(i10));
                da0Var2.setTextSize(1, 13.0f);
                da0Var2.setEllipsize(TextUtils.TruncateAt.END);
                da0Var2.setSingleLine(true);
                da0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                da0Var2.setBackground(org.telegram.ui.ActionBar.h6.Y(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19148i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                da0Var2.setOnClickListener(new org.telegram.ui.pf(18, this, da0Var2));
                return da0Var2;
        }
    }
}
