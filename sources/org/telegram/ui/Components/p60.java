package org.telegram.ui.Components;

import android.view.View;
public final class p60 implements View.OnClickListener {
    public final int f29366a;
    public final z60 f29367b;
    public final Runnable f29368c;

    public p60(z60 z60Var, Runnable runnable, int i10) {
        this.f29366a = i10;
        this.f29367b = z60Var;
        this.f29368c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29366a) {
            case 0:
                this.f29367b.u();
                Runnable runnable = this.f29368c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f29368c.run();
                z60 z60Var = this.f29367b;
                if (z60Var.J) {
                    z60Var.u();
                    return;
                }
                return;
            case 2:
                this.f29368c.run();
                z60 z60Var2 = this.f29367b;
                if (z60Var2.J) {
                    z60Var2.u();
                    return;
                }
                return;
            case 3:
                z60 z60Var3 = this.f29367b;
                Runnable runnable2 = this.f29368c;
                if (runnable2 != null) {
                    int i10 = -z60Var3.K;
                    z60Var3.K = i10;
                    org.telegram.messenger.i0.F3(i10, view, null);
                    org.telegram.messenger.t2.APP_ERROR.a();
                    runnable2.run();
                    return;
                }
                z60Var3.getClass();
                return;
            case 4:
                Runnable runnable3 = this.f29368c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                z60 z60Var4 = this.f29367b;
                if (z60Var4.J) {
                    z60Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f29368c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                z60 z60Var5 = this.f29367b;
                if (z60Var5.J) {
                    z60Var5.u();
                    return;
                }
                return;
        }
    }
}
