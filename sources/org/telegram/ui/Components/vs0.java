package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class vs0 extends ss0 {
    public final ArrayList E;
    public boolean F;
    public final ys0 G;
    public final boolean h;
    public final int f41147n;
    public final ArrayList f41148r;
    public fi.k6 f41149s;
    public final int f41150w;
    public final ts0 f41151x;
    public boolean f41152y;

    public vs0(ys0 ys0Var, Context context, boolean z10) {
        this(ys0Var, context, 0, z10);
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final String F(int i7) {
        org.telegram.messenger.gj gjVar;
        TL_stories.StoryItem storyItem;
        fi.k6 k6Var = this.f41149s;
        if (k6Var == null || i7 < 0 || i7 >= k6Var.f11944i.size() || (gjVar = (org.telegram.messenger.gj) this.f41149s.f11944i.get(i7)) == null || (storyItem = gjVar.f23824l) == null) {
            return null;
        }
        return org.telegram.messenger.hd.e0(storyItem.date, true);
    }

    @Override
    public final void I() {
        int i7;
        if (this.h) {
            i7 = 9;
        } else {
            i7 = 8;
        }
        this.G.r1(i7, true);
    }

    public final boolean M(int i7) {
        fi.k6 k6Var;
        if (!this.h && (k6Var = this.f41149s) != null) {
            if (k6Var instanceof fi.c6) {
                ys0 ys0Var = this.G;
                TLRPC.User a22 = org.telegram.messenger.np.s1(ys0Var.f42152y1.getCurrentAccount()).a2(Long.valueOf(ys0Var.f42116m1));
                if (a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < k6Var.f11944i.size()) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f41149s.f11944i.get(i7);
                fi.k6 k6Var2 = this.f41149s;
                if (k6Var2.f11942f > 0) {
                    return true;
                }
                return k6Var2.m(gjVar.e1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        tr0 tr0Var;
        tr0 tr0Var2;
        tr0 tr0Var3;
        tr0 tr0Var4;
        fi.k6 k6Var = this.f41149s;
        if (k6Var != null && !this.h) {
            ys0 ys0Var = this.G;
            boolean z10 = ys0Var.f42122o1;
            tr0[] tr0VarArr = ys0Var.f42119n0;
            int[] iArr = ys0Var.f42125p1;
            if ((!z10 || (ys0Var.n1 && k6Var.g() > 1)) && this.f41149s.g() > 0 && !ys0Var.I0()) {
                boolean z11 = false;
                if (this.f41149s.g() < 5) {
                    iArr[1] = this.f41149s.g();
                    if (tr0VarArr != null && (tr0Var3 = tr0VarArr[0]) != null && (tr0Var4 = tr0VarArr[1]) != null && tr0Var3.h != null && tr0Var4.h != null) {
                        ys0Var.B1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    ys0Var.n1 = z11;
                } else if (ys0Var.n1) {
                    ys0Var.n1 = false;
                    iArr[1] = Math.max(2, org.telegram.messenger.gz.f23989u1);
                    if (tr0VarArr != null && (tr0Var = tr0VarArr[0]) != null && (tr0Var2 = tr0VarArr[1]) != null && tr0Var.h != null && tr0Var2.h != null) {
                        ys0Var.B1(false);
                    }
                }
                ys0Var.f42122o1 = true;
            }
        }
    }

    public final int O() {
        ys0 ys0Var = this.G;
        fr0 fr0Var = ys0Var.K;
        int[] iArr = ys0Var.f42125p1;
        if (this == fr0Var) {
            return iArr[0];
        }
        if (ys0.x(ys0Var, this) != -1) {
            return iArr[1];
        }
        return ys0Var.f42139t1;
    }

    public final void P() {
        if (this.f41149s == null) {
            return;
        }
        int O = O();
        this.f41149s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int b() {
        int i7 = 0;
        if (this.f41149s == null) {
            return 0;
        }
        int size = this.f41148r.size();
        if (!this.f41149s.l() || !this.G.t0()) {
            i7 = this.f41149s.g();
        }
        return size + i7;
    }

    @Override
    public final int d(int i7) {
        return 19;
    }

    @Override
    public final int e() {
        return b();
    }

    @Override
    public void f() {
        if (this.f41149s != null) {
            ys0 ys0Var = this.G;
            if (ys0Var.B0()) {
                ArrayList arrayList = this.f41148r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.np.s1(this.f41149s.f11940c).P1().F(ys0Var.f42116m1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        if (this.f41149s != null && e1Var.f58539f == 19) {
            View view = e1Var.f58535a;
            if (view instanceof org.telegram.ui.Cells.n7) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                n7Var.f30748e0 = true;
                ArrayList arrayList = this.f41148r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    fi.r6 r6Var = (fi.r6) arrayList.get(i7);
                    n7Var.f30751g0 = false;
                    if (r6Var.L == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = r6Var.f12272a;
                        int i10 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.f28290id = i10;
                        tL_storyItem.attachPath = r6Var.f12276f;
                        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(this.f41149s.f11940c, tL_storyItem);
                        r6Var.L = gjVar;
                        gjVar.f23828m = r6Var;
                    }
                    n7Var.k(r6Var.L, O(), false);
                    n7Var.f30748e0 = true;
                    n7Var.setReorder(false);
                    n7Var.i(false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                if (size >= 0 && size < this.f41149s.f11944i.size()) {
                    org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) this.f41149s.f11944i.get(size);
                    if (gjVar2 != null && this.f41149s.m(gjVar2.e1())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    n7Var.f30751g0 = z10;
                    ys0 ys0Var = this.G;
                    if (!ys0Var.B0() && !n7Var.f30751g0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    n7Var.setReorder(z11);
                    n7Var.h = ys0Var.G0();
                    n7Var.k(gjVar2, O(), false);
                    if (ys0Var.F1 && gjVar2 != null) {
                        SparseArray[] sparseArrayArr = ys0Var.f42087c1;
                        if (org.telegram.messenger.gj.B0(gjVar2.f23819k) == ys0Var.f42116m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(gjVar2.e1()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        n7Var.i(z12, true);
                    } else {
                        n7Var.i(false, false);
                    }
                    n7Var.l(this.f41152y, false);
                    return;
                }
                n7Var.f30751g0 = false;
                n7Var.k(null, O(), false);
                n7Var.f30748e0 = true;
            }
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        v4.e1 x10 = super.x(viewGroup, i7);
        View view = x10.f58535a;
        if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f30748e0 = true;
        }
        return x10;
    }

    public vs0(ys0 ys0Var, Context context, int i7, boolean z10) {
        super(ys0Var, context);
        int i10;
        TLRPC.User a22;
        this.G = ys0Var;
        this.f41148r = new ArrayList();
        this.E = new ArrayList();
        this.h = z10;
        this.f41147n = i7;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42152y1;
        long j3 = ys0Var.f42116m1;
        int currentAccount = e2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(ys0Var.getStoriesHashtag())) {
            if (ys0Var.X1 == null) {
                ys0Var.X1 = new fi.d6(currentAccount, TextUtils.isEmpty(ys0Var.getStoriesHashtagUsername()) ? null : ys0Var.getStoriesHashtagUsername(), ys0Var.getStoriesHashtag());
            }
            this.f41149s = ys0Var.X1;
        } else if (ys0Var.getStoriesArea() != null) {
            if (ys0Var.X1 == null) {
                ys0Var.X1 = new fi.d6(currentAccount, ys0Var.getStoriesArea());
            }
            this.f41149s = ys0Var.X1;
        } else if ((z10 && !ys0Var.I0()) || (!z10 && ys0Var.A0())) {
            this.f41149s = null;
        } else {
            int i11 = 1;
            boolean z11 = j3 > 0 && (a22 = org.telegram.messenger.np.s1(currentAccount).a2(Long.valueOf(j3))) != null && a22.bot;
            if (i7 > 0) {
                this.f41149s = e2Var.getMessagesController().P1().A(0, i7, ys0Var.f42116m1, true);
            } else {
                fi.s6 P1 = e2Var.getMessagesController().P1();
                long j10 = ys0Var.f42116m1;
                if (z11) {
                    i11 = 4;
                } else if (!z10) {
                    i10 = 0;
                    this.f41149s = P1.A(i10, -1, j10, true);
                }
                i10 = i11;
                this.f41149s = P1.A(i10, -1, j10, true);
            }
        }
        fi.k6 k6Var = this.f41149s;
        if (k6Var != null) {
            this.f41150w = k6Var.o();
            this.f41151x = new ts0(this, e2Var.getMessagesController().P1(), ys0Var.f42116m1, this.f41149s.f11940c);
        }
        N();
    }

    @Override
    public final int L(int i7) {
        return i7;
    }
}
