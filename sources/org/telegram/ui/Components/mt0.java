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
public final class mt0 extends tk0 {
    public int E;
    public final au0 G;
    public final Context f28556c;
    public final int d;
    public boolean f28559r;
    public String f28562x;
    public sg.o0 f28563y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f28557f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f28558n = new ArrayList();
    public boolean f28560s = false;
    public int f28561w = 0;
    public int D = -1;
    public final vo0 F = new vo0(this, 8);

    public mt0(au0 au0Var, Context context) {
        this.G = au0Var;
        this.f28556c = context;
        this.d = au0Var.f24568x1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(String str, sg.o0 o0Var) {
        long j10;
        String str2;
        if (TextUtils.equals(str, this.f28562x)) {
            sg.o0 o0Var2 = this.f28563y;
            if (o0Var2 != null || o0Var != null) {
                if (o0Var2 != null && o0Var2.equals(o0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f28562x = str;
        this.f28563y = o0Var;
        int i10 = this.D;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.D, true);
            this.D = -1;
        }
        this.f28558n.clear();
        this.h.clear();
        this.f28557f.clear();
        int i12 = 0;
        this.f28561w = 0;
        this.f28560s = false;
        this.f28559r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f28563y == null) {
            org.telegram.messenger.hw F1 = org.telegram.messenger.wp.r1(i11).F1();
            ArrayList arrayList2 = F1.f16121j;
            int i13 = F1.f16115a;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String N3 = org.telegram.messenger.i0.N3(str.toLowerCase());
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    org.telegram.messenger.gw gwVar = (org.telegram.messenger.gw) arrayList2.get(i14);
                    long j11 = gwVar.f15965a;
                    String str3 = null;
                    if (j11 == 2666000) {
                        str2 = org.telegram.messenger.dd.L0(2131754252, null);
                    } else if (j11 == org.telegram.messenger.e20.i(i13).e()) {
                        str2 = org.telegram.messenger.dd.L0(2131748318, null);
                        str3 = org.telegram.messenger.dd.L0(2131745918, null);
                    } else if (gwVar.f15965a >= 0) {
                        str2 = org.telegram.messenger.i20.p(org.telegram.messenger.wp.r1(i13).Z1(Long.valueOf(gwVar.f15965a)));
                    } else {
                        TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i13).L0(Long.valueOf(-gwVar.f15965a));
                        if (L0 != null) {
                            str2 = L0.title;
                        } else {
                            str2 = "";
                        }
                    }
                    if (str2 != null) {
                        String N32 = org.telegram.messenger.i0.N3(str2.toLowerCase());
                        if (!N32.startsWith(N3) && !N32.contains(" ".concat(N3))) {
                            if (str3 != null) {
                                String N33 = org.telegram.messenger.i0.N3(str3.toLowerCase());
                                if (N33.startsWith(N3) || N33.contains(" ".concat(N3))) {
                                    arrayList3.add(gwVar);
                                }
                            }
                        } else {
                            arrayList3.add(gwVar);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            ts0[] ts0VarArr = this.G.m0;
            if (i12 >= ts0VarArr.length) {
                break;
            }
            ts0 ts0Var = ts0VarArr[i12];
            if (ts0Var.E == 11) {
                ts0Var.f30722w.e(true, true);
            }
            i12++;
        }
        if (this.f28563y == null) {
            f();
        }
        vo0 vo0Var = this.F;
        org.telegram.messenger.i0.r(vo0Var);
        if (this.f28563y != null) {
            j10 = 60;
        } else {
            j10 = 600;
        }
        org.telegram.messenger.i0.h3(vo0Var, j10);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f28562x) && this.f28563y == null) {
            this.f28559r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = org.telegram.messenger.wp.r1(i10).i1(org.telegram.messenger.e20.i(i10).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f19905q = this.f28562x;
        sg.o0 o0Var = this.f28563y;
        if (o0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(o0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((org.telegram.messenger.kj) i0.a.g(1, arrayList)).f1();
        }
        tL_messages_search.limit = 10;
        this.f28560s = false;
        int i11 = this.E + 1;
        this.E = i11;
        ki0 ki0Var = new ki0(this, i11, tL_messages_search, 5);
        if (this.f28563y != null) {
            org.telegram.messenger.is a02 = org.telegram.messenger.is.a0(i10);
            a02.f16331a.c(new org.telegram.messenger.yr(a02, this.f28562x, 0L, this.f28563y.g(), 100, this.f28558n.size(), false, new kt0(0, this, ki0Var)));
            return;
        }
        ki0Var.run();
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence a02;
        CharSequence charSequence;
        ts0[] ts0VarArr = this.G.m0;
        ArrayList arrayList2 = this.f28557f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i10 >= arrayList3.size()) {
                break;
            }
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList3.get(i10);
            if (kjVar != null && !hashSet.contains(Integer.valueOf(kjVar.f1()))) {
                hashSet.add(Integer.valueOf(kjVar.f1()));
                arrayList2.add(kjVar);
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            arrayList = this.f28558n;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList.get(i11);
            if (kjVar2 != null && !hashSet.contains(Integer.valueOf(kjVar2.f1()))) {
                hashSet.add(Integer.valueOf(kjVar2.f1()));
                arrayList2.add(kjVar2);
            }
            i11++;
        }
        if (!z10 || !arrayList.isEmpty()) {
            for (int i12 = 0; i12 < ts0VarArr.length; i12++) {
                if (ts0VarArr[i12].E == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    nh.p pVar = ts0VarArr[i12].f30722w.d;
                    if (this.f28563y != null && TextUtils.isEmpty(this.f28562x)) {
                        String L0 = org.telegram.messenger.dd.L0(2131748180, null);
                        sg.o0 o0Var = this.f28563y;
                        Paint.FontMetricsInt fontMetricsInt = ts0VarArr[i12].f30722w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(o0Var.f48445f)) {
                            charSequence = o0Var.f48445f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new o5(o0Var.f48446g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        a02 = org.telegram.messenger.i0.J2(L0, charSequence, "%s");
                    } else {
                        a02 = org.telegram.messenger.dd.a0(null, null, 2131748182, this.f28562x);
                    }
                    pVar.setText(a02);
                    ts0VarArr[i12].f30722w.f25949f.setVisibility(8);
                    ts0VarArr[i12].f30722w.e(false, true);
                }
            }
        }
        f();
    }

    @Override
    public final int b() {
        return this.f28557f.size() + this.e.size();
    }

    @Override
    public final long c(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((org.telegram.messenger.gw) arrayList.get(i10)).f15965a));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f28557f;
            if (size < arrayList2.size()) {
                hash = Objects.hash(2, Long.valueOf(((org.telegram.messenger.kj) arrayList2.get(size)).Q1()), Integer.valueOf(((org.telegram.messenger.kj) arrayList2.get(size)).f1()));
            } else {
                return size;
            }
        }
        return hash;
    }

    @Override
    public final int d(int i10) {
        return 23;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        if (i10 >= 0) {
            View view = c1Var.f47909a;
            if (view instanceof org.telegram.ui.Cells.v2) {
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                if (i10 + 1 < b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v2Var.f23266s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    org.telegram.messenger.gw gwVar = (org.telegram.messenger.gw) arrayList.get(i10);
                    v2Var.d0(gwVar.f15965a, gwVar.d, gwVar.c(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f28557f;
                if (size < arrayList2.size()) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList2.get(size);
                    v2Var.d0(kjVar.Q1(), kjVar, kjVar.f16690k.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        lt0 lt0Var = new lt0(0, this.f28556c, true);
        au0 au0Var = this.G;
        lt0Var.setDialogCellDelegate(au0Var);
        lt0Var.f23258r0 = true;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, lt0Var, au0Var.H1);
        return new s4.c1(lt0Var);
    }
}
