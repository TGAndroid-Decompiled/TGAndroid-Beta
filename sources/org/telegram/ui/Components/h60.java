package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h60 implements View.OnClickListener {
    public final int f26642a;
    public final TLRPC.User f26643b;
    public final String f26644c;
    public final boolean d;
    public final boolean f26645e;
    public final boolean f26646f;
    public final kl0 h;

    public h60(kl0 kl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f26642a = i10;
        this.h = kl0Var;
        this.f26643b = user;
        this.f26644c = str;
        this.d = z10;
        this.f26645e = z11;
        this.f26646f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f26642a) {
            case 0:
                r60 r60Var = ((m60) this.h).f28421c;
                Context context = r60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) r60Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.f3) r60Var).resourcesProvider;
                a01.b(context, i10, -r60Var.f29978g0, this.f26643b, this.f26644c, this.d, this.f26645e, this.f26646f, f6Var);
                return;
            default:
                xu0 xu0Var = ((ht0) this.h).f26874f;
                a01.b(xu0Var.getContext(), xu0Var.f32754v1.getCurrentAccount(), xu0Var.f32729j1, this.f26643b, this.f26644c, this.d, this.f26645e, this.f26646f, xu0Var.F1);
                return;
        }
    }
}
