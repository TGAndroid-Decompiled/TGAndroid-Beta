package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class jl0 extends y9 {
    public final int G;
    public final kl0 H;

    public jl0(kl0 kl0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = kl0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new il0(0, this);
            case 1:
                return new il0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                kl0 kl0Var = this.H;
                jl0 jl0Var = kl0Var.f28031b;
                super.dispatchDraw(canvas);
                if (this.f33130a.getLottieAnimation() != null && !kl0Var.E) {
                    this.f33130a.getLottieAnimation().start();
                }
                if (kl0Var.f28037s && !kl0Var.v && this.f33130a.getLottieAnimation() != null && this.f33130a.getLottieAnimation().A() && jl0Var.f33130a.getLottieAnimation() != null && jl0Var.f33130a.getLottieAnimation().u()) {
                    kl0Var.v = true;
                    jl0Var.f33130a.getLottieAnimation().N(0, false, true);
                    jl0Var.setVisibility(0);
                    Runnable runnable = kl0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new cd0(this, 17));
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
                kl0 kl0Var = this.H;
                if (zg.d0.c(this, kl0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                kl0Var.P.invalidate();
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
                s5 s5Var = this.f33133e;
                if (s5Var != null) {
                    imageReceiver = s5Var.f30634k;
                } else {
                    imageReceiver = this.f33130a;
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
        kl0 kl0Var = this.H;
        switch (i10) {
            case 0:
                if (zg.d0.c(this, kl0Var.P)) {
                    return;
                }
                super.invalidate();
                kl0Var.P.invalidate();
                return;
            case 1:
                if (zg.d0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                kl0Var.P.invalidate();
                return;
        }
    }
}
