package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class ok0 extends p9 {
    public final int D;
    public final pk0 E;

    public ok0(pk0 pk0Var, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = pk0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.D) {
            case 0:
                return new nk0(0, this);
            case 1:
                return new nk0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.D) {
            case 0:
                pk0 pk0Var = this.E;
                ok0 ok0Var = pk0Var.f30099b;
                super.dispatchDraw(canvas);
                if (this.f29998a.getLottieAnimation() != null && !pk0Var.B) {
                    this.f29998a.getLottieAnimation().start();
                }
                if (pk0Var.f30105s && !pk0Var.v && this.f29998a.getLottieAnimation() != null && this.f29998a.getLottieAnimation().y() && ok0Var.f29998a.getLottieAnimation() != null && ok0Var.f29998a.getLottieAnimation().s()) {
                    pk0Var.v = true;
                    ok0Var.f29998a.getLottieAnimation().L(0, false, true);
                    ok0Var.setVisibility(0);
                    Runnable runnable = pk0Var.M.M0;
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
                pk0 pk0Var = this.E;
                if (ng.g0.c(this, pk0Var.M)) {
                    return;
                }
                super.invalidate(rect);
                pk0Var.M.invalidate();
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
                l5 l5Var = this.f30001e;
                if (l5Var != null) {
                    imageReceiver = l5Var.f28604k;
                } else {
                    imageReceiver = this.f29998a;
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
        pk0 pk0Var = this.E;
        switch (i10) {
            case 0:
                if (ng.g0.c(this, pk0Var.M)) {
                    return;
                }
                super.invalidate();
                pk0Var.M.invalidate();
                return;
            case 1:
                if (ng.g0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                pk0Var.M.invalidate();
                return;
        }
    }
}
