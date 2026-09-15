package org.telegram.ui;

import android.view.View;
public final class c0 implements Runnable {
    public final int f32603a = 0;
    public final a3 f32604b;
    public final View f32605c;

    public c0(View view, a3 a3Var) {
        this.f32605c = view;
        this.f32604b = a3Var;
    }

    @Override
    public final void run() {
        switch (this.f32603a) {
            case 0:
                a3 a3Var = this.f32604b;
                View view = this.f32605c;
                view.post(new c0(a3Var, view));
                return;
            default:
                a3 a3Var2 = this.f32604b;
                a3Var2.I.clear();
                a3Var2.K.set(null);
                this.f32605c.invalidate();
                return;
        }
    }

    public c0(a3 a3Var, View view) {
        this.f32604b = a3Var;
        this.f32605c = view;
    }
}
