package org.telegram.ui;

import android.content.Context;
public final class p10 extends org.telegram.ui.Components.f10 {
    public final int U;
    public final Object V;

    public p10(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((b20) this.V).f34184s;
            default:
                return ((z10) this.V).d.f34184s;
        }
    }
}
