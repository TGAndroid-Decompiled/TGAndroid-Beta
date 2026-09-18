package org.telegram.ui.Components;

import android.view.View;
public final class nu implements Runnable {
    public final int f26766a;
    public final View f26767b;

    public nu(int i10, View view) {
        this.f26766a = i10;
        this.f26767b = view;
    }

    @Override
    public final void run() {
        switch (this.f26766a) {
            case 0:
                this.f26767b.callOnClick();
                return;
            default:
                this.f26767b.invalidate();
                return;
        }
    }
}
