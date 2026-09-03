package org.telegram.ui.Components;

import android.view.View;
public final class ju implements Runnable {
    public final int f28180a;
    public final View f28181b;

    public ju(int i10, View view) {
        this.f28180a = i10;
        this.f28181b = view;
    }

    @Override
    public final void run() {
        switch (this.f28180a) {
            case 0:
                this.f28181b.callOnClick();
                return;
            default:
                this.f28181b.invalidate();
                return;
        }
    }
}
