package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class q70 extends o71 {
    public float f28532f;
    public float h;
    public final Paint f28533n;
    public float f28534r;
    public li.k f28535s;
    public final a80 v;

    public q70(a80 a80Var, Context context) {
        super(a80Var, context);
        this.v = a80Var;
        this.f28533n = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        a80 a80Var = this.v;
        int i11 = a80Var.f28544y;
        i10 = ((org.telegram.ui.ActionBar.e3) a80Var).backgroundPaddingTop;
        a80Var.V.setTranslationY(AndroidUtilities.dp(64.0f) + AndroidUtilities.dp(6.0f) + (i11 - i10));
        float f7 = a80Var.f23479o0 + a80Var.f23485u0;
        wx0 wx0Var = a80Var.f28541s;
        if (wx0Var.getVisibility() != 0) {
            this.f28532f = f7;
            this.h = f7;
        } else if (this.h != f7) {
            this.h = f7;
            this.f28534r = (f7 - this.f28532f) * 0.10666667f;
        }
        float f10 = this.f28532f;
        float f11 = this.h;
        if (f10 != f11) {
            float f12 = this.f28534r;
            float f13 = f10 + f12;
            this.f28532f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f28532f = f11;
            } else if (f12 < 0.0f && f13 < f11) {
                this.f28532f = f11;
            } else {
                invalidate();
            }
        }
        wx0Var.setTranslationY(a80Var.f28544y + this.f28532f);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        a80 a80Var = this.v;
        if (view == a80Var.V) {
            canvas.save();
            canvas.clipRect(0.0f, view.getY() - AndroidUtilities.dp(4.0f), getMeasuredWidth(), view.getY() + a80Var.f23476k0 + 1.0f);
            canvas.drawColor(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false), (int) (a80Var.f23473h0 * 255.0f)));
            int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19902d7, false), (int) (a80Var.f23473h0 * 255.0f));
            Paint paint = this.f28533n;
            paint.setColor(k10);
            canvas.drawRect(0.0f, view.getY() + a80Var.f23476k0, getMeasuredWidth(), view.getY() + a80Var.f23476k0 + 1.0f, paint);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        li.k kVar = this.f28535s;
        if (kVar != null) {
            ((t71) kVar.f14820b).f29290b = true;
        }
    }

    @Override
    public final void onViewAdded(View view) {
        if (view == this.v.f23484t0 && this.f28535s == null) {
            this.f28535s = new li.k(view);
        }
    }
}
