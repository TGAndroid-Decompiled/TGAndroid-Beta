package org.telegram.ui.Components;

import android.view.View;
public final class ev implements Runnable {
    public final int f26214a;
    public final View f26215b;

    public ev(int i10, View view) {
        this.f26214a = i10;
        this.f26215b = view;
    }

    @Override
    public final void run() {
        switch (this.f26214a) {
            case 0:
                this.f26215b.callOnClick();
                return;
            default:
                this.f26215b.invalidate();
                return;
        }
    }
}
