package org.telegram.ui.Components;

import android.view.View;
public final class nt implements Runnable {
    public final int f36383a;
    public final View f36384b;

    public nt(int i7, View view) {
        this.f36383a = i7;
        this.f36384b = view;
    }

    @Override
    public final void run() {
        switch (this.f36383a) {
            case 0:
                this.f36384b.callOnClick();
                return;
            default:
                this.f36384b.invalidate();
                return;
        }
    }
}
