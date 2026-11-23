package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;
public final class ui0 extends p9 {
    public final int H;
    public final vi0 I;

    public ui0(vi0 vi0Var, Context context, int i7) {
        super(context);
        this.H = i7;
        this.I = vi0Var;
    }

    @Override
    public ImageReceiver c() {
        switch (this.H) {
            case 0:
                return new ti0(0, this);
            case 1:
                return new ti0(1, this);
            default:
                return super.c();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                vi0 vi0Var = this.I;
                ui0 ui0Var = vi0Var.f40709b;
                super.dispatchDraw(canvas);
                if (this.f38429a.C() != null && !vi0Var.F) {
                    this.f38429a.C().start();
                }
                if (vi0Var.f40715s && !vi0Var.f40716w && this.f38429a.C() != null && this.f38429a.C().A() && ui0Var.f38429a.C() != null && ui0Var.f38429a.C().u()) {
                    vi0Var.f40716w = true;
                    ui0Var.f38429a.C().N(0, false, true);
                    ui0Var.setVisibility(0);
                    Runnable runnable = vi0Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.g3(new eb0(this, 14));
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
        switch (this.H) {
            case 0:
                vi0 vi0Var = this.I;
                if (ch.f0.c(this, vi0Var.Q)) {
                    return;
                }
                super.invalidate(rect);
                vi0Var.Q.invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        switch (this.H) {
            case 1:
                this.I.b();
                super.onDraw(canvas);
                return;
            case 2:
                o5 o5Var = this.f38432e;
                if (o5Var != null) {
                    imageReceiver = o5Var.f38028k;
                } else {
                    imageReceiver = this.f38429a;
                }
                if (imageReceiver != null && imageReceiver.C() != null) {
                    imageReceiver.C().start();
                }
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.H) {
            case 0:
                if (ch.f0.c(this)) {
                    return;
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            case 1:
                if (ch.f0.c(this)) {
                    return;
                }
                super.invalidate(i7, i10, i11, i12);
                return;
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public final void invalidate() {
        int i7 = this.H;
        vi0 vi0Var = this.I;
        switch (i7) {
            case 0:
                if (ch.f0.c(this, vi0Var.Q)) {
                    return;
                }
                super.invalidate();
                vi0Var.Q.invalidate();
                return;
            case 1:
                if (ch.f0.c(this)) {
                    return;
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                vi0Var.Q.invalidate();
                return;
        }
    }
}
