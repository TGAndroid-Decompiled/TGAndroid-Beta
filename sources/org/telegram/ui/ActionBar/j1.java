package org.telegram.ui.ActionBar;

import android.view.View;
public final class j1 implements Runnable {
    public final int f27596a;
    public final View f27597b;

    public j1(int i7, View view) {
        this.f27596a = i7;
        this.f27597b = view;
    }

    @Override
    public final void run() {
        switch (this.f27596a) {
            case 0:
                View view = this.f27597b;
                if (view instanceof m5) {
                    m5 m5Var = (m5) view;
                    if (!m5Var.f28298a) {
                        m5Var.f28298a = true;
                        m5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f27597b.performClick();
                return;
        }
    }
}
