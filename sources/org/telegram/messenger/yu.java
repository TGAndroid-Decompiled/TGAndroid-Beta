package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.k51;
public final class yu extends au implements Drawable.Callback {
    public final k51 X;
    public final int Y;
    public final int Z;
    public final int f28214a0;
    public final int f28215b0;
    public w7.s f28216c0;
    public Bitmap f28217d0;

    public yu(fv fvVar, Rect rect, int i7, int i10, int i11) {
        super(fvVar, rect, i7);
        this.f28214a0 = i10;
        this.f28215b0 = i11;
        k51 k51Var = new k51();
        this.X = k51Var;
        k51Var.setCallback(this);
        k51Var.f36798n = hd.N0(2131743586, null);
        k51Var.f36799o = hd.N0(2131743587, null);
        k51Var.f36800p = hd.N0(2131743581, null);
        k51Var.f36794j = new yr(fvVar, 7);
        int i12 = this.f22970c;
        this.Y = i12;
        this.Z = k51Var.a(i12);
    }

    @Override
    public final int I() {
        Rect rect = this.f22969b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        View view = this.W;
        if (view != null) {
            return this.X.f36793i.a(view, motionEvent);
        }
        return false;
    }

    public final float i0(org.telegram.ui.Cells.y1 y1Var) {
        int i7;
        if (y1Var != null) {
            fv fvVar = this.f22968a;
            if (fvVar.f23992s || fvVar.f23994u) {
                i7 = g0.W1(Math.max(0.0f, Math.min(1.0f, y1Var.L1)), this.Q, this.O);
                return i7;
            }
        }
        i7 = this.O;
        return i7;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    public final float j0(org.telegram.ui.Cells.y1 y1Var) {
        if (y1Var != null) {
            fv fvVar = this.f22968a;
            if (fvVar.f23992s || fvVar.f23994u) {
                return g0.T1(this.P, this.N, Math.max(0.0f, Math.min(1.0f, y1Var.L1)));
            }
        }
        return this.N;
    }

    @Override
    public final void q(Canvas canvas) {
        Rect rect = this.f22969b;
        int i7 = rect.left;
        int i10 = rect.top;
        k51 k51Var = this.X;
        k51Var.setBounds(i7, i10, this.Y + i7, this.Z + i10);
        k51Var.draw(canvas);
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
    }
}
