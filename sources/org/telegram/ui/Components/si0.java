package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;
public final class si0 extends q9 {
    public final int H;
    public final ti0 I;

    public si0(ti0 ti0Var, Context context, int i7) {
        super(context);
        this.H = i7;
        this.I = ti0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.H) {
            case 0:
                return new ri0(0, this);
            case 1:
                return new ri0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                ti0 ti0Var = this.I;
                si0 si0Var = ti0Var.f40010b;
                super.dispatchDraw(canvas);
                if (this.f38742a.B() != null && !ti0Var.F) {
                    this.f38742a.B().start();
                }
                if (ti0Var.f40016s && !ti0Var.f40017w && this.f38742a.B() != null && this.f38742a.B().A() && si0Var.f38742a.B() != null && si0Var.f38742a.B().u()) {
                    ti0Var.f40017w = true;
                    si0Var.f38742a.B().N(0, false, true);
                    si0Var.setVisibility(0);
                    Runnable runnable = ti0Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.g3(new gb0(this, 14));
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
                ti0 ti0Var = this.I;
                if (ch.f0.c(this, ti0Var.Q)) {
                    return;
                }
                super.invalidate(rect);
                ti0Var.Q.invalidate();
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
                o5 o5Var = this.f38745e;
                if (o5Var != null) {
                    imageReceiver = o5Var.f37976k;
                } else {
                    imageReceiver = this.f38742a;
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
        ti0 ti0Var = this.I;
        switch (i7) {
            case 0:
                if (ch.f0.c(this, ti0Var.Q)) {
                    return;
                }
                super.invalidate();
                ti0Var.Q.invalidate();
                return;
            case 1:
                if (ch.f0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                ti0Var.Q.invalidate();
                return;
        }
    }
}
