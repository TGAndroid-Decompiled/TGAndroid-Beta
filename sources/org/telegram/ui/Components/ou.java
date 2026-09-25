package org.telegram.ui.Components;

import android.view.View;
public final class ou implements Runnable {
    public final int f27193a;
    public final View f27194b;

    public ou(int i10, View view) {
        this.f27193a = i10;
        this.f27194b = view;
    }

    @Override
    public final void run() {
        switch (this.f27193a) {
            case 0:
                this.f27194b.callOnClick();
                return;
            default:
                this.f27194b.invalidate();
                return;
        }
    }
}
