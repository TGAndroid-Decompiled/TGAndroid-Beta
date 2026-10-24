package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class z7 extends c8 {
    public final Context E;
    public final i8 F;
    public final int f33165y;

    public z7(i8 i8Var, Context context, Context context2, int i10) {
        super(context);
        this.f33165y = i10;
        this.F = i8Var;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        switch (this.f33165y) {
            case 0:
                la0 la0Var = new la0(this.E);
                int i10 = org.telegram.ui.ActionBar.k6.Oi;
                g6Var = ((org.telegram.ui.ActionBar.h3) this.F).resourcesProvider;
                org.telegram.ui.ActionBar.r6.W(la0Var, i10, g6Var);
                la0Var.setTextSize(1, 17.0f);
                la0Var.setTypeface(AndroidUtilities.bold());
                la0Var.setEllipsize(TextUtils.TruncateAt.END);
                la0Var.setSingleLine(true);
                return la0Var;
            default:
                la0 la0Var2 = new la0(this.E);
                int i11 = org.telegram.ui.ActionBar.k6.Si;
                i8 i8Var = this.F;
                g6Var2 = ((org.telegram.ui.ActionBar.h3) i8Var).resourcesProvider;
                org.telegram.ui.ActionBar.r6.W(la0Var2, i11, g6Var2);
                la0Var2.setTextSize(1, 13.0f);
                la0Var2.setEllipsize(TextUtils.TruncateAt.END);
                la0Var2.setSingleLine(true);
                la0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(i8Var.getThemedColor(i12), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
                g6Var3 = ((org.telegram.ui.ActionBar.h3) i8Var).resourcesProvider;
                la0Var2.setBackground(Z);
                org.telegram.ui.ActionBar.r6.k(la0Var2, Z, null, O, g6Var3);
                la0Var2.setOnClickListener(new org.telegram.ui.ActionBar.s1(28, this, la0Var2));
                return la0Var2;
        }
    }
}
