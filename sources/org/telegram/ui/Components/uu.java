package org.telegram.ui.Components;

import android.view.View;
public final class uu implements Runnable {
    public final int f31216a;
    public final View f31217b;

    public uu(int i10, View view) {
        this.f31216a = i10;
        this.f31217b = view;
    }

    @Override
    public final void run() {
        switch (this.f31216a) {
            case 0:
                this.f31217b.callOnClick();
                return;
            default:
                this.f31217b.invalidate();
                return;
        }
    }
}
