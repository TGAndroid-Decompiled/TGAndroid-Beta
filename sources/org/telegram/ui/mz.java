package org.telegram.ui;

import android.content.Context;
public final class mz extends org.telegram.ui.Components.lz {
    public final int U;
    public final Object V;

    public mz(int i7, Context context, Object obj) {
        super(context, null);
        this.U = i7;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((yz) this.V).f52404s;
            default:
                return ((wz) this.V).d.f52404s;
        }
    }
}
