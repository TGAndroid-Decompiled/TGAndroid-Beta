package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class v60 implements View.OnClickListener {
    public final int f29049a;
    public final TLRPC.User f29050b;
    public final String f29051c;
    public final boolean d;
    public final boolean e;
    public final boolean f29052f;
    public final yl0 h;

    public v60(yl0 yl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f29049a = i10;
        this.h = yl0Var;
        this.f29050b = user;
        this.f29051c = str;
        this.d = z10;
        this.e = z11;
        this.f29052f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.f29049a) {
            case 0:
                f70 f70Var = ((a70) this.h).f22577c;
                Context context = f70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) f70Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.e3) f70Var).resourcesProvider;
                o01.b(context, i10, -f70Var.f24233g0, this.f29050b, this.f29051c, this.d, this.e, this.f29052f, d6Var);
                return;
            default:
                mv0 mv0Var = ((wt0) this.h).f30056f;
                o01.b(mv0Var.getContext(), mv0Var.f26449v1.getCurrentAccount(), mv0Var.f26424j1, this.f29050b, this.f29051c, this.d, this.e, this.f29052f, mv0Var.F1);
                return;
        }
    }
}
