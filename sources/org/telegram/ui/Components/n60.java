package org.telegram.ui.Components;

import android.view.View;
public final class n60 implements View.OnClickListener {
    public final int f37742a;
    public final y60 f37743b;
    public final Runnable f37744c;

    public n60(y60 y60Var, Runnable runnable, int i7) {
        this.f37742a = i7;
        this.f37743b = y60Var;
        this.f37744c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37742a) {
            case 0:
                this.f37743b.v();
                Runnable runnable = this.f37744c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f37744c.run();
                y60 y60Var = this.f37743b;
                if (y60Var.J) {
                    y60Var.v();
                    return;
                }
                return;
            case 2:
                this.f37744c.run();
                y60 y60Var2 = this.f37743b;
                if (y60Var2.J) {
                    y60Var2.v();
                    return;
                }
                return;
            case 3:
                y60 y60Var3 = this.f37743b;
                Runnable runnable2 = this.f37744c;
                if (runnable2 != null) {
                    int i7 = -y60Var3.K;
                    y60Var3.K = i7;
                    org.telegram.messenger.g0.E3(i7, view, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    runnable2.run();
                    return;
                }
                y60Var3.getClass();
                return;
            case 4:
                Runnable runnable3 = this.f37744c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                y60 y60Var4 = this.f37743b;
                if (y60Var4.J) {
                    y60Var4.v();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f37744c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                y60 y60Var5 = this.f37743b;
                if (y60Var5.J) {
                    y60Var5.v();
                    return;
                }
                return;
        }
    }
}
