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
public abstract class jm0 extends w61 implements org.telegram.ui.yz, org.telegram.messenger.is, eh.a {
    public static final int f36034b1 = 0;
    public gm0 A0;
    public boolean B0;
    public final HashMap C0;
    public final ArrayList D0;
    public org.telegram.ui.ActionBar.q0 E0;
    public org.telegram.ui.ActionBar.q0 F0;
    public org.telegram.ui.ActionBar.q0 G0;
    public org.telegram.ui.ActionBar.q0 H0;
    public org.telegram.ui.ActionBar.y I0;
    public il0 J0;
    public final int K0;
    public boolean L0;
    public final org.telegram.ui.yw M0;
    public String N0;
    public org.telegram.ui.qz O0;
    public final org.telegram.ui.zz P0;
    public int Q0;
    public boolean R0;
    public final org.telegram.ui.ev S0;
    public final st0 T0;
    public final int U0;
    public int V0;
    public final di.f4 W;
    public final long W0;
    public int X0;
    public int Y0;
    public xi.e Z0;
    public final FrameLayout f36035a0;
    public dh.c f36036a1;
    public final di.c1 f36037b0;
    public final wl0 f36038c0;
    public final v4.k f36039d0;
    public final cm0 f36040e0;
    public final v4.b0 f36041f0;
    public final xi0 f36042g0;
    public boolean f36043h0;
    public final FrameLayout f36044i0;
    public final wl0 f36045j0;
    public final v4.b0 f36046k0;
    public final uj0 f36047l0;
    public final em0 m0;
    public final FrameLayout f36048n0;
    public final wl0 f36049o0;
    public final v4.b0 f36050p0;
    public final uj0 f36051q0;
    public final xl0 f36052r0;
    public final cf0 f36053s0;
    public boolean f36054t0;
    public final FrameLayout f36055u0;
    public final wl0 f36056v0;
    public final v4.b0 f36057w0;
    public final uj0 f36058x0;
    public final am0 f36059y0;
    public ImageView f36060z0;

    public jm0(Context context, org.telegram.ui.yw ywVar, int i7, int i10, int i11, long j3, org.telegram.ui.ev evVar) {
        super(context, null);
        int i12;
        int i13;
        int i14;
        int i15;
        this.f36054t0 = false;
        this.C0 = new HashMap();
        this.D0 = new ArrayList();
        int i16 = org.telegram.messenger.m10.f24940t0;
        this.K0 = i16;
        this.V0 = 0;
        this.U0 = i11;
        this.W0 = j3;
        this.M0 = ywVar;
        this.S0 = evVar;
        v4.k kVar = new v4.k();
        this.f36039d0 = kVar;
        kVar.f58608c = 150L;
        kVar.f58609e = 350L;
        kVar.f58610f = 0L;
        kVar.f58611g = 0L;
        kVar.d = 0L;
        kVar.f58612i = new OvershootInterpolator(1.1f);
        kVar.f58586o = er.h;
        org.telegram.ui.hw hwVar = (org.telegram.ui.hw) this;
        this.f36040e0 = new cm0(hwVar, context, ywVar, i7, i10, kVar, ywVar.G, ywVar, context);
        if (i10 == 15) {
            ArrayList d42 = ywVar.d4(i16, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 < d42.size(); i17 = com.google.android.gms.internal.vision.e2.g(i17, 1, ((TLRPC.Dialog) d42.get(i17)).f28055id, arrayList)) {
            }
            this.f36040e0.f17104r0 = arrayList;
        }
        this.T0 = (st0) ywVar.getFragmentView();
        di.c1 c1Var = new di.c1(25, context, hwVar);
        this.f36037b0 = c1Var;
        c1Var.setItemAnimator(this.f36039d0);
        c1Var.setPivotY(0.0f);
        c1Var.setClipToPadding(false);
        c1Var.setAdapter(this.f36040e0);
        c1Var.setVerticalScrollBarEnabled(true);
        c1Var.setInstantClick(true);
        if (org.telegram.messenger.hd.f24104a0) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        c1Var.setVerticalScrollbarPosition(i12);
        v4.b0 b0Var = new v4.b0(1, false);
        this.f36041f0 = b0Var;
        c1Var.setLayoutManager(b0Var);
        c1Var.X1 = true;
        c1Var.Y1 = 0;
        c1Var.setOnScrollListener(new yl0(hwVar, ywVar, 2));
        c1Var.D0(new wa0(hwVar, 22));
        org.telegram.ui.zz zzVar = new org.telegram.ui.zz(this.M0);
        this.P0 = zzVar;
        org.telegram.ui.ct ctVar = zzVar.f54075b;
        ctVar.setClipToPadding(false);
        ctVar.j(new bm0(hwVar, 1));
        ctVar.D0(new wa0(hwVar, 22));
        zzVar.setUiCallback(this);
        zzVar.setVisibility(8);
        zzVar.setChatPreviewDelegate(evVar);
        pz pzVar = new pz(context, null);
        pzVar.setViewType(1);
        wl0 wl0Var = new wl0(hwVar, context, pzVar, 2);
        this.f36038c0 = wl0Var;
        wl0Var.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        wl0Var.f33709e.setVisibility(8);
        wl0Var.setVisibility(8);
        wl0Var.addView(pzVar, 0);
        wl0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36035a0 = frameLayout;
        frameLayout.addView(wl0Var);
        frameLayout.addView(c1Var);
        frameLayout.addView(zzVar);
        c1Var.setEmptyView(wl0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36044i0 = frameLayout2;
        dm0 dm0Var = new dm0(hwVar);
        dm0Var.f58564m = false;
        dm0Var.C = false;
        er erVar = er.h;
        dm0Var.o(erVar);
        dm0Var.n(350L);
        uj0 uj0Var = new uj0(context, null);
        this.f36047l0 = uj0Var;
        uj0Var.setItemAnimator(dm0Var);
        uj0Var.setPivotY(0.0f);
        uj0Var.setVerticalScrollBarEnabled(true);
        uj0Var.setInstantClick(true);
        if (org.telegram.messenger.hd.f24104a0) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        uj0Var.setVerticalScrollbarPosition(i13);
        v4.b0 b0Var2 = new v4.b0(1, false);
        this.f36046k0 = b0Var2;
        uj0Var.setLayoutManager(b0Var2);
        uj0Var.X1 = true;
        uj0Var.Y1 = 0;
        uj0Var.setClipToPadding(false);
        pz pzVar2 = new pz(context, null);
        pzVar2.setViewType(1);
        wl0 wl0Var2 = new wl0(hwVar, context, pzVar2, 3);
        this.f36045j0 = wl0Var2;
        wl0Var2.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        wl0Var2.f33709e.setVisibility(8);
        wl0Var2.setVisibility(8);
        wl0Var2.addView(pzVar2, 0);
        wl0Var2.e(true, false);
        frameLayout2.addView(wl0Var2);
        frameLayout2.addView(uj0Var);
        uj0Var.setEmptyView(wl0Var2);
        em0 em0Var = new em0(hwVar, uj0Var, context, this.K0, i11, ywVar);
        this.m0 = em0Var;
        uj0Var.setAdapter(em0Var);
        uj0Var.setOnScrollListener(new yl0(hwVar, ywVar, 3));
        uj0Var.D0(new wa0(hwVar, 22));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f36048n0 = frameLayout3;
        vl0 vl0Var = new vl0(hwVar);
        vl0Var.f58564m = false;
        vl0Var.C = false;
        vl0Var.o(erVar);
        vl0Var.n(350L);
        uj0 uj0Var2 = new uj0(context, null);
        this.f36051q0 = uj0Var2;
        uj0Var2.setItemAnimator(vl0Var);
        uj0Var2.setPivotY(0.0f);
        uj0Var2.setClipToPadding(false);
        uj0Var2.setVerticalScrollBarEnabled(true);
        uj0Var2.setInstantClick(true);
        if (org.telegram.messenger.hd.f24104a0) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        uj0Var2.setVerticalScrollbarPosition(i14);
        v4.b0 b0Var3 = new v4.b0(1, false);
        this.f36050p0 = b0Var3;
        uj0Var2.setLayoutManager(b0Var3);
        uj0Var2.X1 = true;
        uj0Var2.Y1 = 0;
        pz pzVar3 = new pz(context, null);
        pzVar3.setViewType(1);
        wl0 wl0Var3 = new wl0(hwVar, context, pzVar3, 0);
        this.f36049o0 = wl0Var3;
        wl0Var3.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        wl0Var3.f33709e.setVisibility(8);
        wl0Var3.setVisibility(8);
        wl0Var3.addView(pzVar3, 0);
        wl0Var3.e(true, false);
        frameLayout3.addView(wl0Var3);
        frameLayout3.addView(uj0Var2);
        uj0Var2.setEmptyView(wl0Var3);
        xl0 xl0Var = new xl0(hwVar, uj0Var2, context, this.K0, i11);
        this.f36052r0 = xl0Var;
        uj0Var2.setAdapter(xl0Var);
        uj0Var2.setOnScrollListener(new yl0(hwVar, ywVar, 0));
        uj0Var2.D0(new wa0(hwVar, 22));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f36055u0 = frameLayout4;
        zl0 zl0Var = new zl0(hwVar);
        zl0Var.f58564m = false;
        zl0Var.C = false;
        zl0Var.o(erVar);
        zl0Var.n(350L);
        uj0 uj0Var3 = new uj0(context, null);
        this.f36058x0 = uj0Var3;
        uj0Var3.setItemAnimator(zl0Var);
        uj0Var3.setPivotY(0.0f);
        uj0Var3.setVerticalScrollBarEnabled(true);
        uj0Var3.setInstantClick(true);
        if (org.telegram.messenger.hd.f24104a0) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        uj0Var3.setVerticalScrollbarPosition(i15);
        v4.b0 b0Var4 = new v4.b0(1, false);
        this.f36057w0 = b0Var4;
        uj0Var3.setLayoutManager(b0Var4);
        uj0Var3.X1 = true;
        uj0Var3.Y1 = 0;
        uj0Var3.setClipToPadding(false);
        pz pzVar4 = new pz(context, null);
        pzVar4.setViewType(1);
        wl0 wl0Var4 = new wl0(hwVar, context, pzVar4, 1);
        this.f36056v0 = wl0Var4;
        wl0Var4.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        wl0Var4.f33709e.setVisibility(8);
        wl0Var4.setVisibility(8);
        wl0Var4.addView(pzVar4, 0);
        wl0Var4.e(true, false);
        frameLayout4.addView(wl0Var4);
        frameLayout4.addView(uj0Var3);
        uj0Var3.setEmptyView(wl0Var4);
        am0 am0Var = new am0(hwVar, uj0Var3, context, this.K0);
        this.f36059y0 = am0Var;
        uj0Var3.setAdapter(am0Var);
        uj0Var3.setOnScrollListener(new yl0(hwVar, ywVar, 1));
        uj0Var3.D0(new wa0(hwVar, 22));
        this.f36042g0 = new xi0(c1Var, true);
        cf0 cf0Var = new cf0(context, ywVar);
        this.f36053s0 = cf0Var;
        u41 u41Var = cf0Var.f33548c;
        u41Var.setClipToPadding(false);
        u41Var.j(new bm0(hwVar, 0));
        u41Var.D0(new wa0(hwVar, 22));
        di.f4 f4Var = new di.f4(hwVar);
        this.W = f4Var;
        setAdapter(f4Var);
    }

    public static org.telegram.ui.an K(int i7, org.telegram.messenger.gj gjVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.gj.B0(gjVar.f23819k);
        if (org.telegram.messenger.m5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(org.telegram.messenger.c.a(i7).f22782a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", gjVar.e1());
        return new org.telegram.ui.an(bundle);
    }

    public static void P(FrameLayout frameLayout, uj0 uj0Var, int i7, int i10, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i7, 0, i10);
        if (z10) {
            uj0Var.q1(0, i7, 0, i10);
        } else {
            uj0Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) uj0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
    }

    public final void J() {
        if (this.f36054t0) {
            int i7 = 0;
            this.f36054t0 = false;
            R();
            l61 l61Var = this.N;
            if (l61Var != null && l61Var.getCurrentTabId() != 0) {
                this.N.d(0, 0);
            }
            cm0 cm0Var = this.f36040e0;
            if (cm0Var != null) {
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
                cm0Var.T(i7, str);
            }
        }
    }

    public final int L(int i7) {
        int i10 = 0;
        while (true) {
            di.f4 f4Var = this.W;
            ArrayList arrayList = (ArrayList) f4Var.f8536b;
            if (i10 < ((ArrayList) f4Var.f8536b).size()) {
                if (((im0) arrayList.get(i10)).f35655a == 3 && ((im0) arrayList.get(i10)).f35656b == i7) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    @Override
    public final void M(org.telegram.messenger.gj gjVar, View view, int i7) {
        boolean z10;
        int i10;
        int i11;
        org.telegram.ui.sz szVar = new org.telegram.ui.sz(gjVar.e1(), org.telegram.messenger.gj.B0(gjVar.f23819k));
        HashMap hashMap = this.C0;
        if (hashMap.containsKey(szVar)) {
            hashMap.remove(szVar);
        } else if (hashMap.size() < 100) {
            hashMap.put(szVar, gjVar);
        } else {
            return;
        }
        int i12 = 0;
        if (hashMap.size() == 0) {
            Q(false);
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
                boolean N = N();
                if (N) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if (this.E0.getVisibility() != i10) {
                    this.E0.setVisibility(i10);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.E0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.q6.x(this, animatedVectorDrawable, org.telegram.ui.ActionBar.j6.f29243y8, null, PorterDuff.Mode.SRC_IN);
                    if (N) {
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
                        if (!((org.telegram.messenger.gj) hashMap.get((org.telegram.ui.sz) it.next())).Q) {
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
            ((org.telegram.ui.Cells.g7) view).b(hashMap.containsKey(szVar), true);
        } else if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).b(i7, hashMap.containsKey(szVar), true);
        } else if (view instanceof org.telegram.ui.Cells.j7) {
            ((org.telegram.ui.Cells.j7) view).f(hashMap.containsKey(szVar), true);
        } else if (view instanceof org.telegram.ui.Cells.f7) {
            ((org.telegram.ui.Cells.f7) view).e(hashMap.containsKey(szVar), true);
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view).c(hashMap.containsKey(szVar), true);
        } else if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).e0(hashMap.containsKey(szVar), true);
        }
    }

    public final boolean N() {
        int i7 = this.K0;
        if (!org.telegram.messenger.m10.i(i7).q() && !org.telegram.messenger.np.s1(i7).D3()) {
            for (org.telegram.messenger.gj gjVar : this.C0.values()) {
                if (gjVar.F0() != null && gjVar.F0().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O(View view, int i7, String str, boolean z10) {
        long j3;
        long j10;
        boolean z11;
        org.telegram.ui.zz zzVar;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        wl0 wl0Var = this.f36038c0;
        boolean z17 = true;
        if (isEmpty) {
            wl0Var.f33709e.setVisibility(8);
        } else {
            wl0Var.f33709e.setVisibility(0);
            wl0Var.f33709e.setText(org.telegram.messenger.hd.a0(null, null, 2131748165, str));
        }
        cm0 cm0Var = this.f36040e0;
        org.telegram.ui.jw jwVar = cm0Var.V;
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
        boolean z18 = false;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i11 >= arrayList.size()) {
                break;
            }
            jg.o0 o0Var = (jg.o0) arrayList.get(i11);
            int i12 = o0Var.d;
            if (i12 == 4) {
                TLObject tLObject = o0Var.f17223f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f28200id;
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.t3.Y((TLRPC.Chat) tLObject)) {
                    i10 = i11;
                } else {
                    j11 = -((TLRPC.Chat) o0Var.f17223f).f28051id;
                }
                i10 = i11;
                j10 = j11;
            } else if (i12 == 6) {
                jg.m0 m0Var = o0Var.f17224g;
                long j15 = m0Var.f17202b;
                i10 = i11;
                j13 = m0Var.f17203c;
                j12 = j15;
            } else {
                i10 = i11;
                if (i12 == 7) {
                    z18 = true;
                }
            }
            i11 = i10 + 1;
        }
        am0 am0Var = this.f36059y0;
        am0Var.getClass();
        if (x20.Y(str, null) == null) {
            J();
        }
        if (view == this.f36044i0) {
            org.telegram.messenger.np.s1(this.K0).L0(0L);
            em0 em0Var = this.m0;
            uj0 uj0Var = em0Var.d;
            ArrayList arrayList2 = em0Var.T;
            ArrayList arrayList3 = em0Var.U;
            ArrayList arrayList4 = em0Var.V;
            ArrayList arrayList5 = em0Var.S;
            fo foVar = em0Var.f34048f0;
            em0Var.X();
            if (!TextUtils.equals(str, em0Var.f34047e0)) {
                em0Var.f34047e0 = str;
                org.telegram.messenger.g0.r(foVar);
                if (TextUtils.isEmpty(em0Var.f34047e0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    em0Var.O(true);
                    em0Var.f34046d0++;
                    z16 = false;
                    em0Var.Z = false;
                    em0Var.f34043a0 = false;
                    em0Var.f34044b0 = false;
                    em0Var.f34045c0 = 0;
                    if (uj0Var != null) {
                        uj0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.g0.i3(foVar, 1000L);
                    em0Var.Z = true;
                    em0Var.f34043a0 = true;
                    em0Var.O(true);
                    if (uj0Var != null) {
                        z16 = false;
                        uj0Var.v0(0);
                    }
                }
                this.f36045j0.b(this.Q0, z16);
            }
            z16 = false;
            this.f36045j0.b(this.Q0, z16);
        } else if (view == this.f36048n0) {
            xl0 xl0Var = this.f36052r0;
            uj0 uj0Var2 = xl0Var.d;
            ArrayList arrayList6 = xl0Var.W;
            xr xrVar = xl0Var.f33366i0;
            if (TextUtils.equals(str, xl0Var.f33365h0)) {
                z15 = false;
            } else {
                xl0Var.f33365h0 = str;
                org.telegram.messenger.g0.r(xrVar);
                if (TextUtils.isEmpty(xl0Var.f33365h0)) {
                    arrayList6.clear();
                    xl0Var.O(true);
                    xl0Var.f33364g0++;
                    z15 = false;
                    xl0Var.f33360c0 = false;
                    xl0Var.f33361d0 = false;
                    xl0Var.f33362e0 = false;
                    xl0Var.f33363f0 = 0;
                    if (uj0Var2 != null) {
                        uj0Var2.v0(0);
                    }
                } else {
                    z15 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.i3(xrVar, 1000L);
                    xl0Var.f33360c0 = true;
                    xl0Var.f33361d0 = true;
                    xl0Var.O(true);
                    if (uj0Var2 != null) {
                        uj0Var2.v0(0);
                    }
                }
            }
            this.f36049o0.b(this.Q0, z15);
            if (TextUtils.isEmpty(str)) {
                xl0Var.W();
            }
        } else {
            cf0 cf0Var = this.f36053s0;
            if (view == cf0Var) {
                u41 u41Var = cf0Var.f33548c;
                ArrayList arrayList7 = cf0Var.f33551n;
                if (!TextUtils.equals(cf0Var.f33555x, str)) {
                    if (cf0Var.L >= 0) {
                        ConnectionsManager.getInstance(cf0Var.f33547b).cancelRequest(cf0Var.L, true);
                        cf0Var.L = -1;
                    }
                    cf0Var.f33554w = false;
                    cf0Var.I.setLoading(false);
                    cf0Var.f33555x = str;
                    if (TextUtils.isEmpty(str)) {
                        cf0Var.f33552r = 0;
                        cf0Var.M++;
                        cf0Var.f33553s = false;
                        arrayList7.clear();
                        cf0Var.a(false);
                    } else {
                        cf0Var.b(str);
                        cf0Var.f33552r = 0;
                        cf0Var.M++;
                        cf0Var.f33553s = false;
                        arrayList7.clear();
                    }
                    cf0Var.d();
                    u41Var.v0(0);
                    u41Var.f39892g3.O(true);
                }
            } else if (view == this.f36055u0) {
                if (x20.Y(str, null) != null) {
                    if (z10) {
                        this.f36057w0.h1(0, 0);
                    }
                    am0Var.Z(str);
                    this.f36056v0.b(this.Q0, false);
                }
            } else if (view == this.f36035a0) {
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                org.telegram.ui.zz zzVar2 = this.P0;
                if ((i13 == 0 && this.W0 == 0 && j12 == 0 && j13 == 0) || j14 != 0) {
                    this.L0 = false;
                    cm0Var.T(z18 ? 1 : 0, str);
                    cm0Var.B0 = this.O0;
                    zzVar2.animate().setListener(null).cancel();
                    zzVar2.i(null, false);
                    if (z10) {
                        if (cm0Var.E0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        wl0Var.e(!z14, false);
                        if (cm0Var.E0 <= 0) {
                            z17 = false;
                        }
                        wl0Var.e(z17, false);
                    } else if (!cm0Var.M()) {
                        if (cm0Var.E0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        wl0Var.e(z13, true);
                    }
                    if (z10) {
                        zzVar2.setVisibility(8);
                    } else if (zzVar2.getVisibility() != 8) {
                        zzVar2.animate().alpha(0.0f).setListener(new h60(this, 17)).setDuration(150L).start();
                    }
                    zzVar2.setTag(null);
                    zzVar = zzVar2;
                    z12 = false;
                } else {
                    zzVar2.setTag(1);
                    zzVar2.i(this.O0, false);
                    zzVar2.animate().setListener(null).cancel();
                    if (z10) {
                        zzVar2.setVisibility(0);
                        zzVar2.setAlpha(1.0f);
                        z11 = z10;
                    } else {
                        if (zzVar2.getVisibility() != 0) {
                            zzVar2.setVisibility(0);
                            zzVar2.setAlpha(0.0f);
                        } else {
                            z17 = z10;
                        }
                        zzVar2.animate().alpha(1.0f).setDuration(150L).start();
                        z11 = z17;
                    }
                    zzVar = zzVar2;
                    z12 = false;
                    this.P0.h(j10, this.W0, j12, j13, null, z18, str, z11);
                    wl0Var.setVisibility(8);
                }
                wl0Var.b(this.Q0, z12);
                zzVar.f54077c.b(this.Q0, z12);
            } else {
                long j16 = j12;
                long j17 = j13;
                if (view instanceof org.telegram.ui.zz) {
                    org.telegram.ui.zz zzVar3 = (org.telegram.ui.zz) view;
                    if (j14 == 0) {
                        z17 = false;
                    }
                    zzVar3.setUseFromUserAsAvatar(z17);
                    zzVar3.f54077c.b(this.Q0, false);
                    zzVar3.h(j10, this.W0, j16, j17, jg.q0.f17237k3[((im0) ((ArrayList) this.W.f8536b).get(i7)).f35656b], z18, str, z10);
                } else if (view instanceof il0) {
                    il0 il0Var = (il0) view;
                    il0Var.f35638a.b(this.Q0, false);
                    il0Var.L = str;
                    il0Var.d(false);
                }
            }
        }
    }

    public final void Q(boolean z10) {
        tj0 tj0Var;
        tj0 tj0Var2;
        tj0 tj0Var3;
        int i7;
        boolean z11;
        int i10;
        int i11;
        org.telegram.ui.jw jwVar;
        int i12;
        if (this.B0 != z10) {
            org.telegram.ui.yw ywVar = this.M0;
            if (!z10 || !ywVar.getActionBar().x()) {
                if (z10 && !ywVar.getActionBar().c("search_view_pager")) {
                    this.I0 = ywVar.getActionBar().p("search_view_pager");
                    if (ywVar.X) {
                        ImageView imageView = new ImageView(getContext());
                        this.f36060z0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f36060z0.setImageDrawable(new org.telegram.ui.ActionBar.x1(true));
                        org.telegram.ui.ActionBar.q6.s(this.f36060z0, org.telegram.ui.ActionBar.j6.f29243y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f36060z0;
                        int i13 = org.telegram.ui.ActionBar.j6.f29262z8;
                        org.telegram.ui.ActionBar.q6.Q(imageView2, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i13, false), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i13), null);
                        this.f36060z0.setOnClickListener(new y60(this, 11));
                        this.I0.addView(this.f36060z0, c8.ja.p(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.I0.getContext());
                    this.A0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.A0.setTypeface(org.telegram.messenger.g0.o());
                    gm0 gm0Var = this.A0;
                    int i14 = org.telegram.ui.ActionBar.j6.f29243y8;
                    rb0 rb0Var = new rb0(6);
                    rb0 rb0Var2 = new rb0(7);
                    int P = org.telegram.ui.ActionBar.q6.P(i14, -1, 0, 0.0f, null);
                    rb0Var2.f(P, gm0Var);
                    org.telegram.ui.ActionBar.k6 w10 = org.telegram.ui.ActionBar.q6.w(101, gm0Var);
                    w10.c(i14, -1, 0, 0.0f, null);
                    w10.f29354n = rb0Var;
                    w10.f29355o = rb0Var2;
                    w10.f29353m = false;
                    w10.f29348g = P;
                    org.telegram.ui.ActionBar.y yVar = this.I0;
                    gm0 gm0Var2 = this.A0;
                    if (ywVar.X) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    yVar.addView(gm0Var2, c8.ja.m(1.0f, 0, -1, i12, 0, 0));
                    this.A0.setOnTouchListener(new gi.a(22));
                    org.telegram.ui.ActionBar.q0 h = this.I0.h(203, 2131230879, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131754801, null));
                    this.E0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.q6.s(this.E0.getIconView(), i14, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.F0 = this.I0.h(200, 2131232225, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131754877, null));
                    this.G0 = this.I0.h(201, 2131232166, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131750587, null));
                    this.H0 = this.I0.h(202, 2131232109, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131751598, null));
                }
                if (this.A0 != null) {
                    cm0 cm0Var = this.f36040e0;
                    if (cm0Var != null && (jwVar = cm0Var.V) != null && jwVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0.getLayoutParams();
                    if (ywVar.X) {
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
                    gm0 gm0Var3 = this.A0;
                    gm0Var3.setLayoutParams(gm0Var3.getLayoutParams());
                }
                if (ywVar.getActionBar().getBackButton() != null && (ywVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.p4)) {
                    org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
                    ywVar.getActionBar().setBackButtonDrawable(x1Var);
                    x1Var.setColorFilter(null);
                }
                this.B0 = z10;
                HashMap hashMap = this.C0;
                if (z10) {
                    org.telegram.messenger.g0.v1(ywVar.getParentActivity().getCurrentFocus());
                    ywVar.getActionBar().R(null, null);
                    this.A0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.q0 q0Var = this.E0;
                    if (N()) {
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
                ywVar.getActionBar().w();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.zz) && (tj0Var3 = ((org.telegram.ui.zz) getChildAt(i15)).d) != null) {
                        tj0Var3.f();
                    }
                    if (getChildAt(i15) instanceof il0) {
                        ((il0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.zz zzVar = this.P0;
                if (zzVar != null && (tj0Var2 = zzVar.d) != null) {
                    tj0Var2.f();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.zz) && (tj0Var = ((org.telegram.ui.zz) view).d) != null) {
                        tj0Var.f();
                    }
                }
            }
        }
    }

    public final void R() {
        this.W.l();
        k(false);
        l61 l61Var = this.N;
        if (l61Var != null) {
            l61Var.f40319y.f();
        }
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8090a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.f36035a0;
                uj0 uj0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        uj0Var = this.f36037b0;
                    } else if (view == this.f36044i0) {
                        uj0Var = this.f36047l0;
                    } else if (view == this.f36048n0) {
                        uj0Var = this.f36051q0;
                    } else if (view == this.f36055u0) {
                        uj0Var = this.f36058x0;
                    } else {
                        il0 il0Var = this.J0;
                        if (view == il0Var) {
                            uj0Var = il0Var.f35639b;
                        } else {
                            cf0 cf0Var = this.f36053s0;
                            if (view == cf0Var) {
                                uj0Var = cf0Var.f33548c;
                            } else if (view instanceof org.telegram.ui.zz) {
                                uj0Var = ((org.telegram.ui.zz) view).f54075b;
                            }
                        }
                    }
                }
                if (uj0Var != null) {
                    ih.d.a(uj0Var, canvas, rectF, uj0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.zz zzVar = this.P0;
                    if (zzVar.getVisibility() == 0) {
                        org.telegram.ui.ct ctVar = zzVar.f54075b;
                        ih.d.a(ctVar, canvas, rectF, ctVar, this);
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.f25496f3;
        boolean z10 = false;
        em0 em0Var = this.m0;
        if (i7 == i11) {
            if (org.telegram.messenger.np.s1(this.K0).L0(0L) != null) {
                z10 = true;
            }
            this.f36045j0.e(z10, true);
            em0Var.X();
            em0Var.O(true);
        } else if (i7 != org.telegram.messenger.ns.f25609y1 && i7 != org.telegram.messenger.ns.f25567s) {
            if (i7 == org.telegram.messenger.ns.V0) {
                this.f36052r0.O(true);
            } else if (i7 == org.telegram.messenger.ns.f25606x5) {
                Object obj = objArr[0];
                am0 am0Var = this.f36059y0;
                if (obj == am0Var.T) {
                    am0Var.O(true);
                }
            }
        } else {
            em0Var.X();
            em0Var.O(true);
        }
    }

    @Override
    public final boolean g0() {
        return this.B0;
    }

    public org.telegram.ui.ActionBar.y getActionMode() {
        return this.I0;
    }

    public ArrayList<jg.o0> getCurrentSearchFilters() {
        return this.D0;
    }

    public il0 getDownloadsContainer() {
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

    public v61 getTabsView() {
        return this.N;
    }

    @Override
    public final void j() {
        Q(true);
    }

    @Override
    public final boolean l(org.telegram.ui.sz szVar) {
        return this.C0.containsKey(szVar);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xi.e eVar = this.Z0;
        if (eVar != null) {
            eVar.b();
            this.Z0 = null;
        }
        xi.e eVar2 = new xi.e(org.telegram.messenger.ns.f(this.K0), this);
        eVar2.c(org.telegram.messenger.ns.f25496f3);
        eVar2.c(org.telegram.messenger.ns.f25609y1);
        eVar2.c(org.telegram.messenger.ns.f25567s);
        eVar2.c(org.telegram.messenger.ns.V0);
        eVar2.c(org.telegram.messenger.ns.f25606x5);
        this.Z0 = eVar2;
        this.f36043h0 = true;
        em0 em0Var = this.m0;
        if (em0Var != null) {
            em0Var.O(false);
        }
        xl0 xl0Var = this.f36052r0;
        if (xl0Var != null) {
            xl0Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36043h0 = false;
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
        cm0 cm0Var = this.f36040e0;
        org.telegram.ui.zz zzVar = this.P0;
        if (i7 == 0) {
            if (zzVar.getVisibility() == 0) {
                zzVar.i(this.O0, false);
                cm0Var.B0 = null;
            } else {
                zzVar.i(null, false);
                org.telegram.ui.qz qzVar = this.O0;
                cm0Var.B0 = qzVar;
                if (qzVar != null) {
                    ((org.telegram.ui.hu) qzVar).j(false, null, cm0Var.f17116z0, cm0Var.A0);
                }
            }
        } else if (view instanceof org.telegram.ui.zz) {
            if (i10 == 0 && zzVar.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.zz) view).i(this.O0, z10);
        }
        if (view2 instanceof org.telegram.ui.zz) {
            ((org.telegram.ui.zz) view2).i(null, false);
            return;
        }
        cm0Var.B0 = null;
        zzVar.i(null, false);
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        this.f36036a1 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.qz qzVar) {
        this.O0 = qzVar;
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
            if (getChildAt(i10) instanceof org.telegram.ui.zz) {
                ((org.telegram.ui.zz) getChildAt(i10)).f54077c.b(i7, z10);
            } else if (getChildAt(i10) == this.f36035a0) {
                this.f36038c0.b(i7, z10);
                this.P0.f54077c.b(i7, z10);
            } else if (getChildAt(i10) instanceof il0) {
                ((il0) getChildAt(i10)).f35638a.b(i7, z10);
            } else if (getChildAt(i10) == this.f36044i0) {
                this.f36045j0.b(i7, z10);
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
        l61 l61Var = this.N;
        if (l61Var != null) {
            l61Var.f(1.0f, i7);
        }
        invalidate();
    }

    @Override
    public final void y(org.telegram.messenger.gj gjVar) {
        this.M0.presentFragment(K(this.K0, gjVar));
        Q(false);
    }
}
