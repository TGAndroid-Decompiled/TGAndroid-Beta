package org.telegram.ui;

import android.content.Context;
public final class i10 extends org.telegram.ui.Components.u00 {
    public final int R;
    public final Object S;

    public i10(Object obj, Context context, int i10) {
        super(context, null);
        this.R = i10;
        this.S = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.R) {
            case 0:
                return ((u10) this.S).f38658s;
            default:
                return ((s10) this.S).d.f38658s;
        }
    }
}
