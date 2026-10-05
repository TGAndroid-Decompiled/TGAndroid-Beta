package org.telegram.ui.Components;

import android.view.View;
public final class qu implements Runnable {
    public final int f30204a;
    public final View f30205b;

    public qu(int i10, View view) {
        this.f30204a = i10;
        this.f30205b = view;
    }

    @Override
    public final void run() {
        switch (this.f30204a) {
            case 0:
                this.f30205b.callOnClick();
                return;
            default:
                this.f30205b.invalidate();
                return;
        }
    }
}
