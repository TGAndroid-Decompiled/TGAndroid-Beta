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
public final class kg0 extends org.telegram.ui.Components.ma {
    public static kg0 f46923n2;
    public final ig0 Q1;
    public final hg0 R1;
    public final org.telegram.ui.Components.voip.r0 S1;
    public final gg0 T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final HashSet W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final HashMap Z1;
    public final ArrayList f46924a2;
    public final LinkedHashMap f46925b2;
    public String c2;
    public yg.h f46926d2;
    public int f46927e2;
    public int f46928f2;
    public float f46929g2;
    public org.telegram.ui.Components.yo f46930h2;
    public final int f46931i2;
    public final jg0 f46932j2;
    public final Boolean f46933k2;
    public final Boolean f46934l2;
    public final o4 f46935m2;

    public kg0(org.telegram.ui.ActionBar.d2 d2Var, int i3, Boolean bool, Boolean bool2, jg0 jg0Var) {
        super(d2Var, true, false, d2Var.getResourceProvider());
        this.U1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.V1 = arrayList;
        HashSet hashSet = new HashSet();
        this.W1 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.X1 = arrayList3;
        this.Y1 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.Z1 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.f46924a2 = arrayList4;
        this.f46925b2 = new LinkedHashMap();
        this.f46927e2 = org.telegram.messenger.g0.L(120.0f);
        this.f46928f2 = -1;
        this.f46935m2 = new o4(this, 13);
        this.f46931i2 = i3;
        this.f46933k2 = bool;
        this.f46934l2 = bool2;
        this.f46932j2 = jg0Var;
        this.m1.setTitle(O0());
        gg0 gg0Var = new gg0(0, getContext(), this.J0);
        this.T1 = gg0Var;
        gg0Var.setOnCloseClickListener(new eg0(this, 0));
        gg0Var.setText(O0());
        gg0Var.setCloseImageVisible(false);
        gg0Var.f3311f.c(false, 0.0f);
        this.f46930h2 = new org.telegram.ui.Components.yo(this, 2);
        hg0 hg0Var = new hg0(this, getContext(), this.J0, 0);
        this.R1 = hg0Var;
        int i10 = org.telegram.ui.ActionBar.k6.f27954h5;
        org.telegram.ui.ActionBar.r6.i(i10, hg0Var, this.J0);
        hg0Var.setOnSearchTextChange(new s3(this, 13));
        hg0Var.f3334b.r(org.telegram.messenger.bd.M0(2131745846, null), false);
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(4, getContext(), this);
        this.S1 = r0Var;
        ViewGroup viewGroup = this.f28586b;
        int i11 = this.f28618u0;
        viewGroup.addView(gg0Var, 0, b8.mf.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup2 = this.f28586b;
        int i12 = this.f28618u0;
        viewGroup2.addView(hg0Var, b8.mf.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup3 = this.f28586b;
        int i13 = this.f28618u0;
        viewGroup3.addView(r0Var, b8.mf.f(1.0f, -1, 55, i13, 0, i13, 0));
        bh.a aVar = new bh.a(getContext(), this.J0, (org.telegram.ui.Components.tj0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.r6.i(i10, aVar, this.J0);
        ig0 ig0Var = new ig0(this, getContext(), this.J0, 0);
        this.Q1 = ig0Var;
        ig0Var.setOnClickListener(new fg0(this, 0));
        aVar.addView(ig0Var, b8.mf.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f28586b;
        int i14 = this.f28618u0;
        viewGroup4.addView(aVar, b8.mf.f(-2.0f, -1, 87, i14, 0, i14, 0));
        yg.h hVar = this.f46926d2;
        org.telegram.ui.Components.tj0 tj0Var = this.f36102l1;
        hVar.f59464n = arrayList;
        hVar.f59463f = tj0Var;
        int i15 = this.f28618u0;
        tj0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(60.0f));
        this.f36102l1.j(new h3(this, 21));
        this.f36102l1.setOnItemClickListener(new k2.q(this, i3, 15));
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f55567m = false;
        this.f36102l1.setItemAnimator(kVar);
        this.f36102l1.i(new gi.o1(this, 6));
        hg0Var.setText("");
        hg0Var.d.b(false);
        hg0Var.b(false, hashSet, new eg0(this, 1), null);
        gg0Var.setText(O0());
        e1(false);
        arrayList2.addAll(org.telegram.messenger.g5.r(this.f28583a).f22653f0);
        hashMap.putAll(org.telegram.messenger.g5.r(this.f28583a).f22655h0);
        arrayList4.addAll(org.telegram.messenger.g5.r(this.f28583a).f22656i0);
        arrayList3.addAll(org.telegram.messenger.li.b0(this.f28583a).f24032j1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(org.telegram.messenger.li.b0(this.f28583a).m1);
        }
        g1(false, true);
        N();
    }

    @Override
    public final void K() {
        super.K();
        f46923n2 = null;
        org.telegram.messenger.g0.r(this.f46935m2);
    }

    @Override
    public final org.telegram.ui.Components.sj0 L0(org.telegram.ui.Components.tj0 tj0Var) {
        yg.h hVar = new yg.h(getContext(), this.J0, true);
        this.f46926d2 = hVar;
        hVar.f59466s = true;
        return hVar;
    }

    @Override
    public final CharSequence O0() {
        int i3;
        Boolean bool = this.f46933k2;
        if (bool != null && bool.booleanValue()) {
            if (this.f46931i2 > 1) {
                i3 = 2131752136;
            } else {
                i3 = 2131752137;
            }
            return org.telegram.messenger.bd.M0(i3, null);
        }
        return org.telegram.messenger.bd.M0(2131752109, null);
    }

    @Override
    public final void R0(Canvas canvas, int i3) {
        gg0 gg0Var = this.T1;
        gg0Var.setTranslationY(Math.max(i3, (((gg0Var.getMeasuredHeight() - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + org.telegram.messenger.g0.f22602m) + org.telegram.messenger.g0.L(8.0f));
        float translationY = gg0Var.getTranslationY() + gg0Var.getMeasuredHeight();
        hg0 hg0Var = this.R1;
        hg0Var.setTranslationY(translationY);
        float translationY2 = hg0Var.getTranslationY() + hg0Var.getMeasuredHeight();
        org.telegram.ui.Components.voip.r0 r0Var = this.S1;
        r0Var.setTranslationY(translationY2);
        int measuredHeight = hg0Var.getMeasuredHeight() + gg0Var.getMeasuredHeight();
        this.f36102l1.setTranslationY((r0Var.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void c0(Configuration configuration) {
        f1(false, true);
    }

    public final boolean d1(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f46933k2;
        if (bool != null && org.telegram.messenger.l10.t(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f46934l2;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.R1.getEditText());
        super.dismiss();
    }

    public final void e1(boolean z10) {
        int i3;
        ig0 ig0Var = this.Q1;
        ig0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.W1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f46930h2, 0, 1, 33);
            Boolean bool = this.f46933k2;
            if (bool != null && bool.booleanValue()) {
                if (this.f46931i2 > 1) {
                    i3 = 2131752136;
                } else {
                    i3 = 2131752137;
                }
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(i3, null));
            } else {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131752109, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131749669, null));
        }
        ig0Var.c(hashSet.size(), true);
        ig0Var.i(spannableStringBuilder, z10, false);
        ig0Var.setEnabled(true);
    }

    public final void f1(boolean z10, boolean z11) {
        float f10;
        int i3;
        long j10;
        int i10;
        float f11;
        yg.h hVar;
        ArrayList arrayList = this.U1;
        arrayList.clear();
        ArrayList arrayList2 = this.V1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.c2);
        float f12 = 56.0f;
        HashSet hashSet = this.W1;
        if (!isEmpty) {
            ArrayList arrayList3 = this.Y1;
            int size = arrayList3.size();
            i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                TLRPC.User user = (TLRPC.User) obj;
                i10 += org.telegram.messenger.g0.L(56.0f);
                arrayList2.add(yg.g.c(user, hashSet.contains(Long.valueOf(user.f27150id))));
            }
        } else {
            ArrayList arrayList4 = this.X1;
            if (!arrayList4.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList4.size();
                i3 = 0;
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList4.get(i12);
                    i12++;
                    int i13 = size2;
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!a22.self && !a22.bot && !org.telegram.messenger.l10.A(a22.f27150id) && !org.telegram.messenger.l10.x(a22) && d1(a22)) {
                        i3 += org.telegram.messenger.g0.L(56.0f);
                        arrayList5.add(yg.g.c(a22, hashSet.contains(Long.valueOf(a22.f27150id))));
                    }
                    size2 = i13;
                }
                f10 = 32.0f;
                if (!arrayList5.isEmpty()) {
                    i3 += org.telegram.messenger.g0.L(32.0f);
                    arrayList2.add(yg.g.b(org.telegram.messenger.bd.M0(2131749680, null)));
                    arrayList2.addAll(arrayList5);
                }
            } else {
                f10 = 32.0f;
                i3 = 0;
            }
            long e10 = org.telegram.messenger.h10.i(this.f28583a).e();
            Boolean bool = this.f46933k2;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = org.telegram.messenger.hp.s1(this.f28583a).f23169y;
                int size3 = arrayList7.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = arrayList7.get(i14);
                    i14++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj3;
                    long j11 = e10;
                    if (dialog.f27005id >= 0) {
                        TLRPC.User a23 = org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(dialog.f27005id));
                        if (d1(a23)) {
                            i3 += org.telegram.messenger.g0.L(56.0f);
                            arrayList6.add(yg.g.c(a23, hashSet.contains(Long.valueOf(a23.f27150id))));
                        }
                    }
                    e10 = j11;
                }
                j10 = e10;
                if (!arrayList6.isEmpty()) {
                    i3 += org.telegram.messenger.g0.L(f10);
                    arrayList2.add(yg.g.b(org.telegram.messenger.bd.M0(2131745832, null)));
                    arrayList2.addAll(arrayList6);
                }
            } else {
                j10 = e10;
            }
            ArrayList arrayList8 = this.f46924a2;
            int size4 = arrayList8.size();
            i10 = i3;
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList8.get(i15);
                i15++;
                String str = (String) obj4;
                ArrayList arrayList9 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.Z1.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f13 = f12;
                        if (tL_contact.user_id == j10) {
                            f11 = f10;
                        } else {
                            f11 = f10;
                            TLRPC.User a24 = org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(tL_contact.user_id));
                            if (d1(a24)) {
                                i10 += org.telegram.messenger.g0.L(f13);
                                arrayList9.add(yg.g.c(a24, hashSet.contains(Long.valueOf(a24.f27150id))));
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
                        yg.g gVar = new yg.g(7, false);
                        gVar.f59451g = upperCase;
                        arrayList2.add(gVar);
                        arrayList2.addAll(arrayList9);
                        i10 = L;
                    }
                    f10 = f15;
                    f12 = f14;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new yg.g(5, false));
            i10 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.f22608q.y * 0.6f)) - i10);
        yg.g gVar2 = new yg.g(-1, false);
        gVar2.f59455l = max;
        arrayList2.add(gVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                yg.h hVar2 = this.f46926d2;
                fg0 fg0Var = new fg0(this, 1);
                org.telegram.ui.Cells.x3 x3Var = hVar2.f59467w;
                if (x3Var != null) {
                    x3Var.a(org.telegram.messenger.bd.M0(2131743640, null), fg0Var);
                }
            } else {
                org.telegram.ui.Cells.x3 x3Var2 = this.f46926d2.f59467w;
                if (x3Var2 != null) {
                    x3Var2.setRightText(null);
                }
            }
        }
        if (z11 && (hVar = this.f46926d2) != null) {
            if (z10) {
                hVar.E(arrayList, arrayList2);
            } else {
                hVar.f();
            }
        }
    }

    public final void g1(boolean z10, boolean z11) {
        int R;
        f1(z10, z11);
        int i3 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.tj0 tj0Var = this.f36102l1;
            if (i10 >= tj0Var.getChildCount()) {
                break;
            }
            View childAt = tj0Var.getChildAt(i10);
            if ((childAt instanceof bh.p) && (R = RecyclerView.R(childAt)) > 0) {
                if (i3 == -1) {
                    i3 = R;
                }
                int i12 = R - 1;
                if (i12 >= 0) {
                    ArrayList arrayList = this.V1;
                    if (i12 < arrayList.size()) {
                        yg.g gVar = (yg.g) arrayList.get(i12);
                        bh.p pVar = (bh.p) childAt;
                        pVar.c(gVar.f59454k, z10);
                        TLRPC.Chat chat = gVar.f59449e;
                        float f10 = 1.0f;
                        if (chat != null) {
                            if (this.f46926d2.F(chat) > 200) {
                                f10 = 0.3f;
                            }
                            pVar.i(z10, f10);
                        } else {
                            pVar.i(z10, 1.0f);
                        }
                    }
                }
                i11 = R;
            }
            i10++;
        }
        if (z10) {
            this.f46926d2.k(0, i3);
            yg.h hVar = this.f46926d2;
            hVar.k(i11, hVar.b() - i11);
        }
        e1(z10);
    }
}
