package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class ok0 extends w9 {
    public final int G;
    public final pk0 H;

    public ok0(pk0 pk0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = pk0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.G) {
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
        switch (this.G) {
            case 0:
                pk0 pk0Var = this.H;
                ok0 ok0Var = pk0Var.f27408b;
                super.dispatchDraw(canvas);
                if (this.f29958a.getLottieAnimation() != null && !pk0Var.E) {
                    this.f29958a.getLottieAnimation().start();
                }
                if (pk0Var.f27413s && !pk0Var.v && this.f29958a.getLottieAnimation() != null && this.f29958a.getLottieAnimation().A() && ok0Var.f29958a.getLottieAnimation() != null && ok0Var.f29958a.getLottieAnimation().u()) {
                    pk0Var.v = true;
                    ok0Var.f29958a.getLottieAnimation().N(0, false, true);
                    ok0Var.setVisibility(0);
                    Runnable runnable = pk0Var.P.P0;
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
                pk0 pk0Var = this.H;
                if (zg.e0.c(this, pk0Var.P)) {
                    return;
                }
                super.invalidate(rect);
                pk0Var.P.invalidate();
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
                q5 q5Var = this.e;
                if (q5Var != null) {
                    imageReceiver = q5Var.f27588k;
                } else {
                    imageReceiver = this.f29958a;
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
                if (zg.e0.c(this)) {
                    return;
                }
                super.invalidate(i10, i11, i12, i13);
                return;
            case 1:
                if (zg.e0.c(this)) {
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
        pk0 pk0Var = this.H;
        switch (i10) {
            case 0:
                if (zg.e0.c(this, pk0Var.P)) {
                    return;
                }
                super.invalidate();
                pk0Var.P.invalidate();
                return;
            case 1:
                if (zg.e0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                pk0Var.P.invalidate();
                return;
        }
    }
}
