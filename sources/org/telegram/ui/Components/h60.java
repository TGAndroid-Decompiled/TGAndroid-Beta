package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class h60 extends TextureView {
    public final int f26876a;
    public final Object f26877b;

    public h60(Object obj, Context context, int i10) {
        super(context);
        this.f26876a = i10;
        this.f26877b = obj;
    }

    @Override
    public void invalidate() {
        si.t0 t0Var;
        switch (this.f26876a) {
            case 0:
                k60 k60Var = (k60) this.f26877b;
                if (!k60Var.H0 && (t0Var = k60Var.R) != null && t0Var.f47241a == 3) {
                    k60Var.H0 = true;
                    try {
                        k60Var.F0 = SystemClock.elapsedRealtimeNanos();
                        k60Var.A();
                    } finally {
                        k60Var.H0 = false;
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
        switch (this.f26876a) {
            case 1:
                wh.f fVar = (wh.f) this.f26877b;
                setMeasuredDimension(fVar.f49491g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
