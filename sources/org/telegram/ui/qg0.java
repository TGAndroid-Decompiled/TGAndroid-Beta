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
public final class qg0 extends org.telegram.ui.Components.ja {
    public static qg0 f50606q2;
    public final og0 T1;
    public final ng0 U1;
    public final rv V1;
    public final mg0 W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final HashSet Z1;
    public final ArrayList f50607a2;
    public final ArrayList f50608b2;
    public final HashMap f50609c2;
    public final ArrayList d2;
    public final LinkedHashMap f50610e2;
    public String f50611f2;
    public xg.i f50612g2;
    public int f50613h2;
    public int f50614i2;
    public float f50615j2;
    public org.telegram.ui.Components.hp f50616k2;
    public final int f50617l2;
    public final pg0 f50618m2;
    public final Boolean f50619n2;
    public final Boolean f50620o2;
    public final m4 f50621p2;

    public qg0(org.telegram.ui.ActionBar.e2 e2Var, int i7, Boolean bool, Boolean bool2, pg0 pg0Var) {
        super(e2Var, true, false, e2Var.getResourceProvider());
        this.X1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Y1 = arrayList;
        HashSet hashSet = new HashSet();
        this.Z1 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f50607a2 = arrayList3;
        this.f50608b2 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.f50609c2 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.d2 = arrayList4;
        this.f50610e2 = new LinkedHashMap();
        this.f50613h2 = org.telegram.messenger.g0.L(120.0f);
        this.f50614i2 = -1;
        this.f50621p2 = new m4(this, 13);
        this.f50617l2 = i7;
        this.f50619n2 = bool;
        this.f50620o2 = bool2;
        this.f50618m2 = pg0Var;
        this.f35937p1.setTitle(O0());
        mg0 mg0Var = new mg0(0, getContext(), this.J0);
        this.W1 = mg0Var;
        mg0Var.setOnCloseClickListener(new kg0(this, 0));
        mg0Var.setText(O0());
        mg0Var.setCloseImageVisible(false);
        mg0Var.f1069f.c(false, 0.0f);
        this.f50616k2 = new org.telegram.ui.Components.hp(this, 2);
        ng0 ng0Var = new ng0(this, getContext(), this.J0, 0);
        this.U1 = ng0Var;
        int i10 = org.telegram.ui.ActionBar.j6.f28922h5;
        org.telegram.ui.ActionBar.q6.h(i10, ng0Var, this.J0);
        ng0Var.setOnSearchTextChange(new r3(this, 14));
        ng0Var.f1095b.r(org.telegram.messenger.hd.M0(2131745836, null), false);
        rv rvVar = new rv(3, getContext(), this);
        this.V1 = rvVar;
        ViewGroup viewGroup = this.f29682b;
        int i11 = this.f29717u0;
        viewGroup.addView(mg0Var, 0, c8.ja.f(-2.0f, -1, 55, i11, 0, i11, 0));
        ViewGroup viewGroup2 = this.f29682b;
        int i12 = this.f29717u0;
        viewGroup2.addView(ng0Var, c8.ja.f(-2.0f, -1, 55, i12, 0, i12, 0));
        ViewGroup viewGroup3 = this.f29682b;
        int i13 = this.f29717u0;
        viewGroup3.addView(rvVar, c8.ja.f(1.0f, -1, 55, i13, 0, i13, 0));
        ah.a aVar = new ah.a(getContext(), this.J0, (org.telegram.ui.Components.uj0) null);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.q6.h(i10, aVar, this.J0);
        og0 og0Var = new og0(this, getContext(), this.J0, 0);
        this.T1 = og0Var;
        og0Var.setOnClickListener(new lg0(this, 0));
        aVar.addView(og0Var, c8.ja.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.f29682b;
        int i14 = this.f29717u0;
        viewGroup4.addView(aVar, c8.ja.f(-2.0f, -1, 87, i14, 0, i14, 0));
        xg.i iVar = this.f50612g2;
        org.telegram.ui.Components.uj0 uj0Var = this.f35936o1;
        iVar.f59938n = arrayList;
        iVar.f59937f = uj0Var;
        int i15 = this.f29717u0;
        uj0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(60.0f));
        this.f35936o1.j(new g3(this, 21));
        this.f35936o1.setOnItemClickListener(new ai.r1(this, i7, 17));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.f58564m = false;
        this.f35936o1.setItemAnimator(kVar);
        this.f35936o1.i(new ai.h0(this, 7));
        ng0Var.setText("");
        ng0Var.d.b(false);
        ng0Var.b(false, hashSet, new kg0(this, 1), null);
        mg0Var.setText(O0());
        e1(false);
        arrayList2.addAll(org.telegram.messenger.g5.r(this.f29679a).f23679f0);
        hashMap.putAll(org.telegram.messenger.g5.r(this.f29679a).f23681h0);
        arrayList4.addAll(org.telegram.messenger.g5.r(this.f29679a).f23682i0);
        arrayList3.addAll(org.telegram.messenger.si.b0(this.f29679a).f26482j1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(org.telegram.messenger.si.b0(this.f29679a).f26486m1);
        }
        g1(false, true);
        O();
    }

    @Override
    public final void L() {
        super.L();
        f50606q2 = null;
        org.telegram.messenger.g0.r(this.f50621p2);
    }

    @Override
    public final org.telegram.ui.Components.tj0 L0(org.telegram.ui.Components.uj0 uj0Var) {
        xg.i iVar = new xg.i(getContext(), this.J0, true);
        this.f50612g2 = iVar;
        iVar.f59940s = true;
        return iVar;
    }

    @Override
    public final CharSequence O0() {
        int i7;
        Boolean bool = this.f50619n2;
        if (bool != null && bool.booleanValue()) {
            if (this.f50617l2 > 1) {
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
        mg0 mg0Var = this.W1;
        mg0Var.setTranslationY(Math.max(i7, (((mg0Var.getMeasuredHeight() - org.telegram.messenger.g0.f23603m) - org.telegram.messenger.g0.L(40.0f)) / 2.0f) + org.telegram.messenger.g0.f23603m) + org.telegram.messenger.g0.L(8.0f));
        float translationY = mg0Var.getTranslationY() + mg0Var.getMeasuredHeight();
        ng0 ng0Var = this.U1;
        ng0Var.setTranslationY(translationY);
        float translationY2 = ng0Var.getTranslationY() + ng0Var.getMeasuredHeight();
        rv rvVar = this.V1;
        rvVar.setTranslationY(translationY2);
        int measuredHeight = ng0Var.getMeasuredHeight() + mg0Var.getMeasuredHeight();
        this.f35936o1.setTranslationY((rvVar.getMeasuredHeight() + measuredHeight) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void c0(Configuration configuration) {
        f1(false, true);
    }

    public final boolean d1(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.f50619n2;
        if (bool != null && org.telegram.messenger.q10.t(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.f50620o2;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.U1.getEditText());
        super.dismiss();
    }

    public final void e1(boolean z10) {
        int i7;
        og0 og0Var = this.T1;
        og0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.Z1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.f50616k2, 0, 1, 33);
            Boolean bool = this.f50619n2;
            if (bool != null && bool.booleanValue()) {
                if (this.f50617l2 > 1) {
                    i7 = 2131752136;
                } else {
                    i7 = 2131752137;
                }
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(i7, null));
            } else {
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131752109, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131749661, null));
        }
        og0Var.c(hashSet.size(), true);
        og0Var.i(spannableStringBuilder, z10, false);
        og0Var.setEnabled(true);
    }

    public final void f1(boolean z10, boolean z11) {
        float f10;
        int i7;
        long j3;
        int i10;
        float f11;
        xg.i iVar;
        ArrayList arrayList = this.X1;
        arrayList.clear();
        ArrayList arrayList2 = this.Y1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.f50611f2);
        float f12 = 56.0f;
        HashSet hashSet = this.Z1;
        if (!isEmpty) {
            ArrayList arrayList3 = this.f50608b2;
            int size = arrayList3.size();
            i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                TLRPC.User user = (TLRPC.User) obj;
                i10 += org.telegram.messenger.g0.L(56.0f);
                arrayList2.add(xg.h.c(user, hashSet.contains(Long.valueOf(user.f28200id))));
            }
        } else {
            ArrayList arrayList4 = this.f50607a2;
            if (!arrayList4.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList4.size();
                i7 = 0;
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList4.get(i12);
                    i12++;
                    int i13 = size2;
                    TLRPC.User a22 = org.telegram.messenger.np.s1(this.f29679a).a2(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!a22.self && !a22.bot && !org.telegram.messenger.q10.A(a22.f28200id) && !org.telegram.messenger.q10.x(a22) && d1(a22)) {
                        i7 += org.telegram.messenger.g0.L(56.0f);
                        arrayList5.add(xg.h.c(a22, hashSet.contains(Long.valueOf(a22.f28200id))));
                    }
                    size2 = i13;
                }
                f10 = 32.0f;
                if (!arrayList5.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(32.0f);
                    arrayList2.add(xg.h.b(org.telegram.messenger.hd.M0(2131749672, null)));
                    arrayList2.addAll(arrayList5);
                }
            } else {
                f10 = 32.0f;
                i7 = 0;
            }
            long e10 = org.telegram.messenger.m10.i(this.f29679a).e();
            Boolean bool = this.f50619n2;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = org.telegram.messenger.np.s1(this.f29679a).f25440y;
                int size3 = arrayList7.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = arrayList7.get(i14);
                    i14++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj3;
                    long j10 = e10;
                    if (dialog.f28055id >= 0) {
                        TLRPC.User a23 = org.telegram.messenger.np.s1(this.f29679a).a2(Long.valueOf(dialog.f28055id));
                        if (d1(a23)) {
                            i7 += org.telegram.messenger.g0.L(56.0f);
                            arrayList6.add(xg.h.c(a23, hashSet.contains(Long.valueOf(a23.f28200id))));
                        }
                    }
                    e10 = j10;
                }
                j3 = e10;
                if (!arrayList6.isEmpty()) {
                    i7 += org.telegram.messenger.g0.L(f10);
                    arrayList2.add(xg.h.b(org.telegram.messenger.hd.M0(2131745822, null)));
                    arrayList2.addAll(arrayList6);
                }
            } else {
                j3 = e10;
            }
            ArrayList arrayList8 = this.d2;
            int size4 = arrayList8.size();
            i10 = i7;
            int i15 = 0;
            while (i15 < size4) {
                Object obj4 = arrayList8.get(i15);
                i15++;
                String str = (String) obj4;
                ArrayList arrayList9 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.f50609c2.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f13 = f12;
                        if (tL_contact.user_id == j3) {
                            f11 = f10;
                        } else {
                            f11 = f10;
                            TLRPC.User a24 = org.telegram.messenger.np.s1(this.f29679a).a2(Long.valueOf(tL_contact.user_id));
                            if (d1(a24)) {
                                i10 += org.telegram.messenger.g0.L(f13);
                                arrayList9.add(xg.h.c(a24, hashSet.contains(Long.valueOf(a24.f28200id))));
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
                        hVar.f59925g = upperCase;
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
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.f23609q.y * 0.6f)) - i10);
        xg.h hVar2 = new xg.h(-1, false);
        hVar2.f59929l = max;
        arrayList2.add(hVar2);
        if (hashSet != null) {
            if (hashSet.size() > 0) {
                xg.i iVar2 = this.f50612g2;
                lg0 lg0Var = new lg0(this, 1);
                org.telegram.ui.Cells.x3 x3Var = iVar2.f59941w;
                if (x3Var != null) {
                    x3Var.a(org.telegram.messenger.hd.M0(2131743630, null), lg0Var);
                }
            } else {
                org.telegram.ui.Cells.x3 x3Var2 = this.f50612g2.f59941w;
                if (x3Var2 != null) {
                    x3Var2.setRightText(null);
                }
            }
        }
        if (z11 && (iVar = this.f50612g2) != null) {
            if (z10) {
                iVar.E(arrayList, arrayList2);
            } else {
                iVar.f();
            }
        }
    }

    public final void g1(boolean z10, boolean z11) {
        int R;
        f1(z10, z11);
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.uj0 uj0Var = this.f35936o1;
            if (i10 >= uj0Var.getChildCount()) {
                break;
            }
            View childAt = uj0Var.getChildAt(i10);
            if ((childAt instanceof ah.r) && (R = RecyclerView.R(childAt)) > 0) {
                if (i7 == -1) {
                    i7 = R;
                }
                int i12 = R - 1;
                if (i12 >= 0) {
                    ArrayList arrayList = this.Y1;
                    if (i12 < arrayList.size()) {
                        xg.h hVar = (xg.h) arrayList.get(i12);
                        ah.r rVar = (ah.r) childAt;
                        rVar.c(hVar.f59928k, z10);
                        TLRPC.Chat chat = hVar.f59923e;
                        float f10 = 1.0f;
                        if (chat != null) {
                            if (this.f50612g2.F(chat) > 200) {
                                f10 = 0.3f;
                            }
                            rVar.i(z10, f10);
                        } else {
                            rVar.i(z10, 1.0f);
                        }
                    }
                }
                i11 = R;
            }
            i10++;
        }
        if (z10) {
            this.f50612g2.k(0, i7);
            xg.i iVar = this.f50612g2;
            iVar.k(i11, iVar.b() - i11);
        }
        e1(z10);
    }
}
