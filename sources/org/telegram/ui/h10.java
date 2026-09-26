package org.telegram.ui;

import android.content.Context;
public final class h10 extends org.telegram.ui.Components.v00 {
    public final int U;
    public final Object V;

    public h10(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((t10) this.V).f37941s;
            default:
                return ((r10) this.V).d.f37941s;
        }
    }
}
