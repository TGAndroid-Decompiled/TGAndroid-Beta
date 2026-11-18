package org.telegram.ui.Components;

import android.view.View;
public final class zt implements Runnable {
    public final int f42943a;
    public final View f42944b;

    public zt(int i7, View view) {
        this.f42943a = i7;
        this.f42944b = view;
    }

    @Override
    public final void run() {
        switch (this.f42943a) {
            case 0:
                this.f42944b.callOnClick();
                return;
            default:
                this.f42944b.invalidate();
                return;
        }
    }
}
