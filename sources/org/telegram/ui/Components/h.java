package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f26698a;
    public final i80 f26699b;
    public final boolean f26700c;
    public final Runnable d;

    public h(i80 i80Var, boolean z10, Runnable runnable, int i10) {
        this.f26698a = i10;
        this.f26699b = i80Var;
        this.f26700c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f26698a) {
            case 0:
                this.f26699b.u();
                if (!this.f26700c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f26699b.u();
                if (!this.f26700c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
