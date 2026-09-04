package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class b8 extends e8 {
    public final Context E;
    public final k8 F;
    public final int f24594y;

    public b8(k8 k8Var, Context context, Context context2, int i10) {
        super(context);
        this.f24594y = i10;
        this.F = k8Var;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f24594y) {
            case 0:
                s90 s90Var = new s90(this.E);
                s90Var.setTextColor(this.F.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                s90Var.setTextSize(1, 17.0f);
                s90Var.setTypeface(AndroidUtilities.bold());
                s90Var.setEllipsize(TextUtils.TruncateAt.END);
                s90Var.setSingleLine(true);
                return s90Var;
            default:
                s90 s90Var2 = new s90(this.E);
                int i10 = org.telegram.ui.ActionBar.j6.Si;
                k8 k8Var = this.F;
                s90Var2.setTextColor(k8Var.getThemedColor(i10));
                s90Var2.setTextSize(1, 13.0f);
                s90Var2.setEllipsize(TextUtils.TruncateAt.END);
                s90Var2.setSingleLine(true);
                s90Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                s90Var2.setBackground(org.telegram.ui.ActionBar.j6.Y(k8Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20753i6), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
                s90Var2.setOnClickListener(new org.telegram.ui.rf(18, this, s90Var2));
                return s90Var2;
        }
    }
}
