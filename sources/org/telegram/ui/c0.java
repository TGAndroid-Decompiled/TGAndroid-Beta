package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f32562a = 0;
    public final a3 f32563b;
    public final View f32564c;

    public c0(View view, a3 a3Var) {
        this.f32564c = view;
        this.f32563b = a3Var;
    }

    @Override
    public final void run() {
        switch (this.f32562a) {
            case 0:
                a3 a3Var = this.f32563b;
                View view = this.f32564c;
                view.post(new c0(a3Var, view));
                return;
            default:
                a3 a3Var2 = this.f32563b;
                a3Var2.I.clear();
                a3Var2.K.set(null);
                this.f32564c.invalidate();
                return;
        }
    }

    public c0(a3 a3Var, View view) {
        this.f32563b = a3Var;
        this.f32564c = view;
    }
}
