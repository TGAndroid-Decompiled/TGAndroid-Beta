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
public abstract class um0 extends j71 implements org.telegram.ui.b00, org.telegram.messenger.gs, eh.a {
    public static final int f40496b1 = 0;
    public rm0 A0;
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
    public final org.telegram.ui.cx M0;
    public String N0;
    public org.telegram.ui.tz O0;
    public final org.telegram.ui.c00 P0;
    public int Q0;
    public boolean R0;
    public final org.telegram.ui.hv S0;
    public final du0 T0;
    public final int U0;
    public int V0;
    public final di.i4 W;
    public final long W0;
    public int X0;
    public int Y0;
    public xi.e Z0;
    public final FrameLayout f40497a0;
    public dh.c f40498a1;
    public final di.b1 f40499b0;
    public final hm0 f40500c0;
    public final v4.k f40501d0;
    public final nm0 f40502e0;
    public final v4.c0 f40503f0;
    public final hj0 f40504g0;
    public boolean f40505h0;
    public final FrameLayout f40506i0;
    public final hm0 f40507j0;
    public final v4.c0 f40508k0;
    public final ek0 f40509l0;
    public final pm0 m0;
    public final FrameLayout f40510n0;
    public final hm0 f40511o0;
    public final v4.c0 f40512p0;
    public final ek0 f40513q0;
    public final im0 f40514r0;
    public final of0 f40515s0;
    public boolean f40516t0;
    public final FrameLayout f40517u0;
    public final hm0 f40518v0;
    public final v4.c0 f40519w0;
    public final ek0 f40520x0;
    public final lm0 f40521y0;
    public ImageView f40522z0;

    public um0(Context context, org.telegram.ui.cx cxVar, int i7, int i10, int i11, long j3, org.telegram.ui.hv hvVar) {
        super(context, null);
        int i12;
        int i13;
        int i14;
        int i15;
        this.f40516t0 = false;
        this.C0 = new HashMap();
        this.D0 = new ArrayList();
        int i16 = org.telegram.messenger.k10.f24968t0;
        this.K0 = i16;
        this.V0 = 0;
        this.U0 = i11;
        this.W0 = j3;
        this.M0 = cxVar;
        this.S0 = hvVar;
        v4.k kVar = new v4.k();
        this.f40501d0 = kVar;
        kVar.f59238c = 150L;
        kVar.f59239e = 350L;
        kVar.f59240f = 0L;
        kVar.f59241g = 0L;
        kVar.d = 0L;
        kVar.f59242i = new OvershootInterpolator(1.1f);
        kVar.f59212o = nr.h;
        org.telegram.ui.kw kwVar = (org.telegram.ui.kw) this;
        this.f40502e0 = new nm0(kwVar, context, cxVar, i7, i10, kVar, cxVar.G, cxVar, context);
        if (i10 == 15) {
            ArrayList d42 = cxVar.d4(i16, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 < d42.size(); i17 = com.google.android.gms.internal.vision.e2.g(i17, 1, ((TLRPC.Dialog) d42.get(i17)).f28438id, arrayList)) {
            }
            this.f40502e0.f17515r0 = arrayList;
        }
        this.T0 = (du0) cxVar.getFragmentView();
        di.b1 b1Var = new di.b1(25, context, kwVar);
        this.f40499b0 = b1Var;
        b1Var.setItemAnimator(this.f40501d0);
        b1Var.setPivotY(0.0f);
        b1Var.setClipToPadding(false);
        b1Var.setAdapter(this.f40502e0);
        b1Var.setVerticalScrollBarEnabled(true);
        b1Var.setInstantClick(true);
        if (org.telegram.messenger.hd.f24444a0) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        b1Var.setVerticalScrollbarPosition(i12);
        v4.c0 c0Var = new v4.c0(1, false);
        this.f40503f0 = c0Var;
        b1Var.setLayoutManager(c0Var);
        b1Var.X1 = true;
        b1Var.Y1 = 0;
        b1Var.setOnScrollListener(new jm0(kwVar, cxVar, 2));
        b1Var.D0(new hb0(kwVar, 22));
        org.telegram.ui.c00 c00Var = new org.telegram.ui.c00(this.M0);
        this.P0 = c00Var;
        org.telegram.ui.et etVar = c00Var.f46348b;
        etVar.setClipToPadding(false);
        etVar.j(new mm0(kwVar, 1));
        etVar.D0(new hb0(kwVar, 22));
        c00Var.setUiCallback(this);
        c00Var.setVisibility(8);
        c00Var.setChatPreviewDelegate(hvVar);
        yz yzVar = new yz(context, null);
        yzVar.setViewType(1);
        hm0 hm0Var = new hm0(kwVar, context, yzVar, 2);
        this.f40500c0 = hm0Var;
        hm0Var.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        hm0Var.f37995e.setVisibility(8);
        hm0Var.setVisibility(8);
        hm0Var.addView(yzVar, 0);
        hm0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40497a0 = frameLayout;
        frameLayout.addView(hm0Var);
        frameLayout.addView(b1Var);
        frameLayout.addView(c00Var);
        b1Var.setEmptyView(hm0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f40506i0 = frameLayout2;
        om0 om0Var = new om0(kwVar);
        om0Var.f59194m = false;
        om0Var.C = false;
        nr nrVar = nr.h;
        om0Var.o(nrVar);
        om0Var.n(350L);
        ek0 ek0Var = new ek0(context, null);
        this.f40509l0 = ek0Var;
        ek0Var.setItemAnimator(om0Var);
        ek0Var.setPivotY(0.0f);
        ek0Var.setVerticalScrollBarEnabled(true);
        ek0Var.setInstantClick(true);
        if (org.telegram.messenger.hd.f24444a0) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        ek0Var.setVerticalScrollbarPosition(i13);
        v4.c0 c0Var2 = new v4.c0(1, false);
        this.f40508k0 = c0Var2;
        ek0Var.setLayoutManager(c0Var2);
        ek0Var.X1 = true;
        ek0Var.Y1 = 0;
        ek0Var.setClipToPadding(false);
        yz yzVar2 = new yz(context, null);
        yzVar2.setViewType(1);
        hm0 hm0Var2 = new hm0(kwVar, context, yzVar2, 3);
        this.f40507j0 = hm0Var2;
        hm0Var2.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        hm0Var2.f37995e.setVisibility(8);
        hm0Var2.setVisibility(8);
        hm0Var2.addView(yzVar2, 0);
        hm0Var2.e(true, false);
        frameLayout2.addView(hm0Var2);
        frameLayout2.addView(ek0Var);
        ek0Var.setEmptyView(hm0Var2);
        pm0 pm0Var = new pm0(kwVar, ek0Var, context, this.K0, i11, cxVar);
        this.m0 = pm0Var;
        ek0Var.setAdapter(pm0Var);
        ek0Var.setOnScrollListener(new jm0(kwVar, cxVar, 3));
        ek0Var.D0(new hb0(kwVar, 22));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f40510n0 = frameLayout3;
        gm0 gm0Var = new gm0(kwVar);
        gm0Var.f59194m = false;
        gm0Var.C = false;
        gm0Var.o(nrVar);
        gm0Var.n(350L);
        ek0 ek0Var2 = new ek0(context, null);
        this.f40513q0 = ek0Var2;
        ek0Var2.setItemAnimator(gm0Var);
        ek0Var2.setPivotY(0.0f);
        ek0Var2.setClipToPadding(false);
        ek0Var2.setVerticalScrollBarEnabled(true);
        ek0Var2.setInstantClick(true);
        if (org.telegram.messenger.hd.f24444a0) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        ek0Var2.setVerticalScrollbarPosition(i14);
        v4.c0 c0Var3 = new v4.c0(1, false);
        this.f40512p0 = c0Var3;
        ek0Var2.setLayoutManager(c0Var3);
        ek0Var2.X1 = true;
        ek0Var2.Y1 = 0;
        yz yzVar3 = new yz(context, null);
        yzVar3.setViewType(1);
        hm0 hm0Var3 = new hm0(kwVar, context, yzVar3, 0);
        this.f40511o0 = hm0Var3;
        hm0Var3.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        hm0Var3.f37995e.setVisibility(8);
        hm0Var3.setVisibility(8);
        hm0Var3.addView(yzVar3, 0);
        hm0Var3.e(true, false);
        frameLayout3.addView(hm0Var3);
        frameLayout3.addView(ek0Var2);
        ek0Var2.setEmptyView(hm0Var3);
        im0 im0Var = new im0(kwVar, ek0Var2, context, this.K0, i11);
        this.f40514r0 = im0Var;
        ek0Var2.setAdapter(im0Var);
        ek0Var2.setOnScrollListener(new jm0(kwVar, cxVar, 0));
        ek0Var2.D0(new hb0(kwVar, 22));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f40517u0 = frameLayout4;
        km0 km0Var = new km0(kwVar);
        km0Var.f59194m = false;
        km0Var.C = false;
        km0Var.o(nrVar);
        km0Var.n(350L);
        ek0 ek0Var3 = new ek0(context, null);
        this.f40520x0 = ek0Var3;
        ek0Var3.setItemAnimator(km0Var);
        ek0Var3.setPivotY(0.0f);
        ek0Var3.setVerticalScrollBarEnabled(true);
        ek0Var3.setInstantClick(true);
        if (org.telegram.messenger.hd.f24444a0) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        ek0Var3.setVerticalScrollbarPosition(i15);
        v4.c0 c0Var4 = new v4.c0(1, false);
        this.f40519w0 = c0Var4;
        ek0Var3.setLayoutManager(c0Var4);
        ek0Var3.X1 = true;
        ek0Var3.Y1 = 0;
        ek0Var3.setClipToPadding(false);
        yz yzVar4 = new yz(context, null);
        yzVar4.setViewType(1);
        hm0 hm0Var4 = new hm0(kwVar, context, yzVar4, 1);
        this.f40518v0 = hm0Var4;
        hm0Var4.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        hm0Var4.f37995e.setVisibility(8);
        hm0Var4.setVisibility(8);
        hm0Var4.addView(yzVar4, 0);
        hm0Var4.e(true, false);
        frameLayout4.addView(hm0Var4);
        frameLayout4.addView(ek0Var3);
        ek0Var3.setEmptyView(hm0Var4);
        lm0 lm0Var = new lm0(kwVar, ek0Var3, context, this.K0);
        this.f40521y0 = lm0Var;
        ek0Var3.setAdapter(lm0Var);
        ek0Var3.setOnScrollListener(new jm0(kwVar, cxVar, 1));
        ek0Var3.D0(new hb0(kwVar, 22));
        this.f40504g0 = new hj0(b1Var, true);
        of0 of0Var = new of0(context, cxVar);
        this.f40515s0 = of0Var;
        h51 h51Var = of0Var.f38178c;
        h51Var.setClipToPadding(false);
        h51Var.j(new mm0(kwVar, 0));
        h51Var.D0(new hb0(kwVar, 22));
        di.i4 i4Var = new di.i4(kwVar);
        this.W = i4Var;
        setAdapter(i4Var);
    }

    public static org.telegram.ui.bn I(int i7, org.telegram.messenger.gj gjVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.gj.B0(gjVar.f24213k);
        if (org.telegram.messenger.n5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.n5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(org.telegram.messenger.c.a(i7).f23202a).O0(Long.valueOf(-B0));
            if (O0 != null && O0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -O0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", gjVar.e1());
        return new org.telegram.ui.bn(bundle);
    }

    public static void M(FrameLayout frameLayout, ek0 ek0Var, int i7, int i10, boolean z10) {
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

    public final void H() {
        if (this.f40516t0) {
            int i7 = 0;
            this.f40516t0 = false;
            O();
            z61 z61Var = this.N;
            if (z61Var != null && z61Var.getCurrentTabId() != 0) {
                this.N.e(0, 0);
            }
            nm0 nm0Var = this.f40502e0;
            if (nm0Var != null) {
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
                nm0Var.T(i7, str);
            }
        }
    }

    public final int J(int i7) {
        int i10 = 0;
        while (true) {
            di.i4 i4Var = this.W;
            ArrayList arrayList = (ArrayList) i4Var.f9037b;
            if (i10 < ((ArrayList) i4Var.f9037b).size()) {
                if (((tm0) arrayList.get(i10)).f39945a == 3 && ((tm0) arrayList.get(i10)).f39946b == i7) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final boolean K() {
        int i7 = this.K0;
        if (!org.telegram.messenger.k10.i(i7).q() && !org.telegram.messenger.np.u1(i7).K3()) {
            for (org.telegram.messenger.gj gjVar : this.C0.values()) {
                if (gjVar.F0() != null && gjVar.F0().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void L(View view, int i7, String str, boolean z10) {
        long j3;
        long j10;
        boolean z11;
        org.telegram.ui.c00 c00Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        hm0 hm0Var = this.f40500c0;
        boolean z17 = true;
        if (isEmpty) {
            hm0Var.f37995e.setVisibility(8);
        } else {
            hm0Var.f37995e.setVisibility(0);
            hm0Var.f37995e.setText(org.telegram.messenger.hd.a0(null, null, 2131747972, str));
        }
        nm0 nm0Var = this.f40502e0;
        org.telegram.ui.mw mwVar = nm0Var.V;
        if (mwVar != null) {
            j3 = mwVar.a();
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
                TLObject tLObject = o0Var.f17634f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f28583id;
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.v3.Y((TLRPC.Chat) tLObject)) {
                    i10 = i11;
                } else {
                    j11 = -((TLRPC.Chat) o0Var.f17634f).f28434id;
                }
                i10 = i11;
                j10 = j11;
            } else if (i12 == 6) {
                jg.m0 m0Var = o0Var.f17635g;
                long j15 = m0Var.f17613b;
                i10 = i11;
                j13 = m0Var.f17614c;
                j12 = j15;
            } else {
                i10 = i11;
                if (i12 == 7) {
                    z18 = true;
                }
            }
            i11 = i10 + 1;
        }
        lm0 lm0Var = this.f40521y0;
        lm0Var.getClass();
        if (i30.Y(str, null) == null) {
            H();
        }
        if (view == this.f40506i0) {
            org.telegram.messenger.np.u1(this.K0).N0(0L);
            pm0 pm0Var = this.m0;
            ek0 ek0Var = pm0Var.d;
            ArrayList arrayList2 = pm0Var.T;
            ArrayList arrayList3 = pm0Var.U;
            ArrayList arrayList4 = pm0Var.V;
            ArrayList arrayList5 = pm0Var.S;
            oo ooVar = pm0Var.f37626f0;
            pm0Var.X();
            if (!TextUtils.equals(str, pm0Var.f37625e0)) {
                pm0Var.f37625e0 = str;
                org.telegram.messenger.g0.r(ooVar);
                if (TextUtils.isEmpty(pm0Var.f37625e0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    pm0Var.O(true);
                    pm0Var.f37624d0++;
                    z16 = false;
                    pm0Var.Z = false;
                    pm0Var.f37621a0 = false;
                    pm0Var.f37622b0 = false;
                    pm0Var.f37623c0 = 0;
                    if (ek0Var != null) {
                        ek0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.g0.h3(ooVar, 1000L);
                    pm0Var.Z = true;
                    pm0Var.f37621a0 = true;
                    pm0Var.O(true);
                    if (ek0Var != null) {
                        z16 = false;
                        ek0Var.v0(0);
                    }
                }
                this.f40507j0.b(this.Q0, z16);
            }
            z16 = false;
            this.f40507j0.b(this.Q0, z16);
        } else if (view == this.f40510n0) {
            im0 im0Var = this.f40514r0;
            ek0 ek0Var2 = im0Var.d;
            ArrayList arrayList6 = im0Var.W;
            gs gsVar = im0Var.f36972i0;
            if (TextUtils.equals(str, im0Var.f36971h0)) {
                z15 = false;
            } else {
                im0Var.f36971h0 = str;
                org.telegram.messenger.g0.r(gsVar);
                if (TextUtils.isEmpty(im0Var.f36971h0)) {
                    arrayList6.clear();
                    im0Var.O(true);
                    im0Var.f36970g0++;
                    z15 = false;
                    im0Var.f36966c0 = false;
                    im0Var.f36967d0 = false;
                    im0Var.f36968e0 = false;
                    im0Var.f36969f0 = 0;
                    if (ek0Var2 != null) {
                        ek0Var2.v0(0);
                    }
                } else {
                    z15 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.h3(gsVar, 1000L);
                    im0Var.f36966c0 = true;
                    im0Var.f36967d0 = true;
                    im0Var.O(true);
                    if (ek0Var2 != null) {
                        ek0Var2.v0(0);
                    }
                }
            }
            this.f40511o0.b(this.Q0, z15);
            if (TextUtils.isEmpty(str)) {
                im0Var.W();
            }
        } else {
            of0 of0Var = this.f40515s0;
            if (view == of0Var) {
                h51 h51Var = of0Var.f38178c;
                ArrayList arrayList7 = of0Var.f38181n;
                if (!TextUtils.equals(of0Var.f38185x, str)) {
                    if (of0Var.L >= 0) {
                        ConnectionsManager.getInstance(of0Var.f38177b).cancelRequest(of0Var.L, true);
                        of0Var.L = -1;
                    }
                    of0Var.f38184w = false;
                    of0Var.I.setLoading(false);
                    of0Var.f38185x = str;
                    if (TextUtils.isEmpty(str)) {
                        of0Var.f38182r = 0;
                        of0Var.M++;
                        of0Var.f38183s = false;
                        arrayList7.clear();
                        of0Var.a(false);
                    } else {
                        of0Var.b(str);
                        of0Var.f38182r = 0;
                        of0Var.M++;
                        of0Var.f38183s = false;
                        arrayList7.clear();
                    }
                    of0Var.d();
                    h51Var.v0(0);
                    h51Var.f35789g3.O(true);
                }
            } else if (view == this.f40517u0) {
                if (i30.Y(str, null) != null) {
                    if (z10) {
                        this.f40519w0.h1(0, 0);
                    }
                    lm0Var.Z(str);
                    this.f40518v0.b(this.Q0, false);
                }
            } else if (view == this.f40497a0) {
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                org.telegram.ui.c00 c00Var2 = this.P0;
                if ((i13 == 0 && this.W0 == 0 && j12 == 0 && j13 == 0) || j14 != 0) {
                    this.L0 = false;
                    nm0Var.T(z18 ? 1 : 0, str);
                    nm0Var.B0 = this.O0;
                    c00Var2.animate().setListener(null).cancel();
                    c00Var2.i(null, false);
                    if (z10) {
                        if (nm0Var.E0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        hm0Var.e(!z14, false);
                        if (nm0Var.E0 <= 0) {
                            z17 = false;
                        }
                        hm0Var.e(z17, false);
                    } else if (!nm0Var.M()) {
                        if (nm0Var.E0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        hm0Var.e(z13, true);
                    }
                    if (z10) {
                        c00Var2.setVisibility(8);
                    } else if (c00Var2.getVisibility() != 8) {
                        c00Var2.animate().alpha(0.0f).setListener(new s60(this, 17)).setDuration(150L).start();
                    }
                    c00Var2.setTag(null);
                    c00Var = c00Var2;
                    z12 = false;
                } else {
                    c00Var2.setTag(1);
                    c00Var2.i(this.O0, false);
                    c00Var2.animate().setListener(null).cancel();
                    if (z10) {
                        c00Var2.setVisibility(0);
                        c00Var2.setAlpha(1.0f);
                        z11 = z10;
                    } else {
                        if (c00Var2.getVisibility() != 0) {
                            c00Var2.setVisibility(0);
                            c00Var2.setAlpha(0.0f);
                        } else {
                            z17 = z10;
                        }
                        c00Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z11 = z17;
                    }
                    c00Var = c00Var2;
                    z12 = false;
                    this.P0.h(j10, this.W0, j12, j13, null, z18, str, z11);
                    hm0Var.setVisibility(8);
                }
                hm0Var.b(this.Q0, z12);
                c00Var.f46350c.b(this.Q0, z12);
            } else {
                long j16 = j12;
                long j17 = j13;
                if (view instanceof org.telegram.ui.c00) {
                    org.telegram.ui.c00 c00Var3 = (org.telegram.ui.c00) view;
                    if (j14 == 0) {
                        z17 = false;
                    }
                    c00Var3.setUseFromUserAsAvatar(z17);
                    c00Var3.f46350c.b(this.Q0, false);
                    c00Var3.h(j10, this.W0, j16, j17, jg.q0.f17648k3[((tm0) ((ArrayList) this.W.f9037b).get(i7)).f39946b], z18, str, z10);
                } else if (view instanceof sl0) {
                    sl0 sl0Var = (sl0) view;
                    sl0Var.f39615a.b(this.Q0, false);
                    sl0Var.L = str;
                    sl0Var.d(false);
                }
            }
        }
    }

    public final void N(boolean z10) {
        dk0 dk0Var;
        dk0 dk0Var2;
        dk0 dk0Var3;
        int i7;
        boolean z11;
        int i10;
        int i11;
        org.telegram.ui.mw mwVar;
        int i12;
        if (this.B0 != z10) {
            org.telegram.ui.cx cxVar = this.M0;
            if (!z10 || !cxVar.getActionBar().x()) {
                if (z10 && !cxVar.getActionBar().c("search_view_pager")) {
                    this.I0 = cxVar.getActionBar().p("search_view_pager");
                    if (cxVar.X) {
                        ImageView imageView = new ImageView(getContext());
                        this.f40522z0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f40522z0.setImageDrawable(new org.telegram.ui.ActionBar.x1(true));
                        org.telegram.ui.ActionBar.t6.s(this.f40522z0, org.telegram.ui.ActionBar.m6.f29775y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f40522z0;
                        int i13 = org.telegram.ui.ActionBar.m6.f29794z8;
                        org.telegram.ui.ActionBar.t6.Q(imageView2, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i13, false), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i13), null);
                        this.f40522z0.setOnClickListener(new j70(this, 13));
                        this.I0.addView(this.f40522z0, c8.ma.p(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.I0.getContext());
                    this.A0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.A0.setTypeface(org.telegram.messenger.g0.o());
                    rm0 rm0Var = this.A0;
                    int i14 = org.telegram.ui.ActionBar.m6.f29775y8;
                    xb0 xb0Var = new xb0(7);
                    xb0 xb0Var2 = new xb0(8);
                    int P = org.telegram.ui.ActionBar.t6.P(i14, -1, 0, 0.0f, null);
                    xb0Var2.d(P, rm0Var);
                    org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, rm0Var);
                    w10.c(i14, -1, 0, 0.0f, null);
                    w10.f29827n = xb0Var;
                    w10.f29828o = xb0Var2;
                    w10.f29826m = false;
                    w10.f29821g = P;
                    org.telegram.ui.ActionBar.y yVar = this.I0;
                    rm0 rm0Var2 = this.A0;
                    if (cxVar.X) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    yVar.addView(rm0Var2, c8.ma.m(1.0f, 0, -1, i12, 0, 0));
                    this.A0.setOnTouchListener(new gi.a(22));
                    org.telegram.ui.ActionBar.q0 h = this.I0.h(203, 2131230879, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.N0(2131754800, null));
                    this.E0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.t6.s(this.E0.getIconView(), i14, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.F0 = this.I0.h(200, 2131232226, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.N0(2131754877, null));
                    this.G0 = this.I0.h(201, 2131232167, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.N0(2131750570, null));
                    this.H0 = this.I0.h(202, 2131232110, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.N0(2131751586, null));
                }
                if (this.A0 != null) {
                    nm0 nm0Var = this.f40502e0;
                    if (nm0Var != null && (mwVar = nm0Var.V) != null && mwVar.a() != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0.getLayoutParams();
                    if (cxVar.X) {
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
                    rm0 rm0Var3 = this.A0;
                    rm0Var3.setLayoutParams(rm0Var3.getLayoutParams());
                }
                if (cxVar.getActionBar().getBackButton() != null && (cxVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.s4)) {
                    org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
                    cxVar.getActionBar().setBackButtonDrawable(x1Var);
                    x1Var.setColorFilter(null);
                }
                this.B0 = z10;
                HashMap hashMap = this.C0;
                if (z10) {
                    org.telegram.messenger.g0.v1(cxVar.getParentActivity().getCurrentFocus());
                    cxVar.getActionBar().R(null, null);
                    this.A0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.q0 q0Var = this.E0;
                    if (K()) {
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
                cxVar.getActionBar().w();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.c00) && (dk0Var3 = ((org.telegram.ui.c00) getChildAt(i15)).d) != null) {
                        dk0Var3.f();
                    }
                    if (getChildAt(i15) instanceof sl0) {
                        ((sl0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.c00 c00Var = this.P0;
                if (c00Var != null && (dk0Var2 = c00Var.d) != null) {
                    dk0Var2.f();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.c00) && (dk0Var = ((org.telegram.ui.c00) view).d) != null) {
                        dk0Var.f();
                    }
                }
            }
        }
    }

    public final void O() {
        this.W.l();
        j(false);
        z61 z61Var = this.N;
        if (z61Var != null) {
            z61Var.f36221y.f();
        }
    }

    @Override
    public final boolean V1() {
        return this.B0;
    }

    @Override
    public final void Z0(org.telegram.messenger.gj gjVar, View view, int i7) {
        boolean z10;
        int i10;
        int i11;
        org.telegram.ui.vz vzVar = new org.telegram.ui.vz(gjVar.e1(), org.telegram.messenger.gj.B0(gjVar.f24213k));
        HashMap hashMap = this.C0;
        if (hashMap.containsKey(vzVar)) {
            hashMap.remove(vzVar);
        } else if (hashMap.size() < 100) {
            hashMap.put(vzVar, gjVar);
        } else {
            return;
        }
        int i12 = 0;
        if (hashMap.size() == 0) {
            N(false);
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
                boolean K = K();
                if (K) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if (this.E0.getVisibility() != i10) {
                    this.E0.setVisibility(i10);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.E0.getIconView().getDrawable();
                    org.telegram.ui.ActionBar.t6.x(this, animatedVectorDrawable, org.telegram.ui.ActionBar.m6.f29775y8, null, PorterDuff.Mode.SRC_IN);
                    if (K) {
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
                        if (!((org.telegram.messenger.gj) hashMap.get((org.telegram.ui.vz) it.next())).Q) {
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
        if (view instanceof org.telegram.ui.Cells.i7) {
            ((org.telegram.ui.Cells.i7) view).b(hashMap.containsKey(vzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.q7) {
            ((org.telegram.ui.Cells.q7) view).b(i7, hashMap.containsKey(vzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.l7) {
            ((org.telegram.ui.Cells.l7) view).f(hashMap.containsKey(vzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.h7) {
            ((org.telegram.ui.Cells.h7) view).e(hashMap.containsKey(vzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.i2) {
            ((org.telegram.ui.Cells.i2) view).c(hashMap.containsKey(vzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.u2) {
            ((org.telegram.ui.Cells.u2) view).c0(hashMap.containsKey(vzVar), true);
        }
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8401a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.f40497a0;
                ek0 ek0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        ek0Var = this.f40499b0;
                    } else if (view == this.f40506i0) {
                        ek0Var = this.f40509l0;
                    } else if (view == this.f40510n0) {
                        ek0Var = this.f40513q0;
                    } else if (view == this.f40517u0) {
                        ek0Var = this.f40520x0;
                    } else {
                        sl0 sl0Var = this.J0;
                        if (view == sl0Var) {
                            ek0Var = sl0Var.f39616b;
                        } else {
                            of0 of0Var = this.f40515s0;
                            if (view == of0Var) {
                                ek0Var = of0Var.f38178c;
                            } else if (view instanceof org.telegram.ui.c00) {
                                ek0Var = ((org.telegram.ui.c00) view).f46348b;
                            }
                        }
                    }
                }
                if (ek0Var != null) {
                    ih.d.a(ek0Var, canvas, rectF, ek0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.c00 c00Var = this.P0;
                    if (c00Var.getVisibility() == 0) {
                        org.telegram.ui.et etVar = c00Var.f46348b;
                        ih.d.a(etVar, canvas, rectF, etVar, this);
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ls.f25319h3;
        boolean z10 = false;
        pm0 pm0Var = this.m0;
        if (i7 == i11) {
            if (org.telegram.messenger.np.u1(this.K0).N0(0L) != null) {
                z10 = true;
            }
            this.f40507j0.e(z10, true);
            pm0Var.X();
            pm0Var.O(true);
        } else if (i7 != org.telegram.messenger.ls.f25420y1 && i7 != org.telegram.messenger.ls.f25378s) {
            if (i7 == org.telegram.messenger.ls.V0) {
                this.f40514r0.O(true);
            } else if (i7 == org.telegram.messenger.ls.A5) {
                Object obj = objArr[0];
                lm0 lm0Var = this.f40521y0;
                if (obj == lm0Var.T) {
                    lm0Var.O(true);
                }
            }
        } else {
            pm0Var.X();
            pm0Var.O(true);
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

    public i71 getTabsView() {
        return this.N;
    }

    @Override
    public final void n() {
        N(true);
    }

    @Override
    public final void o() {
        this.T0.K();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xi.e eVar = this.Z0;
        if (eVar != null) {
            eVar.b();
            this.Z0 = null;
        }
        xi.e eVar2 = new xi.e(org.telegram.messenger.ls.f(this.K0), this);
        eVar2.c(org.telegram.messenger.ls.f25319h3);
        eVar2.c(org.telegram.messenger.ls.f25420y1);
        eVar2.c(org.telegram.messenger.ls.f25378s);
        eVar2.c(org.telegram.messenger.ls.V0);
        eVar2.c(org.telegram.messenger.ls.A5);
        this.Z0 = eVar2;
        this.f40505h0 = true;
        pm0 pm0Var = this.m0;
        if (pm0Var != null) {
            pm0Var.O(false);
        }
        im0 im0Var = this.f40514r0;
        if (im0Var != null) {
            im0Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40505h0 = false;
        xi.e eVar = this.Z0;
        if (eVar != null) {
            eVar.b();
            this.Z0 = null;
        }
    }

    @Override
    public final void p(View view, View view2, int i7, int i10) {
        boolean z10;
        nm0 nm0Var = this.f40502e0;
        org.telegram.ui.c00 c00Var = this.P0;
        if (i7 == 0) {
            if (c00Var.getVisibility() == 0) {
                c00Var.i(this.O0, false);
                nm0Var.B0 = null;
            } else {
                c00Var.i(null, false);
                org.telegram.ui.tz tzVar = this.O0;
                nm0Var.B0 = tzVar;
                if (tzVar != null) {
                    ((org.telegram.ui.ju) tzVar).j(false, null, nm0Var.f17527z0, nm0Var.A0);
                }
            }
        } else if (view instanceof org.telegram.ui.c00) {
            if (i10 == 0 && c00Var.getVisibility() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ((org.telegram.ui.c00) view).i(this.O0, z10);
        }
        if (view2 instanceof org.telegram.ui.c00) {
            ((org.telegram.ui.c00) view2).i(null, false);
            return;
        }
        nm0Var.B0 = null;
        c00Var.i(null, false);
    }

    @Override
    public final boolean r0(org.telegram.ui.vz vzVar) {
        return this.C0.containsKey(vzVar);
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        this.f40498a1 = cVar;
    }

    public void setFilteredSearchViewDelegate(org.telegram.ui.tz tzVar) {
        this.O0 = tzVar;
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
            if (getChildAt(i10) instanceof org.telegram.ui.c00) {
                ((org.telegram.ui.c00) getChildAt(i10)).f46350c.b(i7, z10);
            } else if (getChildAt(i10) == this.f40497a0) {
                this.f40500c0.b(i7, z10);
                this.P0.f46350c.b(i7, z10);
            } else if (getChildAt(i10) instanceof sl0) {
                ((sl0) getChildAt(i10)).f39615a.b(i7, z10);
            } else if (getChildAt(i10) == this.f40506i0) {
                this.f40507j0.b(i7, z10);
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
        z61 z61Var = this.N;
        if (z61Var != null) {
            z61Var.g(1.0f, i7);
        }
        invalidate();
    }

    @Override
    public final void t0(org.telegram.messenger.gj gjVar) {
        this.M0.presentFragment(I(this.K0, gjVar));
        N(false);
    }
}
