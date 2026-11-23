package org.telegram.ui.Components;

import android.content.Context;
public final class rw extends v4.d0 {
    public final int f39355r;

    public rw(Context context, int i7) {
        super(context);
        this.f39355r = i7;
    }

    @Override
    public final int i(int i7, int i10, int i11, int i12, int i13) {
        return super.i(i7, i10, i11, i12, i13) + this.f39355r;
    }

    @Override
    public final int m(int i7) {
        return super.m(i7) * 16;
    }

    @Override
    public final int p() {
        return -1;
    }
}
