package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.tl.TL_iv;
public final class dk0 extends org.telegram.messenger.fu implements p71 {
    public static final AtomicInteger f33084s0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed W;
    public org.telegram.utils.twidget.v0 X;
    public final boolean Y;
    public int Z;
    public final Path f33085a0;
    public final float[] f33086b0;
    public final int f33087c0;
    public q71 f33088d0;
    public boolean f33089e0;
    public long f33090f0;
    public boolean f33091g0;
    public final pb0 f33092h0;
    public int f33093i0;
    public int f33094j0;
    public String f33095k0;
    public org.telegram.utils.twidget.n1 f33096l0;
    public org.telegram.ui.Cells.t9[] m0;
    public boolean f33097n0;
    public long f33098o0;
    public boolean f33099p0;
    public boolean f33100q0;
    public float f33101r0;

    public dk0(org.telegram.messenger.kv r4, android.graphics.Rect r5, int r6, org.telegram.tgnet.tl.TL_iv.pageBlockEmbed r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dk0.<init>(org.telegram.messenger.kv, android.graphics.Rect, int, org.telegram.tgnet.tl.TL_iv$pageBlockEmbed, boolean):void");
    }

    public static int j0() {
        int i7;
        int i10 = org.telegram.messenger.iz.Y0;
        if (i10 >= 15) {
            i7 = org.telegram.messenger.g0.L(2.0f);
        } else if (i10 >= 11) {
            i7 = org.telegram.messenger.g0.L(1.0f);
        } else {
            i7 = 0;
        }
        return (org.telegram.messenger.g0.L(9.0f) + i7) - org.telegram.messenger.g0.L(2.0f);
    }

    public static float l0(int i7) {
        return (float) Math.ceil((i7 / org.telegram.messenger.g0.f22562p) - 0.01f);
    }

    public static int t0(int i7, boolean z9) {
        int i10;
        float f10 = 6.0f;
        int L = org.telegram.messenger.g0.L(6.0f) + i7;
        if (org.telegram.messenger.iz.Y0 < 10) {
            f10 = 4.0f;
        }
        int D = org.telegram.messenger.k5.D(f10, 2, L);
        if (z9) {
            i10 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i10 = 0;
        }
        return org.telegram.messenger.g0.L(4.0f) + D + i10;
    }

    @Override
    public final int I() {
        Rect rect = this.f22470b;
        return rect.top + this.f33093i0 + rect.bottom;
    }

    @Override
    public final org.telegram.ui.Cells.t9[] L() {
        return this.m0;
    }

    @Override
    public final boolean Q() {
        q71 q71Var = this.f33088d0;
        if (q71Var != null && this.f33089e0 && q71Var.f37230w && (q71Var.L & 3) != 2) {
            if (q71Var.f37233z || q71Var.n()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void T() {
        org.telegram.utils.twidget.v0 v0Var = this.X;
        TL_iv.pageBlockEmbed pageblockembed = this.W;
        if (v0Var == null) {
            this.X = org.telegram.utils.twidget.n0.i(pageblockembed.url);
        }
        if (this.X == null) {
            return;
        }
        if (this.f33088d0 == null) {
            this.f33088d0 = new q71(this, org.telegram.messenger.g0.f22562p);
        }
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f52929a.get(pageblockembed.url);
        if (k0Var != null) {
            ArrayList arrayList = k0Var.v;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            boolean z9 = false;
            if (org.telegram.utils.twidget.n0.q(arrayList) != this) {
                q71 q71Var = this.f33088d0;
                org.telegram.utils.twidget.v0 v0Var2 = this.X;
                q71Var.q();
                q71Var.f37224p = v0Var2;
                if (v0Var2 != null) {
                    z9 = true;
                }
                q71Var.f37226r = z9;
                return;
            }
            dk0 dk0Var = k0Var.f52897w;
            k0Var.f52897w = this;
            if (dk0Var != null && dk0Var != this && dk0Var.f33089e0 && dk0Var.f33088d0 != null) {
                dk0Var.s0();
                q71 q71Var2 = dk0Var.f33088d0;
                org.telegram.utils.twidget.v0 v0Var3 = dk0Var.X;
                q71Var2.q();
                q71Var2.f37224p = v0Var3;
                if (v0Var3 != null) {
                    z9 = true;
                }
                q71Var2.f37226r = z9;
                View view = dk0Var.V;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        r0();
    }

    @Override
    public final void V() {
        q71 q71Var;
        if (this.f33088d0 != null) {
            s0();
            this.f33088d0.q();
            org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f52929a.get(this.W.url);
            if (k0Var != null) {
                ArrayList arrayList = k0Var.v;
                arrayList.remove(this);
                if (k0Var.f52897w == this) {
                    dk0 q10 = org.telegram.utils.twidget.n0.q(arrayList);
                    k0Var.f52897w = q10;
                    if (q10 != null && !q10.f33089e0 && q10.V != null && (q71Var = q10.f33088d0) != null && q10.X != null) {
                        q71Var.q();
                        q10.r0();
                        q10.V.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void W(Canvas canvas) {
        org.telegram.ui.ActionBar.g6 g6Var;
        int max;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        View view;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        if (this.f33088d0 == null) {
            return;
        }
        int i7 = this.Z;
        org.telegram.messenger.kv kvVar = this.f22469a;
        org.telegram.ui.Cells.q1 q1Var2 = kvVar.E;
        org.telegram.ui.Cells.x1 x1Var = null;
        if (q1Var2 != null) {
            g6Var = q1Var2.getResourcesProvider();
        } else {
            g6Var = null;
        }
        if (i7 != org.telegram.utils.twidget.j1.d(g6Var, kvVar.E())) {
            org.telegram.ui.Cells.q1 q1Var3 = kvVar.E;
            if (q1Var3 != null) {
                g6Var2 = q1Var3.getResourcesProvider();
            } else {
                g6Var2 = null;
            }
            this.Z = org.telegram.utils.twidget.j1.d(g6Var2, kvVar.E());
            this.X.l(org.telegram.utils.twidget.j1.a(g6Var2, kvVar.E()));
        }
        if (R()) {
            max = 0;
        } else {
            max = Math.max(0, Math.min(j0(), kvVar.S - org.telegram.messenger.g0.L(2.0f)));
        }
        this.f33094j0 = max;
        int u02 = u0();
        float f16 = this.f33093i0;
        if (this.f33098o0 != 0 && (q1Var = kvVar.E) != null) {
            x1Var = q1Var.getTransitionParams();
        }
        if (x1Var != null && x1Var.f30867x0) {
            this.f33099p0 = true;
            f11 = x1Var.f30816k0 + 0.0f;
            f16 += x1Var.f30812j0;
            if (i0()) {
                f10 = x1Var.f30812j0;
            } else {
                f10 = x1Var.f30816k0;
            }
        } else {
            if (x1Var != null && (this.f33099p0 || SystemClock.uptimeMillis() - this.f33098o0 > 250)) {
                this.f33098o0 = 0L;
                this.f33099p0 = false;
            }
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (i0()) {
            f10 += this.f33093i0 - k0();
        }
        this.f33101r0 = f16;
        canvas.save();
        canvas.translate(-this.f33094j0, 0.0f);
        Path path = this.f33085a0;
        path.rewind();
        int i10 = org.telegram.messenger.iz.Y0;
        if (i10 > 2) {
            i10 -= 2;
        }
        int L = org.telegram.messenger.g0.L(i10);
        int min = Math.min(org.telegram.messenger.g0.L(3.0f), L);
        boolean z9 = this.Y;
        if (z9 && !kvVar.B() && (kvVar.E() || !kvVar.G())) {
            f12 = L;
        } else {
            f12 = min;
        }
        if (z9 && (!kvVar.E() || !kvVar.G())) {
            f13 = L;
        } else {
            f13 = min;
        }
        float[] fArr = this.f33086b0;
        fArr[1] = f12;
        fArr[0] = f12;
        fArr[3] = f13;
        fArr[2] = f13;
        if (this.f33100q0 && kvVar.E()) {
            f14 = L;
        } else {
            f14 = min;
        }
        if (this.f33100q0 && !kvVar.E()) {
            f15 = L;
        } else {
            f15 = min;
        }
        fArr[5] = f15;
        fArr[4] = f15;
        fArr[7] = f14;
        fArr[6] = f14;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, f11, u02, f16);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(0.0f, f10);
        if (this.f33088d0.b(canvas, u02) && (view = this.V) != null) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        org.telegram.utils.twidget.k0 k0Var;
        if (this.f33088d0 != null && this.f33089e0) {
            String str = this.W.url;
            if (org.telegram.utils.twidget.n0.n(str)) {
                k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f52929a.get(str);
            } else {
                k0Var = null;
            }
            if (k0Var == null || !k0Var.f52886k) {
                motionEvent.offsetLocation(this.f33094j0, 0.0f);
                try {
                    return this.f33088d0.m(motionEvent);
                } finally {
                    motionEvent.offsetLocation(-this.f33094j0, 0.0f);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d() {
        org.telegram.ui.Cells.q1 q1Var = this.f22469a.E;
        if (q1Var != null && q1Var.Ra != null) {
            try {
                q1Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            q1Var.Ra.p0(q1Var, q1Var.f29853g1, q1Var.f29867h1);
        }
    }

    @Override
    public final void f(String str) {
        View view = this.V;
        if (view != null && Build.VERSION.SDK_INT >= 24) {
            androidx.emoji2.text.w.h(view, str);
        }
    }

    @Override
    public final void h() {
        org.telegram.utils.twidget.g1 d;
        org.telegram.utils.twidget.n1 n1Var;
        org.telegram.utils.twidget.v0 v0Var = this.X;
        if (v0Var == null) {
            d = null;
        } else {
            d = v0Var.d();
        }
        if (d == null) {
            n1Var = null;
        } else {
            n1Var = d.f52808f;
        }
        if (n1Var != this.f33096l0) {
            this.f33096l0 = n1Var;
            if (n1Var == null) {
                this.m0 = null;
            } else {
                ArrayList arrayList = n1Var.f52941a;
                this.m0 = new org.telegram.ui.Cells.t9[arrayList.size()];
                int i7 = 0;
                while (true) {
                    org.telegram.ui.Cells.t9[] t9VarArr = this.m0;
                    if (i7 >= t9VarArr.length) {
                        break;
                    }
                    t9VarArr[i7] = new li.a0(this, (org.telegram.utils.twidget.l1) arrayList.get(i7));
                    i7++;
                }
            }
            this.f22469a.Q();
        }
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean i0() {
        org.telegram.utils.twidget.k0 k0Var;
        boolean z9;
        String str = this.W.url;
        org.telegram.utils.twidget.v0 v0Var = this.X;
        if (v0Var != null) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f52929a;
            if (v0Var.f52997i > 0) {
                return v0Var.f53000l;
            }
        }
        org.telegram.utils.twidget.l0 l0Var = null;
        if (org.telegram.utils.twidget.n0.n(str)) {
            k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f52929a.get(str);
        } else {
            k0Var = null;
        }
        if (k0Var != null) {
            l0Var = (org.telegram.utils.twidget.l0) org.telegram.utils.twidget.n0.f52930b.get(k0Var.a());
        }
        if (l0Var != null) {
            synchronized (l0Var) {
                if (!l0Var.f52908a.isEmpty() && ((int[]) l0Var.f52908a.get(0)).length > 2) {
                    if (((int[]) l0Var.f52908a.get(0))[2] != 0) {
                        z9 = true;
                    }
                }
                z9 = false;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void j() {
        org.telegram.utils.twidget.g1 g1Var;
        pb0 pb0Var = this.f33092h0;
        org.telegram.messenger.g0.r(pb0Var);
        if (!this.f33091g0) {
            org.telegram.utils.twidget.i1 i1Var = this.X.f52995f;
            if (i1Var != null && (g1Var = i1Var.H) != null && (g1Var.f52809g || i1Var.f52871z)) {
                this.f33091g0 = true;
                this.f33090f0 = SystemClock.uptimeMillis();
                if (k0() != this.f33093i0) {
                    q0("on screen, loaded", true);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.i3(pb0Var, 1500L);
        } else if (SystemClock.uptimeMillis() - this.f33090f0 < 1500) {
            org.telegram.messenger.g0.i3(pb0Var, 200L);
        } else if (k0() != this.f33093i0) {
            q0("on screen", true);
        }
    }

    public final int k0() {
        return org.telegram.utils.twidget.n0.d(this.W.url, this.X, u0());
    }

    public final float m0() {
        return this.f22470b.top + this.f33101r0;
    }

    public final float n0() {
        return u0() + (this.f22470b.left - this.f33094j0);
    }

    public final void o0(int i7, String str, String str2, boolean z9) {
        long j3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!org.telegram.messenger.r2.f25212a) {
            return;
        }
        long j10 = -1;
        if (this.f33089e0) {
            j3 = SystemClock.uptimeMillis() - this.f33090f0;
        } else {
            j3 = -1;
        }
        q71 q71Var = this.f33088d0;
        if (q71Var != null && q71Var.f37227s != 0) {
            j10 = SystemClock.uptimeMillis() - q71Var.f37227s;
        }
        StringBuilder sb2 = new StringBuilder("widget height ");
        sb2.append(this.W.url.substring(10));
        sb2.append(": ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(Math.round(i7 / org.telegram.messenger.g0.f22562p));
        sb2.append(" (");
        sb2.append(str2);
        sb2.append(") -> ");
        sb2.append(Math.round(this.f33093i0 / org.telegram.messenger.g0.f22562p));
        sb2.append(" (");
        sb2.append(this.f33095k0);
        sb2.append("), width ");
        sb2.append(Math.round(u0() / org.telegram.messenger.g0.f22562p));
        String str9 = "";
        if (!z9) {
            str3 = "";
        } else {
            str3 = ", animated";
        }
        sb2.append(str3);
        if (this.V != null) {
            str4 = ", on screen";
        } else {
            str4 = ", off screen";
        }
        sb2.append(str4);
        if (j3 >= 0) {
            str5 = rf.b.h(j3, ", running ", " ms");
        } else {
            str5 = ", not running";
        }
        sb2.append(str5);
        if (this.X != null) {
            StringBuilder sb3 = new StringBuilder(", session ");
            sb3.append(this.X.f53005q);
            if (this.X.f52996g == null) {
                str7 = "";
            } else {
                str7 = " (snapshot)";
            }
            sb3.append(str7);
            org.telegram.utils.twidget.i1 i1Var = this.X.f52995f;
            if (i1Var != null && i1Var.C) {
                str8 = "";
            } else {
                str8 = ", scripts held";
            }
            sb3.append(str8);
            str6 = sb3.toString();
        } else {
            str6 = ", no widget yet";
        }
        sb2.append(str6);
        if (j10 >= 0 && j10 < 5000) {
            str9 = rf.b.h(j10, ", touched ", " ms ago");
        }
        org.telegram.ui.Cells.f1.u(str9, sb2);
    }

    public final void p0(String str) {
        if (this.V != null) {
            org.telegram.utils.twidget.v0 v0Var = this.X;
            if ((v0Var == null || v0Var.f52997i <= 0) && k0() != this.f33093i0) {
                q0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int k02 = k0();
        int i7 = this.f33093i0;
        if (k02 == i7) {
            return;
        }
        String str2 = this.f33095k0;
        this.f33093i0 = k02;
        this.f33095k0 = org.telegram.utils.twidget.n0.k(this.W.url, this.X, u0());
        o0(i7, "away: ".concat(str), str2, false);
        org.telegram.messenger.kv kvVar = this.f22469a;
        kvVar.Q();
        org.telegram.messenger.ij ijVar = kvVar.f23764b;
        if (ijVar != null) {
            ijVar.K1 = true;
        }
        this.f33097n0 = true;
    }

    public final void q0(String str, boolean z9) {
        boolean z10;
        int k02 = k0();
        int i7 = this.f33093i0;
        boolean z11 = false;
        if (k02 != i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = this.f33095k0;
        this.f33093i0 = k02;
        this.f33095k0 = org.telegram.utils.twidget.n0.k(this.W.url, this.X, u0());
        if (z10) {
            o0(i7, str, str2, z9);
        }
        org.telegram.messenger.kv kvVar = this.f22469a;
        if (z10) {
            kvVar.Q();
        }
        if (z10 && z9) {
            this.f33098o0 = SystemClock.uptimeMillis();
            this.f33099p0 = false;
        }
        org.telegram.messenger.ij ijVar = kvVar.f23764b;
        if (ijVar != null) {
            ijVar.K1 = true;
        }
        org.telegram.ui.Cells.q1 q1Var = kvVar.E;
        org.telegram.ui.Cells.l1 l1Var = kvVar.F;
        View view = this.V;
        if (view != null && q1Var != null && l1Var != null) {
            if (z10 && !i0() && (q1Var.getParent() instanceof RecyclerView)) {
                View view2 = (View) q1Var.getParent();
                if (q1Var.getBottom() > view2.getPaddingTop() && q1Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                    z11 = true;
                }
            }
            if (z9) {
                l1Var.q1(q1Var, z11, z11);
            } else {
                l1Var.E0(q1Var, z11, z11);
            }
        } else if (view != null) {
            view.requestLayout();
        }
    }

    public final void r0() {
        boolean z9;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.messenger.ij ijVar;
        org.telegram.utils.twidget.g1 g1Var;
        boolean z10 = true;
        this.f33089e0 = true;
        this.f33090f0 = SystemClock.uptimeMillis();
        org.telegram.utils.twidget.i1 i1Var = this.X.f52995f;
        if (i1Var != null && (g1Var = i1Var.H) != null && (g1Var.f52809g || i1Var.f52871z)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f33091g0 = z9;
        this.X.n(u0());
        org.telegram.messenger.kv kvVar = this.f22469a;
        org.telegram.ui.Cells.q1 q1Var = kvVar.E;
        if (q1Var != null) {
            g6Var = q1Var.getResourcesProvider();
        } else {
            g6Var = null;
        }
        this.Z = org.telegram.utils.twidget.j1.d(g6Var, kvVar.E());
        this.X.l(org.telegram.utils.twidget.j1.a(g6Var, kvVar.E()));
        q71 q71Var = this.f33088d0;
        org.telegram.utils.twidget.v0 v0Var = this.X;
        if (q71Var.f37224p != v0Var) {
            q71Var.q();
            q71Var.f37224p = v0Var;
            if (v0Var != null) {
                v0Var.h = q71Var;
                v0Var.m(q71Var.f37225q);
            }
        }
        this.f33088d0.p(true);
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f52929a.get(this.W.url);
        if (k0Var != null) {
            k0Var.f52896u = this;
        }
        org.telegram.utils.twidget.n0.t(this.X);
        if (!this.f33097n0 || (ijVar = this.f22469a.f23764b) == null || !ijVar.K1) {
            z10 = false;
        }
        this.f33097n0 = false;
        if (!z10 && k0() == this.f33093i0) {
            return;
        }
        org.telegram.messenger.g0.h3(new bi.k1(27, this, z10));
    }

    public final void s0() {
        if (this.f33089e0) {
            this.f33089e0 = false;
            org.telegram.messenger.g0.r(this.f33092h0);
            this.f33088d0.p(false);
            this.f33088d0.q();
            org.telegram.utils.twidget.v0 v0Var = this.X;
            if (v0Var != null) {
                org.telegram.utils.twidget.n0.s(v0Var);
            }
        }
    }

    public final int u0() {
        return (j0() * 2) + this.f22471c;
    }
}
