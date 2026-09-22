package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h60 implements View.OnClickListener {
    public final int f24524a;
    public final TLRPC.User f24525b;
    public final String f24526c;
    public final boolean d;
    public final boolean e;
    public final boolean f24527f;
    public final kl0 h;

    public h60(kl0 kl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24524a = i10;
        this.h = kl0Var;
        this.f24525b = user;
        this.f24526c = str;
        this.d = z10;
        this.e = z11;
        this.f24527f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.f24524a) {
            case 0:
                r60 r60Var = ((m60) this.h).f26106c;
                Context context = r60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) r60Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.f3) r60Var).resourcesProvider;
                b01.b(context, i10, -r60Var.f27565g0, this.f24525b, this.f24526c, this.d, this.e, this.f24527f, e6Var);
                return;
            default:
                yu0 yu0Var = ((it0) this.h).f25133f;
                b01.b(yu0Var.getContext(), yu0Var.f30389v1.getCurrentAccount(), yu0Var.f30364j1, this.f24525b, this.f24526c, this.d, this.e, this.f24527f, yu0Var.F1);
                return;
        }
    }
}
