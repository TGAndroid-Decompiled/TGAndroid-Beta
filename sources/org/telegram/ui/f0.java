package org.telegram.ui;

import android.view.View;
public final class f0 implements Runnable {
    public final int f33884a = 0;
    public final f3 f33885b;
    public final View f33886c;

    public f0(View view, f3 f3Var) {
        this.f33886c = view;
        this.f33885b = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f33884a) {
            case 0:
                f3 f3Var = this.f33885b;
                View view = this.f33886c;
                view.post(new f0(f3Var, view));
                return;
            default:
                f3 f3Var2 = this.f33885b;
                f3Var2.F.clear();
                f3Var2.H.set(null);
                this.f33886c.invalidate();
                return;
        }
    }

    public f0(f3 f3Var, View view) {
        this.f33885b = f3Var;
        this.f33886c = view;
    }
}
