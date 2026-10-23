package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;
public final class j60 extends TextureView {
    public final int f27528a;
    public final Object f27529b;

    public j60(Object obj, Context context, int i10) {
        super(context);
        this.f27528a = i10;
        this.f27529b = obj;
    }

    @Override
    public void invalidate() {
        si.t0 t0Var;
        switch (this.f27528a) {
            case 0:
                m60 m60Var = (m60) this.f27529b;
                if (!m60Var.H0 && (t0Var = m60Var.R) != null && t0Var.f47242a == 3) {
                    m60Var.H0 = true;
                    try {
                        m60Var.F0 = SystemClock.elapsedRealtimeNanos();
                        m60Var.A();
                    } finally {
                        m60Var.H0 = false;
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
        switch (this.f27528a) {
            case 1:
                wh.f fVar = (wh.f) this.f27529b;
                setMeasuredDimension(fVar.f49492g, fVar.h);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
