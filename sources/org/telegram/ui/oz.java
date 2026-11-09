package org.telegram.ui;

import android.content.Context;
public final class oz extends org.telegram.ui.Components.mz {
    public final int U;
    public final Object V;

    public oz(int i7, Context context, Object obj) {
        super(context, null);
        this.U = i7;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((a00) this.V).f43534s;
            default:
                return ((yz) this.V).d.f43534s;
        }
    }
}
