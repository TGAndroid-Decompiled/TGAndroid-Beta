package org.telegram.ui;

import android.content.Context;
public final class l10 extends org.telegram.ui.Components.t00 {
    public final int U;
    public final Object V;

    public l10(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((x10) this.V).f42559s;
            default:
                return ((v10) this.V).d.f42559s;
        }
    }
}
