package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n50 implements View.OnClickListener {
    public final int f37671a;
    public final TLRPC.User f37672b;
    public final String f37673c;
    public final boolean d;
    public final boolean f37674e;
    public final boolean f37675f;
    public final dk0 h;

    public n50(dk0 dk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i7) {
        this.f37671a = i7;
        this.h = dk0Var;
        this.f37672b = user;
        this.f37673c = str;
        this.d = z10;
        this.f37674e = z11;
        this.f37675f = z12;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37671a) {
            case 0:
                x50 x50Var = ((s50) this.h).f39500c;
                oy0.b(x50Var.getContext(), x50Var.f30223a, -x50Var.f41830b2, this.f37672b, this.f37673c, this.d, this.f37674e, this.f37675f, x50Var.J0);
                return;
            default:
                it0 it0Var = ((ur0) this.h).f40447f;
                oy0.b(it0Var.getContext(), it0Var.f36166y1.getCurrentAccount(), it0Var.f36130m1, this.f37672b, this.f37673c, this.d, this.f37674e, this.f37675f, it0Var.I1);
                return;
        }
    }
}
