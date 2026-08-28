package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t7 extends w7 {
    public final Context A;
    public final c8 B;
    public final int f32636y;

    public t7(c8 c8Var, Context context, Context context2, int i9) {
        super(context);
        this.f32636y = i9;
        this.B = c8Var;
        this.A = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f32636y) {
            case 0:
                a90 a90Var = new a90(this.A);
                a90Var.setTextColor(this.B.getThemedColor(org.telegram.ui.ActionBar.f6.Oi));
                a90Var.setTextSize(1, 17.0f);
                a90Var.setTypeface(AndroidUtilities.bold());
                a90Var.setEllipsize(TextUtils.TruncateAt.END);
                a90Var.setSingleLine(true);
                return a90Var;
            default:
                a90 a90Var2 = new a90(this.A);
                int i9 = org.telegram.ui.ActionBar.f6.Si;
                c8 c8Var = this.B;
                a90Var2.setTextColor(c8Var.getThemedColor(i9));
                a90Var2.setTextSize(1, 13.0f);
                a90Var2.setEllipsize(TextUtils.TruncateAt.END);
                a90Var2.setSingleLine(true);
                a90Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                a90Var2.setBackground(org.telegram.ui.ActionBar.f6.Y(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                a90Var2.setOnClickListener(new s2(5, this, a90Var2));
                return a90Var2;
        }
    }
}
