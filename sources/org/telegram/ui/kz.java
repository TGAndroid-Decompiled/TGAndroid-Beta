package org.telegram.ui;

import android.content.Context;
public final class kz extends org.telegram.ui.Components.iz {
    public final int V;
    public final Object W;

    public kz(int i3, Context context, Object obj) {
        super(context, null);
        this.V = i3;
        this.W = obj;
    }

    @Override
    public final int getColumnsCount() {
        switch (this.V) {
            case 0:
                return ((wz) this.W).f51660s;
            default:
                return ((uz) this.W).d.f51660s;
        }
    }
}
