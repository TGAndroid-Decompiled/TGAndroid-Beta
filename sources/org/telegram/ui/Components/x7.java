package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x7 extends a8 {
    public final Context A;
    public final g8 B;
    public final int f34644y;

    public x7(g8 g8Var, Context context, Context context2, int i10) {
        super(context);
        this.f34644y = i10;
        this.B = g8Var;
        this.A = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f34644y) {
            case 0:
                n90 n90Var = new n90(this.A);
                n90Var.setTextColor(this.B.getThemedColor(org.telegram.ui.ActionBar.g6.Oi));
                n90Var.setTextSize(1, 17.0f);
                n90Var.setTypeface(AndroidUtilities.bold());
                n90Var.setEllipsize(TextUtils.TruncateAt.END);
                n90Var.setSingleLine(true);
                return n90Var;
            default:
                n90 n90Var2 = new n90(this.A);
                int i10 = org.telegram.ui.ActionBar.g6.Si;
                g8 g8Var = this.B;
                n90Var2.setTextColor(g8Var.getThemedColor(i10));
                n90Var2.setTextSize(1, 13.0f);
                n90Var2.setEllipsize(TextUtils.TruncateAt.END);
                n90Var2.setSingleLine(true);
                n90Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                n90Var2.setBackground(org.telegram.ui.ActionBar.g6.Y(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                n90Var2.setOnClickListener(new t2(6, this, n90Var2));
                return n90Var2;
        }
    }
}
