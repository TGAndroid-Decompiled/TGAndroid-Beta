package org.telegram.ui;

import android.view.View;
public final class fy0 implements View.OnClickListener {
    public final int f37026a;
    public final Runnable f37027b;

    public fy0(int i10, Runnable runnable) {
        this.f37026a = i10;
        this.f37027b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37026a) {
            case 0:
                this.f37027b.run();
                return;
            default:
                Runnable runnable = this.f37027b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
