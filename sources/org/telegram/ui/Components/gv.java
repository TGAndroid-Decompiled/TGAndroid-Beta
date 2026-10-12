package org.telegram.ui.Components;

import android.view.View;
public final class gv implements Runnable {
    public final int f26531a;
    public final View f26532b;

    public gv(int i10, View view) {
        this.f26531a = i10;
        this.f26532b = view;
    }

    @Override
    public final void run() {
        switch (this.f26531a) {
            case 0:
                this.f26532b.callOnClick();
                return;
            default:
                this.f26532b.invalidate();
                return;
        }
    }
}
