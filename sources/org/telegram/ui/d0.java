package org.telegram.ui;

import android.view.View;
public final class d0 implements Runnable {
    public final int f36767a = 0;
    public final b3 f36768b;
    public final View f36769c;

    public d0(View view, b3 b3Var) {
        this.f36769c = view;
        this.f36768b = b3Var;
    }

    @Override
    public final void run() {
        switch (this.f36767a) {
            case 0:
                b3 b3Var = this.f36768b;
                View view = this.f36769c;
                view.post(new d0(b3Var, view));
                return;
            default:
                b3 b3Var2 = this.f36768b;
                b3Var2.I.clear();
                b3Var2.K.set(null);
                this.f36769c.invalidate();
                return;
        }
    }

    public d0(b3 b3Var, View view) {
        this.f36768b = b3Var;
        this.f36769c = view;
    }
}
