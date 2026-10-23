package org.telegram.ui.Components;

import android.view.View;
public final class uu implements Runnable {
    public final int f31018a;
    public final View f31019b;

    public uu(int i10, View view) {
        this.f31018a = i10;
        this.f31019b = view;
    }

    @Override
    public final void run() {
        switch (this.f31018a) {
            case 0:
                this.f31019b.callOnClick();
                return;
            default:
                this.f31019b.invalidate();
                return;
        }
    }
}
