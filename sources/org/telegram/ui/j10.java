package org.telegram.ui;

import android.content.Context;
public final class j10 extends org.telegram.ui.Components.k10 {
    public final int U;
    public final Object V;

    public j10(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((v10) this.V).f42886s;
            default:
                return ((t10) this.V).d.f42886s;
        }
    }
}
