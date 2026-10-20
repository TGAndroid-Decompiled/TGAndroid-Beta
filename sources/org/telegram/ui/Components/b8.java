package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class b8 extends e8 {
    public final Context E;
    public final k8 F;
    public final int f24823y;

    public b8(k8 k8Var, Context context, Context context2, int i10) {
        super(context);
        this.f24823y = i10;
        this.F = k8Var;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f24823y) {
            case 0:
                ma0 ma0Var = new ma0(this.E);
                ma0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.h6.Oi));
                ma0Var.setTextSize(1, 17.0f);
                ma0Var.setTypeface(AndroidUtilities.bold());
                ma0Var.setEllipsize(TextUtils.TruncateAt.END);
                ma0Var.setSingleLine(true);
                return ma0Var;
            default:
                ma0 ma0Var2 = new ma0(this.E);
                int i10 = org.telegram.ui.ActionBar.h6.Si;
                k8 k8Var = this.F;
                ma0Var2.setTextColor(k8Var.getThemedColor(i10));
                ma0Var2.setTextSize(1, 13.0f);
                ma0Var2.setEllipsize(TextUtils.TruncateAt.END);
                ma0Var2.setSingleLine(true);
                ma0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                ma0Var2.setBackground(org.telegram.ui.ActionBar.h6.Z(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21079i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                ma0Var2.setOnClickListener(new org.telegram.ui.ActionBar.s1(28, this, ma0Var2));
                return ma0Var2;
        }
    }
}
