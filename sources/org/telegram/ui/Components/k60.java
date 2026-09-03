package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class k60 implements View.OnClickListener {
    public final int f28287a;
    public final TLRPC.User f28288b;
    public final String f28289c;
    public final boolean d;
    public final boolean f28290e;
    public final boolean f28291f;
    public final rl0 h;

    public k60(rl0 rl0Var, TLRPC.User user, String str, boolean z4, boolean z10, boolean z11, int i10) {
        this.f28287a = i10;
        this.h = rl0Var;
        this.f28288b = user;
        this.f28289c = str;
        this.d = z4;
        this.f28290e = z10;
        this.f28291f = z11;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        switch (this.f28287a) {
            case 0:
                u60 u60Var = ((p60) this.h).f29993c;
                Context context = u60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.h3) u60Var).resourcesProvider;
                f01.b(context, i10, -u60Var.f31512d0, this.f28288b, this.f28289c, this.d, this.f28290e, this.f28291f, g6Var);
                return;
            default:
                yu0 yu0Var = ((ht0) this.h).f27626f;
                f01.b(yu0Var.getContext(), yu0Var.f33649s1.getCurrentAccount(), yu0Var.f33624g1, this.f28288b, this.f28289c, this.d, this.f28290e, this.f28291f, yu0Var.C1);
                return;
        }
    }
}
