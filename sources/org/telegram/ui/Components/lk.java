package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class lk extends AnimatorListenerAdapter {
    public final int f26131a = 0;
    public final org.telegram.ui.zq f26132b;

    public lk(org.telegram.ui.zq zqVar) {
        this.f26132b = zqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26131a) {
            case 0:
                ((nk) this.f26132b.d).U.unlock();
                return;
            default:
                org.telegram.ui.zq zqVar = this.f26132b;
                View view = zqVar.f40609b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((nk) zqVar.d).X.f27117r.removeView(view);
                return;
        }
    }

    public lk(org.telegram.ui.zq zqVar, s4.o0 o0Var) {
        this.f26132b = zqVar;
    }
}
