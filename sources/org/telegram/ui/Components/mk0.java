package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class mk0 extends w9 {
    public final int G;
    public final nk0 H;

    public mk0(nk0 nk0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = nk0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new lk0(0, this);
            case 1:
                return new lk0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                nk0 nk0Var = this.H;
                mk0 mk0Var = nk0Var.f25541b;
                super.dispatchDraw(canvas);
                if (this.f28728a.getLottieAnimation() != null && !nk0Var.E) {
                    this.f28728a.getLottieAnimation().start();
                }
                if (nk0Var.f25546s && !nk0Var.v && this.f28728a.getLottieAnimation() != null && this.f28728a.getLottieAnimation().A() && mk0Var.f28728a.getLottieAnimation() != null && mk0Var.f28728a.getLottieAnimation().u()) {
                    nk0Var.v = true;
                    mk0Var.f28728a.getLottieAnimation().N(0, false, true);
                    mk0Var.setVisibility(0);
                    Runnable runnable = nk0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new kc0(this, 17));
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
                nk0 nk0Var = this.H;
                if (yg.f0.c(this, nk0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                nk0Var.P.invalidate();
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
                p5 p5Var = this.e;
                if (p5Var != null) {
                    imageReceiver = p5Var.f26033k;
                } else {
                    imageReceiver = this.f28728a;
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
                if (yg.f0.c(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 1:
                if (yg.f0.c(this)) {
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
        nk0 nk0Var = this.H;
        switch (i10) {
            case 0:
                if (yg.f0.c(this, nk0Var.P)) {
                    return;
                }
                super.invalidate();
                nk0Var.P.invalidate();
                return;
            case 1:
                if (yg.f0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                nk0Var.P.invalidate();
                return;
        }
    }
}
