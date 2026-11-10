package org.telegram.ui.ActionBar;

import android.view.View;
public final class j1 implements Runnable {
    public final int f27566a;
    public final View f27567b;

    public j1(int i7, View view) {
        this.f27566a = i7;
        this.f27567b = view;
    }

    @Override
    public final void run() {
        switch (this.f27566a) {
            case 0:
                View view = this.f27567b;
                if (view instanceof n5) {
                    n5 n5Var = (n5) view;
                    if (!n5Var.f28321a) {
                        n5Var.f28321a = true;
                        n5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f27567b.performClick();
                return;
        }
    }
}
