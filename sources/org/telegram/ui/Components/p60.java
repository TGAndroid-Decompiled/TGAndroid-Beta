package org.telegram.ui.Components;

import android.view.View;
public final class p60 implements View.OnClickListener {
    public final int f38513a;
    public final a70 f38514b;
    public final Runnable f38515c;

    public p60(a70 a70Var, Runnable runnable, int i7) {
        this.f38513a = i7;
        this.f38514b = a70Var;
        this.f38515c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38513a) {
            case 0:
                this.f38514b.v();
                Runnable runnable = this.f38515c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f38515c.run();
                a70 a70Var = this.f38514b;
                if (a70Var.J) {
                    a70Var.v();
                    return;
                }
                return;
            case 2:
                this.f38515c.run();
                a70 a70Var2 = this.f38514b;
                if (a70Var2.J) {
                    a70Var2.v();
                    return;
                }
                return;
            case 3:
                a70 a70Var3 = this.f38514b;
                Runnable runnable2 = this.f38515c;
                if (runnable2 != null) {
                    int i7 = -a70Var3.K;
                    a70Var3.K = i7;
                    org.telegram.messenger.g0.E3(i7, view, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    runnable2.run();
                    return;
                }
                a70Var3.getClass();
                return;
            case 4:
                Runnable runnable3 = this.f38515c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                a70 a70Var4 = this.f38514b;
                if (a70Var4.J) {
                    a70Var4.v();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f38515c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                a70 a70Var5 = this.f38514b;
                if (a70Var5.J) {
                    a70Var5.v();
                    return;
                }
                return;
        }
    }
}
