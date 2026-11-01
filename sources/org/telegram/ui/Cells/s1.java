package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.cj;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.rz0;
public final class s1 {
    public final q1 f22966a;
    public boolean f22967b;
    public rz0 f22968c;
    public rz0 d;
    public dc e;
    public dc f22969f;
    public StaticLayout f22970g;
    public StaticLayout h;
    public ji.a f22971i;
    public q80 f22972j;
    public boolean f22973k;
    public Drawable f22974l;
    public int f22975m;
    public boolean f22976n;
    public int f22977o;
    public int f22978p;
    public int f22979q;
    public int f22980r;
    public int f22981s;
    public el0 f22982t;
    public boolean f22983u;
    public boolean v;

    public s1(q1 q1Var) {
        this.f22966a = q1Var;
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
        q1 q1Var = this.f22966a;
        x1 x1Var = q1Var.gb;
        cj cjVar = q1Var.L;
        if (cjVar == null || cjVar.h) {
            float f13 = 1.0f;
            if (this.f22967b) {
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
                f10 = x1Var.f23493i0;
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
            fj fjVar = q1Var.K;
            if (fjVar != null && !fjVar.f15740i) {
                i11 = (int) q1Var.f22690q3;
            } else if (q1Var.O5.P3()) {
                i11 = q1Var.getExtraTextX() + org.telegram.messenger.i0.L(12.0f) + q1Var.L6;
                if (q1Var.O5.D == 19) {
                    i11 -= Math.max(0, (org.telegram.messenger.i0.L(14.0f) + (Math.max(q1Var.V7, q1Var.X7) + i11)) - org.telegram.messenger.i0.f16172q.x);
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
            int L4 = ((int) (i11 + x1Var.f23488h0)) - org.telegram.messenger.i0.L(1.33f);
            int i13 = q1Var.f22687q0;
            float f16 = L4;
            int i14 = (int) (L3 - f16);
            int i15 = this.f22980r;
            if (x1Var.Y2) {
                i15 = org.telegram.messenger.i0.W1(x1Var.L1, x1Var.U2, i15);
            }
            if (this.f22976n && q1Var.getPrimaryMessageObject() != null) {
                boolean z10 = q1Var.getPrimaryMessageObject().X2;
            }
            boolean z11 = x1Var.f23459a3;
            if (this.f22982t == null) {
                this.f22982t = new el0(q1Var);
            }
            int p5 = this.f22982t.p(q1Var.Ob);
            canvas.save();
            canvas.translate(f16, i13);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, i14, i15);
            dc dcVar = this.f22969f;
            if (dcVar != null) {
                f12 = dcVar.a(0.01f);
            } else {
                f12 = 1.0f;
            }
            canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
            this.f22982t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f14, false, false);
            this.f22982t.f(canvas, rectF, f14);
            rz0 rz0Var = this.f22968c;
            if (rz0Var != null) {
                rz0Var.c(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(12.0f), f14, p5, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.i0.L(10.0f) + this.f22968c.f30126c + org.telegram.messenger.i0.L(4.0f)), org.telegram.messenger.i0.L(4.33f), org.telegram.messenger.i0.L(10.0f) + L2 + this.d.f30126c, org.telegram.messenger.i0.L(21.66f));
                    dc dcVar2 = this.e;
                    if (dcVar2 != null) {
                        f13 = dcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(17.0f), org.telegram.messenger.i0.L(17.0f), this.f22982t.f25864g);
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
