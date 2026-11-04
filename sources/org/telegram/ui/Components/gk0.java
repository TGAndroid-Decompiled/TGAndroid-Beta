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
public final class gk0 extends org.telegram.messenger.xt implements g71 {
    public static final AtomicInteger f34127t0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed X;
    public org.telegram.utils.twidget.u Y;
    public final boolean Z;
    public int f34128a0;
    public final Path f34129b0;
    public final float[] f34130c0;
    public final int f34131d0;
    public h71 f34132e0;
    public boolean f34133f0;
    public long f34134g0;
    public boolean f34135h0;
    public final jb0 f34136i0;
    public int f34137j0;
    public int f34138k0;
    public String f34139l0;
    public org.telegram.utils.twidget.m0 m0;
    public org.telegram.ui.Cells.s9[] f34140n0;
    public boolean f34141o0;
    public long f34142p0;
    public boolean f34143q0;
    public boolean f34144r0;
    public float f34145s0;

    public gk0(org.telegram.messenger.cv r4, android.graphics.Rect r5, int r6, org.telegram.tgnet.tl.TL_iv.pageBlockEmbed r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gk0.<init>(org.telegram.messenger.cv, android.graphics.Rect, int, org.telegram.tgnet.tl.TL_iv$pageBlockEmbed, boolean):void");
    }

    public static int j0() {
        int i3;
        int i10 = org.telegram.messenger.az.Y0;
        if (i10 >= 15) {
            i3 = org.telegram.messenger.g0.L(2.0f);
        } else if (i10 >= 11) {
            i3 = org.telegram.messenger.g0.L(1.0f);
        } else {
            i3 = 0;
        }
        return (org.telegram.messenger.g0.L(9.0f) + i3) - org.telegram.messenger.g0.L(2.0f);
    }

    public static float l0(int i3) {
        return (float) Math.ceil((i3 / org.telegram.messenger.g0.f22607p) - 0.01f);
    }

    public static int t0(int i3, boolean z10) {
        int i10;
        float f10 = 6.0f;
        int L = org.telegram.messenger.g0.L(6.0f) + i3;
        if (org.telegram.messenger.az.Y0 < 10) {
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
        Rect rect = this.f26435b;
        return rect.top + this.f34137j0 + rect.bottom;
    }

    @Override
    public final org.telegram.ui.Cells.s9[] L() {
        return this.f34140n0;
    }

    @Override
    public final boolean Q() {
        h71 h71Var = this.f34132e0;
        if (h71Var != null && this.f34133f0 && h71Var.f34337w && (h71Var.L & 3) != 2) {
            if (h71Var.f34340z || h71Var.n()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void T() {
        org.telegram.utils.twidget.u uVar = this.Y;
        TL_iv.pageBlockEmbed pageblockembed = this.X;
        if (uVar == null) {
            this.Y = org.telegram.utils.twidget.p.i(pageblockembed.url);
        }
        if (this.Y == null) {
            return;
        }
        if (this.f34132e0 == null) {
            this.f34132e0 = new h71(this, org.telegram.messenger.g0.f22607p);
        }
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f52941a.get(pageblockembed.url);
        if (mVar != null) {
            ArrayList arrayList = mVar.v;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            boolean z10 = false;
            if (org.telegram.utils.twidget.p.p(arrayList) != this) {
                h71 h71Var = this.f34132e0;
                org.telegram.utils.twidget.u uVar2 = this.Y;
                h71Var.q();
                h71Var.f34331p = uVar2;
                if (uVar2 != null) {
                    z10 = true;
                }
                h71Var.f34333r = z10;
                return;
            }
            gk0 gk0Var = mVar.f52929w;
            mVar.f52929w = this;
            if (gk0Var != null && gk0Var != this && gk0Var.f34133f0 && gk0Var.f34132e0 != null) {
                gk0Var.s0();
                h71 h71Var2 = gk0Var.f34132e0;
                org.telegram.utils.twidget.u uVar3 = gk0Var.Y;
                h71Var2.q();
                h71Var2.f34331p = uVar3;
                if (uVar3 != null) {
                    z10 = true;
                }
                h71Var2.f34333r = z10;
                View view = gk0Var.W;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        r0();
    }

    @Override
    public final void V() {
        h71 h71Var;
        if (this.f34132e0 != null) {
            s0();
            this.f34132e0.q();
            org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f52941a.get(this.X.url);
            if (mVar != null) {
                ArrayList arrayList = mVar.v;
                arrayList.remove(this);
                if (mVar.f52929w == this) {
                    gk0 p10 = org.telegram.utils.twidget.p.p(arrayList);
                    mVar.f52929w = p10;
                    if (p10 != null && !p10.f34133f0 && p10.W != null && (h71Var = p10.f34132e0) != null && p10.Y != null) {
                        h71Var.q();
                        p10.r0();
                        p10.W.invalidate();
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
        if (this.f34132e0 == null) {
            return;
        }
        int i3 = this.f34128a0;
        org.telegram.messenger.cv cvVar = this.f26434a;
        org.telegram.ui.Cells.q1 q1Var2 = cvVar.E;
        org.telegram.ui.Cells.x1 x1Var = null;
        if (q1Var2 != null) {
            e6Var = q1Var2.getResourcesProvider();
        } else {
            e6Var = null;
        }
        if (i3 != org.telegram.utils.twidget.i0.d(e6Var, cvVar.E())) {
            org.telegram.ui.Cells.q1 q1Var3 = cvVar.E;
            if (q1Var3 != null) {
                e6Var2 = q1Var3.getResourcesProvider();
            } else {
                e6Var2 = null;
            }
            this.f34128a0 = org.telegram.utils.twidget.i0.d(e6Var2, cvVar.E());
            this.Y.l(org.telegram.utils.twidget.i0.a(e6Var2, cvVar.E()));
        }
        if (R()) {
            max = 0;
        } else {
            max = Math.max(0, Math.min(j0(), cvVar.S - org.telegram.messenger.g0.L(2.0f)));
        }
        this.f34138k0 = max;
        int u02 = u0();
        float f16 = this.f34137j0;
        if (this.f34142p0 != 0 && (q1Var = cvVar.E) != null) {
            x1Var = q1Var.getTransitionParams();
        }
        if (x1Var != null && x1Var.f30936x0) {
            this.f34143q0 = true;
            f11 = x1Var.f30885k0 + 0.0f;
            f16 += x1Var.f30880j0;
            if (i0()) {
                f10 = x1Var.f30880j0;
            } else {
                f10 = x1Var.f30885k0;
            }
        } else {
            if (x1Var != null && (this.f34143q0 || SystemClock.uptimeMillis() - this.f34142p0 > 250)) {
                this.f34142p0 = 0L;
                this.f34143q0 = false;
            }
            f10 = 0.0f;
            f11 = 0.0f;
        }
        if (i0()) {
            f10 += this.f34137j0 - k0();
        }
        this.f34145s0 = f16;
        canvas.save();
        canvas.translate(-this.f34138k0, 0.0f);
        Path path = this.f34129b0;
        path.rewind();
        int i10 = org.telegram.messenger.az.Y0;
        if (i10 > 2) {
            i10 -= 2;
        }
        int L = org.telegram.messenger.g0.L(i10);
        int min = Math.min(org.telegram.messenger.g0.L(3.0f), L);
        boolean z10 = this.Z;
        if (z10 && !cvVar.B() && (cvVar.E() || !cvVar.G())) {
            f12 = L;
        } else {
            f12 = min;
        }
        if (z10 && (!cvVar.E() || !cvVar.G())) {
            f13 = L;
        } else {
            f13 = min;
        }
        float[] fArr = this.f34130c0;
        fArr[1] = f12;
        fArr[0] = f12;
        fArr[3] = f13;
        fArr[2] = f13;
        if (this.f34144r0 && cvVar.E()) {
            f14 = L;
        } else {
            f14 = min;
        }
        if (this.f34144r0 && !cvVar.E()) {
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
        if (this.f34132e0.b(canvas, u02) && (view = this.W) != null) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        org.telegram.utils.twidget.m mVar;
        if (this.f34132e0 != null && this.f34133f0) {
            String str = this.X.url;
            if (org.telegram.utils.twidget.p.n(str)) {
                mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f52941a.get(str);
            } else {
                mVar = null;
            }
            if (mVar == null || !mVar.f52918k) {
                motionEvent.offsetLocation(this.f34138k0, 0.0f);
                try {
                    return this.f34132e0.m(motionEvent);
                } finally {
                    motionEvent.offsetLocation(-this.f34138k0, 0.0f);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d() {
        org.telegram.ui.Cells.q1 q1Var = this.f26434a.E;
        if (q1Var != null && q1Var.Ra != null) {
            try {
                q1Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            q1Var.Ra.p0(q1Var, q1Var.f29936h1, q1Var.f29947i1);
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
        org.telegram.utils.twidget.f0 c2;
        org.telegram.utils.twidget.m0 m0Var;
        org.telegram.utils.twidget.u uVar = this.Y;
        if (uVar == null) {
            c2 = null;
        } else {
            c2 = uVar.c();
        }
        if (c2 == null) {
            m0Var = null;
        } else {
            m0Var = c2.f52852f;
        }
        if (m0Var != this.m0) {
            this.m0 = m0Var;
            if (m0Var == null) {
                this.f34140n0 = null;
            } else {
                ArrayList arrayList = m0Var.f52934a;
                this.f34140n0 = new org.telegram.ui.Cells.s9[arrayList.size()];
                int i3 = 0;
                while (true) {
                    org.telegram.ui.Cells.s9[] s9VarArr = this.f34140n0;
                    if (i3 >= s9VarArr.length) {
                        break;
                    }
                    s9VarArr[i3] = new mi.z(this, (org.telegram.utils.twidget.k0) arrayList.get(i3));
                    i3++;
                }
            }
            this.f26434a.Q();
        }
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean i0() {
        org.telegram.utils.twidget.m mVar;
        boolean z10;
        String str = this.X.url;
        org.telegram.utils.twidget.u uVar = this.Y;
        if (uVar != null) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f52941a;
            if (uVar.f52962i > 0) {
                return uVar.f52965l;
            }
        }
        org.telegram.utils.twidget.n nVar = null;
        if (org.telegram.utils.twidget.p.n(str)) {
            mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f52941a.get(str);
        } else {
            mVar = null;
        }
        if (mVar != null) {
            nVar = (org.telegram.utils.twidget.n) org.telegram.utils.twidget.p.f52942b.get(mVar.a());
        }
        if (nVar != null) {
            synchronized (nVar) {
                if (!nVar.f52935a.isEmpty() && ((int[]) nVar.f52935a.get(0)).length > 2) {
                    if (((int[]) nVar.f52935a.get(0))[2] != 0) {
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
        org.telegram.utils.twidget.f0 f0Var;
        jb0 jb0Var = this.f34136i0;
        org.telegram.messenger.g0.r(jb0Var);
        if (!this.f34135h0) {
            org.telegram.utils.twidget.h0 h0Var = this.Y.f52960f;
            if (h0Var != null && (f0Var = h0Var.F) != null && (f0Var.f52853g || h0Var.f52884x)) {
                this.f34135h0 = true;
                this.f34134g0 = SystemClock.uptimeMillis();
                if (k0() != this.f34137j0) {
                    q0("on screen, loaded", true);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.i3(jb0Var, 1500L);
        } else if (SystemClock.uptimeMillis() - this.f34134g0 < 1500) {
            org.telegram.messenger.g0.i3(jb0Var, 200L);
        } else if (k0() != this.f34137j0) {
            q0("on screen", true);
        }
    }

    public final int k0() {
        return org.telegram.utils.twidget.p.d(this.X.url, this.Y, u0());
    }

    public final float m0() {
        return this.f26435b.top + this.f34145s0;
    }

    public final float n0() {
        return u0() + (this.f26435b.left - this.f34138k0);
    }

    public final void o0(int i3, String str, String str2, boolean z10) {
        long j10;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!org.telegram.messenger.r2.f25040a) {
            return;
        }
        long j11 = -1;
        if (this.f34133f0) {
            j10 = SystemClock.uptimeMillis() - this.f34134g0;
        } else {
            j10 = -1;
        }
        h71 h71Var = this.f34132e0;
        if (h71Var != null && h71Var.f34334s != 0) {
            j11 = SystemClock.uptimeMillis() - h71Var.f34334s;
        }
        StringBuilder sb2 = new StringBuilder("widget height ");
        sb2.append(this.X.url.substring(10));
        sb2.append(": ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(Math.round(i3 / org.telegram.messenger.g0.f22607p));
        sb2.append(" (");
        sb2.append(str2);
        sb2.append(") -> ");
        sb2.append(Math.round(this.f34137j0 / org.telegram.messenger.g0.f22607p));
        sb2.append(" (");
        sb2.append(this.f34139l0);
        sb2.append("), width ");
        sb2.append(Math.round(u0() / org.telegram.messenger.g0.f22607p));
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
        if (j10 >= 0) {
            str5 = t4.c.e(j10, ", running ", " ms");
        } else {
            str5 = ", not running";
        }
        sb2.append(str5);
        if (this.Y != null) {
            StringBuilder sb3 = new StringBuilder(", session ");
            sb3.append(this.Y.f52970q);
            if (this.Y.f52961g == null) {
                str7 = "";
            } else {
                str7 = " (snapshot)";
            }
            sb3.append(str7);
            org.telegram.utils.twidget.h0 h0Var = this.Y.f52960f;
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
        if (j11 >= 0 && j11 < 5000) {
            str9 = t4.c.e(j11, ", touched ", " ms ago");
        }
        k2.p1.w(str9, sb2);
    }

    public final void p0(String str) {
        if (this.W != null) {
            org.telegram.utils.twidget.u uVar = this.Y;
            if ((uVar == null || uVar.f52962i <= 0) && k0() != this.f34137j0) {
                q0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int k02 = k0();
        int i3 = this.f34137j0;
        if (k02 == i3) {
            return;
        }
        String str2 = this.f34139l0;
        this.f34137j0 = k02;
        this.f34139l0 = org.telegram.utils.twidget.p.k(this.X.url, this.Y, u0());
        o0(i3, "away: ".concat(str), str2, false);
        org.telegram.messenger.cv cvVar = this.f26434a;
        cvVar.Q();
        org.telegram.messenger.zi ziVar = cvVar.f22066b;
        if (ziVar != null) {
            ziVar.K1 = true;
        }
        this.f34141o0 = true;
    }

    public final void q0(String str, boolean z10) {
        boolean z11;
        int k02 = k0();
        int i3 = this.f34137j0;
        boolean z12 = false;
        if (k02 != i3) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str2 = this.f34139l0;
        this.f34137j0 = k02;
        this.f34139l0 = org.telegram.utils.twidget.p.k(this.X.url, this.Y, u0());
        if (z11) {
            o0(i3, str, str2, z10);
        }
        org.telegram.messenger.cv cvVar = this.f26434a;
        if (z11) {
            cvVar.Q();
        }
        if (z11 && z10) {
            this.f34142p0 = SystemClock.uptimeMillis();
            this.f34143q0 = false;
        }
        org.telegram.messenger.zi ziVar = cvVar.f22066b;
        if (ziVar != null) {
            ziVar.K1 = true;
        }
        org.telegram.ui.Cells.q1 q1Var = cvVar.E;
        org.telegram.ui.Cells.l1 l1Var = cvVar.F;
        View view = this.W;
        if (view != null && q1Var != null && l1Var != null) {
            if (z11 && !i0() && (q1Var.getParent() instanceof RecyclerView)) {
                View view2 = (View) q1Var.getParent();
                if (q1Var.getBottom() > view2.getPaddingTop() && q1Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                    z12 = true;
                }
            }
            if (z10) {
                l1Var.r1(q1Var, z12, z12);
            } else {
                l1Var.E0(q1Var, z12, z12);
            }
        } else if (view != null) {
            view.requestLayout();
        }
    }

    public final void r0() {
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.messenger.zi ziVar;
        org.telegram.utils.twidget.f0 f0Var;
        boolean z11 = true;
        this.f34133f0 = true;
        this.f34134g0 = SystemClock.uptimeMillis();
        org.telegram.utils.twidget.h0 h0Var = this.Y.f52960f;
        if (h0Var != null && (f0Var = h0Var.F) != null && (f0Var.f52853g || h0Var.f52884x)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34135h0 = z10;
        this.Y.n(u0());
        org.telegram.messenger.cv cvVar = this.f26434a;
        org.telegram.ui.Cells.q1 q1Var = cvVar.E;
        if (q1Var != null) {
            e6Var = q1Var.getResourcesProvider();
        } else {
            e6Var = null;
        }
        this.f34128a0 = org.telegram.utils.twidget.i0.d(e6Var, cvVar.E());
        this.Y.l(org.telegram.utils.twidget.i0.a(e6Var, cvVar.E()));
        h71 h71Var = this.f34132e0;
        org.telegram.utils.twidget.u uVar = this.Y;
        if (h71Var.f34331p != uVar) {
            h71Var.q();
            h71Var.f34331p = uVar;
            if (uVar != null) {
                uVar.h = h71Var;
                uVar.m(h71Var.f34332q);
            }
        }
        this.f34132e0.p(true);
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f52941a.get(this.X.url);
        if (mVar != null) {
            mVar.f52928u = this;
        }
        org.telegram.utils.twidget.p.s(this.Y);
        if (!this.f34141o0 || (ziVar = this.f26434a.f22066b) == null || !ziVar.K1) {
            z11 = false;
        }
        this.f34141o0 = false;
        if (!z11 && k0() == this.f34137j0) {
            return;
        }
        org.telegram.messenger.g0.h3(new ci.e1(27, this, z11));
    }

    public final void s0() {
        if (this.f34133f0) {
            this.f34133f0 = false;
            org.telegram.messenger.g0.r(this.f34136i0);
            this.f34132e0.p(false);
            this.f34132e0.q();
            org.telegram.utils.twidget.u uVar = this.Y;
            if (uVar != null) {
                org.telegram.utils.twidget.p.r(uVar);
            }
        }
    }

    public final int u0() {
        return (j0() * 2) + this.f26436c;
    }
}
