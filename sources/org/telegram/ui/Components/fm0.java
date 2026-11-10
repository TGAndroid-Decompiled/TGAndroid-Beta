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
public abstract class fm0 extends v61 implements org.telegram.ui.a00, org.telegram.messenger.ls, eh.a {
    public static final int f33586a1 = 0;
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
    public final org.telegram.ui.zw L0;
    public String M0;
    public org.telegram.ui.sz N0;
    public final org.telegram.ui.b00 O0;
    public int P0;
    public boolean Q0;
    public final org.telegram.ui.gv R0;
    public final st0 S0;
    public final int T0;
    public int U0;
    public final bi.g5 V;
    public final long V0;
    public final FrameLayout W;
    public int W0;
    public int X0;
    public ab.b0 Y0;
    public dh.c Z0;
    public final bi.q1 f33587a0;
    public final sl0 f33588b0;
    public final v4.k f33589c0;
    public final yl0 f33590d0;
    public final v4.b0 f33591e0;
    public final si0 f33592f0;
    public boolean f33593g0;
    public final FrameLayout f33594h0;
    public final sl0 f33595i0;
    public final v4.b0 f33596j0;
    public final pj0 f33597k0;
    public final am0 f33598l0;
    public final FrameLayout m0;
    public final sl0 f33599n0;
    public final v4.b0 f33600o0;
    public final pj0 f33601p0;
    public final tl0 f33602q0;
    public final ze0 f33603r0;
    public boolean f33604s0;
    public final FrameLayout f33605t0;
    public final sl0 f33606u0;
    public final v4.b0 f33607v0;
    public final pj0 f33608w0;
    public final wl0 f33609x0;
    public ImageView f33610y0;
    public cm0 f33611z0;

    public fm0(Context context, org.telegram.ui.zw zwVar, int i7, int i10, int i11, long j3, org.telegram.ui.gv gvVar) {
        super(context, null);
        int i12;
        int i13;
        int i14;
        int i15;
        this.f33604s0 = false;
        this.B0 = new HashMap();
        this.C0 = new ArrayList();
        int i16 = org.telegram.messenger.p10.f24474s0;
        this.J0 = i16;
        this.U0 = 0;
        this.T0 = i11;
        this.V0 = j3;
        this.L0 = zwVar;
        this.R0 = gvVar;
        v4.k kVar = new v4.k();
        this.f33589c0 = kVar;
        kVar.f57124c = 150L;
        kVar.f57125e = 350L;
        kVar.f57126f = 0L;
        kVar.f57127g = 0L;
        kVar.d = 0L;
        kVar.f57128i = new OvershootInterpolator(1.1f);
        kVar.f57108o = wq.h;
        org.telegram.ui.iw iwVar = (org.telegram.ui.iw) this;
        this.f33590d0 = new yl0(iwVar, context, zwVar, i7, i10, kVar, zwVar.F, zwVar, context);
        if (i10 == 15) {
            ArrayList d42 = zwVar.d4(i16, i10, i11, true);
            ArrayList arrayList = new ArrayList();
            for (int i17 = 0; i17 < d42.size(); i17 = com.google.android.recaptcha.internal.a.g(i17, 1, ((TLRPC.Dialog) d42.get(i17)).f26964id, arrayList)) {
            }
            this.f33590d0.f16756q0 = arrayList;
        }
        this.S0 = (st0) zwVar.getFragmentView();
        bi.q1 q1Var = new bi.q1(25, context, iwVar);
        this.f33587a0 = q1Var;
        q1Var.setItemAnimator(this.f33589c0);
        q1Var.setPivotY(0.0f);
        q1Var.setClipToPadding(false);
        q1Var.setAdapter(this.f33590d0);
        q1Var.setVerticalScrollBarEnabled(true);
        q1Var.setInstantClick(true);
        if (org.telegram.messenger.id.f23161a0) {
            i12 = 1;
        } else {
            i12 = 2;
        }
        q1Var.setVerticalScrollbarPosition(i12);
        v4.b0 b0Var = new v4.b0(1, false);
        this.f33591e0 = b0Var;
        q1Var.setLayoutManager(b0Var);
        q1Var.W1 = true;
        q1Var.X1 = 0;
        q1Var.setOnScrollListener(new ul0(iwVar, zwVar, 2));
        q1Var.D0(new ob0(iwVar, 19));
        org.telegram.ui.b00 b00Var = new org.telegram.ui.b00(this.L0);
        this.O0 = b00Var;
        org.telegram.ui.ct ctVar = b00Var.f43862b;
        ctVar.setClipToPadding(false);
        ctVar.j(new xl0(iwVar, 1));
        ctVar.D0(new ob0(iwVar, 19));
        b00Var.setUiCallback(this);
        b00Var.setVisibility(8);
        b00Var.setChatPreviewDelegate(gvVar);
        lz lzVar = new lz(context, null);
        lzVar.setViewType(1);
        sl0 sl0Var = new sl0(iwVar, context, lzVar, 2);
        this.f33588b0 = sl0Var;
        sl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        sl0Var.f32368e.setVisibility(8);
        sl0Var.setVisibility(8);
        sl0Var.addView(lzVar, 0);
        sl0Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(sl0Var);
        frameLayout.addView(q1Var);
        frameLayout.addView(b00Var);
        q1Var.setEmptyView(sl0Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33594h0 = frameLayout2;
        zl0 zl0Var = new zl0(iwVar);
        zl0Var.f57079m = false;
        zl0Var.C = false;
        wq wqVar = wq.h;
        zl0Var.o(wqVar);
        zl0Var.n(350L);
        pj0 pj0Var = new pj0(context, null);
        this.f33597k0 = pj0Var;
        pj0Var.setItemAnimator(zl0Var);
        pj0Var.setPivotY(0.0f);
        pj0Var.setVerticalScrollBarEnabled(true);
        pj0Var.setInstantClick(true);
        if (org.telegram.messenger.id.f23161a0) {
            i13 = 1;
        } else {
            i13 = 2;
        }
        pj0Var.setVerticalScrollbarPosition(i13);
        v4.b0 b0Var2 = new v4.b0(1, false);
        this.f33596j0 = b0Var2;
        pj0Var.setLayoutManager(b0Var2);
        pj0Var.W1 = true;
        pj0Var.X1 = 0;
        pj0Var.setClipToPadding(false);
        lz lzVar2 = new lz(context, null);
        lzVar2.setViewType(1);
        sl0 sl0Var2 = new sl0(iwVar, context, lzVar2, 3);
        this.f33595i0 = sl0Var2;
        sl0Var2.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        sl0Var2.f32368e.setVisibility(8);
        sl0Var2.setVisibility(8);
        sl0Var2.addView(lzVar2, 0);
        sl0Var2.e(true, false);
        frameLayout2.addView(sl0Var2);
        frameLayout2.addView(pj0Var);
        pj0Var.setEmptyView(sl0Var2);
        am0 am0Var = new am0(iwVar, pj0Var, context, this.J0, i11, zwVar);
        this.f33598l0 = am0Var;
        pj0Var.setAdapter(am0Var);
        pj0Var.setOnScrollListener(new ul0(iwVar, zwVar, 3));
        pj0Var.D0(new ob0(iwVar, 19));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.m0 = frameLayout3;
        rl0 rl0Var = new rl0(iwVar);
        rl0Var.f57079m = false;
        rl0Var.C = false;
        rl0Var.o(wqVar);
        rl0Var.n(350L);
        pj0 pj0Var2 = new pj0(context, null);
        this.f33601p0 = pj0Var2;
        pj0Var2.setItemAnimator(rl0Var);
        pj0Var2.setPivotY(0.0f);
        pj0Var2.setClipToPadding(false);
        pj0Var2.setVerticalScrollBarEnabled(true);
        pj0Var2.setInstantClick(true);
        if (org.telegram.messenger.id.f23161a0) {
            i14 = 1;
        } else {
            i14 = 2;
        }
        pj0Var2.setVerticalScrollbarPosition(i14);
        v4.b0 b0Var3 = new v4.b0(1, false);
        this.f33600o0 = b0Var3;
        pj0Var2.setLayoutManager(b0Var3);
        pj0Var2.W1 = true;
        pj0Var2.X1 = 0;
        lz lzVar3 = new lz(context, null);
        lzVar3.setViewType(1);
        sl0 sl0Var3 = new sl0(iwVar, context, lzVar3, 0);
        this.f33599n0 = sl0Var3;
        sl0Var3.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        sl0Var3.f32368e.setVisibility(8);
        sl0Var3.setVisibility(8);
        sl0Var3.addView(lzVar3, 0);
        sl0Var3.e(true, false);
        frameLayout3.addView(sl0Var3);
        frameLayout3.addView(pj0Var2);
        pj0Var2.setEmptyView(sl0Var3);
        tl0 tl0Var = new tl0(iwVar, pj0Var2, context, this.J0, i11);
        this.f33602q0 = tl0Var;
        pj0Var2.setAdapter(tl0Var);
        pj0Var2.setOnScrollListener(new ul0(iwVar, zwVar, 0));
        pj0Var2.D0(new ob0(iwVar, 19));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f33605t0 = frameLayout4;
        vl0 vl0Var = new vl0(iwVar);
        vl0Var.f57079m = false;
        vl0Var.C = false;
        vl0Var.o(wqVar);
        vl0Var.n(350L);
        pj0 pj0Var3 = new pj0(context, null);
        this.f33608w0 = pj0Var3;
        pj0Var3.setItemAnimator(vl0Var);
        pj0Var3.setPivotY(0.0f);
        pj0Var3.setVerticalScrollBarEnabled(true);
        pj0Var3.setInstantClick(true);
        if (org.telegram.messenger.id.f23161a0) {
            i15 = 1;
        } else {
            i15 = 2;
        }
        pj0Var3.setVerticalScrollbarPosition(i15);
        v4.b0 b0Var4 = new v4.b0(1, false);
        this.f33607v0 = b0Var4;
        pj0Var3.setLayoutManager(b0Var4);
        pj0Var3.W1 = true;
        pj0Var3.X1 = 0;
        pj0Var3.setClipToPadding(false);
        lz lzVar4 = new lz(context, null);
        lzVar4.setViewType(1);
        sl0 sl0Var4 = new sl0(iwVar, context, lzVar4, 1);
        this.f33606u0 = sl0Var4;
        sl0Var4.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        sl0Var4.f32368e.setVisibility(8);
        sl0Var4.setVisibility(8);
        sl0Var4.addView(lzVar4, 0);
        sl0Var4.e(true, false);
        frameLayout4.addView(sl0Var4);
        frameLayout4.addView(pj0Var3);
        pj0Var3.setEmptyView(sl0Var4);
        wl0 wl0Var = new wl0(iwVar, pj0Var3, context, this.J0);
        this.f33609x0 = wl0Var;
        pj0Var3.setAdapter(wl0Var);
        pj0Var3.setOnScrollListener(new ul0(iwVar, zwVar, 1));
        pj0Var3.D0(new ob0(iwVar, 19));
        this.f33592f0 = new si0(q1Var, true);
        ze0 ze0Var = new ze0(context, zwVar);
        this.f33603r0 = ze0Var;
        r41 r41Var = ze0Var.f40923c;
        r41Var.setClipToPadding(false);
        r41Var.j(new xl0(iwVar, 0));
        r41Var.D0(new ob0(iwVar, 19));
        bi.g5 g5Var = new bi.g5(iwVar);
        this.V = g5Var;
        setAdapter(g5Var);
    }

    public static org.telegram.ui.cn M(int i7, org.telegram.messenger.ij ijVar) {
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.ij.B0(ijVar.f23266k);
        if (org.telegram.messenger.m5.C(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).f21770a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", ijVar.e1());
        return new org.telegram.ui.cn(bundle);
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
        if (this.f33604s0) {
            int i7 = 0;
            this.f33604s0 = false;
            S();
            k61 k61Var = this.M;
            if (k61Var != null && k61Var.getCurrentTabId() != 0) {
                this.M.d(0, 0);
            }
            yl0 yl0Var = this.f33590d0;
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
            ArrayList arrayList = (ArrayList) g5Var.f3937b;
            if (i10 < ((ArrayList) g5Var.f3937b).size()) {
                if (((em0) arrayList.get(i10)).f33296a == 3 && ((em0) arrayList.get(i10)).f33297b == i7) {
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
        org.telegram.ui.b00 b00Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        long j11;
        boolean isEmpty = TextUtils.isEmpty(str);
        sl0 sl0Var = this.f33588b0;
        boolean z16 = true;
        if (isEmpty) {
            sl0Var.f32368e.setVisibility(8);
        } else {
            sl0Var.f32368e.setVisibility(0);
            sl0Var.f32368e.setText(org.telegram.messenger.id.a0(null, null, 2131748165, str));
        }
        yl0 yl0Var = this.f33590d0;
        org.telegram.ui.kw kwVar = yl0Var.U;
        if (kwVar != null) {
            j3 = kwVar.a();
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
                    j11 = ((TLRPC.User) tLObject).f27109id;
                } else if (!(tLObject instanceof TLRPC.Chat) || org.telegram.messenger.t3.Y((TLRPC.Chat) tLObject)) {
                    i10 = i11;
                } else {
                    j11 = -((TLRPC.Chat) o0Var.f16874f).f26960id;
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
        wl0 wl0Var = this.f33609x0;
        wl0Var.getClass();
        if (u20.Y(str, null) == null) {
            L();
        }
        if (view == this.f33594h0) {
            org.telegram.messenger.qp.s1(this.J0).L0(0L);
            am0 am0Var = this.f33598l0;
            pj0 pj0Var = am0Var.d;
            ArrayList arrayList2 = am0Var.S;
            ArrayList arrayList3 = am0Var.T;
            ArrayList arrayList4 = am0Var.U;
            ArrayList arrayList5 = am0Var.R;
            gp gpVar = am0Var.f40061e0;
            am0Var.X();
            if (!TextUtils.equals(str, am0Var.f40060d0)) {
                am0Var.f40060d0 = str;
                org.telegram.messenger.g0.r(gpVar);
                if (TextUtils.isEmpty(am0Var.f40060d0)) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    am0Var.O(true);
                    am0Var.f40059c0++;
                    z15 = false;
                    am0Var.Y = false;
                    am0Var.Z = false;
                    am0Var.f40057a0 = false;
                    am0Var.f40058b0 = 0;
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
                this.f33595i0.b(this.P0, z15);
            }
            z15 = false;
            this.f33595i0.b(this.P0, z15);
        } else if (view == this.m0) {
            tl0 tl0Var = this.f33602q0;
            pj0 pj0Var2 = tl0Var.d;
            ArrayList arrayList6 = tl0Var.V;
            qr qrVar = tl0Var.f38739h0;
            if (TextUtils.equals(str, tl0Var.f38738g0)) {
                z14 = false;
            } else {
                tl0Var.f38738g0 = str;
                org.telegram.messenger.g0.r(qrVar);
                if (TextUtils.isEmpty(tl0Var.f38738g0)) {
                    arrayList6.clear();
                    tl0Var.O(true);
                    tl0Var.f38737f0++;
                    z14 = false;
                    tl0Var.f38733b0 = false;
                    tl0Var.f38734c0 = false;
                    tl0Var.f38735d0 = false;
                    tl0Var.f38736e0 = 0;
                    if (pj0Var2 != null) {
                        pj0Var2.v0(0);
                    }
                } else {
                    z14 = false;
                    arrayList6.clear();
                    org.telegram.messenger.g0.i3(qrVar, 1000L);
                    tl0Var.f38733b0 = true;
                    tl0Var.f38734c0 = true;
                    tl0Var.O(true);
                    if (pj0Var2 != null) {
                        pj0Var2.v0(0);
                    }
                }
            }
            this.f33599n0.b(this.P0, z14);
            if (TextUtils.isEmpty(str)) {
                tl0Var.W();
            }
        } else {
            ze0 ze0Var = this.f33603r0;
            if (view == ze0Var) {
                r41 r41Var = ze0Var.f40923c;
                ArrayList arrayList7 = ze0Var.f40926n;
                if (!TextUtils.equals(ze0Var.f40930x, str)) {
                    if (ze0Var.K >= 0) {
                        ConnectionsManager.getInstance(ze0Var.f40922b).cancelRequest(ze0Var.K, true);
                        ze0Var.K = -1;
                    }
                    ze0Var.f40929w = false;
                    ze0Var.H.setLoading(false);
                    ze0Var.f40930x = str;
                    if (TextUtils.isEmpty(str)) {
                        ze0Var.f40927r = 0;
                        ze0Var.L++;
                        ze0Var.f40928s = false;
                        arrayList7.clear();
                        ze0Var.a(false);
                    } else {
                        ze0Var.b(str);
                        ze0Var.f40927r = 0;
                        ze0Var.L++;
                        ze0Var.f40928s = false;
                        arrayList7.clear();
                    }
                    ze0Var.d();
                    r41Var.v0(0);
                    r41Var.f37496f3.O(true);
                }
            } else if (view == this.f33605t0) {
                if (u20.Y(str, null) != null) {
                    if (z9) {
                        this.f33607v0.h1(0, 0);
                    }
                    wl0Var.Z(str);
                    this.f33606u0.b(this.P0, false);
                }
            } else if (view == this.W) {
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                org.telegram.ui.b00 b00Var2 = this.O0;
                if ((i13 == 0 && this.V0 == 0 && j12 == 0 && j13 == 0) || j14 != 0) {
                    this.K0 = false;
                    yl0Var.T(z17 ? 1 : 0, str);
                    yl0Var.A0 = this.N0;
                    b00Var2.animate().setListener(null).cancel();
                    b00Var2.i(null, false);
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
                        b00Var2.setVisibility(8);
                    } else if (b00Var2.getVisibility() != 8) {
                        b00Var2.animate().alpha(0.0f).setListener(new e60(this, 17)).setDuration(150L).start();
                    }
                    b00Var2.setTag(null);
                    b00Var = b00Var2;
                    z11 = false;
                } else {
                    b00Var2.setTag(1);
                    b00Var2.i(this.N0, false);
                    b00Var2.animate().setListener(null).cancel();
                    if (z9) {
                        b00Var2.setVisibility(0);
                        b00Var2.setAlpha(1.0f);
                        z10 = z9;
                    } else {
                        if (b00Var2.getVisibility() != 0) {
                            b00Var2.setVisibility(0);
                            b00Var2.setAlpha(0.0f);
                        } else {
                            z16 = z9;
                        }
                        b00Var2.animate().alpha(1.0f).setDuration(150L).start();
                        z10 = z16;
                    }
                    b00Var = b00Var2;
                    z11 = false;
                    this.O0.h(j10, this.V0, j12, j13, null, z17, str, z10);
                    sl0Var.setVisibility(8);
                }
                sl0Var.b(this.P0, z11);
                b00Var.f43864c.b(this.P0, z11);
            } else {
                long j16 = j12;
                long j17 = j13;
                if (view instanceof org.telegram.ui.b00) {
                    org.telegram.ui.b00 b00Var3 = (org.telegram.ui.b00) view;
                    if (j14 == 0) {
                        z16 = false;
                    }
                    b00Var3.setUseFromUserAsAvatar(z16);
                    b00Var3.f43864c.b(this.P0, false);
                    b00Var3.h(j10, this.V0, j16, j17, jg.q0.j3[((em0) ((ArrayList) this.V.f3937b).get(i7)).f33297b], z17, str, z9);
                } else if (view instanceof dl0) {
                    dl0 dl0Var = (dl0) view;
                    dl0Var.f33022a.b(this.P0, false);
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
        org.telegram.ui.kw kwVar;
        int i12;
        if (this.A0 != z9) {
            org.telegram.ui.zw zwVar = this.L0;
            if (!z9 || !zwVar.getActionBar().x()) {
                if (z9 && !zwVar.getActionBar().c("search_view_pager")) {
                    this.H0 = zwVar.getActionBar().p("search_view_pager");
                    if (zwVar.W) {
                        ImageView imageView = new ImageView(getContext());
                        this.f33610y0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        this.f33610y0.setImageDrawable(new org.telegram.ui.ActionBar.y1(true));
                        org.telegram.ui.ActionBar.t6.s(this.f33610y0, org.telegram.ui.ActionBar.m6.f28284y8, null, PorterDuff.Mode.MULTIPLY);
                        ImageView imageView2 = this.f33610y0;
                        int i13 = org.telegram.ui.ActionBar.m6.f28302z8;
                        org.telegram.ui.ActionBar.t6.Q(imageView2, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i13, false), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i13), null);
                        this.f33610y0.setOnClickListener(new la0(this, 10));
                        this.H0.addView(this.f33610y0, c8.ha.p(54, 54, 0.0f, 16));
                    }
                    ?? numberTextView = new NumberTextView(this.H0.getContext());
                    this.f33611z0 = numberTextView;
                    numberTextView.setTextSize(18);
                    this.f33611z0.setTypeface(org.telegram.messenger.g0.o());
                    cm0 cm0Var = this.f33611z0;
                    int i14 = org.telegram.ui.ActionBar.m6.f28284y8;
                    il0 il0Var = new il0(2);
                    il0 il0Var2 = new il0(3);
                    int P = org.telegram.ui.ActionBar.t6.P(i14, -1, 0, 0.0f, null);
                    il0Var2.c(P, cm0Var);
                    org.telegram.ui.ActionBar.n6 w10 = org.telegram.ui.ActionBar.t6.w(101, cm0Var);
                    w10.c(i14, -1, 0, 0.0f, null);
                    w10.f28335n = il0Var;
                    w10.f28336o = il0Var2;
                    w10.f28334m = false;
                    w10.f28329g = P;
                    org.telegram.ui.ActionBar.y yVar = this.H0;
                    cm0 cm0Var2 = this.f33611z0;
                    if (zwVar.W) {
                        i12 = 18;
                    } else {
                        i12 = 72;
                    }
                    yVar.addView(cm0Var2, c8.ha.m(1.0f, 0, -1, i12, 0, 0));
                    this.f33611z0.setOnTouchListener(new ei.b(21));
                    org.telegram.ui.ActionBar.r0 h = this.H0.h(203, 2131230879, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131754801, null));
                    this.D0 = h;
                    if (h.getIconView() != null) {
                        org.telegram.ui.ActionBar.t6.s(this.D0.getIconView(), i14, null, PorterDuff.Mode.SRC_IN);
                    }
                    this.E0 = this.H0.h(200, 2131232224, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131754877, null));
                    this.F0 = this.H0.h(201, 2131232165, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131750587, null));
                    this.G0 = this.H0.h(202, 2131232108, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131751598, null));
                }
                if (this.f33611z0 != null) {
                    yl0 yl0Var = this.f33590d0;
                    if (yl0Var != null && (kwVar = yl0Var.U) != null && kwVar.a() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f33611z0.getLayoutParams();
                    if (zwVar.W) {
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
                    cm0 cm0Var3 = this.f33611z0;
                    cm0Var3.setLayoutParams(cm0Var3.getLayoutParams());
                }
                if (zwVar.getActionBar().getBackButton() != null && (zwVar.getActionBar().getBackButton().getDrawable() instanceof org.telegram.ui.ActionBar.s4)) {
                    org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
                    zwVar.getActionBar().setBackButtonDrawable(y1Var);
                    y1Var.setColorFilter(null);
                }
                this.A0 = z9;
                HashMap hashMap = this.B0;
                if (z9) {
                    org.telegram.messenger.g0.v1(zwVar.getParentActivity().getCurrentFocus());
                    zwVar.getActionBar().Q(null, null);
                    this.f33611z0.a(hashMap.size(), false);
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
                zwVar.getActionBar().w();
                hashMap.clear();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    if ((getChildAt(i15) instanceof org.telegram.ui.b00) && (oj0Var3 = ((org.telegram.ui.b00) getChildAt(i15)).d) != null) {
                        oj0Var3.f();
                    }
                    if (getChildAt(i15) instanceof dl0) {
                        ((dl0) getChildAt(i15)).d(true);
                    }
                }
                org.telegram.ui.b00 b00Var = this.O0;
                if (b00Var != null && (oj0Var2 = b00Var.d) != null) {
                    oj0Var2.f();
                }
                SparseArray sparseArray = this.h;
                int size = sparseArray.size();
                for (int i16 = 0; i16 < size; i16++) {
                    View view = (View) sparseArray.valueAt(i16);
                    if ((view instanceof org.telegram.ui.b00) && (oj0Var = ((org.telegram.ui.b00) view).d) != null) {
                        oj0Var.f();
                    }
                }
            }
        }
    }

    public final void S() {
        this.V.l();
        o(false);
        k61 k61Var = this.M;
        if (k61Var != null) {
            k61Var.f38583y.f();
        }
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        aVar.f8703a = true;
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
                        pj0Var = this.f33587a0;
                    } else if (view == this.f33594h0) {
                        pj0Var = this.f33597k0;
                    } else if (view == this.m0) {
                        pj0Var = this.f33601p0;
                    } else if (view == this.f33605t0) {
                        pj0Var = this.f33608w0;
                    } else {
                        dl0 dl0Var = this.I0;
                        if (view == dl0Var) {
                            pj0Var = dl0Var.f33023b;
                        } else {
                            ze0 ze0Var = this.f33603r0;
                            if (view == ze0Var) {
                                pj0Var = ze0Var.f40923c;
                            } else if (view instanceof org.telegram.ui.b00) {
                                pj0Var = ((org.telegram.ui.b00) view).f43862b;
                            }
                        }
                    }
                }
                if (pj0Var != null) {
                    ih.d.a(pj0Var, canvas, rectF, pj0Var, this);
                }
                if (view == frameLayout) {
                    org.telegram.ui.b00 b00Var = this.O0;
                    if (b00Var.getVisibility() == 0) {
                        org.telegram.ui.ct ctVar = b00Var.f43862b;
                        ih.d.a(ctVar, canvas, rectF, ctVar, this);
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25003f3;
        boolean z9 = false;
        am0 am0Var = this.f33598l0;
        if (i7 == i11) {
            if (org.telegram.messenger.qp.s1(this.J0).L0(0L) != null) {
                z9 = true;
            }
            this.f33595i0.e(z9, true);
            am0Var.X();
            am0Var.O(true);
        } else if (i7 != org.telegram.messenger.qs.f25116y1 && i7 != org.telegram.messenger.qs.f25074s) {
            if (i7 == org.telegram.messenger.qs.V0) {
                this.f33602q0.O(true);
            } else if (i7 == org.telegram.messenger.qs.f25113x5) {
                Object obj = objArr[0];
                wl0 wl0Var = this.f33609x0;
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
    public final boolean f(org.telegram.ui.uz uzVar) {
        return this.B0.containsKey(uzVar);
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

    public u61 getTabsView() {
        return this.M;
    }

    @Override
    public final void h(org.telegram.messenger.ij ijVar, View view, int i7) {
        boolean z9;
        int i10;
        int i11;
        org.telegram.ui.uz uzVar = new org.telegram.ui.uz(ijVar.e1(), org.telegram.messenger.ij.B0(ijVar.f23266k));
        HashMap hashMap = this.B0;
        if (hashMap.containsKey(uzVar)) {
            hashMap.remove(uzVar);
        } else if (hashMap.size() < 100) {
            hashMap.put(uzVar, ijVar);
        } else {
            return;
        }
        int i12 = 0;
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.f33611z0.a(hashMap.size(), true);
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
                    org.telegram.ui.ActionBar.t6.x(this, animatedVectorDrawable, org.telegram.ui.ActionBar.m6.f28284y8, null, PorterDuff.Mode.SRC_IN);
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
                        if (!((org.telegram.messenger.ij) hashMap.get((org.telegram.ui.uz) it.next())).Q) {
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
            ((org.telegram.ui.Cells.h7) view).b(hashMap.containsKey(uzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.p7) {
            ((org.telegram.ui.Cells.p7) view).b(i7, hashMap.containsKey(uzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.k7) {
            ((org.telegram.ui.Cells.k7) view).f(hashMap.containsKey(uzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.g7) {
            ((org.telegram.ui.Cells.g7) view).e(hashMap.containsKey(uzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.h2) {
            ((org.telegram.ui.Cells.h2) view).c(hashMap.containsKey(uzVar), true);
        } else if (view instanceof org.telegram.ui.Cells.t2) {
            ((org.telegram.ui.Cells.t2) view).c0(hashMap.containsKey(uzVar), true);
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
        b0Var2.c(org.telegram.messenger.qs.f25003f3);
        b0Var2.c(org.telegram.messenger.qs.f25116y1);
        b0Var2.c(org.telegram.messenger.qs.f25074s);
        b0Var2.c(org.telegram.messenger.qs.V0);
        b0Var2.c(org.telegram.messenger.qs.f25113x5);
        this.Y0 = b0Var2;
        this.f33593g0 = true;
        am0 am0Var = this.f33598l0;
        if (am0Var != null) {
            am0Var.O(false);
        }
        tl0 tl0Var = this.f33602q0;
        if (tl0Var != null) {
            tl0Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33593g0 = false;
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

    public void setFilteredSearchViewDelegate(org.telegram.ui.sz szVar) {
        this.N0 = szVar;
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
            if (getChildAt(i10) instanceof org.telegram.ui.b00) {
                ((org.telegram.ui.b00) getChildAt(i10)).f43864c.b(i7, z9);
            } else if (getChildAt(i10) == this.W) {
                this.f33588b0.b(i7, z9);
                this.O0.f43864c.b(i7, z9);
            } else if (getChildAt(i10) instanceof dl0) {
                ((dl0) getChildAt(i10)).f33022a.b(i7, z9);
            } else if (getChildAt(i10) == this.f33594h0) {
                this.f33595i0.b(i7, z9);
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
        k61 k61Var = this.M;
        if (k61Var != null) {
            k61Var.f(1.0f, i7);
        }
        invalidate();
    }

    @Override
    public final void t(View view, View view2, int i7, int i10) {
        boolean z9;
        yl0 yl0Var = this.f33590d0;
        org.telegram.ui.b00 b00Var = this.O0;
        if (i7 == 0) {
            if (b00Var.getVisibility() == 0) {
                b00Var.i(this.N0, false);
                yl0Var.A0 = null;
            } else {
                b00Var.i(null, false);
                org.telegram.ui.sz szVar = this.N0;
                yl0Var.A0 = szVar;
                if (szVar != null) {
                    ((org.telegram.ui.iu) szVar).j(false, null, yl0Var.f16769y0, yl0Var.f16770z0);
                }
            }
        } else if (view instanceof org.telegram.ui.b00) {
            if (i10 == 0 && b00Var.getVisibility() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ((org.telegram.ui.b00) view).i(this.N0, z9);
        }
        if (view2 instanceof org.telegram.ui.b00) {
            ((org.telegram.ui.b00) view2).i(null, false);
            return;
        }
        yl0Var.A0 = null;
        b00Var.i(null, false);
    }
}
