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
public final class js0 extends oj0 {
    public int E;
    public final xs0 G;
    public final Context f35035c;
    public final int d;
    public boolean f35039r;
    public String f35042x;
    public ch.o0 f35043y;
    public final ArrayList f35036e = new ArrayList();
    public final ArrayList f35037f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f35038n = new ArrayList();
    public boolean f35040s = false;
    public int f35041w = 0;
    public int D = -1;
    public final ir0 F = new ir0(this, 3);

    public js0(xs0 xs0Var, Context context) {
        this.G = xs0Var;
        this.f35035c = context;
        this.d = xs0Var.f40424x1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final void E(ch.o0 o0Var, String str) {
        long j3;
        String str2;
        if (TextUtils.equals(str, this.f35042x)) {
            ch.o0 o0Var2 = this.f35043y;
            if (o0Var2 != null || o0Var != null) {
                if (o0Var2 != null && o0Var2.equals(o0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f35042x = str;
        this.f35043y = o0Var;
        int i7 = this.D;
        int i10 = this.d;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.D, true);
            this.D = -1;
        }
        this.f35038n.clear();
        this.h.clear();
        this.f35037f.clear();
        int i11 = 0;
        this.f35041w = 0;
        this.f35040s = false;
        this.f35039r = true;
        ArrayList arrayList = this.f35036e;
        arrayList.clear();
        if (this.f35043y == null) {
            org.telegram.messenger.vv G1 = org.telegram.messenger.qp.s1(i10).G1();
            ArrayList arrayList2 = G1.f26204j;
            int i12 = G1.f26197a;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String O3 = org.telegram.messenger.g0.O3(str.toLowerCase());
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList2.get(i13);
                    long j10 = uvVar.f25886a;
                    String str3 = null;
                    if (j10 == 2666000) {
                        str2 = org.telegram.messenger.hd.M0(2131754252, null);
                    } else if (j10 == org.telegram.messenger.p10.i(i12).e()) {
                        str2 = org.telegram.messenger.hd.M0(2131748302, null);
                        str3 = org.telegram.messenger.hd.M0(2131745902, null);
                    } else if (uvVar.f25886a >= 0) {
                        str2 = org.telegram.messenger.t10.p(org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(uvVar.f25886a)));
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(-uvVar.f25886a));
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
                                    arrayList3.add(uvVar);
                                }
                            }
                        } else {
                            arrayList3.add(uvVar);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            sr0[] sr0VarArr = this.G.m0;
            if (i11 >= sr0VarArr.length) {
                break;
            }
            sr0 sr0Var = sr0VarArr[i11];
            if (sr0Var.E == 11) {
                sr0Var.f38109w.e(true, true);
            }
            i11++;
        }
        if (this.f35043y == null) {
            f();
        }
        ir0 ir0Var = this.F;
        org.telegram.messenger.g0.r(ir0Var);
        if (this.f35043y != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        org.telegram.messenger.g0.i3(ir0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f35042x) && this.f35043y == null) {
            this.f35039r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i7 = this.d;
        tL_messages_search.peer = org.telegram.messenger.qp.s1(i7).j1(org.telegram.messenger.p10.i(i7).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f27063q = this.f35042x;
        ch.o0 o0Var = this.f35043y;
        if (o0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(o0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList)).f1();
        }
        tL_messages_search.limit = 10;
        this.f35040s = false;
        int i10 = this.E + 1;
        this.E = i10;
        org.telegram.ui.q8 q8Var = new org.telegram.ui.q8(this, i10, tL_messages_search, 18);
        if (this.f35043y != null) {
            org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
            a02.f26688a.c(new org.telegram.messenger.or(a02, this.f35042x, 0L, this.f35043y.g(), 100, this.f35038n.size(), false, new di.b2(1, this, q8Var)));
            return;
        }
        q8Var.run();
    }

    public final void G(boolean z9) {
        ArrayList arrayList;
        CharSequence a02;
        CharSequence charSequence;
        sr0[] sr0VarArr = this.G.m0;
        ArrayList arrayList2 = this.f35037f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i7 >= arrayList3.size()) {
                break;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList3.get(i7);
            if (ijVar != null && !hashSet.contains(Integer.valueOf(ijVar.f1()))) {
                hashSet.add(Integer.valueOf(ijVar.f1()));
                arrayList2.add(ijVar);
            }
            i7++;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.f35038n;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i10);
            if (ijVar2 != null && !hashSet.contains(Integer.valueOf(ijVar2.f1()))) {
                hashSet.add(Integer.valueOf(ijVar2.f1()));
                arrayList2.add(ijVar2);
            }
            i10++;
        }
        if (!z9 || !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < sr0VarArr.length; i11++) {
                if (sr0VarArr[i11].E == 11 && arrayList2.isEmpty() && this.f35036e.isEmpty()) {
                    xh.l lVar = sr0VarArr[i11].f38109w.d;
                    if (this.f35043y != null && TextUtils.isEmpty(this.f35042x)) {
                        String M0 = org.telegram.messenger.hd.M0(2131748163, null);
                        ch.o0 o0Var = this.f35043y;
                        Paint.FontMetricsInt fontMetricsInt = sr0VarArr[i11].f38109w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(o0Var.f6356f)) {
                            charSequence = o0Var.f6356f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new r5(o0Var.f6357g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        a02 = org.telegram.messenger.g0.K2(M0, charSequence, "%s");
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131748165, this.f35042x);
                    }
                    lVar.setText(a02);
                    sr0VarArr[i11].f38109w.f31930f.setVisibility(8);
                    sr0VarArr[i11].f38109w.e(false, true);
                }
            }
        }
        f();
    }

    @Override
    public final int b() {
        return this.f35037f.size() + this.f35036e.size();
    }

    @Override
    public final long c(int i7) {
        int hash;
        if (i7 < 0) {
            return i7;
        }
        ArrayList arrayList = this.f35036e;
        if (i7 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((org.telegram.messenger.uv) arrayList.get(i7)).f25886a));
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f35037f;
            if (size < arrayList2.size()) {
                hash = Objects.hash(2, Long.valueOf(((org.telegram.messenger.ij) arrayList2.get(size)).Q1()), Integer.valueOf(((org.telegram.messenger.ij) arrayList2.get(size)).f1()));
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
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        if (i7 >= 0) {
            View view = d1Var.f56952a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (i7 + 1 < b()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                t2Var.f30475s2 = z9;
                ArrayList arrayList = this.f35036e;
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList.get(i7);
                    t2Var.d0(uvVar.f25886a, uvVar.d, uvVar.c(), false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                ArrayList arrayList2 = this.f35037f;
                if (size < arrayList2.size()) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(size);
                    t2Var.d0(ijVar.Q1(), ijVar, ijVar.f23237k.date, false, false);
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var = new jg.a0(1, this.f35035c, true);
        xs0 xs0Var = this.G;
        a0Var.setDialogCellDelegate(xs0Var);
        a0Var.f30467r0 = true;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, a0Var, xs0Var.H1);
        return new v4.d1(a0Var);
    }
}
