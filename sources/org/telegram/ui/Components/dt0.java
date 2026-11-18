package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class dt0 extends at0 {
    public final ArrayList E;
    public boolean F;
    public final gt0 G;
    public final boolean h;
    public final int f34502n;
    public final ArrayList f34503r;
    public fi.h6 f34504s;
    public final int f34505w;
    public final bt0 f34506x;
    public boolean f34507y;

    public dt0(gt0 gt0Var, Context context, boolean z10) {
        this(gt0Var, context, 0, z10);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final String F(int i7) {
        org.telegram.messenger.fj fjVar;
        TL_stories.StoryItem storyItem;
        fi.h6 h6Var = this.f34504s;
        if (h6Var == null || i7 < 0 || i7 >= h6Var.f12045i.size() || (fjVar = (org.telegram.messenger.fj) this.f34504s.f12045i.get(i7)) == null || (storyItem = fjVar.f23970l) == null) {
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
        if (!this.h && (h6Var = this.f34504s) != null) {
            if (h6Var instanceof fi.z5) {
                gt0 gt0Var = this.G;
                TLRPC.User c22 = org.telegram.messenger.mp.u1(gt0Var.f35642y1.getCurrentAccount()).c2(Long.valueOf(gt0Var.f35606m1));
                if (c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < h6Var.f12045i.size()) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f34504s.f12045i.get(i7);
                fi.h6 h6Var2 = this.f34504s;
                if (h6Var2.f12043f > 0) {
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
        bs0 bs0Var;
        bs0 bs0Var2;
        bs0 bs0Var3;
        bs0 bs0Var4;
        fi.h6 h6Var = this.f34504s;
        if (h6Var != null && !this.h) {
            gt0 gt0Var = this.G;
            boolean z10 = gt0Var.f35612o1;
            bs0[] bs0VarArr = gt0Var.f35609n0;
            int[] iArr = gt0Var.f35615p1;
            if ((!z10 || (gt0Var.n1 && h6Var.g() > 1)) && this.f34504s.g() > 0 && !gt0Var.I0()) {
                boolean z11 = false;
                if (this.f34504s.g() < 5) {
                    iArr[1] = this.f34504s.g();
                    if (bs0VarArr != null && (bs0Var3 = bs0VarArr[0]) != null && (bs0Var4 = bs0VarArr[1]) != null && bs0Var3.h != null && bs0Var4.h != null) {
                        gt0Var.B1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    gt0Var.n1 = z11;
                } else if (gt0Var.n1) {
                    gt0Var.n1 = false;
                    iArr[1] = Math.max(2, org.telegram.messenger.bz.f23202u1);
                    if (bs0VarArr != null && (bs0Var = bs0VarArr[0]) != null && (bs0Var2 = bs0VarArr[1]) != null && bs0Var.h != null && bs0Var2.h != null) {
                        gt0Var.B1(false);
                    }
                }
                gt0Var.f35612o1 = true;
            }
        }
    }

    public final int O() {
        gt0 gt0Var = this.G;
        nr0 nr0Var = gt0Var.K;
        int[] iArr = gt0Var.f35615p1;
        if (this == nr0Var) {
            return iArr[0];
        }
        if (gt0.x(gt0Var, this) != -1) {
            return iArr[1];
        }
        return gt0Var.f35629t1;
    }

    public final void P() {
        if (this.f34504s == null) {
            return;
        }
        int O = O();
        this.f34504s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int b() {
        int i7 = 0;
        if (this.f34504s == null) {
            return 0;
        }
        int size = this.f34503r.size();
        if (!this.f34504s.l() || !this.G.t0()) {
            i7 = this.f34504s.g();
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
        if (this.f34504s != null) {
            gt0 gt0Var = this.G;
            if (gt0Var.B0()) {
                ArrayList arrayList = this.f34503r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.mp.u1(this.f34504s.f12041c).R1().F(gt0Var.f35606m1);
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
        if (this.f34504s != null && f1Var.f59127f == 19) {
            View view = f1Var.f59123a;
            if (view instanceof org.telegram.ui.Cells.p7) {
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                p7Var.f31230e0 = true;
                ArrayList arrayList = this.f34503r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    fi.o6 o6Var = (fi.o6) arrayList.get(i7);
                    p7Var.f31233g0 = false;
                    if (o6Var.L == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = o6Var.f12328a;
                        int i10 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.f28642id = i10;
                        tL_storyItem.attachPath = o6Var.f12332f;
                        org.telegram.messenger.fj fjVar = new org.telegram.messenger.fj(this.f34504s.f12041c, tL_storyItem);
                        o6Var.L = fjVar;
                        fjVar.f23974m = o6Var;
                    }
                    p7Var.k(o6Var.L, O(), false);
                    p7Var.f31230e0 = true;
                    p7Var.setReorder(false);
                    p7Var.i(false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                if (size >= 0 && size < this.f34504s.f12045i.size()) {
                    org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) this.f34504s.f12045i.get(size);
                    if (fjVar2 != null && this.f34504s.m(fjVar2.e1())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p7Var.f31233g0 = z10;
                    gt0 gt0Var = this.G;
                    if (!gt0Var.B0() && !p7Var.f31233g0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    p7Var.setReorder(z11);
                    p7Var.h = gt0Var.G0();
                    p7Var.k(fjVar2, O(), false);
                    if (gt0Var.F1 && fjVar2 != null) {
                        SparseArray[] sparseArrayArr = gt0Var.f35577c1;
                        if (org.telegram.messenger.fj.B0(fjVar2.f23965k) == gt0Var.f35606m1) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (sparseArrayArr[c10].indexOfKey(fjVar2.e1()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        p7Var.i(z12, true);
                    } else {
                        p7Var.i(false, false);
                    }
                    p7Var.l(this.f34507y, false);
                    return;
                }
                p7Var.f31233g0 = false;
                p7Var.k(null, O(), false);
                p7Var.f31230e0 = true;
            }
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        v4.f1 x10 = super.x(viewGroup, i7);
        View view = x10.f59123a;
        if (view instanceof org.telegram.ui.Cells.p7) {
            ((org.telegram.ui.Cells.p7) view).f31230e0 = true;
        }
        return x10;
    }

    public dt0(gt0 gt0Var, Context context, int i7, boolean z10) {
        super(gt0Var, context);
        int i10;
        TLRPC.User c22;
        this.G = gt0Var;
        this.f34503r = new ArrayList();
        this.E = new ArrayList();
        this.h = z10;
        this.f34502n = i7;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
        long j3 = gt0Var.f35606m1;
        int currentAccount = h2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(gt0Var.getStoriesHashtag())) {
            if (gt0Var.X1 == null) {
                gt0Var.X1 = new fi.b6(currentAccount, TextUtils.isEmpty(gt0Var.getStoriesHashtagUsername()) ? null : gt0Var.getStoriesHashtagUsername(), gt0Var.getStoriesHashtag());
            }
            this.f34504s = gt0Var.X1;
        } else if (gt0Var.getStoriesArea() != null) {
            if (gt0Var.X1 == null) {
                gt0Var.X1 = new fi.b6(currentAccount, gt0Var.getStoriesArea());
            }
            this.f34504s = gt0Var.X1;
        } else if ((z10 && !gt0Var.I0()) || (!z10 && gt0Var.A0())) {
            this.f34504s = null;
        } else {
            int i11 = 1;
            boolean z11 = j3 > 0 && (c22 = org.telegram.messenger.mp.u1(currentAccount).c2(Long.valueOf(j3))) != null && c22.bot;
            if (i7 > 0) {
                this.f34504s = h2Var.getMessagesController().R1().A(0, i7, gt0Var.f35606m1, true);
            } else {
                fi.p6 R1 = h2Var.getMessagesController().R1();
                long j10 = gt0Var.f35606m1;
                if (z11) {
                    i11 = 4;
                } else if (!z10) {
                    i10 = 0;
                    this.f34504s = R1.A(i10, -1, j10, true);
                }
                i10 = i11;
                this.f34504s = R1.A(i10, -1, j10, true);
            }
        }
        fi.h6 h6Var = this.f34504s;
        if (h6Var != null) {
            this.f34505w = h6Var.o();
            this.f34506x = new bt0(this, h2Var.getMessagesController().R1(), gt0Var.f35606m1, this.f34504s.f12041c);
        }
        N();
    }

    @Override
    public final int L(int i7) {
        return i7;
    }
}
