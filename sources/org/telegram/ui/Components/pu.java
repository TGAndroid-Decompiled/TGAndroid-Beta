package org.telegram.ui.Components;

import android.view.View;
public final class pu implements Runnable {
    public final int f27419a;
    public final View f27420b;

    public pu(int i10, View view) {
        this.f27419a = i10;
        this.f27420b = view;
    }

    @Override
    public final void run() {
        switch (this.f27419a) {
            case 0:
                this.f27420b.callOnClick();
                return;
            default:
                this.f27420b.invalidate();
                return;
        }
    }
}
