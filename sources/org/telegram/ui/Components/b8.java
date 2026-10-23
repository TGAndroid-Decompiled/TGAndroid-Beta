package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class b8 extends e8 {
    public final Context E;
    public final k8 F;
    public final int f24977y;

    public b8(k8 k8Var, Context context, Context context2, int i10) {
        super(context);
        this.f24977y = i10;
        this.F = k8Var;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        switch (this.f24977y) {
            case 0:
                na0 na0Var = new na0(this.E);
                int i10 = org.telegram.ui.ActionBar.k6.Oi;
                g6Var = ((org.telegram.ui.ActionBar.h3) this.F).resourcesProvider;
                org.telegram.ui.ActionBar.r6.W(na0Var, i10, g6Var);
                na0Var.setTextSize(1, 17.0f);
                na0Var.setTypeface(AndroidUtilities.bold());
                na0Var.setEllipsize(TextUtils.TruncateAt.END);
                na0Var.setSingleLine(true);
                return na0Var;
            default:
                na0 na0Var2 = new na0(this.E);
                int i11 = org.telegram.ui.ActionBar.k6.Si;
                k8 k8Var = this.F;
                g6Var2 = ((org.telegram.ui.ActionBar.h3) k8Var).resourcesProvider;
                org.telegram.ui.ActionBar.r6.W(na0Var2, i11, g6Var2);
                na0Var2.setTextSize(1, 13.0f);
                na0Var2.setEllipsize(TextUtils.TruncateAt.END);
                na0Var2.setSingleLine(true);
                na0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                int i12 = org.telegram.ui.ActionBar.k6.f21272i6;
                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(k8Var.getThemedColor(i12), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
                g6Var3 = ((org.telegram.ui.ActionBar.h3) k8Var).resourcesProvider;
                na0Var2.setBackground(Z);
                org.telegram.ui.ActionBar.r6.k(na0Var2, Z, null, O, g6Var3);
                na0Var2.setOnClickListener(new org.telegram.ui.ActionBar.s1(28, this, na0Var2));
                return na0Var2;
        }
    }
}
