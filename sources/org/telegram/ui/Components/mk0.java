package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class mk0 extends p9 {
    public final int D;
    public final nk0 E;

    public mk0(nk0 nk0Var, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = nk0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.D) {
            case 0:
                return new lk0(0, this);
            case 1:
                return new lk0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.D) {
            case 0:
                nk0 nk0Var = this.E;
                mk0 mk0Var = nk0Var.f27285b;
                super.dispatchDraw(canvas);
                if (this.f27801a.getLottieAnimation() != null && !nk0Var.B) {
                    this.f27801a.getLottieAnimation().start();
                }
                if (nk0Var.f27290s && !nk0Var.v && this.f27801a.getLottieAnimation() != null && this.f27801a.getLottieAnimation().y() && mk0Var.f27801a.getLottieAnimation() != null && mk0Var.f27801a.getLottieAnimation().s()) {
                    nk0Var.v = true;
                    mk0Var.f27801a.getLottieAnimation().L(0, false, true);
                    mk0Var.setVisibility(0);
                    Runnable runnable = nk0Var.M.M0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new dc0(this, 17));
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
                nk0 nk0Var = this.E;
                if (mg.g0.c(this, nk0Var.M)) {
                    return;
                }
                super.invalidate(rect);
                nk0Var.M.invalidate();
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
                l5 l5Var = this.e;
                if (l5Var != null) {
                    imageReceiver = l5Var.f26587k;
                } else {
                    imageReceiver = this.f27801a;
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
                if (mg.g0.c(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 1:
                if (mg.g0.c(this)) {
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
        nk0 nk0Var = this.E;
        switch (i10) {
            case 0:
                if (mg.g0.c(this, nk0Var.M)) {
                    return;
                }
                super.invalidate();
                nk0Var.M.invalidate();
                return;
            case 1:
                if (mg.g0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                nk0Var.M.invalidate();
                return;
        }
    }
}
