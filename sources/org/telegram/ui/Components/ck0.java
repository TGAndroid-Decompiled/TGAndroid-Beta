package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class ck0 extends x9 {
    public final int G;
    public final dk0 H;

    public ck0(dk0 dk0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = dk0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
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
        switch (this.G) {
            case 0:
                dk0 dk0Var = this.H;
                ck0 ck0Var = dk0Var.f25408b;
                super.dispatchDraw(canvas);
                if (this.f32476a.getLottieAnimation() != null && !dk0Var.E) {
                    this.f32476a.getLottieAnimation().start();
                }
                if (dk0Var.f25414s && !dk0Var.v && this.f32476a.getLottieAnimation() != null && this.f32476a.getLottieAnimation().y() && ck0Var.f32476a.getLottieAnimation() != null && ck0Var.f32476a.getLottieAnimation().s()) {
                    dk0Var.v = true;
                    ck0Var.f32476a.getLottieAnimation().L(0, false, true);
                    ck0Var.setVisibility(0);
                    Runnable runnable = dk0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new cc0(this, 17));
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
                dk0 dk0Var = this.H;
                if (ah.y0.c(this, dk0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                dk0Var.P.invalidate();
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
                q5 q5Var = this.f32479e;
                if (q5Var != null) {
                    imageReceiver = q5Var.f29584k;
                } else {
                    imageReceiver = this.f32476a;
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
                if (ah.y0.c(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 1:
                if (ah.y0.c(this)) {
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
        dk0 dk0Var = this.H;
        switch (i10) {
            case 0:
                if (ah.y0.c(this, dk0Var.P)) {
                    return;
                }
                super.invalidate();
                dk0Var.P.invalidate();
                return;
            case 1:
                if (ah.y0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                dk0Var.P.invalidate();
                return;
        }
    }
}
