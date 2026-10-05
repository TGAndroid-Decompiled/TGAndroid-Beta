package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v60 implements View.OnClickListener {
    public final int f31671a;
    public final TLRPC.User f31672b;
    public final String f31673c;
    public final boolean d;
    public final boolean f31674e;
    public final boolean f31675f;
    public final yl0 h;

    public v60(yl0 yl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f31671a = i10;
        this.h = yl0Var;
        this.f31672b = user;
        this.f31673c = str;
        this.d = z10;
        this.f31674e = z11;
        this.f31675f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f31671a) {
            case 0:
                f70 f70Var = ((a70) this.h).f24510c;
                Context context = f70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) f70Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.f3) f70Var).resourcesProvider;
                x01.b(context, i10, -f70Var.f26411g0, this.f31672b, this.f31673c, this.d, this.f31674e, this.f31675f, d6Var);
                return;
            default:
                qv0 qv0Var = ((au0) this.h).f24735f;
                x01.b(qv0Var.getContext(), qv0Var.f30263v1.getCurrentAccount(), qv0Var.f30238j1, this.f31672b, this.f31673c, this.d, this.f31674e, this.f31675f, qv0Var.F1);
                return;
        }
    }
}
