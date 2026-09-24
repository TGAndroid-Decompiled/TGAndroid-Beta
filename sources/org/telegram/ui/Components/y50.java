package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class y50 extends TextureView {
    public final int f30503a;
    public final Object f30504b;

    public y50(Object obj, Context context, int i10) {
        super(context);
        this.f30503a = i10;
        this.f30504b = obj;
    }

    @Override
    public void invalidate() {
        ki.q0 q0Var;
        switch (this.f30503a) {
            case 0:
                b60 b60Var = (b60) this.f30504b;
                if (!b60Var.f22895x0 && (q0Var = b60Var.O) != null && q0Var.f13825a == 3) {
                    b60Var.f22895x0 = true;
                    try {
                        b60Var.f22891v0 = SystemClock.elapsedRealtimeNanos();
                        b60Var.v();
                    } finally {
                        b60Var.f22895x0 = false;
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
        switch (this.f30503a) {
            case 1:
                vh.f fVar = (vh.f) this.f30504b;
                setMeasuredDimension(fVar.f44664g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
