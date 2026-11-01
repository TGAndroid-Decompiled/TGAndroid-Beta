package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class s50 implements View.OnClickListener {
    public final int f30213a;
    public final TLRPC.User f30214b;
    public final String f30215c;
    public final boolean d;
    public final boolean e;
    public final boolean f30216f;
    public final tk0 h;

    public s50(tk0 tk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f30213a = i10;
        this.h = tk0Var;
        this.f30214b = user;
        this.f30215c = str;
        this.d = z10;
        this.e = z11;
        this.f30216f = z12;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30213a) {
            case 0:
                c60 c60Var = ((x50) this.h).f32426c;
                jz0.b(c60Var.getContext(), c60Var.f21584a, -c60Var.X1, this.f30214b, this.f30215c, this.d, this.e, this.f30216f, c60Var.I0);
                return;
            default:
                au0 au0Var = ((ls0) this.h).f28259f;
                jz0.b(au0Var.getContext(), au0Var.f24568x1.getCurrentAccount(), au0Var.l1, this.f30214b, this.f30215c, this.d, this.e, this.f30216f, au0Var.H1);
                return;
        }
    }
}
