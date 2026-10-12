package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class c8 extends f8 {
    public final Context E;
    public final l8 F;
    public final int f24848y;

    public c8(l8 l8Var, Context context, Context context2, int i10) {
        super(context);
        this.f24848y = i10;
        this.F = l8Var;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f24848y) {
            case 0:
                xa0 xa0Var = new xa0(this.E);
                xa0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.h6.Oi));
                xa0Var.setTextSize(1, 17.0f);
                xa0Var.setTypeface(AndroidUtilities.bold());
                xa0Var.setEllipsize(TextUtils.TruncateAt.END);
                xa0Var.setSingleLine(true);
                return xa0Var;
            default:
                xa0 xa0Var2 = new xa0(this.E);
                int i10 = org.telegram.ui.ActionBar.h6.Si;
                l8 l8Var = this.F;
                xa0Var2.setTextColor(l8Var.getThemedColor(i10));
                xa0Var2.setTextSize(1, 13.0f);
                xa0Var2.setEllipsize(TextUtils.TruncateAt.END);
                xa0Var2.setSingleLine(true);
                xa0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                xa0Var2.setBackground(org.telegram.ui.ActionBar.h6.Z(l8Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20650i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                xa0Var2.setOnClickListener(new org.telegram.ui.wf(18, this, xa0Var2));
                return xa0Var2;
        }
    }
}
