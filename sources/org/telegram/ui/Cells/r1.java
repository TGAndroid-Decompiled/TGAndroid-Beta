package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.zj0;
public final class r1 {
    public final q1 f30172a;
    public boolean f30173b;
    public boolean f30174c;
    public boolean d;
    public boolean f30175e;
    public int f30176f = 0;
    public ArrayList f30177g;
    public boolean h;

    public r1(q1 q1Var) {
        this.f30172a = q1Var;
    }

    public final void a() {
        int i7;
        q1 q1Var = this.f30172a;
        q1Var.B0(0);
        if (this.f30173b) {
            boolean z9 = this.d;
            if (this.f30174c) {
                boolean z10 = (z9 ? 1 : 0) | true;
                i7 = (z9 ? 1 : 0) + 1;
                z9 = z10;
            } else {
                i7 = z9 ? 1 : 0;
            }
            if (this.f30175e) {
                z9 = (z9 ? 1 : 0) | true;
                i7++;
            }
            if (i7 == 0) {
                this.f30177g = null;
                this.f30176f = 0;
                return;
            }
            q1Var.f30017u0 = org.telegram.messenger.g0.L(60.0f) + q1Var.f30017u0;
            if (z9 != this.f30176f) {
                this.f30176f = 0;
                int y10 = org.telegram.messenger.camera.q.y(75.0f, q1Var.f29772a7, i7);
                float N = (q1Var.f29772a7 - org.telegram.messenger.g0.N(37.0f)) / i7;
                ArrayList arrayList = this.f30177g;
                if (arrayList == null) {
                    this.f30177g = new ArrayList(i7);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f30176f |= 1;
                    this.f30177g.add(q1.x0(5, hd.M0(2131743557, "ViewContact"), y10, N));
                }
                if (this.f30174c) {
                    this.f30176f |= 2;
                    this.f30177g.add(q1.x0(30, hd.M0(2131745418, "SharedContactMessage"), y10, N));
                }
                if (this.f30175e) {
                    this.f30176f |= 4;
                    this.f30177g.add(q1.x0(31, hd.M0(2131745419, "SharedContactAdd"), y10, N));
                }
            }
        }
    }

    public final void b(Canvas canvas) {
        int i7;
        boolean z9;
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        float f11;
        ic icVar;
        int i10;
        float f12;
        q1 q1Var = this.f30172a;
        Drawable[] drawableArr = q1Var.I2;
        di.z2 z2Var = q1Var.T0;
        if (q1Var.f29961p8 == null) {
            q1Var.f29961p8 = new zj0(q1Var);
        }
        int a10 = q1Var.f29961p8.a(q1Var.P5, q1Var.f29879ia, q1Var.f29891ja, q1Var.Pb, 4);
        if (q1Var.Fa == null) {
            q1Var.Fa = new ic(q1Var, 2.0f, 2.0f);
        }
        int L = (int) (z2Var.K0 - org.telegram.messenger.g0.L(13.0f));
        int L2 = q1Var.f29812d7 - org.telegram.messenger.g0.L(62.0f);
        ch.p0 p0Var = q1Var.N;
        if (!p0Var.f6373p) {
            L2 -= p0Var.f6371n;
        }
        if (q1Var.f30051w7) {
            if (q1Var.E3()) {
                f12 = 39.3f;
            } else {
                f12 = 41.0f;
            }
            L2 -= org.telegram.messenger.g0.L(f12);
        }
        int i11 = L2;
        if (q1Var.f30019u2 == null) {
            q1Var.f30019u2 = new RectF();
        }
        int backgroundDrawableRight = q1Var.getBackgroundDrawableRight();
        int L3 = org.telegram.messenger.g0.L(10.0f);
        if (q1Var.P5.Q3() && !q1Var.B6 && !q1Var.J) {
            i7 = org.telegram.messenger.g0.L(6.0f);
        } else {
            i7 = 0;
        }
        float extraTextX = (backgroundDrawableRight - (L3 + i7)) - q1Var.getExtraTextX();
        x1 x1Var = q1Var.f29868hb;
        if (x1Var.f30858x0) {
            extraTextX += x1Var.f30798i0;
        }
        q1Var.f30019u2.set(L, z2Var.L0 - org.telegram.messenger.g0.L(9.0f), extraTextX, org.telegram.messenger.g0.L(38.0f) + i11);
        float a11 = q1Var.Fa.a(0.0125f);
        if (a11 != 1.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            canvas.save();
            canvas.scale(a11, a11, q1Var.f30019u2.centerX(), q1Var.f30019u2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            q1Var.K2[0] = 0;
            f10 = 2.0f;
            drawable.setBounds(L, (int) (z2Var.L0 - org.telegram.messenger.g0.L(9.0f)), (int) extraTextX, org.telegram.messenger.g0.L(38.0f) + i11);
            if (q1Var.H2 != org.telegram.ui.ActionBar.k6.r1(0.1f, q1Var.f29961p8.i())) {
                Drawable drawable2 = drawableArr[0];
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, q1Var.f29961p8.i());
                q1Var.H2 = r12;
                org.telegram.ui.ActionBar.k6.H1(drawable2, r12, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f10 = 2.0f;
        }
        float floor = (float) Math.floor(iz.Y0 / 3.0f);
        int i12 = (int) floor;
        float f13 = 1.0f;
        q1Var.f29961p8.c(floor, floor, floor, 1.0f, canvas, q1Var.f30019u2);
        q1Var.f29961p8.f(canvas, q1Var.f30019u2, 1.0f);
        org.telegram.ui.ActionBar.k6.R2.setColor(a10);
        org.telegram.ui.ActionBar.k6.S2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ud, q1Var.Pb));
        if (q1Var.P5.Q3()) {
            org.telegram.ui.ActionBar.k6.S2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Tc, q1Var.Pb));
        } else {
            org.telegram.ui.ActionBar.k6.S2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, q1Var.Pb));
        }
        if (q1Var.f29930n2 != null) {
            canvas.save();
            canvas.translate(z2Var.K0 + z2Var.M0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(27.0f) + q1Var.Ta);
            xh.f.f(canvas, q1Var.f29930n2);
            canvas.restore();
        }
        if (q1Var.f29808d3 != null) {
            canvas.save();
            canvas.translate(z2Var.K0 + z2Var.M0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(50.0f) + q1Var.Ta);
            xh.f.f(canvas, q1Var.f29808d3);
            canvas.restore();
        }
        ArrayList arrayList = this.f30177g;
        if (arrayList != null && arrayList.size() > 0) {
            org.telegram.ui.ActionBar.k6.M2.setColor(a10);
            org.telegram.ui.ActionBar.k6.Y1.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, a10));
            int alpha = org.telegram.ui.ActionBar.k6.M2.getAlpha();
            org.telegram.ui.ActionBar.k6.M2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(q1Var.f30019u2.left + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(f10) + i11, q1Var.f30019u2.right - org.telegram.messenger.g0.L(7.0f), Math.max(1, org.telegram.messenger.g0.L(0.66f)) + org.telegram.messenger.g0.L(f10) + i11, org.telegram.ui.ActionBar.k6.M2);
            org.telegram.ui.ActionBar.k6.M2.setAlpha(alpha);
            int L4 = org.telegram.messenger.g0.L(f10) + i11;
            float L5 = org.telegram.messenger.g0.L(3.0f) + L;
            ArrayList arrayList2 = this.f30177g;
            if (arrayList2 != null && arrayList2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i13 = q1Var.f29961p8.f40992x;
            int i14 = 0;
            while (i14 < this.f30177g.size()) {
                n1 n1Var = (n1) this.f30177g.get(i14);
                float f14 = n1Var.f29593b;
                RectF rectF = n1Var.f29595e;
                float min = Math.min(f14 + L5, q1Var.f30019u2.right);
                rectF.set(L5, L4, min, org.telegram.messenger.g0.L(36.0f) + L4);
                if (z10 && n1Var.f29597g == null) {
                    q1Var.Qa = i13;
                    if (i14 == this.f30177g.size() - 1) {
                        i10 = i12;
                    } else {
                        i10 = 0;
                    }
                    z11 = false;
                    y c02 = org.telegram.ui.ActionBar.k6.c0(i13, 0, 0, i10, 0);
                    n1Var.f29597g = c02;
                    c02.setCallback(q1Var);
                } else {
                    z11 = false;
                }
                y yVar = n1Var.f29597g;
                float f15 = f13;
                if (yVar != null) {
                    yVar.setBounds((int) L5, L4, (int) min, org.telegram.messenger.g0.L(36.0f) + L4);
                    n1Var.f29597g.draw(canvas);
                }
                if (!z9 && (icVar = n1Var.f29596f) != null) {
                    f11 = icVar.a(0.02f);
                    if (f11 != f15) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                } else {
                    z12 = z11;
                    f11 = f15;
                }
                if (z12) {
                    canvas.save();
                    canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                }
                if (n1Var.d != null) {
                    canvas.save();
                    canvas.translate(n1Var.f29594c + L5, org.telegram.messenger.g0.L(10.5f) + L4);
                    n1Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z12) {
                    canvas.restore();
                }
                L5 += n1Var.f29593b;
                i14++;
                f13 = f15;
            }
        }
        if (z9) {
            canvas.restore();
        }
    }
}
