package org.telegram.ui;

import android.content.Context;
public final class n10 extends org.telegram.ui.Components.a10 {
    public final int U;
    public final Object V;

    public n10(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((z10) this.V).f39183s;
            default:
                return ((x10) this.V).d.f39183s;
        }
    }
}
