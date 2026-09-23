package org.telegram.ui;

import android.content.Context;
public final class i10 extends org.telegram.ui.Components.u00 {
    public final int U;
    public final Object V;

    public i10(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((u10) this.V).f37867s;
            default:
                return ((s10) this.V).d.f37867s;
        }
    }
}
