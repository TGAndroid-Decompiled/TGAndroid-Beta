package org.telegram.ui.ActionBar;

import android.view.View;
public final class j1 implements Runnable {
    public final int f29042a;
    public final View f29043b;

    public j1(int i7, View view) {
        this.f29042a = i7;
        this.f29043b = view;
    }

    @Override
    public final void run() {
        switch (this.f29042a) {
            case 0:
                View view = this.f29043b;
                if (view instanceof n5) {
                    n5 n5Var = (n5) view;
                    if (!n5Var.f29810a) {
                        n5Var.f29810a = true;
                        n5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f29043b.performClick();
                return;
        }
    }
}
