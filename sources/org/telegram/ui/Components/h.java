package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f34106a;
    public final k60 f34107b;
    public final boolean f34108c;
    public final Runnable d;

    public h(k60 k60Var, boolean z9, Runnable runnable, int i7) {
        this.f34106a = i7;
        this.f34107b = k60Var;
        this.f34108c = z9;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f34106a) {
            case 0:
                this.f34107b.u();
                if (!this.f34108c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f34107b.u();
                if (!this.f34108c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
