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
    public final ArrayList D;
    public boolean E;
    public final ys0 F;
    public final boolean h;
    public final int f39728n;
    public final ArrayList f39729r;
    public di.r6 f39730s;
    public final int f39731w;
    public final ts0 f39732x;
    public boolean f39733y;

    public vs0(ys0 ys0Var, Context context, boolean z9) {
        this(ys0Var, context, 0, z9);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final String F(int i7) {
        org.telegram.messenger.ij ijVar;
        TL_stories.StoryItem storyItem;
        di.r6 r6Var = this.f39730s;
        if (r6Var == null || i7 < 0 || i7 >= r6Var.f9699i.size() || (ijVar = (org.telegram.messenger.ij) this.f39730s.f9699i.get(i7)) == null || (storyItem = ijVar.f23270l) == null) {
            return null;
        }
        return org.telegram.messenger.id.e0(storyItem.date, true);
    }

    @Override
    public final void I() {
        int i7;
        if (this.h) {
            i7 = 9;
        } else {
            i7 = 8;
        }
        this.F.r1(i7, true);
    }

    public final boolean M(int i7) {
        di.r6 r6Var;
        if (!this.h && (r6Var = this.f39730s) != null) {
            if (r6Var instanceof di.k6) {
                ys0 ys0Var = this.F;
                TLRPC.User a22 = org.telegram.messenger.qp.s1(ys0Var.f40719x1.getCurrentAccount()).a2(Long.valueOf(ys0Var.l1));
                if (a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < r6Var.f9699i.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f39730s.f9699i.get(i7);
                di.r6 r6Var2 = this.f39730s;
                if (r6Var2.f9697f > 0) {
                    return true;
                }
                return r6Var2.m(ijVar.e1());
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
        di.r6 r6Var = this.f39730s;
        if (r6Var != null && !this.h) {
            ys0 ys0Var = this.F;
            boolean z9 = ys0Var.n1;
            tr0[] tr0VarArr = ys0Var.m0;
            int[] iArr = ys0Var.f40693o1;
            if ((!z9 || (ys0Var.f40687m1 && r6Var.g() > 1)) && this.f39730s.g() > 0 && !ys0Var.I0()) {
                boolean z10 = false;
                if (this.f39730s.g() < 5) {
                    iArr[1] = this.f39730s.g();
                    if (tr0VarArr != null && (tr0Var3 = tr0VarArr[0]) != null && (tr0Var4 = tr0VarArr[1]) != null && tr0Var3.h != null && tr0Var4.h != null) {
                        ys0Var.B1(false);
                    }
                    if (iArr[1] == 1) {
                        z10 = true;
                    }
                    ys0Var.f40687m1 = z10;
                } else if (ys0Var.f40687m1) {
                    ys0Var.f40687m1 = false;
                    iArr[1] = Math.max(2, org.telegram.messenger.iz.f23446u1);
                    if (tr0VarArr != null && (tr0Var = tr0VarArr[0]) != null && (tr0Var2 = tr0VarArr[1]) != null && tr0Var.h != null && tr0Var2.h != null) {
                        ys0Var.B1(false);
                    }
                }
                ys0Var.n1 = true;
            }
        }
    }

    public final int O() {
        ys0 ys0Var = this.F;
        er0 er0Var = ys0Var.J;
        int[] iArr = ys0Var.f40693o1;
        if (this == er0Var) {
            return iArr[0];
        }
        if (ys0.x(ys0Var, this) != -1) {
            return iArr[1];
        }
        return ys0Var.f40707s1;
    }

    public final void P() {
        if (this.f39730s == null) {
            return;
        }
        int O = O();
        this.f39730s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int b() {
        int i7 = 0;
        if (this.f39730s == null) {
            return 0;
        }
        int size = this.f39729r.size();
        if (!this.f39730s.l() || !this.F.t0()) {
            i7 = this.f39730s.g();
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
        if (this.f39730s != null) {
            ys0 ys0Var = this.F;
            if (ys0Var.B0()) {
                ArrayList arrayList = this.f39729r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.qp.s1(this.f39730s.f9695c).P1().F(ys0Var.l1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        char c10;
        boolean z11;
        if (this.f39730s != null && d1Var.f57056f == 19) {
            View view = d1Var.f57052a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                o7Var.f29681d0 = true;
                ArrayList arrayList = this.f39729r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    di.y6 y6Var = (di.y6) arrayList.get(i7);
                    o7Var.f29685f0 = false;
                    if (y6Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = y6Var.f9963a;
                        int i10 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.f27199id = i10;
                        tL_storyItem.attachPath = y6Var.f9967f;
                        org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(this.f39730s.f9695c, tL_storyItem);
                        y6Var.K = ijVar;
                        ijVar.f23273m = y6Var;
                    }
                    o7Var.k(y6Var.K, O(), false);
                    o7Var.f29681d0 = true;
                    o7Var.setReorder(false);
                    o7Var.i(false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                if (size >= 0 && size < this.f39730s.f9699i.size()) {
                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.f39730s.f9699i.get(size);
                    if (ijVar2 != null && this.f39730s.m(ijVar2.e1())) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    o7Var.f29685f0 = z9;
                    ys0 ys0Var = this.F;
                    if (!ys0Var.B0() && !o7Var.f29685f0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    o7Var.setReorder(z10);
                    o7Var.h = ys0Var.G0();
                    o7Var.k(ijVar2, O(), false);
                    if (ys0Var.E1 && ijVar2 != null) {
                        SparseArray[] sparseArrayArr = ys0Var.f40654b1;
                        if (org.telegram.messenger.ij.B0(ijVar2.f23266k) == ys0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(ijVar2.e1()) >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        o7Var.i(z11, true);
                    } else {
                        o7Var.i(false, false);
                    }
                    o7Var.l(this.f39733y, false);
                    return;
                }
                o7Var.f29685f0 = false;
                o7Var.k(null, O(), false);
                o7Var.f29681d0 = true;
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        v4.d1 x10 = super.x(viewGroup, i7);
        View view = x10.f57052a;
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).f29681d0 = true;
        }
        return x10;
    }

    public vs0(ys0 ys0Var, Context context, int i7, boolean z9) {
        super(ys0Var, context);
        int i10;
        TLRPC.User a22;
        this.F = ys0Var;
        this.f39729r = new ArrayList();
        this.D = new ArrayList();
        this.h = z9;
        this.f39728n = i7;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
        long j3 = ys0Var.l1;
        int currentAccount = f2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(ys0Var.getStoriesHashtag())) {
            if (ys0Var.W1 == null) {
                ys0Var.W1 = new di.l6(currentAccount, TextUtils.isEmpty(ys0Var.getStoriesHashtagUsername()) ? null : ys0Var.getStoriesHashtagUsername(), ys0Var.getStoriesHashtag());
            }
            this.f39730s = ys0Var.W1;
        } else if (ys0Var.getStoriesArea() != null) {
            if (ys0Var.W1 == null) {
                ys0Var.W1 = new di.l6(currentAccount, ys0Var.getStoriesArea());
            }
            this.f39730s = ys0Var.W1;
        } else if ((z9 && !ys0Var.I0()) || (!z9 && ys0Var.A0())) {
            this.f39730s = null;
        } else {
            int i11 = 1;
            boolean z10 = j3 > 0 && (a22 = org.telegram.messenger.qp.s1(currentAccount).a2(Long.valueOf(j3))) != null && a22.bot;
            if (i7 > 0) {
                this.f39730s = f2Var.getMessagesController().P1().A(0, i7, ys0Var.l1, true);
            } else {
                di.z6 P1 = f2Var.getMessagesController().P1();
                long j10 = ys0Var.l1;
                if (z10) {
                    i11 = 4;
                } else if (!z9) {
                    i10 = 0;
                    this.f39730s = P1.A(i10, -1, j10, true);
                }
                i10 = i11;
                this.f39730s = P1.A(i10, -1, j10, true);
            }
        }
        di.r6 r6Var = this.f39730s;
        if (r6Var != null) {
            this.f39731w = r6Var.o();
            this.f39732x = new ts0(this, f2Var.getMessagesController().P1(), ys0Var.l1, this.f39730s.f9695c);
        }
        N();
    }

    @Override
    public final int L(int i7) {
        return i7;
    }
}
