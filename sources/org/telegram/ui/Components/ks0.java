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
public final class ks0 extends oj0 {
    public int E;
    public final ys0 G;
    public final Context f35424c;
    public final int d;
    public boolean f35428r;
    public String f35431x;
    public ch.o0 f35432y;
    public final ArrayList f35425e = new ArrayList();
    public final ArrayList f35426f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f35427n = new ArrayList();
    public boolean f35429s = false;
    public int f35430w = 0;
    public int D = -1;
    public final jr0 F = new jr0(this, 3);

    public ks0(ys0 ys0Var, Context context) {
        this.G = ys0Var;
        this.f35424c = context;
        this.d = ys0Var.f40719x1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final void E(ch.o0 o0Var, String str) {
        long j3;
        String str2;
        if (TextUtils.equals(str, this.f35431x)) {
            ch.o0 o0Var2 = this.f35432y;
            if (o0Var2 != null || o0Var != null) {
                if (o0Var2 != null && o0Var2.equals(o0Var)) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f35431x = str;
        this.f35432y = o0Var;
        int i7 = this.D;
        int i10 = this.d;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i10).cancelRequest(this.D, true);
            this.D = -1;
        }
        this.f35427n.clear();
        this.h.clear();
        this.f35426f.clear();
        int i11 = 0;
        this.f35430w = 0;
        this.f35429s = false;
        this.f35428r = true;
        ArrayList arrayList = this.f35425e;
        arrayList.clear();
        if (this.f35432y == null) {
            org.telegram.messenger.vv G1 = org.telegram.messenger.qp.s1(i10).G1();
            ArrayList arrayList2 = G1.f26222j;
            int i12 = G1.f26215a;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String O3 = org.telegram.messenger.g0.O3(str.toLowerCase());
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList2.get(i13);
                    long j10 = uvVar.f25900a;
                    String str3 = null;
                    if (j10 == 2666000) {
                        str2 = org.telegram.messenger.id.M0(2131754252, null);
                    } else if (j10 == org.telegram.messenger.p10.i(i12).e()) {
                        str2 = org.telegram.messenger.id.M0(2131748303, null);
                        str3 = org.telegram.messenger.id.M0(2131745901, null);
                    } else if (uvVar.f25900a >= 0) {
                        str2 = org.telegram.messenger.t10.p(org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(uvVar.f25900a)));
                    } else {
                        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(-uvVar.f25900a));
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
            tr0[] tr0VarArr = this.G.m0;
            if (i11 >= tr0VarArr.length) {
                break;
            }
            tr0 tr0Var = tr0VarArr[i11];
            if (tr0Var.E == 11) {
                tr0Var.f38389w.e(true, true);
            }
            i11++;
        }
        if (this.f35432y == null) {
            f();
        }
        jr0 jr0Var = this.F;
        org.telegram.messenger.g0.r(jr0Var);
        if (this.f35432y != null) {
            j3 = 60;
        } else {
            j3 = 600;
        }
        org.telegram.messenger.g0.i3(jr0Var, j3);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.f35431x) && this.f35432y == null) {
            this.f35428r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i7 = this.d;
        tL_messages_search.peer = org.telegram.messenger.qp.s1(i7).j1(org.telegram.messenger.p10.i(i7).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.f27071q = this.f35431x;
        ch.o0 o0Var = this.f35432y;
        if (o0Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(o0Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((org.telegram.messenger.ij) jg.g.i(1, arrayList)).e1();
        }
        tL_messages_search.limit = 10;
        this.f35429s = false;
        int i10 = this.E + 1;
        this.E = i10;
        org.telegram.ui.q8 q8Var = new org.telegram.ui.q8(this, i10, tL_messages_search, 18);
        if (this.f35432y != null) {
            org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(i7);
            a02.f26723a.c(new org.telegram.messenger.or(a02, this.f35431x, 0L, this.f35432y.g(), 100, this.f35427n.size(), false, new di.b2(1, this, q8Var)));
            return;
        }
        q8Var.run();
    }

    public final void G(boolean z9) {
        ArrayList arrayList;
        CharSequence a02;
        CharSequence charSequence;
        tr0[] tr0VarArr = this.G.m0;
        ArrayList arrayList2 = this.f35426f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i7 >= arrayList3.size()) {
                break;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList3.get(i7);
            if (ijVar != null && !hashSet.contains(Integer.valueOf(ijVar.e1()))) {
                hashSet.add(Integer.valueOf(ijVar.e1()));
                arrayList2.add(ijVar);
            }
            i7++;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.f35427n;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i10);
            if (ijVar2 != null && !hashSet.contains(Integer.valueOf(ijVar2.e1()))) {
                hashSet.add(Integer.valueOf(ijVar2.e1()));
                arrayList2.add(ijVar2);
            }
            i10++;
        }
        if (!z9 || !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < tr0VarArr.length; i11++) {
                if (tr0VarArr[i11].E == 11 && arrayList2.isEmpty() && this.f35425e.isEmpty()) {
                    xh.l lVar = tr0VarArr[i11].f38389w.d;
                    if (this.f35432y != null && TextUtils.isEmpty(this.f35431x)) {
                        String M0 = org.telegram.messenger.id.M0(2131748164, null);
                        ch.o0 o0Var = this.f35432y;
                        Paint.FontMetricsInt fontMetricsInt = tr0VarArr[i11].f38389w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(o0Var.f6359f)) {
                            charSequence = o0Var.f6359f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new q5(o0Var.f6360g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        a02 = org.telegram.messenger.g0.K2(M0, charSequence, "%s");
                    } else {
                        a02 = org.telegram.messenger.id.a0(null, null, 2131748166, this.f35431x);
                    }
                    lVar.setText(a02);
                    tr0VarArr[i11].f38389w.f32369f.setVisibility(8);
                    tr0VarArr[i11].f38389w.e(false, true);
                }
            }
        }
        f();
    }

    @Override
    public final int b() {
        return this.f35426f.size() + this.f35425e.size();
    }

    @Override
    public final long c(int i7) {
        int hash;
        if (i7 < 0) {
            return i7;
        }
        ArrayList arrayList = this.f35425e;
        if (i7 < arrayList.size()) {
            hash = Objects.hash(1, Long.valueOf(((org.telegram.messenger.uv) arrayList.get(i7)).f25900a));
        } else {
            int size = i7 - arrayList.size();
            ArrayList arrayList2 = this.f35426f;
            if (size < arrayList2.size()) {
                hash = Objects.hash(2, Long.valueOf(((org.telegram.messenger.ij) arrayList2.get(size)).P1()), Integer.valueOf(((org.telegram.messenger.ij) arrayList2.get(size)).e1()));
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
            View view = d1Var.f57052a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                if (i7 + 1 < b()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                t2Var.f30495s2 = z9;
                ArrayList arrayList = this.f35425e;
                if (i7 < arrayList.size()) {
                    org.telegram.messenger.uv uvVar = (org.telegram.messenger.uv) arrayList.get(i7);
                    t2Var.d0(uvVar.f25900a, uvVar.d, uvVar.c(), false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                ArrayList arrayList2 = this.f35426f;
                if (size < arrayList2.size()) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(size);
                    t2Var.d0(ijVar.P1(), ijVar, ijVar.f23266k.date, false, false);
                }
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        jg.a0 a0Var = new jg.a0(1, this.f35424c, true);
        ys0 ys0Var = this.G;
        a0Var.setDialogCellDelegate(ys0Var);
        a0Var.f30487r0 = true;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, a0Var, ys0Var.H1);
        return new v4.d1(a0Var);
    }
}
