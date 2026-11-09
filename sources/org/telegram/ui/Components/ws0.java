package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class ws0 extends ts0 {
    public final ArrayList D;
    public boolean E;
    public final zs0 F;
    public final boolean h;
    public final int f40143n;
    public final ArrayList f40144r;
    public di.r6 f40145s;
    public final int f40146w;
    public final us0 f40147x;
    public boolean f40148y;

    public ws0(zs0 zs0Var, Context context, boolean z9) {
        this(zs0Var, context, 0, z9);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final String F(int i7) {
        org.telegram.messenger.ij ijVar;
        TL_stories.StoryItem storyItem;
        di.r6 r6Var = this.f40145s;
        if (r6Var == null || i7 < 0 || i7 >= r6Var.f9694i.size() || (ijVar = (org.telegram.messenger.ij) this.f40145s.f9694i.get(i7)) == null || (storyItem = ijVar.f23266l) == null) {
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
        if (!this.h && (r6Var = this.f40145s) != null) {
            if (r6Var instanceof di.k6) {
                zs0 zs0Var = this.F;
                TLRPC.User a22 = org.telegram.messenger.qp.s1(zs0Var.f41127x1.getCurrentAccount()).a2(Long.valueOf(zs0Var.l1));
                if (a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < r6Var.f9694i.size()) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f40145s.f9694i.get(i7);
                di.r6 r6Var2 = this.f40145s;
                if (r6Var2.f9692f > 0) {
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
        ur0 ur0Var;
        ur0 ur0Var2;
        ur0 ur0Var3;
        ur0 ur0Var4;
        di.r6 r6Var = this.f40145s;
        if (r6Var != null && !this.h) {
            zs0 zs0Var = this.F;
            boolean z9 = zs0Var.n1;
            ur0[] ur0VarArr = zs0Var.m0;
            int[] iArr = zs0Var.f41101o1;
            if ((!z9 || (zs0Var.f41095m1 && r6Var.g() > 1)) && this.f40145s.g() > 0 && !zs0Var.I0()) {
                boolean z10 = false;
                if (this.f40145s.g() < 5) {
                    iArr[1] = this.f40145s.g();
                    if (ur0VarArr != null && (ur0Var3 = ur0VarArr[0]) != null && (ur0Var4 = ur0VarArr[1]) != null && ur0Var3.h != null && ur0Var4.h != null) {
                        zs0Var.B1(false);
                    }
                    if (iArr[1] == 1) {
                        z10 = true;
                    }
                    zs0Var.f41095m1 = z10;
                } else if (zs0Var.f41095m1) {
                    zs0Var.f41095m1 = false;
                    iArr[1] = Math.max(2, org.telegram.messenger.iz.f23442u1);
                    if (ur0VarArr != null && (ur0Var = ur0VarArr[0]) != null && (ur0Var2 = ur0VarArr[1]) != null && ur0Var.h != null && ur0Var2.h != null) {
                        zs0Var.B1(false);
                    }
                }
                zs0Var.n1 = true;
            }
        }
    }

    public final int O() {
        zs0 zs0Var = this.F;
        fr0 fr0Var = zs0Var.J;
        int[] iArr = zs0Var.f41101o1;
        if (this == fr0Var) {
            return iArr[0];
        }
        if (zs0.x(zs0Var, this) != -1) {
            return iArr[1];
        }
        return zs0Var.f41115s1;
    }

    public final void P() {
        if (this.f40145s == null) {
            return;
        }
        int O = O();
        this.f40145s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int b() {
        int i7 = 0;
        if (this.f40145s == null) {
            return 0;
        }
        int size = this.f40144r.size();
        if (!this.f40145s.l() || !this.F.t0()) {
            i7 = this.f40145s.g();
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
        if (this.f40145s != null) {
            zs0 zs0Var = this.F;
            if (zs0Var.B0()) {
                ArrayList arrayList = this.f40144r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.qp.s1(this.f40145s.f9690c).P1().F(zs0Var.l1);
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
        if (this.f40145s != null && d1Var.f57060f == 19) {
            View view = d1Var.f57056a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                o7Var.f29670d0 = true;
                ArrayList arrayList = this.f40144r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    di.y6 y6Var = (di.y6) arrayList.get(i7);
                    o7Var.f29674f0 = false;
                    if (y6Var.K == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j3 = y6Var.f9958a;
                        int i10 = (int) (j3 ^ (j3 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.f27195id = i10;
                        tL_storyItem.attachPath = y6Var.f9962f;
                        org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(this.f40145s.f9690c, tL_storyItem);
                        y6Var.K = ijVar;
                        ijVar.f23269m = y6Var;
                    }
                    o7Var.k(y6Var.K, O(), false);
                    o7Var.f29670d0 = true;
                    o7Var.setReorder(false);
                    o7Var.i(false, false);
                    return;
                }
                int size = i7 - arrayList.size();
                if (size >= 0 && size < this.f40145s.f9694i.size()) {
                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.f40145s.f9694i.get(size);
                    if (ijVar2 != null && this.f40145s.m(ijVar2.e1())) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    o7Var.f29674f0 = z9;
                    zs0 zs0Var = this.F;
                    if (!zs0Var.B0() && !o7Var.f29674f0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    o7Var.setReorder(z10);
                    o7Var.h = zs0Var.G0();
                    o7Var.k(ijVar2, O(), false);
                    if (zs0Var.E1 && ijVar2 != null) {
                        SparseArray[] sparseArrayArr = zs0Var.f41062b1;
                        if (org.telegram.messenger.ij.B0(ijVar2.f23262k) == zs0Var.l1) {
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
                    o7Var.l(this.f40148y, false);
                    return;
                }
                o7Var.f29674f0 = false;
                o7Var.k(null, O(), false);
                o7Var.f29670d0 = true;
            }
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        v4.d1 x10 = super.x(viewGroup, i7);
        View view = x10.f57056a;
        if (view instanceof org.telegram.ui.Cells.o7) {
            ((org.telegram.ui.Cells.o7) view).f29670d0 = true;
        }
        return x10;
    }

    public ws0(zs0 zs0Var, Context context, int i7, boolean z9) {
        super(zs0Var, context);
        int i10;
        TLRPC.User a22;
        this.F = zs0Var;
        this.f40144r = new ArrayList();
        this.D = new ArrayList();
        this.h = z9;
        this.f40143n = i7;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.f41127x1;
        long j3 = zs0Var.l1;
        int currentAccount = f2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(zs0Var.getStoriesHashtag())) {
            if (zs0Var.W1 == null) {
                zs0Var.W1 = new di.l6(currentAccount, TextUtils.isEmpty(zs0Var.getStoriesHashtagUsername()) ? null : zs0Var.getStoriesHashtagUsername(), zs0Var.getStoriesHashtag());
            }
            this.f40145s = zs0Var.W1;
        } else if (zs0Var.getStoriesArea() != null) {
            if (zs0Var.W1 == null) {
                zs0Var.W1 = new di.l6(currentAccount, zs0Var.getStoriesArea());
            }
            this.f40145s = zs0Var.W1;
        } else if ((z9 && !zs0Var.I0()) || (!z9 && zs0Var.A0())) {
            this.f40145s = null;
        } else {
            int i11 = 1;
            boolean z10 = j3 > 0 && (a22 = org.telegram.messenger.qp.s1(currentAccount).a2(Long.valueOf(j3))) != null && a22.bot;
            if (i7 > 0) {
                this.f40145s = f2Var.getMessagesController().P1().A(0, i7, zs0Var.l1, true);
            } else {
                di.z6 P1 = f2Var.getMessagesController().P1();
                long j10 = zs0Var.l1;
                if (z10) {
                    i11 = 4;
                } else if (!z9) {
                    i10 = 0;
                    this.f40145s = P1.A(i10, -1, j10, true);
                }
                i10 = i11;
                this.f40145s = P1.A(i10, -1, j10, true);
            }
        }
        di.r6 r6Var = this.f40145s;
        if (r6Var != null) {
            this.f40146w = r6Var.o();
            this.f40147x = new us0(this, f2Var.getMessagesController().P1(), zs0Var.l1, this.f40145s.f9690c);
        }
        N();
    }

    @Override
    public final int L(int i7) {
        return i7;
    }
}
