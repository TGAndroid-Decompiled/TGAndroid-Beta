package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b70 implements View.OnClickListener {
    public final int f24823a;
    public final TLRPC.User f24824b;
    public final String f24825c;
    public final boolean d;
    public final boolean e;
    public final boolean f24826f;
    public final im0 h;

    public b70(im0 im0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24823a = i10;
        this.h = im0Var;
        this.f24824b = user;
        this.f24825c = str;
        this.d = z10;
        this.e = z11;
        this.f24826f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f24823a) {
            case 0:
                l70 l70Var = ((g70) this.h).f26524c;
                Context context = l70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.f3) l70Var).resourcesProvider;
                x01.b(context, i10, -l70Var.f28080g0, this.f24824b, this.f24825c, this.d, this.e, this.f24826f, d6Var);
                return;
            default:
                uv0 uv0Var = ((eu0) this.h).f25974f;
                x01.b(uv0Var.getContext(), uv0Var.f31075v1.getCurrentAccount(), uv0Var.f31050j1, this.f24824b, this.f24825c, this.d, this.e, this.f24826f, uv0Var.F1);
                return;
        }
    }
}
