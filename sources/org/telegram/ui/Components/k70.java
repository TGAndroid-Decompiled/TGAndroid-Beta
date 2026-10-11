package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class k70 implements View.OnClickListener {
    public final int f27856a;
    public final TLRPC.User f27857b;
    public final String f27858c;
    public final boolean d;
    public final boolean f27859e;
    public final boolean f27860f;
    public final rm0 h;

    public k70(rm0 rm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27856a = i10;
        this.h = rm0Var;
        this.f27857b = user;
        this.f27858c = str;
        this.d = z10;
        this.f27859e = z11;
        this.f27860f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f27856a) {
            case 0:
                u70 u70Var = ((p70) this.h).f29637c;
                Context context = u70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) u70Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.e3) u70Var).resourcesProvider;
                f11.b(context, i10, -u70Var.f31320g0, this.f27857b, this.f27858c, this.d, this.f27859e, this.f27860f, d6Var);
                return;
            default:
                dw0 dw0Var = ((nu0) this.h).f29143f;
                f11.b(dw0Var.getContext(), dw0Var.f25735v1.getCurrentAccount(), dw0Var.f25710j1, this.f27857b, this.f27858c, this.d, this.f27859e, this.f27860f, dw0Var.F1);
                return;
        }
    }
}
