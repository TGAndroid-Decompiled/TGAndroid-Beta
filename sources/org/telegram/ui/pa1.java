package org.telegram.ui;

import android.content.Context;
public final class pa1 extends ba1 {
    public final int v;
    public final int f36074w;
    public int f36075x;
    public org.telegram.ui.Components.r51 f36076y;

    public pa1(Context context, int i10, int i11, ig.f fVar, int i12) {
        super(context, i11, fVar, null);
        this.v = i10;
        this.f36074w = i12;
    }

    @Override
    public final void b(da1 da1Var) {
        int i10;
        if (da1Var != null && (i10 = this.f36075x) >= 0) {
            da1Var.a(this.v, this.f36074w, i10, this.f36076y);
        }
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f() {
    }
}
