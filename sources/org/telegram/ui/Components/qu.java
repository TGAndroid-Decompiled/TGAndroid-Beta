package org.telegram.ui.Components;

import android.view.View;
public final class qu implements Runnable {
    public final int f30170a;
    public final View f30171b;

    public qu(int i10, View view) {
        this.f30170a = i10;
        this.f30171b = view;
    }

    @Override
    public final void run() {
        switch (this.f30170a) {
            case 0:
                this.f30171b.callOnClick();
                return;
            default:
                this.f30171b.invalidate();
                return;
        }
    }
}
