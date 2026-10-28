package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e70 implements View.OnClickListener {
    public final int f27729a;
    public final TLRPC.User f27730b;
    public final String f27731c;
    public final boolean d;
    public final boolean e;
    public final boolean f27732f;
    public final mm0 h;

    public e70(mm0 mm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27729a = i10;
        this.h = mm0Var;
        this.f27730b = user;
        this.f27731c = str;
        this.d = z10;
        this.e = z11;
        this.f27732f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        switch (this.f27729a) {
            case 0:
                o70 o70Var = ((j70) this.h).f29532c;
                Context context = o70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.k3) o70Var).currentAccount;
                u6Var = ((org.telegram.ui.ActionBar.k3) o70Var).resourcesProvider;
                j11.b(context, i10, -o70Var.f31217g0, this.f27730b, this.f27731c, this.d, this.e, this.f27732f, u6Var);
                return;
            default:
                bw0 bw0Var = ((lu0) this.h).f30307f;
                j11.b(bw0Var.getContext(), bw0Var.f26992x1.getCurrentAccount(), bw0Var.l1, this.f27730b, this.f27731c, this.d, this.e, this.f27732f, bw0Var.H1);
                return;
        }
    }
}
