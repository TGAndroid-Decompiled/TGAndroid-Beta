package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.tz;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dl0;
public final class r1 {
    public final q1 f22864a;
    public boolean f22865b;
    public boolean f22866c;
    public boolean d;
    public boolean e;
    public int f22867f = 0;
    public ArrayList f22868g;
    public boolean h;

    public r1(q1 q1Var) {
        this.f22864a = q1Var;
    }

    public final void a() {
        int i10;
        q1 q1Var = this.f22864a;
        q1Var.z0(0);
        if (this.f22865b) {
            boolean z10 = this.d;
            if (this.f22866c) {
                boolean z11 = (z10 ? 1 : 0) | true;
                i10 = (z10 ? 1 : 0) + 1;
                z10 = z11;
            } else {
                i10 = z10 ? 1 : 0;
            }
            if (this.e) {
                z10 = (z10 ? 1 : 0) | true;
                i10++;
            }
            if (i10 == 0) {
                this.f22868g = null;
                this.f22867f = 0;
                return;
            }
            q1Var.f22737u0 = org.telegram.messenger.i0.L(60.0f) + q1Var.f22737u0;
            if (z10 != this.f22867f) {
                this.f22867f = 0;
                int y3 = z20.y(75.0f, q1Var.Z6, i10);
                float N = (q1Var.Z6 - org.telegram.messenger.i0.N(37.0f)) / i10;
                ArrayList arrayList = this.f22868g;
                if (arrayList == null) {
                    this.f22868g = new ArrayList(i10);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f22867f |= 1;
                    this.f22868g.add(q1.v0(5, cd.L0(2131743582, "ViewContact"), y3, N));
                }
                if (this.f22866c) {
                    this.f22867f |= 2;
                    this.f22868g.add(q1.v0(30, cd.L0(2131745435, "SharedContactMessage"), y3, N));
                }
                if (this.e) {
                    this.f22867f |= 4;
                    this.f22868g.add(q1.v0(31, cd.L0(2131745436, "SharedContactAdd"), y3, N));
                }
            }
        }
    }

    public final void b(Canvas canvas) {
        int i10;
        boolean z10;
        float f7;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        dc dcVar;
        int i11;
        float f11;
        q1 q1Var = this.f22864a;
        Drawable[] drawableArr = q1Var.H2;
        ag.c2 c2Var = q1Var.T0;
        if (q1Var.f22670o8 == null) {
            q1Var.f22670o8 = new dl0(q1Var);
        }
        int a2 = q1Var.f22670o8.a(q1Var.O5, q1Var.ha, q1Var.ia, q1Var.Ob, 4);
        if (q1Var.Ea == null) {
            q1Var.Ea = new dc(q1Var, 2.0f, 2.0f);
        }
        int L = (int) (c2Var.K0 - org.telegram.messenger.i0.L(13.0f));
        int L2 = q1Var.f22519c7 - org.telegram.messenger.i0.L(62.0f);
        sg.p0 p0Var = q1Var.N;
        if (!p0Var.f48450p) {
            L2 -= p0Var.f48448n;
        }
        if (q1Var.f22756v7) {
            if (q1Var.B3()) {
                f11 = 39.3f;
            } else {
                f11 = 41.0f;
            }
            L2 -= org.telegram.messenger.i0.L(f11);
        }
        int i12 = L2;
        if (q1Var.f22726t2 == null) {
            q1Var.f22726t2 = new RectF();
        }
        int backgroundDrawableRight = q1Var.getBackgroundDrawableRight();
        int L3 = org.telegram.messenger.i0.L(10.0f);
        if (q1Var.O5.P3() && !q1Var.A6 && !q1Var.J) {
            i10 = org.telegram.messenger.i0.L(6.0f);
        } else {
            i10 = 0;
        }
        float extraTextX = (backgroundDrawableRight - (L3 + i10)) - q1Var.getExtraTextX();
        x1 x1Var = q1Var.gb;
        if (x1Var.f23554x0) {
            extraTextX += x1Var.f23492i0;
        }
        q1Var.f22726t2.set(L, c2Var.L0 - org.telegram.messenger.i0.L(9.0f), extraTextX, org.telegram.messenger.i0.L(38.0f) + i12);
        float a10 = q1Var.Ea.a(0.0125f);
        if (a10 != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.save();
            canvas.scale(a10, a10, q1Var.f22726t2.centerX(), q1Var.f22726t2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            q1Var.J2[0] = 0;
            f7 = 2.0f;
            drawable.setBounds(L, (int) (c2Var.L0 - org.telegram.messenger.i0.L(9.0f)), (int) extraTextX, org.telegram.messenger.i0.L(38.0f) + i12);
            if (q1Var.G2 != org.telegram.ui.ActionBar.t6.r1(0.1f, q1Var.f22670o8.i())) {
                Drawable drawable2 = drawableArr[0];
                int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, q1Var.f22670o8.i());
                q1Var.G2 = r12;
                org.telegram.ui.ActionBar.t6.H1(drawable2, r12, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f7 = 2.0f;
        }
        float floor = (float) Math.floor(tz.Y0 / 3.0f);
        int i13 = (int) floor;
        float f12 = 1.0f;
        q1Var.f22670o8.c(floor, floor, floor, 1.0f, canvas, q1Var.f22726t2);
        q1Var.f22670o8.f(canvas, q1Var.f22726t2, 1.0f);
        org.telegram.ui.ActionBar.t6.R2.setColor(a2);
        org.telegram.ui.ActionBar.t6.S2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ud, q1Var.Ob));
        if (q1Var.O5.P3()) {
            org.telegram.ui.ActionBar.t6.S2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Tc, q1Var.Ob));
        } else {
            org.telegram.ui.ActionBar.t6.S2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sc, q1Var.Ob));
        }
        if (q1Var.f22637m2 != null) {
            canvas.save();
            canvas.translate(c2Var.K0 + c2Var.M0 + org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(27.0f) + q1Var.Sa);
            nh.i.f(canvas, q1Var.f22637m2);
            canvas.restore();
        }
        if (q1Var.f22515c3 != null) {
            canvas.save();
            canvas.translate(c2Var.K0 + c2Var.M0 + org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(50.0f) + q1Var.Sa);
            nh.i.f(canvas, q1Var.f22515c3);
            canvas.restore();
        }
        ArrayList arrayList = this.f22868g;
        if (arrayList != null && arrayList.size() > 0) {
            org.telegram.ui.ActionBar.t6.M2.setColor(a2);
            org.telegram.ui.ActionBar.t6.Y1.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, a2));
            int alpha = org.telegram.ui.ActionBar.t6.M2.getAlpha();
            org.telegram.ui.ActionBar.t6.M2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(q1Var.f22726t2.left + org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(f7) + i12, q1Var.f22726t2.right - org.telegram.messenger.i0.L(7.0f), Math.max(1, org.telegram.messenger.i0.L(0.66f)) + org.telegram.messenger.i0.L(f7) + i12, org.telegram.ui.ActionBar.t6.M2);
            org.telegram.ui.ActionBar.t6.M2.setAlpha(alpha);
            int L4 = org.telegram.messenger.i0.L(f7) + i12;
            float L5 = org.telegram.messenger.i0.L(3.0f) + L;
            ArrayList arrayList2 = this.f22868g;
            if (arrayList2 != null && arrayList2.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i14 = q1Var.f22670o8.f25460x;
            int i15 = 0;
            while (i15 < this.f22868g.size()) {
                n1 n1Var = (n1) this.f22868g.get(i15);
                float f13 = n1Var.f22332b;
                RectF rectF = n1Var.e;
                float min = Math.min(f13 + L5, q1Var.f22726t2.right);
                rectF.set(L5, L4, min, org.telegram.messenger.i0.L(36.0f) + L4);
                if (z11 && n1Var.f22335g == null) {
                    q1Var.Pa = i14;
                    if (i15 == this.f22868g.size() - 1) {
                        i11 = i13;
                    } else {
                        i11 = 0;
                    }
                    z12 = false;
                    y c02 = org.telegram.ui.ActionBar.t6.c0(i14, 0, 0, i11, 0);
                    n1Var.f22335g = c02;
                    c02.setCallback(q1Var);
                } else {
                    z12 = false;
                }
                y yVar = n1Var.f22335g;
                float f14 = f12;
                if (yVar != null) {
                    yVar.setBounds((int) L5, L4, (int) min, org.telegram.messenger.i0.L(36.0f) + L4);
                    n1Var.f22335g.draw(canvas);
                }
                if (!z10 && (dcVar = n1Var.f22334f) != null) {
                    f10 = dcVar.a(0.02f);
                    if (f10 != f14) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                } else {
                    z13 = z12;
                    f10 = f14;
                }
                if (z13) {
                    canvas.save();
                    canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
                }
                if (n1Var.d != null) {
                    canvas.save();
                    canvas.translate(n1Var.f22333c + L5, org.telegram.messenger.i0.L(10.5f) + L4);
                    n1Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z13) {
                    canvas.restore();
                }
                L5 += n1Var.f22332b;
                i15++;
                f12 = f14;
            }
        }
        if (z10) {
            canvas.restore();
        }
    }
}
