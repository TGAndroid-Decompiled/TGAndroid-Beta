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
public abstract class rm0 extends g71 implements org.telegram.ui.b00, org.telegram.messenger.fs, eh.a {
    public static final int f39179b1 = 0;
    public om0 A0;
    public boolean B0;
    public final HashMap C0;
    public final ArrayList D0;
    public org.telegram.ui.ActionBar.r0 E0;
    public org.telegram.ui.ActionBar.r0 F0;
    public org.telegram.ui.ActionBar.r0 G0;
    public org.telegram.ui.ActionBar.r0 H0;
    public org.telegram.ui.ActionBar.z I0;
    public ql0 J0;
    public final int K0;
    public boolean L0;
    public final org.telegram.ui.cx M0;
    public String N0;
    public org.telegram.ui.tz O0;
    public final org.telegram.ui.c00 P0;
    public int Q0;
    public boolean R0;
    public final org.telegram.ui.hv S0;
    public final au0 T0;
    public final int U0;
    public int V0;
    public final di.i4 W;
    public final long W0;
    public int X0;
    public int Y0;
    public xi.e Z0;
    public final FrameLayout f39180a0;
    public dh.c f39181a1;
    public final di.b1 f39182b0;
    public final em0 f39183c0;
    public final v4.k f39184d0;
    public final km0 f39185e0;
    public final v4.c0 f39186f0;
    public final fj0 f39187g0;
    public boolean f39188h0;
    public final FrameLayout f39189i0;
    public final em0 f39190j0;
    public final v4.c0 f39191k0;
    public final ck0 f39192l0;
    public final mm0 m0;
    public final FrameLayout f39193n0;
    public final em0 f39194o0;
    public final v4.c0 f39195p0;
    public final ck0 f39196q0;
    public final fm0 f39197r0;
    public final mf0 f39198s0;
    public boolean f39199t0;
    public final FrameLayout f39200u0;
    public final em0 f39201v0;
    public final v4.c0 f39202w0;
    public final ck0 f39203x0;
    public final im0 f39204y0;
    public ImageView f39205z0;

    public rm0(Context context, org.telegram.ui.cx cxVar, int i7, int i10, int i11, long j3, org.telegram.ui.hv hvVar) {
        super(context, null);
        int i12;
        int i13;
        int i14;
        int i15;
        this.f39199t0 = false;
        this.C0 = new HashMap();
        this.D0 = new ArrayList();
        int i16 = org.telegram.messenger.j10.f24770t0;
        this.K0 = i16;
        this.V0 = 0;
        this.U0 = i11;
        this.W0 = j3;
        this.M0 = cxVar;
        this.S0 = hvVar;
        v4.k kVar = new v4.k();
        this.f39184d0 = kVar;
        kVar.f59196c = 150L;
        kVar.f59197e = 350L;
        kVar.f59198f = 0L;
        kVar.f59199g = 0L;
        kVar.d = 0L;
        kVar.f59200i = new OvershootInterpolator(1.1f);
        kVar.f59170o = lr.h;
        org.telegram.ui.kw kwVar = (org.telegram.ui.kw) this;
        this.f39185e0 = new km0(kwVar, context, cxVar, i7, i10, kVar, cxVar.G, cxVar, context);
        if (i10 == 15) {
            ArrayList d42 = cxVar.d4(i16, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 < d42.size(); i17 = com.google.android.gms.internal.vision.e2.g(i17, 1, ((TLRPC.Dialog) d42.get(i17)).f28407id, arrayList)) {
            }
            this.f39185e0.f17487r0 = arrayList;
        }
        this.T0 = (au0) cxVar.getFragmentView();
        di.b1 b1Var = new di.b1(25, context, kwVar);
        this.f39182b0 = b1Var;
        b1Var.setItemAnimator(this.f39184d0);
        b1Var.setPivotY(0.0f);
        b1Var.setClipToPadding(false);
        b1Var.setAdapter(this.f39185e0);
        b1Var.setVerticalScrollBarEnabled(true);
        b1Var.setInstantClick(true);
        if (org.telegram.messenger.gd.f24213a0) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        b1Var.setVerticalScrollbarPosition(i12);
        v4.c0 c0Var = new v4.c0(1, false);
        this.f39186f0 = c0Var;
        b1Var.setLayoutManager(c0Var);
        b1Var.X1 = true;
        b1Var.Y1 = 0;
        b1Var.setOnScrollListener(new gm0(kwVar, cxVar, 2));
        b1Var.D0(new gb0(kwVar, 22));
        org.telegram.ui.c00 c00Var = new org.telegram.ui.c00(this.M0);
        this.P0 = c00Var;
        org.telegram.ui.et etVar = c00Var.f46322b;
        etVar.setClipToPadding(false);
        etVar.j(new jm0(kwVar, 1));
        etVar.D0(new gb0(kwVar, 22));
        c00Var.setUiCallback(this);
        c00Var.setVisibility(8);
        c00Var.setChatPreviewDelegate(hvVar);
        wz wzVar = new wz(context, null);
        wzVar.setViewType(1);
        em0 em0Var = new em0(kwVar, context, wzVar, 2);
        this.f39183c0 = em0Var;
        em0Var.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var.f36896e.setVisibility(8);
        em0Var.setVisibility(8);
        em0Var.addView(wzVar, 0);
        em0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39180a0 = frameLayout;
        frameLayout.addView(em0Var);
        frameLayout.addView(b1Var);
        frameLayout.addView(c00Var);
        b1Var.setEmptyView(em0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39189i0 = frameLayout2;
        lm0 lm0Var = new lm0(kwVar);
        lm0Var.f59152m = false;
        lm0Var.C = false;
        lr lrVar = lr.h;
        lm0Var.o(lrVar);
        lm0Var.n(350L);
        ck0 ck0Var = new ck0(context, null);
        this.f39192l0 = ck0Var;
        ck0Var.setItemAnimator(lm0Var);
        ck0Var.setPivotY(0.0f);
        ck0Var.setVerticalScrollBarEnabled(true);
        ck0Var.setInstantClick(true);
        if (org.telegram.messenger.gd.f24213a0) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        ck0Var.setVerticalScrollbarPosition(i13);
        v4.c0 c0Var2 = new v4.c0(1, false);
        this.f39191k0 = c0Var2;
        ck0Var.setLayoutManager(c0Var2);
        ck0Var.X1 = true;
        ck0Var.Y1 = 0;
        ck0Var.setClipToPadding(false);
        wz wzVar2 = new wz(context, null);
        wzVar2.setViewType(1);
        em0 em0Var2 = new em0(kwVar, context, wzVar2, 3);
        this.f39190j0 = em0Var2;
        em0Var2.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var2.f36896e.setVisibility(8);
        em0Var2.setVisibility(8);
        em0Var2.addView(wzVar2, 0);
        em0Var2.e(true, false);
        frameLayout2.addView(em0Var2);
        frameLayout2.addView(ck0Var);
        ck0Var.setEmptyView(em0Var2);
        mm0 mm0Var = new mm0(kwVar, ck0Var, context, this.K0, i11, cxVar);
        this.m0 = mm0Var;
        ck0Var.setAdapter(mm0Var);
        ck0Var.setOnScrollListener(new gm0(kwVar, cxVar, 3));
        ck0Var.D0(new gb0(kwVar, 22));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f39193n0 = frameLayout3;
        dm0 dm0Var = new dm0(kwVar);
        dm0Var.f59152m = false;
        dm0Var.C = false;
        dm0Var.o(lrVar);
        dm0Var.n(350L);
        ck0 ck0Var2 = new ck0(context, null);
        this.f39196q0 = ck0Var2;
        ck0Var2.setItemAnimator(dm0Var);
        ck0Var2.setPivotY(0.0f);
        ck0Var2.setClipToPadding(false);
        ck0Var2.setVerticalScrollBarEnabled(true);
        ck0Var2.setInstantClick(true);
        if (org.telegram.messenger.gd.f24213a0) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        ck0Var2.setVerticalScrollbarPosition(i14);
        v4.c0 c0Var3 = new v4.c0(1, false);
        this.f39195p0 = c0Var3;
        ck0Var2.setLayoutManager(c0Var3);
        ck0Var2.X1 = true;
        ck0Var2.Y1 = 0;
        wz wzVar3 = new wz(context, null);
        wzVar3.setViewType(1);
        em0 em0Var3 = new em0(kwVar, context, wzVar3, 0);
        this.f39194o0 = em0Var3;
        em0Var3.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var3.f36896e.setVisibility(8);
        em0Var3.setVisibility(8);
        em0Var3.addView(wzVar3, 0);
        em0Var3.e(true, false);
        frameLayout3.addView(em0Var3);
        frameLayout3.addView(ck0Var2);
        ck0Var2.setEmptyView(em0Var3);
        fm0 fm0Var = new fm0(kwVar, ck0Var2, context, this.K0, i11);
        this.f39197r0 = fm0Var;
        ck0Var2.setAdapter(fm0Var);
        ck0Var2.setOnScrollListener(new gm0(kwVar, cxVar, 0));
        ck0Var2.D0(new gb0(kwVar, 22));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f39200u0 = frameLayout4;
        hm0 hm0Var = new hm0(kwVar);
        hm0Var.f59152m = false;
        hm0Var.C = false;
        hm0Var.o(lrVar);
        hm0Var.n(350L);
        ck0 ck0Var3 = new ck0(context, null);
        this.f39203x0 = ck0Var3;
        ck0Var3.setItemAnimator(hm0Var);
        ck0Var3.setPivotY(0.0f);
        ck0Var3.setVerticalScrollBarEnabled(true);
        ck0Var3.setInstantClick(true);
        if (org.telegram.messenger.gd.f24213a0) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        ck0Var3.setVerticalScrollbarPosition(i15);
        v4.c0 c0Var4 = new v4.c0(1, false);
        this.f39202w0 = c0Var4;
        ck0Var3.setLayoutManager(c0Var4);
        ck0Var3.X1 = true;
        ck0Var3.Y1 = 0;
        ck0Var3.setClipToPadding(false);
        wz wzVar4 = new wz(context, null);
        wzVar4.setViewType(1);
        em0 em0Var4 = new em0(kwVar, context, wzVar4, 1);
        this.f39201v0 = em0Var4;
        em0Var4.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var4.f36896e.setVisibility(8);
        em0Var4.setVisibility(8);
        em0Var4.addView(wzVar4, 0);
        em0Var4.e(true, false);
        frameLayout4.addView(em0Var4);
        frameLayout4.addView(ck0Var3);
        ck0Var3.setEmptyView(em0Var4);
        im0 im0Var = new im0(kwVar, ck0Var3, context, this.K0);
        this.f39204y0 = im0Var;
        ck0Var3.setAdapter(im0Var);
        ck0Var3.setOnScrollListener(new gm0(kwVar, cxVar, 1));
        ck0Var3.D0(new gb0(kwVar, 22));
        this.f39187g0 = new fj0(b1Var, true);
        mf0 mf0Var = new mf0(context, cxVar);
        this.f39198s0 = mf0Var;
        e51 e51Var = mf0Var.f37453c;
        e51Var.setClipToPadding(false);
        e51Var.j(new jm0(kwVar, 0));
        e51Var.D0(new gb0(kwVar, 22));
        di.i4 i4Var = new di.i4(kwVar);
        this.W = i4Var;
        setAdapter(i4Var);
    }

    public static org.telegram.ui.bn I(int i7, org.telegram.messenger.fj fjVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.fj.B0(fjVar.f23965k);
        if (org.telegram.messenger.n5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.n5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i7).f23218a).O0(Long.valueOf(-B0));
            if (O0 != null && O0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -O0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", fjVar.e1());
        return new org.telegram.ui.bn(bundle);
    }

    public static void M(FrameLayout frameLayout, ck0 ck0Var, int i7, int i10, boolean z10) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i7, 0, i10);
        if (z10) {
            ck0Var.q1(0, i7, 0, i10);
        } else {
            ck0Var.setPadding(0, i7, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ck0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i7;
        marginLayoutParams.bottomMargin = -i10;
    }

    public final void H() {
        if (this.f39199t0) {
            int i7 = 0;
            this.f39199t0 = false;
            O();
            w61 w61Var = this.N;
            if (w61Var != null && w61Var.getCurrentTabId() != 0) {
                this.N.e(0, 0);
            }
            km0 km0Var = this.f39185e0;
            if (km0Var != null) {
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
                km0Var.T(i7, str);
            }
        }
    }

    public final int J(int i7) {
        int i10 = 0;
        while (true) {
            di.i4 i4Var = this.W;
            ArrayList arrayList = (ArrayList) i4Var.f9007b;
            if (i10 < ((ArrayList) i4Var.f9007b).size()) {
                if (((qm0) arrayList.get(i10)).f38841a == 3 && ((qm0) arrayList.get(i10)).f38842b == i7) {
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
        if (!org.telegram.messenger.j10.i(i7).q() && !org.telegram.messenger.mp.u1(i7).K3()) {
            for (org.telegram.messenger.fj fjVar : this.C0.values()) {
                if (fjVar.F0() != null && fjVar.F0().size >= 157286400) {
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
        em0 em0Var = this.f39183c0;
        boolean z17 = true;
        if (isEmpty) {
            em0Var.f36896e.setVisibility(8);
        } else {
            em0Var.f36896e.setVisibility(0);
            em0Var.f36896e.setText(org.telegram.messenger.gd.a0(null, null, 2131747973, str));
        }
        km0 km0Var = this.f39185e0;
        org.telegram.ui.mw mwVar = km0Var.V;
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
                TLObject tLObject = o0Var.f17606f;
                if (tLObject instanceof TLRPC.User) {
                    j11 = ((TLRPC.User) tLObject).f28552id;
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.v3.Y((TLRPC.Chat) tLObject)) {
                    i10 = i11;
                } else {
                    j11 = -((TLRPC.Chat) o0Var.f17606f).f28403id;
                }
                i10 = i11;
                j10 = j11;
            } else if (i12 == 6) {
                jg.m0 m0Var = o0Var.f17607g;
                long j15 = m0Var.f17585b;
                i10 = i11;
                j13 = m0Var.f17586c;
                j12 = j15;
            } else {
                i10 = i11;
                if (i12 == 7) {
                    z18 = true;
                }
            }
            i11 = i10 + 1;
        }
        im0 im0Var = this.f39204y0;
        im0Var.getClass();
        if (f30.Y(str, null) == null) {
            H();
        }
        if (view == this.f39189i0) {
            org.telegram.messenger.mp.u1(this.K0).N0(0L);
            mm0 mm0Var = this.m0;
            ck0 ck0Var = mm0Var.d;
            ArrayList arrayList2 = mm0Var.T;
            ArrayList arrayList3 = mm0Var.U;
            ArrayList arrayList4 = mm0Var.V;
            ArrayList arrayList5 = mm0Var.S;
            mo moVar = mm0Var.f36872f0;
            mm0Var.X();
            if (!TextUtils.equals(str, mm0Var.f36871e0)) {
                mm0Var.f36871e0 = str;
                org.telegram.messenger.g0.r(moVar);
                if (TextUtils.isEmpty(mm0Var.f36871e0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    mm0Var.O(true);
                    mm0Var.f36870d0++;
                    z16 = false;
                    mm0Var.Z = false;
                    mm0Var.f36867a0 = false;
                    mm0Var.f36868b0 = false;
                    mm0Var.f36869c0 = 0;
                    if (ck0Var != null) {
                        ck0Var.v0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    org.telegram.messenger.g0.h3(moVar, 1000L);
                    mm0Var.Z = true;
                    mm0Var.f36867a0 = true;
                    mm0Var.O(true);
                    if (ck0Var != null) {
                        z16 = false;
                        ck0Var.v0(0);
                    }
                }
                this.f39190j0.b(this.Q0, z16);
            }
            z16 = false;
            this.f39190j0.b(this.Q0, z16);
        } else if (view == this.f39193n0) {
            fm0 fm0Var = this.f39197r0;
            ck0 ck0Var2 = fm0Var.d;
            ArrayList arrayList6 = fm0Var.W;
            es esVar = fm0Var.f36189i0;
            if (TextUtils.equals(str, fm0Var.f36188h0)) {
                z15 = false;
            } else {
                fm0Var.f36188h0 = str;
                org.telegram.messenger.g0.r(esVar);
                if (TextUtils.isEmpty(fm0Var.f36188h0)) {
                    arrayList6.clear();
                    fm0Var.O(true);
                    fm0Var.f36187g0++;
                    z15 = false;
                    fm0Var.f36183c0 = false;
                    fm0Var.f36184d0 = false;
                    fm0Var.f36185e0 = false;
                    fm0Var.f36186f0 = 0;
                    if (ck0Var2 != null) {
                        ck0Var2.v0(0);
                    }
                } else {
                    z15 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.h3(esVar, 1000L);
                    fm0Var.f36183c0 = true;
                    fm0Var.f36184d0 = true;
                    fm0Var.O(true);
                    if (ck0Var2 != null) {
                        ck0Var2.v0(0);
                    }
                }
            }
            this.f39194o0.b(this.Q0, z15);
            if (TextUtils.isEmpty(str)) {
                fm0Var.W();
            }
        } else {
            mf0 mf0Var = this.f39198s0;
            if (view == mf0Var) {
                e51 e51Var = mf0Var.f37453c;
                ArrayList arrayList7 = mf0Var.f37456n;
                if (!TextUtils.equals(mf0Var.f37460x, str)) {
                    if (mf0Var.L >= 0) {
                        ConnectionsManager.getInstance(mf0Var.f37452b).cancelRequest(mf0Var.L, true);
                        mf0Var.L = -1;
                    }
                    mf0Var.f37459w = false;
                    mf0Var.I.setLoading(false);
                    mf0Var.f37460x = str;
                    if (TextUtils.isEmpty(str)) {
                        mf0Var.f37457r = 0;
                        mf0Var.M++;
                        mf0Var.f37458s = false;
                        arrayList7.clear();
                        mf0Var.a(false);
                    } else {
                        mf0Var.b(str);
                        mf0Var.f37457r = 0;
                        mf0Var.M++;
                        mf0Var.f37458s = false;
                        arrayList7.clear();
                    }
                    mf0Var.d();
                    e51Var.v0(0);
                    e51Var.f34607g3.O(true);
                }
            } else if (view == this.f39200u0) {
                if (f30.Y(str, null) != null) {
                    if (z10) {
                        this.f39202w0.h1(0, 0);
                    }
                    im0Var.Z(str);
                    this.f39201v0.b(this.Q0, false);
                }
            } else if (view == this.f39180a0) {
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                org.telegram.ui.c00 c00Var2 = this.P0;
                if ((i13 == 0 && this.W0 == 0 && j12 == 0 && j13 == 0) || j14 != 0) {
                    this.L0 = false;
                    km0Var.T(z18 ? 1 : 0, str);
                    km0Var.B0 = this.O0;
                    c00Var2.animate().setListener(null).cancel();
                    c00Var2.i(null, false);
                    if (z10) {
                        if (km0Var.E0 > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        em0Var.e(!z14, false);
                        if (km0Var.E0 <= 0) {
                            z17 = false;
                        }
                        em0Var.e(z17, false);
                    } else if (!km0Var.M()) {
                        if (km0Var.E0 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        em0Var.e(z13, true);
                    }
                    if (z10) {
                        c00Var2.setVisibility(8);
                    } else if (c00Var2.getVisibility() != 8) {
                        c00Var2.animate().alpha(0.0f).setListener(new q60(this, 17)).setDuration(150L).start();
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
                    em0Var.setVisibility(8);
                }
                em0Var.b(this.Q0, z12);
                c00Var.f46324c.b(this.Q0, z12);
            } else {
                long j16 = j12;
                long j17 = j13;
                if (view instanceof org.telegram.ui.c00) {
                    org.telegram.ui.c00 c00Var3 = (org.telegram.ui.c00) view;
                    if (j14 == 0) {
                        z17 = false;
                    }
                    c00Var3.setUseFromUserAsAvatar(z17);
                    c00Var3.f46324c.b(this.Q0, false);
                    c00Var3.h(j10, this.W0, j16, j17, jg.q0.f17620k3[((qm0) ((ArrayList) this.W.f9007b).get(i7)).f38842b], z18, str, z10);
                } else if (view instanceof ql0) {
                    ql0 ql0Var = (ql0) view;
                    ql0Var.f38827a.b(this.Q0, false);
                    ql0Var.L = str;
                    ql0Var.d(false);
                }
            }
        }
    }

    public final void N(boolean z10) {
        bk0 bk0Var;
        bk0 bk0Var2;
        bk0 bk0Var3;
        int i7;
        boolean z11;
        int i10;
        int i11;
        org.telegram.ui.mw mwVar;
        int i12;
        if (this.B0 != z10) {
            org.telegram.ui.cx cxVar = this.M0;
            if (!z10 || !cxVar.getActionBar().y()) {
                if (z10 && !cxVar.getActionBar().c("search_view_pager")) {
                    this.I0 = cxVar.getActionBar().q("search_view_pager");
                    if (cxVar.X) {
                        ImageView imageView = new ImageView(getContext());
                        this.f39205z0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f39205z0.setImageDrawable(new org.telegram.ui.ActionBar.y1(true));
                        org.telegram.ui.ActionBar.u6.s(this.f39205z0, org.telegram.ui.ActionBar.n6.f29788y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f39205z0;
                        int i13 = org.telegram.ui.ActionBar.n6.f29807z8;
                        org.telegram.ui.ActionBar.u6.Q(imageView2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i13, false), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i13), null);
                        this.f39205z0.setOnClickListener(new h70(this, 12));
                        this.I0.addView(this.f39205z0, c8.ma.p(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.I0.getContext());
                    this.A0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.A0.setTypeface(org.telegram.messenger.g0.o());
                    om0 om0Var = this.A0;
                    int i14 = org.telegram.ui.ActionBar.n6.f29788y8;
                    wb0 wb0Var = new wb0(7);
                    wb0 wb0Var2 = new wb0(8);
                    int P = org.telegram.ui.ActionBar.u6.P(i14, -1, 0, 0.0f, null);
                    wb0Var2.d(P, om0Var);
                    org.telegram.ui.ActionBar.o6 w10 = org.telegram.ui.ActionBar.u6.w(101, om0Var);
                    w10.c(i14, -1, 0, 0.0f, null);
                    w10.f29841n = wb0Var;
                    w10.f29842o = wb0Var2;
                    w10.f29840m = false;
                    w10.f29835g = P;
                    org.telegram.ui.ActionBar.z zVar = this.I0;
                    om0 om0Var2 = this.A0;
                    if (cxVar.X) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    zVar.addView(om0Var2, c8.ma.m(1.0f, 0, -1, i12, 0, 0));
                    this.A0.setOnTouchListener(new gi.a(22));
                    org.telegram.ui.ActionBar.r0 h = this.I0.h(203, 2131230879, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131754801, null));
                    this.E0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.u6.s(this.E0.getIconView(), i14, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.F0 = this.I0.h(200, 2131232226, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131754877, null));
                    this.G0 = this.I0.h(201, 2131232167, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131750571, null));
                    this.H0 = this.I0.h(202, 2131232110, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131751587, null));
                }
                if (this.A0 != null) {
                    km0 km0Var = this.f39185e0;
                    if (km0Var != null && (mwVar = km0Var.V) != null && mwVar.a() != 0) {
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
                    om0 om0Var3 = this.A0;
                    om0Var3.setLayoutParams(om0Var3.getLayoutParams());
                }
                if (cxVar.getActionBar().getBackButton() != null && (cxVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.t4)) {
                    org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
                    cxVar.getActionBar().setBackButtonDrawable(y1Var);
                    y1Var.setColorFilter(null);
                }
                this.B0 = z10;
                HashMap hashMap = this.C0;
                if (z10) {
                    org.telegram.messenger.g0.v1(cxVar.getParentActivity().getCurrentFocus());
                    cxVar.getActionBar().S(null, null);
                    this.A0.a(hashMap.size(), false);
                    org.telegram.ui.ActionBar.r0 r0Var = this.E0;
                    if (K()) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    r0Var.setVisibility(i7);
                    this.F0.setVisibility(0);
                    this.G0.setVisibility(0);
                    this.H0.setVisibility(0);
                    return;
                }
                cxVar.getActionBar().x();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.c00) && (bk0Var3 = ((org.telegram.ui.c00) getChildAt(i15)).d) != null) {
                        bk0Var3.f();
                    }
                    if (getChildAt(i15) instanceof ql0) {
                        ((ql0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.c00 c00Var = this.P0;
                if (c00Var != null && (bk0Var2 = c00Var.d) != null) {
                    bk0Var2.f();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.c00) && (bk0Var = ((org.telegram.ui.c00) view).d) != null) {
                        bk0Var.f();
                    }
                }
            }
        }
    }

    public final void O() {
        this.W.l();
        j(false);
        w61 w61Var = this.N;
        if (w61Var != null) {
            w61Var.f35018y.f();
        }
    }

    @Override
    public final boolean V1() {
        return this.B0;
    }

    @Override
    public final void Z0(org.telegram.messenger.fj fjVar, View view, int i7) {
        boolean z10;
        int i10;
        int i11;
        org.telegram.ui.vz vzVar = new org.telegram.ui.vz(fjVar.e1(), org.telegram.messenger.fj.B0(fjVar.f23965k));
        HashMap hashMap = this.C0;
        if (hashMap.containsKey(vzVar)) {
            hashMap.remove(vzVar);
        } else if (hashMap.size() < 100) {
            hashMap.put(vzVar, fjVar);
        } else {
            return;
        }
        int i12 = 0;
        if (hashMap.size() == 0) {
            N(false);
        } else {
            this.A0.a(hashMap.size(), true);
            org.telegram.ui.ActionBar.r0 r0Var = this.F0;
            if (r0Var != null) {
                if (hashMap.size() == 1) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                r0Var.setVisibility(i11);
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
                    org.telegram.ui.ActionBar.u6.x(this, animatedVectorDrawable, org.telegram.ui.ActionBar.n6.f29788y8, null, PorterDuff.Mode.SRC_IN);
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
                        if (!((org.telegram.messenger.fj) hashMap.get((org.telegram.ui.vz) it.next())).Q) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                org.telegram.ui.ActionBar.r0 r0Var2 = this.H0;
                if (!z10) {
                    i12 = 8;
                }
                r0Var2.setVisibility(i12);
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
        aVar.f8369a = true;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.f39180a0;
                ck0 ck0Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        ck0Var = this.f39182b0;
                    } else if (view == this.f39189i0) {
                        ck0Var = this.f39192l0;
                    } else if (view == this.f39193n0) {
                        ck0Var = this.f39196q0;
                    } else if (view == this.f39200u0) {
                        ck0Var = this.f39203x0;
                    } else {
                        ql0 ql0Var = this.J0;
                        if (view == ql0Var) {
                            ck0Var = ql0Var.f38828b;
                        } else {
                            mf0 mf0Var = this.f39198s0;
                            if (view == mf0Var) {
                                ck0Var = mf0Var.f37453c;
                            } else if (view instanceof org.telegram.ui.c00) {
                                ck0Var = ((org.telegram.ui.c00) view).f46322b;
                            }
                        }
                    }
                }
                if (ck0Var != null) {
                    ih.d.a(ck0Var, canvas, rectF, ck0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.c00 c00Var = this.P0;
                    if (c00Var.getVisibility() == 0) {
                        org.telegram.ui.et etVar = c00Var.f46322b;
                        ih.d.a(etVar, canvas, rectF, etVar, this);
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.f25125h3;
        boolean z10 = false;
        mm0 mm0Var = this.m0;
        if (i7 == i11) {
            if (org.telegram.messenger.mp.u1(this.K0).N0(0L) != null) {
                z10 = true;
            }
            this.f39190j0.e(z10, true);
            mm0Var.X();
            mm0Var.O(true);
        } else if (i7 != org.telegram.messenger.ks.f25226y1 && i7 != org.telegram.messenger.ks.f25184s) {
            if (i7 == org.telegram.messenger.ks.V0) {
                this.f39197r0.O(true);
            } else if (i7 == org.telegram.messenger.ks.A5) {
                Object obj = objArr[0];
                im0 im0Var = this.f39204y0;
                if (obj == im0Var.T) {
                    im0Var.O(true);
                }
            }
        } else {
            mm0Var.X();
            mm0Var.O(true);
        }
    }

    public org.telegram.ui.ActionBar.z getActionMode() {
        return this.I0;
    }

    public ArrayList<jg.o0> getCurrentSearchFilters() {
        return this.D0;
    }

    public ql0 getDownloadsContainer() {
        return this.J0;
    }

    public int getFolderId() {
        return this.U0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public org.telegram.ui.ActionBar.r0 getSpeedItem() {
        return this.E0;
    }

    public f71 getTabsView() {
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
        xi.e eVar2 = new xi.e(org.telegram.messenger.ks.f(this.K0), this);
        eVar2.c(org.telegram.messenger.ks.f25125h3);
        eVar2.c(org.telegram.messenger.ks.f25226y1);
        eVar2.c(org.telegram.messenger.ks.f25184s);
        eVar2.c(org.telegram.messenger.ks.V0);
        eVar2.c(org.telegram.messenger.ks.A5);
        this.Z0 = eVar2;
        this.f39188h0 = true;
        mm0 mm0Var = this.m0;
        if (mm0Var != null) {
            mm0Var.O(false);
        }
        fm0 fm0Var = this.f39197r0;
        if (fm0Var != null) {
            fm0Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39188h0 = false;
        xi.e eVar = this.Z0;
        if (eVar != null) {
            eVar.b();
            this.Z0 = null;
        }
    }

    @Override
    public final void p(View view, View view2, int i7, int i10) {
        boolean z10;
        km0 km0Var = this.f39185e0;
        org.telegram.ui.c00 c00Var = this.P0;
        if (i7 == 0) {
            if (c00Var.getVisibility() == 0) {
                c00Var.i(this.O0, false);
                km0Var.B0 = null;
            } else {
                c00Var.i(null, false);
                org.telegram.ui.tz tzVar = this.O0;
                km0Var.B0 = tzVar;
                if (tzVar != null) {
                    ((org.telegram.ui.ju) tzVar).j(false, null, km0Var.f17499z0, km0Var.A0);
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
        km0Var.B0 = null;
        c00Var.i(null, false);
    }

    @Override
    public final boolean r0(org.telegram.ui.vz vzVar) {
        return this.C0.containsKey(vzVar);
    }

    public void setBlurredBackgroundDrawableFactory(dh.c cVar) {
        this.f39181a1 = cVar;
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
                ((org.telegram.ui.c00) getChildAt(i10)).f46324c.b(i7, z10);
            } else if (getChildAt(i10) == this.f39180a0) {
                this.f39183c0.b(i7, z10);
                this.P0.f46324c.b(i7, z10);
            } else if (getChildAt(i10) instanceof ql0) {
                ((ql0) getChildAt(i10)).f38827a.b(i7, z10);
            } else if (getChildAt(i10) == this.f39189i0) {
                this.f39190j0.b(i7, z10);
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
        w61 w61Var = this.N;
        if (w61Var != null) {
            w61Var.g(1.0f, i7);
        }
        invalidate();
    }

    @Override
    public final void t0(org.telegram.messenger.fj fjVar) {
        this.M0.presentFragment(I(this.K0, fjVar));
        N(false);
    }
}
