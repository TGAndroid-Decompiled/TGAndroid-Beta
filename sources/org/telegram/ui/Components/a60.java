package org.telegram.ui.Components;

import android.view.View;
public final class a60 implements View.OnClickListener {
    public final int f31718a;
    public final k60 f31719b;
    public final Runnable f31720c;

    public a60(k60 k60Var, Runnable runnable, int i7) {
        this.f31718a = i7;
        this.f31719b = k60Var;
        this.f31720c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31718a) {
            case 0:
                this.f31719b.u();
                Runnable runnable = this.f31720c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f31720c.run();
                k60 k60Var = this.f31719b;
                if (k60Var.J) {
                    k60Var.u();
                    return;
                }
                return;
            case 2:
                this.f31720c.run();
                k60 k60Var2 = this.f31719b;
                if (k60Var2.J) {
                    k60Var2.u();
                    return;
                }
                return;
            case 3:
                k60 k60Var3 = this.f31719b;
                Runnable runnable2 = this.f31720c;
                if (runnable2 != null) {
                    int i7 = -k60Var3.K;
                    k60Var3.K = i7;
                    org.telegram.messenger.g0.G3(i7, view, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    runnable2.run();
                    return;
                }
                k60Var3.getClass();
                return;
            case 4:
                Runnable runnable3 = this.f31720c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                k60 k60Var4 = this.f31719b;
                if (k60Var4.J) {
                    k60Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f31720c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                k60 k60Var5 = this.f31719b;
                if (k60Var5.J) {
                    k60Var5.u();
                    return;
                }
                return;
        }
    }
}
