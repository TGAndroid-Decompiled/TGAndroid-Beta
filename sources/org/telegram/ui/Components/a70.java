package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a70 implements View.OnClickListener {
    public final int f24640a;
    public final TLRPC.User f24641b;
    public final String f24642c;
    public final boolean d;
    public final boolean e;
    public final boolean f24643f;
    public final km0 h;

    public a70(km0 km0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.f24640a = i10;
        this.h = km0Var;
        this.f24641b = user;
        this.f24642c = str;
        this.d = z10;
        this.e = z11;
        this.f24643f = z12;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        switch (this.f24640a) {
            case 0:
                k70 k70Var = ((f70) this.h).f26217c;
                Context context = k70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.h3) k70Var).currentAccount;
                g6Var = ((org.telegram.ui.ActionBar.h3) k70Var).resourcesProvider;
                z01.b(context, i10, -k70Var.f27918g0, this.f24641b, this.f24642c, this.d, this.e, this.f24643f, g6Var);
                return;
            default:
                wv0 wv0Var = ((gu0) this.h).f26792f;
                z01.b(wv0Var.getContext(), wv0Var.f32410v1.getCurrentAccount(), wv0Var.f32385j1, this.f24641b, this.f24642c, this.d, this.e, this.f24643f, wv0Var.F1);
                return;
        }
    }
}
