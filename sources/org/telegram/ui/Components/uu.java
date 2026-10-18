package org.telegram.ui.Components;

import android.view.View;
public final class uu implements Runnable {
    public final int f31093a;
    public final View f31094b;

    public uu(int i10, View view) {
        this.f31093a = i10;
        this.f31094b = view;
    }

    @Override
    public final void run() {
        switch (this.f31093a) {
            case 0:
                this.f31094b.callOnClick();
                return;
            default:
                this.f31094b.invalidate();
                return;
        }
    }
}
