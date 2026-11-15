package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jl extends org.telegram.ui.Components.ui0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final ArrayList N;
    public boolean O;
    public boolean P;
    public final ArrayList Q;
    public final an R;
    public final Context h;
    public final boolean f48359n;
    public int f48360r;
    public int f48361s;
    public int f48362w;
    public int f48363x;
    public int f48364y;

    public jl(an anVar, Context context) {
        boolean z10;
        this.R = anVar;
        this.f40034e = new ArrayList();
        this.f40035f = new ArrayList();
        this.f48361s = -5;
        this.f48362w = -5;
        this.f48363x = -5;
        this.f48364y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.J = -5;
        this.N = new ArrayList();
        this.Q = new ArrayList();
        this.h = context;
        TLRPC.User user = anVar.f45186f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48359n = z10;
        C(true);
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    public final void K(boolean z10) {
        an anVar = this.R;
        if (org.telegram.messenger.q10.u(anVar.f45186f)) {
            if (z10) {
                anVar.Tc = true;
            }
            if (this.J >= 0 && !N()) {
                super.s(this.J);
                S();
            }
        }
    }

    public final ArrayList L() {
        if (this.M) {
            return this.N;
        }
        if (this.O) {
            return this.Q;
        }
        return this.R.L6;
    }

    public final void M(org.telegram.messenger.gj gjVar) {
        an anVar = this.R;
        int childCount = anVar.A0.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = anVar.A0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == gjVar) {
                    q1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        an anVar = this.R;
        if (org.telegram.messenger.q10.v(anVar.f45186f) && anVar.b() == 0 && !anVar.Tc && anVar.f45203g4 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        an anVar = this.R;
        ArrayList arrayList = anVar.L6;
        if (org.telegram.messenger.r2.f26206a) {
            org.telegram.messenger.a8.b("notify data set changed fragmentOpened=" + anVar.f45193f6);
        }
        if (z10 && anVar.f45193f6) {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        } else {
            anVar.A0.setItemAnimator(null);
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
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(size);
            if (gjVar.f23825l0) {
                size--;
            } else {
                TLRPC.Message message = gjVar.f23819k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z11 = true;
                    }
                }
            }
        }
        z11 = false;
        boolean[] zArr = anVar.T6;
        if ((zArr[0] && (anVar.f45153c7 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow;
            anVar.a7(z12);
        }
    }

    public final void P(int i7, boolean z10) {
        boolean z11;
        org.telegram.messenger.gj messageObject;
        String str;
        if (org.telegram.messenger.r2.f26206a) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i7);
            if (z10) {
                str = " with thanos effect";
            } else {
                str = "";
            }
            org.telegram.ui.Cells.y0.t(str, sb2);
        }
        an anVar = this.R;
        z11 = ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow;
        if (!z11) {
            anVar.A0.setItemAnimator(null);
        } else {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        }
        if (z10 && anVar.B0 != null) {
            v4.m0 itemAnimator2 = anVar.A0.getItemAnimator();
            cj cjVar2 = anVar.B0;
            if (itemAnimator2 == cjVar2) {
                v4.e1 K = anVar.A0.K(i7);
                if (K == null) {
                    cjVar2.getClass();
                } else {
                    cjVar2.S.add(K);
                    View view = K.f58535a;
                    if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view).getMessageObject()) != null) {
                        messageObject.f23774a0 = true;
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
        an anVar = this.R;
        ArrayList arrayList = anVar.L6;
        if (anVar.C0 != null && !this.M && !this.O) {
            int i11 = 0;
            if (!anVar.Q4 && anVar.f45125a8 != null) {
                int childCount = anVar.A0.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = anVar.A0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.messenger.gj messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        org.telegram.messenger.gj gjVar = anVar.f45125a8;
                        if (messageObject == gjVar) {
                            if (arrayList.indexOf(gjVar) >= 0) {
                                i10 = arrayList.indexOf(anVar.f45125a8) + this.K;
                                i11 = anVar.h9(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            g(i7);
            if (i10 != -1) {
                anVar.C0.h1(i10, i11);
            }
        }
    }

    public final org.telegram.ui.Cells.q1 R(org.telegram.messenger.gj gjVar, boolean z10, boolean z11) {
        ArrayList arrayList;
        an anVar = this.R;
        if (z10) {
            int childCount = anVar.A0.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = anVar.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == gjVar && TextUtils.equals(q1Var.f31239z5, q1Var.Q5.f23819k.post_author)) {
                        q1Var.x3(gjVar, q1Var.getCurrentMessagesGroup(), q1Var.I2(), q1Var.J2(), q1Var.A2(), q1Var.E2());
                        return q1Var;
                    }
                }
                i7++;
                gjVar = gjVar;
            }
        }
        org.telegram.messenger.gj gjVar2 = gjVar;
        if (this.M) {
            arrayList = this.N;
        } else if (this.O) {
            arrayList = this.Q;
        } else {
            arrayList = anVar.L6;
        }
        int indexOf = arrayList.indexOf(gjVar2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i10 = an.f45109nd;
            an.f45109nd = i10 + 1;
            gjVar2.f23829m1 = i10;
            O(true);
            return null;
        }
        Q(this.K + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl.S():void");
    }

    public final void T() {
        int i7 = this.f48360r;
        int i10 = this.f48363x;
        int i11 = this.E;
        int i12 = this.f48361s;
        int i13 = this.f48362w;
        int i14 = this.F;
        int i15 = this.G;
        int i16 = this.K;
        int i17 = this.L;
        int i18 = this.H;
        int i19 = this.I;
        int i20 = this.J;
        S();
        if (i7 == this.f48360r && i10 == this.f48363x && i14 == this.F && i15 == this.G && i16 == this.K && i17 == this.L && i12 == this.f48361s && i13 == this.f48362w && i11 == this.E && i18 == this.H && i19 == this.I && i20 == this.J) {
            return;
        }
        O(false);
    }

    @Override
    public final int b() {
        this.f48364y = -5;
        an anVar = this.R;
        a0.h hVar = anVar.f45384u8;
        if (anVar.f45165d6.get(anVar.f45357s4, 0) != 0) {
            TLRPC.User user = anVar.f45186f;
            if (user == null || !user.bot || anVar.f45203g4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(anVar.f45186f.f28200id)).description == null && ((TL_bots.BotInfo) hVar.f(anVar.f45186f.f28200id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(anVar.f45186f.f28200id)).description_document == null)) && !org.telegram.messenger.q10.z(anVar.f45186f) && !org.telegram.messenger.q10.u(anVar.f45186f))) {
                return 0;
            }
            this.f48364y = 0;
            return 1;
        }
        return this.f48360r;
    }

    @Override
    public final long c(int i7) {
        ArrayList arrayList;
        an anVar = this.R;
        if (anVar.f45165d6.get(anVar.f45357s4, 0) == 0 || i7 != this.f48364y) {
            if (this.M) {
                arrayList = this.N;
            } else if (this.O) {
                arrayList = this.Q;
            } else {
                arrayList = anVar.L6;
            }
            int i10 = this.K;
            if (i7 >= i10 && i7 < this.L) {
                return ((org.telegram.messenger.gj) arrayList.get(i7 - i10)).f23829m1;
            }
            if (i7 != this.f48363x && i7 != this.f48364y) {
                if (i7 == this.F) {
                    return 2L;
                }
                if (i7 == this.G) {
                    return 3L;
                }
                if (i7 == this.f48361s) {
                    return 4L;
                }
                if (i7 == this.E) {
                    return 6L;
                }
                if (i7 == this.H) {
                    return 7L;
                }
                if (i7 == this.I) {
                    return 8L;
                }
                if (i7 == this.J) {
                    return 9L;
                }
                if (i7 == this.f48362w) {
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
        an anVar = this.R;
        if (anVar.f45165d6.get(anVar.f45357s4, 0) == 0 || i7 != this.f48364y) {
            if (i7 != this.f48361s && i7 != this.f48362w) {
                int i10 = this.K;
                if (i7 >= i10 && i7 < this.L) {
                    if (this.M) {
                        arrayList = this.N;
                    } else if (this.O) {
                        arrayList = this.Q;
                    } else {
                        arrayList = anVar.L6;
                    }
                    return ((org.telegram.messenger.gj) arrayList.get(i7 - i10)).U;
                } else if (i7 == this.f48363x) {
                    return 3;
                } else {
                    if (i7 == this.E) {
                        return 6;
                    }
                    if (i7 != this.I && i7 != this.H) {
                        if (i7 == this.J) {
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
        boolean z10;
        if (org.telegram.messenger.r2.f26206a) {
            org.telegram.messenger.a8.b("notify item changed " + i7);
        }
        an anVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow;
        if (z10 && !anVar.f45147c1) {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        } else {
            anVar.A0.setItemAnimator(null);
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
        boolean z10;
        if (org.telegram.messenger.r2.f26206a) {
            org.telegram.messenger.a8.b("notify item inserted " + i7);
        }
        an anVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow;
        if (!z10) {
            anVar.A0.setItemAnimator(null);
        } else {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
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
        boolean z10;
        if (org.telegram.messenger.r2.f26206a) {
            org.telegram.messenger.a8.b("notify item moved" + i7 + ":" + i10);
        }
        an anVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow;
        if (!z10) {
            anVar.A0.setItemAnimator(null);
        } else {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
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
        boolean z10;
        if (org.telegram.messenger.r2.f26206a) {
            org.telegram.messenger.a8.b("notify item range changed " + i7 + ":" + i10);
        }
        an anVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow;
        if (!z10) {
            anVar.A0.setItemAnimator(null);
        } else {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
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
        boolean z10;
        int i11;
        int i12;
        an anVar = this.R;
        ArrayList arrayList = anVar.L6;
        if (org.telegram.messenger.r2.f26206a) {
            org.telegram.messenger.a8.b("notify item range inserted " + i7 + ":" + i10);
        }
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow;
        if (!z10) {
            anVar.A0.setItemAnimator(null);
        } else {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
            }
        }
        S();
        if (i7 == 1 && i10 > 0 && (i11 = i7 + i10) >= (i12 = this.K) && i11 < this.L) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i11 - i12);
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get((i11 - this.K) - 1);
            if ((anVar.f45172e != null && gjVar.Z0() == gjVar2.Z0()) || (anVar.f45186f != null && gjVar.P3() == gjVar2.P3())) {
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
        boolean z10;
        if (org.telegram.messenger.r2.f26206a) {
            org.telegram.messenger.a8.b("notify item range removed" + i7 + ":" + i10);
        }
        an anVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow;
        if (!z10) {
            anVar.A0.setItemAnimator(null);
        } else {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
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
        boolean z10;
        if (org.telegram.messenger.r2.f26206a) {
            org.telegram.messenger.a8.b("notify item removed " + i7);
        }
        an anVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow;
        if (!z10) {
            anVar.A0.setItemAnimator(null);
        } else {
            v4.m0 itemAnimator = anVar.A0.getItemAnimator();
            cj cjVar = anVar.B0;
            if (itemAnimator != cjVar) {
                anVar.A0.setItemAnimator(cjVar);
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
    public final void t(v4.e1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.q1 q1Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.q1 q1Var2;
        int i13;
        an anVar = this.R;
        if (i7 == 0) {
            i13 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            q1Var = new org.telegram.ui.Cells.q1(this.h, i13, true, anVar.Ya, anVar.Aa);
            q1Var.setResourcesProvider(anVar.Aa);
            if (anVar.Vc == null) {
                anVar.Vc = new lm(anVar);
            }
            q1Var.setDelegate(anVar.Vc);
            q1Var.Xb = anVar.f45363sc;
            if (anVar.h == null) {
                q1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i7 == 1) {
                ?? t0Var = new org.telegram.ui.Cells.t0(context, anVar.Aa, true);
                t0Var.setInvalidateColors(true);
                t0Var.setDelegate(new el(this));
                q1Var = t0Var;
            } else {
                if (i7 == 2) {
                    ?? z1Var = new org.telegram.ui.Cells.z1(context, anVar.Aa);
                    q1Var2 = z1Var;
                    if (!anVar.S9()) {
                        org.telegram.ui.ActionBar.q6.U(z1Var.getTextView(), org.telegram.ui.ActionBar.j6.f29211wf, anVar.Aa);
                        org.telegram.ui.ActionBar.q6.x(z1Var.getBackgroundLayout(), z1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.j6.f29230xf, anVar.Aa, PorterDuff.Mode.MULTIPLY);
                        q1Var2 = z1Var;
                    }
                } else if (i7 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    ?? flVar = new fl(this, context, i12, anVar.Aa);
                    flVar.setDelegate(new w0(this, 22));
                    q1Var2 = flVar;
                } else if (i7 == 4) {
                    q1Var2 = new org.telegram.ui.Cells.w0(context, anVar.Aa);
                } else if (i7 == 6) {
                    i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    q1Var2 = new org.telegram.ui.Cells.ra(i11, context, anVar.Aa);
                } else if (i7 == 7) {
                    q1Var2 = new org.telegram.ui.Cells.t0(context, anVar.Aa, false);
                } else if (i7 == 8) {
                    i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    q1Var2 = new gl(this, context, i10, anVar.Aa);
                } else if (i7 == 10) {
                    ?? y1Var = new org.telegram.ui.Cells.y1(context, anVar.Aa);
                    if (anVar.Vc == null) {
                        anVar.Vc = new lm(anVar);
                    }
                    y1Var.setDelegate(anVar.Vc);
                    q1Var2 = y1Var;
                } else {
                    q1Var = null;
                }
                q1Var = q1Var2;
            }
        }
        return i5.c.q(q1Var, q1Var, -1, -2);
    }

    @Override
    public final void y(v4.e1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jl.y(v4.e1):void");
    }
}
