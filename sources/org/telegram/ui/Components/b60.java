package org.telegram.ui.Components;

import android.view.View;
public final class b60 implements View.OnClickListener {
    public final int f32109a;
    public final l60 f32110b;
    public final Runnable f32111c;

    public b60(l60 l60Var, Runnable runnable, int i7) {
        this.f32109a = i7;
        this.f32110b = l60Var;
        this.f32111c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32109a) {
            case 0:
                this.f32110b.u();
                Runnable runnable = this.f32111c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f32111c.run();
                l60 l60Var = this.f32110b;
                if (l60Var.J) {
                    l60Var.u();
                    return;
                }
                return;
            case 2:
                this.f32111c.run();
                l60 l60Var2 = this.f32110b;
                if (l60Var2.J) {
                    l60Var2.u();
                    return;
                }
                return;
            case 3:
                l60 l60Var3 = this.f32110b;
                Runnable runnable2 = this.f32111c;
                if (runnable2 != null) {
                    int i7 = -l60Var3.K;
                    l60Var3.K = i7;
                    org.telegram.messenger.g0.G3(i7, view, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    runnable2.run();
                    return;
                }
                l60Var3.getClass();
                return;
            case 4:
                Runnable runnable3 = this.f32111c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                l60 l60Var4 = this.f32110b;
                if (l60Var4.J) {
                    l60Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f32111c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                l60 l60Var5 = this.f32110b;
                if (l60Var5.J) {
                    l60Var5.u();
                    return;
                }
                return;
        }
    }
}
