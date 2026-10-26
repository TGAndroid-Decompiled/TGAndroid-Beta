package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class k60 extends TextureView {
    public final int f29820a;
    public final Object f29821b;

    public k60(Object obj, Context context, int i10) {
        super(context);
        this.f29820a = i10;
        this.f29821b = obj;
    }

    @Override
    public void invalidate() {
        vi.r0 r0Var;
        switch (this.f29820a) {
            case 0:
                n60 n60Var = (n60) this.f29821b;
                if (!n60Var.H0 && (r0Var = n60Var.R) != null && r0Var.f50534a == 3) {
                    n60Var.H0 = true;
                    try {
                        n60Var.F0 = SystemClock.elapsedRealtimeNanos();
                        n60Var.A();
                    } finally {
                        n60Var.H0 = false;
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
        switch (this.f29820a) {
            case 1:
                xh.f fVar = (xh.f) this.f29821b;
                setMeasuredDimension(fVar.f51854g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
