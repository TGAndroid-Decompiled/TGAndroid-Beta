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
public final class lt0 extends sk0 {
    public int E;
    public final zt0 G;
    public final Context f28182c;
    public final int d;
    public boolean f28185r;
    public String f28188x;
    public sg.o0 f28189y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f28183f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f28184n = new ArrayList();
    public boolean f28186s = false;
    public int f28187w = 0;
    public int D = -1;
    public final uo0 F = new uo0(this, 8);

    public lt0(zt0 zt0Var, Context context) {
        this.G = zt0Var;
        this.f28182c = context;
        this.d = zt0Var.f33240x1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(String str, sg.o0 o0Var) {
        long j10;
        String str2;
        if (TextUtils.equals(str, this.f28188x)) {
            sg.o0 o0Var2 = this.f28189y;
            if (o0Var2 != null || o0Var != null) {
                if (o0Var2 != null && o0Var2.equals(o0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f28188x = str;
        this.f28189y = o0Var;
        int i10 = this.D;
        int i11 = this.d;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.D, true);
            this.D = -1;
        }
        this.f28184n.clear();
        this.h.clear();
        this.f28183f.clear();
        int i12 = 0;
        this.f28187w = 0;
        this.f28186s = false;
        this.f28185r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.f28189y == null) {
            org.telegram.messenger.gw F1 = org.telegram.messenger.vp.r1(i11).F1();
            ArrayList arrayList2 = F1.f15772j;
            int i13 = F1.f15766a;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String N3 = org.telegram.messenger.i0.N3(str.toLowerCase());
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    org.telegram.messenger.fw fwVar = (org.telegram.messenger.fw) arrayList2.get(i14);
                    long j11 = fwVar.f15624a;
                    String str3 = null;
                    if (j11 == 2666000) {
                        str2 = org.telegram.messenger.cd.L0(2131754252, null);
                    } else if (j11 == org.telegram.messenger.d20.i(i13).e()) {
                        str2 = org.telegram.messenger.cd.L0(2131748318, null);
                        str3 = org.telegram.messenger.cd.L0(2131745918, null);
                    } else if (fwVar.f15624a >= 0) {
                        str2 = org.telegram.messenger.h20.p(org.telegram.messenger.vp.r1(i13).Z1(Long.valueOf(fwVar.f15624a)));
                    } else {
                        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i13).L0(Long.valueOf(-fwVar.f15624a));
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
                                    arrayList3.add(fwVar);
                                }
                            }
                        } else {
                            arrayList3.add(fwVar);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            ss0[] ss0VarArr = this.G.m0;
            if (i12 >= ss0VarArr.length) {
                break;
            }
            ss0 ss0Var = ss0VarArr[i12];
            if (ss0Var.E == 11) {
                ss0Var.f30355w.e(true, true);
            }
            i12++;
        }
        if (this.f28189y == null) {
            f();
        }
        uo0 uo0Var = this.F;
        org.telegram.messenger.i0.r(uo0Var);
        if (this.f28189y != null) {
            j10 = 60;
        } else {
            j10 = 600;
        }
        org.telegram.messenger.i0.h3(uo0Var, j10);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f28188x) && this.f28189y == null) {
            this.f28185r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i10 = this.d;
        tL_messages_search.peer = org.telegram.messenger.vp.r1(i10).i1(org.telegram.messenger.d20.i(i10).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f19904q = this.f28188x;
        sg.o0 o0Var = this.f28189y;
        if (o0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(o0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((org.telegram.messenger.jj) i0.a.g(1, arrayList)).f1();
        }
        tL_messages_search.limit = 10;
        this.f28186s = false;
        int i11 = this.E + 1;
        this.E = i11;
        ji0 ji0Var = new ji0(this, i11, tL_messages_search, 5);
        if (this.f28189y != null) {
            org.telegram.messenger.hs a02 = org.telegram.messenger.hs.a0(i10);
            a02.f15938a.c(new org.telegram.messenger.xr(a02, this.f28188x, 0L, this.f28189y.g(), 100, this.f28184n.size(), false, new jt0(0, this, ji0Var)));
            return;
        }
        ji0Var.run();
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence a02;
        CharSequence charSequence;
        ss0[] ss0VarArr = this.G.m0;
        ArrayList arrayList2 = this.f28183f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i10 >= arrayList3.size()) {
                break;
            }
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList3.get(i10);
            if (jjVar != null && !hashSet.contains(Integer.valueOf(jjVar.f1()))) {
                hashSet.add(Integer.valueOf(jjVar.f1()));
                arrayList2.add(jjVar);
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            arrayList = this.f28184n;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(i11);
            if (jjVar2 != null && !hashSet.contains(Integer.valueOf(jjVar2.f1()))) {
                hashSet.add(Integer.valueOf(jjVar2.f1()));
                arrayList2.add(jjVar2);
            }
            i11++;
        }
        if (!z10 || !arrayList.isEmpty()) {
            for (int i12 = 0; i12 < ss0VarArr.length; i12++) {
                if (ss0VarArr[i12].E == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    nh.p pVar = ss0VarArr[i12].f30355w.d;
                    if (this.f28189y != null && TextUtils.isEmpty(this.f28188x)) {
                        String L0 = org.telegram.messenger.cd.L0(2131748180, null);
                        sg.o0 o0Var = this.f28189y;
                        Paint.FontMetricsInt fontMetricsInt = ss0VarArr[i12].f30355w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(o0Var.f48434f)) {
                            charSequence = o0Var.f48434f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new o5(o0Var.f48435g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        a02 = org.telegram.messenger.i0.J2(L0, charSequence, "%s");
                    } else {
                        a02 = org.telegram.messenger.cd.a0(null, null, 2131748182, this.f28188x);
                    }
                    pVar.setText(a02);
                    ss0VarArr[i12].f30355w.f25552f.setVisibility(8);
                    ss0VarArr[i12].f30355w.e(false, true);
                }
            }
        }
        f();
    }

    @Override
    public final int b() {
        return this.f28183f.size() + this.e.size();
    }

    @Override
    public final long c(int i10) {
        int hash;
        if (i10 < 0) {
            return i10;
        }
        ArrayList arrayList = this.e;
        if (i10 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((org.telegram.messenger.fw) arrayList.get(i10)).f15624a));
        } else {
            int size = i10 - arrayList.size();
            ArrayList arrayList2 = this.f28183f;
            if (size < arrayList2.size()) {
                hash = Objects.hash(2, Long.valueOf(((org.telegram.messenger.jj) arrayList2.get(size)).Q1()), Integer.valueOf(((org.telegram.messenger.jj) arrayList2.get(size)).f1()));
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
            View view = c1Var.f47898a;
            if (view instanceof org.telegram.ui.Cells.v2) {
                org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                if (i10 + 1 < b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                v2Var.f23265s2 = z10;
                ArrayList arrayList = this.e;
                if (i10 < arrayList.size()) {
                    org.telegram.messenger.fw fwVar = (org.telegram.messenger.fw) arrayList.get(i10);
                    v2Var.d0(fwVar.f15624a, fwVar.d, fwVar.c(), false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                ArrayList arrayList2 = this.f28183f;
                if (size < arrayList2.size()) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList2.get(size);
                    v2Var.d0(jjVar.Q1(), jjVar, jjVar.f16337k.date, false, false);
                }
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        kt0 kt0Var = new kt0(0, this.f28182c, true);
        zt0 zt0Var = this.G;
        kt0Var.setDialogCellDelegate(zt0Var);
        kt0Var.f23257r0 = true;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, kt0Var, zt0Var.H1);
        return new s4.c1(kt0Var);
    }
}
