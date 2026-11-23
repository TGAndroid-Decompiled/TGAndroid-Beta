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
    public final r1 f31801a;
    public boolean f31802b;
    public xy0 f31803c;
    public xy0 d;
    public mc f31804e;
    public mc f31805f;
    public StaticLayout f31806g;
    public StaticLayout h;
    public n2.o0 f31807i;
    public n80 f31808j;
    public boolean f31809k;
    public Drawable f31810l;
    public int f31811m;
    public boolean f31812n;
    public int f31813o;
    public int f31814p;
    public int f31815q;
    public int f31816r;
    public int f31817s;
    public ok0 f31818t;
    public boolean f31819u;
    public boolean v;

    public t1(r1 r1Var) {
        this.f31801a = r1Var;
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
        r1 r1Var = this.f31801a;
        y1 y1Var = r1Var.f31437ib;
        yi yiVar = r1Var.M;
        if (yiVar == null || yiVar.h) {
            float f14 = 1.0f;
            if (this.f31802b) {
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
                f11 = y1Var.f32379i0;
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
            if (bjVar != null && !bjVar.f23080i) {
                i10 = (int) r1Var.f31564s3;
            } else if (r1Var.Q5.P3()) {
                i10 = r1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + r1Var.N6;
                if (r1Var.Q5.D == 19) {
                    i10 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(r1Var.X7, r1Var.Z7) + i10)) - org.telegram.messenger.g0.f24010q.x);
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
            int L4 = ((int) (i10 + y1Var.f32374h0)) - org.telegram.messenger.g0.L(1.33f);
            int i12 = r1Var.f31546r0;
            float f17 = L4;
            int i13 = (int) (L3 - f17);
            int i14 = this.f31816r;
            if (y1Var.Y2) {
                i14 = org.telegram.messenger.g0.W1(y1Var.L1, y1Var.U2, i14);
            }
            if (this.f31812n && r1Var.getPrimaryMessageObject() != null) {
                boolean z10 = r1Var.getPrimaryMessageObject().f24145c3;
            }
            boolean z11 = y1Var.f32345a3;
            if (this.f31818t == null) {
                this.f31818t = new ok0(r1Var);
            }
            int p10 = this.f31818t.p(r1Var.Qb);
            canvas.save();
            canvas.translate(f17, i12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, i13, i14);
            mc mcVar = this.f31805f;
            if (mcVar != null) {
                f13 = mcVar.a(0.01f);
            } else {
                f13 = 1.0f;
            }
            canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
            this.f31818t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f15, false, false);
            this.f31818t.f(canvas, rectF, f15);
            xy0 xy0Var = this.f31803c;
            if (xy0Var != null) {
                xy0Var.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), f15, p10, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.g0.L(10.0f) + this.f31803c.f42224c + org.telegram.messenger.g0.L(4.0f)), org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(10.0f) + L2 + this.d.f42224c, org.telegram.messenger.g0.L(21.66f));
                    mc mcVar2 = this.f31804e;
                    if (mcVar2 != null) {
                        f14 = mcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f14, f14, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), this.f31818t.f38226g);
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
