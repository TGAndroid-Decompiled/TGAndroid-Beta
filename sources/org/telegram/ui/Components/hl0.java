package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class hl0 extends y9 {
    public final int G;
    public final il0 H;

    public hl0(il0 il0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = il0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new gl0(0, this);
            case 1:
                return new gl0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                il0 il0Var = this.H;
                hl0 hl0Var = il0Var.f27421b;
                super.dispatchDraw(canvas);
                if (this.f33156a.getLottieAnimation() != null && !il0Var.E) {
                    this.f33156a.getLottieAnimation().start();
                }
                if (il0Var.f27427s && !il0Var.v && this.f33156a.getLottieAnimation() != null && this.f33156a.getLottieAnimation().A() && hl0Var.f33156a.getLottieAnimation() != null && hl0Var.f33156a.getLottieAnimation().u()) {
                    il0Var.v = true;
                    hl0Var.f33156a.getLottieAnimation().N(0, false, true);
                    hl0Var.setVisibility(0);
                    Runnable runnable = il0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new bd0(this, 17));
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
                il0 il0Var = this.H;
                if (zg.d0.c(this, il0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                il0Var.P.invalidate();
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
                s5 s5Var = this.f33159e;
                if (s5Var != null) {
                    imageReceiver = s5Var.f30654k;
                } else {
                    imageReceiver = this.f33156a;
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
                if (zg.d0.c(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 1:
                if (zg.d0.c(this)) {
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
        il0 il0Var = this.H;
        switch (i10) {
            case 0:
                if (zg.d0.c(this, il0Var.P)) {
                    return;
                }
                super.invalidate();
                il0Var.P.invalidate();
                return;
            case 1:
                if (zg.d0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                il0Var.P.invalidate();
                return;
        }
    }
}
