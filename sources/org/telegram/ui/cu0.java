package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
public final class cu0 implements View.OnClickListener {
    public final int f44436a;
    public final Runnable f44437b;

    public cu0(int i3, Runnable runnable) {
        this.f44436a = i3;
        this.f44437b = runnable;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f44436a;
        Runnable runnable = this.f44437b;
        switch (i3) {
            case 0:
                RectF rectF = ProfileActivity.T6;
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
