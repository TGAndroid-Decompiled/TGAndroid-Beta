package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class p60 extends TextureView {
    public final int f29725a;
    public final Object f29726b;

    public p60(Object obj, Context context, int i10) {
        super(context);
        this.f29725a = i10;
        this.f29726b = obj;
    }

    @Override
    public void invalidate() {
        ki.s0 s0Var;
        switch (this.f29725a) {
            case 0:
                s60 s60Var = (s60) this.f29726b;
                if (!s60Var.H0 && (s0Var = s60Var.R) != null && s0Var.f15105a == 3) {
                    s60Var.H0 = true;
                    try {
                        s60Var.F0 = SystemClock.elapsedRealtimeNanos();
                        s60Var.z();
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
        switch (this.f29725a) {
            case 1:
                vh.f fVar = (vh.f) this.f29726b;
                setMeasuredDimension(fVar.f49672g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
