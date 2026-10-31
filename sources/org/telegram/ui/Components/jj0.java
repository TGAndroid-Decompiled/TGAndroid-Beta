package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;
public final class jj0 extends g9 {
    public final int G;
    public final kj0 H;

    public jj0(kj0 kj0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = kj0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new ij0(0, this);
            case 1:
                return new ij0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                kj0 kj0Var = this.H;
                jj0 jj0Var = kj0Var.f27772b;
                super.dispatchDraw(canvas);
                if (this.f26292a.B() != null && !kj0Var.E) {
                    this.f26292a.B().start();
                }
                if (kj0Var.f27777s && !kj0Var.f27778w && this.f26292a.B() != null && this.f26292a.B().A() && jj0Var.f26292a.B() != null && jj0Var.f26292a.B().u()) {
                    kj0Var.f27778w = true;
                    jj0Var.f26292a.B().N(0, false, true);
                    jj0Var.setVisibility(0);
                    Runnable runnable = kj0Var.P.P0;
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
                kj0 kj0Var = this.H;
                if (sg.e0.c(this, kj0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                kj0Var.P.invalidate();
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
                    imageReceiver = f5Var.f25975k;
                } else {
                    imageReceiver = this.f26292a;
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
        kj0 kj0Var = this.H;
        switch (i10) {
            case 0:
                if (sg.e0.c(this, kj0Var.P)) {
                    return;
                }
                super.invalidate();
                kj0Var.P.invalidate();
                return;
            case 1:
                if (sg.e0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                kj0Var.P.invalidate();
                return;
        }
    }
}
