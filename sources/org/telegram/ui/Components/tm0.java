package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class tm0 extends View {

    public sm0 f32835a;

    public final y5 f32836b;

    public final lg.d f32837c;
    public ig.q0 d;

    public boolean f32838e;

    public final Path f32839f;
    public final RectF h;

    public final RectF f32840n;

    public boolean f32841r;

    public final um0 f32842s;

    public tm0(um0 um0Var, Context context) {
        super(context);
        this.f32842s = um0Var;
        this.f32836b = new y5(this, 0L, 260L, er.h);
        this.f32839f = new Path();
        this.h = new RectF();
        this.f32840n = new RectF();
        h7.b6.a(this);
        jg.a aVar = um0Var.v;
        if (aVar != null) {
            lg.d dVarC = aVar.c(this, null, false);
            dVarC.n(um0Var.f33134w);
            dVarC.t(AndroidUtilities.dp(5.0f));
            lg.d dVarM = dVarC.m();
            dVarM.p(AndroidUtilities.dp(6.0f));
            dVarM.o(AndroidUtilities.dp(4.0f));
            this.f32837c = dVarM;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f32838e == z10) {
            return;
        }
        this.f32838e = z10;
        sm0 sm0Var = this.f32835a;
        if (sm0Var != null) {
            sm0Var.f11397p = z10;
            y5 y5Var = this.f32836b;
            if (z11) {
                sm0Var.f11390i = sm0Var.N;
                sm0Var.f11388g = sm0Var.O;
                sm0Var.h = sm0Var.P;
                y5Var.d(0.0f, true);
            } else {
                y5Var.d(1.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32841r) {
            return;
        }
        sm0 sm0Var = this.f32835a;
        if (sm0Var != null) {
            sm0Var.a();
        }
        this.f32841r = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f32841r) {
            sm0 sm0Var = this.f32835a;
            if (sm0Var != null) {
                sm0Var.b();
            }
            this.f32841r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        um0 um0Var = this.f32842s;
        Paint paint = um0Var.f33135x;
        int width = (getWidth() - this.f32835a.A) / 2;
        int height = getHeight();
        sm0 sm0Var = this.f32835a;
        int i10 = sm0Var.B;
        int i11 = (height - i10) / 2;
        lg.d dVar = this.f32837c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, sm0Var.A + width, i10 + i11);
            RectF rectF = this.f32840n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean zEquals = rectF.equals(rectF2);
            Path path = this.f32839f;
            if (!zEquals) {
                rectF2.set(rectF);
                ig.r0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.c6 c6Var = um0Var.f33128c;
            paint.setColor((c6Var == null ? !org.telegram.ui.ActionBar.g6.I.q() : !c6Var.a()) ? -1 : 687865855);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f32835a.d(canvas, width, i11, this.f32836b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp = AndroidUtilities.dp(8.67f);
        sm0 sm0Var = this.f32835a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iDp + (sm0Var != null ? sm0Var.A : AndroidUtilities.dp(44.33f)), 1073741824), i11);
    }
}
