package org.telegram.ui.Components;

import android.view.View;
public final class s6 implements View.OnClickListener {
    public final int f27780a;
    public final Runnable f27781b;

    public s6(int i10, Runnable runnable) {
        this.f27780a = i10;
        this.f27781b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27780a) {
            case 0:
                this.f27781b.run();
                return;
            case 1:
                Runnable runnable = this.f27781b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f27781b.run();
                return;
        }
    }
}
