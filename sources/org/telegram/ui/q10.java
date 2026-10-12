package org.telegram.ui;

import android.content.Context;
public final class q10 extends org.telegram.ui.Components.f10 {
    public final int U;
    public final Object V;

    public q10(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((c20) this.V).f34702s;
            default:
                return ((a20) this.V).d.f34702s;
        }
    }
}
