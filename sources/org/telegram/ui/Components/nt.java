package org.telegram.ui.Components;

import android.view.View;
public final class nt implements Runnable {
    public final int f36489a;
    public final View f36490b;

    public nt(int i7, View view) {
        this.f36489a = i7;
        this.f36490b = view;
    }

    @Override
    public final void run() {
        switch (this.f36489a) {
            case 0:
                this.f36490b.callOnClick();
                return;
            default:
                this.f36490b.invalidate();
                return;
        }
    }
}
