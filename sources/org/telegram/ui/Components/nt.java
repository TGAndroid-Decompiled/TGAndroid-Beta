package org.telegram.ui.Components;

import android.view.View;
public final class nt implements Runnable {
    public final int f36422a;
    public final View f36423b;

    public nt(int i7, View view) {
        this.f36422a = i7;
        this.f36423b = view;
    }

    @Override
    public final void run() {
        switch (this.f36422a) {
            case 0:
                this.f36423b.callOnClick();
                return;
            default:
                this.f36423b.invalidate();
                return;
        }
    }
}
