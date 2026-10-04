package org.telegram.ui.Components;

import android.view.View;
public final class u6 implements View.OnClickListener {
    public final int f31299a;
    public final Runnable f31300b;

    public u6(int i10, Runnable runnable) {
        this.f31299a = i10;
        this.f31300b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31299a) {
            case 0:
                this.f31300b.run();
                return;
            case 1:
                Runnable runnable = this.f31300b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                this.f31300b.run();
                return;
        }
    }
}
