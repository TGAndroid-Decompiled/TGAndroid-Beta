package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;

public final class yv extends zk0 {
    public boolean T2;
    public boolean U2;
    public final yy V2;

    public yv(yy yyVar, Context context) {
        super(context, null);
        this.V2 = yyVar;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.kt ktVarQ = org.telegram.ui.kt.q();
        yy yyVar = this.V2;
        return super.onInterceptTouchEvent(motionEvent) || ktVarQ.r(motionEvent, yyVar.f34987d0, yyVar.f34986c2, this.f35277l2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yy yyVar = this.V2;
        if (yyVar.m0 && yyVar.f35007j0.C > 1) {
            this.T2 = true;
            yyVar.f34991e0.h1(0, 0);
            yyVar.f35010k0.setVisibility(0);
            yyVar.f35013l0.k(0, 0);
            yyVar.m0 = false;
            this.T2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        yy.f(yyVar, true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.U2) {
            return;
        }
        this.V2.f35007j0.l();
        this.U2 = true;
    }

    @Override
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }
}
