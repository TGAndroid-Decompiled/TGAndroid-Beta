package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.bj;
import org.telegram.messenger.yi;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.oy0;
public final class s1 {
    public final q1 f31386a;
    public boolean f31387b;
    public oy0 f31388c;
    public oy0 d;
    public dc f31389e;
    public dc f31390f;
    public StaticLayout f31391g;
    public StaticLayout h;
    public n2.o0 f31392i;
    public a80 f31393j;
    public boolean f31394k;
    public Drawable f31395l;
    public int f31396m;
    public boolean f31397n;
    public int f31398o;
    public int f31399p;
    public int f31400q;
    public int f31401r;
    public int f31402s;
    public ek0 f31403t;
    public boolean f31404u;
    public boolean v;

    public s1(q1 q1Var) {
        this.f31386a = q1Var;
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
        q1 q1Var = this.f31386a;
        x1 x1Var = q1Var.f31018ib;
        yi yiVar = q1Var.M;
        if (yiVar == null || yiVar.h) {
            float f14 = 1.0f;
            if (this.f31387b) {
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
                f11 = x1Var.f31952i0;
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
            bj bjVar = q1Var.L;
            if (bjVar != null && !bjVar.f22713i) {
                i10 = (int) q1Var.f31145s3;
            } else if (q1Var.Q5.P3()) {
                i10 = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + q1Var.N6;
                if (q1Var.Q5.D == 19) {
                    i10 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(q1Var.X7, q1Var.Z7) + i10)) - org.telegram.messenger.g0.f23611q.x);
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
            int L4 = ((int) (i10 + x1Var.f31947h0)) - org.telegram.messenger.g0.L(1.33f);
            int i12 = q1Var.f31127r0;
            float f17 = L4;
            int i13 = (int) (L3 - f17);
            int i14 = this.f31401r;
            if (x1Var.Y2) {
                i14 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.U2, i14);
            }
            if (this.f31397n && q1Var.getPrimaryMessageObject() != null) {
                boolean z10 = q1Var.getPrimaryMessageObject().f23787c3;
            }
            boolean z11 = x1Var.f31918a3;
            if (this.f31403t == null) {
                this.f31403t = new ek0(q1Var);
            }
            int p10 = this.f31403t.p(q1Var.Qb);
            canvas.save();
            canvas.translate(f17, i12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, i13, i14);
            dc dcVar = this.f31390f;
            if (dcVar != null) {
                f13 = dcVar.a(0.01f);
            } else {
                f13 = 1.0f;
            }
            canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
            this.f31403t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f15, false, false);
            this.f31403t.f(canvas, rectF, f15);
            oy0 oy0Var = this.f31388c;
            if (oy0Var != null) {
                oy0Var.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), f15, p10, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.g0.L(10.0f) + this.f31388c.f38103c + org.telegram.messenger.g0.L(4.0f)), org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(10.0f) + L2 + this.d.f38103c, org.telegram.messenger.g0.L(21.66f));
                    dc dcVar2 = this.f31389e;
                    if (dcVar2 != null) {
                        f14 = dcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f14, f14, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), this.f31403t.f34343g);
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
