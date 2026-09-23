package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class dk0 extends w9 {
    public final int G;
    public final ek0 H;

    public dk0(ek0 ek0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = ek0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new ck0(0, this);
            case 1:
                return new ck0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                ek0 ek0Var = this.H;
                dk0 dk0Var = ek0Var.f23707b;
                super.dispatchDraw(canvas);
                if (this.f29579a.getLottieAnimation() != null && !ek0Var.E) {
                    this.f29579a.getLottieAnimation().start();
                }
                if (ek0Var.f23712s && !ek0Var.v && this.f29579a.getLottieAnimation() != null && this.f29579a.getLottieAnimation().A() && dk0Var.f29579a.getLottieAnimation() != null && dk0Var.f29579a.getLottieAnimation().u()) {
                    ek0Var.v = true;
                    dk0Var.f29579a.getLottieAnimation().N(0, false, true);
                    dk0Var.setVisibility(0);
                    Runnable runnable = ek0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new ac0(this, 17));
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
                ek0 ek0Var = this.H;
                if (zg.f0.c(this, ek0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                ek0Var.P.invalidate();
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
                q5 q5Var = this.e;
                if (q5Var != null) {
                    imageReceiver = q5Var.f27230k;
                } else {
                    imageReceiver = this.f29579a;
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
                if (zg.f0.c(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 1:
                if (zg.f0.c(this)) {
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
        ek0 ek0Var = this.H;
        switch (i10) {
            case 0:
                if (zg.f0.c(this, ek0Var.P)) {
                    return;
                }
                super.invalidate();
                ek0Var.P.invalidate();
                return;
            case 1:
                if (zg.f0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                ek0Var.P.invalidate();
                return;
        }
    }
}
