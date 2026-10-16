package org.telegram.ui;

import android.os.Bundle;
public final class q80 extends e6 {
    public final yy f39076f;

    public q80(Bundle bundle, yy yyVar) {
        super(bundle);
        this.f39076f = yyVar;
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11) {
            this.f39076f.removeSelfFromStack();
        }
    }
}
