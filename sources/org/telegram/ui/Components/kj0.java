package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;
public final class kj0 extends g9 {
    public final int G;
    public final lj0 H;

    public kj0(lj0 lj0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = lj0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new jj0(0, this);
            case 1:
                return new jj0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                lj0 lj0Var = this.H;
                kj0 kj0Var = lj0Var.f28183b;
                super.dispatchDraw(canvas);
                if (this.f26357a.B() != null && !lj0Var.E) {
                    this.f26357a.B().start();
                }
                if (lj0Var.f28188s && !lj0Var.f28189w && this.f26357a.B() != null && this.f26357a.B().A() && kj0Var.f26357a.B() != null && kj0Var.f26357a.B().u()) {
                    lj0Var.f28189w = true;
                    kj0Var.f26357a.B().N(0, false, true);
                    kj0Var.setVisibility(0);
                    Runnable runnable = lj0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.i0.g3(new eb0(this, 17));
                }
                invalidate();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 0:
                lj0 lj0Var = this.H;
                if (sg.e0.c(this, lj0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                lj0Var.P.invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        switch (this.G) {
            case 1:
                this.H.b();
                super.onDraw(canvas);
                return;
            case 2:
                f5 f5Var = this.e;
                if (f5Var != null) {
                    imageReceiver = f5Var.f26070k;
                } else {
                    imageReceiver = this.f26357a;
                }
                if (imageReceiver != null && imageReceiver.B() != null) {
                    imageReceiver.B().start();
                }
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.G) {
            case 0:
                if (sg.e0.c(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 1:
                if (sg.e0.c(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public final void invalidate() {
        int i10 = this.G;
        lj0 lj0Var = this.H;
        switch (i10) {
            case 0:
                if (sg.e0.c(this, lj0Var.P)) {
                    return;
                }
                super.invalidate();
                lj0Var.P.invalidate();
                return;
            case 1:
                if (sg.e0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                lj0Var.P.invalidate();
                return;
        }
    }
}
