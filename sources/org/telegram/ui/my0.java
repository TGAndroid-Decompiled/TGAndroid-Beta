package org.telegram.ui;

import android.view.View;
public final class my0 implements View.OnClickListener {
    public final int f41588a;
    public final Runnable f41589b;

    public my0(int i10, Runnable runnable) {
        this.f41588a = i10;
        this.f41589b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41588a;
        Runnable runnable = this.f41589b;
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
