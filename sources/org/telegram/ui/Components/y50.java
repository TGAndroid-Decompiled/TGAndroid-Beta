package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class y50 extends o51 {
    public float f42362f;
    public float h;
    public final Paint f42363n;
    public float f42364r;
    public h6.m f42365s;
    public final i60 f42366w;

    public y50(i60 i60Var, Context context) {
        super(i60Var, context);
        this.f42366w = i60Var;
        this.f42363n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i60 i60Var = this.f42366w;
        i60Var.Q1.setTranslationY(org.telegram.messenger.g0.L(64.0f) + org.telegram.messenger.g0.L(6.0f) + (i60Var.f38708y1 - i60Var.f30260t0));
        float f10 = i60Var.f35945j2 + i60Var.f35951p2;
        mv0 mv0Var = i60Var.f38704u1;
        if (mv0Var.getVisibility() != 0) {
            this.f42362f = f10;
            this.h = f10;
        } else if (this.h != f10) {
            this.h = f10;
            this.f42364r = (f10 - this.f42362f) * 0.10666667f;
        }
        float f11 = this.f42362f;
        float f12 = this.h;
        if (f11 != f12) {
            float f13 = this.f42364r;
            float f14 = f11 + f13;
            this.f42362f = f14;
            if (f13 > 0.0f && f14 > f12) {
                this.f42362f = f12;
            } else if (f13 < 0.0f && f14 < f12) {
                this.f42362f = f12;
            } else {
                invalidate();
            }
        }
        mv0Var.setTranslationY(i60Var.f38708y1 + this.f42362f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        i60 i60Var = this.f42366w;
        if (view == i60Var.Q1) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - org.telegram.messenger.g0.L(4.0f), getMeasuredWidth(), view.getY() + i60Var.f35941f2 + 1.0f);
            canvas.drawColor(i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false), (int) (i60Var.f35939c2 * 255.0f)));
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29452d7, false), (int) (i60Var.f35939c2 * 255.0f));
            Paint paint = this.f42363n;
            paint.setColor(o4);
            canvas.drawRect(0.0f, view.getY() + i60Var.f35941f2, getMeasuredWidth(), view.getY() + i60Var.f35941f2 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h6.m mVar = this.f42365s;
        if (mVar != null) {
            ((t51) mVar.f13931b).f39802b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.f42366w.f35950o2 && this.f42365s == null) {
            this.f42365s = new h6.m(view);
        }
    }
}
