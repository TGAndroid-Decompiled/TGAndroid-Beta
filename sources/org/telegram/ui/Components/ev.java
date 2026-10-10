package org.telegram.ui.Components;

import android.view.View;
public final class ev implements Runnable {
    public final int f26176a;
    public final View f26177b;

    public ev(int i10, View view) {
        this.f26176a = i10;
        this.f26177b = view;
    }

    @Override
    public final void run() {
        switch (this.f26176a) {
            case 0:
                this.f26177b.callOnClick();
                return;
            default:
                this.f26177b.invalidate();
                return;
        }
    }
}
