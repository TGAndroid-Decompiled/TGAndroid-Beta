package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class kl0 extends y9 {
    public final int G;
    public final ll0 H;

    public kl0(ll0 ll0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = ll0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new jl0(0, this);
            case 1:
                return new jl0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                ll0 ll0Var = this.H;
                kl0 kl0Var = ll0Var.f28219b;
                super.dispatchDraw(canvas);
                if (this.f32994a.getLottieAnimation() != null && !ll0Var.E) {
                    this.f32994a.getLottieAnimation().start();
                }
                if (ll0Var.f28225s && !ll0Var.v && this.f32994a.getLottieAnimation() != null && this.f32994a.getLottieAnimation().A() && kl0Var.f32994a.getLottieAnimation() != null && kl0Var.f32994a.getLottieAnimation().u()) {
                    ll0Var.v = true;
                    kl0Var.f32994a.getLottieAnimation().N(0, false, true);
                    kl0Var.setVisibility(0);
                    Runnable runnable = ll0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new cd0(this, 18));
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
                ll0 ll0Var = this.H;
                if (zg.d0.c(this, ll0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                ll0Var.P.invalidate();
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
                s5 s5Var = this.f32997e;
                if (s5Var != null) {
                    imageReceiver = s5Var.f30402k;
                } else {
                    imageReceiver = this.f32994a;
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
        ll0 ll0Var = this.H;
        switch (i10) {
            case 0:
                if (zg.d0.c(this, ll0Var.P)) {
                    return;
                }
                super.invalidate();
                ll0Var.P.invalidate();
                return;
            case 1:
                if (zg.d0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                ll0Var.P.invalidate();
                return;
        }
    }
}
