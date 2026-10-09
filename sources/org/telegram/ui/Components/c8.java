package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class c8 extends f8 {
    public final Context E;
    public final l8 F;
    public final int f25285y;

    public c8(l8 l8Var, Context context, Context context2, int i10) {
        super(context);
        this.f25285y = i10;
        this.F = l8Var;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f25285y) {
            case 0:
                ta0 ta0Var = new ta0(this.E);
                ta0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.i6.Oi));
                ta0Var.setTextSize(1, 17.0f);
                ta0Var.setTypeface(AndroidUtilities.bold());
                ta0Var.setEllipsize(TextUtils.TruncateAt.END);
                ta0Var.setSingleLine(true);
                return ta0Var;
            default:
                ta0 ta0Var2 = new ta0(this.E);
                int i10 = org.telegram.ui.ActionBar.i6.Si;
                l8 l8Var = this.F;
                ta0Var2.setTextColor(l8Var.getThemedColor(i10));
                ta0Var2.setTextSize(1, 13.0f);
                ta0Var2.setEllipsize(TextUtils.TruncateAt.END);
                ta0Var2.setSingleLine(true);
                ta0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                ta0Var2.setBackground(org.telegram.ui.ActionBar.i6.Z(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20888i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                ta0Var2.setOnClickListener(new org.telegram.ui.sf(18, this, ta0Var2));
                return ta0Var2;
        }
    }
}
