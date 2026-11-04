package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.gc;
public final class r1 {
    public final q1 f30254a;
    public boolean f30255b;
    public boolean f30256c;
    public boolean d;
    public boolean f30257e;
    public int f30258f = 0;
    public ArrayList f30259g;
    public boolean h;

    public r1(q1 q1Var) {
        this.f30254a = q1Var;
    }

    public final void a() {
        int i3;
        q1 q1Var = this.f30254a;
        q1Var.A0(0);
        if (this.f30255b) {
            boolean z10 = this.d;
            if (this.f30256c) {
                boolean z11 = (z10 ? 1 : 0) | true;
                i3 = (z10 ? 1 : 0) + 1;
                z10 = z11;
            } else {
                i3 = z10 ? 1 : 0;
            }
            if (this.f30257e) {
                z10 = (z10 ? 1 : 0) | true;
                i3++;
            }
            if (i3 == 0) {
                this.f30259g = null;
                this.f30258f = 0;
                return;
            }
            q1Var.f30106v0 = org.telegram.messenger.g0.L(60.0f) + q1Var.f30106v0;
            if (z10 != this.f30258f) {
                this.f30258f = 0;
                int y9 = org.telegram.messenger.camera.q.y(75.0f, q1Var.f29848a7, i3);
                float N = (q1Var.f29848a7 - org.telegram.messenger.g0.N(37.0f)) / i3;
                ArrayList arrayList = this.f30259g;
                if (arrayList == null) {
                    this.f30259g = new ArrayList(i3);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f30258f |= 1;
                    this.f30259g.add(q1.w0(5, bd.M0(2131743566, "ViewContact"), y9, N));
                }
                if (this.f30256c) {
                    this.f30258f |= 2;
                    this.f30259g.add(q1.w0(30, bd.M0(2131745427, "SharedContactMessage"), y9, N));
                }
                if (this.f30257e) {
                    this.f30258f |= 4;
                    this.f30259g.add(q1.w0(31, bd.M0(2131745428, "SharedContactAdd"), y9, N));
                }
            }
        }
    }

    public final void b(Canvas canvas) {
        int i3;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f11;
        gc gcVar;
        int i10;
        float f12;
        q1 q1Var = this.f30254a;
        Drawable[] drawableArr = q1Var.I2;
        ei.c3 c3Var = q1Var.U0;
        if (q1Var.f30039p8 == null) {
            q1Var.f30039p8 = new dk0(q1Var);
        }
        int a10 = q1Var.f30039p8.a(q1Var.P5, q1Var.f29955ia, q1Var.f29968ja, q1Var.Pb, 4);
        if (q1Var.Fa == null) {
            q1Var.Fa = new gc(q1Var, 2.0f, 2.0f);
        }
        int L = (int) (c3Var.L0 - org.telegram.messenger.g0.L(13.0f));
        int L2 = q1Var.f29887d7 - org.telegram.messenger.g0.L(62.0f);
        dh.o0 o0Var = q1Var.O;
        if (!o0Var.f9125p) {
            L2 -= o0Var.f9123n;
        }
        if (q1Var.f30127w7) {
            if (q1Var.D3()) {
                f12 = 39.3f;
            } else {
                f12 = 41.0f;
            }
            L2 -= org.telegram.messenger.g0.L(f12);
        }
        int i11 = L2;
        if (q1Var.f30096u2 == null) {
            q1Var.f30096u2 = new RectF();
        }
        int backgroundDrawableRight = q1Var.getBackgroundDrawableRight();
        int L3 = org.telegram.messenger.g0.L(10.0f);
        if (q1Var.P5.Q3() && !q1Var.B6 && !q1Var.K) {
            i3 = org.telegram.messenger.g0.L(6.0f);
        } else {
            i3 = 0;
        }
        float extraTextX = (backgroundDrawableRight - (L3 + i3)) - q1Var.getExtraTextX();
        x1 x1Var = q1Var.hb;
        if (x1Var.f30936x0) {
            extraTextX += x1Var.f30876i0;
        }
        q1Var.f30096u2.set(L, c3Var.M0 - org.telegram.messenger.g0.L(9.0f), extraTextX, org.telegram.messenger.g0.L(38.0f) + i11);
        float a11 = q1Var.Fa.a(0.0125f);
        if (a11 != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.save();
            canvas.scale(a11, a11, q1Var.f30096u2.centerX(), q1Var.f30096u2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            q1Var.K2[0] = 0;
            f10 = 2.0f;
            drawable.setBounds(L, (int) (c3Var.M0 - org.telegram.messenger.g0.L(9.0f)), (int) extraTextX, org.telegram.messenger.g0.L(38.0f) + i11);
            if (q1Var.H2 != org.telegram.ui.ActionBar.k6.r1(0.1f, q1Var.f30039p8.i())) {
                Drawable drawable2 = drawableArr[0];
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, q1Var.f30039p8.i());
                q1Var.H2 = r12;
                org.telegram.ui.ActionBar.k6.H1(drawable2, r12, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f10 = 2.0f;
        }
        float floor = (float) Math.floor(az.Y0 / 3.0f);
        int i12 = (int) floor;
        float f13 = 1.0f;
        q1Var.f30039p8.c(floor, floor, floor, 1.0f, canvas, q1Var.f30096u2);
        q1Var.f30039p8.f(canvas, q1Var.f30096u2, 1.0f);
        org.telegram.ui.ActionBar.k6.R2.setColor(a10);
        org.telegram.ui.ActionBar.k6.S2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ud, q1Var.Pb));
        if (q1Var.P5.Q3()) {
            org.telegram.ui.ActionBar.k6.S2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Tc, q1Var.Pb));
        } else {
            org.telegram.ui.ActionBar.k6.S2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, q1Var.Pb));
        }
        if (q1Var.f30008n2 != null) {
            canvas.save();
            canvas.translate(c3Var.L0 + c3Var.N0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(27.0f) + q1Var.Ta);
            yh.f.f(canvas, q1Var.f30008n2);
            canvas.restore();
        }
        if (q1Var.f29883d3 != null) {
            canvas.save();
            canvas.translate(c3Var.L0 + c3Var.N0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(50.0f) + q1Var.Ta);
            yh.f.f(canvas, q1Var.f29883d3);
            canvas.restore();
        }
        ArrayList arrayList = this.f30259g;
        if (arrayList != null && arrayList.size() > 0) {
            org.telegram.ui.ActionBar.k6.M2.setColor(a10);
            org.telegram.ui.ActionBar.k6.Y1.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, a10));
            int alpha = org.telegram.ui.ActionBar.k6.M2.getAlpha();
            org.telegram.ui.ActionBar.k6.M2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(q1Var.f30096u2.left + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(f10) + i11, q1Var.f30096u2.right - org.telegram.messenger.g0.L(7.0f), Math.max(1, org.telegram.messenger.g0.L(0.66f)) + org.telegram.messenger.g0.L(f10) + i11, org.telegram.ui.ActionBar.k6.M2);
            org.telegram.ui.ActionBar.k6.M2.setAlpha(alpha);
            int L4 = org.telegram.messenger.g0.L(f10) + i11;
            float L5 = org.telegram.messenger.g0.L(3.0f) + L;
            ArrayList arrayList2 = this.f30259g;
            if (arrayList2 != null && arrayList2.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i13 = q1Var.f30039p8.f33150x;
            int i14 = 0;
            while (i14 < this.f30259g.size()) {
                n1 n1Var = (n1) this.f30259g.get(i14);
                float f14 = n1Var.f29654b;
                RectF rectF = n1Var.f29656e;
                float min = Math.min(f14 + L5, q1Var.f30096u2.right);
                rectF.set(L5, L4, min, org.telegram.messenger.g0.L(36.0f) + L4);
                if (z11 && n1Var.f29658g == null) {
                    q1Var.Qa = i13;
                    if (i14 == this.f30259g.size() - 1) {
                        i10 = i12;
                    } else {
                        i10 = 0;
                    }
                    z12 = false;
                    y c02 = org.telegram.ui.ActionBar.k6.c0(i13, 0, 0, i10, 0);
                    n1Var.f29658g = c02;
                    c02.setCallback(q1Var);
                } else {
                    z12 = false;
                }
                y yVar = n1Var.f29658g;
                float f15 = f13;
                if (yVar != null) {
                    yVar.setBounds((int) L5, L4, (int) min, org.telegram.messenger.g0.L(36.0f) + L4);
                    n1Var.f29658g.draw(canvas);
                }
                if (!z10 && (gcVar = n1Var.f29657f) != null) {
                    f11 = gcVar.a(0.02f);
                    if (f11 != f15) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                } else {
                    z13 = z12;
                    f11 = f15;
                }
                if (z13) {
                    canvas.save();
                    canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                }
                if (n1Var.d != null) {
                    canvas.save();
                    canvas.translate(n1Var.f29655c + L5, org.telegram.messenger.g0.L(10.5f) + L4);
                    n1Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z13) {
                    canvas.restore();
                }
                L5 += n1Var.f29654b;
                i14++;
                f13 = f15;
            }
        }
        if (z10) {
            canvas.restore();
        }
    }
}
