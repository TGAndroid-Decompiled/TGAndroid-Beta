package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class o7 extends r7 {
    public final int D;
    public final Context E;
    public final KeyEvent.Callback F;

    public o7(KeyEvent.Callback callback, Context context, Context context2, int i10) {
        super(context);
        this.D = i10;
        this.F = callback;
        this.E = context2;
    }

    @Override
    public final TextView a() {
        switch (this.D) {
            case 0:
                h90 h90Var = new h90(this.E);
                org.telegram.ui.ActionBar.a7.V(h90Var, org.telegram.ui.ActionBar.t6.Cj, ((w7) this.F).I0);
                h90Var.setTextSize(1, 17.0f);
                h90Var.setTypeface(org.telegram.messenger.i0.o());
                h90Var.setEllipsize(TextUtils.TruncateAt.END);
                h90Var.setSingleLine(true);
                return h90Var;
            case 1:
                h90 h90Var2 = new h90(this.E);
                int i10 = org.telegram.ui.ActionBar.t6.Gj;
                w7 w7Var = (w7) this.F;
                org.telegram.ui.ActionBar.a7.V(h90Var2, i10, w7Var.I0);
                h90Var2.setTextSize(1, 13.0f);
                h90Var2.setEllipsize(TextUtils.TruncateAt.END);
                h90Var2.setSingleLine(true);
                h90Var2.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.0f));
                int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
                org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i11, w7Var.I0), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
                org.telegram.ui.ActionBar.p6 p6Var = w7Var.I0;
                h90Var2.setBackground(a02);
                org.telegram.ui.ActionBar.a7.k(h90Var2, a02, null, N, p6Var);
                h90Var2.setOnClickListener(new org.telegram.ui.ud(19, this, h90Var2));
                return h90Var2;
            default:
                h90 h90Var3 = new h90(this.E);
                org.telegram.ui.ActionBar.a7.V(h90Var3, org.telegram.ui.ActionBar.t6.Gj, ((on0) this.F).N);
                h90Var3.setTextSize(1, 12.0f);
                h90Var3.setEllipsize(TextUtils.TruncateAt.END);
                h90Var3.setSingleLine(true);
                h90Var3.setPadding(org.telegram.messenger.i0.L(0.0f), 0, org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(0.0f));
                return h90Var3;
        }
    }
}
