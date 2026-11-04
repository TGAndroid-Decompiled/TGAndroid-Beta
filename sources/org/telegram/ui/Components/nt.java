package org.telegram.ui.Components;

import android.view.View;
public final class nt implements Runnable {
    public final int f36619a;
    public final View f36620b;

    public nt(int i3, View view) {
        this.f36619a = i3;
        this.f36620b = view;
    }

    @Override
    public final void run() {
        switch (this.f36619a) {
            case 0:
                this.f36620b.callOnClick();
                return;
            default:
                this.f36620b.invalidate();
                return;
        }
    }
}
