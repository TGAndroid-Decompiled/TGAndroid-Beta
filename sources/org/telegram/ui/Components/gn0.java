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
public abstract class gn0 extends w71 implements org.telegram.ui.y00, org.telegram.messenger.us, ug.a {
    public static final int f26447a1 = 0;
    public boolean A0;
    public final HashMap B0;
    public final ArrayList C0;
    public org.telegram.ui.ActionBar.t0 D0;
    public org.telegram.ui.ActionBar.t0 E0;
    public org.telegram.ui.ActionBar.t0 F0;
    public org.telegram.ui.ActionBar.t0 G0;
    public org.telegram.ui.ActionBar.y H0;
    public gm0 I0;
    public final int J0;
    public boolean K0;
    public final org.telegram.ui.ay L0;
    public String M0;
    public org.telegram.ui.q00 N0;
    public final org.telegram.ui.z00 O0;
    public int P0;
    public boolean Q0;
    public final org.telegram.ui.iw R0;
    public final uu0 S0;
    public final int T0;
    public int U0;
    public final mg.s V;
    public final long V0;
    public final FrameLayout W;
    public int W0;
    public int X0;
    public xa.n Y0;
    public tg.b Z0;
    public final ag.b1 f26448a0;
    public final tm0 f26449b0;
    public final s4.j f26450c0;
    public final zm0 f26451d0;
    public final s4.a0 f26452e0;
    public final wj0 f26453f0;
    public boolean f26454g0;
    public final FrameLayout f26455h0;
    public final tm0 f26456i0;
    public final s4.a0 f26457j0;
    public final tk0 f26458k0;
    public final bn0 f26459l0;
    public final FrameLayout m0;
    public final tm0 f26460n0;
    public final s4.a0 f26461o0;
    public final tk0 f26462p0;
    public final um0 f26463q0;
    public final cg0 f26464r0;
    public boolean f26465s0;
    public final FrameLayout f26466t0;
    public final tm0 f26467u0;
    public final s4.a0 f26468v0;
    public final tk0 f26469w0;
    public final xm0 f26470x0;
    public ImageView f26471y0;
    public dn0 f26472z0;

    public gn0(Context context, org.telegram.ui.ay ayVar, int i10, int i11, int i12, long j10, org.telegram.ui.iw iwVar) {
        super(context, null);
        int i13;
        int i14;
        int i15;
        int i16;
        this.f26465s0 = false;
        this.B0 = new HashMap();
        this.C0 = new ArrayList();
        int i17 = org.telegram.messenger.d20.f15147s0;
        this.J0 = i17;
        this.U0 = 0;
        this.T0 = i12;
        this.V0 = j10;
        this.L0 = ayVar;
        this.R0 = iwVar;
        s4.j jVar = new s4.j();
        this.f26450c0 = jVar;
        jVar.f47967c = 150L;
        jVar.e = 350L;
        jVar.f47968f = 0L;
        jVar.f47969g = 0L;
        jVar.d = 0L;
        jVar.f47970i = new OvershootInterpolator(1.1f);
        jVar.f47945o = gr.h;
        org.telegram.ui.kx kxVar = (org.telegram.ui.kx) this;
        this.f26451d0 = new zm0(kxVar, context, ayVar, i10, i11, jVar, ayVar.F, ayVar, context);
        if (i11 == 15) {
            ArrayList c42 = ayVar.c4(i17, i11, i12, true);
            ArrayList arrayList = new ArrayList();
            for (int i18 = 0; i18 < c42.size(); i18 = c3.i0.k(i18, 1, ((TLRPC.Dialog) c42.get(i18)).f19797id, arrayList)) {
            }
            this.f26451d0.f55700q0 = arrayList;
        }
        this.S0 = (uu0) ayVar.getFragmentView();
        ag.b1 b1Var = new ag.b1(kxVar, context, 20);
        this.f26448a0 = b1Var;
        b1Var.setItemAnimator(this.f26450c0);
        b1Var.setPivotY(0.0f);
        b1Var.setClipToPadding(false);
        b1Var.setAdapter(this.f26451d0);
        b1Var.setVerticalScrollBarEnabled(true);
        b1Var.setInstantClick(true);
        if (org.telegram.messenger.cd.X) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        b1Var.setVerticalScrollbarPosition(i13);
        s4.a0 a0Var = new s4.a0(1, false);
        this.f26452e0 = a0Var;
        b1Var.setLayoutManager(a0Var);
        b1Var.W1 = true;
        b1Var.X1 = 0;
        b1Var.setOnScrollListener(new vm0(kxVar, ayVar, 2));
        b1Var.D0(new eb0(kxVar, 24));
        org.telegram.ui.z00 z00Var = new org.telegram.ui.z00(this.L0);
        this.O0 = z00Var;
        ag.b1 b1Var2 = z00Var.f43941b;
        b1Var2.setClipToPadding(false);
        b1Var2.j(new ym0(kxVar, 1));
        b1Var2.D0(new eb0(kxVar, 24));
        z00Var.setUiCallback(this);
        z00Var.setVisibility(8);
        z00Var.setChatPreviewDelegate(iwVar);
        zz zzVar = new zz(context, null);
        zzVar.setViewType(1);
        tm0 tm0Var = new tm0(kxVar, context, zzVar, 2);
        this.f26449b0 = tm0Var;
        tm0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        tm0Var.e.setVisibility(8);
        tm0Var.setVisibility(8);
        tm0Var.addView(zzVar, 0);
        tm0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(tm0Var);
        frameLayout.addView(b1Var);
        frameLayout.addView(z00Var);
        b1Var.setEmptyView(tm0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f26455h0 = frameLayout2;
        an0 an0Var = new an0(kxVar);
        an0Var.f47927m = false;
        an0Var.C = false;
        gr grVar = gr.h;
        an0Var.o(grVar);
        an0Var.n(350L);
        tk0 tk0Var = new tk0(context, null);
        this.f26458k0 = tk0Var;
        tk0Var.setItemAnimator(an0Var);
        tk0Var.setPivotY(0.0f);
        tk0Var.setVerticalScrollBarEnabled(true);
        tk0Var.setInstantClick(true);
        if (org.telegram.messenger.cd.X) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        tk0Var.setVerticalScrollbarPosition(i14);
        s4.a0 a0Var2 = new s4.a0(1, false);
        this.f26457j0 = a0Var2;
        tk0Var.setLayoutManager(a0Var2);
        tk0Var.W1 = true;
        tk0Var.X1 = 0;
        tk0Var.setClipToPadding(false);
        zz zzVar2 = new zz(context, null);
        zzVar2.setViewType(1);
        tm0 tm0Var2 = new tm0(kxVar, context, zzVar2, 3);
        this.f26456i0 = tm0Var2;
        tm0Var2.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        tm0Var2.e.setVisibility(8);
        tm0Var2.setVisibility(8);
        tm0Var2.addView(zzVar2, 0);
        tm0Var2.e(true, false);
        frameLayout2.addView(tm0Var2);
        frameLayout2.addView(tk0Var);
        tk0Var.setEmptyView(tm0Var2);
        bn0 bn0Var = new bn0(kxVar, tk0Var, context, this.J0, i12, ayVar);
        this.f26459l0 = bn0Var;
        tk0Var.setAdapter(bn0Var);
        tk0Var.setOnScrollListener(new vm0(kxVar, ayVar, 3));
        tk0Var.D0(new eb0(kxVar, 24));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.m0 = frameLayout3;
        sm0 sm0Var = new sm0(kxVar);
        sm0Var.f47927m = false;
        sm0Var.C = false;
        sm0Var.o(grVar);
        sm0Var.n(350L);
        tk0 tk0Var2 = new tk0(context, null);
        this.f26462p0 = tk0Var2;
        tk0Var2.setItemAnimator(sm0Var);
        tk0Var2.setPivotY(0.0f);
        tk0Var2.setClipToPadding(false);
        tk0Var2.setVerticalScrollBarEnabled(true);
        tk0Var2.setInstantClick(true);
        if (org.telegram.messenger.cd.X) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        tk0Var2.setVerticalScrollbarPosition(i15);
        s4.a0 a0Var3 = new s4.a0(1, false);
        this.f26461o0 = a0Var3;
        tk0Var2.setLayoutManager(a0Var3);
        tk0Var2.W1 = true;
        tk0Var2.X1 = 0;
        zz zzVar3 = new zz(context, null);
        zzVar3.setViewType(1);
        tm0 tm0Var3 = new tm0(kxVar, context, zzVar3, 0);
        this.f26460n0 = tm0Var3;
        tm0Var3.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        tm0Var3.e.setVisibility(8);
        tm0Var3.setVisibility(8);
        tm0Var3.addView(zzVar3, 0);
        tm0Var3.e(true, false);
        frameLayout3.addView(tm0Var3);
        frameLayout3.addView(tk0Var2);
        tk0Var2.setEmptyView(tm0Var3);
        um0 um0Var = new um0(kxVar, tk0Var2, context, this.J0, i12);
        this.f26463q0 = um0Var;
        tk0Var2.setAdapter(um0Var);
        tk0Var2.setOnScrollListener(new vm0(kxVar, ayVar, 0));
        tk0Var2.D0(new eb0(kxVar, 24));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f26466t0 = frameLayout4;
        wm0 wm0Var = new wm0(kxVar);
        wm0Var.f47927m = false;
        wm0Var.C = false;
        wm0Var.o(grVar);
        wm0Var.n(350L);
        tk0 tk0Var3 = new tk0(context, null);
        this.f26469w0 = tk0Var3;
        tk0Var3.setItemAnimator(wm0Var);
        tk0Var3.setPivotY(0.0f);
        tk0Var3.setVerticalScrollBarEnabled(true);
        tk0Var3.setInstantClick(true);
        if (org.telegram.messenger.cd.X) {
            i16 = 1;
        } else {
            i16 = 2;
        }
        tk0Var3.setVerticalScrollbarPosition(i16);
        s4.a0 a0Var4 = new s4.a0(1, false);
        this.f26468v0 = a0Var4;
        tk0Var3.setLayoutManager(a0Var4);
        tk0Var3.W1 = true;
        tk0Var3.X1 = 0;
        tk0Var3.setClipToPadding(false);
        zz zzVar4 = new zz(context, null);
        zzVar4.setViewType(1);
        tm0 tm0Var4 = new tm0(kxVar, context, zzVar4, 1);
        this.f26467u0 = tm0Var4;
        tm0Var4.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        tm0Var4.e.setVisibility(8);
        tm0Var4.setVisibility(8);
        tm0Var4.addView(zzVar4, 0);
        tm0Var4.e(true, false);
        frameLayout4.addView(tm0Var4);
        frameLayout4.addView(tk0Var3);
        tk0Var3.setEmptyView(tm0Var4);
        xm0 xm0Var = new xm0(kxVar, tk0Var3, context, this.J0);
        this.f26470x0 = xm0Var;
        tk0Var3.setAdapter(xm0Var);
        tk0Var3.setOnScrollListener(new vm0(kxVar, ayVar, 1));
        tk0Var3.D0(new eb0(kxVar, 24));
        this.f26453f0 = new wj0(b1Var, true);
        cg0 cg0Var = new cg0(context, ayVar);
        this.f26464r0 = cg0Var;
        u51 u51Var = cg0Var.f25073c;
        u51Var.setClipToPadding(false);
        u51Var.j(new ym0(kxVar, 0));
        u51Var.D0(new eb0(kxVar, 24));
        mg.s sVar = new mg.s(kxVar);
        this.V = sVar;
        setAdapter(sVar);
    }

    public static org.telegram.ui.un M(int i10, org.telegram.messenger.jj jjVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
        if (org.telegram.messenger.o5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.o5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(org.telegram.messenger.c.a(i10).f14863a).L0(Long.valueOf(-B0));
            if (L0 != null && L0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -L0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", jjVar.f1());
        return new org.telegram.ui.un(bundle);
    }

    public static void Q(FrameLayout frameLayout, tk0 tk0Var, int i10, int i11, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i10, 0, i11);
        if (z10) {
            tk0Var.q1(0, i10, 0, i11);
        } else {
            tk0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tk0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
    }

    public final void L() {
        if (this.f26465s0) {
            int i10 = 0;
            this.f26465s0 = false;
            S();
            m71 m71Var = this.M;
            if (m71Var != null && m71Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            zm0 zm0Var = this.f26451d0;
            if (zm0Var != null) {
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
                zm0Var.T(i10, str);
            }
        }
    }

    public final int N(int i10) {
        int i11 = 0;
        while (true) {
            mg.s sVar = this.V;
            ArrayList arrayList = (ArrayList) sVar.f13226b;
            if (i11 < ((ArrayList) sVar.f13226b).size()) {
                if (((fn0) arrayList.get(i11)).f26109a == 3 && ((fn0) arrayList.get(i11)).f26110b == i10) {
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
        if (!org.telegram.messenger.d20.i(i10).q() && !org.telegram.messenger.vp.r1(i10).A3()) {
            for (org.telegram.messenger.jj jjVar : this.B0.values()) {
                if (jjVar.F0() != null && jjVar.F0().size >= 157286400) {
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
        org.telegram.ui.z00 z00Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i11;
        long j12;
        boolean isEmpty = TextUtils.isEmpty(str);
        tm0 tm0Var = this.f26449b0;
        boolean z17 = true;
        if (isEmpty) {
            tm0Var.e.setVisibility(8);
        } else {
            tm0Var.e.setVisibility(0);
            tm0Var.e.setText(org.telegram.messenger.cd.a0(null, null, 2131748181, str));
        }
        zm0 zm0Var = this.f26451d0;
        org.telegram.ui.mx mxVar = zm0Var.U;
        if (mxVar != null) {
            j10 = mxVar.a();
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
                TLObject tLObject = e0Var.f55478f;
                if (tLObject instanceof TLRPC.User) {
                    j12 = ((TLRPC.User) tLObject).f19942id;
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.w3.Y((TLRPC.Chat) tLObject)) {
                    i11 = i12;
                } else {
                    j12 = -((TLRPC.Chat) e0Var.f55478f).f19793id;
                }
                i11 = i12;
                j11 = j12;
            } else if (i13 == 6) {
                zf.c0 c0Var = e0Var.f55479g;
                long j16 = c0Var.f55460b;
                i11 = i12;
                j14 = c0Var.f55461c;
                j13 = j16;
            } else {
                i11 = i12;
                if (i13 == 7) {
                    z18 = true;
                }
            }
            i12 = i11 + 1;
        }
        xm0 xm0Var = this.f26470x0;
        xm0Var.getClass();
        if (m30.Y(str, null) == null) {
            L();
        }
        if (view == this.f26455h0) {
            org.telegram.messenger.vp.r1(this.J0).K0(0L);
            bn0 bn0Var = this.f26459l0;
            tk0 tk0Var = bn0Var.d;
            ArrayList arrayList2 = bn0Var.S;
            ArrayList arrayList3 = bn0Var.T;
            ArrayList arrayList4 = bn0Var.U;
            ArrayList arrayList5 = bn0Var.R;
            ho hoVar = bn0Var.f27076e0;
            bn0Var.X();
            if (!TextUtils.equals(str, bn0Var.f27075d0)) {
                bn0Var.f27075d0 = str;
                org.telegram.messenger.i0.r(hoVar);
                if (TextUtils.isEmpty(bn0Var.f27075d0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    bn0Var.O(true);
                    bn0Var.f27074c0++;
                    z16 = false;
                    bn0Var.Y = false;
                    bn0Var.Z = false;
                    bn0Var.f27072a0 = false;
                    bn0Var.f27073b0 = 0;
                    if (tk0Var != null) {
                        tk0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.i0.h3(hoVar, 1000L);
                    bn0Var.Y = true;
                    bn0Var.Z = true;
                    bn0Var.O(true);
                    if (tk0Var != null) {
                        z16 = false;
                        tk0Var.v0(0);
                    }
                }
                this.f26456i0.b(this.P0, z16);
            }
            z16 = false;
            this.f26456i0.b(this.P0, z16);
        } else if (view == this.m0) {
            um0 um0Var = this.f26463q0;
            tk0 tk0Var2 = um0Var.d;
            ArrayList arrayList6 = um0Var.V;
            bs bsVar = um0Var.f26512h0;
            if (TextUtils.equals(str, um0Var.f26511g0)) {
                z15 = false;
            } else {
                um0Var.f26511g0 = str;
                org.telegram.messenger.i0.r(bsVar);
                if (TextUtils.isEmpty(um0Var.f26511g0)) {
                    arrayList6.clear();
                    um0Var.O(true);
                    um0Var.f26510f0++;
                    z15 = false;
                    um0Var.f26506b0 = false;
                    um0Var.f26507c0 = false;
                    um0Var.f26508d0 = false;
                    um0Var.f26509e0 = 0;
                    if (tk0Var2 != null) {
                        tk0Var2.v0(0);
                    }
                } else {
                    z15 = false;
                    arrayList6.clear();
                    org.telegram.messenger.i0.h3(bsVar, 1000L);
                    um0Var.f26506b0 = true;
                    um0Var.f26507c0 = true;
                    um0Var.O(true);
                    if (tk0Var2 != null) {
                        tk0Var2.v0(0);
                    }
                }
            }
            this.f26460n0.b(this.P0, z15);
            if (TextUtils.isEmpty(str)) {
                um0Var.W();
            }
        } else {
            cg0 cg0Var = this.f26464r0;
            if (view == cg0Var) {
                u51 u51Var = cg0Var.f25073c;
                ArrayList arrayList7 = cg0Var.f25075n;
                if (!TextUtils.equals(cg0Var.f25079x, str)) {
                    if (cg0Var.K >= 0) {
                        ConnectionsManager.getInstance(cg0Var.f25072b).cancelRequest(cg0Var.K, true);
                        cg0Var.K = -1;
                    }
                    cg0Var.f25078w = false;
                    cg0Var.H.setLoading(false);
                    cg0Var.f25079x = str;
                    if (TextUtils.isEmpty(str)) {
                        cg0Var.f25076r = 0;
                        cg0Var.L++;
                        cg0Var.f25077s = false;
                        arrayList7.clear();
                        cg0Var.a(false);
                    } else {
                        cg0Var.b(str);
                        cg0Var.f25076r = 0;
                        cg0Var.L++;
                        cg0Var.f25077s = false;
                        arrayList7.clear();
                    }
                    cg0Var.d();
                    u51Var.v0(0);
                    u51Var.f30819f3.O(true);
                }
            } else if (view == this.f26466t0) {
                if (m30.Y(str, null) != null) {
                    if (z10) {
                        this.f26468v0.h1(0, 0);
                    }
                    xm0Var.Z(str);
                    this.f26467u0.b(this.P0, false);
                }
            } else if (view == this.W) {
                int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                org.telegram.ui.z00 z00Var2 = this.O0;
                if ((i14 == 0 && this.V0 == 0 && j13 == 0 && j14 == 0) || j15 != 0) {
                    this.K0 = false;
                    zm0Var.T(z18 ? 1 : 0, str);
                    zm0Var.A0 = this.N0;
                    z00Var2.animate().setListener(null).cancel();
                    z00Var2.i(null, false);
                    if (z10) {
                        if (zm0Var.D0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        tm0Var.e(!z14, false);
                        if (zm0Var.D0 <= 0) {
                            z17 = false;
                        }
                        tm0Var.e(z17, false);
                    } else if (!zm0Var.M()) {
                        if (zm0Var.D0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        tm0Var.e(z13, true);
                    }
                    if (z10) {
                        z00Var2.setVisibility(8);
                    } else if (z00Var2.getVisibility() != 8) {
                        z00Var2.animate().alpha(0.0f).setListener(new t60(this, 17)).setDuration(150L).start();
                    }
                    z00Var2.setTag(null);
                    z00Var = z00Var2;
                    z12 = false;
                } else {
                    z00Var2.setTag(1);
                    z00Var2.i(this.N0, false);
                    z00Var2.animate().setListener(null).cancel();
                    if (z10) {
                        z00Var2.setVisibility(0);
                        z00Var2.setAlpha(1.0f);
                        z11 = z10;
                    } else {
                        if (z00Var2.getVisibility() != 0) {
                            z00Var2.setVisibility(0);
                            z00Var2.setAlpha(0.0f);
                        } else {
                            z17 = z10;
                        }
                        z00Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z11 = z17;
                    }
                    z00Var = z00Var2;
                    z12 = false;
                    this.O0.h(j11, this.V0, j13, j14, null, z18, str, z11);
                    tm0Var.setVisibility(8);
                }
                tm0Var.b(this.P0, z12);
                z00Var.f43943c.b(this.P0, z12);
            } else {
                long j17 = j13;
                long j18 = j14;
                if (view instanceof org.telegram.ui.z00) {
                    org.telegram.ui.z00 z00Var3 = (org.telegram.ui.z00) view;
                    if (j15 == 0) {
                        z17 = false;
                    }
                    z00Var3.setUseFromUserAsAvatar(z17);
                    z00Var3.f43943c.b(this.P0, false);
                    z00Var3.h(j11, this.V0, j17, j18, zf.g0.f55493j3[((fn0) ((ArrayList) this.V.f13226b).get(i10)).f26110b], z18, str, z10);
                } else if (view instanceof gm0) {
                    gm0 gm0Var = (gm0) view;
                    gm0Var.f26437a.b(this.P0, false);
                    gm0Var.K = str;
                    gm0Var.d(false);
                }
            }
        }
    }

    public final void R(boolean z10) {
        sk0 sk0Var;
        sk0 sk0Var2;
        sk0 sk0Var3;
        int i10;
        boolean z11;
        int i11;
        int i12;
        org.telegram.ui.mx mxVar;
        int i13;
        if (this.A0 != z10) {
            org.telegram.ui.ay ayVar = this.L0;
            if (!z10 || !ayVar.getActionBar().u()) {
                if (z10 && !ayVar.getActionBar().e("search_view_pager")) {
                    this.H0 = ayVar.getActionBar().m("search_view_pager");
                    if (ayVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f26471y0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f26471y0.setImageDrawable(new org.telegram.ui.ActionBar.c2(true));
                        org.telegram.ui.ActionBar.a7.t(this.f26471y0, org.telegram.ui.ActionBar.t6.f21313y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f26471y0;
                        int i14 = org.telegram.ui.ActionBar.t6.f21332z8;
                        org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i14, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i14), null);
                        this.f26471y0.setOnClickListener(new db0(this, 11));
                        this.H0.addView(this.f26471y0, w7.b6.p(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.H0.getContext());
                    this.f26472z0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f26472z0.setTypeface(org.telegram.messenger.i0.o());
                    dn0 dn0Var = this.f26472z0;
                    int i15 = org.telegram.ui.ActionBar.t6.f21313y8;
                    au auVar = new au(19);
                    au auVar2 = new au(20);
                    int Q = org.telegram.ui.ActionBar.a7.Q(i15, -1, 0, 0.0f, null);
                    auVar2.d(Q, dn0Var);
                    org.telegram.ui.ActionBar.u6 x10 = org.telegram.ui.ActionBar.a7.x(101, dn0Var);
                    x10.c(i15, -1, 0, 0.0f, null);
                    x10.f21396n = auVar;
                    x10.f21397o = auVar2;
                    x10.f21395m = false;
                    x10.f21390g = Q;
                    org.telegram.ui.ActionBar.y yVar = this.H0;
                    dn0 dn0Var2 = this.f26472z0;
                    if (ayVar.W) {
                        i13 = 18;
                    } else {
                        i13 = 72;
                    }
                    yVar.addView(dn0Var2, w7.b6.m(1.0f, 0, -1, i13, 0, 0));
                    this.f26472z0.setOnTouchListener(new org.telegram.ui.ActionBar.n2(20));
                    org.telegram.ui.ActionBar.t0 h = this.H0.h(203, 2131230879, org.telegram.messenger.cd.L0(2131754801, null), org.telegram.messenger.i0.L(54.0f));
                    this.D0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.a7.t(this.D0.getIconView(), i15, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.E0 = this.H0.h(200, 2131232223, org.telegram.messenger.cd.L0(2131754877, null), org.telegram.messenger.i0.L(54.0f));
                    this.F0 = this.H0.h(201, 2131232164, org.telegram.messenger.cd.L0(2131750588, null), org.telegram.messenger.i0.L(54.0f));
                    this.G0 = this.H0.h(202, 2131232107, org.telegram.messenger.cd.L0(2131751599, null), org.telegram.messenger.i0.L(54.0f));
                }
                if (this.f26472z0 != null) {
                    zm0 zm0Var = this.f26451d0;
                    if (zm0Var != null && (mxVar = zm0Var.U) != null && mxVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26472z0.getLayoutParams();
                    if (ayVar.W) {
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
                    dn0 dn0Var3 = this.f26472z0;
                    dn0Var3.setLayoutParams(dn0Var3.getLayoutParams());
                }
                if (ayVar.getActionBar().getBackButton() != null && (ayVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.a5)) {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
                    ayVar.getActionBar().setBackButtonDrawable(c2Var);
                    c2Var.setColorFilter(null);
                }
                this.A0 = z10;
                HashMap hashMap = this.B0;
                if (z10) {
                    org.telegram.messenger.i0.v1(ayVar.getParentActivity().getCurrentFocus());
                    ayVar.getActionBar().O(null, null);
                    this.f26472z0.a(hashMap.size(), false);
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
                ayVar.getActionBar().t();
                hashMap.clear();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    if ((getChildAt(i16) instanceof org.telegram.ui.z00) && (sk0Var3 = ((org.telegram.ui.z00) getChildAt(i16)).d) != null) {
                        sk0Var3.f();
                    }
                    if (getChildAt(i16) instanceof gm0) {
                        ((gm0) getChildAt(i16)).d(true);
                    }
                }
                org.telegram.ui.z00 z00Var = this.O0;
                if (z00Var != null && (sk0Var2 = z00Var.d) != null) {
                    sk0Var2.f();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i17 = 0; i17 < size; i17++) {
                    View view = (View) sparseArray.valueAt(i17);
                    if ((view instanceof org.telegram.ui.z00) && (sk0Var = ((org.telegram.ui.z00) view).d) != null) {
                        sk0Var.f();
                    }
                }
            }
        }
    }

    public final void S() {
        this.V.l();
        o(false);
        m71 m71Var = this.M;
        if (m71Var != null) {
            m71Var.f31186y.f();
        }
    }

    @Override
    public final void a() {
        R(true);
    }

    @Override
    public final boolean b(org.telegram.ui.s00 s00Var) {
        return this.B0.containsKey(s00Var);
    }

    @Override
    public final void c(org.telegram.messenger.jj jjVar) {
        this.L0.presentFragment(M(this.J0, jjVar));
        R(false);
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.W;
                tk0 tk0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        tk0Var = this.f26448a0;
                    } else if (view == this.f26455h0) {
                        tk0Var = this.f26458k0;
                    } else if (view == this.m0) {
                        tk0Var = this.f26462p0;
                    } else if (view == this.f26466t0) {
                        tk0Var = this.f26469w0;
                    } else {
                        gm0 gm0Var = this.I0;
                        if (view == gm0Var) {
                            tk0Var = gm0Var.f26438b;
                        } else {
                            cg0 cg0Var = this.f26464r0;
                            if (view == cg0Var) {
                                tk0Var = cg0Var.f25073c;
                            } else if (view instanceof org.telegram.ui.z00) {
                                tk0Var = ((org.telegram.ui.z00) view).f43941b;
                            }
                        }
                    }
                }
                if (tk0Var != null) {
                    yg.d.a(tk0Var, canvas, rectF, tk0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.z00 z00Var = this.O0;
                    if (z00Var.getVisibility() == 0) {
                        ag.b1 b1Var = z00Var.f43941b;
                        yg.d.a(b1Var, canvas, rectF, b1Var, this);
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.f19611f3;
        boolean z10 = false;
        bn0 bn0Var = this.f26459l0;
        if (i10 == i12) {
            if (org.telegram.messenger.vp.r1(this.J0).K0(0L) != null) {
                z10 = true;
            }
            this.f26456i0.e(z10, true);
            bn0Var.X();
            bn0Var.O(true);
        } else if (i10 != org.telegram.messenger.zs.f19726y1 && i10 != org.telegram.messenger.zs.f19683s) {
            if (i10 == org.telegram.messenger.zs.V0) {
                this.f26463q0.O(true);
            } else if (i10 == org.telegram.messenger.zs.f19723x5) {
                Object obj = objArr[0];
                xm0 xm0Var = this.f26470x0;
                if (obj == xm0Var.S) {
                    xm0Var.O(true);
                }
            }
        } else {
            bn0Var.X();
            bn0Var.O(true);
        }
    }

    @Override
    public final void e(org.telegram.messenger.jj jjVar, View view, int i10) {
        boolean z10;
        int i11;
        int i12;
        org.telegram.ui.s00 s00Var = new org.telegram.ui.s00(jjVar.f1(), org.telegram.messenger.jj.B0(jjVar.f16337k));
        HashMap hashMap = this.B0;
        if (hashMap.containsKey(s00Var)) {
            hashMap.remove(s00Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(s00Var, jjVar);
        } else {
            return;
        }
        int i13 = 0;
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.f26472z0.a(hashMap.size(), true);
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
                    org.telegram.ui.ActionBar.a7.y(this, animatedVectorDrawable, org.telegram.ui.ActionBar.t6.f21313y8, null, PorterDuff.Mode.SRC_IN);
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
                        if (!((org.telegram.messenger.jj) hashMap.get((org.telegram.ui.s00) it.next())).Q) {
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
            ((org.telegram.ui.Cells.l7) view).b(hashMap.containsKey(s00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.t7) {
            ((org.telegram.ui.Cells.t7) view).b(i10, hashMap.containsKey(s00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).f(hashMap.containsKey(s00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).e(hashMap.containsKey(s00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view).c(hashMap.containsKey(s00Var), true);
        } else if (view instanceof org.telegram.ui.Cells.v2) {
            ((org.telegram.ui.Cells.v2) view).c0(hashMap.containsKey(s00Var), true);
        }
    }

    @Override
    public final boolean f() {
        return this.A0;
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        yVar.f7258b = true;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.H0;
    }

    public ArrayList<zf.e0> getCurrentSearchFilters() {
        return this.C0;
    }

    public gm0 getDownloadsContainer() {
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

    public v71 getTabsView() {
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
        xa.n nVar2 = new xa.n(org.telegram.messenger.zs.f(this.J0), this);
        nVar2.e(org.telegram.messenger.zs.f19611f3);
        nVar2.e(org.telegram.messenger.zs.f19726y1);
        nVar2.e(org.telegram.messenger.zs.f19683s);
        nVar2.e(org.telegram.messenger.zs.V0);
        nVar2.e(org.telegram.messenger.zs.f19723x5);
        this.Y0 = nVar2;
        this.f26454g0 = true;
        bn0 bn0Var = this.f26459l0;
        if (bn0Var != null) {
            bn0Var.O(false);
        }
        um0 um0Var = this.f26463q0;
        if (um0Var != null) {
            um0Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26454g0 = false;
        xa.n nVar = this.Y0;
        if (nVar != null) {
            nVar.a();
            this.Y0 = null;
        }
    }

    @Override
    public final void s() {
        this.S0.L();
    }

    public void setBlurredBackgroundDrawableFactory(tg.b bVar) {
        this.Z0 = bVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.q00 q00Var) {
        this.N0 = q00Var;
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
            if (getChildAt(i11) instanceof org.telegram.ui.z00) {
                ((org.telegram.ui.z00) getChildAt(i11)).f43943c.b(i10, z10);
            } else if (getChildAt(i11) == this.W) {
                this.f26449b0.b(i10, z10);
                this.O0.f43943c.b(i10, z10);
            } else if (getChildAt(i11) instanceof gm0) {
                ((gm0) getChildAt(i11)).f26437a.b(i10, z10);
            } else if (getChildAt(i11) == this.f26455h0) {
                this.f26456i0.b(i10, z10);
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
        m71 m71Var = this.M;
        if (m71Var != null) {
            m71Var.f(1.0f, i10);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        boolean z10;
        zm0 zm0Var = this.f26451d0;
        org.telegram.ui.z00 z00Var = this.O0;
        if (i10 == 0) {
            if (z00Var.getVisibility() == 0) {
                z00Var.i(this.N0, false);
                zm0Var.A0 = null;
            } else {
                z00Var.i(null, false);
                org.telegram.ui.q00 q00Var = this.N0;
                zm0Var.A0 = q00Var;
                if (q00Var != null) {
                    ((org.telegram.ui.iv) q00Var).k(false, null, zm0Var.f55713y0, zm0Var.f55714z0);
                }
            }
        } else if (view instanceof org.telegram.ui.z00) {
            if (i11 == 0 && z00Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.z00) view).i(this.N0, z10);
        }
        if (view2 instanceof org.telegram.ui.z00) {
            ((org.telegram.ui.z00) view2).i(null, false);
            return;
        }
        zm0Var.A0 = null;
        z00Var.i(null, false);
    }
}
