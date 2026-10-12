package org.telegram.ui;

import android.view.View;
public final class gz0 implements View.OnClickListener {
    public final int f36549a;
    public final Runnable f36550b;

    public gz0(int i10, Runnable runnable) {
        this.f36549a = i10;
        this.f36550b = runnable;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36549a) {
            case 0:
                this.f36550b.run();
                return;
            default:
                Runnable runnable = this.f36550b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
