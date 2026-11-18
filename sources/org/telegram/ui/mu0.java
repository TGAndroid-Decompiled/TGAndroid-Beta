package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class mu0 implements View.OnClickListener {
    public final int f49948a;
    public final Runnable f49949b;

    public mu0(int i7, Runnable runnable) {
        this.f49948a = i7;
        this.f49949b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49948a;
        Runnable runnable = this.f49949b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
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
