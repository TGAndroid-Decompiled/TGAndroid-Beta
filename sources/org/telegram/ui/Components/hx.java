package org.telegram.ui.Components;

import android.content.Context;
public final class hx extends f2.k0 {
    public final int f27644r;

    public hx(Context context, int i10) {
        super(context);
        this.f27644r = i10;
    }

    @Override
    public final int i(int i10, int i11, int i12, int i13, int i14) {
        return super.i(i10, i11, i12, i13, i14) + this.f27644r;
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 16;
    }

    @Override
    public final int p() {
        return -1;
    }
}
