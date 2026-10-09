package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j70 implements View.OnClickListener {
    public final int f27624a;
    public final TLRPC.User f27625b;
    public final String f27626c;
    public final boolean d;
    public final boolean f27627e;
    public final boolean f27628f;
    public final pm0 h;

    public j70(pm0 pm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27624a = i10;
        this.h = pm0Var;
        this.f27625b = user;
        this.f27626c = str;
        this.d = z10;
        this.f27627e = z11;
        this.f27628f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.f27624a) {
            case 0:
                t70 t70Var = ((o70) this.h).f29404c;
                Context context = t70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) t70Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.f3) t70Var).resourcesProvider;
                d11.b(context, i10, -t70Var.f31063g0, this.f27625b, this.f27626c, this.d, this.f27627e, this.f27628f, e6Var);
                return;
            default:
                bw0 bw0Var = ((lu0) this.h).f28597f;
                d11.b(bw0Var.getContext(), bw0Var.f25166v1.getCurrentAccount(), bw0Var.f25141j1, this.f27625b, this.f27626c, this.d, this.f27627e, this.f27628f, bw0Var.F1);
                return;
        }
    }
}
