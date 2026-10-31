package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.bj;
import org.telegram.messenger.ej;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qz0;
public final class s1 {
    public final q1 f22965a;
    public boolean f22966b;
    public qz0 f22967c;
    public qz0 d;
    public dc e;
    public dc f22968f;
    public StaticLayout f22969g;
    public StaticLayout h;
    public ji.a f22970i;
    public q80 f22971j;
    public boolean f22972k;
    public Drawable f22973l;
    public int f22974m;
    public boolean f22975n;
    public int f22976o;
    public int f22977p;
    public int f22978q;
    public int f22979r;
    public int f22980s;
    public dl0 f22981t;
    public boolean f22982u;
    public boolean v;

    public s1(q1 q1Var) {
        this.f22965a = q1Var;
    }

    public final boolean a(android.view.MotionEvent r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.a(android.view.MotionEvent):boolean");
    }

    public final void b(Canvas canvas) {
        float f7;
        float f10;
        int i10;
        float f11;
        int L;
        int extraTextX;
        int i11;
        float f12;
        int L2;
        q1 q1Var = this.f22965a;
        x1 x1Var = q1Var.gb;
        bj bjVar = q1Var.L;
        if (bjVar == null || bjVar.h) {
            float f13 = 1.0f;
            if (this.f22966b) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (x1Var.S2) {
                f7 = org.telegram.messenger.i0.T1(1.0f - f7, f7, x1Var.L1);
            }
            float f14 = 1.0f * f7;
            if (f14 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = q1Var.getBackgroundDrawableRight();
            if (x1Var != null) {
                f10 = x1Var.f23492i0;
            } else {
                f10 = 0.0f;
            }
            float f15 = backgroundDrawableRight + f10;
            if (q1Var.O5.P3() && !q1Var.A6 && !q1Var.J) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            float L3 = (f15 - org.telegram.messenger.i0.L(10 + i10)) - q1Var.getExtraTextX();
            ej ejVar = q1Var.K;
            if (ejVar != null && !ejVar.f15399i) {
                i11 = (int) q1Var.f22689q3;
            } else if (q1Var.O5.P3()) {
                i11 = q1Var.getExtraTextX() + org.telegram.messenger.i0.L(12.0f) + q1Var.L6;
                if (q1Var.O5.D == 19) {
                    i11 -= Math.max(0, (org.telegram.messenger.i0.L(14.0f) + (Math.max(q1Var.V7, q1Var.X7) + i11)) - org.telegram.messenger.i0.f16026q.x);
                }
            } else {
                if (q1Var.A6) {
                    L = org.telegram.messenger.i0.L(12.0f) + q1Var.L6;
                    extraTextX = q1Var.getExtraTextX();
                } else {
                    int i12 = q1Var.L6;
                    if (q1Var.J) {
                        f11 = 12.0f;
                    } else {
                        f11 = 18.0f;
                    }
                    L = org.telegram.messenger.i0.L(f11) + i12;
                    extraTextX = q1Var.getExtraTextX();
                }
                i11 = extraTextX + L;
            }
            int L4 = ((int) (i11 + x1Var.f23487h0)) - org.telegram.messenger.i0.L(1.33f);
            int i13 = q1Var.f22686q0;
            float f16 = L4;
            int i14 = (int) (L3 - f16);
            int i15 = this.f22979r;
            if (x1Var.Y2) {
                i15 = org.telegram.messenger.i0.W1(x1Var.L1, x1Var.U2, i15);
            }
            if (this.f22975n && q1Var.getPrimaryMessageObject() != null) {
                boolean z10 = q1Var.getPrimaryMessageObject().X2;
            }
            boolean z11 = x1Var.f23458a3;
            if (this.f22981t == null) {
                this.f22981t = new dl0(q1Var);
            }
            int p5 = this.f22981t.p(q1Var.Ob);
            canvas.save();
            canvas.translate(f16, i13);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, i14, i15);
            dc dcVar = this.f22968f;
            if (dcVar != null) {
                f12 = dcVar.a(0.01f);
            } else {
                f12 = 1.0f;
            }
            canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
            this.f22981t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f14, false, false);
            this.f22981t.f(canvas, rectF, f14);
            qz0 qz0Var = this.f22967c;
            if (qz0Var != null) {
                qz0Var.c(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(12.0f), f14, p5, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.i0.L(10.0f) + this.f22967c.f29774c + org.telegram.messenger.i0.L(4.0f)), org.telegram.messenger.i0.L(4.33f), org.telegram.messenger.i0.L(10.0f) + L2 + this.d.f29774c, org.telegram.messenger.i0.L(21.66f));
                    dc dcVar2 = this.e;
                    if (dcVar2 != null) {
                        f13 = dcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.i0.L(17.0f), this.f22981t.f25445g);
                    this.d.c(org.telegram.messenger.i0.L(5.0f) + L2, org.telegram.messenger.i0.L(12.0f), f14, p5, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public final void c(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.c(android.graphics.Canvas):void");
    }
}
