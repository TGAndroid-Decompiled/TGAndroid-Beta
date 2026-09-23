package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
public final class ep0 implements ah.m {
    public final int f23732a;
    public final ml0 f23733b;

    public ep0(ml0 ml0Var, int i10) {
        this.f23732a = i10;
        this.f23733b = ml0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f23732a) {
            case 0:
                return ((jp0) this.f23733b).drawChild(canvas, view, j3);
            default:
                return ((qt0) this.f23733b).drawChild(canvas, view, j3);
        }
    }
}
