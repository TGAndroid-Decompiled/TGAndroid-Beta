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
public final class ck0 extends org.telegram.messenger.fu implements n71 {
    public static final AtomicInteger f32591s0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed W;
    public org.telegram.utils.twidget.u X;
    public final boolean Y;
    public int Z;
    public final Path f32592a0;
    public final float[] f32593b0;
    public final int f32594c0;
    public o71 f32595d0;
    public boolean f32596e0;
    public long f32597f0;
    public boolean f32598g0;
    public final ob0 f32599h0;
    public int f32600i0;
    public int f32601j0;
    public String f32602k0;
    public org.telegram.utils.twidget.m0 f32603l0;
    public org.telegram.ui.Cells.t9[] m0;
    public boolean f32604n0;
    public long f32605o0;
    public boolean f32606p0;
    public boolean f32607q0;
    public float f32608r0;

    public ck0(org.telegram.messenger.kv r4, android.graphics.Rect r5, int r6, org.telegram.tgnet.tl.TL_iv.pageBlockEmbed r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ck0.<init>(org.telegram.messenger.kv, android.graphics.Rect, int, org.telegram.tgnet.tl.TL_iv$pageBlockEmbed, boolean):void");
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
        return (float) Math.ceil((i7 / org.telegram.messenger.g0.f22536p) - 0.01f);
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
        Rect rect = this.f22444b;
        return rect.top + this.f32600i0 + rect.bottom;
    }

    @Override
    public final org.telegram.ui.Cells.t9[] L() {
        return this.m0;
    }

    @Override
    public final boolean Q() {
        o71 o71Var = this.f32595d0;
        if (o71Var != null && this.f32596e0 && o71Var.f36543w && (o71Var.L & 3) != 2) {
            if (o71Var.f36546z || o71Var.n()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void T() {
        org.telegram.utils.twidget.u uVar = this.X;
        TL_iv.pageBlockEmbed pageblockembed = this.W;
        if (uVar == null) {
            this.X = org.telegram.utils.twidget.p.i(pageblockembed.url);
        }
        if (this.X == null) {
            return;
        }
        if (this.f32595d0 == null) {
            this.f32595d0 = new o71(this, org.telegram.messenger.g0.f22536p);
        }
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f52876a.get(pageblockembed.url);
        if (mVar != null) {
            ArrayList arrayList = mVar.v;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            boolean z9 = false;
            if (org.telegram.utils.twidget.p.p(arrayList) != this) {
                o71 o71Var = this.f32595d0;
                org.telegram.utils.twidget.u uVar2 = this.X;
                o71Var.q();
                o71Var.f36537p = uVar2;
                if (uVar2 != null) {
                    z9 = true;
                }
                o71Var.f36539r = z9;
                return;
            }
            ck0 ck0Var = mVar.f52864w;
            mVar.f52864w = this;
            if (ck0Var != null && ck0Var != this && ck0Var.f32596e0 && ck0Var.f32595d0 != null) {
                ck0Var.s0();
                o71 o71Var2 = ck0Var.f32595d0;
                org.telegram.utils.twidget.u uVar3 = ck0Var.X;
                o71Var2.q();
                o71Var2.f36537p = uVar3;
                if (uVar3 != null) {
                    z9 = true;
                }
                o71Var2.f36539r = z9;
                View view = ck0Var.V;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        r0();
    }

    @Override
    public final void V() {
        o71 o71Var;
        if (this.f32595d0 != null) {
            s0();
            this.f32595d0.q();
            org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f52876a.get(this.W.url);
            if (mVar != null) {
                ArrayList arrayList = mVar.v;
                arrayList.remove(this);
                if (mVar.f52864w == this) {
                    ck0 p10 = org.telegram.utils.twidget.p.p(arrayList);
                    mVar.f52864w = p10;
                    if (p10 != null && !p10.f32596e0 && p10.V != null && (o71Var = p10.f32595d0) != null && p10.X != null) {
                        o71Var.q();
                        p10.r0();
                        p10.V.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void W(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        int max;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        View view;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        if (this.f32595d0 == null) {
            return;
        }
        int i7 = this.Z;
        org.telegram.messenger.kv kvVar = this.f22443a;
        org.telegram.ui.Cells.q1 q1Var2 = kvVar.E;
        org.telegram.ui.Cells.x1 x1Var = null;
        if (q1Var2 != null) {
            f6Var = q1Var2.getResourcesProvider();
        } else {
            f6Var = null;
        }
        if (i7 != org.telegram.utils.twidget.i0.d(f6Var, kvVar.E())) {
            org.telegram.ui.Cells.q1 q1Var3 = kvVar.E;
            if (q1Var3 != null) {
                f6Var2 = q1Var3.getResourcesProvider();
            } else {
                f6Var2 = null;
            }
            this.Z = org.telegram.utils.twidget.i0.d(f6Var2, kvVar.E());
            this.X.l(org.telegram.utils.twidget.i0.a(f6Var2, kvVar.E()));
        }
        if (R()) {
            max = 0;
        } else {
            max = Math.max(0, Math.min(j0(), kvVar.S - org.telegram.messenger.g0.L(2.0f)));
        }
        this.f32601j0 = max;
        int u02 = u0();
        float f16 = this.f32600i0;
        if (this.f32605o0 != 0 && (q1Var = kvVar.E) != null) {
            x1Var = q1Var.getTransitionParams();
        }
        if (x1Var != null && x1Var.f30858x0) {
            this.f32606p0 = true;
            f11 = x1Var.f30807k0 + 0.0f;
            f16 += x1Var.f30803j0;
            if (i0()) {
                f10 = x1Var.f30803j0;
            } else {
                f10 = x1Var.f30807k0;
            }
        } else {
            if (x1Var != null && (this.f32606p0 || SystemClock.uptimeMillis() - this.f32605o0 > 250)) {
                this.f32605o0 = 0L;
                this.f32606p0 = false;
            }
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (i0()) {
            f10 += this.f32600i0 - k0();
        }
        this.f32608r0 = f16;
        canvas.save();
        canvas.translate(-this.f32601j0, 0.0f);
        Path path = this.f32592a0;
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
        float[] fArr = this.f32593b0;
        fArr[1] = f12;
        fArr[0] = f12;
        fArr[3] = f13;
        fArr[2] = f13;
        if (this.f32607q0 && kvVar.E()) {
            f14 = L;
        } else {
            f14 = min;
        }
        if (this.f32607q0 && !kvVar.E()) {
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
        if (this.f32595d0.b(canvas, u02) && (view = this.V) != null) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        org.telegram.utils.twidget.m mVar;
        if (this.f32595d0 != null && this.f32596e0) {
            String str = this.W.url;
            if (org.telegram.utils.twidget.p.n(str)) {
                mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f52876a.get(str);
            } else {
                mVar = null;
            }
            if (mVar == null || !mVar.f52853k) {
                motionEvent.offsetLocation(this.f32601j0, 0.0f);
                try {
                    return this.f32595d0.m(motionEvent);
                } finally {
                    motionEvent.offsetLocation(-this.f32601j0, 0.0f);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d() {
        org.telegram.ui.Cells.q1 q1Var = this.f22443a.E;
        if (q1Var != null && q1Var.Ra != null) {
            try {
                q1Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            q1Var.Ra.p0(q1Var, q1Var.f29845g1, q1Var.f29859h1);
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
        org.telegram.utils.twidget.f0 c10;
        org.telegram.utils.twidget.m0 m0Var;
        org.telegram.utils.twidget.u uVar = this.X;
        if (uVar == null) {
            c10 = null;
        } else {
            c10 = uVar.c();
        }
        if (c10 == null) {
            m0Var = null;
        } else {
            m0Var = c10.f52787f;
        }
        if (m0Var != this.f32603l0) {
            this.f32603l0 = m0Var;
            if (m0Var == null) {
                this.m0 = null;
            } else {
                ArrayList arrayList = m0Var.f52869a;
                this.m0 = new org.telegram.ui.Cells.t9[arrayList.size()];
                int i7 = 0;
                while (true) {
                    org.telegram.ui.Cells.t9[] t9VarArr = this.m0;
                    if (i7 >= t9VarArr.length) {
                        break;
                    }
                    t9VarArr[i7] = new li.a0(this, (org.telegram.utils.twidget.k0) arrayList.get(i7));
                    i7++;
                }
            }
            this.f22443a.Q();
        }
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean i0() {
        org.telegram.utils.twidget.m mVar;
        boolean z9;
        String str = this.W.url;
        org.telegram.utils.twidget.u uVar = this.X;
        if (uVar != null) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f52876a;
            if (uVar.f52897i > 0) {
                return uVar.f52900l;
            }
        }
        org.telegram.utils.twidget.n nVar = null;
        if (org.telegram.utils.twidget.p.n(str)) {
            mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f52876a.get(str);
        } else {
            mVar = null;
        }
        if (mVar != null) {
            nVar = (org.telegram.utils.twidget.n) org.telegram.utils.twidget.p.f52877b.get(mVar.a());
        }
        if (nVar != null) {
            synchronized (nVar) {
                if (!nVar.f52870a.isEmpty() && ((int[]) nVar.f52870a.get(0)).length > 2) {
                    if (((int[]) nVar.f52870a.get(0))[2] != 0) {
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
        org.telegram.utils.twidget.f0 f0Var;
        ob0 ob0Var = this.f32599h0;
        org.telegram.messenger.g0.r(ob0Var);
        if (!this.f32598g0) {
            org.telegram.utils.twidget.h0 h0Var = this.X.f52895f;
            if (h0Var != null && (f0Var = h0Var.F) != null && (f0Var.f52788g || h0Var.f52819x)) {
                this.f32598g0 = true;
                this.f32597f0 = SystemClock.uptimeMillis();
                if (k0() != this.f32600i0) {
                    q0("on screen, loaded", true);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.i3(ob0Var, 1500L);
        } else if (SystemClock.uptimeMillis() - this.f32597f0 < 1500) {
            org.telegram.messenger.g0.i3(ob0Var, 200L);
        } else if (k0() != this.f32600i0) {
            q0("on screen", true);
        }
    }

    public final int k0() {
        return org.telegram.utils.twidget.p.d(this.W.url, this.X, u0());
    }

    public final float m0() {
        return this.f22444b.top + this.f32608r0;
    }

    public final float n0() {
        return u0() + (this.f22444b.left - this.f32601j0);
    }

    public final void o0(int i7, String str, String str2, boolean z9) {
        long j3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!org.telegram.messenger.r2.f25191a) {
            return;
        }
        long j10 = -1;
        if (this.f32596e0) {
            j3 = SystemClock.uptimeMillis() - this.f32597f0;
        } else {
            j3 = -1;
        }
        o71 o71Var = this.f32595d0;
        if (o71Var != null && o71Var.f36540s != 0) {
            j10 = SystemClock.uptimeMillis() - o71Var.f36540s;
        }
        StringBuilder sb2 = new StringBuilder("widget height ");
        sb2.append(this.W.url.substring(10));
        sb2.append(": ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(Math.round(i7 / org.telegram.messenger.g0.f22536p));
        sb2.append(" (");
        sb2.append(str2);
        sb2.append(") -> ");
        sb2.append(Math.round(this.f32600i0 / org.telegram.messenger.g0.f22536p));
        sb2.append(" (");
        sb2.append(this.f32602k0);
        sb2.append("), width ");
        sb2.append(Math.round(u0() / org.telegram.messenger.g0.f22536p));
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
            sb3.append(this.X.f52905q);
            if (this.X.f52896g == null) {
                str7 = "";
            } else {
                str7 = " (snapshot)";
            }
            sb3.append(str7);
            org.telegram.utils.twidget.h0 h0Var = this.X.f52895f;
            if (h0Var != null && h0Var.A) {
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
            org.telegram.utils.twidget.u uVar = this.X;
            if ((uVar == null || uVar.f52897i <= 0) && k0() != this.f32600i0) {
                q0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int k02 = k0();
        int i7 = this.f32600i0;
        if (k02 == i7) {
            return;
        }
        String str2 = this.f32602k0;
        this.f32600i0 = k02;
        this.f32602k0 = org.telegram.utils.twidget.p.k(this.W.url, this.X, u0());
        o0(i7, "away: ".concat(str), str2, false);
        org.telegram.messenger.kv kvVar = this.f22443a;
        kvVar.Q();
        org.telegram.messenger.ij ijVar = kvVar.f23757b;
        if (ijVar != null) {
            ijVar.K1 = true;
        }
        this.f32604n0 = true;
    }

    public final void q0(String str, boolean z9) {
        boolean z10;
        int k02 = k0();
        int i7 = this.f32600i0;
        boolean z11 = false;
        if (k02 != i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = this.f32602k0;
        this.f32600i0 = k02;
        this.f32602k0 = org.telegram.utils.twidget.p.k(this.W.url, this.X, u0());
        if (z10) {
            o0(i7, str, str2, z9);
        }
        org.telegram.messenger.kv kvVar = this.f22443a;
        if (z10) {
            kvVar.Q();
        }
        if (z10 && z9) {
            this.f32605o0 = SystemClock.uptimeMillis();
            this.f32606p0 = false;
        }
        org.telegram.messenger.ij ijVar = kvVar.f23757b;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.messenger.ij ijVar;
        org.telegram.utils.twidget.f0 f0Var;
        boolean z10 = true;
        this.f32596e0 = true;
        this.f32597f0 = SystemClock.uptimeMillis();
        org.telegram.utils.twidget.h0 h0Var = this.X.f52895f;
        if (h0Var != null && (f0Var = h0Var.F) != null && (f0Var.f52788g || h0Var.f52819x)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f32598g0 = z9;
        this.X.n(u0());
        org.telegram.messenger.kv kvVar = this.f22443a;
        org.telegram.ui.Cells.q1 q1Var = kvVar.E;
        if (q1Var != null) {
            f6Var = q1Var.getResourcesProvider();
        } else {
            f6Var = null;
        }
        this.Z = org.telegram.utils.twidget.i0.d(f6Var, kvVar.E());
        this.X.l(org.telegram.utils.twidget.i0.a(f6Var, kvVar.E()));
        o71 o71Var = this.f32595d0;
        org.telegram.utils.twidget.u uVar = this.X;
        if (o71Var.f36537p != uVar) {
            o71Var.q();
            o71Var.f36537p = uVar;
            if (uVar != null) {
                uVar.h = o71Var;
                uVar.m(o71Var.f36538q);
            }
        }
        this.f32595d0.p(true);
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f52876a.get(this.W.url);
        if (mVar != null) {
            mVar.f52863u = this;
        }
        org.telegram.utils.twidget.p.s(this.X);
        if (!this.f32604n0 || (ijVar = this.f22443a.f23757b) == null || !ijVar.K1) {
            z10 = false;
        }
        this.f32604n0 = false;
        if (!z10 && k0() == this.f32600i0) {
            return;
        }
        org.telegram.messenger.g0.h3(new bi.k1(27, this, z10));
    }

    public final void s0() {
        if (this.f32596e0) {
            this.f32596e0 = false;
            org.telegram.messenger.g0.r(this.f32599h0);
            this.f32595d0.p(false);
            this.f32595d0.q();
            org.telegram.utils.twidget.u uVar = this.X;
            if (uVar != null) {
                org.telegram.utils.twidget.p.r(uVar);
            }
        }
    }

    public final int u0() {
        return (j0() * 2) + this.f22445c;
    }
}
