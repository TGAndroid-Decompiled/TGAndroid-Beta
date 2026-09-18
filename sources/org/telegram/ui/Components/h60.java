package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h60 implements View.OnClickListener {
    public final int f24505a;
    public final TLRPC.User f24506b;
    public final String f24507c;
    public final boolean d;
    public final boolean e;
    public final boolean f24508f;
    public final ll0 h;

    public h60(ll0 ll0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24505a = i10;
        this.h = ll0Var;
        this.f24506b = user;
        this.f24507c = str;
        this.d = z10;
        this.e = z11;
        this.f24508f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f24505a) {
            case 0:
                r60 r60Var = ((m60) this.h).f26091c;
                Context context = r60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.g3) r60Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.g3) r60Var).resourcesProvider;
                c01.b(context, i10, -r60Var.f27552g0, this.f24506b, this.f24507c, this.d, this.e, this.f24508f, f6Var);
                return;
            default:
                zu0 zu0Var = ((jt0) this.h).f25432f;
                c01.b(zu0Var.getContext(), zu0Var.f30659v1.getCurrentAccount(), zu0Var.f30634j1, this.f24506b, this.f24507c, this.d, this.e, this.f24508f, zu0Var.F1);
                return;
        }
    }
}
