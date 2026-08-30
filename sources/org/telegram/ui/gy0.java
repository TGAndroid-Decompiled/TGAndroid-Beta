package org.telegram.ui;

import android.view.View;
public final class gy0 implements View.OnClickListener {
    public final int f34700a;
    public final Runnable f34701b;

    public gy0(int i10, Runnable runnable) {
        this.f34700a = i10;
        this.f34701b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34700a) {
            case 0:
                this.f34701b.run();
                return;
            default:
                Runnable runnable = this.f34701b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
