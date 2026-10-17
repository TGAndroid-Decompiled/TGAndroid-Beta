package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b70 implements View.OnClickListener {
    public final int f24824a;
    public final TLRPC.User f24825b;
    public final String f24826c;
    public final boolean d;
    public final boolean e;
    public final boolean f24827f;
    public final hm0 h;

    public b70(hm0 hm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24824a = i10;
        this.h = hm0Var;
        this.f24825b = user;
        this.f24826c = str;
        this.d = z10;
        this.e = z11;
        this.f24827f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f24824a) {
            case 0:
                l70 l70Var = ((g70) this.h).f26492c;
                Context context = l70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.f3) l70Var).resourcesProvider;
                v01.b(context, i10, -l70Var.f28125g0, this.f24825b, this.f24826c, this.d, this.e, this.f24827f, d6Var);
                return;
            default:
                sv0 sv0Var = ((cu0) this.h).f25370f;
                v01.b(sv0Var.getContext(), sv0Var.f30388v1.getCurrentAccount(), sv0Var.f30363j1, this.f24825b, this.f24826c, this.d, this.e, this.f24827f, sv0Var.F1);
                return;
        }
    }
}
