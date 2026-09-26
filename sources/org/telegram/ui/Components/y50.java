package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class y50 extends TextureView {
    public final int f30510a;
    public final Object f30511b;

    public y50(Object obj, Context context, int i10) {
        super(context);
        this.f30510a = i10;
        this.f30511b = obj;
    }

    @Override
    public void invalidate() {
        ki.r0 r0Var;
        switch (this.f30510a) {
            case 0:
                b60 b60Var = (b60) this.f30511b;
                if (!b60Var.A0 && (r0Var = b60Var.R) != null && r0Var.f13835a == 3) {
                    b60Var.A0 = true;
                    try {
                        b60Var.f22905y0 = SystemClock.elapsedRealtimeNanos();
                        b60Var.w();
                    } finally {
                        b60Var.A0 = false;
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
        switch (this.f30510a) {
            case 1:
                vh.f fVar = (vh.f) this.f30511b;
                setMeasuredDimension(fVar.f44678g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
