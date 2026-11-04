package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import org.telegram.messenger.ri;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.t70;
public final class s1 {
    public final q1 f30310a;
    public boolean f30311b;
    public ly0 f30312c;
    public ly0 d;
    public gc f30313e;
    public gc f30314f;
    public StaticLayout f30315g;
    public StaticLayout h;
    public m2.p0 f30316i;
    public t70 f30317j;
    public boolean f30318k;
    public Drawable f30319l;
    public int f30320m;
    public boolean f30321n;
    public int f30322o;
    public int f30323p;
    public int f30324q;
    public int f30325r;
    public int f30326s;
    public dk0 f30327t;
    public boolean f30328u;
    public boolean v;

    public s1(q1 q1Var) {
        this.f30310a = q1Var;
    }

    public final boolean a(android.view.MotionEvent r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s1.a(android.view.MotionEvent):boolean");
    }

    public final void b(Canvas canvas) {
        float f10;
        float f11;
        int i3;
        float f12;
        int L;
        int extraTextX;
        int i10;
        float f13;
        int L2;
        q1 q1Var = this.f30310a;
        x1 x1Var = q1Var.hb;
        ri riVar = q1Var.M;
        if (riVar == null || riVar.h) {
            float f14 = 1.0f;
            if (this.f30311b) {
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
                f11 = x1Var.f30876i0;
            } else {
                f11 = 0.0f;
            }
            float f16 = backgroundDrawableRight + f11;
            if (q1Var.P5.Q3() && !q1Var.B6 && !q1Var.K) {
                i3 = 6;
            } else {
                i3 = 0;
            }
            float L3 = (f16 - org.telegram.messenger.g0.L(10 + i3)) - q1Var.getExtraTextX();
            ui uiVar = q1Var.L;
            if (uiVar != null && !uiVar.f25705i) {
                i10 = (int) q1Var.f30061r3;
            } else if (q1Var.P5.Q3()) {
                i10 = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                if (q1Var.P5.D == 19) {
                    i10 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(q1Var.W7, q1Var.Y7) + i10)) - org.telegram.messenger.g0.f22608q.x);
                }
            } else {
                if (q1Var.B6) {
                    L = org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                    extraTextX = q1Var.getExtraTextX();
                } else {
                    int i11 = q1Var.M6;
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
            int L4 = ((int) (i10 + x1Var.f30871h0)) - org.telegram.messenger.g0.L(1.33f);
            int i12 = q1Var.f30058r0;
            float f17 = L4;
            int i13 = (int) (L3 - f17);
            int i14 = this.f30325r;
            if (x1Var.Y2) {
                i14 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.U2, i14);
            }
            if (this.f30321n && q1Var.getPrimaryMessageObject() != null) {
                boolean z10 = q1Var.getPrimaryMessageObject().f26826a3;
            }
            boolean z11 = x1Var.f30842a3;
            if (this.f30327t == null) {
                this.f30327t = new dk0(q1Var);
            }
            int p10 = this.f30327t.p(q1Var.Pb);
            canvas.save();
            canvas.translate(f17, i12);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, i13, i14);
            gc gcVar = this.f30314f;
            if (gcVar != null) {
                f13 = gcVar.a(0.01f);
            } else {
                f13 = 1.0f;
            }
            canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
            this.f30327t.d(canvas, rectF, 5.0f, 5.0f, 5.0f, f15, false, false);
            this.f30327t.f(canvas, rectF, f15);
            ly0 ly0Var = this.f30312c;
            if (ly0Var != null) {
                ly0Var.c(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(12.0f), f15, p10, canvas);
                if (this.d != null) {
                    rectF.set((int) (org.telegram.messenger.g0.L(10.0f) + this.f30312c.f35918c + org.telegram.messenger.g0.L(4.0f)), org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(10.0f) + L2 + this.d.f35918c, org.telegram.messenger.g0.L(21.66f));
                    gc gcVar2 = this.f30313e;
                    if (gcVar2 != null) {
                        f14 = gcVar2.a(0.1f);
                    }
                    canvas.save();
                    canvas.scale(f14, f14, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(17.0f), org.telegram.messenger.g0.L(17.0f), this.f30327t.f33135g);
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
