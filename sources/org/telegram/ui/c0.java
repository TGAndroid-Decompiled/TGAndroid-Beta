package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f32582a = 0;
    public final a3 f32583b;
    public final View f32584c;

    public c0(View view, a3 a3Var) {
        this.f32584c = view;
        this.f32583b = a3Var;
    }

    @Override
    public final void run() {
        switch (this.f32582a) {
            case 0:
                a3 a3Var = this.f32583b;
                View view = this.f32584c;
                view.post(new c0(a3Var, view));
                return;
            default:
                a3 a3Var2 = this.f32583b;
                a3Var2.I.clear();
                a3Var2.K.set(null);
                this.f32584c.invalidate();
                return;
        }
    }

    public c0(a3 a3Var, View view) {
        this.f32583b = a3Var;
        this.f32584c = view;
    }
}
