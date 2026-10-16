package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class dl0 extends z9 {
    public final int G;
    public final el0 H;

    public dl0(el0 el0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = el0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new cl0(0, this);
            case 1:
                return new cl0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                el0 el0Var = this.H;
                dl0 dl0Var = el0Var.f24417b;
                super.dispatchDraw(canvas);
                if (this.f31507a.getLottieAnimation() != null && !el0Var.E) {
                    this.f31507a.getLottieAnimation().start();
                }
                if (el0Var.f24422s && !el0Var.v && this.f31507a.getLottieAnimation() != null && this.f31507a.getLottieAnimation().A() && dl0Var.f31507a.getLottieAnimation() != null && dl0Var.f31507a.getLottieAnimation().u()) {
                    el0Var.v = true;
                    dl0Var.f31507a.getLottieAnimation().N(0, false, true);
                    dl0Var.setVisibility(0);
                    Runnable runnable = el0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new yc0(this, 18));
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
                el0 el0Var = this.H;
                if (ah.x0.c(this, el0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                el0Var.P.invalidate();
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
                s5 s5Var = this.e;
                if (s5Var != null) {
                    imageReceiver = s5Var.f28739k;
                } else {
                    imageReceiver = this.f31507a;
                }
                if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().start();
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
                if (ah.x0.c(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 1:
                if (ah.x0.c(this)) {
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
        el0 el0Var = this.H;
        switch (i10) {
            case 0:
                if (ah.x0.c(this, el0Var.P)) {
                    return;
                }
                super.invalidate();
                el0Var.P.invalidate();
                return;
            case 1:
                if (ah.x0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                el0Var.P.invalidate();
                return;
        }
    }
}
