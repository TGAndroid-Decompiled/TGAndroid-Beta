package org.telegram.ui.Components;

import android.view.View;
public final class uu implements Runnable {
    public final int f31013a;
    public final View f31014b;

    public uu(int i10, View view) {
        this.f31013a = i10;
        this.f31014b = view;
    }

    @Override
    public final void run() {
        switch (this.f31013a) {
            case 0:
                this.f31014b.callOnClick();
                return;
            default:
                this.f31014b.invalidate();
                return;
        }
    }
}
