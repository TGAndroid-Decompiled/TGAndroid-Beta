package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y7 extends b8 {
    public final Context E;
    public final h8 F;
    public final int f30170y;

    public y7(h8 h8Var, Context context, Context context2, int i10) {
        super(context);
        this.f30170y = i10;
        this.F = h8Var;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f30170y) {
            case 0:
                r90 r90Var = new r90(this.E);
                r90Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.i6.Oi));
                r90Var.setTextSize(1, 17.0f);
                r90Var.setTypeface(AndroidUtilities.bold());
                r90Var.setEllipsize(TextUtils.TruncateAt.END);
                r90Var.setSingleLine(true);
                return r90Var;
            default:
                r90 r90Var2 = new r90(this.E);
                int i10 = org.telegram.ui.ActionBar.i6.Si;
                h8 h8Var = this.F;
                r90Var2.setTextColor(h8Var.getThemedColor(i10));
                r90Var2.setTextSize(1, 13.0f);
                r90Var2.setEllipsize(TextUtils.TruncateAt.END);
                r90Var2.setSingleLine(true);
                r90Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                r90Var2.setBackground(org.telegram.ui.ActionBar.i6.Y(h8Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18926i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                r90Var2.setOnClickListener(new org.telegram.ui.rf(18, this, r90Var2));
                return r90Var2;
        }
    }
}
