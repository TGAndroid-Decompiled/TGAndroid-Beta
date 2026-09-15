package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class h60 implements View.OnClickListener {
    public final int f24521a;
    public final TLRPC.User f24522b;
    public final String f24523c;
    public final boolean d;
    public final boolean e;
    public final boolean f24524f;
    public final kl0 h;

    public h60(kl0 kl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24521a = i10;
        this.h = kl0Var;
        this.f24522b = user;
        this.f24523c = str;
        this.d = z10;
        this.e = z11;
        this.f24524f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.f24521a) {
            case 0:
                r60 r60Var = ((m60) this.h).f26107c;
                Context context = r60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) r60Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.f3) r60Var).resourcesProvider;
                b01.b(context, i10, -r60Var.f27568g0, this.f24522b, this.f24523c, this.d, this.e, this.f24524f, e6Var);
                return;
            default:
                yu0 yu0Var = ((it0) this.h).f25136f;
                b01.b(yu0Var.getContext(), yu0Var.f30392v1.getCurrentAccount(), yu0Var.f30367j1, this.f24522b, this.f24523c, this.d, this.e, this.f24524f, yu0Var.F1);
                return;
        }
    }
}
