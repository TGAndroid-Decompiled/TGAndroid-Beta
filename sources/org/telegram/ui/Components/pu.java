package org.telegram.ui.Components;

import android.view.View;
public final class pu implements Runnable {
    public final int f27497a;
    public final View f27498b;

    public pu(int i10, View view) {
        this.f27497a = i10;
        this.f27498b = view;
    }

    @Override
    public final void run() {
        switch (this.f27497a) {
            case 0:
                this.f27498b.callOnClick();
                return;
            default:
                this.f27498b.invalidate();
                return;
        }
    }
}
