package org.telegram.ui.Components;

import android.view.View;
public final class s6 implements View.OnClickListener {
    public final int f27777a;
    public final Runnable f27778b;

    public s6(int i10, Runnable runnable) {
        this.f27777a = i10;
        this.f27778b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27777a) {
            case 0:
                this.f27778b.run();
                return;
            case 1:
                Runnable runnable = this.f27778b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f27778b.run();
                return;
        }
    }
}
