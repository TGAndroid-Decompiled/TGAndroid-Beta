package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.aj;
import org.telegram.messenger.dj;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.zj0;
public final class s1 {
    public final q1 f30252a;
    public boolean f30253b;
    public my0 f30254c;
    public my0 d;
    public hc f30255e;
    public hc f30256f;
    public StaticLayout f30257g;
    public StaticLayout h;
    public n2.n0 f30258i;
    public x70 f30259j;
    public boolean f30260k;
    public Drawable f30261l;
    public int f30262m;
    public boolean f30263n;
    public int f30264o;
    public int f30265p;
    public int f30266q;
    public int f30267r;
    public int f30268s;
    public zj0 f30269t;
    public boolean f30270u;
    public boolean v;

    public s1(q1 q1Var) {
        this.f30252a = q1Var;
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
        q1 q1Var = this.f30252a;
        x1 x1Var = q1Var.f29887hb;
        aj ajVar = q1Var.L;
        if (ajVar == null || ajVar.h) {
            float f14 = 1.0f;
            if (this.f30253b) {
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
                f11 = x1Var.f30818i0;
            } else {
                f11 = 0.0f;
            }
            float f16 = backgroundDrawableRight + f11;
            if (q1Var.P5.P3() && !q1Var.B6 && !q1Var.J) {
                i7 = 6;
            } else {
                i7 = 0;
            }
            float L3 = (f16 - org.telegram.messenger.g0.L(10 + i7)) - q1Var.getExtraTextX();
            dj djVar = q1Var.K;
            if (djVar != null && !djVar.f22044i) {
                i10 = (int) q1Var.f30003r3;
            } else if (q1Var.P5.P3()) {
                i10 = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                if (q1Var.P5.D == 19) {
                    i10 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(q1Var.W7, q1Var.Y7) + i10)) - org.telegram.messenger.g0.f22567q.x);
                }
            } else {
                if (q1Var.B6) {
                    L = org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                    extraTextX = q1Var.getExtraTextX();
                } else {
                    int i11 = q1Var.M6;
                    if (q1Var.J) {
                        f12 = 12.0f;
                    } else {
                        f12 = 18.0f;
                    }
                    L = org.telegram.messenger.g0.L(f12) + i11;
                    extraTextX = q1Var.getExtraTextX();
                }
                i10 = extraTextX + L;
            }
            int L4 = ((int) (i10 + x1Var.f30813h0)) - org.telegram.messenger.g0.L(1.33f);
            int i12 = q1Var.f29986q0;
            float f17 = L4;
            int i13 = (int) (L3 - f17);
            int i14 = this.f30267r;
            if (x1Var.Y2) {
                i14 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.U2, i14);
            }
            if (this.f30263n && q1Var.getPrimaryMessageObject() != null) {
                boolean z9 = q1Var.getPrimaryMessageObject().f23224a3;
            }
            boolean z10 = x1Var.f30784a3;
            if (this.f30269t == null) {
                this.f30269t = new zj0(q1Var);
            }
            int p10 = this.f30269t.p(q1Var.Pb);
            canvas.save();
            canvas.translate(f17, i12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, i13, i14);
            hc hcVar = this.f30256f;
            if (hcVar != null) {
                f13 = hcVar.a(0.01f);
            } else {
                f13 = 1.0f;
            }
            canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
            this.f30269t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f15, false, false);
            this.f30269t.f(canvas, rectF, f15);
            my0 my0Var = this.f30254c;
            if (my0Var != null) {
                my0Var.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), f15, p10, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.g0.L(10.0f) + this.f30254c.f36133c + org.telegram.messenger.g0.L(4.0f)), org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(10.0f) + L2 + this.d.f36133c, org.telegram.messenger.g0.L(21.66f));
                    hc hcVar2 = this.f30255e;
                    if (hcVar2 != null) {
                        f14 = hcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f14, f14, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), this.f30269t.f41024g);
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
