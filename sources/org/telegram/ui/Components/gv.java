package org.telegram.ui.Components;

import android.view.View;
public final class gv implements Runnable {
    public final int f26527a;
    public final View f26528b;

    public gv(int i10, View view) {
        this.f26527a = i10;
        this.f26528b = view;
    }

    @Override
    public final void run() {
        switch (this.f26527a) {
            case 0:
                this.f26528b.callOnClick();
                return;
            default:
                this.f26528b.invalidate();
                return;
        }
    }
}
