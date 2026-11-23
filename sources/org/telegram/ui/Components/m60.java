package org.telegram.ui.Components;

import android.view.View;
public final class m60 implements View.OnClickListener {
    public final int f37418a;
    public final x60 f37419b;
    public final Runnable f37420c;

    public m60(x60 x60Var, Runnable runnable, int i7) {
        this.f37418a = i7;
        this.f37419b = x60Var;
        this.f37420c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37418a) {
            case 0:
                this.f37419b.v();
                Runnable runnable = this.f37420c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f37420c.run();
                x60 x60Var = this.f37419b;
                if (x60Var.J) {
                    x60Var.v();
                    return;
                }
                return;
            case 2:
                this.f37420c.run();
                x60 x60Var2 = this.f37419b;
                if (x60Var2.J) {
                    x60Var2.v();
                    return;
                }
                return;
            case 3:
                x60 x60Var3 = this.f37419b;
                Runnable runnable2 = this.f37420c;
                if (runnable2 != null) {
                    int i7 = -x60Var3.K;
                    x60Var3.K = i7;
                    org.telegram.messenger.g0.E3(i7, view, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    runnable2.run();
                    return;
                }
                x60Var3.getClass();
                return;
            case 4:
                Runnable runnable3 = this.f37420c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                x60 x60Var4 = this.f37419b;
                if (x60Var4.J) {
                    x60Var4.v();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f37420c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                x60 x60Var5 = this.f37419b;
                if (x60Var5.J) {
                    x60Var5.v();
                    return;
                }
                return;
        }
    }
}
