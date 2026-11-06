package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jl extends org.telegram.ui.Components.pi0 {
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
    public final an Q;
    public final Context h;
    public final boolean f46992n;
    public int f46993r;
    public int f46994s;
    public int f46995w;
    public int f46996x;
    public int f46997y;

    public jl(an anVar, Context context) {
        boolean z9;
        this.Q = anVar;
        this.f36920e = new ArrayList();
        this.f36921f = new ArrayList();
        this.f46994s = -5;
        this.f46995w = -5;
        this.f46996x = -5;
        this.f46997y = -5;
        this.D = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = anVar.f43785f;
        if (user != null && user.bot) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f46992n = z9;
        C(true);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void K(boolean z9) {
        an anVar = this.Q;
        if (org.telegram.messenger.t10.u(anVar.f43785f)) {
            if (z9) {
                anVar.Qc = true;
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

    public final void M(org.telegram.messenger.ij ijVar) {
        an anVar = this.Q;
        int childCount = anVar.f44037z0.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = anVar.f44037z0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == ijVar) {
                    q1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        an anVar = this.Q;
        if (org.telegram.messenger.t10.v(anVar.f43785f) && anVar.b() == 0 && !anVar.Qc && anVar.f43790f4 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z9) {
        boolean z10;
        boolean z11;
        an anVar = this.Q;
        ArrayList arrayList = anVar.K6;
        if (org.telegram.messenger.r2.f25199a) {
            org.telegram.messenger.a8.b("notify data set changed fragmentOpened=" + anVar.f43778e6);
        }
        if (z9 && anVar.f43778e6) {
            v4.l0 itemAnimator = anVar.f44037z0.getItemAnimator();
            cj cjVar = anVar.A0;
            if (itemAnimator != cjVar) {
                anVar.f44037z0.setItemAnimator(cjVar);
            }
        } else {
            anVar.f44037z0.setItemAnimator(null);
        }
        S();
        try {
            super.f();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(size);
            if (ijVar.f23241j0) {
                size--;
            } else {
                TLRPC.Message message = ijVar.f23244k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z10 = true;
                    }
                }
            }
        }
        z10 = false;
        boolean[] zArr = anVar.S6;
        if ((zArr[0] && (anVar.f43738b7 == 0 || zArr[1])) || z10) {
            z11 = ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow;
            anVar.Z6(z11);
        }
    }

    public final void P(int i7, boolean z9) {
        boolean z10;
        org.telegram.messenger.ij messageObject;
        String str;
        if (org.telegram.messenger.r2.f25199a) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i7);
            if (z9) {
                str = " with thanos effect";
            } else {
                str = "";
            }
            org.telegram.ui.Cells.f1.u(str, sb2);
        }
        an anVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow;
        if (!z10) {
            anVar.f44037z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = anVar.f44037z0.getItemAnimator();
            cj cjVar = anVar.A0;
            if (itemAnimator != cjVar) {
                anVar.f44037z0.setItemAnimator(cjVar);
            }
        }
        if (z9 && anVar.A0 != null) {
            v4.l0 itemAnimator2 = anVar.f44037z0.getItemAnimator();
            cj cjVar2 = anVar.A0;
            if (itemAnimator2 == cjVar2) {
                v4.d1 K = anVar.f44037z0.K(i7);
                if (K == null) {
                    cjVar2.getClass();
                } else {
                    cjVar2.S.add(K);
                    View view = K.f56951a;
                    if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view).getMessageObject()) != null) {
                        messageObject.f23199a0 = true;
                    }
                }
            }
        }
        S();
        try {
            super.s(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void Q(int i7) {
        int i10;
        an anVar = this.Q;
        ArrayList arrayList = anVar.K6;
        if (anVar.B0 != null && !this.L && !this.N) {
            int i11 = 0;
            if (!anVar.P4 && anVar.Z7 != null) {
                int childCount = anVar.f44037z0.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = anVar.f44037z0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.messenger.ij messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        org.telegram.messenger.ij ijVar = anVar.Z7;
                        if (messageObject == ijVar) {
                            if (arrayList.indexOf(ijVar) >= 0) {
                                i10 = arrayList.indexOf(anVar.Z7) + this.J;
                                i11 = anVar.f9(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            g(i7);
            if (i10 != -1) {
                anVar.B0.h1(i10, i11);
            }
        }
    }

    public final org.telegram.ui.Cells.q1 R(org.telegram.messenger.ij ijVar, boolean z9, boolean z10) {
        ArrayList arrayList;
        an anVar = this.Q;
        if (z9) {
            int childCount = anVar.f44037z0.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = anVar.f44037z0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == ijVar && TextUtils.equals(q1Var.f30076y5, q1Var.P5.f23244k.post_author)) {
                        q1Var.v3(ijVar, q1Var.getCurrentMessagesGroup(), q1Var.H2(), q1Var.I2(), q1Var.z2(), q1Var.D2());
                        return q1Var;
                    }
                }
                i7++;
                ijVar = ijVar;
            }
        }
        org.telegram.messenger.ij ijVar2 = ijVar;
        if (this.L) {
            arrayList = this.M;
        } else if (this.N) {
            arrayList = this.P;
        } else {
            arrayList = anVar.K6;
        }
        int indexOf = arrayList.indexOf(ijVar2);
        if (indexOf == -1) {
            return null;
        }
        if (z10) {
            int i10 = an.f43708kd;
            an.f43708kd = i10 + 1;
            ijVar2.f23246k1 = i10;
            O(true);
            return null;
        }
        Q(this.J + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl.S():void");
    }

    public final void T() {
        int i7 = this.f46993r;
        int i10 = this.f46996x;
        int i11 = this.D;
        int i12 = this.f46994s;
        int i13 = this.f46995w;
        int i14 = this.E;
        int i15 = this.F;
        int i16 = this.J;
        int i17 = this.K;
        int i18 = this.G;
        int i19 = this.H;
        int i20 = this.I;
        S();
        if (i7 == this.f46993r && i10 == this.f46996x && i14 == this.E && i15 == this.F && i16 == this.J && i17 == this.K && i12 == this.f46994s && i13 == this.f46995w && i11 == this.D && i18 == this.G && i19 == this.H && i20 == this.I) {
            return;
        }
        O(false);
    }

    @Override
    public final int b() {
        this.f46997y = -5;
        an anVar = this.Q;
        a0.h hVar = anVar.f43967t8;
        if (anVar.f43751c6.get(anVar.f43939r4, 0) != 0) {
            TLRPC.User user = anVar.f43785f;
            if (user == null || !user.bot || anVar.f43790f4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(anVar.f43785f.f27102id)).description == null && ((TL_bots.BotInfo) hVar.f(anVar.f43785f.f27102id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(anVar.f43785f.f27102id)).description_document == null)) && !org.telegram.messenger.t10.z(anVar.f43785f) && !org.telegram.messenger.t10.u(anVar.f43785f))) {
                return 0;
            }
            this.f46997y = 0;
            return 1;
        }
        return this.f46993r;
    }

    @Override
    public final long c(int i7) {
        ArrayList arrayList;
        an anVar = this.Q;
        if (anVar.f43751c6.get(anVar.f43939r4, 0) == 0 || i7 != this.f46997y) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = anVar.K6;
            }
            int i10 = this.J;
            if (i7 >= i10 && i7 < this.K) {
                return ((org.telegram.messenger.ij) arrayList.get(i7 - i10)).f23246k1;
            }
            if (i7 != this.f46996x && i7 != this.f46997y) {
                if (i7 == this.E) {
                    return 2L;
                }
                if (i7 == this.F) {
                    return 3L;
                }
                if (i7 == this.f46994s) {
                    return 4L;
                }
                if (i7 == this.D) {
                    return 6L;
                }
                if (i7 == this.G) {
                    return 7L;
                }
                if (i7 == this.H) {
                    return 8L;
                }
                if (i7 == this.I) {
                    return 9L;
                }
                if (i7 == this.f46995w) {
                    return 10L;
                }
                return 5L;
            }
            return 1L;
        }
        return 1L;
    }

    @Override
    public final int d(int i7) {
        ArrayList arrayList;
        an anVar = this.Q;
        if (anVar.f43751c6.get(anVar.f43939r4, 0) == 0 || i7 != this.f46997y) {
            if (i7 != this.f46994s && i7 != this.f46995w) {
                int i10 = this.J;
                if (i7 >= i10 && i7 < this.K) {
                    if (this.L) {
                        arrayList = this.M;
                    } else if (this.N) {
                        arrayList = this.P;
                    } else {
                        arrayList = anVar.K6;
                    }
                    return ((org.telegram.messenger.ij) arrayList.get(i7 - i10)).U;
                } else if (i7 == this.f46996x) {
                    return 3;
                } else {
                    if (i7 == this.D) {
                        return 6;
                    }
                    if (i7 != this.H && i7 != this.G) {
                        if (i7 == this.I) {
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
    public final void g(int i7) {
        boolean z9;
        if (org.telegram.messenger.r2.f25199a) {
            org.telegram.messenger.a8.b("notify item changed " + i7);
        }
        an anVar = this.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow;
        if (z9 && !anVar.f43732b1) {
            v4.l0 itemAnimator = anVar.f44037z0.getItemAnimator();
            cj cjVar = anVar.A0;
            if (itemAnimator != cjVar) {
                anVar.f44037z0.setItemAnimator(cjVar);
            }
        } else {
            anVar.f44037z0.setItemAnimator(null);
        }
        S();
        try {
            super.g(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void i(int i7) {
        boolean z9;
        if (org.telegram.messenger.r2.f25199a) {
            org.telegram.messenger.a8.b("notify item inserted " + i7);
        }
        an anVar = this.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow;
        if (!z9) {
            anVar.f44037z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = anVar.f44037z0.getItemAnimator();
            cj cjVar = anVar.A0;
            if (itemAnimator != cjVar) {
                anVar.f44037z0.setItemAnimator(cjVar);
            }
        }
        S();
        try {
            super.i(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void j(int i7, int i10) {
        boolean z9;
        if (org.telegram.messenger.r2.f25199a) {
            org.telegram.messenger.a8.b("notify item moved" + i7 + ":" + i10);
        }
        an anVar = this.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow;
        if (!z9) {
            anVar.f44037z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = anVar.f44037z0.getItemAnimator();
            cj cjVar = anVar.A0;
            if (itemAnimator != cjVar) {
                anVar.f44037z0.setItemAnimator(cjVar);
            }
        }
        S();
        try {
            super.j(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void k(int i7, int i10) {
        boolean z9;
        if (org.telegram.messenger.r2.f25199a) {
            org.telegram.messenger.a8.b("notify item range changed " + i7 + ":" + i10);
        }
        an anVar = this.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow;
        if (!z9) {
            anVar.f44037z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = anVar.f44037z0.getItemAnimator();
            cj cjVar = anVar.A0;
            if (itemAnimator != cjVar) {
                anVar.f44037z0.setItemAnimator(cjVar);
            }
        }
        S();
        try {
            super.k(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void o(int i7, int i10) {
        boolean z9;
        int i11;
        int i12;
        an anVar = this.Q;
        ArrayList arrayList = anVar.K6;
        if (org.telegram.messenger.r2.f25199a) {
            org.telegram.messenger.a8.b("notify item range inserted " + i7 + ":" + i10);
        }
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow;
        if (!z9) {
            anVar.f44037z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = anVar.f44037z0.getItemAnimator();
            cj cjVar = anVar.A0;
            if (itemAnimator != cjVar) {
                anVar.f44037z0.setItemAnimator(cjVar);
            }
        }
        S();
        if (i7 == 1 && i10 > 0 && (i11 = i7 + i10) >= (i12 = this.J) && i11 < this.K) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i11 - i12);
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get((i11 - this.J) - 1);
            if ((anVar.f43771e != null && ijVar.Z0() == ijVar2.Z0()) || (anVar.f43785f != null && ijVar.Q3() == ijVar2.Q3())) {
                g(i7);
            }
        }
        try {
            super.o(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void p(int i7, int i10) {
        boolean z9;
        if (org.telegram.messenger.r2.f25199a) {
            org.telegram.messenger.a8.b("notify item range removed" + i7 + ":" + i10);
        }
        an anVar = this.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow;
        if (!z9) {
            anVar.f44037z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = anVar.f44037z0.getItemAnimator();
            cj cjVar = anVar.A0;
            if (itemAnimator != cjVar) {
                anVar.f44037z0.setItemAnimator(cjVar);
            }
        }
        S();
        try {
            super.p(i7, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void s(int i7) {
        boolean z9;
        if (org.telegram.messenger.r2.f25199a) {
            org.telegram.messenger.a8.b("notify item removed " + i7);
        }
        an anVar = this.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow;
        if (!z9) {
            anVar.f44037z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = anVar.f44037z0.getItemAnimator();
            cj cjVar = anVar.A0;
            if (itemAnimator != cjVar) {
                anVar.f44037z0.setItemAnimator(cjVar);
            }
        }
        S();
        try {
            super.s(i7);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void t(v4.d1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.q1 q1Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.q1 q1Var2;
        int i13;
        an anVar = this.Q;
        if (i7 == 0) {
            i13 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            q1Var = new org.telegram.ui.Cells.q1(this.h, i13, true, anVar.Va, anVar.f44022xa);
            q1Var.setResourcesProvider(anVar.f44022xa);
            if (anVar.Sc == null) {
                anVar.Sc = new lm(anVar);
            }
            q1Var.setDelegate(anVar.Sc);
            q1Var.Wb = anVar.f43920pc;
            if (anVar.h == null) {
                q1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i7 == 1) {
                ?? t0Var = new org.telegram.ui.Cells.t0(context, anVar.f44022xa, true);
                t0Var.setInvalidateColors(true);
                t0Var.setDelegate(new el(this));
                q1Var = t0Var;
            } else {
                if (i7 == 2) {
                    ?? z1Var = new org.telegram.ui.Cells.z1(context, anVar.f44022xa);
                    q1Var2 = z1Var;
                    if (!anVar.Q9()) {
                        org.telegram.ui.ActionBar.r6.V(z1Var.getTextView(), org.telegram.ui.ActionBar.k6.f28154tf, anVar.f44022xa);
                        org.telegram.ui.ActionBar.r6.y(z1Var.getBackgroundLayout(), z1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.k6.f28174uf, anVar.f44022xa, PorterDuff.Mode.MULTIPLY);
                        q1Var2 = z1Var;
                    }
                } else if (i7 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    ?? flVar = new fl(this, context, i12, anVar.f44022xa);
                    flVar.setDelegate(new w0(this, 22));
                    q1Var2 = flVar;
                } else if (i7 == 4) {
                    q1Var2 = new org.telegram.ui.Cells.w0(context, anVar.f44022xa);
                } else if (i7 == 6) {
                    i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    q1Var2 = new org.telegram.ui.Cells.ra(i11, context, anVar.f44022xa);
                } else if (i7 == 7) {
                    q1Var2 = new org.telegram.ui.Cells.t0(context, anVar.f44022xa, false);
                } else if (i7 == 8) {
                    i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    q1Var2 = new gl(this, context, i10, anVar.f44022xa);
                } else if (i7 == 10) {
                    ?? y1Var = new org.telegram.ui.Cells.y1(context, anVar.f44022xa);
                    if (anVar.Sc == null) {
                        anVar.Sc = new lm(anVar);
                    }
                    y1Var.setDelegate(anVar.Sc);
                    q1Var2 = y1Var;
                } else {
                    q1Var = null;
                }
                q1Var = q1Var2;
            }
        }
        return jg.g.r(q1Var, q1Var, -1, -2);
    }

    @Override
    public final void y(v4.d1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl.y(v4.d1):void");
    }
}
