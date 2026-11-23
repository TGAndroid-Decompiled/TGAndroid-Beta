package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class b60 extends p51 {
    public float f33750f;
    public float h;
    public final Paint f33751n;
    public float f33752r;
    public h6.m f33753s;
    public final l60 f33754w;

    public b60(l60 l60Var, Context context) {
        super(l60Var, context);
        this.f33754w = l60Var;
        this.f33751n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        l60 l60Var = this.f33754w;
        l60Var.Q1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (l60Var.f39046y1 - l60Var.f30176t0));
        float f10 = l60Var.f37084j2 + l60Var.f37090p2;
        nv0 nv0Var = l60Var.f39042u1;
        if (nv0Var.getVisibility() != 0) {
            this.f33750f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f33752r = (f10 - this.f33750f) * 0.10666667f;
        }
        float f11 = this.f33750f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f33752r;
            float f14 = f11 + f13;
            this.f33750f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f33750f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f33750f = f12;
            } else {
                invalidate();
            }
        }
        nv0Var.setTranslationY(l60Var.f39046y1 + this.f33750f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        l60 l60Var = this.f33754w;
        if (view == l60Var.Q1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + l60Var.f37080f2 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false), (int) (l60Var.f37078c2 * 255.0f)));
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29348d7, false), (int) (l60Var.f37078c2 * 255.0f));
            Paint paint = this.f33751n;
            paint.setColor(o4);
            canvas.drawRect(0.0f, view.getY() + l60Var.f37080f2, getMeasuredWidth(), view.getY() + l60Var.f37080f2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.f33753s;
        if (mVar != null) {
            ((u51) mVar.f13931b).f40249b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.f33754w.f37089o2 && this.f33753s == null) {
            this.f33753s = new h6.m(view);
        }
    }
}
