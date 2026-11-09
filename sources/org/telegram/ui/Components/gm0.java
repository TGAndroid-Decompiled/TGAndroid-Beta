package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public abstract class gm0 extends w61 implements org.telegram.ui.zz, org.telegram.messenger.ls, eh.a {
    public static final int f33991a1 = 0;
    public boolean A0;
    public final HashMap B0;
    public final ArrayList C0;
    public org.telegram.ui.ActionBar.r0 D0;
    public org.telegram.ui.ActionBar.r0 E0;
    public org.telegram.ui.ActionBar.r0 F0;
    public org.telegram.ui.ActionBar.r0 G0;
    public org.telegram.ui.ActionBar.y H0;
    public el0 I0;
    public final int J0;
    public boolean K0;
    public final org.telegram.ui.yw L0;
    public String M0;
    public org.telegram.ui.rz N0;
    public final org.telegram.ui.a00 O0;
    public int P0;
    public boolean Q0;
    public final org.telegram.ui.fv R0;
    public final tt0 S0;
    public final int T0;
    public int U0;
    public final bi.g5 V;
    public final long V0;
    public final FrameLayout W;
    public int W0;
    public int X0;
    public ab.b0 Y0;
    public dh.c Z0;
    public final bi.q1 f33992a0;
    public final tl0 f33993b0;
    public final v4.k f33994c0;
    public final zl0 f33995d0;
    public final v4.b0 f33996e0;
    public final ti0 f33997f0;
    public boolean f33998g0;
    public final FrameLayout f33999h0;
    public final tl0 f34000i0;
    public final v4.b0 f34001j0;
    public final qj0 f34002k0;
    public final bm0 f34003l0;
    public final FrameLayout m0;
    public final tl0 f34004n0;
    public final v4.b0 f34005o0;
    public final qj0 f34006p0;
    public final ul0 f34007q0;
    public final af0 f34008r0;
    public boolean f34009s0;
    public final FrameLayout f34010t0;
    public final tl0 f34011u0;
    public final v4.b0 f34012v0;
    public final qj0 f34013w0;
    public final xl0 f34014x0;
    public ImageView f34015y0;
    public dm0 f34016z0;

    public gm0(Context context, org.telegram.ui.yw ywVar, int i7, int i10, int i11, long j3, org.telegram.ui.fv fvVar) {
        super(context, null);
        int i12;
        int i13;
        int i14;
        int i15;
        this.f34009s0 = false;
        this.B0 = new HashMap();
        this.C0 = new ArrayList();
        int i16 = org.telegram.messenger.p10.f24470s0;
        this.J0 = i16;
        this.U0 = 0;
        this.T0 = i11;
        this.V0 = j3;
        this.L0 = ywVar;
        this.R0 = fvVar;
        v4.k kVar = new v4.k();
        this.f33994c0 = kVar;
        kVar.f57128c = 150L;
        kVar.f57129e = 350L;
        kVar.f57130f = 0L;
        kVar.f57131g = 0L;
        kVar.d = 0L;
        kVar.f57132i = new OvershootInterpolator(1.1f);
        kVar.f57112o = xq.h;
        org.telegram.ui.hw hwVar = (org.telegram.ui.hw) this;
        this.f33995d0 = new zl0(hwVar, context, ywVar, i7, i10, kVar, ywVar.F, ywVar, context);
        if (i10 == 15) {
            ArrayList d42 = ywVar.d4(i16, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 < d42.size(); i17 = com.google.android.recaptcha.internal.a.g(i17, 1, ((TLRPC.Dialog) d42.get(i17)).f26960id, arrayList)) {
            }
            this.f33995d0.f16756q0 = arrayList;
        }
        this.S0 = (tt0) ywVar.getFragmentView();
        bi.q1 q1Var = new bi.q1(25, context, hwVar);
        this.f33992a0 = q1Var;
        q1Var.setItemAnimator(this.f33994c0);
        q1Var.setPivotY(0.0f);
        q1Var.setClipToPadding(false);
        q1Var.setAdapter(this.f33995d0);
        q1Var.setVerticalScrollBarEnabled(true);
        q1Var.setInstantClick(true);
        if (org.telegram.messenger.id.f23157a0) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        q1Var.setVerticalScrollbarPosition(i12);
        v4.b0 b0Var = new v4.b0(1, false);
        this.f33996e0 = b0Var;
        q1Var.setLayoutManager(b0Var);
        q1Var.W1 = true;
        q1Var.X1 = 0;
        q1Var.setOnScrollListener(new vl0(hwVar, ywVar, 2));
        q1Var.D0(new pb0(hwVar, 19));
        org.telegram.ui.a00 a00Var = new org.telegram.ui.a00(this.L0);
        this.O0 = a00Var;
        org.telegram.ui.bt btVar = a00Var.f43512b;
        btVar.setClipToPadding(false);
        btVar.j(new yl0(hwVar, 1));
        btVar.D0(new pb0(hwVar, 19));
        a00Var.setUiCallback(this);
        a00Var.setVisibility(8);
        a00Var.setChatPreviewDelegate(fvVar);
        mz mzVar = new mz(context, null);
        mzVar.setViewType(1);
        tl0 tl0Var = new tl0(hwVar, context, mzVar, 2);
        this.f33993b0 = tl0Var;
        tl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var.f32768e.setVisibility(8);
        tl0Var.setVisibility(8);
        tl0Var.addView(mzVar, 0);
        tl0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(tl0Var);
        frameLayout.addView(q1Var);
        frameLayout.addView(a00Var);
        q1Var.setEmptyView(tl0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33999h0 = frameLayout2;
        am0 am0Var = new am0(hwVar);
        am0Var.f57083m = false;
        am0Var.C = false;
        xq xqVar = xq.h;
        am0Var.o(xqVar);
        am0Var.n(350L);
        qj0 qj0Var = new qj0(context, null);
        this.f34002k0 = qj0Var;
        qj0Var.setItemAnimator(am0Var);
        qj0Var.setPivotY(0.0f);
        qj0Var.setVerticalScrollBarEnabled(true);
        qj0Var.setInstantClick(true);
        if (org.telegram.messenger.id.f23157a0) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        qj0Var.setVerticalScrollbarPosition(i13);
        v4.b0 b0Var2 = new v4.b0(1, false);
        this.f34001j0 = b0Var2;
        qj0Var.setLayoutManager(b0Var2);
        qj0Var.W1 = true;
        qj0Var.X1 = 0;
        qj0Var.setClipToPadding(false);
        mz mzVar2 = new mz(context, null);
        mzVar2.setViewType(1);
        tl0 tl0Var2 = new tl0(hwVar, context, mzVar2, 3);
        this.f34000i0 = tl0Var2;
        tl0Var2.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var2.f32768e.setVisibility(8);
        tl0Var2.setVisibility(8);
        tl0Var2.addView(mzVar2, 0);
        tl0Var2.e(true, false);
        frameLayout2.addView(tl0Var2);
        frameLayout2.addView(qj0Var);
        qj0Var.setEmptyView(tl0Var2);
        bm0 bm0Var = new bm0(hwVar, qj0Var, context, this.J0, i11, ywVar);
        this.f34003l0 = bm0Var;
        qj0Var.setAdapter(bm0Var);
        qj0Var.setOnScrollListener(new vl0(hwVar, ywVar, 3));
        qj0Var.D0(new pb0(hwVar, 19));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.m0 = frameLayout3;
        sl0 sl0Var = new sl0(hwVar);
        sl0Var.f57083m = false;
        sl0Var.C = false;
        sl0Var.o(xqVar);
        sl0Var.n(350L);
        qj0 qj0Var2 = new qj0(context, null);
        this.f34006p0 = qj0Var2;
        qj0Var2.setItemAnimator(sl0Var);
        qj0Var2.setPivotY(0.0f);
        qj0Var2.setClipToPadding(false);
        qj0Var2.setVerticalScrollBarEnabled(true);
        qj0Var2.setInstantClick(true);
        if (org.telegram.messenger.id.f23157a0) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        qj0Var2.setVerticalScrollbarPosition(i14);
        v4.b0 b0Var3 = new v4.b0(1, false);
        this.f34005o0 = b0Var3;
        qj0Var2.setLayoutManager(b0Var3);
        qj0Var2.W1 = true;
        qj0Var2.X1 = 0;
        mz mzVar3 = new mz(context, null);
        mzVar3.setViewType(1);
        tl0 tl0Var3 = new tl0(hwVar, context, mzVar3, 0);
        this.f34004n0 = tl0Var3;
        tl0Var3.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var3.f32768e.setVisibility(8);
        tl0Var3.setVisibility(8);
        tl0Var3.addView(mzVar3, 0);
        tl0Var3.e(true, false);
        frameLayout3.addView(tl0Var3);
        frameLayout3.addView(qj0Var2);
        qj0Var2.setEmptyView(tl0Var3);
        ul0 ul0Var = new ul0(hwVar, qj0Var2, context, this.J0, i11);
        this.f34007q0 = ul0Var;
        qj0Var2.setAdapter(ul0Var);
        qj0Var2.setOnScrollListener(new vl0(hwVar, ywVar, 0));
        qj0Var2.D0(new pb0(hwVar, 19));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f34010t0 = frameLayout4;
        wl0 wl0Var = new wl0(hwVar);
        wl0Var.f57083m = false;
        wl0Var.C = false;
        wl0Var.o(xqVar);
        wl0Var.n(350L);
        qj0 qj0Var3 = new qj0(context, null);
        this.f34013w0 = qj0Var3;
        qj0Var3.setItemAnimator(wl0Var);
        qj0Var3.setPivotY(0.0f);
        qj0Var3.setVerticalScrollBarEnabled(true);
        qj0Var3.setInstantClick(true);
        if (org.telegram.messenger.id.f23157a0) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        qj0Var3.setVerticalScrollbarPosition(i15);
        v4.b0 b0Var4 = new v4.b0(1, false);
        this.f34012v0 = b0Var4;
        qj0Var3.setLayoutManager(b0Var4);
        qj0Var3.W1 = true;
        qj0Var3.X1 = 0;
        qj0Var3.setClipToPadding(false);
        mz mzVar4 = new mz(context, null);
        mzVar4.setViewType(1);
        tl0 tl0Var4 = new tl0(hwVar, context, mzVar4, 1);
        this.f34011u0 = tl0Var4;
        tl0Var4.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var4.f32768e.setVisibility(8);
        tl0Var4.setVisibility(8);
        tl0Var4.addView(mzVar4, 0);
        tl0Var4.e(true, false);
        frameLayout4.addView(tl0Var4);
        frameLayout4.addView(qj0Var3);
        qj0Var3.setEmptyView(tl0Var4);
        xl0 xl0Var = new xl0(hwVar, qj0Var3, context, this.J0);
        this.f34014x0 = xl0Var;
        qj0Var3.setAdapter(xl0Var);
        qj0Var3.setOnScrollListener(new vl0(hwVar, ywVar, 1));
        qj0Var3.D0(new pb0(hwVar, 19));
        this.f33997f0 = new ti0(q1Var, true);
        af0 af0Var = new af0(context, ywVar);
        this.f34008r0 = af0Var;
        r41 r41Var = af0Var.f31781c;
        r41Var.setClipToPadding(false);
        r41Var.j(new yl0(hwVar, 0));
        r41Var.D0(new pb0(hwVar, 19));
        bi.g5 g5Var = new bi.g5(hwVar);
        this.V = g5Var;
        setAdapter(g5Var);
    }

    public static org.telegram.ui.cn M(int i7, org.telegram.messenger.ij ijVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.ij.B0(ijVar.f23262k);
        if (org.telegram.messenger.m5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).f21765a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", ijVar.e1());
        return new org.telegram.ui.cn(bundle);
    }

    public static void Q(FrameLayout frameLayout, qj0 qj0Var, int i7, int i10, boolean z9) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i7, 0, i10);
        if (z9) {
            qj0Var.q1(0, i7, 0, i10);
        } else {
            qj0Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qj0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
    }

    public final void L() {
        if (this.f34009s0) {
            int i7 = 0;
            this.f34009s0 = false;
            S();
            l61 l61Var = this.M;
            if (l61Var != null && l61Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            zl0 zl0Var = this.f33995d0;
            if (zl0Var != null) {
                String str = this.M0;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.C0;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (((jg.o0) arrayList.get(i10)).d == 7) {
                        i7 = 1;
                        break;
                    } else {
                        i10++;
                    }
                }
                zl0Var.T(i7, str);
            }
        }
    }

    public final int N(int i7) {
        int i10 = 0;
        while (true) {
            bi.g5 g5Var = this.V;
            ArrayList arrayList = (ArrayList) g5Var.f3940b;
            if (i10 < ((ArrayList) g5Var.f3940b).size()) {
                if (((fm0) arrayList.get(i10)).f33710a == 3 && ((fm0) arrayList.get(i10)).f33711b == i7) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final boolean O() {
        int i7 = this.J0;
        if (!org.telegram.messenger.p10.i(i7).q() && !org.telegram.messenger.qp.s1(i7).D3()) {
            for (org.telegram.messenger.ij ijVar : this.B0.values()) {
                if (ijVar.F0() != null && ijVar.F0().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void P(View view, int i7, String str, boolean z9) {
        long j3;
        long j10;
        boolean z10;
        org.telegram.ui.a00 a00Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        tl0 tl0Var = this.f33993b0;
        boolean z16 = true;
        if (isEmpty) {
            tl0Var.f32768e.setVisibility(8);
        } else {
            tl0Var.f32768e.setVisibility(0);
            tl0Var.f32768e.setText(org.telegram.messenger.id.a0(null, null, 2131748165, str));
        }
        zl0 zl0Var = this.f33995d0;
        org.telegram.ui.jw jwVar = zl0Var.U;
        if (jwVar != null) {
            j3 = jwVar.a();
        } else {
            j3 = 0;
        }
        if (i7 == 0) {
            j10 = 0;
        } else {
            j10 = j3;
        }
        int i11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = j3;
        boolean z17 = false;
        while (true) {
            ArrayList arrayList = this.C0;
            if (i11 >= arrayList.size()) {
                break;
            }
            jg.o0 o0Var = (jg.o0) arrayList.get(i11);
            int i12 = o0Var.d;
            if (i12 == 4) {
                TLObject tLObject = o0Var.f16874f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f27105id;
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.t3.Y((TLRPC.Chat) tLObject)) {
                    i10 = i11;
                } else {
                    j11 = -((TLRPC.Chat) o0Var.f16874f).f26956id;
                }
                i10 = i11;
                j10 = j11;
            } else if (i12 == 6) {
                jg.m0 m0Var = o0Var.f16875g;
                long j15 = m0Var.f16839b;
                i10 = i11;
                j13 = m0Var.f16840c;
                j12 = j15;
            } else {
                i10 = i11;
                if (i12 == 7) {
                    z17 = true;
                }
            }
            i11 = i10 + 1;
        }
        xl0 xl0Var = this.f34014x0;
        xl0Var.getClass();
        if (v20.Y(str, null) == null) {
            L();
        }
        if (view == this.f33999h0) {
            org.telegram.messenger.qp.s1(this.J0).L0(0L);
            bm0 bm0Var = this.f34003l0;
            qj0 qj0Var = bm0Var.d;
            ArrayList arrayList2 = bm0Var.S;
            ArrayList arrayList3 = bm0Var.T;
            ArrayList arrayList4 = bm0Var.U;
            ArrayList arrayList5 = bm0Var.R;
            gp gpVar = bm0Var.f40473e0;
            bm0Var.X();
            if (!TextUtils.equals(str, bm0Var.f40472d0)) {
                bm0Var.f40472d0 = str;
                org.telegram.messenger.g0.r(gpVar);
                if (TextUtils.isEmpty(bm0Var.f40472d0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    bm0Var.O(true);
                    bm0Var.f40471c0++;
                    z15 = false;
                    bm0Var.Y = false;
                    bm0Var.Z = false;
                    bm0Var.f40469a0 = false;
                    bm0Var.f40470b0 = 0;
                    if (qj0Var != null) {
                        qj0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.g0.i3(gpVar, 1000L);
                    bm0Var.Y = true;
                    bm0Var.Z = true;
                    bm0Var.O(true);
                    if (qj0Var != null) {
                        z15 = false;
                        qj0Var.v0(0);
                    }
                }
                this.f34000i0.b(this.P0, z15);
            }
            z15 = false;
            this.f34000i0.b(this.P0, z15);
        } else if (view == this.m0) {
            ul0 ul0Var = this.f34007q0;
            qj0 qj0Var2 = ul0Var.d;
            ArrayList arrayList6 = ul0Var.V;
            rr rrVar = ul0Var.f39798h0;
            if (TextUtils.equals(str, ul0Var.f39797g0)) {
                z14 = false;
            } else {
                ul0Var.f39797g0 = str;
                org.telegram.messenger.g0.r(rrVar);
                if (TextUtils.isEmpty(ul0Var.f39797g0)) {
                    arrayList6.clear();
                    ul0Var.O(true);
                    ul0Var.f39796f0++;
                    z14 = false;
                    ul0Var.f39792b0 = false;
                    ul0Var.f39793c0 = false;
                    ul0Var.f39794d0 = false;
                    ul0Var.f39795e0 = 0;
                    if (qj0Var2 != null) {
                        qj0Var2.v0(0);
                    }
                } else {
                    z14 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.i3(rrVar, 1000L);
                    ul0Var.f39792b0 = true;
                    ul0Var.f39793c0 = true;
                    ul0Var.O(true);
                    if (qj0Var2 != null) {
                        qj0Var2.v0(0);
                    }
                }
            }
            this.f34004n0.b(this.P0, z14);
            if (TextUtils.isEmpty(str)) {
                ul0Var.W();
            }
        } else {
            af0 af0Var = this.f34008r0;
            if (view == af0Var) {
                r41 r41Var = af0Var.f31781c;
                ArrayList arrayList7 = af0Var.f31784n;
                if (!TextUtils.equals(af0Var.f31788x, str)) {
                    if (af0Var.K >= 0) {
                        ConnectionsManager.getInstance(af0Var.f31780b).cancelRequest(af0Var.K, true);
                        af0Var.K = -1;
                    }
                    af0Var.f31787w = false;
                    af0Var.H.setLoading(false);
                    af0Var.f31788x = str;
                    if (TextUtils.isEmpty(str)) {
                        af0Var.f31785r = 0;
                        af0Var.L++;
                        af0Var.f31786s = false;
                        arrayList7.clear();
                        af0Var.a(false);
                    } else {
                        af0Var.b(str);
                        af0Var.f31785r = 0;
                        af0Var.L++;
                        af0Var.f31786s = false;
                        arrayList7.clear();
                    }
                    af0Var.d();
                    r41Var.v0(0);
                    r41Var.f37556f3.O(true);
                }
            } else if (view == this.f34010t0) {
                if (v20.Y(str, null) != null) {
                    if (z9) {
                        this.f34012v0.h1(0, 0);
                    }
                    xl0Var.Z(str);
                    this.f34011u0.b(this.P0, false);
                }
            } else if (view == this.W) {
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                org.telegram.ui.a00 a00Var2 = this.O0;
                if ((i13 == 0 && this.V0 == 0 && j12 == 0 && j13 == 0) || j14 != 0) {
                    this.K0 = false;
                    zl0Var.T(z17 ? 1 : 0, str);
                    zl0Var.A0 = this.N0;
                    a00Var2.animate().setListener(null).cancel();
                    a00Var2.i(null, false);
                    if (z9) {
                        if (zl0Var.D0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tl0Var.e(!z13, false);
                        if (zl0Var.D0 <= 0) {
                            z16 = false;
                        }
                        tl0Var.e(z16, false);
                    } else if (!zl0Var.M()) {
                        if (zl0Var.D0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        tl0Var.e(z12, true);
                    }
                    if (z9) {
                        a00Var2.setVisibility(8);
                    } else if (a00Var2.getVisibility() != 8) {
                        a00Var2.animate().alpha(0.0f).setListener(new f60(this, 17)).setDuration(150L).start();
                    }
                    a00Var2.setTag(null);
                    a00Var = a00Var2;
                    z11 = false;
                } else {
                    a00Var2.setTag(1);
                    a00Var2.i(this.N0, false);
                    a00Var2.animate().setListener(null).cancel();
                    if (z9) {
                        a00Var2.setVisibility(0);
                        a00Var2.setAlpha(1.0f);
                        z10 = z9;
                    } else {
                        if (a00Var2.getVisibility() != 0) {
                            a00Var2.setVisibility(0);
                            a00Var2.setAlpha(0.0f);
                        } else {
                            z16 = z9;
                        }
                        a00Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z10 = z16;
                    }
                    a00Var = a00Var2;
                    z11 = false;
                    this.O0.h(j10, this.V0, j12, j13, null, z17, str, z10);
                    tl0Var.setVisibility(8);
                }
                tl0Var.b(this.P0, z11);
                a00Var.f43514c.b(this.P0, z11);
            } else {
                long j16 = j12;
                long j17 = j13;
                if (view instanceof org.telegram.ui.a00) {
                    org.telegram.ui.a00 a00Var3 = (org.telegram.ui.a00) view;
                    if (j14 == 0) {
                        z16 = false;
                    }
                    a00Var3.setUseFromUserAsAvatar(z16);
                    a00Var3.f43514c.b(this.P0, false);
                    a00Var3.h(j10, this.V0, j16, j17, jg.q0.j3[((fm0) ((ArrayList) this.V.f3940b).get(i7)).f33711b], z17, str, z9);
                } else if (view instanceof el0) {
                    el0 el0Var = (el0) view;
                    el0Var.f33437a.b(this.P0, false);
                    el0Var.K = str;
                    el0Var.d(false);
                }
            }
        }
    }

    public final void R(boolean z9) {
        pj0 pj0Var;
        pj0 pj0Var2;
        pj0 pj0Var3;
        int i7;
        boolean z10;
        int i10;
        int i11;
        org.telegram.ui.jw jwVar;
        int i12;
        if (this.A0 != z9) {
            org.telegram.ui.yw ywVar = this.L0;
            if (!z9 || !ywVar.getActionBar().w()) {
                if (z9 && !ywVar.getActionBar().c("search_view_pager")) {
                    this.H0 = ywVar.getActionBar().o("search_view_pager");
                    if (ywVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f34015y0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f34015y0.setImageDrawable(new org.telegram.ui.ActionBar.y1(true));
                        org.telegram.ui.ActionBar.s6.s(this.f34015y0, org.telegram.ui.ActionBar.l6.f28259y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f34015y0;
                        int i13 = org.telegram.ui.ActionBar.l6.f28277z8;
                        org.telegram.ui.ActionBar.s6.Q(imageView2, org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.x0(null, i13, false), 1, -1), null, org.telegram.ui.ActionBar.s6.M(i13), null);
                        this.f34015y0.setOnClickListener(new ma0(this, 10));
                        this.H0.addView(this.f34015y0, c8.ha.p(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.H0.getContext());
                    this.f34016z0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f34016z0.setTypeface(org.telegram.messenger.g0.o());
                    dm0 dm0Var = this.f34016z0;
                    int i14 = org.telegram.ui.ActionBar.l6.f28259y8;
                    jl0 jl0Var = new jl0(2);
                    jl0 jl0Var2 = new jl0(3);
                    int P = org.telegram.ui.ActionBar.s6.P(i14, -1, 0, 0.0f, null);
                    jl0Var2.c(P, dm0Var);
                    org.telegram.ui.ActionBar.m6 w10 = org.telegram.ui.ActionBar.s6.w(101, dm0Var);
                    w10.c(i14, -1, 0, 0.0f, null);
                    w10.f28312n = jl0Var;
                    w10.f28313o = jl0Var2;
                    w10.f28311m = false;
                    w10.f28306g = P;
                    org.telegram.ui.ActionBar.y yVar = this.H0;
                    dm0 dm0Var2 = this.f34016z0;
                    if (ywVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    yVar.addView(dm0Var2, c8.ha.m(1.0f, 0, -1, i12, 0, 0));
                    this.f34016z0.setOnTouchListener(new ei.b(21));
                    org.telegram.ui.ActionBar.r0 h = this.H0.h(203, 2131230879, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131754801, null));
                    this.D0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.s6.s(this.D0.getIconView(), i14, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.E0 = this.H0.h(200, 2131232224, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131754877, null));
                    this.F0 = this.H0.h(201, 2131232165, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131750587, null));
                    this.G0 = this.H0.h(202, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131751598, null));
                }
                if (this.f34016z0 != null) {
                    zl0 zl0Var = this.f33995d0;
                    if (zl0Var != null && (jwVar = zl0Var.U) != null && jwVar.a() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f34016z0.getLayoutParams();
                    if (ywVar.W) {
                        i10 = 18;
                    } else {
                        i10 = 72;
                    }
                    if (z10) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(i10 + i11);
                    dm0 dm0Var3 = this.f34016z0;
                    dm0Var3.setLayoutParams(dm0Var3.getLayoutParams());
                }
                if (ywVar.getActionBar().getBackButton() != null && (ywVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.r4)) {
                    org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
                    ywVar.getActionBar().setBackButtonDrawable(y1Var);
                    y1Var.setColorFilter(null);
                }
                this.A0 = z9;
                HashMap hashMap = this.B0;
                if (z9) {
                    org.telegram.messenger.g0.v1(ywVar.getParentActivity().getCurrentFocus());
                    ywVar.getActionBar().P(null, null);
                    this.f34016z0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.r0 r0Var = this.D0;
                    if (O()) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    r0Var.setVisibility(i7);
                    this.E0.setVisibility(0);
                    this.F0.setVisibility(0);
                    this.G0.setVisibility(0);
                    return;
                }
                ywVar.getActionBar().v();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.a00) && (pj0Var3 = ((org.telegram.ui.a00) getChildAt(i15)).d) != null) {
                        pj0Var3.f();
                    }
                    if (getChildAt(i15) instanceof el0) {
                        ((el0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.a00 a00Var = this.O0;
                if (a00Var != null && (pj0Var2 = a00Var.d) != null) {
                    pj0Var2.f();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.a00) && (pj0Var = ((org.telegram.ui.a00) view).d) != null) {
                        pj0Var.f();
                    }
                }
            }
        }
    }

    public final void S() {
        this.V.l();
        o(false);
        l61 l61Var = this.M;
        if (l61Var != null) {
            l61Var.f38988y.f();
        }
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8698a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.W;
                qj0 qj0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        qj0Var = this.f33992a0;
                    } else if (view == this.f33999h0) {
                        qj0Var = this.f34002k0;
                    } else if (view == this.m0) {
                        qj0Var = this.f34006p0;
                    } else if (view == this.f34010t0) {
                        qj0Var = this.f34013w0;
                    } else {
                        el0 el0Var = this.I0;
                        if (view == el0Var) {
                            qj0Var = el0Var.f33438b;
                        } else {
                            af0 af0Var = this.f34008r0;
                            if (view == af0Var) {
                                qj0Var = af0Var.f31781c;
                            } else if (view instanceof org.telegram.ui.a00) {
                                qj0Var = ((org.telegram.ui.a00) view).f43512b;
                            }
                        }
                    }
                }
                if (qj0Var != null) {
                    ih.d.a(qj0Var, canvas, rectF, qj0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.a00 a00Var = this.O0;
                    if (a00Var.getVisibility() == 0) {
                        org.telegram.ui.bt btVar = a00Var.f43512b;
                        ih.d.a(btVar, canvas, rectF, btVar, this);
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f24999f3;
        boolean z9 = false;
        bm0 bm0Var = this.f34003l0;
        if (i7 == i11) {
            if (org.telegram.messenger.qp.s1(this.J0).L0(0L) != null) {
                z9 = true;
            }
            this.f34000i0.e(z9, true);
            bm0Var.X();
            bm0Var.O(true);
        } else if (i7 != org.telegram.messenger.qs.f25112y1 && i7 != org.telegram.messenger.qs.f25070s) {
            if (i7 == org.telegram.messenger.qs.V0) {
                this.f34007q0.O(true);
            } else if (i7 == org.telegram.messenger.qs.f25109x5) {
                Object obj = objArr[0];
                xl0 xl0Var = this.f34014x0;
                if (obj == xl0Var.S) {
                    xl0Var.O(true);
                }
            }
        } else {
            bm0Var.X();
            bm0Var.O(true);
        }
    }

    @Override
    public final void e() {
        R(true);
    }

    @Override
    public final boolean f(org.telegram.ui.tz tzVar) {
        return this.B0.containsKey(tzVar);
    }

    @Override
    public final void g(org.telegram.messenger.ij ijVar) {
        this.L0.presentFragment(M(this.J0, ijVar));
        R(false);
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.H0;
    }

    public ArrayList<jg.o0> getCurrentSearchFilters() {
        return this.C0;
    }

    public el0 getDownloadsContainer() {
        return this.I0;
    }

    public int getFolderId() {
        return this.T0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.r0 getSpeedItem() {
        return this.D0;
    }

    public v61 getTabsView() {
        return this.M;
    }

    @Override
    public final void h(org.telegram.messenger.ij ijVar, View view, int i7) {
        boolean z9;
        int i10;
        int i11;
        org.telegram.ui.tz tzVar = new org.telegram.ui.tz(ijVar.e1(), org.telegram.messenger.ij.B0(ijVar.f23262k));
        HashMap hashMap = this.B0;
        if (hashMap.containsKey(tzVar)) {
            hashMap.remove(tzVar);
        } else if (hashMap.size() < 100) {
            hashMap.put(tzVar, ijVar);
        } else {
            return;
        }
        int i12 = 0;
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.f34016z0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.r0 r0Var = this.E0;
            if (r0Var != null) {
                if (hashMap.size() == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                r0Var.setVisibility(i11);
            }
            if (this.D0 != null) {
                boolean O = O();
                if (O) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if (this.D0.getVisibility() != i10) {
                    this.D0.setVisibility(i10);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.D0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.s6.x(this, animatedVectorDrawable, org.telegram.ui.ActionBar.l6.f28259y8, null, PorterDuff.Mode.SRC_IN);
                    if (O) {
                        animatedVectorDrawable.start();
                    } else {
                        animatedVectorDrawable.reset();
                    }
                }
            }
            if (this.G0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((org.telegram.messenger.ij) hashMap.get((org.telegram.ui.tz) it.next())).Q) {
                            z9 = false;
                            break;
                        }
                    } else {
                        z9 = true;
                        break;
                    }
                }
                org.telegram.ui.ActionBar.r0 r0Var2 = this.G0;
                if (!z9) {
                    i12 = 8;
                }
                r0Var2.setVisibility(i12);
            }
        }
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).b(hashMap.containsKey(tzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.p7) {
            ((org.telegram.ui.Cells.p7) view).b(i7, hashMap.containsKey(tzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).f(hashMap.containsKey(tzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).e(hashMap.containsKey(tzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view).c(hashMap.containsKey(tzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).c0(hashMap.containsKey(tzVar), true);
        }
    }

    @Override
    public final boolean i() {
        return this.A0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ab.b0 b0Var = this.Y0;
        if (b0Var != null) {
            b0Var.b();
            this.Y0 = null;
        }
        ab.b0 b0Var2 = new ab.b0(org.telegram.messenger.qs.f(this.J0), this);
        b0Var2.c(org.telegram.messenger.qs.f24999f3);
        b0Var2.c(org.telegram.messenger.qs.f25112y1);
        b0Var2.c(org.telegram.messenger.qs.f25070s);
        b0Var2.c(org.telegram.messenger.qs.V0);
        b0Var2.c(org.telegram.messenger.qs.f25109x5);
        this.Y0 = b0Var2;
        this.f33998g0 = true;
        bm0 bm0Var = this.f34003l0;
        if (bm0Var != null) {
            bm0Var.O(false);
        }
        ul0 ul0Var = this.f34007q0;
        if (ul0Var != null) {
            ul0Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33998g0 = false;
        ab.b0 b0Var = this.Y0;
        if (b0Var != null) {
            b0Var.b();
            this.Y0 = null;
        }
    }

    @Override
    public final void s() {
        this.S0.L();
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        this.Z0 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.rz rzVar) {
        this.N0 = rzVar;
    }

    public void setKeyboardHeight(int i7) {
        boolean z9;
        this.P0 = i7;
        if (getVisibility() == 0 && getAlpha() > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof org.telegram.ui.a00) {
                ((org.telegram.ui.a00) getChildAt(i10)).f43514c.b(i7, z9);
            } else if (getChildAt(i10) == this.W) {
                this.f33993b0.b(i7, z9);
                this.O0.f43514c.b(i7, z9);
            } else if (getChildAt(i10) instanceof el0) {
                ((el0) getChildAt(i10)).f33437a.b(i7, z9);
            } else if (getChildAt(i10) == this.f33999h0) {
                this.f34000i0.b(i7, z9);
            }
        }
    }

    @Override
    public void setPosition(int i7) {
        if (i7 < 0) {
            return;
        }
        super.setPosition(i7);
        this.h.clear();
        l61 l61Var = this.M;
        if (l61Var != null) {
            l61Var.f(1.0f, i7);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i7, int i10) {
        boolean z9;
        zl0 zl0Var = this.f33995d0;
        org.telegram.ui.a00 a00Var = this.O0;
        if (i7 == 0) {
            if (a00Var.getVisibility() == 0) {
                a00Var.i(this.N0, false);
                zl0Var.A0 = null;
            } else {
                a00Var.i(null, false);
                org.telegram.ui.rz rzVar = this.N0;
                zl0Var.A0 = rzVar;
                if (rzVar != null) {
                    ((org.telegram.ui.hu) rzVar).j(false, null, zl0Var.f16769y0, zl0Var.f16770z0);
                }
            }
        } else if (view instanceof org.telegram.ui.a00) {
            if (i10 == 0 && a00Var.getVisibility() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ((org.telegram.ui.a00) view).i(this.N0, z9);
        }
        if (view2 instanceof org.telegram.ui.a00) {
            ((org.telegram.ui.a00) view2).i(null, false);
            return;
        }
        zl0Var.A0 = null;
        a00Var.i(null, false);
    }
}
