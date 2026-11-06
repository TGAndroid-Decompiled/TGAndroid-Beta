package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class n50 extends z41 {
    public float f36233f;
    public float h;
    public final Paint f36234n;
    public float f36235r;
    public h6.m f36236s;
    public final x50 f36237w;

    public n50(x50 x50Var, Context context) {
        super(x50Var, context);
        this.f36237w = x50Var;
        this.f36234n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x50 x50Var = this.f36237w;
        x50Var.M1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (x50Var.f32030u1 - x50Var.f28645s0));
        float f10 = x50Var.f40195f2 + x50Var.f40201l2;
        av0 av0Var = x50Var.f32026q1;
        if (av0Var.getVisibility() != 0) {
            this.f36233f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f36235r = (f10 - this.f36233f) * 0.10666667f;
        }
        float f11 = this.f36233f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f36235r;
            float f14 = f11 + f13;
            this.f36233f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f36233f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f36233f = f12;
            } else {
                invalidate();
            }
        }
        av0Var.setTranslationY(x50Var.f32030u1 + this.f36233f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        x50 x50Var = this.f36237w;
        if (view == x50Var.M1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + x50Var.f40192b2 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27849d6, false), (int) (x50Var.Y1 * 255.0f)));
            int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27850d7, false), (int) (x50Var.Y1 * 255.0f));
            Paint paint = this.f36234n;
            paint.setColor(o4);
            canvas.drawRect(0.0f, view.getY() + x50Var.f40192b2, getMeasuredWidth(), view.getY() + x50Var.f40192b2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.f36236s;
        if (mVar != null) {
            ((e51) mVar.f14264b).f33174b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.f36237w.f40200k2 && this.f36236s == null) {
            this.f36236s = new h6.m(view);
        }
    }
}
