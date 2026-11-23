package org.telegram.ui;

import android.content.Context;
public final class pz extends org.telegram.ui.Components.vz {
    public final int V;
    public final Object W;

    public pz(int i7, Context context, Object obj) {
        super(context, null);
        this.V = i7;
        this.W = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.V) {
            case 0:
                return ((b00) this.W).f45867s;
            default:
                return ((zz) this.W).d.f45867s;
        }
    }
}
