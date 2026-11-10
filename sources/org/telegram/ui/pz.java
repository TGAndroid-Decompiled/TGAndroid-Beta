package org.telegram.ui;

import android.content.Context;
public final class pz extends org.telegram.ui.Components.lz {
    public final int U;
    public final Object V;

    public pz(int i7, Context context, Object obj) {
        super(context, null);
        this.U = i7;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((b00) this.V).f43884s;
            default:
                return ((zz) this.V).d.f43884s;
        }
    }
}
