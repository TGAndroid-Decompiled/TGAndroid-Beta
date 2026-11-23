package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.bj;
import org.telegram.messenger.yi;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.xy0;
public final class t1 {
    public final r1 f31835a;
    public boolean f31836b;
    public xy0 f31837c;
    public xy0 d;
    public mc f31838e;
    public mc f31839f;
    public StaticLayout f31840g;
    public StaticLayout h;
    public n2.o0 f31841i;
    public n80 f31842j;
    public boolean f31843k;
    public Drawable f31844l;
    public int f31845m;
    public boolean f31846n;
    public int f31847o;
    public int f31848p;
    public int f31849q;
    public int f31850r;
    public int f31851s;
    public ok0 f31852t;
    public boolean f31853u;
    public boolean v;

    public t1(r1 r1Var) {
        this.f31835a = r1Var;
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
        r1 r1Var = this.f31835a;
        y1 y1Var = r1Var.f31471ib;
        yi yiVar = r1Var.M;
        if (yiVar == null || yiVar.h) {
            float f14 = 1.0f;
            if (this.f31836b) {
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
                f11 = y1Var.f32413i0;
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
            bj bjVar = r1Var.L;
            if (bjVar != null && !bjVar.f23116i) {
                i10 = (int) r1Var.f31598s3;
            } else if (r1Var.Q5.P3()) {
                i10 = r1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + r1Var.N6;
                if (r1Var.Q5.D == 19) {
                    i10 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(r1Var.X7, r1Var.Z7) + i10)) - org.telegram.messenger.g0.f24046q.x);
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
            int L4 = ((int) (i10 + y1Var.f32408h0)) - org.telegram.messenger.g0.L(1.33f);
            int i12 = r1Var.f31580r0;
            float f17 = L4;
            int i13 = (int) (L3 - f17);
            int i14 = this.f31850r;
            if (y1Var.Y2) {
                i14 = org.telegram.messenger.g0.W1(y1Var.L1, y1Var.U2, i14);
            }
            if (this.f31846n && r1Var.getPrimaryMessageObject() != null) {
                boolean z10 = r1Var.getPrimaryMessageObject().f24181c3;
            }
            boolean z11 = y1Var.f32379a3;
            if (this.f31852t == null) {
                this.f31852t = new ok0(r1Var);
            }
            int p10 = this.f31852t.p(r1Var.Qb);
            canvas.save();
            canvas.translate(f17, i12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, i13, i14);
            mc mcVar = this.f31839f;
            if (mcVar != null) {
                f13 = mcVar.a(0.01f);
            } else {
                f13 = 1.0f;
            }
            canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
            this.f31852t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f15, false, false);
            this.f31852t.f(canvas, rectF, f15);
            xy0 xy0Var = this.f31837c;
            if (xy0Var != null) {
                xy0Var.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), f15, p10, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.g0.L(10.0f) + this.f31837c.f42247c + org.telegram.messenger.g0.L(4.0f)), org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(10.0f) + L2 + this.d.f42247c, org.telegram.messenger.g0.L(21.66f));
                    mc mcVar2 = this.f31838e;
                    if (mcVar2 != null) {
                        f14 = mcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f14, f14, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), this.f31852t.f38258g);
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
