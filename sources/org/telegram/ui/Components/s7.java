package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class s7 extends v7 {
    public final int D;
    public final Context E;
    public final KeyEvent.Callback F;

    public s7(KeyEvent.Callback callback, Context context, Context context2, int i7) {
        super(context);
        this.D = i7;
        this.F = callback;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.D) {
            case 0:
                o80 o80Var = new o80(this.E);
                org.telegram.ui.ActionBar.t6.U(o80Var, org.telegram.ui.ActionBar.m6.Cj, ((a8) this.F).I0);
                o80Var.setTextSize(1, 17.0f);
                o80Var.setTypeface(org.telegram.messenger.g0.o());
                o80Var.setEllipsize(TextUtils.TruncateAt.END);
                o80Var.setSingleLine(true);
                return o80Var;
            case 1:
                o80 o80Var2 = new o80(this.E);
                int i7 = org.telegram.ui.ActionBar.m6.Gj;
                a8 a8Var = (a8) this.F;
                org.telegram.ui.ActionBar.t6.U(o80Var2, i7, a8Var.I0);
                o80Var2.setTextSize(1, 13.0f);
                o80Var2.setEllipsize(TextUtils.TruncateAt.END);
                o80Var2.setSingleLine(true);
                o80Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
                int i10 = org.telegram.ui.ActionBar.m6.f27982i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i10, a8Var.I0), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
                org.telegram.ui.ActionBar.h6 h6Var = a8Var.I0;
                o80Var2.setBackground(a02);
                org.telegram.ui.ActionBar.t6.j(o80Var2, a02, null, M, h6Var);
                o80Var2.setOnClickListener(new org.telegram.ui.ActionBar.l1(27, this, o80Var2));
                return o80Var2;
            default:
                o80 o80Var3 = new o80(this.E);
                org.telegram.ui.ActionBar.t6.U(o80Var3, org.telegram.ui.ActionBar.m6.Gj, ((mm0) this.F).N);
                o80Var3.setTextSize(1, 12.0f);
                o80Var3.setEllipsize(TextUtils.TruncateAt.END);
                o80Var3.setSingleLine(true);
                o80Var3.setPadding(org.telegram.messenger.g0.L(0.0f), 0, org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(0.0f));
                return o80Var3;
        }
    }
}
