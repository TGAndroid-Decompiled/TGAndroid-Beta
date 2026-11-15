package org.telegram.ui.Components;

import android.view.View;
public final class ut implements Runnable {
    public final int f40157a;
    public final View f40158b;

    public ut(int i7, View view) {
        this.f40157a = i7;
        this.f40158b = view;
    }

    @Override
    public final void run() {
        switch (this.f40157a) {
            case 0:
                this.f40158b.callOnClick();
                return;
            default:
                this.f40158b.invalidate();
                return;
        }
    }
}
