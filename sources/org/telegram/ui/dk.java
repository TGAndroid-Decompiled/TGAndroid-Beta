package org.telegram.ui;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;

public final class dk implements Runnable {

    public final int f37432a;

    public final rn f37433b;

    public dk(rn rnVar, int i10) {
        this.f37432a = i10;
        this.f37433b = rnVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.og ogVar;
        FrameLayout frameLayout;
        switch (this.f37432a) {
            case 0:
                rn rnVar = this.f37433b;
                AnimatorSet animatorSet = rnVar.R9;
                if (animatorSet != null && !animatorSet.isRunning()) {
                    rnVar.R9.start();
                    break;
                }
                break;
            default:
                rn rnVar2 = this.f37433b;
                if (rnVar2.K2 == this && (ogVar = rnVar2.I0) != null && (frameLayout = rnVar2.J2) != null) {
                    ogVar.i(frameLayout, false, true);
                    break;
                }
                break;
        }
    }
}
