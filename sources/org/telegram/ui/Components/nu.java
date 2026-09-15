package org.telegram.ui.Components;

import android.view.View;
public final class nu implements Runnable {
    public final int f26574a;
    public final View f26575b;

    public nu(int i10, View view) {
        this.f26574a = i10;
        this.f26575b = view;
    }

    @Override
    public final void run() {
        switch (this.f26574a) {
            case 0:
                this.f26575b.callOnClick();
                return;
            default:
                this.f26575b.invalidate();
                return;
        }
    }
}
