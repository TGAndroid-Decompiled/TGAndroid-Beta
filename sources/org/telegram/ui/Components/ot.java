package org.telegram.ui.Components;

import android.view.View;
public final class ot implements Runnable {
    public final int f36693a;
    public final View f36694b;

    public ot(int i7, View view) {
        this.f36693a = i7;
        this.f36694b = view;
    }

    @Override
    public final void run() {
        switch (this.f36693a) {
            case 0:
                this.f36694b.callOnClick();
                return;
            default:
                this.f36694b.invalidate();
                return;
        }
    }
}
