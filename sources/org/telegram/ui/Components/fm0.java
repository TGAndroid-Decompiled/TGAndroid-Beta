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
public abstract class fm0 extends u61 implements org.telegram.ui.xz, org.telegram.messenger.ls, eh.a {
    public static final int f33577a1 = 0;
    public boolean A0;
    public final HashMap B0;
    public final ArrayList C0;
    public org.telegram.ui.ActionBar.r0 D0;
    public org.telegram.ui.ActionBar.r0 E0;
    public org.telegram.ui.ActionBar.r0 F0;
    public org.telegram.ui.ActionBar.r0 G0;
    public org.telegram.ui.ActionBar.y H0;
    public dl0 I0;
    public final int J0;
    public boolean K0;
    public final org.telegram.ui.ww L0;
    public String M0;
    public org.telegram.ui.pz N0;
    public final org.telegram.ui.yz O0;
    public int P0;
    public boolean Q0;
    public final org.telegram.ui.dv R0;
    public final rt0 S0;
    public final int T0;
    public int U0;
    public final bi.g5 V;
    public final long V0;
    public final FrameLayout W;
    public int W0;
    public int X0;
    public ab.b0 Y0;
    public dh.c Z0;
    public final bi.q1 f33578a0;
    public final sl0 f33579b0;
    public final v4.k f33580c0;
    public final yl0 f33581d0;
    public final v4.b0 f33582e0;
    public final si0 f33583f0;
    public boolean f33584g0;
    public final FrameLayout f33585h0;
    public final sl0 f33586i0;
    public final v4.b0 f33587j0;
    public final pj0 f33588k0;
    public final am0 f33589l0;
    public final FrameLayout m0;
    public final sl0 f33590n0;
    public final v4.b0 f33591o0;
    public final pj0 f33592p0;
    public final tl0 f33593q0;
    public final ze0 f33594r0;
    public boolean f33595s0;
    public final FrameLayout f33596t0;
    public final sl0 f33597u0;
    public final v4.b0 f33598v0;
    public final pj0 f33599w0;
    public final wl0 f33600x0;
    public ImageView f33601y0;
    public cm0 f33602z0;

    public fm0(Context context, org.telegram.ui.ww wwVar, int i7, int i10, int i11, long j3, org.telegram.ui.dv dvVar) {
        super(context, null);
        int i12;
        int i13;
        int i14;
        int i15;
        this.f33595s0 = false;
        this.B0 = new HashMap();
        this.C0 = new ArrayList();
        int i16 = org.telegram.messenger.p10.f24459s0;
        this.J0 = i16;
        this.U0 = 0;
        this.T0 = i11;
        this.V0 = j3;
        this.L0 = wwVar;
        this.R0 = dvVar;
        v4.k kVar = new v4.k();
        this.f33580c0 = kVar;
        kVar.f57024c = 150L;
        kVar.f57025e = 350L;
        kVar.f57026f = 0L;
        kVar.f57027g = 0L;
        kVar.d = 0L;
        kVar.f57028i = new OvershootInterpolator(1.1f);
        kVar.f57008o = xq.h;
        org.telegram.ui.fw fwVar = (org.telegram.ui.fw) this;
        this.f33581d0 = new yl0(fwVar, context, wwVar, i7, i10, kVar, wwVar.F, wwVar, context);
        if (i10 == 15) {
            ArrayList d42 = wwVar.d4(i16, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 < d42.size(); i17 = com.google.android.recaptcha.internal.a.g(i17, 1, ((TLRPC.Dialog) d42.get(i17)).f26956id, arrayList)) {
            }
            this.f33581d0.f16753q0 = arrayList;
        }
        this.S0 = (rt0) wwVar.getFragmentView();
        bi.q1 q1Var = new bi.q1(25, context, fwVar);
        this.f33578a0 = q1Var;
        q1Var.setItemAnimator(this.f33580c0);
        q1Var.setPivotY(0.0f);
        q1Var.setClipToPadding(false);
        q1Var.setAdapter(this.f33581d0);
        q1Var.setVerticalScrollBarEnabled(true);
        q1Var.setInstantClick(true);
        if (org.telegram.messenger.hd.f22871a0) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        q1Var.setVerticalScrollbarPosition(i12);
        v4.b0 b0Var = new v4.b0(1, false);
        this.f33582e0 = b0Var;
        q1Var.setLayoutManager(b0Var);
        q1Var.W1 = true;
        q1Var.X1 = 0;
        q1Var.setOnScrollListener(new ul0(fwVar, wwVar, 2));
        q1Var.D0(new ob0(fwVar, 19));
        org.telegram.ui.yz yzVar = new org.telegram.ui.yz(this.L0);
        this.O0 = yzVar;
        org.telegram.ui.zs zsVar = yzVar.f52382b;
        zsVar.setClipToPadding(false);
        zsVar.j(new xl0(fwVar, 1));
        zsVar.D0(new ob0(fwVar, 19));
        yzVar.setUiCallback(this);
        yzVar.setVisibility(8);
        yzVar.setChatPreviewDelegate(dvVar);
        lz lzVar = new lz(context, null);
        lzVar.setViewType(1);
        sl0 sl0Var = new sl0(fwVar, context, lzVar, 2);
        this.f33579b0 = sl0Var;
        sl0Var.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var.f31929e.setVisibility(8);
        sl0Var.setVisibility(8);
        sl0Var.addView(lzVar, 0);
        sl0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(sl0Var);
        frameLayout.addView(q1Var);
        frameLayout.addView(yzVar);
        q1Var.setEmptyView(sl0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33585h0 = frameLayout2;
        zl0 zl0Var = new zl0(fwVar);
        zl0Var.f56979m = false;
        zl0Var.C = false;
        xq xqVar = xq.h;
        zl0Var.o(xqVar);
        zl0Var.n(350L);
        pj0 pj0Var = new pj0(context, null);
        this.f33588k0 = pj0Var;
        pj0Var.setItemAnimator(zl0Var);
        pj0Var.setPivotY(0.0f);
        pj0Var.setVerticalScrollBarEnabled(true);
        pj0Var.setInstantClick(true);
        if (org.telegram.messenger.hd.f22871a0) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        pj0Var.setVerticalScrollbarPosition(i13);
        v4.b0 b0Var2 = new v4.b0(1, false);
        this.f33587j0 = b0Var2;
        pj0Var.setLayoutManager(b0Var2);
        pj0Var.W1 = true;
        pj0Var.X1 = 0;
        pj0Var.setClipToPadding(false);
        lz lzVar2 = new lz(context, null);
        lzVar2.setViewType(1);
        sl0 sl0Var2 = new sl0(fwVar, context, lzVar2, 3);
        this.f33586i0 = sl0Var2;
        sl0Var2.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var2.f31929e.setVisibility(8);
        sl0Var2.setVisibility(8);
        sl0Var2.addView(lzVar2, 0);
        sl0Var2.e(true, false);
        frameLayout2.addView(sl0Var2);
        frameLayout2.addView(pj0Var);
        pj0Var.setEmptyView(sl0Var2);
        am0 am0Var = new am0(fwVar, pj0Var, context, this.J0, i11, wwVar);
        this.f33589l0 = am0Var;
        pj0Var.setAdapter(am0Var);
        pj0Var.setOnScrollListener(new ul0(fwVar, wwVar, 3));
        pj0Var.D0(new ob0(fwVar, 19));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.m0 = frameLayout3;
        rl0 rl0Var = new rl0(fwVar);
        rl0Var.f56979m = false;
        rl0Var.C = false;
        rl0Var.o(xqVar);
        rl0Var.n(350L);
        pj0 pj0Var2 = new pj0(context, null);
        this.f33592p0 = pj0Var2;
        pj0Var2.setItemAnimator(rl0Var);
        pj0Var2.setPivotY(0.0f);
        pj0Var2.setClipToPadding(false);
        pj0Var2.setVerticalScrollBarEnabled(true);
        pj0Var2.setInstantClick(true);
        if (org.telegram.messenger.hd.f22871a0) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        pj0Var2.setVerticalScrollbarPosition(i14);
        v4.b0 b0Var3 = new v4.b0(1, false);
        this.f33591o0 = b0Var3;
        pj0Var2.setLayoutManager(b0Var3);
        pj0Var2.W1 = true;
        pj0Var2.X1 = 0;
        lz lzVar3 = new lz(context, null);
        lzVar3.setViewType(1);
        sl0 sl0Var3 = new sl0(fwVar, context, lzVar3, 0);
        this.f33590n0 = sl0Var3;
        sl0Var3.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var3.f31929e.setVisibility(8);
        sl0Var3.setVisibility(8);
        sl0Var3.addView(lzVar3, 0);
        sl0Var3.e(true, false);
        frameLayout3.addView(sl0Var3);
        frameLayout3.addView(pj0Var2);
        pj0Var2.setEmptyView(sl0Var3);
        tl0 tl0Var = new tl0(fwVar, pj0Var2, context, this.J0, i11);
        this.f33593q0 = tl0Var;
        pj0Var2.setAdapter(tl0Var);
        pj0Var2.setOnScrollListener(new ul0(fwVar, wwVar, 0));
        pj0Var2.D0(new ob0(fwVar, 19));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f33596t0 = frameLayout4;
        vl0 vl0Var = new vl0(fwVar);
        vl0Var.f56979m = false;
        vl0Var.C = false;
        vl0Var.o(xqVar);
        vl0Var.n(350L);
        pj0 pj0Var3 = new pj0(context, null);
        this.f33599w0 = pj0Var3;
        pj0Var3.setItemAnimator(vl0Var);
        pj0Var3.setPivotY(0.0f);
        pj0Var3.setVerticalScrollBarEnabled(true);
        pj0Var3.setInstantClick(true);
        if (org.telegram.messenger.hd.f22871a0) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        pj0Var3.setVerticalScrollbarPosition(i15);
        v4.b0 b0Var4 = new v4.b0(1, false);
        this.f33598v0 = b0Var4;
        pj0Var3.setLayoutManager(b0Var4);
        pj0Var3.W1 = true;
        pj0Var3.X1 = 0;
        pj0Var3.setClipToPadding(false);
        lz lzVar4 = new lz(context, null);
        lzVar4.setViewType(1);
        sl0 sl0Var4 = new sl0(fwVar, context, lzVar4, 1);
        this.f33597u0 = sl0Var4;
        sl0Var4.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var4.f31929e.setVisibility(8);
        sl0Var4.setVisibility(8);
        sl0Var4.addView(lzVar4, 0);
        sl0Var4.e(true, false);
        frameLayout4.addView(sl0Var4);
        frameLayout4.addView(pj0Var3);
        pj0Var3.setEmptyView(sl0Var4);
        wl0 wl0Var = new wl0(fwVar, pj0Var3, context, this.J0);
        this.f33600x0 = wl0Var;
        pj0Var3.setAdapter(wl0Var);
        pj0Var3.setOnScrollListener(new ul0(fwVar, wwVar, 1));
        pj0Var3.D0(new ob0(fwVar, 19));
        this.f33583f0 = new si0(q1Var, true);
        ze0 ze0Var = new ze0(context, wwVar);
        this.f33594r0 = ze0Var;
        p41 p41Var = ze0Var.f40925c;
        p41Var.setClipToPadding(false);
        p41Var.j(new xl0(fwVar, 0));
        p41Var.D0(new ob0(fwVar, 19));
        bi.g5 g5Var = new bi.g5(fwVar);
        this.V = g5Var;
        setAdapter(g5Var);
    }

    public static org.telegram.ui.an M(int i7, org.telegram.messenger.ij ijVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.ij.B0(ijVar.f23237k);
        if (org.telegram.messenger.m5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).f21723a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", ijVar.f1());
        return new org.telegram.ui.an(bundle);
    }

    public static void Q(FrameLayout frameLayout, pj0 pj0Var, int i7, int i10, boolean z9) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i7, 0, i10);
        if (z9) {
            pj0Var.q1(0, i7, 0, i10);
        } else {
            pj0Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pj0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
    }

    public final void L() {
        if (this.f33595s0) {
            int i7 = 0;
            this.f33595s0 = false;
            S();
            j61 j61Var = this.M;
            if (j61Var != null && j61Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            yl0 yl0Var = this.f33581d0;
            if (yl0Var != null) {
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
                yl0Var.T(i7, str);
            }
        }
    }

    public final int N(int i7) {
        int i10 = 0;
        while (true) {
            bi.g5 g5Var = this.V;
            ArrayList arrayList = (ArrayList) g5Var.f3940b;
            if (i10 < ((ArrayList) g5Var.f3940b).size()) {
                if (((em0) arrayList.get(i10)).f33282a == 3 && ((em0) arrayList.get(i10)).f33283b == i7) {
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
        org.telegram.ui.yz yzVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        sl0 sl0Var = this.f33579b0;
        boolean z16 = true;
        if (isEmpty) {
            sl0Var.f31929e.setVisibility(8);
        } else {
            sl0Var.f31929e.setVisibility(0);
            sl0Var.f31929e.setText(org.telegram.messenger.hd.a0(null, null, 2131748164, str));
        }
        yl0 yl0Var = this.f33581d0;
        org.telegram.ui.hw hwVar = yl0Var.U;
        if (hwVar != null) {
            j3 = hwVar.a();
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
                TLObject tLObject = o0Var.f16871f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f27101id;
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.t3.Y((TLRPC.Chat) tLObject)) {
                    i10 = i11;
                } else {
                    j11 = -((TLRPC.Chat) o0Var.f16871f).f26952id;
                }
                i10 = i11;
                j10 = j11;
            } else if (i12 == 6) {
                jg.m0 m0Var = o0Var.f16872g;
                long j15 = m0Var.f16836b;
                i10 = i11;
                j13 = m0Var.f16837c;
                j12 = j15;
            } else {
                i10 = i11;
                if (i12 == 7) {
                    z17 = true;
                }
            }
            i11 = i10 + 1;
        }
        wl0 wl0Var = this.f33600x0;
        wl0Var.getClass();
        if (u20.Y(str, null) == null) {
            L();
        }
        if (view == this.f33585h0) {
            org.telegram.messenger.qp.s1(this.J0).L0(0L);
            am0 am0Var = this.f33589l0;
            pj0 pj0Var = am0Var.d;
            ArrayList arrayList2 = am0Var.S;
            ArrayList arrayList3 = am0Var.T;
            ArrayList arrayList4 = am0Var.U;
            ArrayList arrayList5 = am0Var.R;
            gp gpVar = am0Var.f40345e0;
            am0Var.X();
            if (!TextUtils.equals(str, am0Var.f40344d0)) {
                am0Var.f40344d0 = str;
                org.telegram.messenger.g0.r(gpVar);
                if (TextUtils.isEmpty(am0Var.f40344d0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    am0Var.O(true);
                    am0Var.f40343c0++;
                    z15 = false;
                    am0Var.Y = false;
                    am0Var.Z = false;
                    am0Var.f40341a0 = false;
                    am0Var.f40342b0 = 0;
                    if (pj0Var != null) {
                        pj0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.g0.i3(gpVar, 1000L);
                    am0Var.Y = true;
                    am0Var.Z = true;
                    am0Var.O(true);
                    if (pj0Var != null) {
                        z15 = false;
                        pj0Var.v0(0);
                    }
                }
                this.f33586i0.b(this.P0, z15);
            }
            z15 = false;
            this.f33586i0.b(this.P0, z15);
        } else if (view == this.m0) {
            tl0 tl0Var = this.f33593q0;
            pj0 pj0Var2 = tl0Var.d;
            ArrayList arrayList6 = tl0Var.V;
            rr rrVar = tl0Var.f39656h0;
            if (TextUtils.equals(str, tl0Var.f39655g0)) {
                z14 = false;
            } else {
                tl0Var.f39655g0 = str;
                org.telegram.messenger.g0.r(rrVar);
                if (TextUtils.isEmpty(tl0Var.f39655g0)) {
                    arrayList6.clear();
                    tl0Var.O(true);
                    tl0Var.f39654f0++;
                    z14 = false;
                    tl0Var.f39650b0 = false;
                    tl0Var.f39651c0 = false;
                    tl0Var.f39652d0 = false;
                    tl0Var.f39653e0 = 0;
                    if (pj0Var2 != null) {
                        pj0Var2.v0(0);
                    }
                } else {
                    z14 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.i3(rrVar, 1000L);
                    tl0Var.f39650b0 = true;
                    tl0Var.f39651c0 = true;
                    tl0Var.O(true);
                    if (pj0Var2 != null) {
                        pj0Var2.v0(0);
                    }
                }
            }
            this.f33590n0.b(this.P0, z14);
            if (TextUtils.isEmpty(str)) {
                tl0Var.W();
            }
        } else {
            ze0 ze0Var = this.f33594r0;
            if (view == ze0Var) {
                p41 p41Var = ze0Var.f40925c;
                ArrayList arrayList7 = ze0Var.f40928n;
                if (!TextUtils.equals(ze0Var.f40932x, str)) {
                    if (ze0Var.K >= 0) {
                        ConnectionsManager.getInstance(ze0Var.f40924b).cancelRequest(ze0Var.K, true);
                        ze0Var.K = -1;
                    }
                    ze0Var.f40931w = false;
                    ze0Var.H.setLoading(false);
                    ze0Var.f40932x = str;
                    if (TextUtils.isEmpty(str)) {
                        ze0Var.f40929r = 0;
                        ze0Var.L++;
                        ze0Var.f40930s = false;
                        arrayList7.clear();
                        ze0Var.a(false);
                    } else {
                        ze0Var.b(str);
                        ze0Var.f40929r = 0;
                        ze0Var.L++;
                        ze0Var.f40930s = false;
                        arrayList7.clear();
                    }
                    ze0Var.d();
                    p41Var.v0(0);
                    p41Var.f36781f3.O(true);
                }
            } else if (view == this.f33596t0) {
                if (u20.Y(str, null) != null) {
                    if (z9) {
                        this.f33598v0.h1(0, 0);
                    }
                    wl0Var.Z(str);
                    this.f33597u0.b(this.P0, false);
                }
            } else if (view == this.W) {
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                org.telegram.ui.yz yzVar2 = this.O0;
                if ((i13 == 0 && this.V0 == 0 && j12 == 0 && j13 == 0) || j14 != 0) {
                    this.K0 = false;
                    yl0Var.T(z17 ? 1 : 0, str);
                    yl0Var.A0 = this.N0;
                    yzVar2.animate().setListener(null).cancel();
                    yzVar2.i(null, false);
                    if (z9) {
                        if (yl0Var.D0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        sl0Var.e(!z13, false);
                        if (yl0Var.D0 <= 0) {
                            z16 = false;
                        }
                        sl0Var.e(z16, false);
                    } else if (!yl0Var.M()) {
                        if (yl0Var.D0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        sl0Var.e(z12, true);
                    }
                    if (z9) {
                        yzVar2.setVisibility(8);
                    } else if (yzVar2.getVisibility() != 8) {
                        yzVar2.animate().alpha(0.0f).setListener(new e60(this, 17)).setDuration(150L).start();
                    }
                    yzVar2.setTag(null);
                    yzVar = yzVar2;
                    z11 = false;
                } else {
                    yzVar2.setTag(1);
                    yzVar2.i(this.N0, false);
                    yzVar2.animate().setListener(null).cancel();
                    if (z9) {
                        yzVar2.setVisibility(0);
                        yzVar2.setAlpha(1.0f);
                        z10 = z9;
                    } else {
                        if (yzVar2.getVisibility() != 0) {
                            yzVar2.setVisibility(0);
                            yzVar2.setAlpha(0.0f);
                        } else {
                            z16 = z9;
                        }
                        yzVar2.animate().alpha(1.0f).setDuration(150L).start();
                        z10 = z16;
                    }
                    yzVar = yzVar2;
                    z11 = false;
                    this.O0.h(j10, this.V0, j12, j13, null, z17, str, z10);
                    sl0Var.setVisibility(8);
                }
                sl0Var.b(this.P0, z11);
                yzVar.f52384c.b(this.P0, z11);
            } else {
                long j16 = j12;
                long j17 = j13;
                if (view instanceof org.telegram.ui.yz) {
                    org.telegram.ui.yz yzVar3 = (org.telegram.ui.yz) view;
                    if (j14 == 0) {
                        z16 = false;
                    }
                    yzVar3.setUseFromUserAsAvatar(z16);
                    yzVar3.f52384c.b(this.P0, false);
                    yzVar3.h(j10, this.V0, j16, j17, jg.q0.j3[((em0) ((ArrayList) this.V.f3940b).get(i7)).f33283b], z17, str, z9);
                } else if (view instanceof dl0) {
                    dl0 dl0Var = (dl0) view;
                    dl0Var.f32998a.b(this.P0, false);
                    dl0Var.K = str;
                    dl0Var.d(false);
                }
            }
        }
    }

    public final void R(boolean z9) {
        oj0 oj0Var;
        oj0 oj0Var2;
        oj0 oj0Var3;
        int i7;
        boolean z10;
        int i10;
        int i11;
        org.telegram.ui.hw hwVar;
        int i12;
        if (this.A0 != z9) {
            org.telegram.ui.ww wwVar = this.L0;
            if (!z9 || !wwVar.getActionBar().v()) {
                if (z9 && !wwVar.getActionBar().e("search_view_pager")) {
                    this.H0 = wwVar.getActionBar().n("search_view_pager");
                    if (wwVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f33601y0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f33601y0.setImageDrawable(new org.telegram.ui.ActionBar.y1(true));
                        org.telegram.ui.ActionBar.r6.t(this.f33601y0, org.telegram.ui.ActionBar.k6.f28242y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f33601y0;
                        int i13 = org.telegram.ui.ActionBar.k6.f28260z8;
                        org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i13), null);
                        this.f33601y0.setOnClickListener(new la0(this, 10));
                        this.H0.addView(this.f33601y0, c8.ha.p(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.H0.getContext());
                    this.f33602z0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f33602z0.setTypeface(org.telegram.messenger.g0.o());
                    cm0 cm0Var = this.f33602z0;
                    int i14 = org.telegram.ui.ActionBar.k6.f28242y8;
                    il0 il0Var = new il0(2);
                    il0 il0Var2 = new il0(3);
                    int Q = org.telegram.ui.ActionBar.r6.Q(i14, -1, 0, 0.0f, null);
                    il0Var2.c(Q, cm0Var);
                    org.telegram.ui.ActionBar.l6 x10 = org.telegram.ui.ActionBar.r6.x(101, cm0Var);
                    x10.c(i14, -1, 0, 0.0f, null);
                    x10.f28291n = il0Var;
                    x10.f28292o = il0Var2;
                    x10.f28290m = false;
                    x10.f28285g = Q;
                    org.telegram.ui.ActionBar.y yVar = this.H0;
                    cm0 cm0Var2 = this.f33602z0;
                    if (wwVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    yVar.addView(cm0Var2, c8.ha.m(1.0f, 0, -1, i12, 0, 0));
                    this.f33602z0.setOnTouchListener(new ei.b(21));
                    org.telegram.ui.ActionBar.r0 h = this.H0.h(203, 2131230879, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131754801, null));
                    this.D0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.r6.t(this.D0.getIconView(), i14, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.E0 = this.H0.h(200, 2131232224, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131754877, null));
                    this.F0 = this.H0.h(201, 2131232165, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131750588, null));
                    this.G0 = this.H0.h(202, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131751599, null));
                }
                if (this.f33602z0 != null) {
                    yl0 yl0Var = this.f33581d0;
                    if (yl0Var != null && (hwVar = yl0Var.U) != null && hwVar.a() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f33602z0.getLayoutParams();
                    if (wwVar.W) {
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
                    cm0 cm0Var3 = this.f33602z0;
                    cm0Var3.setLayoutParams(cm0Var3.getLayoutParams());
                }
                if (wwVar.getActionBar().getBackButton() != null && (wwVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.r4)) {
                    org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
                    wwVar.getActionBar().setBackButtonDrawable(y1Var);
                    y1Var.setColorFilter(null);
                }
                this.A0 = z9;
                HashMap hashMap = this.B0;
                if (z9) {
                    org.telegram.messenger.g0.v1(wwVar.getParentActivity().getCurrentFocus());
                    wwVar.getActionBar().O(null, null);
                    this.f33602z0.a(hashMap.size(), false);
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
                wwVar.getActionBar().u();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.yz) && (oj0Var3 = ((org.telegram.ui.yz) getChildAt(i15)).d) != null) {
                        oj0Var3.f();
                    }
                    if (getChildAt(i15) instanceof dl0) {
                        ((dl0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.yz yzVar = this.O0;
                if (yzVar != null && (oj0Var2 = yzVar.d) != null) {
                    oj0Var2.f();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.yz) && (oj0Var = ((org.telegram.ui.yz) view).d) != null) {
                        oj0Var.f();
                    }
                }
            }
        }
    }

    public final void S() {
        this.V.l();
        o(false);
        j61 j61Var = this.M;
        if (j61Var != null) {
            j61Var.f38269y.f();
        }
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8700a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.W;
                pj0 pj0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        pj0Var = this.f33578a0;
                    } else if (view == this.f33585h0) {
                        pj0Var = this.f33588k0;
                    } else if (view == this.m0) {
                        pj0Var = this.f33592p0;
                    } else if (view == this.f33596t0) {
                        pj0Var = this.f33599w0;
                    } else {
                        dl0 dl0Var = this.I0;
                        if (view == dl0Var) {
                            pj0Var = dl0Var.f32999b;
                        } else {
                            ze0 ze0Var = this.f33594r0;
                            if (view == ze0Var) {
                                pj0Var = ze0Var.f40925c;
                            } else if (view instanceof org.telegram.ui.yz) {
                                pj0Var = ((org.telegram.ui.yz) view).f52382b;
                            }
                        }
                    }
                }
                if (pj0Var != null) {
                    ih.d.a(pj0Var, canvas, rectF, pj0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.yz yzVar = this.O0;
                    if (yzVar.getVisibility() == 0) {
                        org.telegram.ui.zs zsVar = yzVar.f52382b;
                        ih.d.a(zsVar, canvas, rectF, zsVar, this);
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f24982f3;
        boolean z9 = false;
        am0 am0Var = this.f33589l0;
        if (i7 == i11) {
            if (org.telegram.messenger.qp.s1(this.J0).L0(0L) != null) {
                z9 = true;
            }
            this.f33586i0.e(z9, true);
            am0Var.X();
            am0Var.O(true);
        } else if (i7 != org.telegram.messenger.qs.f25095y1 && i7 != org.telegram.messenger.qs.f25053s) {
            if (i7 == org.telegram.messenger.qs.V0) {
                this.f33593q0.O(true);
            } else if (i7 == org.telegram.messenger.qs.f25092x5) {
                Object obj = objArr[0];
                wl0 wl0Var = this.f33600x0;
                if (obj == wl0Var.S) {
                    wl0Var.O(true);
                }
            }
        } else {
            am0Var.X();
            am0Var.O(true);
        }
    }

    @Override
    public final void e() {
        R(true);
    }

    @Override
    public final boolean f(org.telegram.ui.rz rzVar) {
        return this.B0.containsKey(rzVar);
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

    public dl0 getDownloadsContainer() {
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

    public t61 getTabsView() {
        return this.M;
    }

    @Override
    public final void h(org.telegram.messenger.ij ijVar, View view, int i7) {
        boolean z9;
        int i10;
        int i11;
        org.telegram.ui.rz rzVar = new org.telegram.ui.rz(ijVar.f1(), org.telegram.messenger.ij.B0(ijVar.f23237k));
        HashMap hashMap = this.B0;
        if (hashMap.containsKey(rzVar)) {
            hashMap.remove(rzVar);
        } else if (hashMap.size() < 100) {
            hashMap.put(rzVar, ijVar);
        } else {
            return;
        }
        int i12 = 0;
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.f33602z0.a(hashMap.size(), true);
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
                    org.telegram.ui.ActionBar.r6.y(this, animatedVectorDrawable, org.telegram.ui.ActionBar.k6.f28242y8, null, PorterDuff.Mode.SRC_IN);
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
                        if (!((org.telegram.messenger.ij) hashMap.get((org.telegram.ui.rz) it.next())).Q) {
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
            ((org.telegram.ui.Cells.h7) view).b(hashMap.containsKey(rzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.p7) {
            ((org.telegram.ui.Cells.p7) view).b(i7, hashMap.containsKey(rzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).f(hashMap.containsKey(rzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).e(hashMap.containsKey(rzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view).c(hashMap.containsKey(rzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).c0(hashMap.containsKey(rzVar), true);
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
        b0Var2.c(org.telegram.messenger.qs.f24982f3);
        b0Var2.c(org.telegram.messenger.qs.f25095y1);
        b0Var2.c(org.telegram.messenger.qs.f25053s);
        b0Var2.c(org.telegram.messenger.qs.V0);
        b0Var2.c(org.telegram.messenger.qs.f25092x5);
        this.Y0 = b0Var2;
        this.f33584g0 = true;
        am0 am0Var = this.f33589l0;
        if (am0Var != null) {
            am0Var.O(false);
        }
        tl0 tl0Var = this.f33593q0;
        if (tl0Var != null) {
            tl0Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33584g0 = false;
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

    public void setFilteredSearchViewDelegate(org.telegram.ui.pz pzVar) {
        this.N0 = pzVar;
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
            if (getChildAt(i10) instanceof org.telegram.ui.yz) {
                ((org.telegram.ui.yz) getChildAt(i10)).f52384c.b(i7, z9);
            } else if (getChildAt(i10) == this.W) {
                this.f33579b0.b(i7, z9);
                this.O0.f52384c.b(i7, z9);
            } else if (getChildAt(i10) instanceof dl0) {
                ((dl0) getChildAt(i10)).f32998a.b(i7, z9);
            } else if (getChildAt(i10) == this.f33585h0) {
                this.f33586i0.b(i7, z9);
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
        j61 j61Var = this.M;
        if (j61Var != null) {
            j61Var.f(1.0f, i7);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i7, int i10) {
        boolean z9;
        yl0 yl0Var = this.f33581d0;
        org.telegram.ui.yz yzVar = this.O0;
        if (i7 == 0) {
            if (yzVar.getVisibility() == 0) {
                yzVar.i(this.N0, false);
                yl0Var.A0 = null;
            } else {
                yzVar.i(null, false);
                org.telegram.ui.pz pzVar = this.N0;
                yl0Var.A0 = pzVar;
                if (pzVar != null) {
                    ((org.telegram.ui.fu) pzVar).j(false, null, yl0Var.f16766y0, yl0Var.f16767z0);
                }
            }
        } else if (view instanceof org.telegram.ui.yz) {
            if (i10 == 0 && yzVar.getVisibility() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ((org.telegram.ui.yz) view).i(this.N0, z9);
        }
        if (view2 instanceof org.telegram.ui.yz) {
            ((org.telegram.ui.yz) view2).i(null, false);
            return;
        }
        yl0Var.A0 = null;
        yzVar.i(null, false);
    }
}
