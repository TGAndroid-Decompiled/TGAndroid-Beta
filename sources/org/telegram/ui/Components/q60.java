package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q60 implements View.OnClickListener {
    public final int f26327a;
    public final TLRPC.User f26328b;
    public final String f26329c;
    public final boolean d;
    public final boolean e;
    public final boolean f26330f;
    public final ul0 h;

    public q60(ul0 ul0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f26327a = i10;
        this.h = ul0Var;
        this.f26328b = user;
        this.f26329c = str;
        this.d = z10;
        this.e = z11;
        this.f26330f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f26327a) {
            case 0:
                a70 a70Var = ((v60) this.h).f27846c;
                Context context = a70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.h3) a70Var).resourcesProvider;
                n01.b(context, i10, -a70Var.f21406g0, this.f26328b, this.f26329c, this.d, this.e, this.f26330f, f6Var);
                return;
            default:
                iv0 iv0Var = ((rt0) this.h).f26752f;
                n01.b(iv0Var.getContext(), iv0Var.f24131v1.getCurrentAccount(), iv0Var.f24106j1, this.f26328b, this.f26329c, this.d, this.e, this.f26330f, iv0Var.F1);
                return;
        }
    }
}
