package org.telegram.ui;

import android.view.View;
public final class d0 implements Runnable {
    public final int f35588a = 0;
    public final b3 f35589b;
    public final View f35590c;

    public d0(View view, b3 b3Var) {
        this.f35590c = view;
        this.f35589b = b3Var;
    }

    @Override
    public final void run() {
        switch (this.f35588a) {
            case 0:
                b3 b3Var = this.f35589b;
                View view = this.f35590c;
                view.post(new d0(b3Var, view));
                return;
            default:
                b3 b3Var2 = this.f35589b;
                b3Var2.I.clear();
                b3Var2.K.set(null);
                this.f35590c.invalidate();
                return;
        }
    }

    public d0(b3 b3Var, View view) {
        this.f35589b = b3Var;
        this.f35590c = view;
    }
}
