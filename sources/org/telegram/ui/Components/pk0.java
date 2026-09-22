package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class pk0 extends v9 {
    public final int G;
    public final qk0 H;

    public pk0(qk0 qk0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = qk0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new ok0(0, this);
            case 1:
                return new ok0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                qk0 qk0Var = this.H;
                pk0 pk0Var = qk0Var.f27589b;
                super.dispatchDraw(canvas);
                if (this.f29034a.getLottieAnimation() != null && !qk0Var.E) {
                    this.f29034a.getLottieAnimation().start();
                }
                if (qk0Var.f27594s && !qk0Var.v && this.f29034a.getLottieAnimation() != null && this.f29034a.getLottieAnimation().A() && pk0Var.f29034a.getLottieAnimation() != null && pk0Var.f29034a.getLottieAnimation().u()) {
                    qk0Var.v = true;
                    pk0Var.f29034a.getLottieAnimation().N(0, false, true);
                    pk0Var.setVisibility(0);
                    Runnable runnable = qk0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new jc0(this, 18));
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
                qk0 qk0Var = this.H;
                if (zg.f0.c(this, qk0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                qk0Var.P.invalidate();
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
                p5 p5Var = this.e;
                if (p5Var != null) {
                    imageReceiver = p5Var.f27256k;
                } else {
                    imageReceiver = this.f29034a;
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
        qk0 qk0Var = this.H;
        switch (i10) {
            case 0:
                if (zg.f0.c(this, qk0Var.P)) {
                    return;
                }
                super.invalidate();
                qk0Var.P.invalidate();
                return;
            case 1:
                if (zg.f0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                qk0Var.P.invalidate();
                return;
        }
    }
}
