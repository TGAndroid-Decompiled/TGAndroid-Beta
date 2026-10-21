package org.telegram.ui.Components;

import android.view.View;
public final class uu implements Runnable {
    public final int f31014a;
    public final View f31015b;

    public uu(int i10, View view) {
        this.f31014a = i10;
        this.f31015b = view;
    }

    @Override
    public final void run() {
        switch (this.f31014a) {
            case 0:
                this.f31015b.callOnClick();
                return;
            default:
                this.f31015b.invalidate();
                return;
        }
    }
}
