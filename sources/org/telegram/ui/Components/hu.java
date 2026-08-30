package org.telegram.ui.Components;

import android.view.View;
public final class hu implements Runnable {
    public final int f25489a;
    public final View f25490b;

    public hu(int i10, View view) {
        this.f25489a = i10;
        this.f25490b = view;
    }

    @Override
    public final void run() {
        switch (this.f25489a) {
            case 0:
                this.f25490b.callOnClick();
                return;
            default:
                this.f25490b.invalidate();
                return;
        }
    }
}
