package org.telegram.ui.Components;

import android.view.View;
public final class x6 implements View.OnClickListener {
    public final int f30878a;
    public final Runnable f30879b;

    public x6(int i10, Runnable runnable) {
        this.f30878a = i10;
        this.f30879b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30878a) {
            case 0:
                this.f30879b.run();
                return;
            case 1:
                Runnable runnable = this.f30879b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f30879b.run();
                return;
        }
    }
}
