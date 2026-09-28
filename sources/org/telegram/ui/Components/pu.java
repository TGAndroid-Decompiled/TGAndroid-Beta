package org.telegram.ui.Components;

import android.view.View;
public final class pu implements Runnable {
    public final int f27420a;
    public final View f27421b;

    public pu(int i10, View view) {
        this.f27420a = i10;
        this.f27421b = view;
    }

    @Override
    public final void run() {
        switch (this.f27420a) {
            case 0:
                this.f27421b.callOnClick();
                return;
            default:
                this.f27421b.invalidate();
                return;
        }
    }
}
