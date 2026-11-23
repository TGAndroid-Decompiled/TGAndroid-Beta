package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class vs0 extends dk0 {
    public int F;
    public final jt0 H;
    public final Context f41549c;
    public final int d;
    public boolean f41553r;
    public String f41556x;
    public ch.p0 f41557y;
    public final ArrayList f41550e = new ArrayList();
    public final ArrayList f41551f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f41552n = new ArrayList();
    public boolean f41554s = false;
    public int f41555w = 0;
    public int E = -1;
    public final cp0 G = new cp0(this, 6);

    public vs0(jt0 jt0Var, Context context) {
        this.H = jt0Var;
        this.f41549c = context;
        this.d = jt0Var.f36683y1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(ch.p0 p0Var, String str) {
        long j3;
        String str2;
        if (TextUtils.equals(str, this.f41556x)) {
            ch.p0 p0Var2 = this.f41557y;
            if (p0Var2 != null || p0Var != null) {
                if (p0Var2 != null && p0Var2.equals(p0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f41556x = str;
        this.f41557y = p0Var;
        int i7 = this.E;
        int i10 = this.d;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.E, true);
            this.E = -1;
        }
        this.f41552n.clear();
        this.h.clear();
        this.f41551f.clear();
        int i11 = 0;
        this.f41555w = 0;
        this.f41554s = false;
        this.f41553r = true;
        ArrayList arrayList = this.f41550e;
        arrayList.clear();
        if (this.f41557y == null) {
            org.telegram.messenger.qv I1 = org.telegram.messenger.np.u1(i10).I1();
            ArrayList arrayList2 = I1.f26509j;
            int i12 = I1.f26502a;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String M3 = org.telegram.messenger.g0.M3(str.toLowerCase());
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    org.telegram.messenger.pv pvVar = (org.telegram.messenger.pv) arrayList2.get(i13);
                    long j10 = pvVar.f26350a;
                    String str3 = null;
                    if (j10 == 2666000) {
                        str2 = org.telegram.messenger.hd.N0(2131754249, null);
                    } else if (j10 == org.telegram.messenger.k10.i(i12).e()) {
                        str2 = org.telegram.messenger.hd.N0(2131748110, null);
                        str3 = org.telegram.messenger.hd.N0(2131745705, null);
                    } else if (pvVar.f26350a >= 0) {
                        str2 = org.telegram.messenger.p10.q(org.telegram.messenger.np.u1(i12).c2(Long.valueOf(pvVar.f26350a)));
                    } else {
                        TLRPC.Chat O0 = org.telegram.messenger.np.u1(i12).O0(Long.valueOf(-pvVar.f26350a));
                        if (O0 != null) {
                            str2 = O0.title;
                        } else {
                            str2 = "";
                        }
                    }
                    if (str2 != null) {
                        String M32 = org.telegram.messenger.g0.M3(str2.toLowerCase());
                        if (!M32.startsWith(M3) && !M32.contains(" ".concat(M3))) {
                            if (str3 != null) {
                                String M33 = org.telegram.messenger.g0.M3(str3.toLowerCase());
                                if (M33.startsWith(M3) || M33.contains(" ".concat(M3))) {
                                    arrayList3.add(pvVar);
                                }
                            }
                        } else {
                            arrayList3.add(pvVar);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            ds0[] ds0VarArr = this.H.f36650n0;
            if (i11 >= ds0VarArr.length) {
                break;
            }
            ds0 ds0Var = ds0VarArr[i11];
            if (ds0Var.F == 11) {
                ds0Var.f34564w.e(true, true);
            }
            i11++;
        }
        if (this.f41557y == null) {
            f();
        }
        cp0 cp0Var = this.G;
        org.telegram.messenger.g0.r(cp0Var);
        if (this.f41557y != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        org.telegram.messenger.g0.h3(cp0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f41556x) && this.f41557y == null) {
            this.f41553r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i7 = this.d;
        tL_messages_search.peer = org.telegram.messenger.np.u1(i7).l1(org.telegram.messenger.k10.i(i7).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f28545q = this.f41556x;
        ch.p0 p0Var = this.f41557y;
        if (p0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(p0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((org.telegram.messenger.gj) i5.c.h(1, arrayList)).e1();
        }
        tL_messages_search.limit = 10;
        this.f41554s = false;
        int i10 = this.F + 1;
        this.F = i10;
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(this, i10, tL_messages_search, 21);
        if (this.f41557y != null) {
            org.telegram.messenger.ur a02 = org.telegram.messenger.ur.a0(i7);
            a02.f27250a.c(new org.telegram.messenger.kr(a02, this.f41556x, 0L, this.f41557y.g(), 100, this.f41552n.size(), false, new fi.w1(1, this, f0Var)));
            return;
        }
        f0Var.run();
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence a02;
        CharSequence charSequence;
        ds0[] ds0VarArr = this.H.f36650n0;
        ArrayList arrayList2 = this.f41551f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i7 >= arrayList3.size()) {
                break;
            }
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList3.get(i7);
            if (gjVar != null && !hashSet.contains(Integer.valueOf(gjVar.e1()))) {
                hashSet.add(Integer.valueOf(gjVar.e1()));
                arrayList2.add(gjVar);
            }
            i7++;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.f41552n;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get(i10);
            if (gjVar2 != null && !hashSet.contains(Integer.valueOf(gjVar2.e1()))) {
                hashSet.add(Integer.valueOf(gjVar2.e1()));
                arrayList2.add(gjVar2);
            }
            i10++;
        }
        if (!z10 || !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < ds0VarArr.length; i11++) {
                if (ds0VarArr[i11].F == 11 && arrayList2.isEmpty() && this.f41550e.isEmpty()) {
                    xh.l lVar = ds0VarArr[i11].f34564w.d;
                    if (this.f41557y != null && TextUtils.isEmpty(this.f41556x)) {
                        String N0 = org.telegram.messenger.hd.N0(2131747971, null);
                        ch.p0 p0Var = this.f41557y;
                        Paint.FontMetricsInt fontMetricsInt = ds0VarArr[i11].f34564w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(p0Var.f5507f)) {
                            charSequence = p0Var.f5507f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new y5(p0Var.f5508g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        a02 = org.telegram.messenger.g0.K2(N0, charSequence, "%s");
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131747973, this.f41556x);
                    }
                    lVar.setText(a02);
                    ds0VarArr[i11].f34564w.f37996f.setVisibility(8);
                    ds0VarArr[i11].f34564w.e(false, true);
                }
            }
        }
        f();
    }

    @Override
    public final int b() {
        return this.f41551f.size() + this.f41550e.size();
    }

    @Override
    public final long c(int i7) {
        int hash;
        if (i7 < 0) {
            return i7;
        }
        ArrayList arrayList = this.f41550e;
        if (i7 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((org.telegram.messenger.pv) arrayList.get(i7)).f26350a));
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f41551f;
            if (size < arrayList2.size()) {
                hash = Objects.hash(2, Long.valueOf(((org.telegram.messenger.gj) arrayList2.get(size)).P1()), Integer.valueOf(((org.telegram.messenger.gj) arrayList2.get(size)).e1()));
            } else {
                return size;
            }
        }
        return hash;
    }

    @Override
    public final int d(int i7) {
        return 23;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        if (i7 >= 0) {
            View view = f1Var.f59165a;
            if (view instanceof org.telegram.ui.Cells.u2) {
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                if (i7 + 1 < b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u2Var.f32018t2 = z10;
                ArrayList arrayList = this.f41550e;
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.pv pvVar = (org.telegram.messenger.pv) arrayList.get(i7);
                    u2Var.d0(pvVar.f26350a, pvVar.d, pvVar.c(), false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                ArrayList arrayList2 = this.f41551f;
                if (size < arrayList2.size()) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(size);
                    u2Var.d0(gjVar.P1(), gjVar, gjVar.f24213k.date, false, false);
                }
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var = new jg.a0(1, this.f41549c, true);
        jt0 jt0Var = this.H;
        a0Var.setDialogCellDelegate(jt0Var);
        a0Var.f32011s0 = true;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, a0Var, jt0Var.I1);
        return new v4.f1(a0Var);
    }
}
