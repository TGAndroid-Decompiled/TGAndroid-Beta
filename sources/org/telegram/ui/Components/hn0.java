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
public abstract class hn0 extends x71 implements org.telegram.ui.x00, org.telegram.messenger.vs, ug.a {
    public static final int f26868a1 = 0;
    public boolean A0;
    public final HashMap B0;
    public final ArrayList C0;
    public org.telegram.ui.ActionBar.t0 D0;
    public org.telegram.ui.ActionBar.t0 E0;
    public org.telegram.ui.ActionBar.t0 F0;
    public org.telegram.ui.ActionBar.t0 G0;
    public org.telegram.ui.ActionBar.y H0;
    public hm0 I0;
    public final int J0;
    public boolean K0;
    public final org.telegram.ui.zx L0;
    public String M0;
    public org.telegram.ui.p00 N0;
    public final org.telegram.ui.y00 O0;
    public int P0;
    public boolean Q0;
    public final org.telegram.ui.hw R0;
    public final vu0 S0;
    public final int T0;
    public int U0;
    public final mg.s V;
    public final long V0;
    public final FrameLayout W;
    public int W0;
    public int X0;
    public xa.n Y0;
    public tg.b Z0;
    public final ag.b1 f26869a0;
    public final um0 f26870b0;
    public final s4.j f26871c0;
    public final an0 f26872d0;
    public final s4.a0 f26873e0;
    public final xj0 f26874f0;
    public boolean f26875g0;
    public final FrameLayout f26876h0;
    public final um0 f26877i0;
    public final s4.a0 f26878j0;
    public final uk0 f26879k0;
    public final cn0 f26880l0;
    public final FrameLayout m0;
    public final um0 f26881n0;
    public final s4.a0 f26882o0;
    public final uk0 f26883p0;
    public final vm0 f26884q0;
    public final cg0 f26885r0;
    public boolean f26886s0;
    public final FrameLayout f26887t0;
    public final um0 f26888u0;
    public final s4.a0 f26889v0;
    public final uk0 f26890w0;
    public final ym0 f26891x0;
    public ImageView f26892y0;
    public en0 f26893z0;

    public hn0(Context context, org.telegram.ui.zx zxVar, int i10, int i11, int i12, long j10, org.telegram.ui.hw hwVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f26886s0 = false;
        this.B0 = new HashMap();
        this.C0 = new ArrayList();
        int i17 = org.telegram.messenger.e20.f15506s0;
        this.J0 = i17;
        this.U0 = 0;
        this.T0 = i12;
        this.V0 = j10;
        this.L0 = zxVar;
        this.R0 = hwVar;
        s4.j jVar = new s4.j();
        this.f26871c0 = jVar;
        jVar.f47978c = 150L;
        jVar.e = 350L;
        jVar.f47979f = 0L;
        jVar.f47980g = 0L;
        jVar.d = 0L;
        jVar.f47981i = new OvershootInterpolator(1.1f);
        jVar.f47956o = gr.h;
        org.telegram.ui.jx jxVar = (org.telegram.ui.jx) this;
        this.f26872d0 = new an0(jxVar, context, zxVar, i10, i11, jVar, zxVar.F, zxVar, context);
        if (i11 == 15) {
            ArrayList d42 = zxVar.d4(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < d42.size(); i18 = c3.i0.k(i18, 1, ((TLRPC.Dialog) d42.get(i18)).f19798id, arrayList)) {
            }
            this.f26872d0.f55718q0 = arrayList;
        }
        this.S0 = (vu0) zxVar.getFragmentView();
        ag.b1 b1Var = new ag.b1(jxVar, context, 20);
        this.f26869a0 = b1Var;
        b1Var.setItemAnimator(this.f26871c0);
        b1Var.setPivotY(0.0f);
        b1Var.setClipToPadding(false);
        b1Var.setAdapter(this.f26872d0);
        b1Var.setVerticalScrollBarEnabled(true);
        b1Var.setInstantClick(true);
        if (org.telegram.messenger.dd.X) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        b1Var.setVerticalScrollbarPosition(i13);
        s4.a0 a0Var = new s4.a0(1, false);
        this.f26873e0 = a0Var;
        b1Var.setLayoutManager(a0Var);
        b1Var.W1 = true;
        b1Var.X1 = 0;
        b1Var.setOnScrollListener(new wm0(jxVar, zxVar, 2));
        b1Var.D0(new eb0(jxVar, 24));
        org.telegram.ui.y00 y00Var = new org.telegram.ui.y00(this.L0);
        this.O0 = y00Var;
        ag.b1 b1Var2 = y00Var.f43498b;
        b1Var2.setClipToPadding(false);
        b1Var2.j(new zm0(jxVar, 1));
        b1Var2.D0(new eb0(jxVar, 24));
        y00Var.setUiCallback(this);
        y00Var.setVisibility(8);
        y00Var.setChatPreviewDelegate(hwVar);
        zz zzVar = new zz(context, null);
        zzVar.setViewType(1);
        um0 um0Var = new um0(jxVar, context, zzVar, 2);
        this.f26870b0 = um0Var;
        um0Var.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        um0Var.e.setVisibility(8);
        um0Var.setVisibility(8);
        um0Var.addView(zzVar, 0);
        um0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(um0Var);
        frameLayout.addView(b1Var);
        frameLayout.addView(y00Var);
        b1Var.setEmptyView(um0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f26876h0 = frameLayout2;
        bn0 bn0Var = new bn0(jxVar);
        bn0Var.f47938m = false;
        bn0Var.C = false;
        gr grVar = gr.h;
        bn0Var.o(grVar);
        bn0Var.n(350L);
        uk0 uk0Var = new uk0(context, null);
        this.f26879k0 = uk0Var;
        uk0Var.setItemAnimator(bn0Var);
        uk0Var.setPivotY(0.0f);
        uk0Var.setVerticalScrollBarEnabled(true);
        uk0Var.setInstantClick(true);
        if (org.telegram.messenger.dd.X) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        uk0Var.setVerticalScrollbarPosition(i14);
        s4.a0 a0Var2 = new s4.a0(1, false);
        this.f26878j0 = a0Var2;
        uk0Var.setLayoutManager(a0Var2);
        uk0Var.W1 = true;
        uk0Var.X1 = 0;
        uk0Var.setClipToPadding(false);
        zz zzVar2 = new zz(context, null);
        zzVar2.setViewType(1);
        um0 um0Var2 = new um0(jxVar, context, zzVar2, 3);
        this.f26877i0 = um0Var2;
        um0Var2.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        um0Var2.e.setVisibility(8);
        um0Var2.setVisibility(8);
        um0Var2.addView(zzVar2, 0);
        um0Var2.e(true, false);
        frameLayout2.addView(um0Var2);
        frameLayout2.addView(uk0Var);
        uk0Var.setEmptyView(um0Var2);
        cn0 cn0Var = new cn0(jxVar, uk0Var, context, this.J0, i12, zxVar);
        this.f26880l0 = cn0Var;
        uk0Var.setAdapter(cn0Var);
        uk0Var.setOnScrollListener(new wm0(jxVar, zxVar, 3));
        uk0Var.D0(new eb0(jxVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.m0 = frameLayout3;
        tm0 tm0Var = new tm0(jxVar);
        tm0Var.f47938m = false;
        tm0Var.C = false;
        tm0Var.o(grVar);
        tm0Var.n(350L);
        uk0 uk0Var2 = new uk0(context, null);
        this.f26883p0 = uk0Var2;
        uk0Var2.setItemAnimator(tm0Var);
        uk0Var2.setPivotY(0.0f);
        uk0Var2.setClipToPadding(false);
        uk0Var2.setVerticalScrollBarEnabled(true);
        uk0Var2.setInstantClick(true);
        if (org.telegram.messenger.dd.X) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        uk0Var2.setVerticalScrollbarPosition(i15);
        s4.a0 a0Var3 = new s4.a0(1, false);
        this.f26882o0 = a0Var3;
        uk0Var2.setLayoutManager(a0Var3);
        uk0Var2.W1 = true;
        uk0Var2.X1 = 0;
        zz zzVar3 = new zz(context, null);
        zzVar3.setViewType(1);
        um0 um0Var3 = new um0(jxVar, context, zzVar3, 0);
        this.f26881n0 = um0Var3;
        um0Var3.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        um0Var3.e.setVisibility(8);
        um0Var3.setVisibility(8);
        um0Var3.addView(zzVar3, 0);
        um0Var3.e(true, false);
        frameLayout3.addView(um0Var3);
        frameLayout3.addView(uk0Var2);
        uk0Var2.setEmptyView(um0Var3);
        vm0 vm0Var = new vm0(jxVar, uk0Var2, context, this.J0, i12);
        this.f26884q0 = vm0Var;
        uk0Var2.setAdapter(vm0Var);
        uk0Var2.setOnScrollListener(new wm0(jxVar, zxVar, 0));
        uk0Var2.D0(new eb0(jxVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f26887t0 = frameLayout4;
        xm0 xm0Var = new xm0(jxVar);
        xm0Var.f47938m = false;
        xm0Var.C = false;
        xm0Var.o(grVar);
        xm0Var.n(350L);
        uk0 uk0Var3 = new uk0(context, null);
        this.f26890w0 = uk0Var3;
        uk0Var3.setItemAnimator(xm0Var);
        uk0Var3.setPivotY(0.0f);
        uk0Var3.setVerticalScrollBarEnabled(true);
        uk0Var3.setInstantClick(true);
        if (org.telegram.messenger.dd.X) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        uk0Var3.setVerticalScrollbarPosition(i16);
        s4.a0 a0Var4 = new s4.a0(1, false);
        this.f26889v0 = a0Var4;
        uk0Var3.setLayoutManager(a0Var4);
        uk0Var3.W1 = true;
        uk0Var3.X1 = 0;
        uk0Var3.setClipToPadding(false);
        zz zzVar4 = new zz(context, null);
        zzVar4.setViewType(1);
        um0 um0Var4 = new um0(jxVar, context, zzVar4, 1);
        this.f26888u0 = um0Var4;
        um0Var4.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        um0Var4.e.setVisibility(8);
        um0Var4.setVisibility(8);
        um0Var4.addView(zzVar4, 0);
        um0Var4.e(true, false);
        frameLayout4.addView(um0Var4);
        frameLayout4.addView(uk0Var3);
        uk0Var3.setEmptyView(um0Var4);
        ym0 ym0Var = new ym0(jxVar, uk0Var3, context, this.J0);
        this.f26891x0 = ym0Var;
        uk0Var3.setAdapter(ym0Var);
        uk0Var3.setOnScrollListener(new wm0(jxVar, zxVar, 1));
        uk0Var3.D0(new eb0(jxVar, 24));
        this.f26874f0 = new xj0(b1Var, true);
        cg0 cg0Var = new cg0(context, zxVar);
        this.f26885r0 = cg0Var;
        v51 v51Var = cg0Var.f25108c;
        v51Var.setClipToPadding(false);
        v51Var.j(new zm0(jxVar, 0));
        v51Var.D0(new eb0(jxVar, 24));
        mg.s sVar = new mg.s(jxVar);
        this.V = sVar;
        setAdapter(sVar);
    }

    public static org.telegram.ui.un M(int i10, org.telegram.messenger.kj kjVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
        if (org.telegram.messenger.o5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.o5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat L0 = org.telegram.messenger.wp.r1(org.telegram.messenger.c.a(i10).f15043a).L0(Long.valueOf(-B0));
            if (L0 != null && L0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -L0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", kjVar.f1());
        return new org.telegram.ui.un(bundle);
    }

    public static void Q(FrameLayout frameLayout, uk0 uk0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            uk0Var.q1(0, i10, 0, i11);
        } else {
            uk0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) uk0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void L() {
        if (this.f26886s0) {
            int i10 = 0;
            this.f26886s0 = false;
            S();
            n71 n71Var = this.M;
            if (n71Var != null && n71Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            an0 an0Var = this.f26872d0;
            if (an0Var != null) {
                String str = this.M0;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.C0;
                    if (i11 >= arrayList.size()) {
                        break;
                    } else if (((zf.e0) arrayList.get(i11)).d == 7) {
                        i10 = 1;
                        break;
                    } else {
                        i11++;
                    }
                }
                an0Var.T(i10, str);
            }
        }
    }

    public final int N(int i10) {
        int i11 = 0;
        while (true) {
            mg.s sVar = this.V;
            ArrayList arrayList = (ArrayList) sVar.f13227b;
            if (i11 < ((ArrayList) sVar.f13227b).size()) {
                if (((gn0) arrayList.get(i11)).f26499a == 3 && ((gn0) arrayList.get(i11)).f26500b == i10) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final boolean O() {
        int i10 = this.J0;
        if (!org.telegram.messenger.e20.i(i10).q() && !org.telegram.messenger.wp.r1(i10).A3()) {
            for (org.telegram.messenger.kj kjVar : this.B0.values()) {
                if (kjVar.F0() != null && kjVar.F0().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void P(View view, int i10, String str, boolean z10) {
        long j10;
        long j11;
        boolean z11;
        org.telegram.ui.y00 y00Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11;
        long j12;
        boolean isEmpty = TextUtils.isEmpty(str);
        um0 um0Var = this.f26870b0;
        boolean z17 = true;
        if (isEmpty) {
            um0Var.e.setVisibility(8);
        } else {
            um0Var.e.setVisibility(0);
            um0Var.e.setText(org.telegram.messenger.dd.a0(null, null, 2131748181, str));
        }
        an0 an0Var = this.f26872d0;
        org.telegram.ui.lx lxVar = an0Var.U;
        if (lxVar != null) {
            j10 = lxVar.a();
        } else {
            j10 = 0;
        }
        if (i10 == 0) {
            j11 = 0;
        } else {
            j11 = j10;
        }
        int i12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = j10;
        boolean z18 = false;
        while (true) {
            ArrayList arrayList = this.C0;
            if (i12 >= arrayList.size()) {
                break;
            }
            zf.e0 e0Var = (zf.e0) arrayList.get(i12);
            int i13 = e0Var.d;
            if (i13 == 4) {
                TLObject tLObject = e0Var.f55496f;
                if (tLObject instanceof TLRPC.User) {
                    j12 = ((TLRPC.User) tLObject).f19943id;
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.w3.Y((TLRPC.Chat) tLObject)) {
                    i11 = i12;
                } else {
                    j12 = -((TLRPC.Chat) e0Var.f55496f).f19794id;
                }
                i11 = i12;
                j11 = j12;
            } else if (i13 == 6) {
                zf.c0 c0Var = e0Var.f55497g;
                long j16 = c0Var.f55478b;
                i11 = i12;
                j14 = c0Var.f55479c;
                j13 = j16;
            } else {
                i11 = i12;
                if (i13 == 7) {
                    z18 = true;
                }
            }
            i12 = i11 + 1;
        }
        ym0 ym0Var = this.f26891x0;
        ym0Var.getClass();
        if (m30.Y(str, null) == null) {
            L();
        }
        if (view == this.f26876h0) {
            org.telegram.messenger.wp.r1(this.J0).K0(0L);
            cn0 cn0Var = this.f26880l0;
            uk0 uk0Var = cn0Var.d;
            ArrayList arrayList2 = cn0Var.S;
            ArrayList arrayList3 = cn0Var.T;
            ArrayList arrayList4 = cn0Var.U;
            ArrayList arrayList5 = cn0Var.R;
            ho hoVar = cn0Var.f27165e0;
            cn0Var.X();
            if (!TextUtils.equals(str, cn0Var.f27164d0)) {
                cn0Var.f27164d0 = str;
                org.telegram.messenger.i0.r(hoVar);
                if (TextUtils.isEmpty(cn0Var.f27164d0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    cn0Var.O(true);
                    cn0Var.f27163c0++;
                    z16 = false;
                    cn0Var.Y = false;
                    cn0Var.Z = false;
                    cn0Var.f27161a0 = false;
                    cn0Var.f27162b0 = 0;
                    if (uk0Var != null) {
                        uk0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.i0.h3(hoVar, 1000L);
                    cn0Var.Y = true;
                    cn0Var.Z = true;
                    cn0Var.O(true);
                    if (uk0Var != null) {
                        z16 = false;
                        uk0Var.v0(0);
                    }
                }
                this.f26877i0.b(this.P0, z16);
            }
            z16 = false;
            this.f26877i0.b(this.P0, z16);
        } else if (view == this.m0) {
            vm0 vm0Var = this.f26884q0;
            uk0 uk0Var2 = vm0Var.d;
            ArrayList arrayList6 = vm0Var.V;
            bs bsVar = vm0Var.f26540h0;
            if (TextUtils.equals(str, vm0Var.f26539g0)) {
                z15 = false;
            } else {
                vm0Var.f26539g0 = str;
                org.telegram.messenger.i0.r(bsVar);
                if (TextUtils.isEmpty(vm0Var.f26539g0)) {
                    arrayList6.clear();
                    vm0Var.O(true);
                    vm0Var.f26538f0++;
                    z15 = false;
                    vm0Var.f26534b0 = false;
                    vm0Var.f26535c0 = false;
                    vm0Var.f26536d0 = false;
                    vm0Var.f26537e0 = 0;
                    if (uk0Var2 != null) {
                        uk0Var2.v0(0);
                    }
                } else {
                    z15 = false;
                    arrayList6.clear();
                    org.telegram.messenger.i0.h3(bsVar, 1000L);
                    vm0Var.f26534b0 = true;
                    vm0Var.f26535c0 = true;
                    vm0Var.O(true);
                    if (uk0Var2 != null) {
                        uk0Var2.v0(0);
                    }
                }
            }
            this.f26881n0.b(this.P0, z15);
            if (TextUtils.isEmpty(str)) {
                vm0Var.W();
            }
        } else {
            cg0 cg0Var = this.f26885r0;
            if (view == cg0Var) {
                v51 v51Var = cg0Var.f25108c;
                ArrayList arrayList7 = cg0Var.f25110n;
                if (!TextUtils.equals(cg0Var.f25114x, str)) {
                    if (cg0Var.K >= 0) {
                        ConnectionsManager.getInstance(cg0Var.f25107b).cancelRequest(cg0Var.K, true);
                        cg0Var.K = -1;
                    }
                    cg0Var.f25113w = false;
                    cg0Var.H.setLoading(false);
                    cg0Var.f25114x = str;
                    if (TextUtils.isEmpty(str)) {
                        cg0Var.f25111r = 0;
                        cg0Var.L++;
                        cg0Var.f25112s = false;
                        arrayList7.clear();
                        cg0Var.a(false);
                    } else {
                        cg0Var.b(str);
                        cg0Var.f25111r = 0;
                        cg0Var.L++;
                        cg0Var.f25112s = false;
                        arrayList7.clear();
                    }
                    cg0Var.d();
                    v51Var.v0(0);
                    v51Var.f31183f3.O(true);
                }
            } else if (view == this.f26887t0) {
                if (m30.Y(str, null) != null) {
                    if (z10) {
                        this.f26889v0.h1(0, 0);
                    }
                    ym0Var.Z(str);
                    this.f26888u0.b(this.P0, false);
                }
            } else if (view == this.W) {
                int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                org.telegram.ui.y00 y00Var2 = this.O0;
                if ((i14 == 0 && this.V0 == 0 && j13 == 0 && j14 == 0) || j15 != 0) {
                    this.K0 = false;
                    an0Var.T(z18 ? 1 : 0, str);
                    an0Var.A0 = this.N0;
                    y00Var2.animate().setListener(null).cancel();
                    y00Var2.i(null, false);
                    if (z10) {
                        if (an0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        um0Var.e(!z14, false);
                        if (an0Var.D0 <= 0) {
                            z17 = false;
                        }
                        um0Var.e(z17, false);
                    } else if (!an0Var.M()) {
                        if (an0Var.D0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        um0Var.e(z13, true);
                    }
                    if (z10) {
                        y00Var2.setVisibility(8);
                    } else if (y00Var2.getVisibility() != 8) {
                        y00Var2.animate().alpha(0.0f).setListener(new t60(this, 17)).setDuration(150L).start();
                    }
                    y00Var2.setTag(null);
                    y00Var = y00Var2;
                    z12 = false;
                } else {
                    y00Var2.setTag(1);
                    y00Var2.i(this.N0, false);
                    y00Var2.animate().setListener(null).cancel();
                    if (z10) {
                        y00Var2.setVisibility(0);
                        y00Var2.setAlpha(1.0f);
                        z11 = z10;
                    } else {
                        if (y00Var2.getVisibility() != 0) {
                            y00Var2.setVisibility(0);
                            y00Var2.setAlpha(0.0f);
                        } else {
                            z17 = z10;
                        }
                        y00Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z11 = z17;
                    }
                    y00Var = y00Var2;
                    z12 = false;
                    this.O0.h(j11, this.V0, j13, j14, null, z18, str, z11);
                    um0Var.setVisibility(8);
                }
                um0Var.b(this.P0, z12);
                y00Var.f43500c.b(this.P0, z12);
            } else {
                long j17 = j13;
                long j18 = j14;
                if (view instanceof org.telegram.ui.y00) {
                    org.telegram.ui.y00 y00Var3 = (org.telegram.ui.y00) view;
                    if (j15 == 0) {
                        z17 = false;
                    }
                    y00Var3.setUseFromUserAsAvatar(z17);
                    y00Var3.f43500c.b(this.P0, false);
                    y00Var3.h(j11, this.V0, j17, j18, zf.g0.f55511j3[((gn0) ((ArrayList) this.V.f13227b).get(i10)).f26500b], z18, str, z10);
                } else if (view instanceof hm0) {
                    hm0 hm0Var = (hm0) view;
                    hm0Var.f26858a.b(this.P0, false);
                    hm0Var.K = str;
                    hm0Var.d(false);
                }
            }
        }
    }

    public final void R(boolean z10) {
        tk0 tk0Var;
        tk0 tk0Var2;
        tk0 tk0Var3;
        int i10;
        boolean z11;
        int i11;
        int i12;
        org.telegram.ui.lx lxVar;
        int i13;
        if (this.A0 != z10) {
            org.telegram.ui.zx zxVar = this.L0;
            if (!z10 || !zxVar.getActionBar().u()) {
                if (z10 && !zxVar.getActionBar().e("search_view_pager")) {
                    this.H0 = zxVar.getActionBar().m("search_view_pager");
                    if (zxVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f26892y0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f26892y0.setImageDrawable(new org.telegram.ui.ActionBar.c2(true));
                        org.telegram.ui.ActionBar.a7.t(this.f26892y0, org.telegram.ui.ActionBar.t6.f21314y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f26892y0;
                        int i14 = org.telegram.ui.ActionBar.t6.f21333z8;
                        org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i14, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i14), null);
                        this.f26892y0.setOnClickListener(new db0(this, 11));
                        this.H0.addView(this.f26892y0, w7.b6.p(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.H0.getContext());
                    this.f26893z0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f26893z0.setTypeface(org.telegram.messenger.i0.o());
                    en0 en0Var = this.f26893z0;
                    int i15 = org.telegram.ui.ActionBar.t6.f21314y8;
                    au auVar = new au(19);
                    au auVar2 = new au(20);
                    int Q = org.telegram.ui.ActionBar.a7.Q(i15, -1, 0, 0.0f, null);
                    auVar2.d(Q, en0Var);
                    org.telegram.ui.ActionBar.u6 x10 = org.telegram.ui.ActionBar.a7.x(101, en0Var);
                    x10.c(i15, -1, 0, 0.0f, null);
                    x10.f21397n = auVar;
                    x10.f21398o = auVar2;
                    x10.f21396m = false;
                    x10.f21391g = Q;
                    org.telegram.ui.ActionBar.y yVar = this.H0;
                    en0 en0Var2 = this.f26893z0;
                    if (zxVar.W) {
                        i13 = 18;
                    } else {
                        i13 = 72;
                    }
                    yVar.addView(en0Var2, w7.b6.m(1.0f, 0, -1, i13, 0, 0));
                    this.f26893z0.setOnTouchListener(new org.telegram.ui.ActionBar.n2(20));
                    org.telegram.ui.ActionBar.t0 h = this.H0.h(203, 2131230879, org.telegram.messenger.dd.L0(2131754801, null), org.telegram.messenger.i0.L(54.0f));
                    this.D0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.a7.t(this.D0.getIconView(), i15, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.E0 = this.H0.h(200, 2131232223, org.telegram.messenger.dd.L0(2131754877, null), org.telegram.messenger.i0.L(54.0f));
                    this.F0 = this.H0.h(201, 2131232164, org.telegram.messenger.dd.L0(2131750588, null), org.telegram.messenger.i0.L(54.0f));
                    this.G0 = this.H0.h(202, 2131232107, org.telegram.messenger.dd.L0(2131751599, null), org.telegram.messenger.i0.L(54.0f));
                }
                if (this.f26893z0 != null) {
                    an0 an0Var = this.f26872d0;
                    if (an0Var != null && (lxVar = an0Var.U) != null && lxVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26893z0.getLayoutParams();
                    if (zxVar.W) {
                        i11 = 18;
                    } else {
                        i11 = 72;
                    }
                    if (z11) {
                        i12 = 56;
                    } else {
                        i12 = 0;
                    }
                    marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(i11 + i12);
                    en0 en0Var3 = this.f26893z0;
                    en0Var3.setLayoutParams(en0Var3.getLayoutParams());
                }
                if (zxVar.getActionBar().getBackButton() != null && (zxVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.a5)) {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
                    zxVar.getActionBar().setBackButtonDrawable(c2Var);
                    c2Var.setColorFilter(null);
                }
                this.A0 = z10;
                HashMap hashMap = this.B0;
                if (z10) {
                    org.telegram.messenger.i0.v1(zxVar.getParentActivity().getCurrentFocus());
                    zxVar.getActionBar().O(null, null);
                    this.f26893z0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.t0 t0Var = this.D0;
                    if (O()) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    t0Var.setVisibility(i10);
                    this.E0.setVisibility(0);
                    this.F0.setVisibility(0);
                    this.G0.setVisibility(0);
                    return;
                }
                zxVar.getActionBar().t();
                hashMap.clear();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    if ((getChildAt(i16) instanceof org.telegram.ui.y00) && (tk0Var3 = ((org.telegram.ui.y00) getChildAt(i16)).d) != null) {
                        tk0Var3.f();
                    }
                    if (getChildAt(i16) instanceof hm0) {
                        ((hm0) getChildAt(i16)).d(true);
                    }
                }
                org.telegram.ui.y00 y00Var = this.O0;
                if (y00Var != null && (tk0Var2 = y00Var.d) != null) {
                    tk0Var2.f();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i17 = 0; i17 < size; i17++) {
                    View view = (View) sparseArray.valueAt(i17);
                    if ((view instanceof org.telegram.ui.y00) && (tk0Var = ((org.telegram.ui.y00) view).d) != null) {
                        tk0Var.f();
                    }
                }
            }
        }
    }

    public final void S() {
        this.V.l();
        o(false);
        n71 n71Var = this.M;
        if (n71Var != null) {
            n71Var.f32164y.f();
        }
    }

    @Override
    public final void a() {
        R(true);
    }

    @Override
    public final boolean b(org.telegram.ui.r00 r00Var) {
        return this.B0.containsKey(r00Var);
    }

    @Override
    public final void c(org.telegram.messenger.kj kjVar) {
        this.L0.presentFragment(M(this.J0, kjVar));
        R(false);
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.W;
                uk0 uk0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        uk0Var = this.f26869a0;
                    } else if (view == this.f26876h0) {
                        uk0Var = this.f26879k0;
                    } else if (view == this.m0) {
                        uk0Var = this.f26883p0;
                    } else if (view == this.f26887t0) {
                        uk0Var = this.f26890w0;
                    } else {
                        hm0 hm0Var = this.I0;
                        if (view == hm0Var) {
                            uk0Var = hm0Var.f26859b;
                        } else {
                            cg0 cg0Var = this.f26885r0;
                            if (view == cg0Var) {
                                uk0Var = cg0Var.f25108c;
                            } else if (view instanceof org.telegram.ui.y00) {
                                uk0Var = ((org.telegram.ui.y00) view).f43498b;
                            }
                        }
                    }
                }
                if (uk0Var != null) {
                    yg.d.a(uk0Var, canvas, rectF, uk0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.y00 y00Var = this.O0;
                    if (y00Var.getVisibility() == 0) {
                        ag.b1 b1Var = y00Var.f43498b;
                        yg.d.a(b1Var, canvas, rectF, b1Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.at.f14707f3;
        boolean z10 = false;
        cn0 cn0Var = this.f26880l0;
        if (i10 == i12) {
            if (org.telegram.messenger.wp.r1(this.J0).K0(0L) != null) {
                z10 = true;
            }
            this.f26877i0.e(z10, true);
            cn0Var.X();
            cn0Var.O(true);
        } else if (i10 != org.telegram.messenger.at.f14822y1 && i10 != org.telegram.messenger.at.f14779s) {
            if (i10 == org.telegram.messenger.at.V0) {
                this.f26884q0.O(true);
            } else if (i10 == org.telegram.messenger.at.f14819x5) {
                Object obj = objArr[0];
                ym0 ym0Var = this.f26891x0;
                if (obj == ym0Var.S) {
                    ym0Var.O(true);
                }
            }
        } else {
            cn0Var.X();
            cn0Var.O(true);
        }
    }

    @Override
    public final void e(org.telegram.messenger.kj kjVar, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.r00 r00Var = new org.telegram.ui.r00(kjVar.f1(), org.telegram.messenger.kj.B0(kjVar.f16690k));
        HashMap hashMap = this.B0;
        if (hashMap.containsKey(r00Var)) {
            hashMap.remove(r00Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(r00Var, kjVar);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.f26893z0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.t0 t0Var = this.E0;
            if (t0Var != null) {
                if (hashMap.size() == 1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                t0Var.setVisibility(i12);
            }
            if (this.D0 != null) {
                boolean O = O();
                if (O) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (this.D0.getVisibility() != i11) {
                    this.D0.setVisibility(i11);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.D0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.a7.y(this, animatedVectorDrawable, org.telegram.ui.ActionBar.t6.f21314y8, null, PorterDuff.Mode.SRC_IN);
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
                        if (!((org.telegram.messenger.kj) hashMap.get((org.telegram.ui.r00) it.next())).Q) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                org.telegram.ui.ActionBar.t0 t0Var2 = this.G0;
                if (!z10) {
                    i13 = 8;
                }
                t0Var2.setVisibility(i13);
            }
        }
        if (view instanceof org.telegram.ui.Cells.l7) {
            ((org.telegram.ui.Cells.l7) view).b(hashMap.containsKey(r00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).b(i10, hashMap.containsKey(r00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).f(hashMap.containsKey(r00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).e(hashMap.containsKey(r00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view).c(hashMap.containsKey(r00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.v2) {
            ((org.telegram.ui.Cells.v2) view).c0(hashMap.containsKey(r00Var), true);
        }
    }

    @Override
    public final boolean f() {
        return this.A0;
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        yVar.f7259b = true;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.H0;
    }

    public ArrayList<zf.e0> getCurrentSearchFilters() {
        return this.C0;
    }

    public hm0 getDownloadsContainer() {
        return this.I0;
    }

    public int getFolderId() {
        return this.T0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.t0 getSpeedItem() {
        return this.D0;
    }

    public w71 getTabsView() {
        return this.M;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xa.n nVar = this.Y0;
        if (nVar != null) {
            nVar.a();
            this.Y0 = null;
        }
        xa.n nVar2 = new xa.n(org.telegram.messenger.at.f(this.J0), this);
        nVar2.e(org.telegram.messenger.at.f14707f3);
        nVar2.e(org.telegram.messenger.at.f14822y1);
        nVar2.e(org.telegram.messenger.at.f14779s);
        nVar2.e(org.telegram.messenger.at.V0);
        nVar2.e(org.telegram.messenger.at.f14819x5);
        this.Y0 = nVar2;
        this.f26875g0 = true;
        cn0 cn0Var = this.f26880l0;
        if (cn0Var != null) {
            cn0Var.O(false);
        }
        vm0 vm0Var = this.f26884q0;
        if (vm0Var != null) {
            vm0Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26875g0 = false;
        xa.n nVar = this.Y0;
        if (nVar != null) {
            nVar.a();
            this.Y0 = null;
        }
    }

    @Override
    public final void s() {
        this.S0.K();
    }

    public void setBlurredBackgroundDrawableFactory(tg.b bVar) {
        this.Z0 = bVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.p00 p00Var) {
        this.N0 = p00Var;
    }

    public void setKeyboardHeight(int i10) {
        boolean z10;
        this.P0 = i10;
        if (getVisibility() == 0 && getAlpha() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof org.telegram.ui.y00) {
                ((org.telegram.ui.y00) getChildAt(i11)).f43500c.b(i10, z10);
            } else if (getChildAt(i11) == this.W) {
                this.f26870b0.b(i10, z10);
                this.O0.f43500c.b(i10, z10);
            } else if (getChildAt(i11) instanceof hm0) {
                ((hm0) getChildAt(i11)).f26858a.b(i10, z10);
            } else if (getChildAt(i11) == this.f26876h0) {
                this.f26877i0.b(i10, z10);
            }
        }
    }

    @Override
    public void setPosition(int i10) {
        if (i10 < 0) {
            return;
        }
        super.setPosition(i10);
        this.h.clear();
        n71 n71Var = this.M;
        if (n71Var != null) {
            n71Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        an0 an0Var = this.f26872d0;
        org.telegram.ui.y00 y00Var = this.O0;
        if (i10 == 0) {
            if (y00Var.getVisibility() == 0) {
                y00Var.i(this.N0, false);
                an0Var.A0 = null;
            } else {
                y00Var.i(null, false);
                org.telegram.ui.p00 p00Var = this.N0;
                an0Var.A0 = p00Var;
                if (p00Var != null) {
                    ((org.telegram.ui.hv) p00Var).k(false, null, an0Var.f55731y0, an0Var.f55732z0);
                }
            }
        } else if (view instanceof org.telegram.ui.y00) {
            if (i11 == 0 && y00Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.y00) view).i(this.N0, z10);
        }
        if (view2 instanceof org.telegram.ui.y00) {
            ((org.telegram.ui.y00) view2).i(null, false);
            return;
        }
        an0Var.A0 = null;
        y00Var.i(null, false);
    }
}
