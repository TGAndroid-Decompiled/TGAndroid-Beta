package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class ts0 extends qs0 {
    public final ArrayList E;
    public boolean F;
    public final ws0 G;
    public final boolean h;
    public final int f38548n;
    public final ArrayList f38549r;
    public ei.r6 f38550s;
    public final int f38551w;
    public final rs0 f38552x;
    public boolean f38553y;

    public ts0(ws0 ws0Var, Context context, boolean z10) {
        this(ws0Var, context, 0, z10);
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final String F(int i3) {
        org.telegram.messenger.zi ziVar;
        TL_stories.StoryItem storyItem;
        ei.r6 r6Var = this.f38550s;
        if (r6Var == null || i3 < 0 || i3 >= r6Var.f10876i.size() || (ziVar = (org.telegram.messenger.zi) this.f38550s.f10876i.get(i3)) == null || (storyItem = ziVar.f26871l) == null) {
            return null;
        }
        return org.telegram.messenger.bd.e0(storyItem.date, true);
    }

    @Override
    public final void I() {
        int i3;
        if (this.h) {
            i3 = 9;
        } else {
            i3 = 8;
        }
        this.G.p1(i3, true);
    }

    public final boolean M(int i3) {
        ei.r6 r6Var;
        if (!this.h && (r6Var = this.f38550s) != null) {
            if (r6Var instanceof ei.k6) {
                ws0 ws0Var = this.G;
                TLRPC.User a22 = org.telegram.messenger.hp.s1(ws0Var.f40142y1.getCurrentAccount()).a2(Long.valueOf(ws0Var.m1));
                if (a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i3 >= 0 && i3 < r6Var.f10876i.size()) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.f38550s.f10876i.get(i3);
                ei.r6 r6Var2 = this.f38550s;
                if (r6Var2.f10874f > 0) {
                    return true;
                }
                return r6Var2.m(ziVar.f1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void N() {
        rr0 rr0Var;
        rr0 rr0Var2;
        rr0 rr0Var3;
        rr0 rr0Var4;
        ei.r6 r6Var = this.f38550s;
        if (r6Var != null && !this.h) {
            ws0 ws0Var = this.G;
            boolean z10 = ws0Var.f40112o1;
            rr0[] rr0VarArr = ws0Var.f40108n0;
            int[] iArr = ws0Var.f40115p1;
            if ((!z10 || (ws0Var.f40109n1 && r6Var.g() > 1)) && this.f38550s.g() > 0 && !ws0Var.H0()) {
                boolean z11 = false;
                if (this.f38550s.g() < 5) {
                    iArr[1] = this.f38550s.g();
                    if (rr0VarArr != null && (rr0Var3 = rr0VarArr[0]) != null && (rr0Var4 = rr0VarArr[1]) != null && rr0Var3.h != null && rr0Var4.h != null) {
                        ws0Var.z1(false);
                    }
                    if (iArr[1] == 1) {
                        z11 = true;
                    }
                    ws0Var.f40109n1 = z11;
                } else if (ws0Var.f40109n1) {
                    ws0Var.f40109n1 = false;
                    iArr[1] = Math.max(2, org.telegram.messenger.az.f21669u1);
                    if (rr0VarArr != null && (rr0Var = rr0VarArr[0]) != null && (rr0Var2 = rr0VarArr[1]) != null && rr0Var.h != null && rr0Var2.h != null) {
                        ws0Var.z1(false);
                    }
                }
                ws0Var.f40112o1 = true;
            }
        }
    }

    public final int O() {
        ws0 ws0Var = this.G;
        dr0 dr0Var = ws0Var.K;
        int[] iArr = ws0Var.f40115p1;
        if (this == dr0Var) {
            return iArr[0];
        }
        if (ws0.x(ws0Var, this) != -1) {
            return iArr[1];
        }
        return ws0Var.f40129t1;
    }

    public final void P() {
        if (this.f38550s == null) {
            return;
        }
        int O = O();
        this.f38550s.p(Math.min(100, Math.max(1, O / 2) * O * O), false);
    }

    @Override
    public final int b() {
        int i3 = 0;
        if (this.f38550s == null) {
            return 0;
        }
        int size = this.f38549r.size();
        if (!this.f38550s.l() || !this.G.t0()) {
            i3 = this.f38550s.g();
        }
        return size + i3;
    }

    @Override
    public final int d(int i3) {
        return 19;
    }

    @Override
    public final int e() {
        return b();
    }

    @Override
    public void f() {
        if (this.f38550s != null) {
            ws0 ws0Var = this.G;
            if (ws0Var.B0()) {
                ArrayList arrayList = this.f38549r;
                arrayList.clear();
                ArrayList F = org.telegram.messenger.hp.s1(this.f38550s.f10872c).P1().F(ws0Var.m1);
                if (F != null) {
                    arrayList.addAll(F);
                }
            }
        }
        super.f();
        N();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        boolean z11;
        char c2;
        boolean z12;
        if (this.f38550s != null && d1Var.f55544f == 19) {
            View view = d1Var.f55540a;
            if (view instanceof org.telegram.ui.Cells.n7) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                n7Var.f29687e0 = true;
                ArrayList arrayList = this.f38549r;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    ei.y6 y6Var = (ei.y6) arrayList.get(i3);
                    n7Var.f29690g0 = false;
                    if (y6Var.L == null) {
                        TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                        long j10 = y6Var.f11234a;
                        int i10 = (int) (j10 ^ (j10 >>> 32));
                        tL_storyItem.messageId = i10;
                        tL_storyItem.f27240id = i10;
                        tL_storyItem.attachPath = y6Var.f11238f;
                        org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(this.f38550s.f10872c, tL_storyItem);
                        y6Var.L = ziVar;
                        ziVar.f26875m = y6Var;
                    }
                    n7Var.k(y6Var.L, O(), false);
                    n7Var.f29687e0 = true;
                    n7Var.setReorder(false);
                    n7Var.i(false, false);
                    return;
                }
                int size = i3 - arrayList.size();
                if (size >= 0 && size < this.f38550s.f10876i.size()) {
                    org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) this.f38550s.f10876i.get(size);
                    if (ziVar2 != null && this.f38550s.m(ziVar2.f1())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    n7Var.f29690g0 = z10;
                    ws0 ws0Var = this.G;
                    if (!ws0Var.B0() && !n7Var.f29690g0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    n7Var.setReorder(z11);
                    n7Var.h = ws0Var.F0();
                    n7Var.k(ziVar2, O(), false);
                    if (ws0Var.F1 && ziVar2 != null) {
                        SparseArray[] sparseArrayArr = ws0Var.f40077c1;
                        if (org.telegram.messenger.zi.B0(ziVar2.f26868k) == ws0Var.m1) {
                            c2 = 0;
                        } else {
                            c2 = 1;
                        }
                        if (sparseArrayArr[c2].indexOfKey(ziVar2.f1()) >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        n7Var.i(z12, true);
                    } else {
                        n7Var.i(false, false);
                    }
                    n7Var.l(this.f38553y, false);
                    return;
                }
                n7Var.f29690g0 = false;
                n7Var.k(null, O(), false);
                n7Var.f29687e0 = true;
            }
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        u4.d1 x10 = super.x(viewGroup, i3);
        View view = x10.f55540a;
        if (view instanceof org.telegram.ui.Cells.n7) {
            ((org.telegram.ui.Cells.n7) view).f29687e0 = true;
        }
        return x10;
    }

    public ts0(ws0 ws0Var, Context context, int i3, boolean z10) {
        super(ws0Var, context);
        int i10;
        TLRPC.User a22;
        this.G = ws0Var;
        this.f38549r = new ArrayList();
        this.E = new ArrayList();
        this.h = z10;
        this.f38548n = i3;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
        long j10 = ws0Var.m1;
        int currentAccount = d2Var.getCurrentAccount();
        if (!TextUtils.isEmpty(ws0Var.getStoriesHashtag())) {
            if (ws0Var.X1 == null) {
                ws0Var.X1 = new ei.l6(currentAccount, TextUtils.isEmpty(ws0Var.getStoriesHashtagUsername()) ? null : ws0Var.getStoriesHashtagUsername(), ws0Var.getStoriesHashtag());
            }
            this.f38550s = ws0Var.X1;
        } else if (ws0Var.getStoriesArea() != null) {
            if (ws0Var.X1 == null) {
                ws0Var.X1 = new ei.l6(currentAccount, ws0Var.getStoriesArea());
            }
            this.f38550s = ws0Var.X1;
        } else if ((z10 && !ws0Var.H0()) || (!z10 && ws0Var.A0())) {
            this.f38550s = null;
        } else {
            int i11 = 1;
            boolean z11 = j10 > 0 && (a22 = org.telegram.messenger.hp.s1(currentAccount).a2(Long.valueOf(j10))) != null && a22.bot;
            if (i3 > 0) {
                this.f38550s = d2Var.getMessagesController().P1().A(0, i3, ws0Var.m1, true);
            } else {
                ei.z6 P1 = d2Var.getMessagesController().P1();
                long j11 = ws0Var.m1;
                if (z11) {
                    i11 = 4;
                } else if (!z10) {
                    i10 = 0;
                    this.f38550s = P1.A(i10, -1, j11, true);
                }
                i10 = i11;
                this.f38550s = P1.A(i10, -1, j11, true);
            }
        }
        ei.r6 r6Var = this.f38550s;
        if (r6Var != null) {
            this.f38551w = r6Var.o();
            this.f38552x = new rs0(this, d2Var.getMessagesController().P1(), ws0Var.m1, this.f38550s.f10872c);
        }
        N();
    }

    @Override
    public final int L(int i3) {
        return i3;
    }
}
