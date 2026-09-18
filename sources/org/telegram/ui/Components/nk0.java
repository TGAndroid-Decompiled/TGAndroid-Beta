package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class nk0 extends w9 {
    public final int G;
    public final ok0 H;

    public nk0(ok0 ok0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = ok0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new mk0(0, this);
            case 1:
                return new mk0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                ok0 ok0Var = this.H;
                nk0 nk0Var = ok0Var.f26974b;
                super.dispatchDraw(canvas);
                if (this.f29987a.getLottieAnimation() != null && !ok0Var.E) {
                    this.f29987a.getLottieAnimation().start();
                }
                if (ok0Var.f26979s && !ok0Var.v && this.f29987a.getLottieAnimation() != null && this.f29987a.getLottieAnimation().A() && nk0Var.f29987a.getLottieAnimation() != null && nk0Var.f29987a.getLottieAnimation().u()) {
                    ok0Var.v = true;
                    nk0Var.f29987a.getLottieAnimation().N(0, false, true);
                    nk0Var.setVisibility(0);
                    Runnable runnable = ok0Var.P.P0;
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
                ok0 ok0Var = this.H;
                if (zg.e0.c(this, ok0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                ok0Var.P.invalidate();
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
                    imageReceiver = q5Var.f27461k;
                } else {
                    imageReceiver = this.f29987a;
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
                if (zg.e0.c(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 1:
                if (zg.e0.c(this)) {
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
        ok0 ok0Var = this.H;
        switch (i10) {
            case 0:
                if (zg.e0.c(this, ok0Var.P)) {
                    return;
                }
                super.invalidate();
                ok0Var.P.invalidate();
                return;
            case 1:
                if (zg.e0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                ok0Var.P.invalidate();
                return;
        }
    }
}
