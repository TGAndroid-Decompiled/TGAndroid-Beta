package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class wt0 extends tt0 {
    public final ArrayList D;
    public boolean E;
    public final zt0 F;
    public final boolean h;
    public final int f32249n;
    public final ArrayList f32250r;
    public th.x4 f32251s;
    public final int f32252w;
    public final ut0 f32253x;
    public boolean f32254y;

    public wt0(zt0 zt0Var, Context context, boolean z10) {
        this(zt0Var, context, 0, z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        org.telegram.messenger.jj jjVar;
        TL_stories.StoryItem storyItem;
        th.x4 x4Var = this.f32251s;
        if (x4Var == null || i10 < 0 || i10 >= x4Var.f49636i.size() || (jjVar = (org.telegram.messenger.jj) this.f32251s.f49636i.get(i10)) == null || (storyItem = jjVar.f16341l) == null) {
            return null;
        }
        return org.telegram.messenger.cd.e0(storyItem.date, true);
    }

    @Override
    public final void I() {
        int i10;
        if (this.h) {
            i10 = 9;
        } else {
            i10 = 8;
        }
        this.F.m1(i10, true);
    }

    public final boolean M(int i10) {
        th.x4 x4Var;
        if (!this.h && (x4Var = this.f32251s) != null) {
            if (x4Var instanceof th.q4) {
                zt0 zt0Var = this.F;
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(zt0Var.f33240x1.getCurrentAccount()).Z1(Long.valueOf(zt0Var.l1));
                if (Z1 != null && Z1.bot && Z1.bot_has_main_app && Z1.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < x4Var.f49636i.size()) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.f32251s.f49636i.get(i10);
                th.x4 x4Var2 = this.f32251s;
                if (x4Var2.f49634f > 0) {
                    return true;
                }
                return x4Var2.m(jjVar.f1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        ss0 ss0Var;
        ss0 ss0Var2;
        ss0 ss0Var3;
        ss0 ss0Var4;
        th.x4 x4Var = this.f32251s;
        if (x4Var != null && !this.h) {
            zt0 zt0Var = this.F;
            boolean z10 = zt0Var.f33211n1;
            ss0[] ss0VarArr = zt0Var.m0;
            int[] iArr = zt0Var.f33214o1;
            if ((!z10 || (zt0Var.f33207m1 && x4Var.g() > 1)) && this.f32251s.g() > 0 && !zt0Var.E0()) {
                boolean z11 = false;
                if (this.f32251s.g() < 5) {
                    iArr[1] = this.f32251s.g();
                    if (ss0VarArr != null && (ss0Var3 = ss0VarArr[0]) != null && (ss0Var4 = ss0VarArr[1]) != null && ss0Var3.h != null && ss0Var4.h != null) {
                        zt0Var.w1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    zt0Var.f33207m1 = z11;
                } else if (zt0Var.f33207m1) {
                    zt0Var.f33207m1 = false;
                    iArr[1] = Math.max(2, org.telegram.messenger.tz.f18188u1);
                    if (ss0VarArr != null && (ss0Var = ss0VarArr[0]) != null && (ss0Var2 = ss0VarArr[1]) != null && ss0Var.h != null && ss0Var2.h != null) {
                        zt0Var.w1(false);
                    }
                }
                zt0Var.f33211n1 = true;
            }
        }
    }

    public final int O() {
        zt0 zt0Var = this.F;
        es0 es0Var = zt0Var.J;
        int[] iArr = zt0Var.f33214o1;
        if (this == es0Var) {
            return iArr[0];
        }
        if (zt0.v(zt0Var, this) != -1) {
            return iArr[1];
        }
        return zt0Var.f33228s1;
    }

    public final void P() {
        if (this.f32251s == null) {
            return;
        }
        int O = O();
        this.f32251s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int b() {
        int i10 = 0;
        if (this.f32251s == null) {
            return 0;
        }
        int size = this.f32250r.size();
        if (!this.f32251s.l() || !this.F.r0()) {
            i10 = this.f32251s.g();
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
        if (this.f32251s != null) {
            zt0 zt0Var = this.F;
            if (zt0Var.z0()) {
                ArrayList arrayList = this.f32250r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.vp.r1(this.f32251s.f49633c).O1().F(zt0Var.l1);
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
        if (this.f32251s != null && c1Var.f47901f == 19) {
            View view = c1Var.f47898a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                s7Var.f23023d0 = true;
                ArrayList arrayList = this.f32250r;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    th.d5 d5Var = (th.d5) arrayList.get(i10);
                    s7Var.f23026f0 = false;
                    if (d5Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = d5Var.f48876a;
                        int i11 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i11;
                        tL_storyItem.f20031id = i11;
                        tL_storyItem.attachPath = d5Var.f48879f;
                        org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(this.f32251s.f49633c, tL_storyItem);
                        d5Var.K = jjVar;
                        jjVar.f16344m = d5Var;
                    }
                    s7Var.k(d5Var.K, O(), false);
                    s7Var.f23023d0 = true;
                    s7Var.setReorder(false);
                    s7Var.i(false, false);
                    return;
                }
                int size = i10 - arrayList.size();
                if (size >= 0 && size < this.f32251s.f49636i.size()) {
                    org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) this.f32251s.f49636i.get(size);
                    if (jjVar2 != null && this.f32251s.m(jjVar2.f1())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s7Var.f23026f0 = z10;
                    zt0 zt0Var = this.F;
                    if (!zt0Var.z0() && !s7Var.f23026f0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    s7Var.setReorder(z11);
                    s7Var.h = zt0Var.C0();
                    s7Var.k(jjVar2, O(), false);
                    if (zt0Var.E1 && jjVar2 != null) {
                        SparseArray[] sparseArrayArr = zt0Var.f33174b1;
                        if (org.telegram.messenger.jj.B0(jjVar2.f16337k) == zt0Var.l1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(jjVar2.f1()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        s7Var.i(z12, true);
                    } else {
                        s7Var.i(false, false);
                    }
                    s7Var.l(this.f32254y, false);
                    return;
                }
                s7Var.f23026f0 = false;
                s7Var.k(null, O(), false);
                s7Var.f23023d0 = true;
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        s4.c1 w9 = super.w(viewGroup, i10);
        View view = w9.f47898a;
        if (view instanceof org.telegram.ui.Cells.s7) {
            ((org.telegram.ui.Cells.s7) view).f23023d0 = true;
        }
        return w9;
    }

    public wt0(zt0 zt0Var, Context context, int i10, boolean z10) {
        super(zt0Var, context);
        int i11;
        TLRPC.User Z1;
        this.F = zt0Var;
        this.f32250r = new ArrayList();
        this.D = new ArrayList();
        this.h = z10;
        this.f32249n = i10;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
        long j10 = zt0Var.l1;
        int currentAccount = k2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(zt0Var.getStoriesHashtag())) {
            if (zt0Var.W1 == null) {
                zt0Var.W1 = new th.r4(currentAccount, TextUtils.isEmpty(zt0Var.getStoriesHashtagUsername()) ? null : zt0Var.getStoriesHashtagUsername(), zt0Var.getStoriesHashtag());
            }
            this.f32251s = zt0Var.W1;
        } else if (zt0Var.getStoriesArea() != null) {
            if (zt0Var.W1 == null) {
                zt0Var.W1 = new th.r4(currentAccount, zt0Var.getStoriesArea());
            }
            this.f32251s = zt0Var.W1;
        } else if ((z10 && !zt0Var.E0()) || (!z10 && zt0Var.y0())) {
            this.f32251s = null;
        } else {
            int i12 = 1;
            boolean z11 = j10 > 0 && (Z1 = org.telegram.messenger.vp.r1(currentAccount).Z1(Long.valueOf(j10))) != null && Z1.bot;
            if (i10 > 0) {
                this.f32251s = k2Var.getMessagesController().O1().A(0, i10, zt0Var.l1, true);
            } else {
                th.e5 O1 = k2Var.getMessagesController().O1();
                long j11 = zt0Var.l1;
                if (z11) {
                    i12 = 4;
                } else if (!z10) {
                    i11 = 0;
                    this.f32251s = O1.A(i11, -1, j11, true);
                }
                i11 = i12;
                this.f32251s = O1.A(i11, -1, j11, true);
            }
        }
        th.x4 x4Var = this.f32251s;
        if (x4Var != null) {
            this.f32252w = x4Var.o();
            this.f32253x = new ut0(this, k2Var.getMessagesController().O1(), zt0Var.l1, this.f32251s.f49633c);
        }
        N();
    }

    @Override
    public final int L(int i10) {
        return i10;
    }
}
