package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.LaunchActivity;
public final class gl0 extends org.telegram.messenger.qu implements p81 {
    public static final AtomicInteger f26393u0 = new AtomicInteger();
    public static Paint f26394v0;
    public static Drawable f26395w0;
    public final TL_iv.pageBlockEmbed W;
    public org.telegram.utils.twidget.w X;
    public final boolean Y;
    public int Z;
    public final Path f26396a0;
    public final float[] f26397b0;
    public final int f26398c0;
    public q81 f26399d0;
    public boolean f26400e0;
    public long f26401f0;
    public boolean f26402g0;
    public final eb0 f26403h0;
    public int f26404i0;
    public int f26405j0;
    public String f26406k0;
    public org.telegram.utils.twidget.q0 f26407l0;
    public org.telegram.ui.Cells.u9[] m0;
    public boolean f26408n0;
    public long f26409o0;
    public boolean f26410p0;
    public final RectF f26411q0;
    public boolean f26412r0;
    public boolean f26413s0;
    public float f26414t0;

    public gl0(org.telegram.messenger.vv r4, android.graphics.Rect r5, int r6, org.telegram.tgnet.tl.TL_iv.pageBlockEmbed r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gl0.<init>(org.telegram.messenger.vv, android.graphics.Rect, int, org.telegram.tgnet.tl.TL_iv$pageBlockEmbed, boolean):void");
    }

    public static int i0() {
        int i10;
        int i11 = org.telegram.messenger.tz.Y0;
        if (i11 >= 15) {
            i10 = org.telegram.messenger.i0.L(2.0f);
        } else if (i11 >= 11) {
            i10 = org.telegram.messenger.i0.L(1.0f);
        } else {
            i10 = 0;
        }
        return (org.telegram.messenger.i0.L(9.0f) + i10) - org.telegram.messenger.i0.L(2.0f);
    }

    public static float k0(int i10) {
        return (float) Math.ceil((i10 / org.telegram.messenger.i0.f16025p) - 0.01f);
    }

    public static int t0(int i10, boolean z10) {
        int i11;
        float f7 = 6.0f;
        int L = org.telegram.messenger.i0.L(6.0f) + i10;
        if (org.telegram.messenger.tz.Y0 < 10) {
            f7 = 4.0f;
        }
        int D = org.telegram.messenger.m5.D(f7, 2, L);
        if (z10) {
            i11 = org.telegram.messenger.i0.L(20.0f);
        } else {
            i11 = 0;
        }
        return org.telegram.messenger.i0.L(4.0f) + D + i11;
    }

    @Override
    public final int H() {
        Rect rect = this.f17622b;
        return rect.top + this.f26404i0 + rect.bottom;
    }

    @Override
    public final org.telegram.ui.Cells.u9[] K() {
        return this.m0;
    }

    @Override
    public final boolean P() {
        q81 q81Var = this.f26399d0;
        if (q81Var != null && this.f26400e0 && q81Var.f29596w && (q81Var.L & 3) != 2) {
            if (q81Var.f29599z || q81Var.o()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void S() {
        org.telegram.utils.twidget.w wVar = this.X;
        TL_iv.pageBlockEmbed pageblockembed = this.W;
        if (wVar == null) {
            this.X = org.telegram.utils.twidget.p.i(pageblockembed.url);
        }
        if (this.X == null) {
            return;
        }
        if (this.f26399d0 == null) {
            this.f26399d0 = new q81(this, org.telegram.messenger.i0.f16025p);
        }
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f44430a.get(pageblockembed.url);
        if (mVar != null) {
            ArrayList arrayList = mVar.f44413w;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            boolean z10 = false;
            if (org.telegram.utils.twidget.p.p(arrayList) != this) {
                q81 q81Var = this.f26399d0;
                org.telegram.utils.twidget.w wVar2 = this.X;
                q81Var.r();
                q81Var.f29590p = wVar2;
                if (wVar2 != null) {
                    z10 = true;
                }
                q81Var.f29592r = z10;
                return;
            }
            gl0 gl0Var = mVar.f44414x;
            mVar.f44414x = this;
            if (gl0Var != null && gl0Var != this && gl0Var.f26400e0 && gl0Var.f26399d0 != null) {
                gl0Var.s0();
                q81 q81Var2 = gl0Var.f26399d0;
                org.telegram.utils.twidget.w wVar3 = gl0Var.X;
                q81Var2.r();
                q81Var2.f29590p = wVar3;
                if (wVar3 != null) {
                    z10 = true;
                }
                q81Var2.f29592r = z10;
                View view = gl0Var.V;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        r0();
    }

    @Override
    public final void U() {
        q81 q81Var;
        if (this.f26399d0 != null) {
            s0();
            this.f26399d0.r();
            org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f44430a.get(this.W.url);
            if (mVar != null) {
                ArrayList arrayList = mVar.f44413w;
                arrayList.remove(this);
                if (mVar.f44414x == this) {
                    gl0 p5 = org.telegram.utils.twidget.p.p(arrayList);
                    mVar.f44414x = p5;
                    if (p5 != null && !p5.f26400e0 && p5.V != null && (q81Var = p5.f26399d0) != null && p5.X != null) {
                        q81Var.r();
                        p5.r0();
                        p5.V.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void V(Canvas canvas) {
        org.telegram.ui.ActionBar.p6 p6Var;
        int max;
        org.telegram.ui.Cells.x1 x1Var;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        org.telegram.utils.twidget.m mVar;
        float f15;
        int i10;
        View view;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        if (this.f26399d0 == null) {
            return;
        }
        int i11 = this.Z;
        org.telegram.ui.Cells.q1 q1Var2 = this.f17621a.E;
        if (q1Var2 != null) {
            p6Var = q1Var2.getResourcesProvider();
        } else {
            p6Var = null;
        }
        if (i11 != org.telegram.utils.twidget.l0.e(p6Var, this.f17621a.E())) {
            org.telegram.messenger.vv vvVar = this.f17621a;
            org.telegram.ui.Cells.q1 q1Var3 = vvVar.E;
            if (q1Var3 != null) {
                p6Var2 = q1Var3.getResourcesProvider();
            } else {
                p6Var2 = null;
            }
            this.Z = org.telegram.utils.twidget.l0.e(p6Var2, vvVar.E());
            this.X.l(org.telegram.utils.twidget.l0.a(p6Var2, vvVar.E()));
        }
        if (Q()) {
            max = 0;
        } else {
            max = Math.max(0, Math.min(i0(), this.f17621a.S - org.telegram.messenger.i0.L(2.0f)));
        }
        this.f26405j0 = max;
        int u02 = u0();
        float f16 = this.f26404i0;
        if (this.f26409o0 != 0 && (q1Var = this.f17621a.E) != null) {
            x1Var = q1Var.getTransitionParams();
        } else {
            x1Var = null;
        }
        if (x1Var != null && x1Var.f23554x0) {
            this.f26410p0 = true;
            f10 = x1Var.f23502k0 + 0.0f;
            f16 += x1Var.f23497j0;
            if (h0()) {
                f7 = x1Var.f23497j0;
            } else {
                f7 = x1Var.f23502k0;
            }
        } else {
            if (x1Var != null && (this.f26410p0 || SystemClock.uptimeMillis() - this.f26409o0 > 250)) {
                this.f26409o0 = 0L;
                this.f26410p0 = false;
            }
            f7 = 0.0f;
            f10 = 0.0f;
        }
        if (h0()) {
            f7 += this.f26404i0 - j0();
        }
        this.f26414t0 = f16;
        canvas.save();
        canvas.translate(-this.f26405j0, 0.0f);
        this.f26396a0.rewind();
        float[] fArr = this.f26397b0;
        boolean z10 = this.Y;
        org.telegram.messenger.vv vvVar2 = this.f17621a;
        int i12 = org.telegram.messenger.tz.Y0;
        if (i12 > 2) {
            i12 -= 2;
        }
        int L = org.telegram.messenger.i0.L(i12);
        int min = Math.min(org.telegram.messenger.i0.L(3.0f), L);
        if (z10 && !vvVar2.B() && (vvVar2.E() || !vvVar2.G())) {
            f11 = L;
        } else {
            f11 = min;
        }
        if (z10 && (!vvVar2.E() || !vvVar2.G())) {
            f12 = L;
        } else {
            f12 = min;
        }
        fArr[1] = f11;
        fArr[0] = f11;
        fArr[3] = f12;
        fArr[2] = f12;
        if (this.f26413s0 && vvVar2.E()) {
            f13 = L;
        } else {
            f13 = min;
        }
        if (this.f26413s0 && !vvVar2.E()) {
            f14 = L;
        } else {
            f14 = min;
        }
        fArr[5] = f14;
        fArr[4] = f14;
        fArr[7] = f13;
        fArr[6] = f13;
        RectF rectF = org.telegram.messenger.i0.P;
        float f17 = u02;
        rectF.set(0.0f, f10, f17, f16);
        this.f26396a0.addRoundRect(rectF, this.f26397b0, Path.Direction.CW);
        canvas.clipPath(this.f26396a0);
        canvas.translate(0.0f, f7);
        if (this.f26399d0.c(canvas, u02) && (view = this.V) != null) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
        String str = this.W.url;
        if (org.telegram.utils.twidget.p.n(str)) {
            mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f44430a.get(str);
        } else {
            mVar = null;
        }
        if (mVar != null) {
            long j10 = mVar.f44397c;
            if (mVar.f44400i) {
                if (mVar.f44406o == null && org.telegram.messenger.o5.E(j10)) {
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(mVar.f44396b).Z1(Long.valueOf(j10));
                    if (Z1 != null) {
                        mVar.f44406o = Boolean.valueOf(Z1.bot);
                    }
                } else if (mVar.f44406o == null) {
                    mVar.f44406o = Boolean.FALSE;
                }
                Boolean bool = mVar.f44406o;
                if (bool == null || !bool.booleanValue()) {
                    if (f26394v0 == null) {
                        f26394v0 = new Paint(1);
                        Drawable f18 = i0.a.f(org.telegram.messenger.w0.f19025b, 2131232193);
                        f26395w0 = f18;
                        f18.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    }
                    float L2 = org.telegram.messenger.i0.L(10.0f);
                    float L3 = org.telegram.messenger.i0.L(7.0f);
                    if (org.telegram.messenger.cd.X) {
                        f15 = L3 + L2;
                    } else {
                        f15 = (f17 - L3) - L2;
                    }
                    float max2 = Math.max(0.0f, f10) + L3 + L2;
                    this.f26411q0.set(f15 - L2, max2 - L2, f15 + L2, max2 + L2);
                    canvas.save();
                    canvas.translate(-this.f26405j0, 0.0f);
                    Paint paint = f26394v0;
                    if (this.f26412r0) {
                        i10 = 1929379840;
                    } else {
                        i10 = 1291845632;
                    }
                    paint.setColor(i10);
                    canvas.drawCircle(f15, max2, L2, f26394v0);
                    float L4 = org.telegram.messenger.i0.L(14.0f) / 2.0f;
                    f26395w0.setBounds((int) (f15 - L4), (int) (max2 - L4), (int) (f15 + L4), (int) (max2 + L4));
                    f26395w0.draw(canvas);
                    canvas.restore();
                    return;
                }
            }
        }
        this.f26411q0.setEmpty();
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        org.telegram.utils.twidget.m mVar;
        if (this.f26399d0 != null && this.f26400e0) {
            String str = this.W.url;
            if (org.telegram.utils.twidget.p.n(str)) {
                mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f44430a.get(str);
            } else {
                mVar = null;
            }
            if (mVar == null || !mVar.f44402k) {
                motionEvent.offsetLocation(this.f26405j0, 0.0f);
                try {
                    if (o0(motionEvent)) {
                        motionEvent.offsetLocation(-this.f26405j0, 0.0f);
                        return true;
                    }
                    return this.f26399d0.n(motionEvent);
                } finally {
                    motionEvent.offsetLocation(-this.f26405j0, 0.0f);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d() {
        org.telegram.ui.Cells.q1 q1Var = this.f17621a.E;
        if (q1Var != null && q1Var.Qa != null) {
            try {
                q1Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            q1Var.Qa.o0(q1Var, q1Var.f22565g1, q1Var.f22576h1);
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
        org.telegram.utils.twidget.i0 c10;
        org.telegram.utils.twidget.q0 q0Var;
        org.telegram.utils.twidget.w wVar = this.X;
        if (wVar == null) {
            c10 = null;
        } else {
            c10 = wVar.c();
        }
        if (c10 == null) {
            q0Var = null;
        } else {
            q0Var = c10.f44357g;
        }
        if (q0Var != this.f26407l0) {
            this.f26407l0 = q0Var;
            if (q0Var == null) {
                this.m0 = null;
            } else {
                ArrayList arrayList = q0Var.f44443a;
                this.m0 = new org.telegram.ui.Cells.u9[arrayList.size()];
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.u9[] u9VarArr = this.m0;
                    if (i10 >= u9VarArr.length) {
                        break;
                    }
                    u9VarArr[i10] = new bi.e0(this, (org.telegram.utils.twidget.o0) arrayList.get(i10));
                    i10++;
                }
            }
            this.f17621a.Q();
        }
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean h0() {
        org.telegram.utils.twidget.m mVar;
        boolean z10;
        String str = this.W.url;
        org.telegram.utils.twidget.w wVar = this.X;
        if (wVar != null) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f44430a;
            if (wVar.f44456i > 0) {
                return wVar.f44459l;
            }
        }
        org.telegram.utils.twidget.n nVar = null;
        if (org.telegram.utils.twidget.p.n(str)) {
            mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f44430a.get(str);
        } else {
            mVar = null;
        }
        if (mVar != null) {
            nVar = (org.telegram.utils.twidget.n) org.telegram.utils.twidget.p.f44431b.get(mVar.a());
        }
        if (nVar != null) {
            synchronized (nVar) {
                if (!nVar.f44417a.isEmpty() && ((int[]) nVar.f44417a.get(0)).length > 2) {
                    if (((int[]) nVar.f44417a.get(0))[2] != 0) {
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
        org.telegram.utils.twidget.i0 i0Var;
        eb0 eb0Var = this.f26403h0;
        org.telegram.messenger.i0.r(eb0Var);
        if (!this.f26402g0) {
            org.telegram.utils.twidget.k0 k0Var = this.X.f44454f;
            if (k0Var != null && (i0Var = k0Var.F) != null && (i0Var.h || k0Var.f44387x)) {
                this.f26402g0 = true;
                this.f26401f0 = SystemClock.uptimeMillis();
                if (j0() != this.f26404i0) {
                    q0("on screen, loaded", true);
                    return;
                }
                return;
            }
            org.telegram.messenger.i0.h3(eb0Var, 1500L);
        } else if (SystemClock.uptimeMillis() - this.f26401f0 < 1500) {
            org.telegram.messenger.i0.h3(eb0Var, 200L);
        } else if (j0() != this.f26404i0) {
            q0("on screen", true);
        }
    }

    public final int j0() {
        return org.telegram.utils.twidget.p.d(this.W.url, this.X, u0());
    }

    public final float l0() {
        return this.f17622b.top + this.f26414t0;
    }

    public final float m0() {
        return u0() + (this.f17622b.left - this.f26405j0);
    }

    public final void n0(int i10, String str, String str2, boolean z10) {
        long j10;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!org.telegram.messenger.v2.f18448a) {
            return;
        }
        long j11 = -1;
        if (this.f26400e0) {
            j10 = SystemClock.uptimeMillis() - this.f26401f0;
        } else {
            j10 = -1;
        }
        q81 q81Var = this.f26399d0;
        if (q81Var != null && q81Var.f29593s != 0) {
            j11 = SystemClock.uptimeMillis() - q81Var.f29593s;
        }
        StringBuilder sb2 = new StringBuilder("widget height ");
        sb2.append(this.W.url.substring(10));
        sb2.append(": ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(Math.round(i10 / org.telegram.messenger.i0.f16025p));
        sb2.append(" (");
        sb2.append(str2);
        sb2.append(") -> ");
        sb2.append(Math.round(this.f26404i0 / org.telegram.messenger.i0.f16025p));
        sb2.append(" (");
        sb2.append(this.f26406k0);
        sb2.append("), width ");
        sb2.append(Math.round(u0() / org.telegram.messenger.i0.f16025p));
        String str9 = "";
        if (!z10) {
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
        if (j10 >= 0) {
            str5 = org.telegram.ui.Cells.f1.n(j10, ", running ", " ms");
        } else {
            str5 = ", not running";
        }
        sb2.append(str5);
        if (this.X != null) {
            StringBuilder sb3 = new StringBuilder(", session ");
            sb3.append(this.X.f44464q);
            if (this.X.f44455g == null) {
                str7 = "";
            } else {
                str7 = " (snapshot)";
            }
            sb3.append(str7);
            org.telegram.utils.twidget.k0 k0Var = this.X.f44454f;
            if (k0Var != null && k0Var.A) {
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
            str9 = org.telegram.ui.Cells.f1.n(j11, ", touched ", " ms ago");
        }
        a1.g.z(str9, sb2);
    }

    public final boolean o0(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = false;
        if (actionMasked == 0) {
            float L = org.telegram.messenger.i0.L(6.0f);
            RectF rectF = this.f26411q0;
            if (!rectF.isEmpty() && motionEvent.getX() >= rectF.left - L && motionEvent.getX() <= rectF.right + L && motionEvent.getY() >= rectF.top - L && motionEvent.getY() <= rectF.bottom + L) {
                z10 = true;
            }
            this.f26412r0 = z10;
            if (z10 && (view = this.V) != null) {
                view.invalidate();
            }
            return this.f26412r0;
        } else if (!this.f26412r0) {
            return false;
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f26412r0 = false;
                View view2 = this.V;
                if (view2 != null) {
                    view2.invalidate();
                }
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (actionMasked == 1 && T != null) {
                    org.telegram.messenger.m5.n(null, 2131742899, cc.a0(T), 2131624066, 36);
                }
            }
            return true;
        }
    }

    public final void p0(String str) {
        if (this.V != null) {
            org.telegram.utils.twidget.w wVar = this.X;
            if ((wVar == null || wVar.f44456i <= 0) && j0() != this.f26404i0) {
                q0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int j02 = j0();
        int i10 = this.f26404i0;
        if (j02 == i10) {
            return;
        }
        String str2 = this.f26406k0;
        this.f26404i0 = j02;
        this.f26406k0 = org.telegram.utils.twidget.p.k(this.W.url, this.X, u0());
        n0(i10, "away: ".concat(str), str2, false);
        org.telegram.messenger.vv vvVar = this.f17621a;
        vvVar.Q();
        org.telegram.messenger.jj jjVar = vvVar.f18987b;
        if (jjVar != null) {
            jjVar.K1 = true;
        }
        this.f26408n0 = true;
    }

    public final void q0(String str, boolean z10) {
        boolean z11;
        int j02 = j0();
        int i10 = this.f26404i0;
        boolean z12 = false;
        if (j02 != i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        String str2 = this.f26406k0;
        this.f26404i0 = j02;
        this.f26406k0 = org.telegram.utils.twidget.p.k(this.W.url, this.X, u0());
        if (z11) {
            n0(i10, str, str2, z10);
        }
        org.telegram.messenger.vv vvVar = this.f17621a;
        if (z11) {
            vvVar.Q();
        }
        if (z11 && z10) {
            this.f26409o0 = SystemClock.uptimeMillis();
            this.f26410p0 = false;
        }
        org.telegram.messenger.jj jjVar = vvVar.f18987b;
        if (jjVar != null) {
            jjVar.K1 = true;
        }
        org.telegram.ui.Cells.q1 q1Var = vvVar.E;
        org.telegram.ui.Cells.l1 l1Var = vvVar.F;
        View view = this.V;
        if (view != null && q1Var != null && l1Var != null) {
            if (z11 && !h0() && (q1Var.getParent() instanceof RecyclerView)) {
                View view2 = (View) q1Var.getParent();
                if (q1Var.getBottom() > view2.getPaddingTop() && q1Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                    z12 = true;
                }
            }
            if (z10) {
                l1Var.l1(q1Var, z12, z12);
            } else {
                l1Var.D0(q1Var, z12, z12);
            }
        } else if (view != null) {
            view.requestLayout();
        }
    }

    public final void r0() {
        boolean z10;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.messenger.jj jjVar;
        org.telegram.utils.twidget.i0 i0Var;
        boolean z11 = true;
        this.f26400e0 = true;
        this.f26401f0 = SystemClock.uptimeMillis();
        org.telegram.utils.twidget.k0 k0Var = this.X.f44454f;
        if (k0Var != null && (i0Var = k0Var.F) != null && (i0Var.h || k0Var.f44387x)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26402g0 = z10;
        this.X.n(u0());
        org.telegram.messenger.vv vvVar = this.f17621a;
        org.telegram.ui.Cells.q1 q1Var = vvVar.E;
        if (q1Var != null) {
            p6Var = q1Var.getResourcesProvider();
        } else {
            p6Var = null;
        }
        this.Z = org.telegram.utils.twidget.l0.e(p6Var, vvVar.E());
        this.X.l(org.telegram.utils.twidget.l0.a(p6Var, vvVar.E()));
        this.f26399d0.b(this.X);
        this.f26399d0.q(true);
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.f44430a.get(this.W.url);
        if (mVar != null) {
            mVar.v = this;
        }
        org.telegram.utils.twidget.p.s(this.X);
        if (!this.f26408n0 || (jjVar = this.f17621a.f18987b) == null || !jjVar.K1) {
            z11 = false;
        }
        this.f26408n0 = false;
        if (!z11 && j0() == this.f26404i0) {
            return;
        }
        org.telegram.messenger.i0.g3(new k2.v(17, this, z11));
    }

    public final void s0() {
        if (this.f26400e0) {
            this.f26400e0 = false;
            org.telegram.messenger.i0.r(this.f26403h0);
            this.f26399d0.q(false);
            this.f26399d0.r();
            org.telegram.utils.twidget.w wVar = this.X;
            if (wVar != null) {
                org.telegram.utils.twidget.p.r(wVar);
            }
        }
    }

    public final int u0() {
        return (i0() * 2) + this.f17623c;
    }
}
