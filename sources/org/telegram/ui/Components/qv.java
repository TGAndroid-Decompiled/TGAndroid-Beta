package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class qv extends uj0 {
    public boolean f38773f3;
    public boolean f38774g3;
    public final ly f38775h3;

    public qv(ly lyVar, Context context) {
        super(context, null);
        this.f38775h3 = lyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ly lyVar = this.f38775h3;
        boolean q10 = p10.q(motionEvent, lyVar.f36956i0, lyVar.f36955h2, this.f40069o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !q10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        ly lyVar = this.f38775h3;
        if (lyVar.f36982r0 && lyVar.f36972o0.H > 1) {
            this.f38773f3 = true;
            lyVar.f36959j0.h1(0, 0);
            lyVar.f36975p0.setVisibility(0);
            lyVar.f36978q0.k(0, 0);
            lyVar.f36982r0 = false;
            this.f38773f3 = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        ly.f(lyVar, true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (!this.f38774g3) {
            this.f38775h3.f36972o0.f();
            this.f38774g3 = true;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f38773f3) {
            return;
        }
        super.requestLayout();
    }
}
