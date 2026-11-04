package org.telegram.ui;

import android.content.Context;
public final class o5 extends org.telegram.ui.Cells.x4 {
    public final int f48187f;

    public o5(Context context, int i3) {
        super(context);
        this.f48187f = i3;
    }

    @Override
    public final int getFullHeight() {
        switch (this.f48187f) {
            case 0:
                return org.telegram.messenger.g0.L(50.0f);
            default:
                return org.telegram.messenger.g0.L(50.0f);
        }
    }
}
