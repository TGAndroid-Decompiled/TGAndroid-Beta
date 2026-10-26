package org.telegram.ui;

import android.view.View;
public final class ky0 implements View.OnClickListener {
    public final int f41089a;
    public final Runnable f41090b;

    public ky0(int i10, Runnable runnable) {
        this.f41089a = i10;
        this.f41090b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41089a;
        Runnable runnable = this.f41090b;
        switch (i10) {
            case 0:
                int i11 = ProfileActivity.R6;
                runnable.run();
                return;
            default:
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
