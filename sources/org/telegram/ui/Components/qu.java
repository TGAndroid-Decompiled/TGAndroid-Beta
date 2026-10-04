package org.telegram.ui.Components;

import android.view.View;
public final class qu implements Runnable {
    public final int f30171a;
    public final View f30172b;

    public qu(int i10, View view) {
        this.f30171a = i10;
        this.f30172b = view;
    }

    @Override
    public final void run() {
        switch (this.f30171a) {
            case 0:
                this.f30172b.callOnClick();
                return;
            default:
                this.f30172b.invalidate();
                return;
        }
    }
}
