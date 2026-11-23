package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class w7 extends z7 {
    public final int E;
    public final Context F;
    public final KeyEvent.Callback G;

    public w7(KeyEvent.Callback callback, Context context, Context context2, int i7) {
        super(context);
        this.E = i7;
        this.G = callback;
        this.F = context2;
    }

    @Override
    public final TextView a() {
        switch (this.E) {
            case 0:
                b90 b90Var = new b90(this.F);
                org.telegram.ui.ActionBar.u6.U(b90Var, org.telegram.ui.ActionBar.n6.Fj, ((e8) this.G).J0);
                b90Var.setTextSize(1, 17.0f);
                b90Var.setTypeface(org.telegram.messenger.g0.o());
                b90Var.setEllipsize(TextUtils.TruncateAt.END);
                b90Var.setSingleLine(true);
                return b90Var;
            case 1:
                b90 b90Var2 = new b90(this.F);
                int i7 = org.telegram.ui.ActionBar.n6.Jj;
                e8 e8Var = (e8) this.G;
                org.telegram.ui.ActionBar.u6.U(b90Var2, i7, e8Var.J0);
                b90Var2.setTextSize(1, 13.0f);
                b90Var2.setEllipsize(TextUtils.TruncateAt.END);
                b90Var2.setSingleLine(true);
                b90Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f));
                int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i10, e8Var.J0), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
                org.telegram.ui.ActionBar.i6 i6Var = e8Var.J0;
                b90Var2.setBackground(a02);
                org.telegram.ui.ActionBar.u6.j(b90Var2, a02, null, M, i6Var);
                b90Var2.setOnClickListener(new oi.i1(29, this, b90Var2));
                return b90Var2;
            default:
                b90 b90Var3 = new b90(this.F);
                org.telegram.ui.ActionBar.u6.U(b90Var3, org.telegram.ui.ActionBar.n6.Jj, ((an0) this.G).O);
                b90Var3.setTextSize(1, 12.0f);
                b90Var3.setEllipsize(TextUtils.TruncateAt.END);
                b90Var3.setSingleLine(true);
                b90Var3.setPadding(org.telegram.messenger.g0.L(0.0f), 0, org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(0.0f));
                return b90Var3;
        }
    }
}
