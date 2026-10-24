package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class cl0 extends u9 {
    public final int G;
    public final dl0 H;

    public cl0(dl0 dl0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = dl0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new bl0(0, this);
            case 1:
                return new bl0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                dl0 dl0Var = this.H;
                cl0 cl0Var = dl0Var.f25780b;
                super.dispatchDraw(canvas);
                if (this.f31064a.getLottieAnimation() != null && !dl0Var.E) {
                    this.f31064a.getLottieAnimation().start();
                }
                if (dl0Var.f25785s && !dl0Var.v && this.f31064a.getLottieAnimation() != null && this.f31064a.getLottieAnimation().A() && cl0Var.f31064a.getLottieAnimation() != null && cl0Var.f31064a.getLottieAnimation().u()) {
                    dl0Var.v = true;
                    cl0Var.f31064a.getLottieAnimation().N(0, false, true);
                    cl0Var.setVisibility(0);
                    Runnable runnable = dl0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new wb0(this, 18));
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
                dl0 dl0Var = this.H;
                if (ah.x0.c(this, dl0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                dl0Var.P.invalidate();
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
                    imageReceiver = p5Var.f29484k;
                } else {
                    imageReceiver = this.f31064a;
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
        dl0 dl0Var = this.H;
        switch (i10) {
            case 0:
                if (ah.x0.c(this, dl0Var.P)) {
                    return;
                }
                super.invalidate();
                dl0Var.P.invalidate();
                return;
            case 1:
                if (ah.x0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                dl0Var.P.invalidate();
                return;
        }
    }
}
