package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class i60 implements View.OnClickListener {
    public final int f25581a;
    public final TLRPC.User f25582b;
    public final String f25583c;
    public final boolean d;
    public final boolean e;
    public final boolean f25584f;
    public final rl0 h;

    public i60(rl0 rl0Var, TLRPC.User user, String str, boolean z4, boolean z10, boolean z11, int i10) {
        this.f25581a = i10;
        this.h = rl0Var;
        this.f25582b = user;
        this.f25583c = str;
        this.d = z4;
        this.e = z10;
        this.f25584f = z11;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f25581a) {
            case 0:
                s60 s60Var = ((n60) this.h).f27204c;
                Context context = s60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.g3) s60Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.g3) s60Var).resourcesProvider;
                f01.b(context, i10, -s60Var.f28642d0, this.f25582b, this.f25583c, this.d, this.e, this.f25584f, f6Var);
                return;
            default:
                yu0 yu0Var = ((ht0) this.h).f25488f;
                f01.b(yu0Var.getContext(), yu0Var.f31144s1.getCurrentAccount(), yu0Var.f31119g1, this.f25582b, this.f25583c, this.d, this.e, this.f25584f, yu0Var.C1);
                return;
        }
    }
}
