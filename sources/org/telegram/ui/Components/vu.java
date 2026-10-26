package org.telegram.ui.Components;

import android.view.View;
public final class vu implements Runnable {
    public final int f34261a;
    public final View f34262b;

    public vu(int i10, View view) {
        this.f34261a = i10;
        this.f34262b = view;
    }

    @Override
    public final void run() {
        switch (this.f34261a) {
            case 0:
                this.f34262b.callOnClick();
                return;
            default:
                this.f34262b.invalidate();
                return;
        }
    }
}
