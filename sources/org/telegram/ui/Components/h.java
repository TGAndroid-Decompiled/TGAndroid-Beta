package org.telegram.ui.Components;

import android.view.View;
public final class h implements View.OnClickListener {
    public final int f28783a;
    public final l80 f28784b;
    public final boolean f28785c;
    public final Runnable d;

    public h(l80 l80Var, boolean z10, Runnable runnable, int i10) {
        this.f28783a = i10;
        this.f28784b = l80Var;
        this.f28785c = z10;
        this.d = runnable;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.f28783a) {
            case 0:
                this.f28784b.u();
                if (!this.f28785c && (runnable = this.d) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f28784b.u();
                if (!this.f28785c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
