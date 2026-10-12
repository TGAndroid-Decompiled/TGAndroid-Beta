package org.telegram.ui;

import android.content.Context;
public final class m10 extends org.telegram.ui.Components.m10 {
    public final int U;
    public final Object V;

    public m10(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((y10) this.V).f44265s;
            default:
                return ((w10) this.V).d.f44265s;
        }
    }
}
