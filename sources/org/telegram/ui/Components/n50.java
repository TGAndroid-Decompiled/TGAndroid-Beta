package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n50 implements View.OnClickListener {
    public final int f37730a;
    public final TLRPC.User f37731b;
    public final String f37732c;
    public final boolean d;
    public final boolean f37733e;
    public final boolean f37734f;
    public final bk0 h;

    public n50(bk0 bk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i7) {
        this.f37730a = i7;
        this.h = bk0Var;
        this.f37731b = user;
        this.f37732c = str;
        this.d = z10;
        this.f37733e = z11;
        this.f37734f = z12;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37730a) {
            case 0:
                x50 x50Var = ((s50) this.h).f39494c;
                ny0.b(x50Var.getContext(), x50Var.f30187a, -x50Var.f41888b2, this.f37731b, this.f37732c, this.d, this.f37733e, this.f37734f, x50Var.J0);
                return;
            default:
                gt0 gt0Var = ((tr0) this.h).f40091f;
                ny0.b(gt0Var.getContext(), gt0Var.f35642y1.getCurrentAccount(), gt0Var.f35606m1, this.f37731b, this.f37732c, this.d, this.f37733e, this.f37734f, gt0Var.I1);
                return;
        }
    }
}
