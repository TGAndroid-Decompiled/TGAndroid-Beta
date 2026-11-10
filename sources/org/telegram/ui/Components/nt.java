package org.telegram.ui.Components;

import android.view.View;
public final class nt implements Runnable {
    public final int f36390a;
    public final View f36391b;

    public nt(int i7, View view) {
        this.f36390a = i7;
        this.f36391b = view;
    }

    @Override
    public final void run() {
        switch (this.f36390a) {
            case 0:
                this.f36391b.callOnClick();
                return;
            default:
                this.f36391b.invalidate();
                return;
        }
    }
}
