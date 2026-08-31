package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class k60 implements View.OnClickListener {
    public final int f28282a;
    public final TLRPC.User f28283b;
    public final String f28284c;
    public final boolean d;
    public final boolean f28285e;
    public final boolean f28286f;
    public final sl0 h;

    public k60(sl0 sl0Var, TLRPC.User user, String str, boolean z4, boolean z10, boolean z11, int i10) {
        this.f28282a = i10;
        this.h = sl0Var;
        this.f28283b = user;
        this.f28284c = str;
        this.d = z4;
        this.f28285e = z10;
        this.f28286f = z11;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        switch (this.f28282a) {
            case 0:
                u60 u60Var = ((p60) this.h).f29975c;
                Context context = u60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.h3) u60Var).resourcesProvider;
                g01.b(context, i10, -u60Var.f31562d0, this.f28283b, this.f28284c, this.d, this.f28285e, this.f28286f, g6Var);
                return;
            default:
                zu0 zu0Var = ((it0) this.h).f27903f;
                g01.b(zu0Var.getContext(), zu0Var.f34004s1.getCurrentAccount(), zu0Var.f33979g1, this.f28283b, this.f28284c, this.d, this.f28285e, this.f28286f, zu0Var.C1);
                return;
        }
    }
}
