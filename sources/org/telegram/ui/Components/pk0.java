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
public final class pk0 extends org.telegram.messenger.zt implements z71 {
    public static final AtomicInteger f38463t0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed X;
    public org.telegram.utils.twidget.d1 Y;
    public final boolean Z;
    public int f38464a0;
    public final Path f38465b0;
    public final float[] f38466c0;
    public final int f38467d0;
    public a81 f38468e0;
    public boolean f38469f0;
    public long f38470g0;
    public boolean f38471h0;
    public final gb0 f38472i0;
    public int f38473j0;
    public int f38474k0;
    public String f38475l0;
    public org.telegram.utils.twidget.v1 m0;
    public org.telegram.ui.Cells.u9[] f38476n0;
    public boolean f38477o0;
    public long f38478p0;
    public boolean f38479q0;
    public boolean f38480r0;
    public float f38481s0;

    public pk0(org.telegram.messenger.ev r4, android.graphics.Rect r5, int r6, org.telegram.tgnet.tl.TL_iv.pageBlockEmbed r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk0.<init>(org.telegram.messenger.ev, android.graphics.Rect, int, org.telegram.tgnet.tl.TL_iv$pageBlockEmbed, boolean):void");
    }

    public static int j0() {
        int i7;
        int i10 = org.telegram.messenger.bz.Y0;
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
        return (float) Math.ceil((i7 / org.telegram.messenger.g0.f24117p) - 0.01f);
    }

    public static int t0(int i7, boolean z10) {
        int i10;
        float f10 = 6.0f;
        int L = org.telegram.messenger.g0.L(6.0f) + i7;
        if (org.telegram.messenger.bz.Y0 < 10) {
            f10 = 4.0f;
        }
        int D = org.telegram.messenger.f3.D(f10, 2, L);
        if (z10) {
            i10 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i10 = 0;
        }
        return org.telegram.messenger.g0.L(4.0f) + D + i10;
    }

    @Override
    public final int I() {
        Rect rect = this.f28350b;
        return rect.top + this.f38473j0 + rect.bottom;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] L() {
        return this.f38476n0;
    }

    @Override
    public final boolean Q() {
        a81 a81Var = this.f38468e0;
        if (a81Var != null && this.f38469f0 && a81Var.f33285w && (a81Var.L & 3) != 2) {
            if (a81Var.f33288z || a81Var.o()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void T() {
        org.telegram.utils.twidget.d1 d1Var = this.Y;
        TL_iv.pageBlockEmbed pageblockembed = this.X;
        if (d1Var == null) {
            this.Y = org.telegram.utils.twidget.n0.i(pageblockembed.url);
        }
        if (this.Y == null) {
            return;
        }
        if (this.f38468e0 == null) {
            this.f38468e0 = new a81(this, org.telegram.messenger.g0.f24117p);
        }
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54846a.get(pageblockembed.url);
        if (k0Var != null) {
            ArrayList arrayList = k0Var.v;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            boolean z10 = false;
            if (org.telegram.utils.twidget.n0.q(arrayList) != this) {
                a81 a81Var = this.f38468e0;
                org.telegram.utils.twidget.d1 d1Var2 = this.Y;
                a81Var.r();
                a81Var.f33279p = d1Var2;
                if (d1Var2 != null) {
                    z10 = true;
                }
                a81Var.f33281r = z10;
                return;
            }
            pk0 pk0Var = k0Var.f54819w;
            k0Var.f54819w = this;
            if (pk0Var != null && pk0Var != this && pk0Var.f38469f0 && pk0Var.f38468e0 != null) {
                pk0Var.s0();
                a81 a81Var2 = pk0Var.f38468e0;
                org.telegram.utils.twidget.d1 d1Var3 = pk0Var.Y;
                a81Var2.r();
                a81Var2.f33279p = d1Var3;
                if (d1Var3 != null) {
                    z10 = true;
                }
                a81Var2.f33281r = z10;
                View view = pk0Var.W;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        r0();
    }

    @Override
    public final void V() {
        a81 a81Var;
        if (this.f38468e0 != null) {
            s0();
            this.f38468e0.r();
            org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54846a.get(this.X.url);
            if (k0Var != null) {
                ArrayList arrayList = k0Var.v;
                arrayList.remove(this);
                if (k0Var.f54819w == this) {
                    pk0 q10 = org.telegram.utils.twidget.n0.q(arrayList);
                    k0Var.f54819w = q10;
                    if (q10 != null && !q10.f38469f0 && q10.W != null && (a81Var = q10.f38468e0) != null && q10.Y != null) {
                        a81Var.r();
                        q10.r0();
                        q10.W.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void W(Canvas canvas) {
        org.telegram.ui.ActionBar.i6 i6Var;
        int max;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        View view;
        org.telegram.ui.Cells.r1 r1Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        if (this.f38468e0 == null) {
            return;
        }
        int i7 = this.f38464a0;
        org.telegram.messenger.ev evVar = this.f28349a;
        org.telegram.ui.Cells.r1 r1Var2 = evVar.E;
        org.telegram.ui.Cells.y1 y1Var = null;
        if (r1Var2 != null) {
            i6Var = r1Var2.getResourcesProvider();
        } else {
            i6Var = null;
        }
        if (i7 != org.telegram.utils.twidget.q1.e(i6Var, evVar.E())) {
            org.telegram.ui.Cells.r1 r1Var3 = evVar.E;
            if (r1Var3 != null) {
                i6Var2 = r1Var3.getResourcesProvider();
            } else {
                i6Var2 = null;
            }
            this.f38464a0 = org.telegram.utils.twidget.q1.e(i6Var2, evVar.E());
            this.Y.j(org.telegram.utils.twidget.q1.a(i6Var2, evVar.E()));
        }
        if (R()) {
            max = 0;
        } else {
            max = Math.max(0, Math.min(j0(), evVar.S - org.telegram.messenger.g0.L(2.0f)));
        }
        this.f38474k0 = max;
        int u02 = u0();
        float f16 = this.f38473j0;
        if (this.f38478p0 != 0 && (r1Var = evVar.E) != null) {
            y1Var = r1Var.getTransitionParams();
        }
        if (y1Var != null && y1Var.f32442x0) {
            this.f38479q0 = true;
            f11 = y1Var.f32391k0 + 0.0f;
            f16 += y1Var.f32387j0;
            if (i0()) {
                f10 = y1Var.f32387j0;
            } else {
                f10 = y1Var.f32391k0;
            }
        } else {
            if (y1Var != null && (this.f38479q0 || SystemClock.uptimeMillis() - this.f38478p0 > 250)) {
                this.f38478p0 = 0L;
                this.f38479q0 = false;
            }
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (i0()) {
            f10 += this.f38473j0 - k0();
        }
        this.f38481s0 = f16;
        canvas.save();
        canvas.translate(-this.f38474k0, 0.0f);
        Path path = this.f38465b0;
        path.rewind();
        int i10 = org.telegram.messenger.bz.Y0;
        if (i10 > 2) {
            i10 -= 2;
        }
        int L = org.telegram.messenger.g0.L(i10);
        int min = Math.min(org.telegram.messenger.g0.L(3.0f), L);
        boolean z10 = this.Z;
        if (z10 && !evVar.B() && (evVar.E() || !evVar.G())) {
            f12 = L;
        } else {
            f12 = min;
        }
        if (z10 && (!evVar.E() || !evVar.G())) {
            f13 = L;
        } else {
            f13 = min;
        }
        float[] fArr = this.f38466c0;
        fArr[1] = f12;
        fArr[0] = f12;
        fArr[3] = f13;
        fArr[2] = f13;
        if (this.f38480r0 && evVar.E()) {
            f14 = L;
        } else {
            f14 = min;
        }
        if (this.f38480r0 && !evVar.E()) {
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
        if (this.f38468e0.c(canvas, u02) && (view = this.W) != null) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        org.telegram.utils.twidget.k0 k0Var;
        if (this.f38468e0 != null && this.f38469f0) {
            String str = this.X.url;
            if (org.telegram.utils.twidget.n0.n(str)) {
                k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54846a.get(str);
            } else {
                k0Var = null;
            }
            if (k0Var == null || !k0Var.f54808k) {
                motionEvent.offsetLocation(this.f38474k0, 0.0f);
                try {
                    return this.f38468e0.n(motionEvent);
                } finally {
                    motionEvent.offsetLocation(-this.f38474k0, 0.0f);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d() {
        org.telegram.ui.Cells.r1 r1Var = this.f28349a.E;
        if (r1Var != null && r1Var.Sa != null) {
            try {
                r1Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            r1Var.Sa.q0(r1Var, r1Var.f31418h1, r1Var.f31431i1);
        }
    }

    @Override
    public final void f(String str) {
        View view = this.W;
        if (view != null && Build.VERSION.SDK_INT >= 24) {
            androidx.emoji2.text.x.h(view, str);
        }
    }

    @Override
    public final void h() {
        org.telegram.utils.twidget.n1 d;
        org.telegram.utils.twidget.v1 v1Var;
        org.telegram.utils.twidget.d1 d1Var = this.Y;
        if (d1Var == null) {
            d = null;
        } else {
            d = d1Var.d();
        }
        if (d == null) {
            v1Var = null;
        } else {
            v1Var = d.f54862g;
        }
        if (v1Var != this.m0) {
            this.m0 = v1Var;
            if (v1Var == null) {
                this.f38476n0 = null;
            } else {
                ArrayList arrayList = v1Var.f54973a;
                this.f38476n0 = new org.telegram.ui.Cells.u9[arrayList.size()];
                int i7 = 0;
                while (true) {
                    org.telegram.ui.Cells.u9[] u9VarArr = this.f38476n0;
                    if (i7 >= u9VarArr.length) {
                        break;
                    }
                    u9VarArr[i7] = new oi.y(this, (org.telegram.utils.twidget.t1) arrayList.get(i7));
                    i7++;
                }
            }
            this.f28349a.Q();
        }
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean i0() {
        org.telegram.utils.twidget.k0 k0Var;
        boolean z10;
        String str = this.X.url;
        org.telegram.utils.twidget.d1 d1Var = this.Y;
        if (d1Var != null) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f54846a;
            if (d1Var.f54697i > 0) {
                return d1Var.f54700l;
            }
        }
        org.telegram.utils.twidget.l0 l0Var = null;
        if (org.telegram.utils.twidget.n0.n(str)) {
            k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54846a.get(str);
        } else {
            k0Var = null;
        }
        if (k0Var != null) {
            l0Var = (org.telegram.utils.twidget.l0) org.telegram.utils.twidget.n0.f54847b.get(k0Var.a());
        }
        if (l0Var != null) {
            synchronized (l0Var) {
                if (!l0Var.f54829a.isEmpty() && ((int[]) l0Var.f54829a.get(0)).length > 2) {
                    if (((int[]) l0Var.f54829a.get(0))[2] != 0) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void j() {
        org.telegram.utils.twidget.n1 n1Var;
        gb0 gb0Var = this.f38472i0;
        org.telegram.messenger.g0.r(gb0Var);
        if (!this.f38471h0) {
            org.telegram.utils.twidget.p1 p1Var = this.Y.f54695f;
            if (p1Var != null && (n1Var = p1Var.N) != null && (n1Var.h || p1Var.F)) {
                this.f38471h0 = true;
                this.f38470g0 = SystemClock.uptimeMillis();
                if (k0() != this.f38473j0) {
                    q0("on screen, loaded", true);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.h3(gb0Var, 1500L);
        } else if (SystemClock.uptimeMillis() - this.f38470g0 < 1500) {
            org.telegram.messenger.g0.h3(gb0Var, 200L);
        } else if (k0() != this.f38473j0) {
            q0("on screen", true);
        }
    }

    public final int k0() {
        return org.telegram.utils.twidget.n0.d(this.X.url, this.Y, u0());
    }

    public final float m0() {
        return this.f28350b.top + this.f38481s0;
    }

    public final float n0() {
        return u0() + (this.f28350b.left - this.f38474k0);
    }

    public final void o0(int i7, String str, String str2, boolean z10) {
        long j3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!org.telegram.messenger.s2.f26721a) {
            return;
        }
        long j10 = -1;
        if (this.f38469f0) {
            j3 = SystemClock.uptimeMillis() - this.f38470g0;
        } else {
            j3 = -1;
        }
        a81 a81Var = this.f38468e0;
        if (a81Var != null && a81Var.f33282s != 0) {
            j10 = SystemClock.uptimeMillis() - a81Var.f33282s;
        }
        StringBuilder sb2 = new StringBuilder("widget height ");
        sb2.append(this.X.url.substring(10));
        sb2.append(": ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(Math.round(i7 / org.telegram.messenger.g0.f24117p));
        sb2.append(" (");
        sb2.append(str2);
        sb2.append(") -> ");
        sb2.append(Math.round(this.f38473j0 / org.telegram.messenger.g0.f24117p));
        sb2.append(" (");
        sb2.append(this.f38475l0);
        sb2.append("), width ");
        sb2.append(Math.round(u0() / org.telegram.messenger.g0.f24117p));
        String str9 = "";
        if (!z10) {
            str3 = "";
        } else {
            str3 = ", animated";
        }
        sb2.append(str3);
        if (this.W != null) {
            str4 = ", on screen";
        } else {
            str4 = ", off screen";
        }
        sb2.append(str4);
        if (j3 >= 0) {
            str5 = p5.c.j(j3, ", running ", " ms");
        } else {
            str5 = ", not running";
        }
        sb2.append(str5);
        if (this.Y != null) {
            StringBuilder sb3 = new StringBuilder(", session ");
            sb3.append(this.Y.f54705q);
            if (this.Y.f54696g == null) {
                str7 = "";
            } else {
                str7 = " (snapshot)";
            }
            sb3.append(str7);
            org.telegram.utils.twidget.p1 p1Var = this.Y.f54695f;
            if (p1Var != null && p1Var.I) {
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
            str9 = p5.c.j(j10, ", touched ", " ms ago");
        }
        p5.c.s(str9, sb2);
    }

    public final void p0(String str) {
        if (this.W != null) {
            org.telegram.utils.twidget.d1 d1Var = this.Y;
            if ((d1Var == null || d1Var.f54697i <= 0) && k0() != this.f38473j0) {
                q0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int k02 = k0();
        int i7 = this.f38473j0;
        if (k02 == i7) {
            return;
        }
        String str2 = this.f38475l0;
        this.f38473j0 = k02;
        this.f38475l0 = org.telegram.utils.twidget.n0.k(this.X.url, this.Y, u0());
        o0(i7, "away: ".concat(str), str2, false);
        org.telegram.messenger.ev evVar = this.f28349a;
        evVar.Q();
        org.telegram.messenger.fj fjVar = evVar.f23768b;
        if (fjVar != null) {
            fjVar.M1 = true;
        }
        this.f38477o0 = true;
    }

    public final void q0(String str, boolean z10) {
        boolean z11;
        int k02 = k0();
        int i7 = this.f38473j0;
        boolean z12 = false;
        if (k02 != i7) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str2 = this.f38475l0;
        this.f38473j0 = k02;
        this.f38475l0 = org.telegram.utils.twidget.n0.k(this.X.url, this.Y, u0());
        if (z11) {
            o0(i7, str, str2, z10);
        }
        org.telegram.messenger.ev evVar = this.f28349a;
        if (z11) {
            evVar.Q();
        }
        if (z11 && z10) {
            this.f38478p0 = SystemClock.uptimeMillis();
            this.f38479q0 = false;
        }
        org.telegram.messenger.fj fjVar = evVar.f23768b;
        if (fjVar != null) {
            fjVar.M1 = true;
        }
        org.telegram.ui.Cells.r1 r1Var = evVar.E;
        org.telegram.ui.Cells.m1 m1Var = evVar.F;
        View view = this.W;
        if (view != null && r1Var != null && m1Var != null) {
            if (z11 && !i0() && (r1Var.getParent() instanceof RecyclerView)) {
                View view2 = (View) r1Var.getParent();
                if (r1Var.getBottom() > view2.getPaddingTop() && r1Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                    z12 = true;
                }
            }
            if (z10) {
                m1Var.B1(r1Var, z12, z12);
            } else {
                m1Var.H0(r1Var, z12, z12);
            }
        } else if (view != null) {
            view.requestLayout();
        }
    }

    public final void r0() {
        boolean z10;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.messenger.fj fjVar;
        org.telegram.utils.twidget.n1 n1Var;
        boolean z11 = true;
        this.f38469f0 = true;
        this.f38470g0 = SystemClock.uptimeMillis();
        org.telegram.utils.twidget.p1 p1Var = this.Y.f54695f;
        if (p1Var != null && (n1Var = p1Var.N) != null && (n1Var.h || p1Var.F)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38471h0 = z10;
        this.Y.l(u0());
        org.telegram.messenger.ev evVar = this.f28349a;
        org.telegram.ui.Cells.r1 r1Var = evVar.E;
        if (r1Var != null) {
            i6Var = r1Var.getResourcesProvider();
        } else {
            i6Var = null;
        }
        this.f38464a0 = org.telegram.utils.twidget.q1.e(i6Var, evVar.E());
        this.Y.j(org.telegram.utils.twidget.q1.a(i6Var, evVar.E()));
        this.f38468e0.b(this.Y);
        this.f38468e0.q(true);
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54846a.get(this.X.url);
        if (k0Var != null) {
            k0Var.f54818u = this;
        }
        org.telegram.utils.twidget.n0.t(this.Y);
        if (!this.f38477o0 || (fjVar = this.f28349a.f23768b) == null || !fjVar.M1) {
            z11 = false;
        }
        this.f38477o0 = false;
        if (!z11 && k0() == this.f38473j0) {
            return;
        }
        org.telegram.messenger.g0.g3(new ch.k(28, this, z11));
    }

    public final void s0() {
        if (this.f38469f0) {
            this.f38469f0 = false;
            org.telegram.messenger.g0.r(this.f38472i0);
            this.f38468e0.q(false);
            this.f38468e0.r();
            org.telegram.utils.twidget.d1 d1Var = this.Y;
            if (d1Var != null) {
                org.telegram.utils.twidget.n0.s(d1Var);
            }
        }
    }

    public final int u0() {
        return (j0() * 2) + this.f28351c;
    }
}
