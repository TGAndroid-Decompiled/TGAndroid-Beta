package org.telegram.ui;

import android.view.View;
public final class d0 implements Runnable {
    public final int f32460a = 0;
    public final b3 f32461b;
    public final View f32462c;

    public d0(View view, b3 b3Var) {
        this.f32462c = view;
        this.f32461b = b3Var;
    }

    @Override
    public final void run() {
        switch (this.f32460a) {
            case 0:
                b3 b3Var = this.f32461b;
                View view = this.f32462c;
                view.post(new d0(b3Var, view));
                return;
            default:
                b3 b3Var2 = this.f32461b;
                b3Var2.I.clear();
                b3Var2.K.set(null);
                this.f32462c.invalidate();
                return;
        }
    }

    public d0(b3 b3Var, View view) {
        this.f32461b = b3Var;
        this.f32462c = view;
    }
}
