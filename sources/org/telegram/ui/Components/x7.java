package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class x7 extends a8 {
    public final int E;
    public final Context F;
    public final KeyEvent.Callback G;

    public x7(KeyEvent.Callback callback, Context context, Context context2, int i7) {
        super(context);
        this.E = i7;
        this.G = callback;
        this.F = context2;
    }

    @Override
    public final TextView a() {
        switch (this.E) {
            case 0:
                e90 e90Var = new e90(this.F);
                org.telegram.ui.ActionBar.t6.U(e90Var, org.telegram.ui.ActionBar.m6.Fj, ((f8) this.G).J0);
                e90Var.setTextSize(1, 17.0f);
                e90Var.setTypeface(org.telegram.messenger.g0.o());
                e90Var.setEllipsize(TextUtils.TruncateAt.END);
                e90Var.setSingleLine(true);
                return e90Var;
            case 1:
                e90 e90Var2 = new e90(this.F);
                int i7 = org.telegram.ui.ActionBar.m6.Jj;
                f8 f8Var = (f8) this.G;
                org.telegram.ui.ActionBar.t6.U(e90Var2, i7, f8Var.J0);
                e90Var2.setTextSize(1, 13.0f);
                e90Var2.setEllipsize(TextUtils.TruncateAt.END);
                e90Var2.setSingleLine(true);
                e90Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
                int i10 = org.telegram.ui.ActionBar.m6.f29470i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i10, f8Var.J0), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
                org.telegram.ui.ActionBar.h6 h6Var = f8Var.J0;
                e90Var2.setBackground(a02);
                org.telegram.ui.ActionBar.t6.j(e90Var2, a02, null, M, h6Var);
                e90Var2.setOnClickListener(new oi.i1(29, this, e90Var2));
                return e90Var2;
            default:
                e90 e90Var3 = new e90(this.F);
                org.telegram.ui.ActionBar.t6.U(e90Var3, org.telegram.ui.ActionBar.m6.Jj, ((bn0) this.G).O);
                e90Var3.setTextSize(1, 12.0f);
                e90Var3.setEllipsize(TextUtils.TruncateAt.END);
                e90Var3.setSingleLine(true);
                e90Var3.setPadding(org.telegram.messenger.g0.L(0.0f), 0, org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(0.0f));
                return e90Var3;
        }
    }
}
