package org.telegram.ui.Components;

import android.view.View;
public final class x6 implements View.OnClickListener {
    public final int f31176a;
    public final Runnable f31177b;

    public x6(int i10, Runnable runnable) {
        this.f31176a = i10;
        this.f31177b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31176a) {
            case 0:
                this.f31177b.run();
                return;
            case 1:
                Runnable runnable = this.f31177b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31177b.run();
                return;
        }
    }
}
