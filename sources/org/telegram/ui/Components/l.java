package org.telegram.ui.Components;

import android.view.View;
public final class l implements View.OnClickListener {
    public final int f36932a;
    public final y60 f36933b;
    public final boolean f36934c;
    public final Runnable d;

    public l(y60 y60Var, boolean z10, Runnable runnable, int i7) {
        this.f36932a = i7;
        this.f36933b = y60Var;
        this.f36934c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f36932a) {
            case 0:
                this.f36933b.v();
                if (!this.f36934c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f36933b.v();
                if (!this.f36934c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
