package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class qg0 extends org.telegram.ui.Components.na {
    public static qg0 f49220m2;
    public final og0 P1;
    public final ng0 Q1;
    public final l00 R1;
    public final mg0 S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public final HashSet V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final HashMap Y1;
    public final ArrayList Z1;
    public final LinkedHashMap f49221a2;
    public String f49222b2;
    public xg.i f49223c2;
    public int d2;
    public int f49224e2;
    public float f49225f2;
    public org.telegram.ui.Components.yo f49226g2;
    public final int f49227h2;
    public final pg0 f49228i2;
    public final Boolean f49229j2;
    public final Boolean f49230k2;
    public final m4 f49231l2;

    public qg0(org.telegram.ui.ActionBar.f2 f2Var, int i7, Boolean bool, Boolean bool2, pg0 pg0Var) {
        super(f2Var, true, false, f2Var.getResourceProvider());
        this.T1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.U1 = arrayList;
        HashSet hashSet = new HashSet();
        this.V1 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.W1 = arrayList3;
        this.X1 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.Y1 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.Z1 = arrayList4;
        this.f49221a2 = new LinkedHashMap();
        this.d2 = org.telegram.messenger.g0.L(120.0f);
        this.f49224e2 = -1;
        this.f49231l2 = new m4(this, 13);
        this.f49227h2 = i7;
        this.f49229j2 = bool;
        this.f49230k2 = bool2;
        this.f49228i2 = pg0Var;
        this.l1.setTitle(O0());
        mg0 mg0Var = new mg0(0, getContext(), this.I0);
        this.S1 = mg0Var;
        mg0Var.setOnCloseClickListener(new kg0(this, 0));
        mg0Var.setText(O0());
        mg0Var.setCloseImageVisible(false);
        mg0Var.f1071f.c(false, 0.0f);
        this.f49226g2 = new org.telegram.ui.Components.yo(this, 2);
        ng0 ng0Var = new ng0(this, getContext(), this.I0, 0);
        this.Q1 = ng0Var;
        int i10 = org.telegram.ui.ActionBar.k6.f27922h5;
        org.telegram.ui.ActionBar.r6.i(i10, ng0Var, this.I0);
        ng0Var.setOnSearchTextChange(new r3(this, 14));
        ng0Var.f1097b.r(org.telegram.messenger.hd.M0(2131745837, null), false);
        l00 l00Var = new l00(2, getContext(), this);
        this.R1 = l00Var;
        ViewGroup viewGroup = this.f28616b;
        int i11 = this.f28646t0;
        viewGroup.addView(mg0Var, 0, c8.ha.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup2 = this.f28616b;
        int i12 = this.f28646t0;
        viewGroup2.addView(ng0Var, c8.ha.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup3 = this.f28616b;
        int i13 = this.f28646t0;
        viewGroup3.addView(l00Var, c8.ha.f(1.0f, -1, 55, i13, 0, i13, 0));
        ah.a aVar = new ah.a(getContext(), this.I0, (org.telegram.ui.Components.pj0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.r6.i(i10, aVar, this.I0);
        og0 og0Var = new og0(this, getContext(), this.I0, 0);
        this.P1 = og0Var;
        og0Var.setOnClickListener(new lg0(this, 0));
        aVar.addView(og0Var, c8.ha.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f28616b;
        int i14 = this.f28646t0;
        viewGroup4.addView(aVar, c8.ha.f(-2.0f, -1, 87, i14, 0, i14, 0));
        xg.i iVar = this.f49223c2;
        org.telegram.ui.Components.pj0 pj0Var = this.f36261k1;
        iVar.f58651n = arrayList;
        iVar.f58650f = pj0Var;
        int i15 = this.f28646t0;
        pj0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(60.0f));
        this.f36261k1.j(new g3(this, 21));
        this.f36261k1.setOnItemClickListener(new l2.q(this, i7, 14));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f56978m = false;
        this.f36261k1.setItemAnimator(kVar);
        this.f36261k1.i(new fi.o1(this, 6));
        ng0Var.setText("");
        ng0Var.d.b(false);
        ng0Var.b(false, hashSet, new kg0(this, 1), null);
        mg0Var.setText(O0());
        e1(false);
        arrayList2.addAll(org.telegram.messenger.g5.r(this.f28613a).f22589e0);
        hashMap.putAll(org.telegram.messenger.g5.r(this.f28613a).f22592g0);
        arrayList4.addAll(org.telegram.messenger.g5.r(this.f28613a).f22593h0);
        arrayList3.addAll(org.telegram.messenger.ui.b0(this.f28613a).f25818i1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(org.telegram.messenger.ui.b0(this.f28613a).l1);
        }
        g1(false, true);
        N();
    }

    @Override
    public final void K() {
        super.K();
        f49220m2 = null;
        org.telegram.messenger.g0.r(this.f49231l2);
    }

    @Override
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        xg.i iVar = new xg.i(getContext(), this.I0, true);
        this.f49223c2 = iVar;
        iVar.f58653s = true;
        return iVar;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        Boolean bool = this.f49229j2;
        if (bool != null && bool.booleanValue()) {
            if (this.f49227h2 > 1) {
                i7 = 2131752136;
            } else {
                i7 = 2131752137;
            }
            return org.telegram.messenger.hd.M0(i7, null);
        }
        return org.telegram.messenger.hd.M0(2131752109, null);
    }

    @Override
    public final void R0(Canvas canvas, int i7) {
        mg0 mg0Var = this.S1;
        mg0Var.setTranslationY(Math.max(i7, (((mg0Var.getMeasuredHeight() - org.telegram.messenger.g0.f22538m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + org.telegram.messenger.g0.f22538m) + org.telegram.messenger.g0.L(8.0f));
        float translationY = mg0Var.getTranslationY() + mg0Var.getMeasuredHeight();
        ng0 ng0Var = this.Q1;
        ng0Var.setTranslationY(translationY);
        float translationY2 = ng0Var.getTranslationY() + ng0Var.getMeasuredHeight();
        l00 l00Var = this.R1;
        l00Var.setTranslationY(translationY2);
        int measuredHeight = ng0Var.getMeasuredHeight() + mg0Var.getMeasuredHeight();
        this.f36261k1.setTranslationY((l00Var.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void c0(Configuration configuration) {
        f1(false, true);
    }

    public final boolean d1(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f49229j2;
        if (bool != null && org.telegram.messenger.t10.t(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f49230k2;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.Q1.getEditText());
        super.dismiss();
    }

    public final void e1(boolean z9) {
        int i7;
        og0 og0Var = this.P1;
        og0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.V1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f49226g2, 0, 1, 33);
            Boolean bool = this.f49229j2;
            if (bool != null && bool.booleanValue()) {
                if (this.f49227h2 > 1) {
                    i7 = 2131752136;
                } else {
                    i7 = 2131752137;
                }
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(i7, null));
            } else {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131752109, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749660, null));
        }
        og0Var.c(hashSet.size(), true);
        og0Var.i(spannableStringBuilder, z9, false);
        og0Var.setEnabled(true);
    }

    public final void f1(boolean z9, boolean z10) {
        float f10;
        int i7;
        long j3;
        int i10;
        float f11;
        xg.i iVar;
        ArrayList arrayList = this.T1;
        arrayList.clear();
        ArrayList arrayList2 = this.U1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f49222b2);
        float f12 = 56.0f;
        HashSet hashSet = this.V1;
        if (!isEmpty) {
            ArrayList arrayList3 = this.X1;
            int size = arrayList3.size();
            i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                TLRPC.User user = (TLRPC.User) obj;
                i10 += org.telegram.messenger.g0.L(56.0f);
                arrayList2.add(xg.h.c(user, hashSet.contains(Long.valueOf(user.f27102id))));
            }
        } else {
            ArrayList arrayList4 = this.W1;
            if (!arrayList4.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList4.size();
                i7 = 0;
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList4.get(i12);
                    i12++;
                    int i13 = size2;
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(this.f28613a).a2(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!a22.self && !a22.bot && !org.telegram.messenger.t10.A(a22.f27102id) && !org.telegram.messenger.t10.x(a22) && d1(a22)) {
                        i7 += org.telegram.messenger.g0.L(56.0f);
                        arrayList5.add(xg.h.c(a22, hashSet.contains(Long.valueOf(a22.f27102id))));
                    }
                    size2 = i13;
                }
                f10 = 32.0f;
                if (!arrayList5.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(32.0f);
                    arrayList2.add(xg.h.b(org.telegram.messenger.hd.M0(2131749671, null)));
                    arrayList2.addAll(arrayList5);
                }
            } else {
                f10 = 32.0f;
                i7 = 0;
            }
            long e10 = org.telegram.messenger.p10.i(this.f28613a).e();
            Boolean bool = this.f49229j2;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = org.telegram.messenger.qp.s1(this.f28613a).f24937y;
                int size3 = arrayList7.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = arrayList7.get(i14);
                    i14++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj3;
                    long j10 = e10;
                    if (dialog.f26957id >= 0) {
                        TLRPC.User a23 = org.telegram.messenger.qp.s1(this.f28613a).a2(Long.valueOf(dialog.f26957id));
                        if (d1(a23)) {
                            i7 += org.telegram.messenger.g0.L(56.0f);
                            arrayList6.add(xg.h.c(a23, hashSet.contains(Long.valueOf(a23.f27102id))));
                        }
                    }
                    e10 = j10;
                }
                j3 = e10;
                if (!arrayList6.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(f10);
                    arrayList2.add(xg.h.b(org.telegram.messenger.hd.M0(2131745823, null)));
                    arrayList2.addAll(arrayList6);
                }
            } else {
                j3 = e10;
            }
            ArrayList arrayList8 = this.Z1;
            int size4 = arrayList8.size();
            i10 = i7;
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList8.get(i15);
                i15++;
                String str = (String) obj4;
                ArrayList arrayList9 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.Y1.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f13 = f12;
                        if (tL_contact.user_id == j3) {
                            f11 = f10;
                        } else {
                            f11 = f10;
                            TLRPC.User a24 = org.telegram.messenger.qp.s1(this.f28613a).a2(Long.valueOf(tL_contact.user_id));
                            if (d1(a24)) {
                                i10 += org.telegram.messenger.g0.L(f13);
                                arrayList9.add(xg.h.c(a24, hashSet.contains(Long.valueOf(a24.f27102id))));
                            }
                        }
                        f10 = f11;
                        f12 = f13;
                    }
                    float f14 = f12;
                    float f15 = f10;
                    if (!arrayList9.isEmpty()) {
                        int L = org.telegram.messenger.g0.L(f15) + i10;
                        String upperCase = str.toUpperCase();
                        xg.h hVar = new xg.h(7, false);
                        hVar.f58638g = upperCase;
                        arrayList2.add(hVar);
                        arrayList2.addAll(arrayList9);
                        i10 = L;
                    }
                    f10 = f15;
                    f12 = f14;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xg.h(5, false));
            i10 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.f22544q.y * 0.6f)) - i10);
        xg.h hVar2 = new xg.h(-1, false);
        hVar2.f58642l = max;
        arrayList2.add(hVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                xg.i iVar2 = this.f49223c2;
                lg0 lg0Var = new lg0(this, 1);
                org.telegram.ui.Cells.x3 x3Var = iVar2.f58654w;
                if (x3Var != null) {
                    x3Var.a(org.telegram.messenger.hd.M0(2131743631, null), lg0Var);
                }
            } else {
                org.telegram.ui.Cells.x3 x3Var2 = this.f49223c2.f58654w;
                if (x3Var2 != null) {
                    x3Var2.setRightText(null);
                }
            }
        }
        if (z10 && (iVar = this.f49223c2) != null) {
            if (z9) {
                iVar.E(arrayList, arrayList2);
            } else {
                iVar.f();
            }
        }
    }

    public final void g1(boolean z9, boolean z10) {
        int R;
        f1(z9, z10);
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.pj0 pj0Var = this.f36261k1;
            if (i10 >= pj0Var.getChildCount()) {
                break;
            }
            View childAt = pj0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) > 0) {
                if (i7 == -1) {
                    i7 = R;
                }
                int i12 = R - 1;
                if (i12 >= 0) {
                    ArrayList arrayList = this.U1;
                    if (i12 < arrayList.size()) {
                        xg.h hVar = (xg.h) arrayList.get(i12);
                        ah.r rVar = (ah.r) childAt;
                        rVar.c(hVar.f58641k, z9);
                        TLRPC.Chat chat = hVar.f58636e;
                        float f10 = 1.0f;
                        if (chat != null) {
                            if (this.f49223c2.F(chat) > 200) {
                                f10 = 0.3f;
                            }
                            rVar.i(z9, f10);
                        } else {
                            rVar.i(z9, 1.0f);
                        }
                    }
                }
                i11 = R;
            }
            i10++;
        }
        if (z9) {
            this.f49223c2.k(0, i7);
            xg.i iVar = this.f49223c2;
            iVar.k(i11, iVar.b() - i11);
        }
        e1(z9);
    }
}
