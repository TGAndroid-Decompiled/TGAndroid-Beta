package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class l60 extends TextureView {
    public final int f30122a;
    public final Object f30123b;

    public l60(Object obj, Context context, int i10) {
        super(context);
        this.f30122a = i10;
        this.f30123b = obj;
    }

    @Override
    public void invalidate() {
        vi.t0 t0Var;
        switch (this.f30122a) {
            case 0:
                o60 o60Var = (o60) this.f30123b;
                if (!o60Var.H0 && (t0Var = o60Var.Q) != null && t0Var.f50625a == 3) {
                    o60Var.H0 = true;
                    try {
                        o60Var.F0 = SystemClock.elapsedRealtimeNanos();
                        o60Var.D();
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
        switch (this.f30122a) {
            case 1:
                xh.f fVar = (xh.f) this.f30123b;
                setMeasuredDimension(fVar.f51912g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
