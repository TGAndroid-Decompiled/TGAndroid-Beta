package org.telegram.ui.Components;

import android.content.Context;
public final class tw extends f2.n0 {
    public final int f32826r;

    public tw(Context context, int i9) {
        super(context);
        this.f32826r = i9;
    }

    @Override
    public final int i(int i9, int i10, int i11, int i12, int i13) {
        return super.i(i9, i10, i11, i12, i13) + this.f32826r;
    }

    @Override
    public final int m(int i9) {
        return super.m(i9) * 16;
    }

    @Override
    public final int p() {
        return -1;
    }
}
