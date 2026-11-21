package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ok0;
public final class s1 {
    public final r1 f31768a;
    public boolean f31769b;
    public boolean f31770c;
    public boolean d;
    public boolean f31771e;
    public int f31772f = 0;
    public ArrayList f31773g;
    public boolean h;

    public s1(r1 r1Var) {
        this.f31768a = r1Var;
    }

    public final void a() {
        int i7;
        r1 r1Var = this.f31768a;
        r1Var.A0(0);
        if (this.f31769b) {
            boolean z10 = this.d;
            if (this.f31770c) {
                boolean z11 = (z10 ? 1 : 0) | true;
                i7 = (z10 ? 1 : 0) + 1;
                z10 = z11;
            } else {
                i7 = z10 ? 1 : 0;
            }
            if (this.f31771e) {
                z10 = (z10 ? 1 : 0) | true;
                i7++;
            }
            if (i7 == 0) {
                this.f31773g = null;
                this.f31772f = 0;
                return;
            }
            r1Var.f31631v0 = org.telegram.messenger.g0.L(60.0f) + r1Var.f31631v0;
            if (z10 != this.f31772f) {
                this.f31772f = 0;
                int z12 = n10.z(75.0f, r1Var.f31373b7, i7);
                float N = (r1Var.f31373b7 - org.telegram.messenger.g0.N(37.0f)) / i7;
                ArrayList arrayList = this.f31773g;
                if (arrayList == null) {
                    this.f31773g = new ArrayList(i7);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f31772f |= 1;
                    this.f31773g.add(r1.w0(5, gd.N0(2131743313, "ViewContact"), z12, N));
                }
                if (this.f31770c) {
                    this.f31772f |= 2;
                    this.f31773g.add(r1.w0(30, gd.N0(2131745221, "SharedContactMessage"), z12, N));
                }
                if (this.f31771e) {
                    this.f31772f |= 4;
                    this.f31773g.add(r1.w0(31, gd.N0(2131745222, "SharedContactAdd"), z12, N));
                }
            }
        }
    }

    public final void b(Canvas canvas) {
        int i7;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f11;
        mc mcVar;
        int i10;
        float f12;
        r1 r1Var = this.f31768a;
        Drawable[] drawableArr = r1Var.J2;
        fi.s2 s2Var = r1Var.U0;
        if (r1Var.f31570q8 == null) {
            r1Var.f31570q8 = new ok0(r1Var);
        }
        int a10 = r1Var.f31570q8.a(r1Var.Q5, r1Var.f31480ja, r1Var.f31494ka, r1Var.Qb, 4);
        if (r1Var.Ga == null) {
            r1Var.Ga = new mc(r1Var, 2.0f, 2.0f);
        }
        int L = (int) (s2Var.L0 - org.telegram.messenger.g0.L(13.0f));
        int L2 = r1Var.f31412e7 - org.telegram.messenger.g0.L(62.0f);
        ch.q0 q0Var = r1Var.O;
        if (!q0Var.f5521p) {
            L2 -= q0Var.f5519n;
        }
        if (r1Var.f31666x7) {
            if (r1Var.H3()) {
                f12 = 39.3f;
            } else {
                f12 = 41.0f;
            }
            L2 -= org.telegram.messenger.g0.L(f12);
        }
        int i11 = L2;
        if (r1Var.f31633v2 == null) {
            r1Var.f31633v2 = new RectF();
        }
        int backgroundDrawableRight = r1Var.getBackgroundDrawableRight();
        int L3 = org.telegram.messenger.g0.L(10.0f);
        if (r1Var.Q5.P3() && !r1Var.C6 && !r1Var.K) {
            i7 = org.telegram.messenger.g0.L(6.0f);
        } else {
            i7 = 0;
        }
        float extraTextX = (backgroundDrawableRight - (L3 + i7)) - r1Var.getExtraTextX();
        y1 y1Var = r1Var.f31468ib;
        if (y1Var.f32470x0) {
            extraTextX += y1Var.f32410i0;
        }
        r1Var.f31633v2.set(L, s2Var.M0 - org.telegram.messenger.g0.L(9.0f), extraTextX, org.telegram.messenger.g0.L(38.0f) + i11);
        float a11 = r1Var.Ga.a(0.0125f);
        if (a11 != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.save();
            canvas.scale(a11, a11, r1Var.f31633v2.centerX(), r1Var.f31633v2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            r1Var.L2[0] = 0;
            f10 = 2.0f;
            drawable.setBounds(L, (int) (s2Var.M0 - org.telegram.messenger.g0.L(9.0f)), (int) extraTextX, org.telegram.messenger.g0.L(38.0f) + i11);
            if (r1Var.I2 != org.telegram.ui.ActionBar.m6.r1(0.1f, r1Var.f31570q8.i())) {
                Drawable drawable2 = drawableArr[0];
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, r1Var.f31570q8.i());
                r1Var.I2 = r12;
                org.telegram.ui.ActionBar.m6.H1(drawable2, r12, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f10 = 2.0f;
        }
        float floor = (float) Math.floor(bz.Y0 / 3.0f);
        int i12 = (int) floor;
        float f13 = 1.0f;
        r1Var.f31570q8.c(floor, floor, floor, 1.0f, canvas, r1Var.f31633v2);
        r1Var.f31570q8.f(canvas, r1Var.f31633v2, 1.0f);
        org.telegram.ui.ActionBar.m6.R2.setColor(a10);
        org.telegram.ui.ActionBar.m6.S2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Xd, r1Var.Qb));
        if (r1Var.Q5.P3()) {
            org.telegram.ui.ActionBar.m6.S2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Wc, r1Var.Qb));
        } else {
            org.telegram.ui.ActionBar.m6.S2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Vc, r1Var.Qb));
        }
        if (r1Var.f31537o2 != null) {
            canvas.save();
            canvas.translate(s2Var.L0 + s2Var.N0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(27.0f) + r1Var.Ua);
            xh.f.f(canvas, r1Var.f31537o2);
            canvas.restore();
        }
        if (r1Var.f31408e3 != null) {
            canvas.save();
            canvas.translate(s2Var.L0 + s2Var.N0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(50.0f) + r1Var.Ua);
            xh.f.f(canvas, r1Var.f31408e3);
            canvas.restore();
        }
        ArrayList arrayList = this.f31773g;
        if (arrayList != null && arrayList.size() > 0) {
            org.telegram.ui.ActionBar.m6.M2.setColor(a10);
            org.telegram.ui.ActionBar.m6.Y1.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, a10));
            int alpha = org.telegram.ui.ActionBar.m6.M2.getAlpha();
            org.telegram.ui.ActionBar.m6.M2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(r1Var.f31633v2.left + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(f10) + i11, r1Var.f31633v2.right - org.telegram.messenger.g0.L(7.0f), Math.max(1, org.telegram.messenger.g0.L(0.66f)) + org.telegram.messenger.g0.L(f10) + i11, org.telegram.ui.ActionBar.m6.M2);
            org.telegram.ui.ActionBar.m6.M2.setAlpha(alpha);
            int L4 = org.telegram.messenger.g0.L(f10) + i11;
            float L5 = org.telegram.messenger.g0.L(3.0f) + L;
            ArrayList arrayList2 = this.f31773g;
            if (arrayList2 != null && arrayList2.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i13 = r1Var.f31570q8.f38279x;
            int i14 = 0;
            while (i14 < this.f31773g.size()) {
                o1 o1Var = (o1) this.f31773g.get(i14);
                float f14 = o1Var.f31187b;
                RectF rectF = o1Var.f31189e;
                float min = Math.min(f14 + L5, r1Var.f31633v2.right);
                rectF.set(L5, L4, min, org.telegram.messenger.g0.L(36.0f) + L4);
                if (z11 && o1Var.f31191g == null) {
                    r1Var.Ra = i13;
                    if (i14 == this.f31773g.size() - 1) {
                        i10 = i12;
                    } else {
                        i10 = 0;
                    }
                    z12 = false;
                    y c02 = org.telegram.ui.ActionBar.m6.c0(i13, 0, 0, i10, 0);
                    o1Var.f31191g = c02;
                    c02.setCallback(r1Var);
                } else {
                    z12 = false;
                }
                y yVar = o1Var.f31191g;
                float f15 = f13;
                if (yVar != null) {
                    yVar.setBounds((int) L5, L4, (int) min, org.telegram.messenger.g0.L(36.0f) + L4);
                    o1Var.f31191g.draw(canvas);
                }
                if (!z10 && (mcVar = o1Var.f31190f) != null) {
                    f11 = mcVar.a(0.02f);
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
                if (o1Var.d != null) {
                    canvas.save();
                    canvas.translate(o1Var.f31188c + L5, org.telegram.messenger.g0.L(10.5f) + L4);
                    o1Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z13) {
                    canvas.restore();
                }
                L5 += o1Var.f31187b;
                i14++;
                f13 = f15;
            }
        }
        if (z10) {
            canvas.restore();
        }
    }
}
