package org.telegram.ui.Components;

import android.view.View;
public final class zu implements Runnable {
    public final int f31985a;
    public final View f31986b;

    public zu(int i10, View view) {
        this.f31985a = i10;
        this.f31986b = view;
    }

    @Override
    public final void run() {
        switch (this.f31985a) {
            case 0:
                this.f31986b.callOnClick();
                return;
            default:
                this.f31986b.invalidate();
                return;
        }
    }
}
