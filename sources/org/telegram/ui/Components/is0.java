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
public final class is0 extends sj0 {
    public int F;
    public final ws0 H;
    public final Context f34816c;
    public final int d;
    public boolean f34820r;
    public String f34823x;
    public dh.n0 f34824y;
    public final ArrayList f34817e = new ArrayList();
    public final ArrayList f34818f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f34819n = new ArrayList();
    public boolean f34821s = false;
    public int f34822w = 0;
    public int E = -1;
    public final sp0 G = new sp0(this, 5);

    public is0(ws0 ws0Var, Context context) {
        this.H = ws0Var;
        this.f34816c = context;
        this.d = ws0Var.f40142y1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final void E(dh.n0 n0Var, String str) {
        long j10;
        String str2;
        if (TextUtils.equals(str, this.f34823x)) {
            dh.n0 n0Var2 = this.f34824y;
            if (n0Var2 != null || n0Var != null) {
                if (n0Var2 != null && n0Var2.equals(n0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f34823x = str;
        this.f34824y = n0Var;
        int i3 = this.E;
        int i10 = this.d;
        if (i3 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.E, true);
            this.E = -1;
        }
        this.f34819n.clear();
        this.h.clear();
        this.f34818f.clear();
        int i11 = 0;
        this.f34822w = 0;
        this.f34821s = false;
        this.f34820r = true;
        ArrayList arrayList = this.f34817e;
        arrayList.clear();
        if (this.f34824y == null) {
            org.telegram.messenger.nv G1 = org.telegram.messenger.hp.s1(i10).G1();
            ArrayList arrayList2 = G1.f24441j;
            int i12 = G1.f24434a;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String O3 = org.telegram.messenger.g0.O3(str.toLowerCase());
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    org.telegram.messenger.mv mvVar = (org.telegram.messenger.mv) arrayList2.get(i13);
                    long j11 = mvVar.f24264a;
                    String str3 = null;
                    if (j11 == 2666000) {
                        str2 = org.telegram.messenger.bd.M0(2131754252, null);
                    } else if (j11 == org.telegram.messenger.h10.i(i12).e()) {
                        str2 = org.telegram.messenger.bd.M0(2131748311, null);
                        str3 = org.telegram.messenger.bd.M0(2131745911, null);
                    } else if (mvVar.f24264a >= 0) {
                        str2 = org.telegram.messenger.l10.p(org.telegram.messenger.hp.s1(i12).a2(Long.valueOf(mvVar.f24264a)));
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i12).M0(Long.valueOf(-mvVar.f24264a));
                        if (M0 != null) {
                            str2 = M0.title;
                        } else {
                            str2 = "";
                        }
                    }
                    if (str2 != null) {
                        String O32 = org.telegram.messenger.g0.O3(str2.toLowerCase());
                        if (!O32.startsWith(O3) && !O32.contains(" ".concat(O3))) {
                            if (str3 != null) {
                                String O33 = org.telegram.messenger.g0.O3(str3.toLowerCase());
                                if (O33.startsWith(O3) || O33.contains(" ".concat(O3))) {
                                    arrayList3.add(mvVar);
                                }
                            }
                        } else {
                            arrayList3.add(mvVar);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            rr0[] rr0VarArr = this.H.f40108n0;
            if (i11 >= rr0VarArr.length) {
                break;
            }
            rr0 rr0Var = rr0VarArr[i11];
            if (rr0Var.F == 11) {
                rr0Var.f37790w.e(true, true);
            }
            i11++;
        }
        if (this.f34824y == null) {
            f();
        }
        sp0 sp0Var = this.G;
        org.telegram.messenger.g0.r(sp0Var);
        if (this.f34824y != null) {
            j10 = 60;
        } else {
            j10 = 600;
        }
        org.telegram.messenger.g0.i3(sp0Var, j10);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f34823x) && this.f34824y == null) {
            this.f34820r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i3 = this.d;
        tL_messages_search.peer = org.telegram.messenger.hp.s1(i3).j1(org.telegram.messenger.h10.i(i3).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f27112q = this.f34823x;
        dh.n0 n0Var = this.f34824y;
        if (n0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(n0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((org.telegram.messenger.zi) k2.p1.h(1, arrayList)).f1();
        }
        tL_messages_search.limit = 10;
        this.f34821s = false;
        int i10 = this.F + 1;
        this.F = i10;
        org.telegram.ui.f4 f4Var = new org.telegram.ui.f4(this, i10, tL_messages_search, 19);
        if (this.f34824y != null) {
            org.telegram.messenger.qr a02 = org.telegram.messenger.qr.a0(i3);
            a02.f24934a.c(new org.telegram.messenger.gr(a02, this.f34823x, 0L, this.f34824y.g(), 100, this.f34819n.size(), false, new ei.f2(1, this, f4Var)));
            return;
        }
        f4Var.run();
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence a02;
        CharSequence charSequence;
        rr0[] rr0VarArr = this.H.f40108n0;
        ArrayList arrayList2 = this.f34818f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i3 >= arrayList3.size()) {
                break;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList3.get(i3);
            if (ziVar != null && !hashSet.contains(Integer.valueOf(ziVar.f1()))) {
                hashSet.add(Integer.valueOf(ziVar.f1()));
                arrayList2.add(ziVar);
            }
            i3++;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.f34819n;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(i10);
            if (ziVar2 != null && !hashSet.contains(Integer.valueOf(ziVar2.f1()))) {
                hashSet.add(Integer.valueOf(ziVar2.f1()));
                arrayList2.add(ziVar2);
            }
            i10++;
        }
        if (!z10 || !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < rr0VarArr.length; i11++) {
                if (rr0VarArr[i11].F == 11 && arrayList2.isEmpty() && this.f34817e.isEmpty()) {
                    yh.l lVar = rr0VarArr[i11].f37790w.d;
                    if (this.f34824y != null && TextUtils.isEmpty(this.f34823x)) {
                        String M0 = org.telegram.messenger.bd.M0(2131748172, null);
                        dh.n0 n0Var = this.f34824y;
                        Paint.FontMetricsInt fontMetricsInt = rr0VarArr[i11].f37790w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(n0Var.f9097f)) {
                            charSequence = n0Var.f9097f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new p5(n0Var.f9098g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        a02 = org.telegram.messenger.g0.K2(M0, charSequence, "%s");
                    } else {
                        a02 = org.telegram.messenger.bd.a0(null, null, 2131748174, this.f34823x);
                    }
                    lVar.setText(a02);
                    rr0VarArr[i11].f37790w.f41129f.setVisibility(8);
                    rr0VarArr[i11].f37790w.e(false, true);
                }
            }
        }
        f();
    }

    @Override
    public final int b() {
        return this.f34818f.size() + this.f34817e.size();
    }

    @Override
    public final long c(int i3) {
        int hash;
        if (i3 < 0) {
            return i3;
        }
        ArrayList arrayList = this.f34817e;
        if (i3 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((org.telegram.messenger.mv) arrayList.get(i3)).f24264a));
        } else {
            int size = i3 - arrayList.size();
            ArrayList arrayList2 = this.f34818f;
            if (size < arrayList2.size()) {
                hash = Objects.hash(2, Long.valueOf(((org.telegram.messenger.zi) arrayList2.get(size)).Q1()), Integer.valueOf(((org.telegram.messenger.zi) arrayList2.get(size)).f1()));
            } else {
                return size;
            }
        }
        return hash;
    }

    @Override
    public final int d(int i3) {
        return 23;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        if (i3 >= 0) {
            View view = d1Var.f55540a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (i3 + 1 < b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t2Var.f30561t2 = z10;
                ArrayList arrayList = this.f34817e;
                if (i3 < arrayList.size()) {
                    org.telegram.messenger.mv mvVar = (org.telegram.messenger.mv) arrayList.get(i3);
                    t2Var.d0(mvVar.f24264a, mvVar.d, mvVar.c(), false, false);
                    return;
                }
                int size = i3 - arrayList.size();
                ArrayList arrayList2 = this.f34818f;
                if (size < arrayList2.size()) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(size);
                    t2Var.d0(ziVar.Q1(), ziVar, ziVar.f26868k.date, false, false);
                }
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        kg.x xVar = new kg.x(1, this.f34816c, true);
        ws0 ws0Var = this.H;
        xVar.setDialogCellDelegate(ws0Var);
        xVar.f30554s0 = true;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, xVar, ws0Var.I1);
        return new u4.d1(xVar);
    }
}
