package org.telegram.ui;

import android.content.Context;
public final class nz extends org.telegram.ui.Components.pz {
    public final int V;
    public final Object W;

    public nz(int i7, Context context, Object obj) {
        super(context, null);
        this.V = i7;
        this.W = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.V) {
            case 0:
                return ((zz) this.W).f54097s;
            default:
                return ((xz) this.W).d.f54097s;
        }
    }
}
