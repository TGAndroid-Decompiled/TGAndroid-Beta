package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class c8 extends f8 {
    public final Context E;
    public final l8 F;
    public final int f25220y;

    public c8(l8 l8Var, Context context, Context context2, int i10) {
        super(context);
        this.f25220y = i10;
        this.F = l8Var;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f25220y) {
            case 0:
                ua0 ua0Var = new ua0(this.E);
                ua0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.i6.Oi));
                ua0Var.setTextSize(1, 17.0f);
                ua0Var.setTypeface(AndroidUtilities.bold());
                ua0Var.setEllipsize(TextUtils.TruncateAt.END);
                ua0Var.setSingleLine(true);
                return ua0Var;
            default:
                ua0 ua0Var2 = new ua0(this.E);
                int i10 = org.telegram.ui.ActionBar.i6.Si;
                l8 l8Var = this.F;
                ua0Var2.setTextColor(l8Var.getThemedColor(i10));
                ua0Var2.setTextSize(1, 13.0f);
                ua0Var2.setEllipsize(TextUtils.TruncateAt.END);
                ua0Var2.setSingleLine(true);
                ua0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                ua0Var2.setBackground(org.telegram.ui.ActionBar.i6.Z(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20892i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                ua0Var2.setOnClickListener(new org.telegram.ui.sf(18, this, ua0Var2));
                return ua0Var2;
        }
    }
}
