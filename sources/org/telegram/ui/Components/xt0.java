package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class xt0 extends ut0 {
    public final ArrayList D;
    public boolean E;
    public final au0 F;
    public final boolean h;
    public final int f32633n;
    public final ArrayList f32634r;
    public th.x4 f32635s;
    public final int f32636w;
    public final vt0 f32637x;
    public boolean f32638y;

    public xt0(au0 au0Var, Context context, boolean z10) {
        this(au0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        org.telegram.messenger.kj kjVar;
        TL_stories.StoryItem storyItem;
        th.x4 x4Var = this.f32635s;
        if (x4Var == null || i10 < 0 || i10 >= x4Var.f49650i.size() || (kjVar = (org.telegram.messenger.kj) this.f32635s.f49650i.get(i10)) == null || (storyItem = kjVar.f16694l) == null) {
            return null;
        }
        return org.telegram.messenger.dd.e0(storyItem.date, true);
    }

    @Override
    public final void I() {
        int i10;
        if (this.h) {
            i10 = 9;
        } else {
            i10 = 8;
        }
        this.F.n1(i10, true);
    }

    public final boolean M(int i10) {
        th.x4 x4Var;
        if (!this.h && (x4Var = this.f32635s) != null) {
            if (x4Var instanceof th.q4) {
                au0 au0Var = this.F;
                TLRPC.User Z1 = org.telegram.messenger.wp.r1(au0Var.f24568x1.getCurrentAccount()).Z1(Long.valueOf(au0Var.l1));
                if (Z1 != null && Z1.bot && Z1.bot_has_main_app && Z1.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < x4Var.f49650i.size()) {
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) this.f32635s.f49650i.get(i10);
                th.x4 x4Var2 = this.f32635s;
                if (x4Var2.f49648f > 0) {
                    return true;
                }
                return x4Var2.m(kjVar.f1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        ts0 ts0Var;
        ts0 ts0Var2;
        ts0 ts0Var3;
        ts0 ts0Var4;
        th.x4 x4Var = this.f32635s;
        if (x4Var != null && !this.h) {
            au0 au0Var = this.F;
            boolean z10 = au0Var.f24539n1;
            ts0[] ts0VarArr = au0Var.m0;
            int[] iArr = au0Var.f24542o1;
            if ((!z10 || (au0Var.f24535m1 && x4Var.g() > 1)) && this.f32635s.g() > 0 && !au0Var.F0()) {
                boolean z11 = false;
                if (this.f32635s.g() < 5) {
                    iArr[1] = this.f32635s.g();
                    if (ts0VarArr != null && (ts0Var3 = ts0VarArr[0]) != null && (ts0Var4 = ts0VarArr[1]) != null && ts0Var3.h != null && ts0Var4.h != null) {
                        au0Var.x1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    au0Var.f24535m1 = z11;
                } else if (au0Var.f24535m1) {
                    au0Var.f24535m1 = false;
                    iArr[1] = Math.max(2, org.telegram.messenger.uz.f18557u1);
                    if (ts0VarArr != null && (ts0Var = ts0VarArr[0]) != null && (ts0Var2 = ts0VarArr[1]) != null && ts0Var.h != null && ts0Var2.h != null) {
                        au0Var.x1(false);
                    }
                }
                au0Var.f24539n1 = true;
            }
        }
    }

    public final int O() {
        au0 au0Var = this.F;
        fs0 fs0Var = au0Var.J;
        int[] iArr = au0Var.f24542o1;
        if (this == fs0Var) {
            return iArr[0];
        }
        if (au0.v(au0Var, this) != -1) {
            return iArr[1];
        }
        return au0Var.f24556s1;
    }

    public final void P() {
        if (this.f32635s == null) {
            return;
        }
        int O = O();
        this.f32635s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int b() {
        int i10 = 0;
        if (this.f32635s == null) {
            return 0;
        }
        int size = this.f32634r.size();
        if (!this.f32635s.l() || !this.F.s0()) {
            i10 = this.f32635s.g();
        }
        return size + i10;
    }

    @Override
    public final int d(int i10) {
        return 19;
    }

    @Override
    public final int e() {
        return b();
    }

    @Override
    public void f() {
        if (this.f32635s != null) {
            au0 au0Var = this.F;
            if (au0Var.A0()) {
                ArrayList arrayList = this.f32634r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.wp.r1(this.f32635s.f49647c).O1().F(au0Var.l1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        if (this.f32635s != null && c1Var.f47912f == 19) {
            View view = c1Var.f47909a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                s7Var.f23024d0 = true;
                ArrayList arrayList = this.f32634r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    th.d5 d5Var = (th.d5) arrayList.get(i10);
                    s7Var.f23027f0 = false;
                    if (d5Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = d5Var.f48890a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20032id = i11;
                        tL_storyItem.attachPath = d5Var.f48893f;
                        org.telegram.messenger.kj kjVar = new org.telegram.messenger.kj(this.f32635s.f49647c, tL_storyItem);
                        d5Var.K = kjVar;
                        kjVar.f16697m = d5Var;
                    }
                    s7Var.k(d5Var.K, O(), false);
                    s7Var.f23024d0 = true;
                    s7Var.setReorder(false);
                    s7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f32635s.f49650i.size()) {
                    org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) this.f32635s.f49650i.get(size);
                    if (kjVar2 != null && this.f32635s.m(kjVar2.f1())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s7Var.f23027f0 = z10;
                    au0 au0Var = this.F;
                    if (!au0Var.A0() && !s7Var.f23027f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    s7Var.setReorder(z11);
                    s7Var.h = au0Var.D0();
                    s7Var.k(kjVar2, O(), false);
                    if (au0Var.E1 && kjVar2 != null) {
                        SparseArray[] sparseArrayArr = au0Var.f24502b1;
                        if (org.telegram.messenger.kj.B0(kjVar2.f16690k) == au0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(kjVar2.f1()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        s7Var.i(z12, true);
                    } else {
                        s7Var.i(false, false);
                    }
                    s7Var.l(this.f32638y, false);
                    return;
                }
                s7Var.f23027f0 = false;
                s7Var.k(null, O(), false);
                s7Var.f23024d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        s4.c1 w9 = super.w(viewGroup, i10);
        View view = w9.f47909a;
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).f23024d0 = true;
        }
        return w9;
    }

    public xt0(au0 au0Var, Context context, int i10, boolean z10) {
        super(au0Var, context);
        int i11;
        TLRPC.User Z1;
        this.F = au0Var;
        this.f32634r = new ArrayList();
        this.D = new ArrayList();
        this.h = z10;
        this.f32633n = i10;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
        long j10 = au0Var.l1;
        int currentAccount = k2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(au0Var.getStoriesHashtag())) {
            if (au0Var.W1 == null) {
                au0Var.W1 = new th.r4(currentAccount, TextUtils.isEmpty(au0Var.getStoriesHashtagUsername()) ? null : au0Var.getStoriesHashtagUsername(), au0Var.getStoriesHashtag());
            }
            this.f32635s = au0Var.W1;
        } else if (au0Var.getStoriesArea() != null) {
            if (au0Var.W1 == null) {
                au0Var.W1 = new th.r4(currentAccount, au0Var.getStoriesArea());
            }
            this.f32635s = au0Var.W1;
        } else if ((z10 && !au0Var.F0()) || (!z10 && au0Var.z0())) {
            this.f32635s = null;
        } else {
            int i12 = 1;
            boolean z11 = j10 > 0 && (Z1 = org.telegram.messenger.wp.r1(currentAccount).Z1(Long.valueOf(j10))) != null && Z1.bot;
            if (i10 > 0) {
                this.f32635s = k2Var.getMessagesController().O1().A(0, i10, au0Var.l1, true);
            } else {
                th.e5 O1 = k2Var.getMessagesController().O1();
                long j11 = au0Var.l1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f32635s = O1.A(i11, -1, j11, true);
                }
                i11 = i12;
                this.f32635s = O1.A(i11, -1, j11, true);
            }
        }
        th.x4 x4Var = this.f32635s;
        if (x4Var != null) {
            this.f32636w = x4Var.o();
            this.f32637x = new vt0(this, k2Var.getMessagesController().O1(), au0Var.l1, this.f32635s.f49647c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}
