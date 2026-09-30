package org.telegram.ui.Components;

import android.view.View;
public final class pu implements Runnable {
    public final int f27421a;
    public final View f27422b;

    public pu(int i10, View view) {
        this.f27421a = i10;
        this.f27422b = view;
    }

    @Override
    public final void run() {
        switch (this.f27421a) {
            case 0:
                this.f27422b.callOnClick();
                return;
            default:
                this.f27422b.invalidate();
                return;
        }
    }
}
