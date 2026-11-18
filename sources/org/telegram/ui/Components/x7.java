package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class x7 extends b8 {
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
                c90 c90Var = new c90(this.F);
                org.telegram.ui.ActionBar.u6.U(c90Var, org.telegram.ui.ActionBar.n6.Fj, ((g8) this.G).J0);
                c90Var.setTextSize(1, 17.0f);
                c90Var.setTypeface(org.telegram.messenger.g0.o());
                c90Var.setEllipsize(TextUtils.TruncateAt.END);
                c90Var.setSingleLine(true);
                return c90Var;
            case 1:
                c90 c90Var2 = new c90(this.F);
                int i7 = org.telegram.ui.ActionBar.n6.Jj;
                g8 g8Var = (g8) this.G;
                org.telegram.ui.ActionBar.u6.U(c90Var2, i7, g8Var.J0);
                c90Var2.setTextSize(1, 13.0f);
                c90Var2.setEllipsize(TextUtils.TruncateAt.END);
                c90Var2.setSingleLine(true);
                c90Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
                int i10 = org.telegram.ui.ActionBar.n6.f29486i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i10, g8Var.J0), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
                org.telegram.ui.ActionBar.i6 i6Var = g8Var.J0;
                c90Var2.setBackground(a02);
                org.telegram.ui.ActionBar.u6.j(c90Var2, a02, null, M, i6Var);
                c90Var2.setOnClickListener(new y7(0, this, c90Var2));
                return c90Var2;
            default:
                c90 c90Var3 = new c90(this.F);
                org.telegram.ui.ActionBar.u6.U(c90Var3, org.telegram.ui.ActionBar.n6.Jj, ((ym0) this.G).O);
                c90Var3.setTextSize(1, 12.0f);
                c90Var3.setEllipsize(TextUtils.TruncateAt.END);
                c90Var3.setSingleLine(true);
                c90Var3.setPadding(org.telegram.messenger.g0.L(0.0f), 0, org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(0.0f));
                return c90Var3;
        }
    }
}
