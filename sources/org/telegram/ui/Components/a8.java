package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a8 extends d8 {
    public final Context E;
    public final j8 F;
    public final int f21418y;

    public a8(j8 j8Var, Context context, Context context2, int i10) {
        super(context);
        this.f21418y = i10;
        this.F = j8Var;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f21418y) {
            case 0:
                ba0 ba0Var = new ba0(this.E);
                ba0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                ba0Var.setTextSize(1, 17.0f);
                ba0Var.setTypeface(AndroidUtilities.bold());
                ba0Var.setEllipsize(TextUtils.TruncateAt.END);
                ba0Var.setSingleLine(true);
                return ba0Var;
            default:
                ba0 ba0Var2 = new ba0(this.E);
                int i10 = org.telegram.ui.ActionBar.j6.Si;
                j8 j8Var = this.F;
                ba0Var2.setTextColor(j8Var.getThemedColor(i10));
                ba0Var2.setTextSize(1, 13.0f);
                ba0Var2.setEllipsize(TextUtils.TruncateAt.END);
                ba0Var2.setSingleLine(true);
                ba0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                ba0Var2.setBackground(org.telegram.ui.ActionBar.j6.Y(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18017i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                ba0Var2.setOnClickListener(new org.telegram.ui.sh(15, this, ba0Var2));
                return ba0Var2;
        }
    }
}
