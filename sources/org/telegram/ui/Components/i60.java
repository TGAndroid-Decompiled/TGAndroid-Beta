package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class i60 extends TextureView {
    public final int f27087a;
    public final Object f27088b;

    public i60(Object obj, Context context, int i10) {
        super(context);
        this.f27087a = i10;
        this.f27088b = obj;
    }

    @Override
    public void invalidate() {
        si.r0 r0Var;
        switch (this.f27087a) {
            case 0:
                l60 l60Var = (l60) this.f27088b;
                if (!l60Var.H0 && (r0Var = l60Var.R) != null && r0Var.f46751a == 3) {
                    l60Var.H0 = true;
                    try {
                        l60Var.F0 = SystemClock.elapsedRealtimeNanos();
                        l60Var.A();
                    } finally {
                        l60Var.H0 = false;
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
        switch (this.f27087a) {
            case 1:
                wh.f fVar = (wh.f) this.f27088b;
                setMeasuredDimension(fVar.f49040g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
