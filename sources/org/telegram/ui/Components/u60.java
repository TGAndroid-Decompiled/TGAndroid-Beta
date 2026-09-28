package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u60 implements View.OnClickListener {
    public final int f28753a;
    public final TLRPC.User f28754b;
    public final String f28755c;
    public final boolean d;
    public final boolean e;
    public final boolean f28756f;
    public final xl0 h;

    public u60(xl0 xl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28753a = i10;
        this.h = xl0Var;
        this.f28754b = user;
        this.f28755c = str;
        this.d = z10;
        this.e = z11;
        this.f28756f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f28753a) {
            case 0:
                e70 e70Var = ((z60) this.h).f30831c;
                Context context = e70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) e70Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.e3) e70Var).resourcesProvider;
                n01.b(context, i10, -e70Var.f23933g0, this.f28754b, this.f28755c, this.d, this.e, this.f28756f, d6Var);
                return;
            default:
                lv0 lv0Var = ((vt0) this.h).f29734f;
                n01.b(lv0Var.getContext(), lv0Var.f26159v1.getCurrentAccount(), lv0Var.f26134j1, this.f28754b, this.f28755c, this.d, this.e, this.f28756f, lv0Var.F1);
                return;
        }
    }
}
