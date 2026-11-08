package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;
public final class fi0 extends l9 {
    public final int G;
    public final gi0 H;

    public fi0(gi0 gi0Var, Context context, int i7) {
        super(context);
        this.G = i7;
        this.H = gi0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new ei0(0, this);
            case 1:
                return new ei0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                gi0 gi0Var = this.H;
                fi0 fi0Var = gi0Var.f33950b;
                super.dispatchDraw(canvas);
                if (this.f35600a.B() != null && !gi0Var.E) {
                    this.f35600a.B().start();
                }
                if (gi0Var.f33956s && !gi0Var.f33957w && this.f35600a.B() != null && this.f35600a.B().A() && fi0Var.f35600a.B() != null && fi0Var.f35600a.B().u()) {
                    gi0Var.f33957w = true;
                    fi0Var.f35600a.B().N(0, false, true);
                    fi0Var.setVisibility(0);
                    Runnable runnable = gi0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.h3(new ob0(this, 12));
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
                gi0 gi0Var = this.H;
                if (ch.e0.c(this, gi0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                gi0Var.P.invalidate();
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
                i5 i5Var = this.f35603e;
                if (i5Var != null) {
                    imageReceiver = i5Var.f34541k;
                } else {
                    imageReceiver = this.f35600a;
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
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.G) {
            case 0:
                if (ch.e0.c(this)) {
                    return;
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 1:
                if (ch.e0.c(this)) {
                    return;
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public final void invalidate() {
        int i7 = this.G;
        gi0 gi0Var = this.H;
        switch (i7) {
            case 0:
                if (ch.e0.c(this, gi0Var.P)) {
                    return;
                }
                super.invalidate();
                gi0Var.P.invalidate();
                return;
            case 1:
                if (ch.e0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                gi0Var.P.invalidate();
                return;
        }
    }
}
