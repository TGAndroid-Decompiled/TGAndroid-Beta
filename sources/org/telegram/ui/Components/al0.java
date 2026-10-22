package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class al0 extends w9 {
    public final int G;
    public final bl0 H;

    public al0(bl0 bl0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = bl0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new zk0(0, this);
            case 1:
                return new zk0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                bl0 bl0Var = this.H;
                al0 al0Var = bl0Var.f24979b;
                super.dispatchDraw(canvas);
                if (this.f31996a.getLottieAnimation() != null && !bl0Var.E) {
                    this.f31996a.getLottieAnimation().start();
                }
                if (bl0Var.f24984s && !bl0Var.v && this.f31996a.getLottieAnimation() != null && this.f31996a.getLottieAnimation().A() && al0Var.f31996a.getLottieAnimation() != null && al0Var.f31996a.getLottieAnimation().u()) {
                    bl0Var.v = true;
                    al0Var.f31996a.getLottieAnimation().N(0, false, true);
                    al0Var.setVisibility(0);
                    Runnable runnable = bl0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new rc0(this, 17));
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
                bl0 bl0Var = this.H;
                if (ah.x0.c(this, bl0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                bl0Var.P.invalidate();
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
                r5 r5Var = this.e;
                if (r5Var != null) {
                    imageReceiver = r5Var.f29841k;
                } else {
                    imageReceiver = this.f31996a;
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
        bl0 bl0Var = this.H;
        switch (i10) {
            case 0:
                if (ah.x0.c(this, bl0Var.P)) {
                    return;
                }
                super.invalidate();
                bl0Var.P.invalidate();
                return;
            case 1:
                if (ah.x0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                bl0Var.P.invalidate();
                return;
        }
    }
}
