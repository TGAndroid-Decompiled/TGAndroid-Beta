package org.telegram.ui.ActionBar;

import android.view.View;
public final class k1 implements Runnable {
    public final int f29117a;
    public final View f29118b;

    public k1(int i7, View view) {
        this.f29117a = i7;
        this.f29118b = view;
    }

    @Override
    public final void run() {
        switch (this.f29117a) {
            case 0:
                View view = this.f29118b;
                if (view instanceof o5) {
                    o5 o5Var = (o5) view;
                    if (!o5Var.f29827a) {
                        o5Var.f29827a = true;
                        o5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f29118b.performClick();
                return;
        }
    }
}
