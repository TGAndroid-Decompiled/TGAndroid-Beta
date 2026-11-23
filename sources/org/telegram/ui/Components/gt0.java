package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class gt0 extends dt0 {
    public final ArrayList E;
    public boolean F;
    public final jt0 G;
    public final boolean h;
    public final int f35668n;
    public final ArrayList f35669r;
    public fi.h6 f35670s;
    public final int f35671w;
    public final et0 f35672x;
    public boolean f35673y;

    public gt0(jt0 jt0Var, Context context, boolean z10) {
        this(jt0Var, context, 0, z10);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final String F(int i7) {
        org.telegram.messenger.gj gjVar;
        TL_stories.StoryItem storyItem;
        fi.h6 h6Var = this.f35670s;
        if (h6Var == null || i7 < 0 || i7 >= h6Var.f12089i.size() || (gjVar = (org.telegram.messenger.gj) this.f35670s.f12089i.get(i7)) == null || (storyItem = gjVar.f24218l) == null) {
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
        fi.h6 h6Var;
        if (!this.h && (h6Var = this.f35670s) != null) {
            if (h6Var instanceof fi.a6) {
                jt0 jt0Var = this.G;
                TLRPC.User c22 = org.telegram.messenger.np.u1(jt0Var.f36683y1.getCurrentAccount()).c2(Long.valueOf(jt0Var.f36647m1));
                if (c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < h6Var.f12089i.size()) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f35670s.f12089i.get(i7);
                fi.h6 h6Var2 = this.f35670s;
                if (h6Var2.f12087f > 0) {
                    return true;
                }
                return h6Var2.m(gjVar.e1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        ds0 ds0Var;
        ds0 ds0Var2;
        ds0 ds0Var3;
        ds0 ds0Var4;
        fi.h6 h6Var = this.f35670s;
        if (h6Var != null && !this.h) {
            jt0 jt0Var = this.G;
            boolean z10 = jt0Var.f36653o1;
            ds0[] ds0VarArr = jt0Var.f36650n0;
            int[] iArr = jt0Var.f36656p1;
            if ((!z10 || (jt0Var.n1 && h6Var.g() > 1)) && this.f35670s.g() > 0 && !jt0Var.I0()) {
                boolean z11 = false;
                if (this.f35670s.g() < 5) {
                    iArr[1] = this.f35670s.g();
                    if (ds0VarArr != null && (ds0Var3 = ds0VarArr[0]) != null && (ds0Var4 = ds0VarArr[1]) != null && ds0Var3.h != null && ds0Var4.h != null) {
                        jt0Var.B1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    jt0Var.n1 = z11;
                } else if (jt0Var.n1) {
                    jt0Var.n1 = false;
                    iArr[1] = Math.max(2, org.telegram.messenger.cz.f23447u1);
                    if (ds0VarArr != null && (ds0Var = ds0VarArr[0]) != null && (ds0Var2 = ds0VarArr[1]) != null && ds0Var.h != null && ds0Var2.h != null) {
                        jt0Var.B1(false);
                    }
                }
                jt0Var.f36653o1 = true;
            }
        }
    }

    public final int O() {
        jt0 jt0Var = this.G;
        pr0 pr0Var = jt0Var.K;
        int[] iArr = jt0Var.f36656p1;
        if (this == pr0Var) {
            return iArr[0];
        }
        if (jt0.x(jt0Var, this) != -1) {
            return iArr[1];
        }
        return jt0Var.f36670t1;
    }

    public final void P() {
        if (this.f35670s == null) {
            return;
        }
        int O = O();
        this.f35670s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int b() {
        int i7 = 0;
        if (this.f35670s == null) {
            return 0;
        }
        int size = this.f35669r.size();
        if (!this.f35670s.l() || !this.G.t0()) {
            i7 = this.f35670s.g();
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
        if (this.f35670s != null) {
            jt0 jt0Var = this.G;
            if (jt0Var.B0()) {
                ArrayList arrayList = this.f35669r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.np.u1(this.f35670s.f12085c).R1().F(jt0Var.f36647m1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        if (this.f35670s != null && f1Var.f59169f == 19) {
            View view = f1Var.f59165a;
            if (view instanceof org.telegram.ui.Cells.p7) {
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                p7Var.f31261e0 = true;
                ArrayList arrayList = this.f35669r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    fi.o6 o6Var = (fi.o6) arrayList.get(i7);
                    p7Var.f31264g0 = false;
                    if (o6Var.L == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = o6Var.f12373a;
                        int i10 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.f28673id = i10;
                        tL_storyItem.attachPath = o6Var.f12377f;
                        org.telegram.messenger.gj gjVar = new org.telegram.messenger.gj(this.f35670s.f12085c, tL_storyItem);
                        o6Var.L = gjVar;
                        gjVar.f24222m = o6Var;
                    }
                    p7Var.k(o6Var.L, O(), false);
                    p7Var.f31261e0 = true;
                    p7Var.setReorder(false);
                    p7Var.i(false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                if (size >= 0 && size < this.f35670s.f12089i.size()) {
                    org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) this.f35670s.f12089i.get(size);
                    if (gjVar2 != null && this.f35670s.m(gjVar2.e1())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p7Var.f31264g0 = z10;
                    jt0 jt0Var = this.G;
                    if (!jt0Var.B0() && !p7Var.f31264g0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    p7Var.setReorder(z11);
                    p7Var.h = jt0Var.G0();
                    p7Var.k(gjVar2, O(), false);
                    if (jt0Var.F1 && gjVar2 != null) {
                        SparseArray[] sparseArrayArr = jt0Var.f36618c1;
                        if (org.telegram.messenger.gj.B0(gjVar2.f24213k) == jt0Var.f36647m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(gjVar2.e1()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        p7Var.i(z12, true);
                    } else {
                        p7Var.i(false, false);
                    }
                    p7Var.l(this.f35673y, false);
                    return;
                }
                p7Var.f31264g0 = false;
                p7Var.k(null, O(), false);
                p7Var.f31261e0 = true;
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        v4.f1 x10 = super.x(viewGroup, i7);
        View view = x10.f59165a;
        if (view instanceof org.telegram.ui.Cells.p7) {
            ((org.telegram.ui.Cells.p7) view).f31261e0 = true;
        }
        return x10;
    }

    public gt0(jt0 jt0Var, Context context, int i7, boolean z10) {
        super(jt0Var, context);
        int i10;
        TLRPC.User c22;
        this.G = jt0Var;
        this.f35669r = new ArrayList();
        this.E = new ArrayList();
        this.h = z10;
        this.f35668n = i7;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36683y1;
        long j3 = jt0Var.f36647m1;
        int currentAccount = g2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(jt0Var.getStoriesHashtag())) {
            if (jt0Var.X1 == null) {
                jt0Var.X1 = new fi.b6(currentAccount, TextUtils.isEmpty(jt0Var.getStoriesHashtagUsername()) ? null : jt0Var.getStoriesHashtagUsername(), jt0Var.getStoriesHashtag());
            }
            this.f35670s = jt0Var.X1;
        } else if (jt0Var.getStoriesArea() != null) {
            if (jt0Var.X1 == null) {
                jt0Var.X1 = new fi.b6(currentAccount, jt0Var.getStoriesArea());
            }
            this.f35670s = jt0Var.X1;
        } else if ((z10 && !jt0Var.I0()) || (!z10 && jt0Var.A0())) {
            this.f35670s = null;
        } else {
            int i11 = 1;
            boolean z11 = j3 > 0 && (c22 = org.telegram.messenger.np.u1(currentAccount).c2(Long.valueOf(j3))) != null && c22.bot;
            if (i7 > 0) {
                this.f35670s = g2Var.getMessagesController().R1().A(0, i7, jt0Var.f36647m1, true);
            } else {
                fi.p6 R1 = g2Var.getMessagesController().R1();
                long j10 = jt0Var.f36647m1;
                if (z11) {
                    i11 = 4;
                } else if (!z10) {
                    i10 = 0;
                    this.f35670s = R1.A(i10, -1, j10, true);
                }
                i10 = i11;
                this.f35670s = R1.A(i10, -1, j10, true);
            }
        }
        fi.h6 h6Var = this.f35670s;
        if (h6Var != null) {
            this.f35671w = h6Var.o();
            this.f35672x = new et0(this, g2Var.getMessagesController().R1(), jt0Var.f36647m1, this.f35670s.f12085c);
        }
        N();
    }

    @Override
    public final int L(int i7) {
        return i7;
    }
}
