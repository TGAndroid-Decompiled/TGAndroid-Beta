package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class q60 extends TextureView {
    public final int f30054a;
    public final Object f30055b;

    public q60(Object obj, Context context, int i10) {
        super(context);
        this.f30054a = i10;
        this.f30055b = obj;
    }

    @Override
    public void invalidate() {
        ki.s0 s0Var;
        switch (this.f30054a) {
            case 0:
                t60 t60Var = (t60) this.f30055b;
                if (!t60Var.H0 && (s0Var = t60Var.R) != null && s0Var.f15109a == 3) {
                    t60Var.H0 = true;
                    try {
                        t60Var.F0 = SystemClock.elapsedRealtimeNanos();
                        t60Var.z();
                    } finally {
                        t60Var.H0 = false;
                    }
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f30054a) {
            case 1:
                vh.f fVar = (vh.f) this.f30055b;
                setMeasuredDimension(fVar.f49718g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
