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
public final class hk0 extends org.telegram.messenger.cu implements p71 {
    public static final AtomicInteger f35265t0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed X;
    public org.telegram.utils.twidget.y0 Y;
    public final boolean Z;
    public int f35266a0;
    public final Path f35267b0;
    public final float[] f35268c0;
    public final int f35269d0;
    public q71 f35270e0;
    public boolean f35271f0;
    public long f35272g0;
    public boolean f35273h0;
    public final wa0 f35274i0;
    public int f35275j0;
    public int f35276k0;
    public String f35277l0;
    public org.telegram.utils.twidget.q1 m0;
    public org.telegram.ui.Cells.s9[] f35278n0;
    public boolean f35279o0;
    public long f35280p0;
    public boolean f35281q0;
    public boolean f35282r0;
    public float f35283s0;

    public hk0(org.telegram.messenger.iv r4, android.graphics.Rect r5, int r6, org.telegram.tgnet.tl.TL_iv.pageBlockEmbed r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hk0.<init>(org.telegram.messenger.iv, android.graphics.Rect, int, org.telegram.tgnet.tl.TL_iv$pageBlockEmbed, boolean):void");
    }

    public static int j0() {
        int i7;
        int i10 = org.telegram.messenger.gz.Y0;
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
        return (float) Math.ceil((i7 / org.telegram.messenger.g0.f23610p) - 0.01f);
    }

    public static int t0(int i7, boolean z10) {
        int i10;
        float f10 = 6.0f;
        int L = org.telegram.messenger.g0.L(6.0f) + i7;
        if (org.telegram.messenger.gz.Y0 < 10) {
            f10 = 4.0f;
        }
        int D = org.telegram.messenger.k5.D(f10, 2, L);
        if (z10) {
            i10 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i10 = 0;
        }
        return org.telegram.messenger.g0.L(4.0f) + D + i10;
    }

    @Override
    public final int I() {
        Rect rect = this.f22942b;
        return rect.top + this.f35275j0 + rect.bottom;
    }

    @Override
    public final org.telegram.ui.Cells.s9[] L() {
        return this.f35278n0;
    }

    @Override
    public final boolean Q() {
        q71 q71Var = this.f35270e0;
        if (q71Var != null && this.f35271f0 && q71Var.f38556w && (q71Var.L & 3) != 2) {
            if (q71Var.f38559z || q71Var.n()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void T() {
        org.telegram.utils.twidget.y0 y0Var = this.Y;
        TL_iv.pageBlockEmbed pageblockembed = this.X;
        if (y0Var == null) {
            this.Y = org.telegram.utils.twidget.n0.i(pageblockembed.url);
        }
        if (this.Y == null) {
            return;
        }
        if (this.f35270e0 == null) {
            this.f35270e0 = new q71(this, org.telegram.messenger.g0.f23610p);
        }
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54338a.get(pageblockembed.url);
        if (k0Var != null) {
            ArrayList arrayList = k0Var.v;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            boolean z10 = false;
            if (org.telegram.utils.twidget.n0.q(arrayList) != this) {
                q71 q71Var = this.f35270e0;
                org.telegram.utils.twidget.y0 y0Var2 = this.Y;
                q71Var.q();
                q71Var.f38550p = y0Var2;
                if (y0Var2 != null) {
                    z10 = true;
                }
                q71Var.f38552r = z10;
                return;
            }
            hk0 hk0Var = k0Var.f54285w;
            k0Var.f54285w = this;
            if (hk0Var != null && hk0Var != this && hk0Var.f35271f0 && hk0Var.f35270e0 != null) {
                hk0Var.s0();
                q71 q71Var2 = hk0Var.f35270e0;
                org.telegram.utils.twidget.y0 y0Var3 = hk0Var.Y;
                q71Var2.q();
                q71Var2.f38550p = y0Var3;
                if (y0Var3 != null) {
                    z10 = true;
                }
                q71Var2.f38552r = z10;
                View view = hk0Var.W;
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
        if (this.f35270e0 != null) {
            s0();
            this.f35270e0.q();
            org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54338a.get(this.X.url);
            if (k0Var != null) {
                ArrayList arrayList = k0Var.v;
                arrayList.remove(this);
                if (k0Var.f54285w == this) {
                    hk0 q10 = org.telegram.utils.twidget.n0.q(arrayList);
                    k0Var.f54285w = q10;
                    if (q10 != null && !q10.f35271f0 && q10.W != null && (q71Var = q10.f35270e0) != null && q10.Y != null) {
                        q71Var.q();
                        q10.r0();
                        q10.W.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void W(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        int max;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        View view;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        if (this.f35270e0 == null) {
            return;
        }
        int i7 = this.f35266a0;
        org.telegram.messenger.iv ivVar = this.f22941a;
        org.telegram.ui.Cells.q1 q1Var2 = ivVar.E;
        org.telegram.ui.Cells.x1 x1Var = null;
        if (q1Var2 != null) {
            e6Var = q1Var2.getResourcesProvider();
        } else {
            e6Var = null;
        }
        if (i7 != org.telegram.utils.twidget.m1.d(e6Var, ivVar.E())) {
            org.telegram.ui.Cells.q1 q1Var3 = ivVar.E;
            if (q1Var3 != null) {
                e6Var2 = q1Var3.getResourcesProvider();
            } else {
                e6Var2 = null;
            }
            this.f35266a0 = org.telegram.utils.twidget.m1.d(e6Var2, ivVar.E());
            this.Y.l(org.telegram.utils.twidget.m1.a(e6Var2, ivVar.E()));
        }
        if (R()) {
            max = 0;
        } else {
            max = Math.max(0, Math.min(j0(), ivVar.S - org.telegram.messenger.g0.L(2.0f)));
        }
        this.f35276k0 = max;
        int u02 = u0();
        float f16 = this.f35275j0;
        if (this.f35280p0 != 0 && (q1Var = ivVar.E) != null) {
            x1Var = q1Var.getTransitionParams();
        }
        if (x1Var != null && x1Var.f32012x0) {
            this.f35281q0 = true;
            f11 = x1Var.f31961k0 + 0.0f;
            f16 += x1Var.f31957j0;
            if (i0()) {
                f10 = x1Var.f31957j0;
            } else {
                f10 = x1Var.f31961k0;
            }
        } else {
            if (x1Var != null && (this.f35281q0 || SystemClock.uptimeMillis() - this.f35280p0 > 250)) {
                this.f35280p0 = 0L;
                this.f35281q0 = false;
            }
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (i0()) {
            f10 += this.f35275j0 - k0();
        }
        this.f35283s0 = f16;
        canvas.save();
        canvas.translate(-this.f35276k0, 0.0f);
        Path path = this.f35267b0;
        path.rewind();
        int i10 = org.telegram.messenger.gz.Y0;
        if (i10 > 2) {
            i10 -= 2;
        }
        int L = org.telegram.messenger.g0.L(i10);
        int min = Math.min(org.telegram.messenger.g0.L(3.0f), L);
        boolean z10 = this.Z;
        if (z10 && !ivVar.B() && (ivVar.E() || !ivVar.G())) {
            f12 = L;
        } else {
            f12 = min;
        }
        if (z10 && (!ivVar.E() || !ivVar.G())) {
            f13 = L;
        } else {
            f13 = min;
        }
        float[] fArr = this.f35268c0;
        fArr[1] = f12;
        fArr[0] = f12;
        fArr[3] = f13;
        fArr[2] = f13;
        if (this.f35282r0 && ivVar.E()) {
            f14 = L;
        } else {
            f14 = min;
        }
        if (this.f35282r0 && !ivVar.E()) {
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
        if (this.f35270e0.b(canvas, u02) && (view = this.W) != null) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        org.telegram.utils.twidget.k0 k0Var;
        if (this.f35270e0 != null && this.f35271f0) {
            String str = this.X.url;
            if (org.telegram.utils.twidget.n0.n(str)) {
                k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54338a.get(str);
            } else {
                k0Var = null;
            }
            if (k0Var == null || !k0Var.f54274k) {
                motionEvent.offsetLocation(this.f35276k0, 0.0f);
                try {
                    return this.f35270e0.m(motionEvent);
                } finally {
                    motionEvent.offsetLocation(-this.f35276k0, 0.0f);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d() {
        org.telegram.ui.Cells.q1 q1Var = this.f22941a.E;
        if (q1Var != null && q1Var.Sa != null) {
            try {
                q1Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            q1Var.Sa.q0(q1Var, q1Var.f30996h1, q1Var.f31009i1);
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
        org.telegram.utils.twidget.j1 d;
        org.telegram.utils.twidget.q1 q1Var;
        org.telegram.utils.twidget.y0 y0Var = this.Y;
        if (y0Var == null) {
            d = null;
        } else {
            d = y0Var.d();
        }
        if (d == null) {
            q1Var = null;
        } else {
            q1Var = d.f54263f;
        }
        if (q1Var != this.m0) {
            this.m0 = q1Var;
            if (q1Var == null) {
                this.f35278n0 = null;
            } else {
                ArrayList arrayList = q1Var.f54380a;
                this.f35278n0 = new org.telegram.ui.Cells.s9[arrayList.size()];
                int i7 = 0;
                while (true) {
                    org.telegram.ui.Cells.s9[] s9VarArr = this.f35278n0;
                    if (i7 >= s9VarArr.length) {
                        break;
                    }
                    s9VarArr[i7] = new oi.y(this, (org.telegram.utils.twidget.o1) arrayList.get(i7));
                    i7++;
                }
            }
            this.f22941a.Q();
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
        org.telegram.utils.twidget.y0 y0Var = this.Y;
        if (y0Var != null) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f54338a;
            if (y0Var.f54429i > 0) {
                return y0Var.f54432l;
            }
        }
        org.telegram.utils.twidget.l0 l0Var = null;
        if (org.telegram.utils.twidget.n0.n(str)) {
            k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54338a.get(str);
        } else {
            k0Var = null;
        }
        if (k0Var != null) {
            l0Var = (org.telegram.utils.twidget.l0) org.telegram.utils.twidget.n0.f54339b.get(k0Var.a());
        }
        if (l0Var != null) {
            synchronized (l0Var) {
                if (!l0Var.f54298a.isEmpty() && ((int[]) l0Var.f54298a.get(0)).length > 2) {
                    if (((int[]) l0Var.f54298a.get(0))[2] != 0) {
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
        org.telegram.utils.twidget.j1 j1Var;
        wa0 wa0Var = this.f35274i0;
        org.telegram.messenger.g0.r(wa0Var);
        if (!this.f35273h0) {
            org.telegram.utils.twidget.l1 l1Var = this.Y.f54427f;
            if (l1Var != null && (j1Var = l1Var.H) != null && (j1Var.f54264g || l1Var.f54321z)) {
                this.f35273h0 = true;
                this.f35272g0 = SystemClock.uptimeMillis();
                if (k0() != this.f35275j0) {
                    q0("on screen, loaded", true);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.i3(wa0Var, 1500L);
        } else if (SystemClock.uptimeMillis() - this.f35272g0 < 1500) {
            org.telegram.messenger.g0.i3(wa0Var, 200L);
        } else if (k0() != this.f35275j0) {
            q0("on screen", true);
        }
    }

    public final int k0() {
        return org.telegram.utils.twidget.n0.d(this.X.url, this.Y, u0());
    }

    public final float m0() {
        return this.f22942b.top + this.f35283s0;
    }

    public final float n0() {
        return u0() + (this.f22942b.left - this.f35276k0);
    }

    public final void o0(int i7, String str, String str2, boolean z10) {
        long j3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!org.telegram.messenger.r2.f26206a) {
            return;
        }
        long j10 = -1;
        if (this.f35271f0) {
            j3 = SystemClock.uptimeMillis() - this.f35272g0;
        } else {
            j3 = -1;
        }
        q71 q71Var = this.f35270e0;
        if (q71Var != null && q71Var.f38553s != 0) {
            j10 = SystemClock.uptimeMillis() - q71Var.f38553s;
        }
        StringBuilder sb2 = new StringBuilder("widget height ");
        sb2.append(this.X.url.substring(10));
        sb2.append(": ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(Math.round(i7 / org.telegram.messenger.g0.f23610p));
        sb2.append(" (");
        sb2.append(str2);
        sb2.append(") -> ");
        sb2.append(Math.round(this.f35275j0 / org.telegram.messenger.g0.f23610p));
        sb2.append(" (");
        sb2.append(this.f35277l0);
        sb2.append("), width ");
        sb2.append(Math.round(u0() / org.telegram.messenger.g0.f23610p));
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
            str5 = r.b.j(j3, ", running ", " ms");
        } else {
            str5 = ", not running";
        }
        sb2.append(str5);
        if (this.Y != null) {
            StringBuilder sb3 = new StringBuilder(", session ");
            sb3.append(this.Y.f54437q);
            if (this.Y.f54428g == null) {
                str7 = "";
            } else {
                str7 = " (snapshot)";
            }
            sb3.append(str7);
            org.telegram.utils.twidget.l1 l1Var = this.Y.f54427f;
            if (l1Var != null && l1Var.C) {
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
            str9 = r.b.j(j10, ", touched ", " ms ago");
        }
        org.telegram.ui.Cells.y0.t(str9, sb2);
    }

    public final void p0(String str) {
        if (this.W != null) {
            org.telegram.utils.twidget.y0 y0Var = this.Y;
            if ((y0Var == null || y0Var.f54429i <= 0) && k0() != this.f35275j0) {
                q0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int k02 = k0();
        int i7 = this.f35275j0;
        if (k02 == i7) {
            return;
        }
        String str2 = this.f35277l0;
        this.f35275j0 = k02;
        this.f35277l0 = org.telegram.utils.twidget.n0.k(this.X.url, this.Y, u0());
        o0(i7, "away: ".concat(str), str2, false);
        org.telegram.messenger.iv ivVar = this.f22941a;
        ivVar.Q();
        org.telegram.messenger.gj gjVar = ivVar.f24446b;
        if (gjVar != null) {
            gjVar.M1 = true;
        }
        this.f35279o0 = true;
    }

    public final void q0(String str, boolean z10) {
        boolean z11;
        int k02 = k0();
        int i7 = this.f35275j0;
        boolean z12 = false;
        if (k02 != i7) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str2 = this.f35277l0;
        this.f35275j0 = k02;
        this.f35277l0 = org.telegram.utils.twidget.n0.k(this.X.url, this.Y, u0());
        if (z11) {
            o0(i7, str, str2, z10);
        }
        org.telegram.messenger.iv ivVar = this.f22941a;
        if (z11) {
            ivVar.Q();
        }
        if (z11 && z10) {
            this.f35280p0 = SystemClock.uptimeMillis();
            this.f35281q0 = false;
        }
        org.telegram.messenger.gj gjVar = ivVar.f24446b;
        if (gjVar != null) {
            gjVar.M1 = true;
        }
        org.telegram.ui.Cells.q1 q1Var = ivVar.E;
        org.telegram.ui.Cells.l1 l1Var = ivVar.F;
        View view = this.W;
        if (view != null && q1Var != null && l1Var != null) {
            if (z11 && !i0() && (q1Var.getParent() instanceof RecyclerView)) {
                View view2 = (View) q1Var.getParent();
                if (q1Var.getBottom() > view2.getPaddingTop() && q1Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                    z12 = true;
                }
            }
            if (z10) {
                l1Var.B1(q1Var, z12, z12);
            } else {
                l1Var.H0(q1Var, z12, z12);
            }
        } else if (view != null) {
            view.requestLayout();
        }
    }

    public final void r0() {
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.messenger.gj gjVar;
        org.telegram.utils.twidget.j1 j1Var;
        boolean z11 = true;
        this.f35271f0 = true;
        this.f35272g0 = SystemClock.uptimeMillis();
        org.telegram.utils.twidget.l1 l1Var = this.Y.f54427f;
        if (l1Var != null && (j1Var = l1Var.H) != null && (j1Var.f54264g || l1Var.f54321z)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35273h0 = z10;
        this.Y.n(u0());
        org.telegram.messenger.iv ivVar = this.f22941a;
        org.telegram.ui.Cells.q1 q1Var = ivVar.E;
        if (q1Var != null) {
            e6Var = q1Var.getResourcesProvider();
        } else {
            e6Var = null;
        }
        this.f35266a0 = org.telegram.utils.twidget.m1.d(e6Var, ivVar.E());
        this.Y.l(org.telegram.utils.twidget.m1.a(e6Var, ivVar.E()));
        q71 q71Var = this.f35270e0;
        org.telegram.utils.twidget.y0 y0Var = this.Y;
        if (q71Var.f38550p != y0Var) {
            q71Var.q();
            q71Var.f38550p = y0Var;
            if (y0Var != null) {
                y0Var.h = q71Var;
                y0Var.m(q71Var.f38551q);
            }
        }
        this.f35270e0.p(true);
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.f54338a.get(this.X.url);
        if (k0Var != null) {
            k0Var.f54284u = this;
        }
        org.telegram.utils.twidget.n0.t(this.Y);
        if (!this.f35279o0 || (gjVar = this.f22941a.f24446b) == null || !gjVar.M1) {
            z11 = false;
        }
        this.f35279o0 = false;
        if (!z11 && k0() == this.f35275j0) {
            return;
        }
        org.telegram.messenger.g0.h3(new ai.q(28, this, z11));
    }

    public final void s0() {
        if (this.f35271f0) {
            this.f35271f0 = false;
            org.telegram.messenger.g0.r(this.f35274i0);
            this.f35270e0.p(false);
            this.f35270e0.q();
            org.telegram.utils.twidget.y0 y0Var = this.Y;
            if (y0Var != null) {
                org.telegram.utils.twidget.n0.s(y0Var);
            }
        }
    }

    public final int u0() {
        return (j0() * 2) + this.f22943c;
    }
}
