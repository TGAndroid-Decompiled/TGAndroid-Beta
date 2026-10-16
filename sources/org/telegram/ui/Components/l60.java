package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class l60 extends TextureView {
    public final int f26626a;
    public final Object f26627b;

    public l60(Object obj, Context context, int i10) {
        super(context);
        this.f26626a = i10;
        this.f26627b = obj;
    }

    @Override
    public void invalidate() {
        ri.q0 q0Var;
        switch (this.f26626a) {
            case 0:
                o60 o60Var = (o60) this.f26627b;
                if (!o60Var.H0 && (q0Var = o60Var.R) != null && q0Var.f44671a == 3) {
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
        switch (this.f26626a) {
            case 1:
                wh.f fVar = (wh.f) this.f26627b;
                setMeasuredDimension(fVar.f47653g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
