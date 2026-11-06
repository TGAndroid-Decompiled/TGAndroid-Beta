package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.aj;
import org.telegram.messenger.dj;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.zj0;
public final class s1 {
    public final q1 f30233a;
    public boolean f30234b;
    public my0 f30235c;
    public my0 d;
    public ic f30236e;
    public ic f30237f;
    public StaticLayout f30238g;
    public StaticLayout h;
    public n2.n0 f30239i;
    public x70 f30240j;
    public boolean f30241k;
    public Drawable f30242l;
    public int f30243m;
    public boolean f30244n;
    public int f30245o;
    public int f30246p;
    public int f30247q;
    public int f30248r;
    public int f30249s;
    public zj0 f30250t;
    public boolean f30251u;
    public boolean v;

    public s1(q1 q1Var) {
        this.f30233a = q1Var;
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
        q1 q1Var = this.f30233a;
        x1 x1Var = q1Var.f29869hb;
        aj ajVar = q1Var.L;
        if (ajVar == null || ajVar.h) {
            float f14 = 1.0f;
            if (this.f30234b) {
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
                f11 = x1Var.f30799i0;
            } else {
                f11 = 0.0f;
            }
            float f16 = backgroundDrawableRight + f11;
            if (q1Var.P5.Q3() && !q1Var.B6 && !q1Var.J) {
                i7 = 6;
            } else {
                i7 = 0;
            }
            float L3 = (f16 - org.telegram.messenger.g0.L(10 + i7)) - q1Var.getExtraTextX();
            dj djVar = q1Var.K;
            if (djVar != null && !djVar.f22015i) {
                i10 = (int) q1Var.f29984r3;
            } else if (q1Var.P5.Q3()) {
                i10 = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                if (q1Var.P5.D == 19) {
                    i10 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(q1Var.W7, q1Var.Y7) + i10)) - org.telegram.messenger.g0.f22544q.x);
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
            int L4 = ((int) (i10 + x1Var.f30794h0)) - org.telegram.messenger.g0.L(1.33f);
            int i12 = q1Var.f29967q0;
            float f17 = L4;
            int i13 = (int) (L3 - f17);
            int i14 = this.f30248r;
            if (x1Var.Y2) {
                i14 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.U2, i14);
            }
            if (this.f30244n && q1Var.getPrimaryMessageObject() != null) {
                boolean z9 = q1Var.getPrimaryMessageObject().f23202a3;
            }
            boolean z10 = x1Var.f30765a3;
            if (this.f30250t == null) {
                this.f30250t = new zj0(q1Var);
            }
            int p10 = this.f30250t.p(q1Var.Pb);
            canvas.save();
            canvas.translate(f17, i12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, i13, i14);
            ic icVar = this.f30237f;
            if (icVar != null) {
                f13 = icVar.a(0.01f);
            } else {
                f13 = 1.0f;
            }
            canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
            this.f30250t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f15, false, false);
            this.f30250t.f(canvas, rectF, f15);
            my0 my0Var = this.f30235c;
            if (my0Var != null) {
                my0Var.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), f15, p10, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.g0.L(10.0f) + this.f30235c.f36125c + org.telegram.messenger.g0.L(4.0f)), org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(10.0f) + L2 + this.d.f36125c, org.telegram.messenger.g0.L(21.66f));
                    ic icVar2 = this.f30236e;
                    if (icVar2 != null) {
                        f14 = icVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f14, f14, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), this.f30250t.f41022g);
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
