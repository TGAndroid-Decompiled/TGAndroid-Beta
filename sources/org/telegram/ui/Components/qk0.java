package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class qk0 extends w9 {
    public final int G;
    public final rk0 H;

    public qk0(rk0 rk0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = rk0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new pk0(0, this);
            case 1:
                return new pk0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                rk0 rk0Var = this.H;
                qk0 qk0Var = rk0Var.f28051b;
                super.dispatchDraw(canvas);
                if (this.f29863a.getLottieAnimation() != null && !rk0Var.E) {
                    this.f29863a.getLottieAnimation().start();
                }
                if (rk0Var.f28056s && !rk0Var.v && this.f29863a.getLottieAnimation() != null && this.f29863a.getLottieAnimation().A() && qk0Var.f29863a.getLottieAnimation() != null && qk0Var.f29863a.getLottieAnimation().u()) {
                    rk0Var.v = true;
                    qk0Var.f29863a.getLottieAnimation().N(0, false, true);
                    qk0Var.setVisibility(0);
                    Runnable runnable = rk0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new lc0(this, 18));
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
                rk0 rk0Var = this.H;
                if (zg.e0.c(this, rk0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                rk0Var.P.invalidate();
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
                    imageReceiver = q5Var.f27555k;
                } else {
                    imageReceiver = this.f29863a;
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
        rk0 rk0Var = this.H;
        switch (i10) {
            case 0:
                if (zg.e0.c(this, rk0Var.P)) {
                    return;
                }
                super.invalidate();
                rk0Var.P.invalidate();
                return;
            case 1:
                if (zg.e0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                rk0Var.P.invalidate();
                return;
        }
    }
}
