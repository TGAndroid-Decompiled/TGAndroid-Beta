package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class us0 extends rs0 {
    public final ArrayList D;
    public boolean E;
    public final xs0 F;
    public final boolean h;
    public final int f38730n;
    public final ArrayList f38731r;
    public di.q6 f38732s;
    public final int f38733w;
    public final ss0 f38734x;
    public boolean f38735y;

    public us0(xs0 xs0Var, Context context, boolean z9) {
        this(xs0Var, context, 0, z9);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final String F(int i7) {
        org.telegram.messenger.ij ijVar;
        TL_stories.StoryItem storyItem;
        di.q6 q6Var = this.f38732s;
        if (q6Var == null || i7 < 0 || i7 >= q6Var.f9643i.size() || (ijVar = (org.telegram.messenger.ij) this.f38732s.f9643i.get(i7)) == null || (storyItem = ijVar.f23266l) == null) {
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
        this.F.p1(i7, true);
    }

    public final boolean M(int i7) {
        di.q6 q6Var;
        if (!this.h && (q6Var = this.f38732s) != null) {
            if (q6Var instanceof di.j6) {
                xs0 xs0Var = this.F;
                TLRPC.User a22 = org.telegram.messenger.qp.s1(xs0Var.f40461x1.getCurrentAccount()).a2(Long.valueOf(xs0Var.l1));
                if (a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < q6Var.f9643i.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f38732s.f9643i.get(i7);
                di.q6 q6Var2 = this.f38732s;
                if (q6Var2.f9641f > 0) {
                    return true;
                }
                return q6Var2.m(ijVar.f1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        sr0 sr0Var;
        sr0 sr0Var2;
        sr0 sr0Var3;
        sr0 sr0Var4;
        di.q6 q6Var = this.f38732s;
        if (q6Var != null && !this.h) {
            xs0 xs0Var = this.F;
            boolean z9 = xs0Var.n1;
            sr0[] sr0VarArr = xs0Var.m0;
            int[] iArr = xs0Var.f40435o1;
            if ((!z9 || (xs0Var.f40429m1 && q6Var.g() > 1)) && this.f38732s.g() > 0 && !xs0Var.H0()) {
                boolean z10 = false;
                if (this.f38732s.g() < 5) {
                    iArr[1] = this.f38732s.g();
                    if (sr0VarArr != null && (sr0Var3 = sr0VarArr[0]) != null && (sr0Var4 = sr0VarArr[1]) != null && sr0Var3.h != null && sr0Var4.h != null) {
                        xs0Var.z1(false);
                    }
                    if (iArr[1] == 1) {
                        z10 = true;
                    }
                    xs0Var.f40429m1 = z10;
                } else if (xs0Var.f40429m1) {
                    xs0Var.f40429m1 = false;
                    iArr[1] = Math.max(2, org.telegram.messenger.iz.f23442u1);
                    if (sr0VarArr != null && (sr0Var = sr0VarArr[0]) != null && (sr0Var2 = sr0VarArr[1]) != null && sr0Var.h != null && sr0Var2.h != null) {
                        xs0Var.z1(false);
                    }
                }
                xs0Var.n1 = true;
            }
        }
    }

    public final int O() {
        xs0 xs0Var = this.F;
        dr0 dr0Var = xs0Var.J;
        int[] iArr = xs0Var.f40435o1;
        if (this == dr0Var) {
            return iArr[0];
        }
        if (xs0.x(xs0Var, this) != -1) {
            return iArr[1];
        }
        return xs0Var.f40449s1;
    }

    public final void P() {
        if (this.f38732s == null) {
            return;
        }
        int O = O();
        this.f38732s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int b() {
        int i7 = 0;
        if (this.f38732s == null) {
            return 0;
        }
        int size = this.f38731r.size();
        if (!this.f38732s.l() || !this.F.t0()) {
            i7 = this.f38732s.g();
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
        if (this.f38732s != null) {
            xs0 xs0Var = this.F;
            if (xs0Var.B0()) {
                ArrayList arrayList = this.f38731r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.qp.s1(this.f38732s.f9639c).P1().F(xs0Var.l1);
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
        if (this.f38732s != null && d1Var.f57048f == 19) {
            View view = d1Var.f57044a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                o7Var.f29666d0 = true;
                ArrayList arrayList = this.f38731r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    di.x6 x6Var = (di.x6) arrayList.get(i7);
                    o7Var.f29670f0 = false;
                    if (x6Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = x6Var.f9928a;
                        int i10 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.f27195id = i10;
                        tL_storyItem.attachPath = x6Var.f9932f;
                        org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(this.f38732s.f9639c, tL_storyItem);
                        x6Var.K = ijVar;
                        ijVar.f23269m = x6Var;
                    }
                    o7Var.k(x6Var.K, O(), false);
                    o7Var.f29666d0 = true;
                    o7Var.setReorder(false);
                    o7Var.i(false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                if (size >= 0 && size < this.f38732s.f9643i.size()) {
                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.f38732s.f9643i.get(size);
                    if (ijVar2 != null && this.f38732s.m(ijVar2.f1())) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    o7Var.f29670f0 = z9;
                    xs0 xs0Var = this.F;
                    if (!xs0Var.B0() && !o7Var.f29670f0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    o7Var.setReorder(z10);
                    o7Var.h = xs0Var.F0();
                    o7Var.k(ijVar2, O(), false);
                    if (xs0Var.E1 && ijVar2 != null) {
                        SparseArray[] sparseArrayArr = xs0Var.f40396b1;
                        if (org.telegram.messenger.ij.B0(ijVar2.f23262k) == xs0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(ijVar2.f1()) >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        o7Var.i(z11, true);
                    } else {
                        o7Var.i(false, false);
                    }
                    o7Var.l(this.f38735y, false);
                    return;
                }
                o7Var.f29670f0 = false;
                o7Var.k(null, O(), false);
                o7Var.f29666d0 = true;
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        v4.d1 x10 = super.x(viewGroup, i7);
        View view = x10.f57044a;
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).f29666d0 = true;
        }
        return x10;
    }

    public us0(xs0 xs0Var, Context context, int i7, boolean z9) {
        super(xs0Var, context);
        int i10;
        TLRPC.User a22;
        this.F = xs0Var;
        this.f38731r = new ArrayList();
        this.D = new ArrayList();
        this.h = z9;
        this.f38730n = i7;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40461x1;
        long j3 = xs0Var.l1;
        int currentAccount = f2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(xs0Var.getStoriesHashtag())) {
            if (xs0Var.W1 == null) {
                xs0Var.W1 = new di.k6(currentAccount, TextUtils.isEmpty(xs0Var.getStoriesHashtagUsername()) ? null : xs0Var.getStoriesHashtagUsername(), xs0Var.getStoriesHashtag());
            }
            this.f38732s = xs0Var.W1;
        } else if (xs0Var.getStoriesArea() != null) {
            if (xs0Var.W1 == null) {
                xs0Var.W1 = new di.k6(currentAccount, xs0Var.getStoriesArea());
            }
            this.f38732s = xs0Var.W1;
        } else if ((z9 && !xs0Var.H0()) || (!z9 && xs0Var.A0())) {
            this.f38732s = null;
        } else {
            int i11 = 1;
            boolean z10 = j3 > 0 && (a22 = org.telegram.messenger.qp.s1(currentAccount).a2(Long.valueOf(j3))) != null && a22.bot;
            if (i7 > 0) {
                this.f38732s = f2Var.getMessagesController().P1().A(0, i7, xs0Var.l1, true);
            } else {
                di.y6 P1 = f2Var.getMessagesController().P1();
                long j10 = xs0Var.l1;
                if (z10) {
                    i11 = 4;
                } else if (!z9) {
                    i10 = 0;
                    this.f38732s = P1.A(i10, -1, j10, true);
                }
                i10 = i11;
                this.f38732s = P1.A(i10, -1, j10, true);
            }
        }
        di.q6 q6Var = this.f38732s;
        if (q6Var != null) {
            this.f38733w = q6Var.o();
            this.f38734x = new ss0(this, f2Var.getMessagesController().P1(), xs0Var.l1, this.f38732s.f9639c);
        }
        N();
    }

    @Override
    public final int L(int i7) {
        return i7;
    }
}
