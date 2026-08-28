package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rm0 extends View {
    public qm0 f32200a;
    public final y5 f32201b;
    public final kg.d f32202c;
    public hg.r0 d;
    public boolean f32203e;
    public final Path f32204f;
    public final RectF h;
    public final RectF f32205n;
    public boolean f32206r;
    public final sm0 f32207s;

    public rm0(sm0 sm0Var, Context context) {
        super(context);
        this.f32207s = sm0Var;
        this.f32201b = new y5(this, 0L, 260L, gr.h);
        this.f32204f = new Path();
        this.h = new RectF();
        this.f32205n = new RectF();
        g7.g6.a(this);
        ig.a aVar = sm0Var.v;
        if (aVar != null) {
            kg.d c10 = aVar.c(this, null, false);
            c10.n(sm0Var.f32526w);
            c10.t(AndroidUtilities.dp(5.0f));
            kg.d m10 = c10.m();
            m10.p(AndroidUtilities.dp(6.0f));
            m10.o(AndroidUtilities.dp(4.0f));
            this.f32202c = m10;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f32203e == z10) {
            return;
        }
        this.f32203e = z10;
        qm0 qm0Var = this.f32200a;
        if (qm0Var != null) {
            qm0Var.f10701p = z10;
            y5 y5Var = this.f32201b;
            if (z11) {
                qm0Var.f10694i = qm0Var.N;
                qm0Var.f10692g = qm0Var.O;
                qm0Var.h = qm0Var.P;
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
        if (!this.f32206r) {
            qm0 qm0Var = this.f32200a;
            if (qm0Var != null) {
                qm0Var.a();
            }
            this.f32206r = true;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f32206r) {
            qm0 qm0Var = this.f32200a;
            if (qm0Var != null) {
                qm0Var.b();
            }
            this.f32206r = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        sm0 sm0Var = this.f32207s;
        Paint paint = sm0Var.f32527x;
        int width = (getWidth() - this.f32200a.A) / 2;
        int height = getHeight();
        qm0 qm0Var = this.f32200a;
        int i10 = qm0Var.B;
        int i11 = (height - i10) / 2;
        kg.d dVar = this.f32202c;
        if (dVar != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(width, i11, qm0Var.A + width, i10 + i11);
            RectF rectF = this.f32205n;
            rectF.set(rect);
            RectF rectF2 = this.h;
            boolean equals = rectF.equals(rectF2);
            Path path = this.f32204f;
            if (!equals) {
                rectF2.set(rectF);
                hg.s0.h(rectF2, rectF, path);
            }
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            rect.right = AndroidUtilities.dp(1.0f) + rect.right;
            dVar.setBounds(rect);
            canvas.save();
            canvas.clipPath(path);
            dVar.draw(canvas);
            org.telegram.ui.ActionBar.b6 b6Var = sm0Var.f32520c;
            if (b6Var == null ? org.telegram.ui.ActionBar.f6.I.q() : b6Var.a()) {
                i9 = 687865855;
            } else {
                i9 = -1;
            }
            paint.setColor(i9);
            canvas.drawPath(path, paint);
            canvas.restore();
        }
        this.f32200a.d(canvas, width, i11, this.f32201b.d(1.0f, false), 1.0f, false, false, 0.0f);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int dp;
        int dp2 = AndroidUtilities.dp(8.67f);
        qm0 qm0Var = this.f32200a;
        if (qm0Var != null) {
            dp = qm0Var.A;
        } else {
            dp = AndroidUtilities.dp(44.33f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp2 + dp, 1073741824), i10);
    }
}
