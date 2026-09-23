package org.telegram.ui.Components;

import android.view.View;
public final class ou implements Runnable {
    public final int f26854a;
    public final View f26855b;

    public ou(int i10, View view) {
        this.f26854a = i10;
        this.f26855b = view;
    }

    @Override
    public final void run() {
        switch (this.f26854a) {
            case 0:
                this.f26855b.callOnClick();
                return;
            default:
                this.f26855b.invalidate();
                return;
        }
    }
}
