package org.telegram.ui.Components;

import android.view.View;
public final class w50 implements View.OnClickListener {
    public final int f39892a;
    public final f60 f39893b;
    public final Runnable f39894c;

    public w50(f60 f60Var, Runnable runnable, int i3) {
        this.f39892a = i3;
        this.f39893b = f60Var;
        this.f39894c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39892a) {
            case 0:
                this.f39893b.u();
                Runnable runnable = this.f39894c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f39894c.run();
                f60 f60Var = this.f39893b;
                if (f60Var.J) {
                    f60Var.u();
                    return;
                }
                return;
            case 2:
                this.f39894c.run();
                f60 f60Var2 = this.f39893b;
                if (f60Var2.J) {
                    f60Var2.u();
                    return;
                }
                return;
            case 3:
                f60 f60Var3 = this.f39893b;
                Runnable runnable2 = this.f39894c;
                if (runnable2 != null) {
                    int i3 = -f60Var3.K;
                    f60Var3.K = i3;
                    org.telegram.messenger.g0.G3(i3, view, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    runnable2.run();
                    return;
                }
                f60Var3.getClass();
                return;
            case 4:
                Runnable runnable3 = this.f39894c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                f60 f60Var4 = this.f39893b;
                if (f60Var4.J) {
                    f60Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f39894c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                f60 f60Var5 = this.f39893b;
                if (f60Var5.J) {
                    f60Var5.u();
                    return;
                }
                return;
        }
    }
}
