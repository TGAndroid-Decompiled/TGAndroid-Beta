package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class ft0 extends ct0 {
    public final ArrayList E;
    public boolean F;
    public final it0 G;
    public final boolean h;
    public final int f35197n;
    public final ArrayList f35198r;
    public fi.h6 f35199s;
    public final int f35200w;
    public final dt0 f35201x;
    public boolean f35202y;

    public ft0(it0 it0Var, Context context, boolean z10) {
        this(it0Var, context, 0, z10);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final String F(int i7) {
        org.telegram.messenger.fj fjVar;
        TL_stories.StoryItem storyItem;
        fi.h6 h6Var = this.f35199s;
        if (h6Var == null || i7 < 0 || i7 >= h6Var.f12051i.size() || (fjVar = (org.telegram.messenger.fj) this.f35199s.f12051i.get(i7)) == null || (storyItem = fjVar.f24078l) == null) {
            return null;
        }
        return org.telegram.messenger.gd.e0(storyItem.date, true);
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
        if (!this.h && (h6Var = this.f35199s) != null) {
            if (h6Var instanceof fi.a6) {
                it0 it0Var = this.G;
                TLRPC.User c22 = org.telegram.messenger.mp.u1(it0Var.f36166y1.getCurrentAccount()).c2(Long.valueOf(it0Var.f36130m1));
                if (c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < h6Var.f12051i.size()) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f35199s.f12051i.get(i7);
                fi.h6 h6Var2 = this.f35199s;
                if (h6Var2.f12049f > 0) {
                    return true;
                }
                return h6Var2.m(fjVar.e1());
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
        fi.h6 h6Var = this.f35199s;
        if (h6Var != null && !this.h) {
            it0 it0Var = this.G;
            boolean z10 = it0Var.f36136o1;
            ds0[] ds0VarArr = it0Var.f36133n0;
            int[] iArr = it0Var.f36139p1;
            if ((!z10 || (it0Var.n1 && h6Var.g() > 1)) && this.f35199s.g() > 0 && !it0Var.I0()) {
                boolean z11 = false;
                if (this.f35199s.g() < 5) {
                    iArr[1] = this.f35199s.g();
                    if (ds0VarArr != null && (ds0Var3 = ds0VarArr[0]) != null && (ds0Var4 = ds0VarArr[1]) != null && ds0Var3.h != null && ds0Var4.h != null) {
                        it0Var.B1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    it0Var.n1 = z11;
                } else if (it0Var.n1) {
                    it0Var.n1 = false;
                    iArr[1] = Math.max(2, org.telegram.messenger.bz.f23327u1);
                    if (ds0VarArr != null && (ds0Var = ds0VarArr[0]) != null && (ds0Var2 = ds0VarArr[1]) != null && ds0Var.h != null && ds0Var2.h != null) {
                        it0Var.B1(false);
                    }
                }
                it0Var.f36136o1 = true;
            }
        }
    }

    public final int O() {
        it0 it0Var = this.G;
        or0 or0Var = it0Var.K;
        int[] iArr = it0Var.f36139p1;
        if (this == or0Var) {
            return iArr[0];
        }
        if (it0.x(it0Var, this) != -1) {
            return iArr[1];
        }
        return it0Var.f36153t1;
    }

    public final void P() {
        if (this.f35199s == null) {
            return;
        }
        int O = O();
        this.f35199s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int b() {
        int i7 = 0;
        if (this.f35199s == null) {
            return 0;
        }
        int size = this.f35198r.size();
        if (!this.f35199s.l() || !this.G.t0()) {
            i7 = this.f35199s.g();
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
        if (this.f35199s != null) {
            it0 it0Var = this.G;
            if (it0Var.B0()) {
                ArrayList arrayList = this.f35198r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.mp.u1(this.f35199s.f12047c).R1().F(it0Var.f36130m1);
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
        if (this.f35199s != null && f1Var.f59249f == 19) {
            View view = f1Var.f59245a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                o7Var.f31267e0 = true;
                ArrayList arrayList = this.f35198r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    fi.o6 o6Var = (fi.o6) arrayList.get(i7);
                    o7Var.f31270g0 = false;
                    if (o6Var.L == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = o6Var.f12335a;
                        int i10 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.f28731id = i10;
                        tL_storyItem.attachPath = o6Var.f12339f;
                        org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(this.f35199s.f12047c, tL_storyItem);
                        o6Var.L = fjVar;
                        fjVar.f24082m = o6Var;
                    }
                    o7Var.k(o6Var.L, O(), false);
                    o7Var.f31267e0 = true;
                    o7Var.setReorder(false);
                    o7Var.i(false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                if (size >= 0 && size < this.f35199s.f12051i.size()) {
                    org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) this.f35199s.f12051i.get(size);
                    if (fjVar2 != null && this.f35199s.m(fjVar2.e1())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o7Var.f31270g0 = z10;
                    it0 it0Var = this.G;
                    if (!it0Var.B0() && !o7Var.f31270g0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    o7Var.setReorder(z11);
                    o7Var.h = it0Var.G0();
                    o7Var.k(fjVar2, O(), false);
                    if (it0Var.F1 && fjVar2 != null) {
                        SparseArray[] sparseArrayArr = it0Var.f36101c1;
                        if (org.telegram.messenger.fj.B0(fjVar2.f24073k) == it0Var.f36130m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(fjVar2.e1()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        o7Var.i(z12, true);
                    } else {
                        o7Var.i(false, false);
                    }
                    o7Var.l(this.f35202y, false);
                    return;
                }
                o7Var.f31270g0 = false;
                o7Var.k(null, O(), false);
                o7Var.f31267e0 = true;
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        v4.f1 x10 = super.x(viewGroup, i7);
        View view = x10.f59245a;
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).f31267e0 = true;
        }
        return x10;
    }

    public ft0(it0 it0Var, Context context, int i7, boolean z10) {
        super(it0Var, context);
        int i10;
        TLRPC.User c22;
        this.G = it0Var;
        this.f35198r = new ArrayList();
        this.E = new ArrayList();
        this.h = z10;
        this.f35197n = i7;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
        long j3 = it0Var.f36130m1;
        int currentAccount = g2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(it0Var.getStoriesHashtag())) {
            if (it0Var.X1 == null) {
                it0Var.X1 = new fi.b6(currentAccount, TextUtils.isEmpty(it0Var.getStoriesHashtagUsername()) ? null : it0Var.getStoriesHashtagUsername(), it0Var.getStoriesHashtag());
            }
            this.f35199s = it0Var.X1;
        } else if (it0Var.getStoriesArea() != null) {
            if (it0Var.X1 == null) {
                it0Var.X1 = new fi.b6(currentAccount, it0Var.getStoriesArea());
            }
            this.f35199s = it0Var.X1;
        } else if ((z10 && !it0Var.I0()) || (!z10 && it0Var.A0())) {
            this.f35199s = null;
        } else {
            int i11 = 1;
            boolean z11 = j3 > 0 && (c22 = org.telegram.messenger.mp.u1(currentAccount).c2(Long.valueOf(j3))) != null && c22.bot;
            if (i7 > 0) {
                this.f35199s = g2Var.getMessagesController().R1().A(0, i7, it0Var.f36130m1, true);
            } else {
                fi.p6 R1 = g2Var.getMessagesController().R1();
                long j10 = it0Var.f36130m1;
                if (z11) {
                    i11 = 4;
                } else if (!z10) {
                    i10 = 0;
                    this.f35199s = R1.A(i10, -1, j10, true);
                }
                i10 = i11;
                this.f35199s = R1.A(i10, -1, j10, true);
            }
        }
        fi.h6 h6Var = this.f35199s;
        if (h6Var != null) {
            this.f35200w = h6Var.o();
            this.f35201x = new dt0(this, g2Var.getMessagesController().R1(), it0Var.f36130m1, this.f35199s.f12047c);
        }
        N();
    }

    @Override
    public final int L(int i7) {
        return i7;
    }
}
