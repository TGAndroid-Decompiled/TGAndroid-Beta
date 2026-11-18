package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.aj;
import org.telegram.messenger.xi;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.vy0;
public final class s1 {
    public final q1 f31753a;
    public boolean f31754b;
    public vy0 f31755c;
    public vy0 d;
    public mc f31756e;
    public mc f31757f;
    public StaticLayout f31758g;
    public StaticLayout h;
    public n2.o0 f31759i;
    public l80 f31760j;
    public boolean f31761k;
    public Drawable f31762l;
    public int f31763m;
    public boolean f31764n;
    public int f31765o;
    public int f31766p;
    public int f31767q;
    public int f31768r;
    public int f31769s;
    public mk0 f31770t;
    public boolean f31771u;
    public boolean v;

    public s1(q1 q1Var) {
        this.f31753a = q1Var;
    }

    public final boolean a(android.view.MotionEvent r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.a(android.view.MotionEvent):boolean");
    }

    public final void b(Canvas canvas) {
        float f10;
        float f11;
        int i7;
        float f12;
        int L;
        int extraTextX;
        int i10;
        float f13;
        int L2;
        q1 q1Var = this.f31753a;
        x1 x1Var = q1Var.f31390ib;
        xi xiVar = q1Var.M;
        if (xiVar == null || xiVar.h) {
            float f14 = 1.0f;
            if (this.f31754b) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (x1Var.S2) {
                f10 = org.telegram.messenger.g0.T1(1.0f - f10, f10, x1Var.L1);
            }
            float f15 = 1.0f * f10;
            if (f15 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = q1Var.getBackgroundDrawableRight();
            if (x1Var != null) {
                f11 = x1Var.f32335i0;
            } else {
                f11 = 0.0f;
            }
            float f16 = backgroundDrawableRight + f11;
            if (q1Var.Q5.P3() && !q1Var.C6 && !q1Var.K) {
                i7 = 6;
            } else {
                i7 = 0;
            }
            float L3 = (f16 - org.telegram.messenger.g0.L(10 + i7)) - q1Var.getExtraTextX();
            aj ajVar = q1Var.L;
            if (ajVar != null && !ajVar.f22904i) {
                i10 = (int) q1Var.f31517s3;
            } else if (q1Var.Q5.P3()) {
                i10 = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + q1Var.N6;
                if (q1Var.Q5.D == 19) {
                    i10 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(q1Var.X7, q1Var.Z7) + i10)) - org.telegram.messenger.g0.f24121q.x);
                }
            } else {
                if (q1Var.C6) {
                    L = org.telegram.messenger.g0.L(12.0f) + q1Var.N6;
                    extraTextX = q1Var.getExtraTextX();
                } else {
                    int i11 = q1Var.N6;
                    if (q1Var.K) {
                        f12 = 12.0f;
                    } else {
                        f12 = 18.0f;
                    }
                    L = org.telegram.messenger.g0.L(f12) + i11;
                    extraTextX = q1Var.getExtraTextX();
                }
                i10 = extraTextX + L;
            }
            int L4 = ((int) (i10 + x1Var.f32330h0)) - org.telegram.messenger.g0.L(1.33f);
            int i12 = q1Var.f31499r0;
            float f17 = L4;
            int i13 = (int) (L3 - f17);
            int i14 = this.f31768r;
            if (x1Var.Y2) {
                i14 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.U2, i14);
            }
            if (this.f31764n && q1Var.getPrimaryMessageObject() != null) {
                boolean z10 = q1Var.getPrimaryMessageObject().f23936c3;
            }
            boolean z11 = x1Var.f32301a3;
            if (this.f31770t == null) {
                this.f31770t = new mk0(q1Var);
            }
            int p10 = this.f31770t.p(q1Var.Qb);
            canvas.save();
            canvas.translate(f17, i12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, i13, i14);
            mc mcVar = this.f31757f;
            if (mcVar != null) {
                f13 = mcVar.a(0.01f);
            } else {
                f13 = 1.0f;
            }
            canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
            this.f31770t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f15, false, false);
            this.f31770t.f(canvas, rectF, f15);
            vy0 vy0Var = this.f31755c;
            if (vy0Var != null) {
                vy0Var.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), f15, p10, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.g0.L(10.0f) + this.f31755c.f41482c + org.telegram.messenger.g0.L(4.0f)), org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(10.0f) + L2 + this.d.f41482c, org.telegram.messenger.g0.L(21.66f));
                    mc mcVar2 = this.f31756e;
                    if (mcVar2 != null) {
                        f14 = mcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f14, f14, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), this.f31770t.f37533g);
                    this.d.c(org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(12.0f), f15, p10, canvas);
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
