package org.telegram.ui.Components;

import android.content.Context;
public final class fx extends f2.j0 {
    public final int f24974r;

    public fx(Context context, int i10) {
        super(context);
        this.f24974r = i10;
    }

    @Override
    public final int i(int i10, int i11, int i12, int i13, int i14) {
        return super.i(i10, i11, i12, i13, i14) + this.f24974r;
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
