package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class c extends AnimatorListenerAdapter {

    public final int f22789a;

    public final boolean f22790b;

    public final k f22791c;

    public c(k kVar, boolean z10, int i10) {
        this.f22789a = i10;
        this.f22791c = kVar;
        this.f22790b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f22789a) {
            case 0:
                float f10 = this.f22790b ? 1.0f : 0.0f;
                k kVar = this.f22791c;
                kVar.f23586n1 = f10;
                kVar.b();
                break;
            default:
                float f11 = this.f22790b ? 1.0f : 0.0f;
                k kVar2 = this.f22791c;
                kVar2.f23586n1 = f11;
                kVar2.b();
                break;
        }
    }
}
