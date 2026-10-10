package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class il0 extends y9 {
    public final int G;
    public final jl0 H;

    public il0(jl0 jl0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = jl0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new hl0(0, this);
            case 1:
                return new hl0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                jl0 jl0Var = this.H;
                il0 il0Var = jl0Var.f27718b;
                super.dispatchDraw(canvas);
                if (this.f33135a.getLottieAnimation() != null && !jl0Var.E) {
                    this.f33135a.getLottieAnimation().start();
                }
                if (jl0Var.f27724s && !jl0Var.v && this.f33135a.getLottieAnimation() != null && this.f33135a.getLottieAnimation().A() && il0Var.f33135a.getLottieAnimation() != null && il0Var.f33135a.getLottieAnimation().u()) {
                    jl0Var.v = true;
                    il0Var.f33135a.getLottieAnimation().N(0, false, true);
                    il0Var.setVisibility(0);
                    Runnable runnable = jl0Var.P.P0;
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
                jl0 jl0Var = this.H;
                if (zg.d0.c(this, jl0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                jl0Var.P.invalidate();
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
                s5 s5Var = this.f33138e;
                if (s5Var != null) {
                    imageReceiver = s5Var.f30680k;
                } else {
                    imageReceiver = this.f33135a;
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
        jl0 jl0Var = this.H;
        switch (i10) {
            case 0:
                if (zg.d0.c(this, jl0Var.P)) {
                    return;
                }
                super.invalidate();
                jl0Var.P.invalidate();
                return;
            case 1:
                if (zg.d0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                jl0Var.P.invalidate();
                return;
        }
    }
}
