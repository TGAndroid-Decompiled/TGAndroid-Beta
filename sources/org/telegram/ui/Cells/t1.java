package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.aj;
import org.telegram.messenger.xi;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.wy0;
public final class t1 {
    public final r1 f31897a;
    public boolean f31898b;
    public wy0 f31899c;
    public wy0 d;
    public lc f31900e;
    public lc f31901f;
    public StaticLayout f31902g;
    public StaticLayout h;
    public n2.p0 f31903i;
    public k80 f31904j;
    public boolean f31905k;
    public Drawable f31906l;
    public int f31907m;
    public boolean f31908n;
    public int f31909o;
    public int f31910p;
    public int f31911q;
    public int f31912r;
    public int f31913s;
    public ok0 f31914t;
    public boolean f31915u;
    public boolean v;

    public t1(r1 r1Var) {
        this.f31897a = r1Var;
    }

    public final boolean a(android.view.MotionEvent r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.a(android.view.MotionEvent):boolean");
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
        r1 r1Var = this.f31897a;
        y1 y1Var = r1Var.f31521ib;
        xi xiVar = r1Var.M;
        if (xiVar == null || xiVar.h) {
            float f14 = 1.0f;
            if (this.f31898b) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (y1Var.S2) {
                f10 = org.telegram.messenger.g0.T1(1.0f - f10, f10, y1Var.L1);
            }
            float f15 = 1.0f * f10;
            if (f15 <= 0.0f) {
                return;
            }
            float backgroundDrawableRight = r1Var.getBackgroundDrawableRight();
            if (y1Var != null) {
                f11 = y1Var.f32480i0;
            } else {
                f11 = 0.0f;
            }
            float f16 = backgroundDrawableRight + f11;
            if (r1Var.Q5.P3() && !r1Var.C6 && !r1Var.K) {
                i7 = 6;
            } else {
                i7 = 0;
            }
            float L3 = (f16 - org.telegram.messenger.g0.L(10 + i7)) - r1Var.getExtraTextX();
            aj ajVar = r1Var.L;
            if (ajVar != null && !ajVar.f23012i) {
                i10 = (int) r1Var.f31648s3;
            } else if (r1Var.Q5.P3()) {
                i10 = r1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + r1Var.N6;
                if (r1Var.Q5.D == 19) {
                    i10 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(r1Var.X7, r1Var.Z7) + i10)) - org.telegram.messenger.g0.f24226q.x);
                }
            } else {
                if (r1Var.C6) {
                    L = org.telegram.messenger.g0.L(12.0f) + r1Var.N6;
                    extraTextX = r1Var.getExtraTextX();
                } else {
                    int i11 = r1Var.N6;
                    if (r1Var.K) {
                        f12 = 12.0f;
                    } else {
                        f12 = 18.0f;
                    }
                    L = org.telegram.messenger.g0.L(f12) + i11;
                    extraTextX = r1Var.getExtraTextX();
                }
                i10 = extraTextX + L;
            }
            int L4 = ((int) (i10 + y1Var.f32475h0)) - org.telegram.messenger.g0.L(1.33f);
            int i12 = r1Var.f31630r0;
            float f17 = L4;
            int i13 = (int) (L3 - f17);
            int i14 = this.f31912r;
            if (y1Var.Y2) {
                i14 = org.telegram.messenger.g0.W1(y1Var.L1, y1Var.U2, i14);
            }
            if (this.f31908n && r1Var.getPrimaryMessageObject() != null) {
                boolean z10 = r1Var.getPrimaryMessageObject().f24041c3;
            }
            boolean z11 = y1Var.f32446a3;
            if (this.f31914t == null) {
                this.f31914t = new ok0(r1Var);
            }
            int p10 = this.f31914t.p(r1Var.Qb);
            canvas.save();
            canvas.translate(f17, i12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, i13, i14);
            lc lcVar = this.f31901f;
            if (lcVar != null) {
                f13 = lcVar.a(0.01f);
            } else {
                f13 = 1.0f;
            }
            canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
            this.f31914t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f15, false, false);
            this.f31914t.f(canvas, rectF, f15);
            wy0 wy0Var = this.f31899c;
            if (wy0Var != null) {
                wy0Var.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), f15, p10, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.g0.L(10.0f) + this.f31899c.f41763c + org.telegram.messenger.g0.L(4.0f)), org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(10.0f) + L2 + this.d.f41763c, org.telegram.messenger.g0.L(21.66f));
                    lc lcVar2 = this.f31900e;
                    if (lcVar2 != null) {
                        f14 = lcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f14, f14, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), this.f31914t.f38178g);
                    this.d.c(org.telegram.messenger.g0.L(5.0f) + L2, org.telegram.messenger.g0.L(12.0f), f15, p10, canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    public final void c(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t1.c(android.graphics.Canvas):void");
    }
}
