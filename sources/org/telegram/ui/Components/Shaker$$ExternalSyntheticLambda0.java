package org.telegram.ui.Components;

import android.view.View;

public final class Shaker$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final View f$0;

    public Shaker$$ExternalSyntheticLambda0(View view, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invalidate();
                break;
            default:
                this.f$0.callOnClick();
                break;
        }
    }
}
