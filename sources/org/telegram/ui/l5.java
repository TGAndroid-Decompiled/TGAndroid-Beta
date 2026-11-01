package org.telegram.ui;

import android.content.Context;
public final class l5 extends org.telegram.ui.Cells.b5 {
    public final int f39080f;

    public l5(Context context, int i10) {
        super(context);
        this.f39080f = i10;
    }

    @Override
    public final int getFullHeight() {
        switch (this.f39080f) {
            case 0:
                return org.telegram.messenger.i0.L(50.0f);
            default:
                return org.telegram.messenger.i0.L(50.0f);
        }
    }
}
