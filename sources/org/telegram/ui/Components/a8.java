package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a8 extends d8 {
    public final Context E;
    public final j8 F;
    public final int f22596y;

    public a8(j8 j8Var, Context context, Context context2, int i10) {
        super(context);
        this.f22596y = i10;
        this.F = j8Var;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f22596y) {
            case 0:
                ca0 ca0Var = new ca0(this.E);
                ca0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.h6.Oi));
                ca0Var.setTextSize(1, 17.0f);
                ca0Var.setTypeface(AndroidUtilities.bold());
                ca0Var.setEllipsize(TextUtils.TruncateAt.END);
                ca0Var.setSingleLine(true);
                return ca0Var;
            default:
                ca0 ca0Var2 = new ca0(this.E);
                int i10 = org.telegram.ui.ActionBar.h6.Si;
                j8 j8Var = this.F;
                ca0Var2.setTextColor(j8Var.getThemedColor(i10));
                ca0Var2.setTextSize(1, 13.0f);
                ca0Var2.setEllipsize(TextUtils.TruncateAt.END);
                ca0Var2.setSingleLine(true);
                ca0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                ca0Var2.setBackground(org.telegram.ui.ActionBar.h6.Y(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19134i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                ca0Var2.setOnClickListener(new org.telegram.ui.pf(18, this, ca0Var2));
                return ca0Var2;
        }
    }
}
