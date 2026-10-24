package org.telegram.ui.Components;

import android.view.View;
public final class t6 implements View.OnClickListener {
    public final int f30735a;
    public final Runnable f30736b;

    public t6(int i10, Runnable runnable) {
        this.f30735a = i10;
        this.f30736b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30735a) {
            case 0:
                this.f30736b.run();
                return;
            case 1:
                Runnable runnable = this.f30736b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f30736b.run();
                return;
        }
    }
}
