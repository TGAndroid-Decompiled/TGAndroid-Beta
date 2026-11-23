package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class b60 extends p51 {
    public float f33773f;
    public float h;
    public final Paint f33774n;
    public float f33775r;
    public h6.m f33776s;
    public final l60 f33777w;

    public b60(l60 l60Var, Context context) {
        super(l60Var, context);
        this.f33777w = l60Var;
        this.f33774n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l60 l60Var = this.f33777w;
        l60Var.Q1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (l60Var.f39092y1 - l60Var.f30210t0));
        float f10 = l60Var.f37128j2 + l60Var.f37134p2;
        nv0 nv0Var = l60Var.f39088u1;
        if (nv0Var.getVisibility() != 0) {
            this.f33773f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f33775r = (f10 - this.f33773f) * 0.10666667f;
        }
        float f11 = this.f33773f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f33775r;
            float f14 = f11 + f13;
            this.f33773f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f33773f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f33773f = f12;
            } else {
                invalidate();
            }
        }
        nv0Var.setTranslationY(l60Var.f39092y1 + this.f33773f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        l60 l60Var = this.f33777w;
        if (view == l60Var.Q1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + l60Var.f37124f2 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29381d6, false), (int) (l60Var.f37122c2 * 255.0f)));
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29382d7, false), (int) (l60Var.f37122c2 * 255.0f));
            Paint paint = this.f33774n;
            paint.setColor(o4);
            canvas.drawRect(0.0f, view.getY() + l60Var.f37124f2, getMeasuredWidth(), view.getY() + l60Var.f37124f2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.f33776s;
        if (mVar != null) {
            ((u51) mVar.f13968b).f40267b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.f33777w.f37133o2 && this.f33776s == null) {
            this.f33776s = new h6.m(view);
        }
    }
}
