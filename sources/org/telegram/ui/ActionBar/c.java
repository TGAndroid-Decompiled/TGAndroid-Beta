package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f21200a;
    public final boolean f21201b;
    public final k f21202c;

    public c(k kVar, boolean z4, int i10) {
        this.f21200a = i10;
        this.f21202c = kVar;
        this.f21201b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float f11;
        switch (this.f21200a) {
            case 0:
                if (this.f21201b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k kVar = this.f21202c;
                kVar.f21554o1 = f10;
                kVar.b();
                return;
            default:
                if (this.f21201b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                k kVar2 = this.f21202c;
                kVar2.f21554o1 = f11;
                kVar2.b();
                return;
        }
    }
}
