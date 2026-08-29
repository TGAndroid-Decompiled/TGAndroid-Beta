package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d extends AnimatorListenerAdapter {
    public final int f22830a;
    public final boolean f22831b;
    public final l f22832c;

    public d(l lVar, boolean z10, int i10) {
        this.f22830a = i10;
        this.f22832c = lVar;
        this.f22831b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        float f10;
        switch (this.f22830a) {
            case 0:
                if (this.f22831b) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                l lVar = this.f22832c;
                lVar.f23620n1 = f9;
                lVar.b();
                return;
            default:
                if (this.f22831b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                l lVar2 = this.f22832c;
                lVar2.f23620n1 = f10;
                lVar2.b();
                return;
        }
    }
}
