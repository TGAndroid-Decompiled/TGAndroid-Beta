package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public final class tj0 extends n9 {
    public final int C;
    public final uj0 D;

    public tj0(uj0 uj0Var, Context context, int i10) {
        super(context);
        this.C = i10;
        this.D = uj0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.C) {
            case 0:
                return new sj0(0, this);
            case 1:
                return new sj0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.C) {
            case 0:
                uj0 uj0Var = this.D;
                tj0 tj0Var = uj0Var.f33100b;
                super.dispatchDraw(canvas);
                if (this.f30898a.getLottieAnimation() != null && !uj0Var.A) {
                    this.f30898a.getLottieAnimation().start();
                }
                if (uj0Var.f33106s && !uj0Var.v && this.f30898a.getLottieAnimation() != null && this.f30898a.getLottieAnimation().y() && tj0Var.f30898a.getLottieAnimation() != null && tj0Var.f30898a.getLottieAnimation().s()) {
                    uj0Var.v = true;
                    tj0Var.f30898a.getLottieAnimation().L(0, false, true);
                    tj0Var.setVisibility(0);
                    Runnable runnable = uj0Var.L.L0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new mb0(this, 17));
                }
                invalidate();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void invalidate(Rect rect) {
        switch (this.C) {
            case 0:
                uj0 uj0Var = this.D;
                if (!ig.g0.c(this, uj0Var.L)) {
                    super.invalidate(rect);
                    uj0Var.L.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.C) {
            case 1:
                this.D.b();
                super.onDraw(canvas);
                break;
            case 2:
                k5 k5Var = this.f30901e;
                ImageReceiver imageReceiver = k5Var != null ? k5Var.f29961k : this.f30898a;
                if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().start();
                }
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.C) {
            case 0:
                if (!ig.g0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!ig.g0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public final void invalidate() {
        int i10 = this.C;
        uj0 uj0Var = this.D;
        switch (i10) {
            case 0:
                if (!ig.g0.c(this, uj0Var.L)) {
                    super.invalidate();
                    uj0Var.L.invalidate();
                    break;
                }
                break;
            case 1:
                if (!ig.g0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                uj0Var.L.invalidate();
                break;
        }
    }
}
