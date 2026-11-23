package org.telegram.ui.ActionBar;

import android.view.View;
public final class j1 implements Runnable {
    public final int f29011a;
    public final View f29012b;

    public j1(int i7, View view) {
        this.f29011a = i7;
        this.f29012b = view;
    }

    @Override
    public final void run() {
        switch (this.f29011a) {
            case 0:
                View view = this.f29012b;
                if (view instanceof n5) {
                    n5 n5Var = (n5) view;
                    if (!n5Var.f29779a) {
                        n5Var.f29779a = true;
                        n5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f29012b.performClick();
                return;
        }
    }
}
