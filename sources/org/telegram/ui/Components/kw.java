package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.ViewGroup;

public final class kw extends m2.g {

    public final yy f30203s0;

    public kw(yy yyVar, Context context) {
        super(context);
        this.f30203s0 = yyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30203s0.f34994f) {
            return false;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override
    public final void x(int i10, boolean z10) {
        yy yyVar = this.f30203s0;
        uv uvVar = yyVar.E;
        yy.b(yyVar, i10 == 1);
        if (i10 != getCurrentItem()) {
            super.x(i10, z10);
            return;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                yyVar.f34987d0.x0(0);
                return;
            } else {
                yyVar.f35059z0.x0(1);
                return;
            }
        }
        yyVar.M0[1] = 0;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(uvVar, (Property<uv, Float>) ViewGroup.TRANSLATION_Y, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(er.h);
        objectAnimatorOfFloat.start();
        yyVar.I(1, 0);
        if (uvVar != null) {
            uvVar.j(0, true);
        }
    }
}
