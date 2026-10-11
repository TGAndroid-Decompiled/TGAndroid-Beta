package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class p60 extends TextureView {
    public final int f29740a;
    public final Object f29741b;

    public p60(Object obj, Context context, int i10) {
        super(context);
        this.f29740a = i10;
        this.f29741b = obj;
    }

    @Override
    public void invalidate() {
        ki.u0 u0Var;
        switch (this.f29740a) {
            case 0:
                s60 s60Var = (s60) this.f29741b;
                if (!s60Var.H0 && (u0Var = s60Var.R) != null && u0Var.f15150a == 3) {
                    s60Var.H0 = true;
                    try {
                        s60Var.F0 = SystemClock.elapsedRealtimeNanos();
                        s60Var.A();
                    } finally {
                        s60Var.H0 = false;
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
        switch (this.f29740a) {
            case 1:
                vh.f fVar = (vh.f) this.f29741b;
                setMeasuredDimension(fVar.f49795g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
