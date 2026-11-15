package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;
public final class ji0 extends i9 {
    public final int H;
    public final ki0 I;

    public ji0(ki0 ki0Var, Context context, int i7) {
        super(context);
        this.H = i7;
        this.I = ki0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.H) {
            case 0:
                return new ii0(0, this);
            case 1:
                return new ii0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                ki0 ki0Var = this.I;
                ji0 ji0Var = ki0Var.f36513b;
                super.dispatchDraw(canvas);
                if (this.f35499a.B() != null && !ki0Var.F) {
                    this.f35499a.B().start();
                }
                if (ki0Var.f36519s && !ki0Var.f36520w && this.f35499a.B() != null && this.f35499a.B().A() && ji0Var.f35499a.B() != null && ji0Var.f35499a.B().u()) {
                    ki0Var.f36520w = true;
                    ji0Var.f35499a.B().N(0, false, true);
                    ji0Var.setVisibility(0);
                    Runnable runnable = ki0Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.h3(new wa0(this, 14));
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
        switch (this.H) {
            case 0:
                ki0 ki0Var = this.I;
                if (ch.f0.c(this, ki0Var.Q)) {
                    return;
                }
                super.invalidate(rect);
                ki0Var.Q.invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        switch (this.H) {
            case 1:
                this.I.b();
                super.onDraw(canvas);
                return;
            case 2:
                g5 g5Var = this.f35502e;
                if (g5Var != null) {
                    imageReceiver = g5Var.f34813k;
                } else {
                    imageReceiver = this.f35499a;
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
        switch (this.H) {
            case 0:
                if (ch.f0.c(this)) {
                    return;
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 1:
                if (ch.f0.c(this)) {
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
        int i7 = this.H;
        ki0 ki0Var = this.I;
        switch (i7) {
            case 0:
                if (ch.f0.c(this, ki0Var.Q)) {
                    return;
                }
                super.invalidate();
                ki0Var.Q.invalidate();
                return;
            case 1:
                if (ch.f0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                ki0Var.Q.invalidate();
                return;
        }
    }
}
