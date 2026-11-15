package org.telegram.ui.Components;

import android.content.Context;
public final class jw extends v4.c0 {
    public final int f36182r;

    public jw(Context context, int i7) {
        super(context);
        this.f36182r = i7;
    }

    @Override
    public final int i(int i7, int i10, int i11, int i12, int i13) {
        return super.i(i7, i10, i11, i12, i13) + this.f36182r;
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
