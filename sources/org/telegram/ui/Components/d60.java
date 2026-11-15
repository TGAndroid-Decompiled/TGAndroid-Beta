package org.telegram.ui.Components;

import android.view.View;
public final class d60 implements View.OnClickListener {
    public final int f33851a;
    public final m60 f33852b;
    public final Runnable f33853c;

    public d60(m60 m60Var, Runnable runnable, int i7) {
        this.f33851a = i7;
        this.f33852b = m60Var;
        this.f33853c = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33851a) {
            case 0:
                this.f33852b.u();
                Runnable runnable = this.f33853c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f33853c.run();
                m60 m60Var = this.f33852b;
                if (m60Var.J) {
                    m60Var.u();
                    return;
                }
                return;
            case 2:
                this.f33853c.run();
                m60 m60Var2 = this.f33852b;
                if (m60Var2.J) {
                    m60Var2.u();
                    return;
                }
                return;
            case 3:
                m60 m60Var3 = this.f33852b;
                Runnable runnable2 = this.f33853c;
                if (runnable2 != null) {
                    int i7 = -m60Var3.K;
                    m60Var3.K = i7;
                    org.telegram.messenger.g0.F3(i7, view, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    runnable2.run();
                    return;
                }
                m60Var3.getClass();
                return;
            case 4:
                Runnable runnable3 = this.f33853c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                m60 m60Var4 = this.f33852b;
                if (m60Var4.J) {
                    m60Var4.u();
                    return;
                }
                return;
            default:
                Runnable runnable4 = this.f33853c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                m60 m60Var5 = this.f33852b;
                if (m60Var5.J) {
                    m60Var5.u();
                    return;
                }
                return;
        }
    }
}
