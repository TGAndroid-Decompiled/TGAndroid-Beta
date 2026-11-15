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
public final class ks0 extends tj0 {
    public int F;
    public final ys0 H;
    public final Context f36594c;
    public final int d;
    public boolean f36598r;
    public String f36601x;
    public ch.p0 f36602y;
    public final ArrayList f36595e = new ArrayList();
    public final ArrayList f36596f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f36597n = new ArrayList();
    public boolean f36599s = false;
    public int f36600w = 0;
    public int E = -1;
    public final ro0 G = new ro0(this, 6);

    public ks0(ys0 ys0Var, Context context) {
        this.H = ys0Var;
        this.f36594c = context;
        this.d = ys0Var.f42152y1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final void E(ch.p0 p0Var, String str) {
        long j3;
        String str2;
        if (TextUtils.equals(str, this.f36601x)) {
            ch.p0 p0Var2 = this.f36602y;
            if (p0Var2 != null || p0Var != null) {
                if (p0Var2 != null && p0Var2.equals(p0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f36601x = str;
        this.f36602y = p0Var;
        int i7 = this.E;
        int i10 = this.d;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.E, true);
            this.E = -1;
        }
        this.f36597n.clear();
        this.h.clear();
        this.f36596f.clear();
        int i11 = 0;
        this.f36600w = 0;
        this.f36599s = false;
        this.f36598r = true;
        ArrayList arrayList = this.f36595e;
        arrayList.clear();
        if (this.f36602y == null) {
            org.telegram.messenger.tv G1 = org.telegram.messenger.np.s1(i10).G1();
            ArrayList arrayList2 = G1.f26742j;
            int i12 = G1.f26735a;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String N3 = org.telegram.messenger.g0.N3(str.toLowerCase());
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    org.telegram.messenger.sv svVar = (org.telegram.messenger.sv) arrayList2.get(i13);
                    long j10 = svVar.f26578a;
                    String str3 = null;
                    if (j10 == 2666000) {
                        str2 = org.telegram.messenger.hd.M0(2131754252, null);
                    } else if (j10 == org.telegram.messenger.m10.i(i12).e()) {
                        str2 = org.telegram.messenger.hd.M0(2131748303, null);
                        str3 = org.telegram.messenger.hd.M0(2131745901, null);
                    } else if (svVar.f26578a >= 0) {
                        str2 = org.telegram.messenger.q10.p(org.telegram.messenger.np.s1(i12).a2(Long.valueOf(svVar.f26578a)));
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.np.s1(i12).M0(Long.valueOf(-svVar.f26578a));
                        if (M0 != null) {
                            str2 = M0.title;
                        } else {
                            str2 = "";
                        }
                    }
                    if (str2 != null) {
                        String N32 = org.telegram.messenger.g0.N3(str2.toLowerCase());
                        if (!N32.startsWith(N3) && !N32.contains(" ".concat(N3))) {
                            if (str3 != null) {
                                String N33 = org.telegram.messenger.g0.N3(str3.toLowerCase());
                                if (N33.startsWith(N3) || N33.contains(" ".concat(N3))) {
                                    arrayList3.add(svVar);
                                }
                            }
                        } else {
                            arrayList3.add(svVar);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            tr0[] tr0VarArr = this.H.f42119n0;
            if (i11 >= tr0VarArr.length) {
                break;
            }
            tr0 tr0Var = tr0VarArr[i11];
            if (tr0Var.F == 11) {
                tr0Var.f39795w.e(true, true);
            }
            i11++;
        }
        if (this.f36602y == null) {
            f();
        }
        ro0 ro0Var = this.G;
        org.telegram.messenger.g0.r(ro0Var);
        if (this.f36602y != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        org.telegram.messenger.g0.i3(ro0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f36601x) && this.f36602y == null) {
            this.f36598r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i7 = this.d;
        tL_messages_search.peer = org.telegram.messenger.np.s1(i7).j1(org.telegram.messenger.m10.i(i7).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f28162q = this.f36601x;
        ch.p0 p0Var = this.f36602y;
        if (p0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(p0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((org.telegram.messenger.gj) i5.c.h(1, arrayList)).e1();
        }
        tL_messages_search.limit = 10;
        this.f36599s = false;
        int i10 = this.F + 1;
        this.F = i10;
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(this, i10, tL_messages_search, 21);
        if (this.f36602y != null) {
            org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(i7);
            a02.f27219a.c(new org.telegram.messenger.kr(a02, this.f36601x, 0L, this.f36602y.g(), 100, this.f36597n.size(), false, new fi.y1(1, this, f0Var)));
            return;
        }
        f0Var.run();
    }

    public final void G(boolean z10) {
        ArrayList arrayList;
        CharSequence a02;
        CharSequence charSequence;
        tr0[] tr0VarArr = this.H.f42119n0;
        ArrayList arrayList2 = this.f36596f;
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
            arrayList = this.f36597n;
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
            for (int i11 = 0; i11 < tr0VarArr.length; i11++) {
                if (tr0VarArr[i11].F == 11 && arrayList2.isEmpty() && this.f36595e.isEmpty()) {
                    xh.l lVar = tr0VarArr[i11].f39795w.d;
                    if (this.f36602y != null && TextUtils.isEmpty(this.f36601x)) {
                        String M0 = org.telegram.messenger.hd.M0(2131748164, null);
                        ch.p0 p0Var = this.f36602y;
                        Paint.FontMetricsInt fontMetricsInt = tr0VarArr[i11].f39795w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(p0Var.f5191f)) {
                            charSequence = p0Var.f5191f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new p5(p0Var.f5192g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        a02 = org.telegram.messenger.g0.K2(M0, charSequence, "%s");
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131748166, this.f36601x);
                    }
                    lVar.setText(a02);
                    tr0VarArr[i11].f39795w.f33710f.setVisibility(8);
                    tr0VarArr[i11].f39795w.e(false, true);
                }
            }
        }
        f();
    }

    @Override
    public final int b() {
        return this.f36596f.size() + this.f36595e.size();
    }

    @Override
    public final long c(int i7) {
        int hash;
        if (i7 < 0) {
            return i7;
        }
        ArrayList arrayList = this.f36595e;
        if (i7 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((org.telegram.messenger.sv) arrayList.get(i7)).f26578a));
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f36596f;
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
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        if (i7 >= 0) {
            View view = e1Var.f58535a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (i7 + 1 < b()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t2Var.f31637t2 = z10;
                ArrayList arrayList = this.f36595e;
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.sv svVar = (org.telegram.messenger.sv) arrayList.get(i7);
                    t2Var.f0(svVar.f26578a, svVar.d, svVar.c(), false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                ArrayList arrayList2 = this.f36596f;
                if (size < arrayList2.size()) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(size);
                    t2Var.f0(gjVar.P1(), gjVar, gjVar.f23819k.date, false, false);
                }
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var = new jg.a0(1, this.f36594c, true);
        ys0 ys0Var = this.H;
        a0Var.setDialogCellDelegate(ys0Var);
        a0Var.f31630s0 = true;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, a0Var, ys0Var.I1);
        return new v4.e1(a0Var);
    }
}
