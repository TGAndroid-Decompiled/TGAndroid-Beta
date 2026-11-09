package org.telegram.ui.Components;

import android.view.View;
public final class ot implements Runnable {
    public final int f36799a;
    public final View f36800b;

    public ot(int i7, View view) {
        this.f36799a = i7;
        this.f36800b = view;
    }

    @Override
    public final void run() {
        switch (this.f36799a) {
            case 0:
                this.f36800b.callOnClick();
                return;
            default:
                this.f36800b.invalidate();
                return;
        }
    }
}
