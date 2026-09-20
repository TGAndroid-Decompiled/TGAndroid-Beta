package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p60 implements View.OnClickListener {
    public final int f27173a;
    public final TLRPC.User f27174b;
    public final String f27175c;
    public final boolean d;
    public final boolean e;
    public final boolean f27176f;
    public final ul0 h;

    public p60(ul0 ul0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27173a = i10;
        this.h = ul0Var;
        this.f27174b = user;
        this.f27175c = str;
        this.d = z10;
        this.e = z11;
        this.f27176f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f27173a) {
            case 0:
                z60 z60Var = ((u60) this.h).f28601c;
                Context context = z60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) z60Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.f3) z60Var).resourcesProvider;
                m01.b(context, i10, -z60Var.f30755g0, this.f27174b, this.f27175c, this.d, this.e, this.f27176f, f6Var);
                return;
            default:
                jv0 jv0Var = ((tt0) this.h).f28441f;
                m01.b(jv0Var.getContext(), jv0Var.f25528v1.getCurrentAccount(), jv0Var.f25503j1, this.f27174b, this.f27175c, this.d, this.e, this.f27176f, jv0Var.F1);
                return;
        }
    }
}
