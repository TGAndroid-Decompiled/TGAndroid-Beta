package org.telegram.ui.Components;

import android.view.View;
public final class ru implements Runnable {
    public final int f26753a;
    public final View f26754b;

    public ru(int i10, View view) {
        this.f26753a = i10;
        this.f26754b = view;
    }

    @Override
    public final void run() {
        switch (this.f26753a) {
            case 0:
                this.f26754b.callOnClick();
                return;
            default:
                this.f26754b.invalidate();
                return;
        }
    }
}
