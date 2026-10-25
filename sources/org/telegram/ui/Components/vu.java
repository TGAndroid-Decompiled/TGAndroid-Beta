package org.telegram.ui.Components;

import android.view.View;
public final class vu implements Runnable {
    public final int f34258a;
    public final View f34259b;

    public vu(int i10, View view) {
        this.f34258a = i10;
        this.f34259b = view;
    }

    @Override
    public final void run() {
        switch (this.f34258a) {
            case 0:
                this.f34259b.callOnClick();
                return;
            default:
                this.f34259b.invalidate();
                return;
        }
    }
}
