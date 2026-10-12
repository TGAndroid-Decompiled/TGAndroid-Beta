package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class s60 extends TextureView {
    public final int f30423a;
    public final Object f30424b;

    public s60(Object obj, Context context, int i10) {
        super(context);
        this.f30423a = i10;
        this.f30424b = obj;
    }

    @Override
    public void invalidate() {
        qi.o0 o0Var;
        switch (this.f30423a) {
            case 0:
                v60 v60Var = (v60) this.f30424b;
                if (!v60Var.H0 && (o0Var = v60Var.R) != null && o0Var.f46809a == 3) {
                    v60Var.H0 = true;
                    try {
                        v60Var.F0 = SystemClock.elapsedRealtimeNanos();
                        v60Var.A();
                    } finally {
                        v60Var.H0 = false;
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
        switch (this.f30423a) {
            case 1:
                vh.f fVar = (vh.f) this.f30424b;
                setMeasuredDimension(fVar.f49902g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
