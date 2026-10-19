package org.telegram.ui.Components;

import android.view.View;
public final class uu implements Runnable {
    public final int f31061a;
    public final View f31062b;

    public uu(int i10, View view) {
        this.f31061a = i10;
        this.f31062b = view;
    }

    @Override
    public final void run() {
        switch (this.f31061a) {
            case 0:
                this.f31062b.callOnClick();
                return;
            default:
                this.f31062b.invalidate();
                return;
        }
    }
}
