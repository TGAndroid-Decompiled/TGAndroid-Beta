package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class b60 extends TextureView {
    public final int f24803a;
    public final Object f24804b;

    public b60(Object obj, Context context, int i10) {
        super(context);
        this.f24803a = i10;
        this.f24804b = obj;
    }

    @Override
    public void invalidate() {
        ki.r0 r0Var;
        switch (this.f24803a) {
            case 0:
                e60 e60Var = (e60) this.f24804b;
                if (!e60Var.A0 && (r0Var = e60Var.R) != null && r0Var.f15036a == 3) {
                    e60Var.A0 = true;
                    try {
                        e60Var.f25976y0 = SystemClock.elapsedRealtimeNanos();
                        e60Var.w();
                    } finally {
                        e60Var.A0 = false;
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
        switch (this.f24803a) {
            case 1:
                vh.f fVar = (vh.f) this.f24804b;
                setMeasuredDimension(fVar.f48385g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
