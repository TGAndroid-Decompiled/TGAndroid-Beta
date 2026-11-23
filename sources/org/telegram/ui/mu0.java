package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class mu0 implements View.OnClickListener {
    public final int f49993a;
    public final Runnable f49994b;

    public mu0(int i7, Runnable runnable) {
        this.f49993a = i7;
        this.f49994b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49993a;
        Runnable runnable = this.f49994b;
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
