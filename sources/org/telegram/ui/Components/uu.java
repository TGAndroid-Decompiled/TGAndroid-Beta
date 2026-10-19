package org.telegram.ui.Components;

import android.view.View;
public final class uu implements Runnable {
    public final int f31059a;
    public final View f31060b;

    public uu(int i10, View view) {
        this.f31059a = i10;
        this.f31060b = view;
    }

    @Override
    public final void run() {
        switch (this.f31059a) {
            case 0:
                this.f31060b.callOnClick();
                return;
            default:
                this.f31060b.invalidate();
                return;
        }
    }
}
