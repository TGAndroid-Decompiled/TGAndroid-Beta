package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class d8 extends g8 {
    public final Context E;
    public final KeyEvent.Callback F;
    public final int f27421y;

    public d8(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.f27421y = i10;
        this.F = callback;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.f27421y) {
            case 0:
                oa0 oa0Var = new oa0(this.E);
                org.telegram.ui.ActionBar.f7.V(oa0Var, org.telegram.ui.ActionBar.y6.Oi, m8.g0((m8) this.F));
                oa0Var.setTextSize(1, 17.0f);
                oa0Var.setTypeface(AndroidUtilities.bold());
                oa0Var.setEllipsize(TextUtils.TruncateAt.END);
                oa0Var.setSingleLine(true);
                return oa0Var;
            case 1:
                oa0 oa0Var2 = new oa0(this.E);
                int i10 = org.telegram.ui.ActionBar.y6.Si;
                m8 m8Var = (m8) this.F;
                org.telegram.ui.ActionBar.f7.V(oa0Var2, i10, m8.i0(m8Var));
                oa0Var2.setTextSize(1, 13.0f);
                oa0Var2.setEllipsize(TextUtils.TruncateAt.END);
                oa0Var2.setSingleLine(true);
                oa0Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f));
                int i11 = org.telegram.ui.ActionBar.y6.f23448i6;
                org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(m8Var.getThemedColor(i11), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
                org.telegram.ui.ActionBar.u6 j02 = m8.j0(m8Var);
                oa0Var2.setBackground(Z);
                org.telegram.ui.ActionBar.f7.k(oa0Var2, Z, null, N, j02);
                oa0Var2.setOnClickListener(new org.telegram.ui.ActionBar.u1(28, this, oa0Var2));
                return oa0Var2;
            default:
                oa0 oa0Var3 = new oa0(this.E);
                org.telegram.ui.ActionBar.f7.V(oa0Var3, org.telegram.ui.ActionBar.y6.Si, ((lp0) this.F).N);
                oa0Var3.setTextSize(1, 12.0f);
                oa0Var3.setEllipsize(TextUtils.TruncateAt.END);
                oa0Var3.setSingleLine(true);
                oa0Var3.setPadding(AndroidUtilities.dp(0.0f), 0, AndroidUtilities.dp(0.0f), AndroidUtilities.dp(0.0f));
                return oa0Var3;
        }
    }
}
