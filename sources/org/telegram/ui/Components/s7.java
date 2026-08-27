package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class s7 extends v7 {
    public final Context A;
    public final b8 B;

    public final int f32349y;

    public s7(b8 b8Var, Context context, Context context2, int i10) {
        super(context);
        this.f32349y = i10;
        this.B = b8Var;
        this.A = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f32349y) {
            case 0:
                e90 e90Var = new e90(this.A);
                e90Var.setTextColor(this.B.getThemedColor(org.telegram.ui.ActionBar.g6.Oi));
                e90Var.setTextSize(1, 17.0f);
                e90Var.setTypeface(AndroidUtilities.bold());
                e90Var.setEllipsize(TextUtils.TruncateAt.END);
                e90Var.setSingleLine(true);
                return e90Var;
            default:
                e90 e90Var2 = new e90(this.A);
                int i10 = org.telegram.ui.ActionBar.g6.Si;
                b8 b8Var = this.B;
                e90Var2.setTextColor(b8Var.getThemedColor(i10));
                e90Var2.setTextSize(1, 13.0f);
                e90Var2.setEllipsize(TextUtils.TruncateAt.END);
                e90Var2.setSingleLine(true);
                e90Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                e90Var2.setBackground(org.telegram.ui.ActionBar.g6.Y(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                e90Var2.setOnClickListener(new q2(6, this, e90Var2));
                return e90Var2;
        }
    }
}
