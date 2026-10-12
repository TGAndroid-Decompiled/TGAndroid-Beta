package org.telegram.ui;

import android.view.View;
public final class cz0 implements View.OnClickListener {
    public final int f36582a;
    public final Runnable f36583b;

    public cz0(int i10, Runnable runnable) {
        this.f36582a = i10;
        this.f36583b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36582a) {
            case 0:
                this.f36583b.run();
                return;
            default:
                Runnable runnable = this.f36583b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
