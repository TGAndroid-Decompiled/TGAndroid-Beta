package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class a60 extends TextureView {
    public final int f22559a;
    public final Object f22560b;

    public a60(Object obj, Context context, int i10) {
        super(context);
        this.f22559a = i10;
        this.f22560b = obj;
    }

    @Override
    public void invalidate() {
        ki.r0 r0Var;
        switch (this.f22559a) {
            case 0:
                d60 d60Var = (d60) this.f22560b;
                if (!d60Var.A0 && (r0Var = d60Var.R) != null && r0Var.f13835a == 3) {
                    d60Var.A0 = true;
                    try {
                        d60Var.f23563y0 = SystemClock.elapsedRealtimeNanos();
                        d60Var.w();
                    } finally {
                        d60Var.A0 = false;
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
        switch (this.f22559a) {
            case 1:
                vh.f fVar = (vh.f) this.f22560b;
                setMeasuredDimension(fVar.f44678g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
