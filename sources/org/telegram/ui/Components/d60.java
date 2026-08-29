package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class d60 implements View.OnClickListener {
    public final int f27673a;
    public final TLRPC.User f27674b;
    public final String f27675c;
    public final boolean d;
    public final boolean f27676e;
    public final boolean f27677f;
    public final il0 h;

    public d60(il0 il0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f27673a = i10;
        this.h = il0Var;
        this.f27674b = user;
        this.f27675c = str;
        this.d = z10;
        this.f27676e = z11;
        this.f27677f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.f27673a) {
            case 0:
                n60 n60Var = ((i60) this.h).f29327c;
                Context context = n60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) n60Var).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.f3) n60Var).resourcesProvider;
                uz0.b(context, i10, -n60Var.f30888c0, this.f27674b, this.f27675c, this.d, this.f27676e, this.f27677f, c6Var);
                return;
            default:
                qu0 qu0Var = ((zs0) this.h).f35413f;
                uz0.b(qu0Var.getContext(), qu0Var.f32093r1.getCurrentAccount(), qu0Var.f32069f1, this.f27674b, this.f27675c, this.d, this.f27676e, this.f27677f, qu0Var.B1);
                return;
        }
    }
}
