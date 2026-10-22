package org.telegram.ui.Components;

import android.view.View;
public final class uu implements Runnable {
    public final int f31017a;
    public final View f31018b;

    public uu(int i10, View view) {
        this.f31017a = i10;
        this.f31018b = view;
    }

    @Override
    public final void run() {
        switch (this.f31017a) {
            case 0:
                this.f31018b.callOnClick();
                return;
            default:
                this.f31018b.invalidate();
                return;
        }
    }
}
