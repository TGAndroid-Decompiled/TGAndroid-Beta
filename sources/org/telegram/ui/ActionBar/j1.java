package org.telegram.ui.ActionBar;

import android.view.View;
public final class j1 implements Runnable {
    public final int f28722a;
    public final View f28723b;

    public j1(int i7, View view) {
        this.f28722a = i7;
        this.f28723b = view;
    }

    @Override
    public final void run() {
        switch (this.f28722a) {
            case 0:
                View view = this.f28723b;
                if (view instanceof k5) {
                    k5 k5Var = (k5) view;
                    if (!k5Var.f29340a) {
                        k5Var.f29340a = true;
                        k5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f28723b.performClick();
                return;
        }
    }
}
