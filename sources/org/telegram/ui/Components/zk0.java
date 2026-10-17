package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class zk0 extends w9 {
    public final int G;
    public final al0 H;

    public zk0(al0 al0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = al0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new yk0(0, this);
            case 1:
                return new yk0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                al0 al0Var = this.H;
                zk0 zk0Var = al0Var.f24650b;
                super.dispatchDraw(canvas);
                if (this.f32033a.getLottieAnimation() != null && !al0Var.E) {
                    this.f32033a.getLottieAnimation().start();
                }
                if (al0Var.f24655s && !al0Var.v && this.f32033a.getLottieAnimation() != null && this.f32033a.getLottieAnimation().A() && zk0Var.f32033a.getLottieAnimation() != null && zk0Var.f32033a.getLottieAnimation().u()) {
                    al0Var.v = true;
                    zk0Var.f32033a.getLottieAnimation().N(0, false, true);
                    zk0Var.setVisibility(0);
                    Runnable runnable = al0Var.P.P0;
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
                al0 al0Var = this.H;
                if (ah.x0.c(this, al0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                al0Var.P.invalidate();
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
                    imageReceiver = this.f32033a;
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
        al0 al0Var = this.H;
        switch (i10) {
            case 0:
                if (ah.x0.c(this, al0Var.P)) {
                    return;
                }
                super.invalidate();
                al0Var.P.invalidate();
                return;
            case 1:
                if (ah.x0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                al0Var.P.invalidate();
                return;
        }
    }
}
