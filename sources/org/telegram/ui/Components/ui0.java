package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;
public final class ui0 extends q9 {
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
                ui0 ui0Var = vi0Var.f40788b;
                super.dispatchDraw(canvas);
                if (this.f38789a.B() != null && !vi0Var.F) {
                    this.f38789a.B().start();
                }
                if (vi0Var.f40794s && !vi0Var.f40795w && this.f38789a.B() != null && this.f38789a.B().A() && ui0Var.f38789a.B() != null && ui0Var.f38789a.B().u()) {
                    vi0Var.f40795w = true;
                    ui0Var.f38789a.B().N(0, false, true);
                    ui0Var.setVisibility(0);
                    Runnable runnable = vi0Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.g3(new hb0(this, 14));
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
                p5 p5Var = this.f38792e;
                if (p5Var != null) {
                    imageReceiver = p5Var.f38457k;
                } else {
                    imageReceiver = this.f38789a;
                }
                if (imageReceiver != null && imageReceiver.B() != null) {
                    imageReceiver.B().start();
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
