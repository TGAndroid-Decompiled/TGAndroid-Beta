package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class dk0 extends u9 {
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
                dk0 dk0Var = ek0Var.f23584b;
                super.dispatchDraw(canvas);
                if (this.f28304a.getLottieAnimation() != null && !ek0Var.E) {
                    this.f28304a.getLottieAnimation().start();
                }
                if (ek0Var.f23589s && !ek0Var.v && this.f28304a.getLottieAnimation() != null && this.f28304a.getLottieAnimation().A() && dk0Var.f28304a.getLottieAnimation() != null && dk0Var.f28304a.getLottieAnimation().u()) {
                    ek0Var.v = true;
                    dk0Var.f28304a.getLottieAnimation().N(0, false, true);
                    dk0Var.setVisibility(0);
                    Runnable runnable = ek0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new bc0(this, 17));
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
                o5 o5Var = this.e;
                if (o5Var != null) {
                    imageReceiver = o5Var.f26639k;
                } else {
                    imageReceiver = this.f28304a;
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
