package org.telegram.ui;

import android.content.Context;
public final class h10 extends org.telegram.ui.Components.u00 {
    public final int R;
    public final Object S;

    public h10(Object obj, Context context, int i10) {
        super(context, null);
        this.R = i10;
        this.S = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.R) {
            case 0:
                return ((t10) this.S).f41376s;
            default:
                return ((r10) this.S).d.f41376s;
        }
    }
}
