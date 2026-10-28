package org.telegram.ui.Components;

import android.view.View;
public final class vu implements Runnable {
    public final int f34368a;
    public final View f34369b;

    public vu(int i10, View view) {
        this.f34368a = i10;
        this.f34369b = view;
    }

    @Override
    public final void run() {
        switch (this.f34368a) {
            case 0:
                this.f34369b.callOnClick();
                return;
            default:
                this.f34369b.invalidate();
                return;
        }
    }
}
