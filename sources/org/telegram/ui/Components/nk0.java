package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class nk0 extends p9 {
    public final int D;
    public final ok0 E;

    public nk0(ok0 ok0Var, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = ok0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.D) {
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
        switch (this.D) {
            case 0:
                ok0 ok0Var = this.E;
                nk0 nk0Var = ok0Var.f29792b;
                super.dispatchDraw(canvas);
                if (this.f30011a.getLottieAnimation() != null && !ok0Var.B) {
                    this.f30011a.getLottieAnimation().start();
                }
                if (ok0Var.f29798s && !ok0Var.v && this.f30011a.getLottieAnimation() != null && this.f30011a.getLottieAnimation().y() && nk0Var.f30011a.getLottieAnimation() != null && nk0Var.f30011a.getLottieAnimation().s()) {
                    ok0Var.v = true;
                    nk0Var.f30011a.getLottieAnimation().L(0, false, true);
                    nk0Var.setVisibility(0);
                    Runnable runnable = ok0Var.M.M0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new ec0(this, 17));
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
        switch (this.D) {
            case 0:
                ok0 ok0Var = this.E;
                if (ng.g0.c(this, ok0Var.M)) {
                    return;
                }
                super.invalidate(rect);
                ok0Var.M.invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        switch (this.D) {
            case 1:
                this.E.b();
                super.onDraw(canvas);
                return;
            case 2:
                l5 l5Var = this.f30014e;
                if (l5Var != null) {
                    imageReceiver = l5Var.f28637k;
                } else {
                    imageReceiver = this.f30011a;
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
        switch (this.D) {
            case 0:
                if (ng.g0.c(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 1:
                if (ng.g0.c(this)) {
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
        int i10 = this.D;
        ok0 ok0Var = this.E;
        switch (i10) {
            case 0:
                if (ng.g0.c(this, ok0Var.M)) {
                    return;
                }
                super.invalidate();
                ok0Var.M.invalidate();
                return;
            case 1:
                if (ng.g0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                ok0Var.M.invalidate();
                return;
        }
    }
}
