package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j60 implements View.OnClickListener {
    public final int f25868a;
    public final TLRPC.User f25869b;
    public final String f25870c;
    public final boolean d;
    public final boolean e;
    public final boolean f25871f;
    public final ql0 h;

    public j60(ql0 ql0Var, TLRPC.User user, String str, boolean z4, boolean z10, boolean z11, int i10) {
        this.f25868a = i10;
        this.h = ql0Var;
        this.f25869b = user;
        this.f25870c = str;
        this.d = z4;
        this.e = z10;
        this.f25871f = z11;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f25868a) {
            case 0:
                t60 t60Var = ((o60) this.h).f27469c;
                Context context = t60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.g3) t60Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.g3) t60Var).resourcesProvider;
                f01.b(context, i10, -t60Var.f28911d0, this.f25869b, this.f25870c, this.d, this.e, this.f25871f, f6Var);
                return;
            default:
                yu0 yu0Var = ((ht0) this.h).f25495f;
                f01.b(yu0Var.getContext(), yu0Var.f31155s1.getCurrentAccount(), yu0Var.f31130g1, this.f25869b, this.f25870c, this.d, this.e, this.f25871f, yu0Var.C1);
                return;
        }
    }
}
