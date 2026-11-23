package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
public final class zf implements ViewTreeObserver.OnPreDrawListener {
    public final View f42792a;
    public final float f42793b;
    public final float f42794c;
    public final ChatActivityEnterView d;

    public zf(ChatActivityEnterView chatActivityEnterView, gf gfVar, float f10, float f11) {
        this.d = chatActivityEnterView;
        this.f42792a = gfVar;
        this.f42793b = f10;
        this.f42794c = f11;
    }

    @Override
    public final boolean onPreDraw() {
        rn0 rn0Var;
        View view = this.f42792a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ChatActivityEnterView chatActivityEnterView = this.d;
        fe feVar = chatActivityEnterView.R0;
        if (chatActivityEnterView.F0 == view && (rn0Var = chatActivityEnterView.f32696q0) != null && rn0Var.getVisibility() != 0) {
            float left = (this.f42793b - view.getLeft()) - chatActivityEnterView.I;
            float left2 = this.f42794c - feVar.getLeft();
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
            duration.setInterpolator(nr.f37960f);
            duration.addUpdateListener(new hi.i9(this, left, left2, 1));
            duration.addListener(new ah.l(23, this, duration));
            chatActivityEnterView.f32696q0.setTag(duration);
            chatActivityEnterView.H = left;
            chatActivityEnterView.q2();
            feVar.setTranslationX(left2);
            duration.start();
        }
        return true;
    }
}
