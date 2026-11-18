package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class y50 extends m51 {
    public float f42334f;
    public float h;
    public final Paint f42335n;
    public float f42336r;
    public h6.m f42337s;
    public final j60 f42338w;

    public y50(j60 j60Var, Context context) {
        super(j60Var, context);
        this.f42338w = j60Var;
        this.f42335n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j60 j60Var = this.f42338w;
        j60Var.Q1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (j60Var.f37994y1 - j60Var.f30226t0));
        float f10 = j60Var.f36360j2 + j60Var.f36366p2;
        kv0 kv0Var = j60Var.f37990u1;
        if (kv0Var.getVisibility() != 0) {
            this.f42334f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f42336r = (f10 - this.f42334f) * 0.10666667f;
        }
        float f11 = this.f42334f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f42336r;
            float f14 = f11 + f13;
            this.f42334f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f42334f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f42334f = f12;
            } else {
                invalidate();
            }
        }
        kv0Var.setTranslationY(j60Var.f37994y1 + this.f42334f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        j60 j60Var = this.f42338w;
        if (view == j60Var.Q1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + j60Var.f36356f2 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false), (int) (j60Var.f36354c2 * 255.0f)));
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29397d7, false), (int) (j60Var.f36354c2 * 255.0f));
            Paint paint = this.f42335n;
            paint.setColor(o4);
            canvas.drawRect(0.0f, view.getY() + j60Var.f36356f2, getMeasuredWidth(), view.getY() + j60Var.f36356f2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.f42337s;
        if (mVar != null) {
            ((r51) mVar.f13939b).f39044b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.f42338w.f36365o2 && this.f42337s == null) {
            this.f42337s = new h6.m(view);
        }
    }
}
