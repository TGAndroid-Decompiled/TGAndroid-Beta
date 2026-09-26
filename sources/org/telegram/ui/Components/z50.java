package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class z50 extends TextureView {
    public final int f30797a;
    public final Object f30798b;

    public z50(Object obj, Context context, int i10) {
        super(context);
        this.f30797a = i10;
        this.f30798b = obj;
    }

    @Override
    public void invalidate() {
        ki.r0 r0Var;
        switch (this.f30797a) {
            case 0:
                c60 c60Var = (c60) this.f30798b;
                if (!c60Var.A0 && (r0Var = c60Var.R) != null && r0Var.f13835a == 3) {
                    c60Var.A0 = true;
                    try {
                        c60Var.f23248y0 = SystemClock.elapsedRealtimeNanos();
                        c60Var.w();
                    } finally {
                        c60Var.A0 = false;
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
        switch (this.f30797a) {
            case 1:
                vh.f fVar = (vh.f) this.f30798b;
                setMeasuredDimension(fVar.f44677g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
