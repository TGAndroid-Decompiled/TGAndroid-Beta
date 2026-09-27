package org.telegram.ui.Components;

import android.view.View;
public final class pu implements Runnable {
    public final int f27462a;
    public final View f27463b;

    public pu(int i10, View view) {
        this.f27462a = i10;
        this.f27463b = view;
    }

    @Override
    public final void run() {
        switch (this.f27462a) {
            case 0:
                this.f27463b.callOnClick();
                return;
            default:
                this.f27463b.invalidate();
                return;
        }
    }
}
