package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class mu0 implements View.OnClickListener {
    public final int f49974a;
    public final Runnable f49975b;

    public mu0(int i7, Runnable runnable) {
        this.f49974a = i7;
        this.f49975b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f49974a;
        Runnable runnable = this.f49975b;
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
