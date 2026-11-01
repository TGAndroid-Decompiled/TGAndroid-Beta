package org.telegram.ui;

import android.content.Context;
public final class m00 extends org.telegram.ui.Components.zz {
    public final int U;
    public final Object V;

    public m00(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.U) {
            case 0:
                return ((y00) this.V).f43519s;
            default:
                return ((w00) this.V).d.f43519s;
        }
    }
}
