package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mk0;
public final class r1 {
    public final q1 f31687a;
    public boolean f31688b;
    public boolean f31689c;
    public boolean d;
    public boolean f31690e;
    public int f31691f = 0;
    public ArrayList f31692g;
    public boolean h;

    public r1(q1 q1Var) {
        this.f31687a = q1Var;
    }

    public final void a() {
        int i7;
        q1 q1Var = this.f31687a;
        q1Var.A0(0);
        if (this.f31688b) {
            boolean z10 = this.d;
            if (this.f31689c) {
                boolean z11 = (z10 ? 1 : 0) | true;
                i7 = (z10 ? 1 : 0) + 1;
                z10 = z11;
            } else {
                i7 = z10 ? 1 : 0;
            }
            if (this.f31690e) {
                z10 = (z10 ? 1 : 0) | true;
                i7++;
            }
            if (i7 == 0) {
                this.f31692g = null;
                this.f31691f = 0;
                return;
            }
            q1Var.f31553v0 = org.telegram.messenger.g0.L(60.0f) + q1Var.f31553v0;
            if (z10 != this.f31691f) {
                this.f31691f = 0;
                int z12 = n10.z(75.0f, q1Var.f31295b7, i7);
                float N = (q1Var.f31295b7 - org.telegram.messenger.g0.N(37.0f)) / i7;
                ArrayList arrayList = this.f31692g;
                if (arrayList == null) {
                    this.f31692g = new ArrayList(i7);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f31691f |= 1;
                    this.f31692g.add(q1.w0(5, gd.M0(2131743319, "ViewContact"), z12, N));
                }
                if (this.f31689c) {
                    this.f31691f |= 2;
                    this.f31692g.add(q1.w0(30, gd.M0(2131745222, "SharedContactMessage"), z12, N));
                }
                if (this.f31690e) {
                    this.f31691f |= 4;
                    this.f31692g.add(q1.w0(31, gd.M0(2131745223, "SharedContactAdd"), z12, N));
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
        q1 q1Var = this.f31687a;
        Drawable[] drawableArr = q1Var.J2;
        fi.s2 s2Var = q1Var.U0;
        if (q1Var.f31492q8 == null) {
            q1Var.f31492q8 = new mk0(q1Var);
        }
        int a10 = q1Var.f31492q8.a(q1Var.Q5, q1Var.f31402ja, q1Var.f31416ka, q1Var.Qb, 4);
        if (q1Var.Ga == null) {
            q1Var.Ga = new mc(q1Var, 2.0f, 2.0f);
        }
        int L = (int) (s2Var.L0 - org.telegram.messenger.g0.L(13.0f));
        int L2 = q1Var.f31334e7 - org.telegram.messenger.g0.L(62.0f);
        ch.q0 q0Var = q1Var.O;
        if (!q0Var.f5495p) {
            L2 -= q0Var.f5493n;
        }
        if (q1Var.f31588x7) {
            if (q1Var.H3()) {
                f12 = 39.3f;
            } else {
                f12 = 41.0f;
            }
            L2 -= org.telegram.messenger.g0.L(f12);
        }
        int i11 = L2;
        if (q1Var.f31555v2 == null) {
            q1Var.f31555v2 = new RectF();
        }
        int backgroundDrawableRight = q1Var.getBackgroundDrawableRight();
        int L3 = org.telegram.messenger.g0.L(10.0f);
        if (q1Var.Q5.P3() && !q1Var.C6 && !q1Var.K) {
            i7 = org.telegram.messenger.g0.L(6.0f);
        } else {
            i7 = 0;
        }
        float extraTextX = (backgroundDrawableRight - (L3 + i7)) - q1Var.getExtraTextX();
        x1 x1Var = q1Var.f31390ib;
        if (x1Var.f32395x0) {
            extraTextX += x1Var.f32335i0;
        }
        q1Var.f31555v2.set(L, s2Var.M0 - org.telegram.messenger.g0.L(9.0f), extraTextX, org.telegram.messenger.g0.L(38.0f) + i11);
        float a11 = q1Var.Ga.a(0.0125f);
        if (a11 != 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.save();
            canvas.scale(a11, a11, q1Var.f31555v2.centerX(), q1Var.f31555v2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            q1Var.L2[0] = 0;
            f10 = 2.0f;
            drawable.setBounds(L, (int) (s2Var.M0 - org.telegram.messenger.g0.L(9.0f)), (int) extraTextX, org.telegram.messenger.g0.L(38.0f) + i11);
            if (q1Var.I2 != org.telegram.ui.ActionBar.n6.r1(0.1f, q1Var.f31492q8.i())) {
                Drawable drawable2 = drawableArr[0];
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, q1Var.f31492q8.i());
                q1Var.I2 = r12;
                org.telegram.ui.ActionBar.n6.H1(drawable2, r12, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f10 = 2.0f;
        }
        float floor = (float) Math.floor(bz.Y0 / 3.0f);
        int i12 = (int) floor;
        float f13 = 1.0f;
        q1Var.f31492q8.c(floor, floor, floor, 1.0f, canvas, q1Var.f31555v2);
        q1Var.f31492q8.f(canvas, q1Var.f31555v2, 1.0f);
        org.telegram.ui.ActionBar.n6.R2.setColor(a10);
        org.telegram.ui.ActionBar.n6.S2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Xd, q1Var.Qb));
        if (q1Var.Q5.P3()) {
            org.telegram.ui.ActionBar.n6.S2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Wc, q1Var.Qb));
        } else {
            org.telegram.ui.ActionBar.n6.S2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Vc, q1Var.Qb));
        }
        if (q1Var.f31459o2 != null) {
            canvas.save();
            canvas.translate(s2Var.L0 + s2Var.N0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(27.0f) + q1Var.Ua);
            xh.f.f(canvas, q1Var.f31459o2);
            canvas.restore();
        }
        if (q1Var.f31330e3 != null) {
            canvas.save();
            canvas.translate(s2Var.L0 + s2Var.N0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(50.0f) + q1Var.Ua);
            xh.f.f(canvas, q1Var.f31330e3);
            canvas.restore();
        }
        ArrayList arrayList = this.f31692g;
        if (arrayList != null && arrayList.size() > 0) {
            org.telegram.ui.ActionBar.n6.M2.setColor(a10);
            org.telegram.ui.ActionBar.n6.Y1.setColor(org.telegram.ui.ActionBar.n6.r1(0.1f, a10));
            int alpha = org.telegram.ui.ActionBar.n6.M2.getAlpha();
            org.telegram.ui.ActionBar.n6.M2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(q1Var.f31555v2.left + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(f10) + i11, q1Var.f31555v2.right - org.telegram.messenger.g0.L(7.0f), Math.max(1, org.telegram.messenger.g0.L(0.66f)) + org.telegram.messenger.g0.L(f10) + i11, org.telegram.ui.ActionBar.n6.M2);
            org.telegram.ui.ActionBar.n6.M2.setAlpha(alpha);
            int L4 = org.telegram.messenger.g0.L(f10) + i11;
            float L5 = org.telegram.messenger.g0.L(3.0f) + L;
            ArrayList arrayList2 = this.f31692g;
            if (arrayList2 != null && arrayList2.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i13 = q1Var.f31492q8.f37548x;
            int i14 = 0;
            while (i14 < this.f31692g.size()) {
                n1 n1Var = (n1) this.f31692g.get(i14);
                float f14 = n1Var.f31105b;
                RectF rectF = n1Var.f31107e;
                float min = Math.min(f14 + L5, q1Var.f31555v2.right);
                rectF.set(L5, L4, min, org.telegram.messenger.g0.L(36.0f) + L4);
                if (z11 && n1Var.f31109g == null) {
                    q1Var.Ra = i13;
                    if (i14 == this.f31692g.size() - 1) {
                        i10 = i12;
                    } else {
                        i10 = 0;
                    }
                    z12 = false;
                    y c02 = org.telegram.ui.ActionBar.n6.c0(i13, 0, 0, i10, 0);
                    n1Var.f31109g = c02;
                    c02.setCallback(q1Var);
                } else {
                    z12 = false;
                }
                y yVar = n1Var.f31109g;
                float f15 = f13;
                if (yVar != null) {
                    yVar.setBounds((int) L5, L4, (int) min, org.telegram.messenger.g0.L(36.0f) + L4);
                    n1Var.f31109g.draw(canvas);
                }
                if (!z10 && (mcVar = n1Var.f31108f) != null) {
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
                if (n1Var.d != null) {
                    canvas.save();
                    canvas.translate(n1Var.f31106c + L5, org.telegram.messenger.g0.L(10.5f) + L4);
                    n1Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z13) {
                    canvas.restore();
                }
                L5 += n1Var.f31105b;
                i14++;
                f13 = f15;
            }
        }
        if (z10) {
            canvas.restore();
        }
    }
}
