package org.telegram.ui;

import android.content.Context;
public final class k10 extends org.telegram.ui.Components.v00 {
    public final int U;
    public final Object V;

    public k10(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((w10) this.V).f38778s;
            default:
                return ((u10) this.V).d.f38778s;
        }
    }
}
