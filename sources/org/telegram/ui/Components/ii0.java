package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;
public final class ii0 extends k9 {
    public final int H;
    public final ji0 I;

    public ii0(ji0 ji0Var, Context context, int i3) {
        super(context);
        this.H = i3;
        this.I = ji0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.H) {
            case 0:
                return new hi0(0, this);
            case 1:
                return new hi0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                ji0 ji0Var = this.I;
                ii0 ii0Var = ji0Var.f35078b;
                super.dispatchDraw(canvas);
                if (this.f35342a.B() != null && !ji0Var.F) {
                    this.f35342a.B().start();
                }
                if (ji0Var.f35084s && !ji0Var.f35085w && this.f35342a.B() != null && this.f35342a.B().A() && ii0Var.f35342a.B() != null && ii0Var.f35342a.B().u()) {
                    ji0Var.f35085w = true;
                    ii0Var.f35342a.B().N(0, false, true);
                    ii0Var.setVisibility(0);
                    Runnable runnable = ji0Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.h3(new jb0(this, 14));
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
                ji0 ji0Var = this.I;
                if (dh.d0.c(this, ji0Var.Q)) {
                    return;
                }
                super.invalidate(rect);
                ji0Var.Q.invalidate();
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
                g5 g5Var = this.f35345e;
                if (g5Var != null) {
                    imageReceiver = g5Var.f33971k;
                } else {
                    imageReceiver = this.f35342a;
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
    public void invalidate(int i3, int i10, int i11, int i12) {
        switch (this.H) {
            case 0:
                if (dh.d0.c(this)) {
                    return;
                }
                super.invalidate(i3, i10, i11, i12);
                return;
            case 1:
                if (dh.d0.c(this)) {
                    return;
                }
                super.invalidate(i3, i10, i11, i12);
                return;
            default:
                super.invalidate(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public final void invalidate() {
        int i3 = this.H;
        ji0 ji0Var = this.I;
        switch (i3) {
            case 0:
                if (dh.d0.c(this, ji0Var.Q)) {
                    return;
                }
                super.invalidate();
                ji0Var.Q.invalidate();
                return;
            case 1:
                if (dh.d0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                ji0Var.Q.invalidate();
                return;
        }
    }
}
