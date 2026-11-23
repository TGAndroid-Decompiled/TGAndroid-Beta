package org.telegram.ui.Components;

import android.view.View;
public final class zt implements Runnable {
    public final int f43040a;
    public final View f43041b;

    public zt(int i7, View view) {
        this.f43040a = i7;
        this.f43041b = view;
    }

    @Override
    public final void run() {
        switch (this.f43040a) {
            case 0:
                this.f43041b.callOnClick();
                return;
            default:
                this.f43041b.invalidate();
                return;
        }
    }
}
