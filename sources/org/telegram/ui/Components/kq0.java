package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class kq0 implements ah.m {
    public final int f28081a;
    public final rm0 f28082b;

    public kq0(rm0 rm0Var, int i10) {
        this.f28081a = i10;
        this.f28082b = rm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f28081a) {
            case 0:
                return ((pq0) this.f28082b).drawChild(canvas, view, j3);
            default:
                return ((uu0) this.f28082b).drawChild(canvas, view, j3);
        }
    }
}
