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
public abstract class tm0 extends k71 implements org.telegram.ui.a00, org.telegram.messenger.fs, eh.a {
    public static final int f40079b1 = 0;
    public qm0 A0;
    public boolean B0;
    public final HashMap C0;
    public final ArrayList D0;
    public org.telegram.ui.ActionBar.q0 E0;
    public org.telegram.ui.ActionBar.q0 F0;
    public org.telegram.ui.ActionBar.q0 G0;
    public org.telegram.ui.ActionBar.q0 H0;
    public org.telegram.ui.ActionBar.y I0;
    public sl0 J0;
    public final int K0;
    public boolean L0;
    public final org.telegram.ui.bx M0;
    public String N0;
    public org.telegram.ui.sz O0;
    public final org.telegram.ui.b00 P0;
    public int Q0;
    public boolean R0;
    public final org.telegram.ui.gv S0;
    public final cu0 T0;
    public final int U0;
    public int V0;
    public final di.i4 W;
    public final long W0;
    public int X0;
    public int Y0;
    public xi.e Z0;
    public final FrameLayout f40080a0;
    public dh.c f40081a1;
    public final di.b1 f40082b0;
    public final gm0 f40083c0;
    public final v4.l f40084d0;
    public final mm0 f40085e0;
    public final v4.c0 f40086f0;
    public final hj0 f40087g0;
    public boolean f40088h0;
    public final FrameLayout f40089i0;
    public final gm0 f40090j0;
    public final v4.c0 f40091k0;
    public final ek0 f40092l0;
    public final om0 m0;
    public final FrameLayout f40093n0;
    public final gm0 f40094o0;
    public final v4.c0 f40095p0;
    public final ek0 f40096q0;
    public final hm0 f40097r0;
    public final nf0 f40098s0;
    public boolean f40099t0;
    public final FrameLayout f40100u0;
    public final gm0 f40101v0;
    public final v4.c0 f40102w0;
    public final ek0 f40103x0;
    public final km0 f40104y0;
    public ImageView f40105z0;

    public tm0(Context context, org.telegram.ui.bx bxVar, int i7, int i10, int i11, long j3, org.telegram.ui.gv gvVar) {
        super(context, null);
        int i12;
        int i13;
        int i14;
        int i15;
        this.f40099t0 = false;
        this.C0 = new HashMap();
        this.D0 = new ArrayList();
        int i16 = org.telegram.messenger.i10.f24637t0;
        this.K0 = i16;
        this.V0 = 0;
        this.U0 = i11;
        this.W0 = j3;
        this.M0 = bxVar;
        this.S0 = gvVar;
        v4.l lVar = new v4.l();
        this.f40084d0 = lVar;
        lVar.f59318c = 150L;
        lVar.f59319e = 350L;
        lVar.f59320f = 0L;
        lVar.f59321g = 0L;
        lVar.d = 0L;
        lVar.f59322i = new OvershootInterpolator(1.1f);
        lVar.f59296o = kr.h;
        org.telegram.ui.jw jwVar = (org.telegram.ui.jw) this;
        this.f40085e0 = new mm0(jwVar, context, bxVar, i7, i10, lVar, bxVar.G, bxVar, context);
        if (i10 == 15) {
            ArrayList d42 = bxVar.d4(i16, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 < d42.size(); i17 = com.google.android.gms.internal.vision.e2.g(i17, 1, ((TLRPC.Dialog) d42.get(i17)).f28496id, arrayList)) {
            }
            this.f40085e0.f17583r0 = arrayList;
        }
        this.T0 = (cu0) bxVar.getFragmentView();
        di.b1 b1Var = new di.b1(25, context, jwVar);
        this.f40082b0 = b1Var;
        b1Var.setItemAnimator(this.f40084d0);
        b1Var.setPivotY(0.0f);
        b1Var.setClipToPadding(false);
        b1Var.setAdapter(this.f40085e0);
        b1Var.setVerticalScrollBarEnabled(true);
        b1Var.setInstantClick(true);
        if (org.telegram.messenger.gd.f24314a0) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        b1Var.setVerticalScrollbarPosition(i12);
        v4.c0 c0Var = new v4.c0(1, false);
        this.f40086f0 = c0Var;
        b1Var.setLayoutManager(c0Var);
        b1Var.X1 = true;
        b1Var.Y1 = 0;
        b1Var.setOnScrollListener(new im0(jwVar, bxVar, 2));
        b1Var.D0(new eb0(jwVar, 22));
        org.telegram.ui.b00 b00Var = new org.telegram.ui.b00(this.M0);
        this.P0 = b00Var;
        org.telegram.ui.dt dtVar = b00Var.f45845b;
        dtVar.setClipToPadding(false);
        dtVar.j(new lm0(jwVar, 1));
        dtVar.D0(new eb0(jwVar, 22));
        b00Var.setUiCallback(this);
        b00Var.setVisibility(8);
        b00Var.setChatPreviewDelegate(gvVar);
        vz vzVar = new vz(context, null);
        vzVar.setViewType(1);
        gm0 gm0Var = new gm0(jwVar, context, vzVar, 2);
        this.f40083c0 = gm0Var;
        gm0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        gm0Var.f37553e.setVisibility(8);
        gm0Var.setVisibility(8);
        gm0Var.addView(vzVar, 0);
        gm0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40080a0 = frameLayout;
        frameLayout.addView(gm0Var);
        frameLayout.addView(b1Var);
        frameLayout.addView(b00Var);
        b1Var.setEmptyView(gm0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f40089i0 = frameLayout2;
        nm0 nm0Var = new nm0(jwVar);
        nm0Var.f59274m = false;
        nm0Var.C = false;
        kr krVar = kr.h;
        nm0Var.o(krVar);
        nm0Var.n(350L);
        ek0 ek0Var = new ek0(context, null);
        this.f40092l0 = ek0Var;
        ek0Var.setItemAnimator(nm0Var);
        ek0Var.setPivotY(0.0f);
        ek0Var.setVerticalScrollBarEnabled(true);
        ek0Var.setInstantClick(true);
        if (org.telegram.messenger.gd.f24314a0) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        ek0Var.setVerticalScrollbarPosition(i13);
        v4.c0 c0Var2 = new v4.c0(1, false);
        this.f40091k0 = c0Var2;
        ek0Var.setLayoutManager(c0Var2);
        ek0Var.X1 = true;
        ek0Var.Y1 = 0;
        ek0Var.setClipToPadding(false);
        vz vzVar2 = new vz(context, null);
        vzVar2.setViewType(1);
        gm0 gm0Var2 = new gm0(jwVar, context, vzVar2, 3);
        this.f40090j0 = gm0Var2;
        gm0Var2.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        gm0Var2.f37553e.setVisibility(8);
        gm0Var2.setVisibility(8);
        gm0Var2.addView(vzVar2, 0);
        gm0Var2.e(true, false);
        frameLayout2.addView(gm0Var2);
        frameLayout2.addView(ek0Var);
        ek0Var.setEmptyView(gm0Var2);
        om0 om0Var = new om0(jwVar, ek0Var, context, this.K0, i11, bxVar);
        this.m0 = om0Var;
        ek0Var.setAdapter(om0Var);
        ek0Var.setOnScrollListener(new im0(jwVar, bxVar, 3));
        ek0Var.D0(new eb0(jwVar, 22));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f40093n0 = frameLayout3;
        fm0 fm0Var = new fm0(jwVar);
        fm0Var.f59274m = false;
        fm0Var.C = false;
        fm0Var.o(krVar);
        fm0Var.n(350L);
        ek0 ek0Var2 = new ek0(context, null);
        this.f40096q0 = ek0Var2;
        ek0Var2.setItemAnimator(fm0Var);
        ek0Var2.setPivotY(0.0f);
        ek0Var2.setClipToPadding(false);
        ek0Var2.setVerticalScrollBarEnabled(true);
        ek0Var2.setInstantClick(true);
        if (org.telegram.messenger.gd.f24314a0) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        ek0Var2.setVerticalScrollbarPosition(i14);
        v4.c0 c0Var3 = new v4.c0(1, false);
        this.f40095p0 = c0Var3;
        ek0Var2.setLayoutManager(c0Var3);
        ek0Var2.X1 = true;
        ek0Var2.Y1 = 0;
        vz vzVar3 = new vz(context, null);
        vzVar3.setViewType(1);
        gm0 gm0Var3 = new gm0(jwVar, context, vzVar3, 0);
        this.f40094o0 = gm0Var3;
        gm0Var3.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        gm0Var3.f37553e.setVisibility(8);
        gm0Var3.setVisibility(8);
        gm0Var3.addView(vzVar3, 0);
        gm0Var3.e(true, false);
        frameLayout3.addView(gm0Var3);
        frameLayout3.addView(ek0Var2);
        ek0Var2.setEmptyView(gm0Var3);
        hm0 hm0Var = new hm0(jwVar, ek0Var2, context, this.K0, i11);
        this.f40097r0 = hm0Var;
        ek0Var2.setAdapter(hm0Var);
        ek0Var2.setOnScrollListener(new im0(jwVar, bxVar, 0));
        ek0Var2.D0(new eb0(jwVar, 22));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f40100u0 = frameLayout4;
        jm0 jm0Var = new jm0(jwVar);
        jm0Var.f59274m = false;
        jm0Var.C = false;
        jm0Var.o(krVar);
        jm0Var.n(350L);
        ek0 ek0Var3 = new ek0(context, null);
        this.f40103x0 = ek0Var3;
        ek0Var3.setItemAnimator(jm0Var);
        ek0Var3.setPivotY(0.0f);
        ek0Var3.setVerticalScrollBarEnabled(true);
        ek0Var3.setInstantClick(true);
        if (org.telegram.messenger.gd.f24314a0) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        ek0Var3.setVerticalScrollbarPosition(i15);
        v4.c0 c0Var4 = new v4.c0(1, false);
        this.f40102w0 = c0Var4;
        ek0Var3.setLayoutManager(c0Var4);
        ek0Var3.X1 = true;
        ek0Var3.Y1 = 0;
        ek0Var3.setClipToPadding(false);
        vz vzVar4 = new vz(context, null);
        vzVar4.setViewType(1);
        gm0 gm0Var4 = new gm0(jwVar, context, vzVar4, 1);
        this.f40101v0 = gm0Var4;
        gm0Var4.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        gm0Var4.f37553e.setVisibility(8);
        gm0Var4.setVisibility(8);
        gm0Var4.addView(vzVar4, 0);
        gm0Var4.e(true, false);
        frameLayout4.addView(gm0Var4);
        frameLayout4.addView(ek0Var3);
        ek0Var3.setEmptyView(gm0Var4);
        km0 km0Var = new km0(jwVar, ek0Var3, context, this.K0);
        this.f40104y0 = km0Var;
        ek0Var3.setAdapter(km0Var);
        ek0Var3.setOnScrollListener(new im0(jwVar, bxVar, 1));
        ek0Var3.D0(new eb0(jwVar, 22));
        this.f40087g0 = new hj0(b1Var, true);
        nf0 nf0Var = new nf0(context, bxVar);
        this.f40098s0 = nf0Var;
        g51 g51Var = nf0Var.f37773c;
        g51Var.setClipToPadding(false);
        g51Var.j(new lm0(jwVar, 0));
        g51Var.D0(new eb0(jwVar, 22));
        di.i4 i4Var = new di.i4(jwVar);
        this.W = i4Var;
        setAdapter(i4Var);
    }

    public static org.telegram.ui.bn K(int i7, org.telegram.messenger.fj fjVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
        if (org.telegram.messenger.n5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.n5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i7).f23343a).O0(Long.valueOf(-B0));
            if (O0 != null && O0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -O0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", fjVar.e1());
        return new org.telegram.ui.bn(bundle);
    }

    public static void O(FrameLayout frameLayout, ek0 ek0Var, int i7, int i10, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i7, 0, i10);
        if (z10) {
            ek0Var.q1(0, i7, 0, i10);
        } else {
            ek0Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ek0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
    }

    @Override
    public final void B(org.telegram.messenger.fj fjVar) {
        this.M0.presentFragment(K(this.K0, fjVar));
        P(false);
    }

    public final void J() {
        if (this.f40099t0) {
            int i7 = 0;
            this.f40099t0 = false;
            Q();
            a71 a71Var = this.N;
            if (a71Var != null && a71Var.getCurrentTabId() != 0) {
                this.N.e(0, 0);
            }
            mm0 mm0Var = this.f40085e0;
            if (mm0Var != null) {
                String str = this.N0;
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.D0;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else if (((jg.o0) arrayList.get(i10)).d == 7) {
                        i7 = 1;
                        break;
                    } else {
                        i10++;
                    }
                }
                mm0Var.T(i7, str);
            }
        }
    }

    public final int L(int i7) {
        int i10 = 0;
        while (true) {
            di.i4 i4Var = this.W;
            ArrayList arrayList = (ArrayList) i4Var.f8998b;
            if (i10 < ((ArrayList) i4Var.f8998b).size()) {
                if (((sm0) arrayList.get(i10)).f39652a == 3 && ((sm0) arrayList.get(i10)).f39653b == i7) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final boolean M() {
        int i7 = this.K0;
        if (!org.telegram.messenger.i10.i(i7).q() && !org.telegram.messenger.mp.u1(i7).K3()) {
            for (org.telegram.messenger.fj fjVar : this.C0.values()) {
                if (fjVar.F0() != null && fjVar.F0().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void N(View view, int i7, String str, boolean z10) {
        long j3;
        long j10;
        boolean z11;
        org.telegram.ui.b00 b00Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        gm0 gm0Var = this.f40083c0;
        boolean z17 = true;
        if (isEmpty) {
            gm0Var.f37553e.setVisibility(8);
        } else {
            gm0Var.f37553e.setVisibility(0);
            gm0Var.f37553e.setText(org.telegram.messenger.gd.a0(null, null, 2131747972, str));
        }
        mm0 mm0Var = this.f40085e0;
        org.telegram.ui.lw lwVar = mm0Var.V;
        if (lwVar != null) {
            j3 = lwVar.a();
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
        boolean z18 = false;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i11 >= arrayList.size()) {
                break;
            }
            jg.o0 o0Var = (jg.o0) arrayList.get(i11);
            int i12 = o0Var.d;
            if (i12 == 4) {
                TLObject tLObject = o0Var.f17702f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f28641id;
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.v3.Y((TLRPC.Chat) tLObject)) {
                    i10 = i11;
                } else {
                    j11 = -((TLRPC.Chat) o0Var.f17702f).f28492id;
                }
                i10 = i11;
                j10 = j11;
            } else if (i12 == 6) {
                jg.m0 m0Var = o0Var.f17703g;
                long j15 = m0Var.f17681b;
                i10 = i11;
                j13 = m0Var.f17682c;
                j12 = j15;
            } else {
                i10 = i11;
                if (i12 == 7) {
                    z18 = true;
                }
            }
            i11 = i10 + 1;
        }
        km0 km0Var = this.f40104y0;
        km0Var.getClass();
        if (f30.Y(str, null) == null) {
            J();
        }
        if (view == this.f40089i0) {
            org.telegram.messenger.mp.u1(this.K0).N0(0L);
            om0 om0Var = this.m0;
            ek0 ek0Var = om0Var.d;
            ArrayList arrayList2 = om0Var.T;
            ArrayList arrayList3 = om0Var.U;
            ArrayList arrayList4 = om0Var.V;
            ArrayList arrayList5 = om0Var.S;
            lo loVar = om0Var.f36508f0;
            om0Var.X();
            if (!TextUtils.equals(str, om0Var.f36507e0)) {
                om0Var.f36507e0 = str;
                org.telegram.messenger.g0.r(loVar);
                if (TextUtils.isEmpty(om0Var.f36507e0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    om0Var.O(true);
                    om0Var.f36506d0++;
                    z16 = false;
                    om0Var.Z = false;
                    om0Var.f36503a0 = false;
                    om0Var.f36504b0 = false;
                    om0Var.f36505c0 = 0;
                    if (ek0Var != null) {
                        ek0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.g0.h3(loVar, 1000L);
                    om0Var.Z = true;
                    om0Var.f36503a0 = true;
                    om0Var.O(true);
                    if (ek0Var != null) {
                        z16 = false;
                        ek0Var.v0(0);
                    }
                }
                this.f40090j0.b(this.Q0, z16);
            }
            z16 = false;
            this.f40090j0.b(this.Q0, z16);
        } else if (view == this.f40093n0) {
            hm0 hm0Var = this.f40097r0;
            ek0 ek0Var2 = hm0Var.d;
            ArrayList arrayList6 = hm0Var.W;
            ds dsVar = hm0Var.f35810i0;
            if (TextUtils.equals(str, hm0Var.f35809h0)) {
                z15 = false;
            } else {
                hm0Var.f35809h0 = str;
                org.telegram.messenger.g0.r(dsVar);
                if (TextUtils.isEmpty(hm0Var.f35809h0)) {
                    arrayList6.clear();
                    hm0Var.O(true);
                    hm0Var.f35808g0++;
                    z15 = false;
                    hm0Var.f35804c0 = false;
                    hm0Var.f35805d0 = false;
                    hm0Var.f35806e0 = false;
                    hm0Var.f35807f0 = 0;
                    if (ek0Var2 != null) {
                        ek0Var2.v0(0);
                    }
                } else {
                    z15 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.h3(dsVar, 1000L);
                    hm0Var.f35804c0 = true;
                    hm0Var.f35805d0 = true;
                    hm0Var.O(true);
                    if (ek0Var2 != null) {
                        ek0Var2.v0(0);
                    }
                }
            }
            this.f40094o0.b(this.Q0, z15);
            if (TextUtils.isEmpty(str)) {
                hm0Var.W();
            }
        } else {
            nf0 nf0Var = this.f40098s0;
            if (view == nf0Var) {
                g51 g51Var = nf0Var.f37773c;
                ArrayList arrayList7 = nf0Var.f37776n;
                if (!TextUtils.equals(nf0Var.f37780x, str)) {
                    if (nf0Var.L >= 0) {
                        ConnectionsManager.getInstance(nf0Var.f37772b).cancelRequest(nf0Var.L, true);
                        nf0Var.L = -1;
                    }
                    nf0Var.f37779w = false;
                    nf0Var.I.setLoading(false);
                    nf0Var.f37780x = str;
                    if (TextUtils.isEmpty(str)) {
                        nf0Var.f37777r = 0;
                        nf0Var.M++;
                        nf0Var.f37778s = false;
                        arrayList7.clear();
                        nf0Var.a(false);
                    } else {
                        nf0Var.b(str);
                        nf0Var.f37777r = 0;
                        nf0Var.M++;
                        nf0Var.f37778s = false;
                        arrayList7.clear();
                    }
                    nf0Var.d();
                    g51Var.v0(0);
                    g51Var.f35323g3.O(true);
                }
            } else if (view == this.f40100u0) {
                if (f30.Y(str, null) != null) {
                    if (z10) {
                        this.f40102w0.h1(0, 0);
                    }
                    km0Var.Z(str);
                    this.f40101v0.b(this.Q0, false);
                }
            } else if (view == this.f40080a0) {
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                org.telegram.ui.b00 b00Var2 = this.P0;
                if ((i13 == 0 && this.W0 == 0 && j12 == 0 && j13 == 0) || j14 != 0) {
                    this.L0 = false;
                    mm0Var.T(z18 ? 1 : 0, str);
                    mm0Var.B0 = this.O0;
                    b00Var2.animate().setListener(null).cancel();
                    b00Var2.i(null, false);
                    if (z10) {
                        if (mm0Var.E0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        gm0Var.e(!z14, false);
                        if (mm0Var.E0 <= 0) {
                            z17 = false;
                        }
                        gm0Var.e(z17, false);
                    } else if (!mm0Var.M()) {
                        if (mm0Var.E0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        gm0Var.e(z13, true);
                    }
                    if (z10) {
                        b00Var2.setVisibility(8);
                    } else if (b00Var2.getVisibility() != 8) {
                        b00Var2.animate().alpha(0.0f).setListener(new p60(this, 17)).setDuration(150L).start();
                    }
                    b00Var2.setTag(null);
                    b00Var = b00Var2;
                    z12 = false;
                } else {
                    b00Var2.setTag(1);
                    b00Var2.i(this.O0, false);
                    b00Var2.animate().setListener(null).cancel();
                    if (z10) {
                        b00Var2.setVisibility(0);
                        b00Var2.setAlpha(1.0f);
                        z11 = z10;
                    } else {
                        if (b00Var2.getVisibility() != 0) {
                            b00Var2.setVisibility(0);
                            b00Var2.setAlpha(0.0f);
                        } else {
                            z17 = z10;
                        }
                        b00Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z11 = z17;
                    }
                    b00Var = b00Var2;
                    z12 = false;
                    this.P0.h(j10, this.W0, j12, j13, null, z18, str, z11);
                    gm0Var.setVisibility(8);
                }
                gm0Var.b(this.Q0, z12);
                b00Var.f45847c.b(this.Q0, z12);
            } else {
                long j16 = j12;
                long j17 = j13;
                if (view instanceof org.telegram.ui.b00) {
                    org.telegram.ui.b00 b00Var3 = (org.telegram.ui.b00) view;
                    if (j14 == 0) {
                        z17 = false;
                    }
                    b00Var3.setUseFromUserAsAvatar(z17);
                    b00Var3.f45847c.b(this.Q0, false);
                    b00Var3.h(j10, this.W0, j16, j17, jg.q0.f17716k3[((sm0) ((ArrayList) this.W.f8998b).get(i7)).f39653b], z18, str, z10);
                } else if (view instanceof sl0) {
                    sl0 sl0Var = (sl0) view;
                    sl0Var.f39638a.b(this.Q0, false);
                    sl0Var.L = str;
                    sl0Var.d(false);
                }
            }
        }
    }

    public final void P(boolean z10) {
        dk0 dk0Var;
        dk0 dk0Var2;
        dk0 dk0Var3;
        int i7;
        boolean z11;
        int i10;
        int i11;
        org.telegram.ui.lw lwVar;
        int i12;
        if (this.B0 != z10) {
            org.telegram.ui.bx bxVar = this.M0;
            if (!z10 || !bxVar.getActionBar().x()) {
                if (z10 && !bxVar.getActionBar().c("search_view_pager")) {
                    this.I0 = bxVar.getActionBar().p("search_view_pager");
                    if (bxVar.X) {
                        ImageView imageView = new ImageView(getContext());
                        this.f40105z0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f40105z0.setImageDrawable(new org.telegram.ui.ActionBar.x1(true));
                        org.telegram.ui.ActionBar.u6.s(this.f40105z0, org.telegram.ui.ActionBar.n6.f29845y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f40105z0;
                        int i13 = org.telegram.ui.ActionBar.n6.f29864z8;
                        org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i13, false), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i13), null);
                        this.f40105z0.setOnClickListener(new g70(this, 13));
                        this.I0.addView(this.f40105z0, c8.na.p(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.I0.getContext());
                    this.A0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.A0.setTypeface(org.telegram.messenger.g0.o());
                    qm0 qm0Var = this.A0;
                    int i14 = org.telegram.ui.ActionBar.n6.f29845y8;
                    ub0 ub0Var = new ub0(7);
                    ub0 ub0Var2 = new ub0(8);
                    int P = org.telegram.ui.ActionBar.u6.P(i14, -1, 0, 0.0f, null);
                    ub0Var2.g(P, qm0Var);
                    org.telegram.ui.ActionBar.o6 w10 = org.telegram.ui.ActionBar.u6.w(101, qm0Var);
                    w10.c(i14, -1, 0, 0.0f, null);
                    w10.f29912n = ub0Var;
                    w10.f29913o = ub0Var2;
                    w10.f29911m = false;
                    w10.f29906g = P;
                    org.telegram.ui.ActionBar.y yVar = this.I0;
                    qm0 qm0Var2 = this.A0;
                    if (bxVar.X) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    yVar.addView(qm0Var2, c8.na.m(1.0f, 0, -1, i12, 0, 0));
                    this.A0.setOnTouchListener(new gi.a(22));
                    org.telegram.ui.ActionBar.q0 h = this.I0.h(203, 2131230879, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131754800, null));
                    this.E0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.u6.s(this.E0.getIconView(), i14, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.F0 = this.I0.h(200, 2131232229, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131754877, null));
                    this.G0 = this.I0.h(201, 2131232170, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131750570, null));
                    this.H0 = this.I0.h(202, 2131232113, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131751586, null));
                }
                if (this.A0 != null) {
                    mm0 mm0Var = this.f40085e0;
                    if (mm0Var != null && (lwVar = mm0Var.V) != null && lwVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0.getLayoutParams();
                    if (bxVar.X) {
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
                    qm0 qm0Var3 = this.A0;
                    qm0Var3.setLayoutParams(qm0Var3.getLayoutParams());
                }
                if (bxVar.getActionBar().getBackButton() != null && (bxVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.s4)) {
                    org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
                    bxVar.getActionBar().setBackButtonDrawable(x1Var);
                    x1Var.setColorFilter(null);
                }
                this.B0 = z10;
                HashMap hashMap = this.C0;
                if (z10) {
                    org.telegram.messenger.g0.v1(bxVar.getParentActivity().getCurrentFocus());
                    bxVar.getActionBar().R(null, null);
                    this.A0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.q0 q0Var = this.E0;
                    if (M()) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    q0Var.setVisibility(i7);
                    this.F0.setVisibility(0);
                    this.G0.setVisibility(0);
                    this.H0.setVisibility(0);
                    return;
                }
                bxVar.getActionBar().w();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.b00) && (dk0Var3 = ((org.telegram.ui.b00) getChildAt(i15)).d) != null) {
                        dk0Var3.f();
                    }
                    if (getChildAt(i15) instanceof sl0) {
                        ((sl0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.b00 b00Var = this.P0;
                if (b00Var != null && (dk0Var2 = b00Var.d) != null) {
                    dk0Var2.f();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.b00) && (dk0Var = ((org.telegram.ui.b00) view).d) != null) {
                        dk0Var.f();
                    }
                }
            }
        }
    }

    public final void Q() {
        this.W.l();
        l(false);
        a71 a71Var = this.N;
        if (a71Var != null) {
            a71Var.f36350y.f();
        }
    }

    @Override
    public final void S(org.telegram.messenger.fj fjVar, View view, int i7) {
        boolean z10;
        int i10;
        int i11;
        org.telegram.ui.uz uzVar = new org.telegram.ui.uz(fjVar.e1(), org.telegram.messenger.fj.B0(fjVar.f24073k));
        HashMap hashMap = this.C0;
        if (hashMap.containsKey(uzVar)) {
            hashMap.remove(uzVar);
        } else if (hashMap.size() < 100) {
            hashMap.put(uzVar, fjVar);
        } else {
            return;
        }
        int i12 = 0;
        if (hashMap.size() == 0) {
            P(false);
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
                boolean M = M();
                if (M) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if (this.E0.getVisibility() != i10) {
                    this.E0.setVisibility(i10);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.E0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.u6.x(this, animatedVectorDrawable, org.telegram.ui.ActionBar.n6.f29845y8, null, PorterDuff.Mode.SRC_IN);
                    if (M) {
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
                        if (!((org.telegram.messenger.fj) hashMap.get((org.telegram.ui.uz) it.next())).Q) {
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
        if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).b(hashMap.containsKey(uzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.p7) {
            ((org.telegram.ui.Cells.p7) view).b(i7, hashMap.containsKey(uzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).f(hashMap.containsKey(uzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).e(hashMap.containsKey(uzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.i2) {
            ((org.telegram.ui.Cells.i2) view).c(hashMap.containsKey(uzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.u2) {
            ((org.telegram.ui.Cells.u2) view).e0(hashMap.containsKey(uzVar), true);
        }
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8363a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.f40080a0;
                ek0 ek0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        ek0Var = this.f40082b0;
                    } else if (view == this.f40089i0) {
                        ek0Var = this.f40092l0;
                    } else if (view == this.f40093n0) {
                        ek0Var = this.f40096q0;
                    } else if (view == this.f40100u0) {
                        ek0Var = this.f40103x0;
                    } else {
                        sl0 sl0Var = this.J0;
                        if (view == sl0Var) {
                            ek0Var = sl0Var.f39639b;
                        } else {
                            nf0 nf0Var = this.f40098s0;
                            if (view == nf0Var) {
                                ek0Var = nf0Var.f37773c;
                            } else if (view instanceof org.telegram.ui.b00) {
                                ek0Var = ((org.telegram.ui.b00) view).f45845b;
                            }
                        }
                    }
                }
                if (ek0Var != null) {
                    ih.d.a(ek0Var, canvas, rectF, ek0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.b00 b00Var = this.P0;
                    if (b00Var.getVisibility() == 0) {
                        org.telegram.ui.dt dtVar = b00Var.f45845b;
                        ih.d.a(dtVar, canvas, rectF, dtVar, this);
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.f25224h3;
        boolean z10 = false;
        om0 om0Var = this.m0;
        if (i7 == i11) {
            if (org.telegram.messenger.mp.u1(this.K0).N0(0L) != null) {
                z10 = true;
            }
            this.f40090j0.e(z10, true);
            om0Var.X();
            om0Var.O(true);
        } else if (i7 != org.telegram.messenger.ks.f25325y1 && i7 != org.telegram.messenger.ks.f25283s) {
            if (i7 == org.telegram.messenger.ks.V0) {
                this.f40097r0.O(true);
            } else if (i7 == org.telegram.messenger.ks.A5) {
                Object obj = objArr[0];
                km0 km0Var = this.f40104y0;
                if (obj == km0Var.T) {
                    km0Var.O(true);
                }
            }
        } else {
            om0Var.X();
            om0Var.O(true);
        }
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.I0;
    }

    public ArrayList<jg.o0> getCurrentSearchFilters() {
        return this.D0;
    }

    public sl0 getDownloadsContainer() {
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

    public j71 getTabsView() {
        return this.N;
    }

    @Override
    public final void h() {
        P(true);
    }

    @Override
    public final boolean i0() {
        return this.B0;
    }

    @Override
    public final boolean j(org.telegram.ui.uz uzVar) {
        return this.C0.containsKey(uzVar);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xi.e eVar = this.Z0;
        if (eVar != null) {
            eVar.b();
            this.Z0 = null;
        }
        xi.e eVar2 = new xi.e(org.telegram.messenger.ks.f(this.K0), this);
        eVar2.c(org.telegram.messenger.ks.f25224h3);
        eVar2.c(org.telegram.messenger.ks.f25325y1);
        eVar2.c(org.telegram.messenger.ks.f25283s);
        eVar2.c(org.telegram.messenger.ks.V0);
        eVar2.c(org.telegram.messenger.ks.A5);
        this.Z0 = eVar2;
        this.f40088h0 = true;
        om0 om0Var = this.m0;
        if (om0Var != null) {
            om0Var.O(false);
        }
        hm0 hm0Var = this.f40097r0;
        if (hm0Var != null) {
            hm0Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40088h0 = false;
        xi.e eVar = this.Z0;
        if (eVar != null) {
            eVar.b();
            this.Z0 = null;
        }
    }

    @Override
    public final void p() {
        this.T0.K();
    }

    @Override
    public final void q(View view, View view2, int i7, int i10) {
        boolean z10;
        mm0 mm0Var = this.f40085e0;
        org.telegram.ui.b00 b00Var = this.P0;
        if (i7 == 0) {
            if (b00Var.getVisibility() == 0) {
                b00Var.i(this.O0, false);
                mm0Var.B0 = null;
            } else {
                b00Var.i(null, false);
                org.telegram.ui.sz szVar = this.O0;
                mm0Var.B0 = szVar;
                if (szVar != null) {
                    ((org.telegram.ui.iu) szVar).h(false, null, mm0Var.f17595z0, mm0Var.A0);
                }
            }
        } else if (view instanceof org.telegram.ui.b00) {
            if (i10 == 0 && b00Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.b00) view).i(this.O0, z10);
        }
        if (view2 instanceof org.telegram.ui.b00) {
            ((org.telegram.ui.b00) view2).i(null, false);
            return;
        }
        mm0Var.B0 = null;
        b00Var.i(null, false);
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        this.f40081a1 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.sz szVar) {
        this.O0 = szVar;
    }

    public void setKeyboardHeight(int i7) {
        boolean z10;
        this.Q0 = i7;
        if (getVisibility() == 0 && getAlpha() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof org.telegram.ui.b00) {
                ((org.telegram.ui.b00) getChildAt(i10)).f45847c.b(i7, z10);
            } else if (getChildAt(i10) == this.f40080a0) {
                this.f40083c0.b(i7, z10);
                this.P0.f45847c.b(i7, z10);
            } else if (getChildAt(i10) instanceof sl0) {
                ((sl0) getChildAt(i10)).f39638a.b(i7, z10);
            } else if (getChildAt(i10) == this.f40089i0) {
                this.f40090j0.b(i7, z10);
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
        a71 a71Var = this.N;
        if (a71Var != null) {
            a71Var.g(1.0f, i7);
        }
        invalidate();
    }
}
