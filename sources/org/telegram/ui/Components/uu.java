package org.telegram.ui.Components;

import android.view.View;
public final class uu implements Runnable {
    public final int f31086a;
    public final View f31087b;

    public uu(int i10, View view) {
        this.f31086a = i10;
        this.f31087b = view;
    }

    @Override
    public final void run() {
        switch (this.f31086a) {
            case 0:
                this.f31087b.callOnClick();
                return;
            default:
                this.f31087b.invalidate();
                return;
        }
    }
}
