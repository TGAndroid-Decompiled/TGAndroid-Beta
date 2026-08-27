package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class v50 implements View.OnClickListener {

    public final int f33270a;

    public final TLRPC.User f33271b;

    public final String f33272c;
    public final boolean d;

    public final boolean f33273e;

    public final boolean f33274f;
    public final yk0 h;

    public v50(yk0 yk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f33270a = i10;
        this.h = yk0Var;
        this.f33271b = user;
        this.f33272c = str;
        this.d = z10;
        this.f33273e = z11;
        this.f33274f = z12;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33270a) {
            case 0:
                f60 f60Var = ((a60) this.h).f26642c;
                kz0.b(f60Var.getContext(), ((org.telegram.ui.ActionBar.e3) f60Var).currentAccount, -f60Var.f28274c0, this.f33271b, this.f33272c, this.d, this.f33273e, this.f33274f, ((org.telegram.ui.ActionBar.e3) f60Var).resourcesProvider);
                break;
            default:
                hu0 hu0Var = ((qs0) this.h).f31971f;
                kz0.b(hu0Var.getContext(), hu0Var.f29145r1.getCurrentAccount(), hu0Var.f29121f1, this.f33271b, this.f33272c, this.d, this.f33273e, this.f33274f, hu0Var.B1);
                break;
        }
    }
}
