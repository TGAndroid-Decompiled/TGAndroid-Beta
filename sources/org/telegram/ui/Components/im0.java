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
public abstract class im0 extends n61 implements org.telegram.ui.vz, org.telegram.messenger.cs, fh.a {
    public static final int f34745b1 = 0;
    public fm0 A0;
    public boolean B0;
    public final HashMap C0;
    public final ArrayList D0;
    public org.telegram.ui.ActionBar.q0 E0;
    public org.telegram.ui.ActionBar.q0 F0;
    public org.telegram.ui.ActionBar.q0 G0;
    public org.telegram.ui.ActionBar.q0 H0;
    public org.telegram.ui.ActionBar.x I0;
    public hl0 J0;
    public final int K0;
    public boolean L0;
    public final org.telegram.ui.uw M0;
    public String N0;
    public org.telegram.ui.nz O0;
    public final org.telegram.ui.wz P0;
    public int Q0;
    public boolean R0;
    public final org.telegram.ui.av S0;
    public final qt0 T0;
    public final int U0;
    public int V0;
    public final ci.o4 W;
    public final long W0;
    public int X0;
    public int Y0;
    public za.p Z0;
    public final FrameLayout f34746a0;
    public eh.c f34747a1;
    public final ci.j1 f34748b0;
    public final vl0 f34749c0;
    public final u4.k f34750d0;
    public final bm0 f34751e0;
    public final u4.b0 f34752f0;
    public final wi0 f34753g0;
    public boolean f34754h0;
    public final FrameLayout f34755i0;
    public final vl0 f34756j0;
    public final u4.b0 f34757k0;
    public final tj0 f34758l0;
    public final dm0 m0;
    public final FrameLayout f34759n0;
    public final vl0 f34760o0;
    public final u4.b0 f34761p0;
    public final tj0 f34762q0;
    public final wl0 f34763r0;
    public final bf0 f34764s0;
    public boolean f34765t0;
    public final FrameLayout f34766u0;
    public final vl0 f34767v0;
    public final u4.b0 f34768w0;
    public final tj0 f34769x0;
    public final zl0 f34770y0;
    public ImageView f34771z0;

    public im0(Context context, org.telegram.ui.uw uwVar, int i3, int i10, int i11, long j10, org.telegram.ui.av avVar) {
        super(context, null);
        int i12;
        int i13;
        int i14;
        int i15;
        this.f34765t0 = false;
        this.C0 = new HashMap();
        this.D0 = new ArrayList();
        int i16 = org.telegram.messenger.h10.f22829t0;
        this.K0 = i16;
        this.V0 = 0;
        this.U0 = i11;
        this.W0 = j10;
        this.M0 = uwVar;
        this.S0 = avVar;
        u4.k kVar = new u4.k();
        this.f34750d0 = kVar;
        kVar.f55616c = 150L;
        kVar.f55617e = 350L;
        kVar.f55618f = 0L;
        kVar.f55619g = 0L;
        kVar.d = 0L;
        kVar.f55620i = new OvershootInterpolator(1.1f);
        kVar.f55597o = xq.h;
        org.telegram.ui.cw cwVar = (org.telegram.ui.cw) this;
        this.f34751e0 = new bm0(cwVar, context, uwVar, i3, i10, kVar, uwVar.G, uwVar, context);
        if (i10 == 15) {
            ArrayList d42 = uwVar.d4(i16, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 < d42.size(); i17 = a1.g.h(i17, 1, ((TLRPC.Dialog) d42.get(i17)).f27005id, arrayList)) {
            }
            this.f34751e0.f16977r0 = arrayList;
        }
        this.T0 = (qt0) uwVar.getFragmentView();
        ci.j1 j1Var = new ci.j1(25, context, cwVar);
        this.f34748b0 = j1Var;
        j1Var.setItemAnimator(this.f34750d0);
        j1Var.setPivotY(0.0f);
        j1Var.setClipToPadding(false);
        j1Var.setAdapter(this.f34751e0);
        j1Var.setVerticalScrollBarEnabled(true);
        j1Var.setInstantClick(true);
        if (org.telegram.messenger.bd.f21784a0) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        j1Var.setVerticalScrollbarPosition(i12);
        u4.b0 b0Var = new u4.b0(1, false);
        this.f34752f0 = b0Var;
        j1Var.setLayoutManager(b0Var);
        j1Var.X1 = true;
        j1Var.Y1 = 0;
        j1Var.setOnScrollListener(new xl0(cwVar, uwVar, 2));
        j1Var.D0(new jb0(cwVar, 21));
        org.telegram.ui.wz wzVar = new org.telegram.ui.wz(this.M0);
        this.P0 = wzVar;
        org.telegram.ui.xs xsVar = wzVar.f51638b;
        xsVar.setClipToPadding(false);
        xsVar.j(new am0(cwVar, 1));
        xsVar.D0(new jb0(cwVar, 21));
        wzVar.setUiCallback(this);
        wzVar.setVisibility(8);
        wzVar.setChatPreviewDelegate(avVar);
        iz izVar = new iz(context, null);
        izVar.setViewType(1);
        vl0 vl0Var = new vl0(cwVar, context, izVar, 2);
        this.f34749c0 = vl0Var;
        vl0Var.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        vl0Var.f41128e.setVisibility(8);
        vl0Var.setVisibility(8);
        vl0Var.addView(izVar, 0);
        vl0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34746a0 = frameLayout;
        frameLayout.addView(vl0Var);
        frameLayout.addView(j1Var);
        frameLayout.addView(wzVar);
        j1Var.setEmptyView(vl0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34755i0 = frameLayout2;
        cm0 cm0Var = new cm0(cwVar);
        cm0Var.f55567m = false;
        cm0Var.C = false;
        xq xqVar = xq.h;
        cm0Var.o(xqVar);
        cm0Var.n(350L);
        tj0 tj0Var = new tj0(context, null);
        this.f34758l0 = tj0Var;
        tj0Var.setItemAnimator(cm0Var);
        tj0Var.setPivotY(0.0f);
        tj0Var.setVerticalScrollBarEnabled(true);
        tj0Var.setInstantClick(true);
        if (org.telegram.messenger.bd.f21784a0) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        tj0Var.setVerticalScrollbarPosition(i13);
        u4.b0 b0Var2 = new u4.b0(1, false);
        this.f34757k0 = b0Var2;
        tj0Var.setLayoutManager(b0Var2);
        tj0Var.X1 = true;
        tj0Var.Y1 = 0;
        tj0Var.setClipToPadding(false);
        iz izVar2 = new iz(context, null);
        izVar2.setViewType(1);
        vl0 vl0Var2 = new vl0(cwVar, context, izVar2, 3);
        this.f34756j0 = vl0Var2;
        vl0Var2.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        vl0Var2.f41128e.setVisibility(8);
        vl0Var2.setVisibility(8);
        vl0Var2.addView(izVar2, 0);
        vl0Var2.e(true, false);
        frameLayout2.addView(vl0Var2);
        frameLayout2.addView(tj0Var);
        tj0Var.setEmptyView(vl0Var2);
        dm0 dm0Var = new dm0(cwVar, tj0Var, context, this.K0, i11, uwVar);
        this.m0 = dm0Var;
        tj0Var.setAdapter(dm0Var);
        tj0Var.setOnScrollListener(new xl0(cwVar, uwVar, 3));
        tj0Var.D0(new jb0(cwVar, 21));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f34759n0 = frameLayout3;
        ul0 ul0Var = new ul0(cwVar);
        ul0Var.f55567m = false;
        ul0Var.C = false;
        ul0Var.o(xqVar);
        ul0Var.n(350L);
        tj0 tj0Var2 = new tj0(context, null);
        this.f34762q0 = tj0Var2;
        tj0Var2.setItemAnimator(ul0Var);
        tj0Var2.setPivotY(0.0f);
        tj0Var2.setClipToPadding(false);
        tj0Var2.setVerticalScrollBarEnabled(true);
        tj0Var2.setInstantClick(true);
        if (org.telegram.messenger.bd.f21784a0) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        tj0Var2.setVerticalScrollbarPosition(i14);
        u4.b0 b0Var3 = new u4.b0(1, false);
        this.f34761p0 = b0Var3;
        tj0Var2.setLayoutManager(b0Var3);
        tj0Var2.X1 = true;
        tj0Var2.Y1 = 0;
        iz izVar3 = new iz(context, null);
        izVar3.setViewType(1);
        vl0 vl0Var3 = new vl0(cwVar, context, izVar3, 0);
        this.f34760o0 = vl0Var3;
        vl0Var3.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        vl0Var3.f41128e.setVisibility(8);
        vl0Var3.setVisibility(8);
        vl0Var3.addView(izVar3, 0);
        vl0Var3.e(true, false);
        frameLayout3.addView(vl0Var3);
        frameLayout3.addView(tj0Var2);
        tj0Var2.setEmptyView(vl0Var3);
        wl0 wl0Var = new wl0(cwVar, tj0Var2, context, this.K0, i11);
        this.f34763r0 = wl0Var;
        tj0Var2.setAdapter(wl0Var);
        tj0Var2.setOnScrollListener(new xl0(cwVar, uwVar, 0));
        tj0Var2.D0(new jb0(cwVar, 21));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f34766u0 = frameLayout4;
        yl0 yl0Var = new yl0(cwVar);
        yl0Var.f55567m = false;
        yl0Var.C = false;
        yl0Var.o(xqVar);
        yl0Var.n(350L);
        tj0 tj0Var3 = new tj0(context, null);
        this.f34769x0 = tj0Var3;
        tj0Var3.setItemAnimator(yl0Var);
        tj0Var3.setPivotY(0.0f);
        tj0Var3.setVerticalScrollBarEnabled(true);
        tj0Var3.setInstantClick(true);
        if (org.telegram.messenger.bd.f21784a0) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        tj0Var3.setVerticalScrollbarPosition(i15);
        u4.b0 b0Var4 = new u4.b0(1, false);
        this.f34768w0 = b0Var4;
        tj0Var3.setLayoutManager(b0Var4);
        tj0Var3.X1 = true;
        tj0Var3.Y1 = 0;
        tj0Var3.setClipToPadding(false);
        iz izVar4 = new iz(context, null);
        izVar4.setViewType(1);
        vl0 vl0Var4 = new vl0(cwVar, context, izVar4, 1);
        this.f34767v0 = vl0Var4;
        vl0Var4.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        vl0Var4.f41128e.setVisibility(8);
        vl0Var4.setVisibility(8);
        vl0Var4.addView(izVar4, 0);
        vl0Var4.e(true, false);
        frameLayout4.addView(vl0Var4);
        frameLayout4.addView(tj0Var3);
        tj0Var3.setEmptyView(vl0Var4);
        zl0 zl0Var = new zl0(cwVar, tj0Var3, context, this.K0);
        this.f34770y0 = zl0Var;
        tj0Var3.setAdapter(zl0Var);
        tj0Var3.setOnScrollListener(new xl0(cwVar, uwVar, 1));
        tj0Var3.D0(new jb0(cwVar, 21));
        this.f34753g0 = new wi0(j1Var, true);
        bf0 bf0Var = new bf0(context, uwVar);
        this.f34764s0 = bf0Var;
        l41 l41Var = bf0Var.f32170c;
        l41Var.setClipToPadding(false);
        l41Var.j(new am0(cwVar, 0));
        l41Var.D0(new jb0(cwVar, 21));
        ci.o4 o4Var = new ci.o4(cwVar);
        this.W = o4Var;
        setAdapter(o4Var);
    }

    public static org.telegram.ui.wm M(int i3, org.telegram.messenger.zi ziVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
        if (org.telegram.messenger.m5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(i3).f21919a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", ziVar.f1());
        return new org.telegram.ui.wm(bundle);
    }

    public static void Q(FrameLayout frameLayout, tj0 tj0Var, int i3, int i10, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i3, 0, i10);
        if (z10) {
            tj0Var.q1(0, i3, 0, i10);
        } else {
            tj0Var.setPadding(0, i3, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tj0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i3;
        marginLayoutParams.bottomMargin = -i10;
    }

    @Override
    public final boolean I() {
        return this.B0;
    }

    public final void L() {
        if (this.f34765t0) {
            int i3 = 0;
            this.f34765t0 = false;
            S();
            d61 d61Var = this.N;
            if (d61Var != null && d61Var.getCurrentTabId() != 0) {
                this.N.d(0, 0);
            }
            bm0 bm0Var = this.f34751e0;
            if (bm0Var != null) {
                String str = this.N0;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.D0;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (((kg.l0) arrayList.get(i10)).d == 7) {
                        i3 = 1;
                        break;
                    } else {
                        i10++;
                    }
                }
                bm0Var.T(i3, str);
            }
        }
    }

    public final int N(int i3) {
        int i10 = 0;
        while (true) {
            ci.o4 o4Var = this.W;
            ArrayList arrayList = (ArrayList) o4Var.f5682b;
            if (i10 < ((ArrayList) o4Var.f5682b).size()) {
                if (((hm0) arrayList.get(i10)).f34455a == 3 && ((hm0) arrayList.get(i10)).f34456b == i3) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final boolean O() {
        int i3 = this.K0;
        if (!org.telegram.messenger.h10.i(i3).q() && !org.telegram.messenger.hp.s1(i3).D3()) {
            for (org.telegram.messenger.zi ziVar : this.C0.values()) {
                if (ziVar.F0() != null && ziVar.F0().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void P(View view, int i3, String str, boolean z10) {
        long j10;
        long j11;
        boolean z11;
        org.telegram.ui.wz wzVar;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        long j12;
        boolean isEmpty = TextUtils.isEmpty(str);
        vl0 vl0Var = this.f34749c0;
        boolean z17 = true;
        if (isEmpty) {
            vl0Var.f41128e.setVisibility(8);
        } else {
            vl0Var.f41128e.setVisibility(0);
            vl0Var.f41128e.setText(org.telegram.messenger.bd.a0(null, null, 2131748173, str));
        }
        bm0 bm0Var = this.f34751e0;
        org.telegram.ui.ew ewVar = bm0Var.V;
        if (ewVar != null) {
            j10 = ewVar.a();
        } else {
            j10 = 0;
        }
        if (i3 == 0) {
            j11 = 0;
        } else {
            j11 = j10;
        }
        int i11 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = j10;
        boolean z18 = false;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i11 >= arrayList.size()) {
                break;
            }
            kg.l0 l0Var = (kg.l0) arrayList.get(i11);
            int i12 = l0Var.d;
            if (i12 == 4) {
                TLObject tLObject = l0Var.f17084f;
                if (tLObject instanceof TLRPC.User) {
                    j12 = ((TLRPC.User) tLObject).f27150id;
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.t3.Y((TLRPC.Chat) tLObject)) {
                    i10 = i11;
                } else {
                    j12 = -((TLRPC.Chat) l0Var.f17084f).f27001id;
                }
                i10 = i11;
                j11 = j12;
            } else if (i12 == 6) {
                kg.j0 j0Var = l0Var.f17085g;
                long j16 = j0Var.f17057b;
                i10 = i11;
                j14 = j0Var.f17058c;
                j13 = j16;
            } else {
                i10 = i11;
                if (i12 == 7) {
                    z18 = true;
                }
            }
            i11 = i10 + 1;
        }
        zl0 zl0Var = this.f34770y0;
        zl0Var.getClass();
        if (q20.Y(str, null) == null) {
            L();
        }
        if (view == this.f34755i0) {
            org.telegram.messenger.hp.s1(this.K0).L0(0L);
            dm0 dm0Var = this.m0;
            tj0 tj0Var = dm0Var.d;
            ArrayList arrayList2 = dm0Var.T;
            ArrayList arrayList3 = dm0Var.U;
            ArrayList arrayList4 = dm0Var.V;
            ArrayList arrayList5 = dm0Var.S;
            gp gpVar = dm0Var.f40469f0;
            dm0Var.X();
            if (!TextUtils.equals(str, dm0Var.f40468e0)) {
                dm0Var.f40468e0 = str;
                org.telegram.messenger.g0.r(gpVar);
                if (TextUtils.isEmpty(dm0Var.f40468e0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    dm0Var.O(true);
                    dm0Var.f40467d0++;
                    z16 = false;
                    dm0Var.Z = false;
                    dm0Var.f40464a0 = false;
                    dm0Var.f40465b0 = false;
                    dm0Var.f40466c0 = 0;
                    if (tj0Var != null) {
                        tj0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.g0.i3(gpVar, 1000L);
                    dm0Var.Z = true;
                    dm0Var.f40464a0 = true;
                    dm0Var.O(true);
                    if (tj0Var != null) {
                        z16 = false;
                        tj0Var.v0(0);
                    }
                }
                this.f34756j0.b(this.Q0, z16);
            }
            z16 = false;
            this.f34756j0.b(this.Q0, z16);
        } else if (view == this.f34759n0) {
            wl0 wl0Var = this.f34763r0;
            tj0 tj0Var2 = wl0Var.d;
            ArrayList arrayList6 = wl0Var.W;
            rr rrVar = wl0Var.f39777i0;
            if (TextUtils.equals(str, wl0Var.f39776h0)) {
                z15 = false;
            } else {
                wl0Var.f39776h0 = str;
                org.telegram.messenger.g0.r(rrVar);
                if (TextUtils.isEmpty(wl0Var.f39776h0)) {
                    arrayList6.clear();
                    wl0Var.O(true);
                    wl0Var.f39775g0++;
                    z15 = false;
                    wl0Var.f39771c0 = false;
                    wl0Var.f39772d0 = false;
                    wl0Var.f39773e0 = false;
                    wl0Var.f39774f0 = 0;
                    if (tj0Var2 != null) {
                        tj0Var2.v0(0);
                    }
                } else {
                    z15 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.i3(rrVar, 1000L);
                    wl0Var.f39771c0 = true;
                    wl0Var.f39772d0 = true;
                    wl0Var.O(true);
                    if (tj0Var2 != null) {
                        tj0Var2.v0(0);
                    }
                }
            }
            this.f34760o0.b(this.Q0, z15);
            if (TextUtils.isEmpty(str)) {
                wl0Var.W();
            }
        } else {
            bf0 bf0Var = this.f34764s0;
            if (view == bf0Var) {
                l41 l41Var = bf0Var.f32170c;
                ArrayList arrayList7 = bf0Var.f32173n;
                if (!TextUtils.equals(bf0Var.f32177x, str)) {
                    if (bf0Var.L >= 0) {
                        ConnectionsManager.getInstance(bf0Var.f32169b).cancelRequest(bf0Var.L, true);
                        bf0Var.L = -1;
                    }
                    bf0Var.f32176w = false;
                    bf0Var.I.setLoading(false);
                    bf0Var.f32177x = str;
                    if (TextUtils.isEmpty(str)) {
                        bf0Var.f32174r = 0;
                        bf0Var.M++;
                        bf0Var.f32175s = false;
                        arrayList7.clear();
                        bf0Var.a(false);
                    } else {
                        bf0Var.b(str);
                        bf0Var.f32174r = 0;
                        bf0Var.M++;
                        bf0Var.f32175s = false;
                        arrayList7.clear();
                    }
                    bf0Var.d();
                    l41Var.v0(0);
                    l41Var.f35594g3.O(true);
                }
            } else if (view == this.f34766u0) {
                if (q20.Y(str, null) != null) {
                    if (z10) {
                        this.f34768w0.h1(0, 0);
                    }
                    zl0Var.Z(str);
                    this.f34767v0.b(this.Q0, false);
                }
            } else if (view == this.f34746a0) {
                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                org.telegram.ui.wz wzVar2 = this.P0;
                if ((i13 == 0 && this.W0 == 0 && j13 == 0 && j14 == 0) || j15 != 0) {
                    this.L0 = false;
                    bm0Var.T(z18 ? 1 : 0, str);
                    bm0Var.B0 = this.O0;
                    wzVar2.animate().setListener(null).cancel();
                    wzVar2.i(null, false);
                    if (z10) {
                        if (bm0Var.E0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        vl0Var.e(!z14, false);
                        if (bm0Var.E0 <= 0) {
                            z17 = false;
                        }
                        vl0Var.e(z17, false);
                    } else if (!bm0Var.M()) {
                        if (bm0Var.E0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        vl0Var.e(z13, true);
                    }
                    if (z10) {
                        wzVar2.setVisibility(8);
                    } else if (wzVar2.getVisibility() != 8) {
                        wzVar2.animate().alpha(0.0f).setListener(new a60(this, 17)).setDuration(150L).start();
                    }
                    wzVar2.setTag(null);
                    wzVar = wzVar2;
                    z12 = false;
                } else {
                    wzVar2.setTag(1);
                    wzVar2.i(this.O0, false);
                    wzVar2.animate().setListener(null).cancel();
                    if (z10) {
                        wzVar2.setVisibility(0);
                        wzVar2.setAlpha(1.0f);
                        z11 = z10;
                    } else {
                        if (wzVar2.getVisibility() != 0) {
                            wzVar2.setVisibility(0);
                            wzVar2.setAlpha(0.0f);
                        } else {
                            z17 = z10;
                        }
                        wzVar2.animate().alpha(1.0f).setDuration(150L).start();
                        z11 = z17;
                    }
                    wzVar = wzVar2;
                    z12 = false;
                    this.P0.h(j11, this.W0, j13, j14, null, z18, str, z11);
                    vl0Var.setVisibility(8);
                }
                vl0Var.b(this.Q0, z12);
                wzVar.f51640c.b(this.Q0, z12);
            } else {
                long j17 = j13;
                long j18 = j14;
                if (view instanceof org.telegram.ui.wz) {
                    org.telegram.ui.wz wzVar3 = (org.telegram.ui.wz) view;
                    if (j15 == 0) {
                        z17 = false;
                    }
                    wzVar3.setUseFromUserAsAvatar(z17);
                    wzVar3.f51640c.b(this.Q0, false);
                    wzVar3.h(j11, this.W0, j17, j18, kg.n0.f17105k3[((hm0) ((ArrayList) this.W.f5682b).get(i3)).f34456b], z18, str, z10);
                } else if (view instanceof hl0) {
                    hl0 hl0Var = (hl0) view;
                    hl0Var.f34442a.b(this.Q0, false);
                    hl0Var.L = str;
                    hl0Var.d(false);
                }
            }
        }
    }

    public final void R(boolean z10) {
        sj0 sj0Var;
        sj0 sj0Var2;
        sj0 sj0Var3;
        int i3;
        boolean z11;
        int i10;
        int i11;
        org.telegram.ui.ew ewVar;
        int i12;
        if (this.B0 != z10) {
            org.telegram.ui.uw uwVar = this.M0;
            if (!z10 || !uwVar.getActionBar().v()) {
                if (z10 && !uwVar.getActionBar().e("search_view_pager")) {
                    this.I0 = uwVar.getActionBar().n("search_view_pager");
                    if (uwVar.X) {
                        ImageView imageView = new ImageView(getContext());
                        this.f34771z0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f34771z0.setImageDrawable(new org.telegram.ui.ActionBar.w1(true));
                        org.telegram.ui.ActionBar.r6.t(this.f34771z0, org.telegram.ui.ActionBar.k6.f28275y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f34771z0;
                        int i13 = org.telegram.ui.ActionBar.k6.f28292z8;
                        org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i13), null);
                        this.f34771z0.setOnClickListener(new ga0(this, 11));
                        this.I0.addView(this.f34771z0, b8.mf.p(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.I0.getContext());
                    this.A0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.A0.setTypeface(org.telegram.messenger.g0.o());
                    fm0 fm0Var = this.A0;
                    int i14 = org.telegram.ui.ActionBar.k6.f28275y8;
                    lf0 lf0Var = new lf0(3);
                    lf0 lf0Var2 = new lf0(4);
                    int Q = org.telegram.ui.ActionBar.r6.Q(i14, -1, 0, 0.0f, null);
                    lf0Var2.f(Q, fm0Var);
                    org.telegram.ui.ActionBar.l6 x10 = org.telegram.ui.ActionBar.r6.x(101, fm0Var);
                    x10.c(i14, -1, 0, 0.0f, null);
                    x10.f28325n = lf0Var;
                    x10.f28326o = lf0Var2;
                    x10.f28324m = false;
                    x10.f28319g = Q;
                    org.telegram.ui.ActionBar.x xVar = this.I0;
                    fm0 fm0Var2 = this.A0;
                    if (uwVar.X) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    xVar.addView(fm0Var2, b8.mf.m(1.0f, 0, -1, i12, 0, 0));
                    this.A0.setOnTouchListener(new fi.a(21));
                    org.telegram.ui.ActionBar.q0 h = this.I0.h(203, 2131230879, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131754801, null));
                    this.E0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.r6.t(this.E0.getIconView(), i14, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.F0 = this.I0.h(200, 2131232224, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131754877, null));
                    this.G0 = this.I0.h(201, 2131232165, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131750588, null));
                    this.H0 = this.I0.h(202, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.bd.M0(2131751599, null));
                }
                if (this.A0 != null) {
                    bm0 bm0Var = this.f34751e0;
                    if (bm0Var != null && (ewVar = bm0Var.V) != null && ewVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0.getLayoutParams();
                    if (uwVar.X) {
                        i10 = 18;
                    } else {
                        i10 = 72;
                    }
                    if (z11) {
                        i11 = 56;
                    } else {
                        i11 = 0;
                    }
                    marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(i10 + i11);
                    fm0 fm0Var3 = this.A0;
                    fm0Var3.setLayoutParams(fm0Var3.getLayoutParams());
                }
                if (uwVar.getActionBar().getBackButton() != null && (uwVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.r4)) {
                    org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
                    uwVar.getActionBar().setBackButtonDrawable(w1Var);
                    w1Var.setColorFilter(null);
                }
                this.B0 = z10;
                HashMap hashMap = this.C0;
                if (z10) {
                    org.telegram.messenger.g0.v1(uwVar.getParentActivity().getCurrentFocus());
                    uwVar.getActionBar().O(null, null);
                    this.A0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.q0 q0Var = this.E0;
                    if (O()) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    q0Var.setVisibility(i3);
                    this.F0.setVisibility(0);
                    this.G0.setVisibility(0);
                    this.H0.setVisibility(0);
                    return;
                }
                uwVar.getActionBar().u();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.wz) && (sj0Var3 = ((org.telegram.ui.wz) getChildAt(i15)).d) != null) {
                        sj0Var3.f();
                    }
                    if (getChildAt(i15) instanceof hl0) {
                        ((hl0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.wz wzVar = this.P0;
                if (wzVar != null && (sj0Var2 = wzVar.d) != null) {
                    sj0Var2.f();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.wz) && (sj0Var = ((org.telegram.ui.wz) view).d) != null) {
                        sj0Var.f();
                    }
                }
            }
        }
    }

    public final void S() {
        this.W.l();
        k(false);
        d61 d61Var = this.N;
        if (d61Var != null) {
            d61Var.f36054y.f();
        }
    }

    @Override
    public final void b(eh.a aVar, RectF rectF) {
        aVar.f9978a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.f34746a0;
                tj0 tj0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        tj0Var = this.f34748b0;
                    } else if (view == this.f34755i0) {
                        tj0Var = this.f34758l0;
                    } else if (view == this.f34759n0) {
                        tj0Var = this.f34762q0;
                    } else if (view == this.f34766u0) {
                        tj0Var = this.f34769x0;
                    } else {
                        hl0 hl0Var = this.J0;
                        if (view == hl0Var) {
                            tj0Var = hl0Var.f34443b;
                        } else {
                            bf0 bf0Var = this.f34764s0;
                            if (view == bf0Var) {
                                tj0Var = bf0Var.f32170c;
                            } else if (view instanceof org.telegram.ui.wz) {
                                tj0Var = ((org.telegram.ui.wz) view).f51638b;
                            }
                        }
                    }
                }
                if (tj0Var != null) {
                    jh.d.a(tj0Var, canvas, rectF, tj0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.wz wzVar = this.P0;
                    if (wzVar.getVisibility() == 0) {
                        org.telegram.ui.xs xsVar = wzVar.f51638b;
                        jh.d.a(xsVar, canvas, rectF, xsVar, this);
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.f23228f3;
        boolean z10 = false;
        dm0 dm0Var = this.m0;
        if (i3 == i11) {
            if (org.telegram.messenger.hp.s1(this.K0).L0(0L) != null) {
                z10 = true;
            }
            this.f34756j0.e(z10, true);
            dm0Var.X();
            dm0Var.O(true);
        } else if (i3 != org.telegram.messenger.hs.f23341y1 && i3 != org.telegram.messenger.hs.f23298s) {
            if (i3 == org.telegram.messenger.hs.V0) {
                this.f34763r0.O(true);
            } else if (i3 == org.telegram.messenger.hs.f23338x5) {
                Object obj = objArr[0];
                zl0 zl0Var = this.f34770y0;
                if (obj == zl0Var.T) {
                    zl0Var.O(true);
                }
            }
        } else {
            dm0Var.X();
            dm0Var.O(true);
        }
    }

    public org.telegram.ui.ActionBar.x getActionMode() {
        return this.I0;
    }

    public ArrayList<kg.l0> getCurrentSearchFilters() {
        return this.D0;
    }

    public hl0 getDownloadsContainer() {
        return this.J0;
    }

    public int getFolderId() {
        return this.U0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.q0 getSpeedItem() {
        return this.E0;
    }

    public m61 getTabsView() {
        return this.N;
    }

    @Override
    public final void h() {
        R(true);
    }

    @Override
    public final boolean n(org.telegram.ui.pz pzVar) {
        return this.C0.containsKey(pzVar);
    }

    @Override
    public final void o(org.telegram.messenger.zi ziVar) {
        this.M0.presentFragment(M(this.K0, ziVar));
        R(false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        za.p pVar = this.Z0;
        if (pVar != null) {
            pVar.a();
            this.Z0 = null;
        }
        za.p pVar2 = new za.p(org.telegram.messenger.hs.f(this.K0), this);
        pVar2.b(org.telegram.messenger.hs.f23228f3);
        pVar2.b(org.telegram.messenger.hs.f23341y1);
        pVar2.b(org.telegram.messenger.hs.f23298s);
        pVar2.b(org.telegram.messenger.hs.V0);
        pVar2.b(org.telegram.messenger.hs.f23338x5);
        this.Z0 = pVar2;
        this.f34754h0 = true;
        dm0 dm0Var = this.m0;
        if (dm0Var != null) {
            dm0Var.O(false);
        }
        wl0 wl0Var = this.f34763r0;
        if (wl0Var != null) {
            wl0Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f34754h0 = false;
        za.p pVar = this.Z0;
        if (pVar != null) {
            pVar.a();
            this.Z0 = null;
        }
    }

    @Override
    public final void q() {
        this.T0.L();
    }

    @Override
    public final void r(View view, View view2, int i3, int i10) {
        boolean z10;
        bm0 bm0Var = this.f34751e0;
        org.telegram.ui.wz wzVar = this.P0;
        if (i3 == 0) {
            if (wzVar.getVisibility() == 0) {
                wzVar.i(this.O0, false);
                bm0Var.B0 = null;
            } else {
                wzVar.i(null, false);
                org.telegram.ui.nz nzVar = this.O0;
                bm0Var.B0 = nzVar;
                if (nzVar != null) {
                    ((org.telegram.ui.du) nzVar).j(false, null, bm0Var.f16989z0, bm0Var.A0);
                }
            }
        } else if (view instanceof org.telegram.ui.wz) {
            if (i10 == 0 && wzVar.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.wz) view).i(this.O0, z10);
        }
        if (view2 instanceof org.telegram.ui.wz) {
            ((org.telegram.ui.wz) view2).i(null, false);
            return;
        }
        bm0Var.B0 = null;
        wzVar.i(null, false);
    }

    public void setBlurredBackgroundDrawableFactory(eh.c cVar) {
        this.f34747a1 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.nz nzVar) {
        this.O0 = nzVar;
    }

    public void setKeyboardHeight(int i3) {
        boolean z10;
        this.Q0 = i3;
        if (getVisibility() == 0 && getAlpha() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof org.telegram.ui.wz) {
                ((org.telegram.ui.wz) getChildAt(i10)).f51640c.b(i3, z10);
            } else if (getChildAt(i10) == this.f34746a0) {
                this.f34749c0.b(i3, z10);
                this.P0.f51640c.b(i3, z10);
            } else if (getChildAt(i10) instanceof hl0) {
                ((hl0) getChildAt(i10)).f34442a.b(i3, z10);
            } else if (getChildAt(i10) == this.f34755i0) {
                this.f34756j0.b(i3, z10);
            }
        }
    }

    @Override
    public void setPosition(int i3) {
        if (i3 < 0) {
            return;
        }
        super.setPosition(i3);
        this.h.clear();
        d61 d61Var = this.N;
        if (d61Var != null) {
            d61Var.f(1.0f, i3);
        }
        invalidate();
    }

    @Override
    public final void w(org.telegram.messenger.zi ziVar, View view, int i3) {
        boolean z10;
        int i10;
        int i11;
        org.telegram.ui.pz pzVar = new org.telegram.ui.pz(ziVar.f1(), org.telegram.messenger.zi.B0(ziVar.f26868k));
        HashMap hashMap = this.C0;
        if (hashMap.containsKey(pzVar)) {
            hashMap.remove(pzVar);
        } else if (hashMap.size() < 100) {
            hashMap.put(pzVar, ziVar);
        } else {
            return;
        }
        int i12 = 0;
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.A0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.q0 q0Var = this.F0;
            if (q0Var != null) {
                if (hashMap.size() == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                q0Var.setVisibility(i11);
            }
            if (this.E0 != null) {
                boolean O = O();
                if (O) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if (this.E0.getVisibility() != i10) {
                    this.E0.setVisibility(i10);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.E0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.r6.y(this, animatedVectorDrawable, org.telegram.ui.ActionBar.k6.f28275y8, null, PorterDuff.Mode.SRC_IN);
                    if (O) {
                        animatedVectorDrawable.start();
                    } else {
                        animatedVectorDrawable.reset();
                    }
                }
            }
            if (this.H0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((org.telegram.messenger.zi) hashMap.get((org.telegram.ui.pz) it.next())).Q) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                org.telegram.ui.ActionBar.q0 q0Var2 = this.H0;
                if (!z10) {
                    i12 = 8;
                }
                q0Var2.setVisibility(i12);
            }
        }
        if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).b(hashMap.containsKey(pzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).b(i3, hashMap.containsKey(pzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).f(hashMap.containsKey(pzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.f7) {
            ((org.telegram.ui.Cells.f7) view).e(hashMap.containsKey(pzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view).c(hashMap.containsKey(pzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).c0(hashMap.containsKey(pzVar), true);
        }
    }
}
