package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class rj0 extends o9 {
    public final int C;
    public final sj0 D;

    public rj0(sj0 sj0Var, Context context, int i9) {
        super(context);
        this.C = i9;
        this.D = sj0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.C) {
            case 0:
                return new qj0(0, this);
            case 1:
                return new qj0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.C) {
            case 0:
                sj0 sj0Var = this.D;
                rj0 rj0Var = sj0Var.f32475b;
                super.dispatchDraw(canvas);
                if (this.f31328a.getLottieAnimation() != null && !sj0Var.A) {
                    this.f31328a.getLottieAnimation().start();
                }
                if (sj0Var.f32481s && !sj0Var.v && this.f31328a.getLottieAnimation() != null && this.f31328a.getLottieAnimation().y() && rj0Var.f31328a.getLottieAnimation() != null && rj0Var.f31328a.getLottieAnimation().s()) {
                    sj0Var.v = true;
                    rj0Var.f31328a.getLottieAnimation().L(0, false, true);
                    rj0Var.setVisibility(0);
                    Runnable runnable = sj0Var.L.L0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new ib0(this, 17));
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
        switch (this.C) {
            case 0:
                sj0 sj0Var = this.D;
                if (hg.h0.c(this, sj0Var.L)) {
                    return;
                }
                super.invalidate(rect);
                sj0Var.L.invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        switch (this.C) {
            case 1:
                this.D.b();
                super.onDraw(canvas);
                return;
            case 2:
                k5 k5Var = this.f31331e;
                if (k5Var != null) {
                    imageReceiver = k5Var.f29951k;
                } else {
                    imageReceiver = this.f31328a;
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
    public void invalidate(int i9, int i10, int i11, int i12) {
        switch (this.C) {
            case 0:
                if (hg.h0.c(this)) {
                    return;
                }
                super.invalidate(i9, i10, i11, i12);
                return;
            case 1:
                if (hg.h0.c(this)) {
                    return;
                }
                super.invalidate(i9, i10, i11, i12);
                return;
            default:
                super.invalidate(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public final void invalidate() {
        int i9 = this.C;
        sj0 sj0Var = this.D;
        switch (i9) {
            case 0:
                if (hg.h0.c(this, sj0Var.L)) {
                    return;
                }
                super.invalidate();
                sj0Var.L.invalidate();
                return;
            case 1:
                if (hg.h0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                sj0Var.L.invalidate();
                return;
        }
    }
}
