package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class u60 implements View.OnClickListener {
    public final int f28814a;
    public final TLRPC.User f28815b;
    public final String f28816c;
    public final boolean d;
    public final boolean e;
    public final boolean f28817f;
    public final xl0 h;

    public u60(xl0 xl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f28814a = i10;
        this.h = xl0Var;
        this.f28815b = user;
        this.f28816c = str;
        this.d = z10;
        this.e = z11;
        this.f28817f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.f28814a) {
            case 0:
                e70 e70Var = ((z60) this.h).f30861c;
                Context context = e70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.g3) e70Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.g3) e70Var).resourcesProvider;
                n01.b(context, i10, -e70Var.f23948g0, this.f28815b, this.f28816c, this.d, this.e, this.f28817f, e6Var);
                return;
            default:
                lv0 lv0Var = ((vt0) this.h).f29786f;
                n01.b(lv0Var.getContext(), lv0Var.f26212v1.getCurrentAccount(), lv0Var.f26187j1, this.f28815b, this.f28816c, this.d, this.e, this.f28817f, lv0Var.F1);
                return;
        }
    }
}
