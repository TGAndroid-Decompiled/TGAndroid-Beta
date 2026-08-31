package org.telegram.ui.Components;

import android.view.View;
public final class ju implements Runnable {
    public final int f28204a;
    public final View f28205b;

    public ju(int i10, View view) {
        this.f28204a = i10;
        this.f28205b = view;
    }

    @Override
    public final void run() {
        switch (this.f28204a) {
            case 0:
                this.f28205b.callOnClick();
                return;
            default:
                this.f28205b.invalidate();
                return;
        }
    }
}
