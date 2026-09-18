package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a8 extends d8 {
    public final Context E;
    public final j8 F;
    public final int f22559y;

    public a8(j8 j8Var, Context context, Context context2, int i10) {
        super(context);
        this.f22559y = i10;
        this.F = j8Var;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f22559y) {
            case 0:
                aa0 aa0Var = new aa0(this.E);
                aa0Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                aa0Var.setTextSize(1, 17.0f);
                aa0Var.setTypeface(AndroidUtilities.bold());
                aa0Var.setEllipsize(TextUtils.TruncateAt.END);
                aa0Var.setSingleLine(true);
                return aa0Var;
            default:
                aa0 aa0Var2 = new aa0(this.E);
                int i10 = org.telegram.ui.ActionBar.j6.Si;
                j8 j8Var = this.F;
                aa0Var2.setTextColor(j8Var.getThemedColor(i10));
                aa0Var2.setTextSize(1, 13.0f);
                aa0Var2.setEllipsize(TextUtils.TruncateAt.END);
                aa0Var2.setSingleLine(true);
                aa0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                aa0Var2.setBackground(org.telegram.ui.ActionBar.j6.Y(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19152i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                aa0Var2.setOnClickListener(new org.telegram.ui.sf(18, this, aa0Var2));
                return aa0Var2;
        }
    }
}
