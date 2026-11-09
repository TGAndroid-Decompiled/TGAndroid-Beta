package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;
public final class gi0 extends l9 {
    public final int G;
    public final hi0 H;

    public gi0(hi0 hi0Var, Context context, int i7) {
        super(context);
        this.G = i7;
        this.H = hi0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new fi0(0, this);
            case 1:
                return new fi0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                hi0 hi0Var = this.H;
                gi0 gi0Var = hi0Var.f34304b;
                super.dispatchDraw(canvas);
                if (this.f35647a.B() != null && !hi0Var.E) {
                    this.f35647a.B().start();
                }
                if (hi0Var.f34310s && !hi0Var.f34311w && this.f35647a.B() != null && this.f35647a.B().A() && gi0Var.f35647a.B() != null && gi0Var.f35647a.B().u()) {
                    hi0Var.f34311w = true;
                    gi0Var.f35647a.B().N(0, false, true);
                    gi0Var.setVisibility(0);
                    Runnable runnable = hi0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.h3(new pb0(this, 12));
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
                hi0 hi0Var = this.H;
                if (ch.e0.c(this, hi0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                hi0Var.P.invalidate();
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
                i5 i5Var = this.f35650e;
                if (i5Var != null) {
                    imageReceiver = i5Var.f34568k;
                } else {
                    imageReceiver = this.f35647a;
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
        hi0 hi0Var = this.H;
        switch (i7) {
            case 0:
                if (ch.e0.c(this, hi0Var.P)) {
                    return;
                }
                super.invalidate();
                hi0Var.P.invalidate();
                return;
            case 1:
                if (ch.e0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                hi0Var.P.invalidate();
                return;
        }
    }
}
