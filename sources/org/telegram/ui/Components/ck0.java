package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class ck0 extends t9 {
    public final int C;
    public final dk0 D;

    public ck0(dk0 dk0Var, Context context, int i10) {
        super(context);
        this.C = i10;
        this.D = dk0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.C) {
            case 0:
                return new bk0(0, this);
            case 1:
                return new bk0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.C) {
            case 0:
                dk0 dk0Var = this.D;
                ck0 ck0Var = dk0Var.f27795b;
                super.dispatchDraw(canvas);
                if (this.f32903a.getLottieAnimation() != null && !dk0Var.A) {
                    this.f32903a.getLottieAnimation().start();
                }
                if (dk0Var.f27801s && !dk0Var.v && this.f32903a.getLottieAnimation() != null && this.f32903a.getLottieAnimation().y() && ck0Var.f32903a.getLottieAnimation() != null && ck0Var.f32903a.getLottieAnimation().s()) {
                    dk0Var.v = true;
                    ck0Var.f32903a.getLottieAnimation().L(0, false, true);
                    ck0Var.setVisibility(0);
                    Runnable runnable = dk0Var.L.L0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new xb0(this, 17));
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
                dk0 dk0Var = this.D;
                if (kg.g0.c(this, dk0Var.L)) {
                    return;
                }
                super.invalidate(rect);
                dk0Var.L.invalidate();
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
                p5 p5Var = this.f32906e;
                if (p5Var != null) {
                    imageReceiver = p5Var.f31593k;
                } else {
                    imageReceiver = this.f32903a;
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
        switch (this.C) {
            case 0:
                if (kg.g0.c(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 1:
                if (kg.g0.c(this)) {
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
        int i10 = this.C;
        dk0 dk0Var = this.D;
        switch (i10) {
            case 0:
                if (kg.g0.c(this, dk0Var.L)) {
                    return;
                }
                super.invalidate();
                dk0Var.L.invalidate();
                return;
            case 1:
                if (kg.g0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                dk0Var.L.invalidate();
                return;
        }
    }
}
