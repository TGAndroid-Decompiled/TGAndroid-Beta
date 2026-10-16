package org.telegram.ui.Components;

import android.view.View;
public final class zu implements Runnable {
    public final int f31687a;
    public final View f31688b;

    public zu(int i10, View view) {
        this.f31687a = i10;
        this.f31688b = view;
    }

    @Override
    public final void run() {
        switch (this.f31687a) {
            case 0:
                this.f31688b.callOnClick();
                return;
            default:
                this.f31688b.invalidate();
                return;
        }
    }
}
