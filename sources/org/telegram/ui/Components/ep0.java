package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class ep0 implements ah.m {
    public final int f23730a;
    public final ll0 f23731b;

    public ep0(ll0 ll0Var, int i10) {
        this.f23730a = i10;
        this.f23731b = ll0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f23730a) {
            case 0:
                return ((jp0) this.f23731b).drawChild(canvas, view, j3);
            default:
                return ((qt0) this.f23731b).drawChild(canvas, view, j3);
        }
    }
}
