package org.telegram.ui;

import android.content.Context;
public final class m5 extends org.telegram.ui.Cells.x4 {
    public final int h;

    public m5(Context context, int i7) {
        super(context);
        this.h = i7;
    }

    @Override
    public final int getFullHeight() {
        switch (this.h) {
            case 0:
                return org.telegram.messenger.g0.L(50.0f);
            default:
                return org.telegram.messenger.g0.L(50.0f);
        }
    }
}
