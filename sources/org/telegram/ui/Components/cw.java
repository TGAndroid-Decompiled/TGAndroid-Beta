package org.telegram.ui.Components;

import android.content.Context;
public final class cw extends u4.c0 {
    public final int f32846r;

    public cw(Context context, int i3) {
        super(context);
        this.f32846r = i3;
    }

    @Override
    public final int i(int i3, int i10, int i11, int i12, int i13) {
        return super.i(i3, i10, i11, i12, i13) + this.f32846r;
    }

    @Override
    public final int m(int i3) {
        return super.m(i3) * 16;
    }

    @Override
    public final int p() {
        return -1;
    }
}
