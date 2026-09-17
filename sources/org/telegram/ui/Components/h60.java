package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h60 implements View.OnClickListener {
    public final int f24502a;
    public final TLRPC.User f24503b;
    public final String f24504c;
    public final boolean d;
    public final boolean e;
    public final boolean f24505f;
    public final ll0 h;

    public h60(ll0 ll0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24502a = i10;
        this.h = ll0Var;
        this.f24503b = user;
        this.f24504c = str;
        this.d = z10;
        this.e = z11;
        this.f24505f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f24502a) {
            case 0:
                r60 r60Var = ((m60) this.h).f26088c;
                Context context = r60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.g3) r60Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.g3) r60Var).resourcesProvider;
                c01.b(context, i10, -r60Var.f27549g0, this.f24503b, this.f24504c, this.d, this.e, this.f24505f, f6Var);
                return;
            default:
                zu0 zu0Var = ((jt0) this.h).f25429f;
                c01.b(zu0Var.getContext(), zu0Var.f30656v1.getCurrentAccount(), zu0Var.f30631j1, this.f24503b, this.f24504c, this.d, this.e, this.f24505f, zu0Var.F1);
                return;
        }
    }
}
