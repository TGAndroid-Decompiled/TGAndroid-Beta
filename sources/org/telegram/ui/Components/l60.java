package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class l60 extends TextureView {
    public final int f26946a;
    public final Object f26947b;

    public l60(Object obj, Context context, int i10) {
        super(context);
        this.f26946a = i10;
        this.f26947b = obj;
    }

    @Override
    public void invalidate() {
        li.t0 t0Var;
        switch (this.f26946a) {
            case 0:
                o60 o60Var = (o60) this.f26947b;
                if (!o60Var.H0 && (t0Var = o60Var.R) != null && t0Var.f14957a == 3) {
                    o60Var.H0 = true;
                    try {
                        o60Var.F0 = SystemClock.elapsedRealtimeNanos();
                        o60Var.A();
                    } finally {
                        o60Var.H0 = false;
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
        switch (this.f26946a) {
            case 1:
                wh.f fVar = (wh.f) this.f26947b;
                setMeasuredDimension(fVar.f47654g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
