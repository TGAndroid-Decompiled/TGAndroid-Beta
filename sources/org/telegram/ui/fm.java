package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class fm extends org.telegram.ui.Components.uj0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public final ArrayList P;
    public final un Q;
    public final Context h;
    public final boolean f37183n;
    public int f37184r;
    public int f37185s;
    public int f37186w;
    public int f37187x;
    public int f37188y;

    public fm(un unVar, Context context) {
        boolean z10;
        this.Q = unVar;
        this.e = new ArrayList();
        this.f30976f = new ArrayList();
        this.f37185s = -5;
        this.f37186w = -5;
        this.f37187x = -5;
        this.f37188y = -5;
        this.D = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = unVar.f42054f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37183n = z10;
        C(true);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void K(boolean z10) {
        un unVar = this.Q;
        if (org.telegram.messenger.i20.u(unVar.f42054f)) {
            if (z10) {
                unVar.Jc = true;
            }
            if (this.I >= 0 && !N()) {
                super.s(this.I);
                S();
            }
        }
    }

    public final ArrayList L() {
        if (this.L) {
            return this.M;
        }
        if (this.N) {
            return this.P;
        }
        return this.Q.K6;
    }

    public final void M(org.telegram.messenger.kj kjVar) {
        un unVar = this.Q;
        int childCount = unVar.f42303z0.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = unVar.f42303z0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == kjVar) {
                    q1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        un unVar = this.Q;
        if (org.telegram.messenger.i20.v(unVar.f42054f) && unVar.b() == 0 && !unVar.Jc && unVar.f42059f4 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        un unVar = this.Q;
        ArrayList arrayList = unVar.K6;
        if (org.telegram.messenger.v2.f18578a) {
            org.telegram.messenger.f8.b("notify data set changed fragmentOpened=" + unVar.f42049e6);
        }
        if (z10 && unVar.f42049e6) {
            s4.l0 itemAnimator = unVar.f42303z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.f42303z0.setItemAnimator(xjVar);
            }
        } else {
            unVar.f42303z0.setItemAnimator(null);
        }
        S();
        try {
            super.f();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(size);
            if (kjVar.f16687j0) {
                size--;
            } else {
                TLRPC.Message message = kjVar.f16690k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z11 = true;
                    }
                }
            }
        }
        z11 = false;
        boolean[] zArr = unVar.S6;
        if ((zArr[0] && (unVar.f42010b7 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow;
            unVar.X6(z12);
        }
    }

    public final void P(int i10, boolean z10) {
        boolean z11;
        org.telegram.messenger.kj messageObject;
        String str;
        if (org.telegram.messenger.v2.f18578a) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i10);
            if (z10) {
                str = " with thanos effect";
            } else {
                str = "";
            }
            a1.g.z(str, sb2);
        }
        un unVar = this.Q;
        z11 = ((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow;
        if (!z11) {
            unVar.f42303z0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = unVar.f42303z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.f42303z0.setItemAnimator(xjVar);
            }
        }
        if (z10 && unVar.A0 != null) {
            s4.l0 itemAnimator2 = unVar.f42303z0.getItemAnimator();
            xj xjVar2 = unVar.A0;
            if (itemAnimator2 == xjVar2) {
                s4.c1 K = unVar.f42303z0.K(i10);
                if (K == null) {
                    xjVar2.getClass();
                } else {
                    xjVar2.S.add(K);
                    View view = K.f47909a;
                    if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view).getMessageObject()) != null) {
                        messageObject.f16648a0 = true;
                    }
                }
            }
        }
        S();
        try {
            super.s(i10);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void Q(int i10) {
        int i11;
        un unVar = this.Q;
        ArrayList arrayList = unVar.K6;
        if (unVar.B0 != null && !this.L && !this.N) {
            int i12 = 0;
            if (!unVar.P4 && unVar.Z7 != null) {
                int childCount = unVar.f42303z0.getChildCount();
                int i13 = 0;
                while (true) {
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = unVar.f42303z0.getChildAt(i13);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.messenger.kj messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        org.telegram.messenger.kj kjVar = unVar.Z7;
                        if (messageObject == kjVar) {
                            if (arrayList.indexOf(kjVar) >= 0) {
                                i11 = arrayList.indexOf(unVar.Z7) + this.J;
                                i12 = unVar.c9(childAt);
                            }
                        }
                    }
                    i13++;
                }
            }
            i11 = -1;
            g(i10);
            if (i11 != -1) {
                unVar.B0.h1(i11, i12);
            }
        }
    }

    public final org.telegram.ui.Cells.q1 R(org.telegram.messenger.kj kjVar, boolean z10, boolean z11) {
        ArrayList arrayList;
        un unVar = this.Q;
        if (z10) {
            int childCount = unVar.f42303z0.getChildCount();
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = unVar.f42303z0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == kjVar && TextUtils.equals(q1Var.f22781x5, q1Var.O5.f16690k.post_author)) {
                        q1Var.s3(kjVar, q1Var.getCurrentMessagesGroup(), q1Var.E2(), q1Var.F2(), q1Var.x2(), q1Var.A2());
                        return q1Var;
                    }
                }
                i10++;
                kjVar = kjVar;
            }
        }
        org.telegram.messenger.kj kjVar2 = kjVar;
        if (this.L) {
            arrayList = this.M;
        } else if (this.N) {
            arrayList = this.P;
        } else {
            arrayList = unVar.K6;
        }
        int indexOf = arrayList.indexOf(kjVar2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i11 = un.f41981dd;
            un.f41981dd = i11 + 1;
            kjVar2.f16692k1 = i11;
            O(true);
            return null;
        }
        Q(this.J + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fm.S():void");
    }

    public final void T() {
        int i10 = this.f37184r;
        int i11 = this.f37187x;
        int i12 = this.D;
        int i13 = this.f37185s;
        int i14 = this.f37186w;
        int i15 = this.E;
        int i16 = this.F;
        int i17 = this.J;
        int i18 = this.K;
        int i19 = this.G;
        int i20 = this.H;
        int i21 = this.I;
        S();
        if (i10 == this.f37184r && i11 == this.f37187x && i15 == this.E && i16 == this.F && i17 == this.J && i18 == this.K && i13 == this.f37185s && i14 == this.f37186w && i12 == this.D && i19 == this.G && i20 == this.H && i21 == this.I) {
            return;
        }
        O(false);
    }

    @Override
    public final int b() {
        this.f37188y = -5;
        un unVar = this.Q;
        a0.h hVar = unVar.f42235t8;
        if (unVar.f42023c6.get(unVar.f42205r4, 0) != 0) {
            TLRPC.User user = unVar.f42054f;
            if (user == null || !user.bot || unVar.f42059f4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(unVar.f42054f.f19943id)).description == null && ((TL_bots.BotInfo) hVar.f(unVar.f42054f.f19943id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(unVar.f42054f.f19943id)).description_document == null)) && !org.telegram.messenger.i20.z(unVar.f42054f) && !org.telegram.messenger.i20.u(unVar.f42054f))) {
                return 0;
            }
            this.f37188y = 0;
            return 1;
        }
        return this.f37184r;
    }

    @Override
    public final long c(int i10) {
        ArrayList arrayList;
        un unVar = this.Q;
        if (unVar.f42023c6.get(unVar.f42205r4, 0) == 0 || i10 != this.f37188y) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = unVar.K6;
            }
            int i11 = this.J;
            if (i10 >= i11 && i10 < this.K) {
                return ((org.telegram.messenger.kj) arrayList.get(i10 - i11)).f16692k1;
            }
            if (i10 != this.f37187x && i10 != this.f37188y) {
                if (i10 == this.E) {
                    return 2L;
                }
                if (i10 == this.F) {
                    return 3L;
                }
                if (i10 == this.f37185s) {
                    return 4L;
                }
                if (i10 == this.D) {
                    return 6L;
                }
                if (i10 == this.G) {
                    return 7L;
                }
                if (i10 == this.H) {
                    return 8L;
                }
                if (i10 == this.I) {
                    return 9L;
                }
                if (i10 == this.f37186w) {
                    return 10L;
                }
                return 5L;
            }
            return 1L;
        }
        return 1L;
    }

    @Override
    public final int d(int i10) {
        ArrayList arrayList;
        un unVar = this.Q;
        if (unVar.f42023c6.get(unVar.f42205r4, 0) == 0 || i10 != this.f37188y) {
            if (i10 != this.f37185s && i10 != this.f37186w) {
                int i11 = this.J;
                if (i10 >= i11 && i10 < this.K) {
                    if (this.L) {
                        arrayList = this.M;
                    } else if (this.N) {
                        arrayList = this.P;
                    } else {
                        arrayList = unVar.K6;
                    }
                    return ((org.telegram.messenger.kj) arrayList.get(i10 - i11)).U;
                } else if (i10 == this.f37187x) {
                    return 3;
                } else {
                    if (i10 == this.D) {
                        return 6;
                    }
                    if (i10 != this.H && i10 != this.G) {
                        if (i10 == this.I) {
                            return 8;
                        }
                        return 4;
                    }
                    return 7;
                }
            }
            return 1;
        }
        return 3;
    }

    @Override
    public final void f() {
        O(false);
    }

    @Override
    public final void g(int i10) {
        boolean z10;
        if (org.telegram.messenger.v2.f18578a) {
            org.telegram.messenger.f8.b("notify item changed " + i10);
        }
        un unVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow;
        if (z10 && !unVar.f42004b1) {
            s4.l0 itemAnimator = unVar.f42303z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.f42303z0.setItemAnimator(xjVar);
            }
        } else {
            unVar.f42303z0.setItemAnimator(null);
        }
        S();
        try {
            super.g(i10);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void i(int i10) {
        boolean z10;
        if (org.telegram.messenger.v2.f18578a) {
            org.telegram.messenger.f8.b("notify item inserted " + i10);
        }
        un unVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow;
        if (!z10) {
            unVar.f42303z0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = unVar.f42303z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.f42303z0.setItemAnimator(xjVar);
            }
        }
        S();
        try {
            super.i(i10);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void j(int i10, int i11) {
        boolean z10;
        if (org.telegram.messenger.v2.f18578a) {
            org.telegram.messenger.f8.b("notify item moved" + i10 + ":" + i11);
        }
        un unVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow;
        if (!z10) {
            unVar.f42303z0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = unVar.f42303z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.f42303z0.setItemAnimator(xjVar);
            }
        }
        S();
        try {
            super.j(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void k(int i10, int i11) {
        boolean z10;
        if (org.telegram.messenger.v2.f18578a) {
            org.telegram.messenger.f8.b("notify item range changed " + i10 + ":" + i11);
        }
        un unVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow;
        if (!z10) {
            unVar.f42303z0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = unVar.f42303z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.f42303z0.setItemAnimator(xjVar);
            }
        }
        S();
        try {
            super.k(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void o(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        un unVar = this.Q;
        ArrayList arrayList = unVar.K6;
        if (org.telegram.messenger.v2.f18578a) {
            org.telegram.messenger.f8.b("notify item range inserted " + i10 + ":" + i11);
        }
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow;
        if (!z10) {
            unVar.f42303z0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = unVar.f42303z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.f42303z0.setItemAnimator(xjVar);
            }
        }
        S();
        if (i10 == 1 && i11 > 0 && (i12 = i10 + i11) >= (i13 = this.J) && i12 < this.K) {
            org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i12 - i13);
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList.get((i12 - this.J) - 1);
            if ((unVar.e != null && kjVar.Z0() == kjVar2.Z0()) || (unVar.f42054f != null && kjVar.P3() == kjVar2.P3())) {
                g(i10);
            }
        }
        try {
            super.o(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void p(int i10, int i11) {
        boolean z10;
        if (org.telegram.messenger.v2.f18578a) {
            org.telegram.messenger.f8.b("notify item range removed" + i10 + ":" + i11);
        }
        un unVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow;
        if (!z10) {
            unVar.f42303z0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = unVar.f42303z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.f42303z0.setItemAnimator(xjVar);
            }
        }
        S();
        try {
            super.p(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void s(int i10) {
        boolean z10;
        if (org.telegram.messenger.v2.f18578a) {
            org.telegram.messenger.f8.b("notify item removed " + i10);
        }
        un unVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow;
        if (!z10) {
            unVar.f42303z0.setItemAnimator(null);
        } else {
            s4.l0 itemAnimator = unVar.f42303z0.getItemAnimator();
            xj xjVar = unVar.A0;
            if (itemAnimator != xjVar) {
                unVar.f42303z0.setItemAnimator(xjVar);
            }
        }
        S();
        try {
            super.s(i10);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void t(s4.c1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fm.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.q1 q1Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.q1 q1Var2;
        int i14;
        un unVar = this.Q;
        if (i10 == 0) {
            i14 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            q1Var = new org.telegram.ui.Cells.q1(this.h, i14, true, unVar.Va, unVar.f42288xa);
            q1Var.setResourcesProvider(unVar.f42288xa);
            if (unVar.Lc == null) {
                unVar.Lc = new fn(unVar);
            }
            q1Var.setDelegate(unVar.Lc);
            q1Var.Vb = unVar.f42138lc;
            if (unVar.h == null) {
                q1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i10 == 1) {
                ?? s0Var = new org.telegram.ui.Cells.s0(context, unVar.f42288xa, true);
                s0Var.setInvalidateColors(true);
                s0Var.setDelegate(new am(this));
                q1Var = s0Var;
            } else {
                if (i10 == 2) {
                    ?? z1Var = new org.telegram.ui.Cells.z1(context, unVar.f42288xa);
                    q1Var2 = z1Var;
                    if (!unVar.L9()) {
                        org.telegram.ui.ActionBar.a7.V(z1Var.getTextView(), org.telegram.ui.ActionBar.t6.f21233tf, unVar.f42288xa);
                        org.telegram.ui.ActionBar.a7.y(z1Var.getBackgroundLayout(), z1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.t6.f21251uf, unVar.f42288xa, PorterDuff.Mode.MULTIPLY);
                        q1Var2 = z1Var;
                    }
                } else if (i10 == 3) {
                    i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    ?? bmVar = new bm(this, context, i13, unVar.f42288xa);
                    bmVar.setDelegate(new y0(this, 22));
                    q1Var2 = bmVar;
                } else if (i10 == 4) {
                    q1Var2 = new org.telegram.ui.Cells.v0(context, unVar.f42288xa);
                } else if (i10 == 6) {
                    i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    q1Var2 = new org.telegram.ui.Cells.ra(i12, context, unVar.f42288xa);
                } else if (i10 == 7) {
                    q1Var2 = new org.telegram.ui.Cells.s0(context, unVar.f42288xa, false);
                } else if (i10 == 8) {
                    i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                    q1Var2 = new cm(this, context, i11, unVar.f42288xa);
                } else if (i10 == 10) {
                    ?? y1Var = new org.telegram.ui.Cells.y1(context, unVar.f42288xa);
                    if (unVar.Lc == null) {
                        unVar.Lc = new fn(unVar);
                    }
                    y1Var.setDelegate(unVar.Lc);
                    q1Var2 = y1Var;
                } else {
                    q1Var = null;
                }
                q1Var = q1Var2;
            }
        }
        return sc.e.o(q1Var, q1Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fm.y(s4.c1):void");
    }
}
