package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
public final class yf implements ViewTreeObserver.OnPreDrawListener {
    public final View f42440a;
    public final float f42441b;
    public final float f42442c;
    public final ChatActivityEnterView d;

    public yf(ChatActivityEnterView chatActivityEnterView, hf hfVar, float f10, float f11) {
        this.d = chatActivityEnterView;
        this.f42440a = hfVar;
        this.f42441b = f10;
        this.f42442c = f11;
    }

    @Override
    public final boolean onPreDraw() {
        qn0 qn0Var;
        View view = this.f42440a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ChatActivityEnterView chatActivityEnterView = this.d;
        ge geVar = chatActivityEnterView.R0;
        if (chatActivityEnterView.F0 == view && (qn0Var = chatActivityEnterView.f32760q0) != null && qn0Var.getVisibility() != 0) {
            float left = (this.f42441b - view.getLeft()) - chatActivityEnterView.I;
            float left2 = this.f42442c - geVar.getLeft();
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
            duration.setInterpolator(kr.f36858f);
            duration.addUpdateListener(new hi.da(this, left, left2, 1));
            duration.addListener(new ah.l(23, this, duration));
            chatActivityEnterView.f32760q0.setTag(duration);
            chatActivityEnterView.H = left;
            chatActivityEnterView.s2();
            geVar.setTranslationX(left2);
            duration.start();
        }
        return true;
    }
}
