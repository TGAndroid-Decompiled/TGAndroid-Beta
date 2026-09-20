package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f18742a;
    public final boolean f18743b;
    public final k f18744c;

    public c(k kVar, boolean z10, int i10) {
        this.f18742a = i10;
        this.f18744c = kVar;
        this.f18743b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        switch (this.f18742a) {
            case 0:
                if (this.f18743b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                k kVar = this.f18744c;
                kVar.f19550s1 = f7;
                kVar.b();
                return;
            default:
                if (this.f18743b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar2 = this.f18744c;
                kVar2.f19550s1 = f10;
                kVar2.b();
                return;
        }
    }
}
