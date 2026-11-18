package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class kl extends org.telegram.ui.Components.dj0 {
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
    public final bn R;
    public final Context h;
    public final boolean f49295n;
    public int f49296r;
    public int f49297s;
    public int f49298w;
    public int f49299x;
    public int f49300y;

    public kl(bn bnVar, Context context) {
        boolean z10;
        this.R = bnVar;
        this.f34450e = new ArrayList();
        this.f34451f = new ArrayList();
        this.f49297s = -5;
        this.f49298w = -5;
        this.f49299x = -5;
        this.f49300y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.J = -5;
        this.N = new ArrayList();
        this.Q = new ArrayList();
        this.h = context;
        TLRPC.User user = bnVar.f46001f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49295n = z10;
        C(true);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void K(boolean z10) {
        bn bnVar = this.R;
        if (org.telegram.messenger.o10.v(bnVar.f46001f)) {
            if (z10) {
                bnVar.Uc = true;
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
        return this.R.M6;
    }

    public final void M(org.telegram.messenger.fj fjVar) {
        bn bnVar = this.R;
        int childCount = bnVar.A0.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = bnVar.A0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == fjVar) {
                    q1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        bn bnVar = this.R;
        if (org.telegram.messenger.o10.w(bnVar.f46001f) && bnVar.d() == 0 && !bnVar.Uc && bnVar.f46018g4 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        bn bnVar = this.R;
        ArrayList arrayList = bnVar.M6;
        if (org.telegram.messenger.s2.f26723a) {
            org.telegram.messenger.a8.b("notify data set changed fragmentOpened=" + bnVar.f46020g6);
        }
        if (z10 && bnVar.f46020g6) {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        } else {
            bnVar.A0.setItemAnimator(null);
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
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(size);
            if (fjVar.f23974l0) {
                size--;
            } else {
                TLRPC.Message message = fjVar.f23968k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z11 = true;
                    }
                }
            }
        }
        z11 = false;
        boolean[] zArr = bnVar.U6;
        if ((zArr[0] && (bnVar.f45981d7 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow;
            bnVar.a7(z12);
        }
    }

    public final void P(int i7, boolean z10) {
        boolean z11;
        org.telegram.messenger.fj messageObject;
        String str;
        if (org.telegram.messenger.s2.f26723a) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i7);
            if (z10) {
                str = " with thanos effect";
            } else {
                str = "";
            }
            p5.c.s(str, sb2);
        }
        bn bnVar = this.R;
        z11 = ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow;
        if (!z11) {
            bnVar.A0.setItemAnimator(null);
        } else {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        }
        if (z10 && bnVar.B0 != null) {
            v4.n0 itemAnimator2 = bnVar.A0.getItemAnimator();
            dj djVar2 = bnVar.B0;
            if (itemAnimator2 == djVar2) {
                v4.f1 K = bnVar.A0.K(i7);
                if (K == null) {
                    djVar2.getClass();
                } else {
                    djVar2.S.add(K);
                    View view = K.f59122a;
                    if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view).getMessageObject()) != null) {
                        messageObject.f23923a0 = true;
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
        bn bnVar = this.R;
        ArrayList arrayList = bnVar.M6;
        if (bnVar.C0 != null && !this.M && !this.O) {
            int i11 = 0;
            if (!bnVar.R4 && bnVar.f45955b8 != null) {
                int childCount = bnVar.A0.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = bnVar.A0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.messenger.fj messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        org.telegram.messenger.fj fjVar = bnVar.f45955b8;
                        if (messageObject == fjVar) {
                            if (arrayList.indexOf(fjVar) >= 0) {
                                i10 = arrayList.indexOf(bnVar.f45955b8) + this.K;
                                i11 = bnVar.h9(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            g(i7);
            if (i10 != -1) {
                bnVar.C0.h1(i10, i11);
            }
        }
    }

    public final org.telegram.ui.Cells.q1 R(org.telegram.messenger.fj fjVar, boolean z10, boolean z11) {
        ArrayList arrayList;
        bn bnVar = this.R;
        if (z10) {
            int childCount = bnVar.A0.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = bnVar.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == fjVar && TextUtils.equals(q1Var.f31611z5, q1Var.Q5.f23968k.post_author)) {
                        q1Var.y3(fjVar, q1Var.getCurrentMessagesGroup(), q1Var.K2(), q1Var.L2(), q1Var.C2(), q1Var.G2());
                        return q1Var;
                    }
                }
                i7++;
                fjVar = fjVar;
            }
        }
        org.telegram.messenger.fj fjVar2 = fjVar;
        if (this.M) {
            arrayList = this.N;
        } else if (this.O) {
            arrayList = this.Q;
        } else {
            arrayList = bnVar.M6;
        }
        int indexOf = arrayList.indexOf(fjVar2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i10 = bn.f45924od;
            bn.f45924od = i10 + 1;
            fjVar2.f23978m1 = i10;
            O(true);
            return null;
        }
        Q(this.K + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kl.S():void");
    }

    public final void T() {
        int i7 = this.f49296r;
        int i10 = this.f49299x;
        int i11 = this.E;
        int i12 = this.f49297s;
        int i13 = this.f49298w;
        int i14 = this.F;
        int i15 = this.G;
        int i16 = this.K;
        int i17 = this.L;
        int i18 = this.H;
        int i19 = this.I;
        int i20 = this.J;
        S();
        if (i7 == this.f49296r && i10 == this.f49299x && i14 == this.F && i15 == this.G && i16 == this.K && i17 == this.L && i12 == this.f49297s && i13 == this.f49298w && i11 == this.E && i18 == this.H && i19 == this.I && i20 == this.J) {
            return;
        }
        O(false);
    }

    @Override
    public final int b() {
        this.f49300y = -5;
        bn bnVar = this.R;
        a0.h hVar = bnVar.f46213v8;
        if (bnVar.f45994e6.get(bnVar.f46173s4, 0) != 0) {
            TLRPC.User user = bnVar.f46001f;
            if (user == null || !user.bot || bnVar.f46018g4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(bnVar.f46001f.f28554id)).description == null && ((TL_bots.BotInfo) hVar.f(bnVar.f46001f.f28554id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(bnVar.f46001f.f28554id)).description_document == null)) && !org.telegram.messenger.o10.A(bnVar.f46001f) && !org.telegram.messenger.o10.v(bnVar.f46001f))) {
                return 0;
            }
            this.f49300y = 0;
            return 1;
        }
        return this.f49296r;
    }

    @Override
    public final long c(int i7) {
        ArrayList arrayList;
        bn bnVar = this.R;
        if (bnVar.f45994e6.get(bnVar.f46173s4, 0) == 0 || i7 != this.f49300y) {
            if (this.M) {
                arrayList = this.N;
            } else if (this.O) {
                arrayList = this.Q;
            } else {
                arrayList = bnVar.M6;
            }
            int i10 = this.K;
            if (i7 >= i10 && i7 < this.L) {
                return ((org.telegram.messenger.fj) arrayList.get(i7 - i10)).f23978m1;
            }
            if (i7 != this.f49299x && i7 != this.f49300y) {
                if (i7 == this.F) {
                    return 2L;
                }
                if (i7 == this.G) {
                    return 3L;
                }
                if (i7 == this.f49297s) {
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
                if (i7 == this.f49298w) {
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
        bn bnVar = this.R;
        if (bnVar.f45994e6.get(bnVar.f46173s4, 0) == 0 || i7 != this.f49300y) {
            if (i7 != this.f49297s && i7 != this.f49298w) {
                int i10 = this.K;
                if (i7 >= i10 && i7 < this.L) {
                    if (this.M) {
                        arrayList = this.N;
                    } else if (this.O) {
                        arrayList = this.Q;
                    } else {
                        arrayList = bnVar.M6;
                    }
                    return ((org.telegram.messenger.fj) arrayList.get(i7 - i10)).U;
                } else if (i7 == this.f49299x) {
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
        if (org.telegram.messenger.s2.f26723a) {
            org.telegram.messenger.a8.b("notify item changed " + i7);
        }
        bn bnVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow;
        if (z10 && !bnVar.f45962c1) {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        } else {
            bnVar.A0.setItemAnimator(null);
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
        if (org.telegram.messenger.s2.f26723a) {
            org.telegram.messenger.a8.b("notify item inserted " + i7);
        }
        bn bnVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow;
        if (!z10) {
            bnVar.A0.setItemAnimator(null);
        } else {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
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
        if (org.telegram.messenger.s2.f26723a) {
            org.telegram.messenger.a8.b("notify item moved" + i7 + ":" + i10);
        }
        bn bnVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow;
        if (!z10) {
            bnVar.A0.setItemAnimator(null);
        } else {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
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
        if (org.telegram.messenger.s2.f26723a) {
            org.telegram.messenger.a8.b("notify item range changed " + i7 + ":" + i10);
        }
        bn bnVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow;
        if (!z10) {
            bnVar.A0.setItemAnimator(null);
        } else {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
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
        bn bnVar = this.R;
        ArrayList arrayList = bnVar.M6;
        if (org.telegram.messenger.s2.f26723a) {
            org.telegram.messenger.a8.b("notify item range inserted " + i7 + ":" + i10);
        }
        z10 = ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow;
        if (!z10) {
            bnVar.A0.setItemAnimator(null);
        } else {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
            }
        }
        S();
        if (i7 == 1 && i10 > 0 && (i11 = i7 + i10) >= (i12 = this.K) && i11 < this.L) {
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i11 - i12);
            org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList.get((i11 - this.K) - 1);
            if ((bnVar.f45987e != null && fjVar.Z0() == fjVar2.Z0()) || (bnVar.f46001f != null && fjVar.P3() == fjVar2.P3())) {
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
        if (org.telegram.messenger.s2.f26723a) {
            org.telegram.messenger.a8.b("notify item range removed" + i7 + ":" + i10);
        }
        bn bnVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow;
        if (!z10) {
            bnVar.A0.setItemAnimator(null);
        } else {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
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
        if (org.telegram.messenger.s2.f26723a) {
            org.telegram.messenger.a8.b("notify item removed " + i7);
        }
        bn bnVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow;
        if (!z10) {
            bnVar.A0.setItemAnimator(null);
        } else {
            v4.n0 itemAnimator = bnVar.A0.getItemAnimator();
            dj djVar = bnVar.B0;
            if (itemAnimator != djVar) {
                bnVar.A0.setItemAnimator(djVar);
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
    public final void t(v4.f1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kl.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.q1 q1Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.q1 q1Var2;
        int i13;
        bn bnVar = this.R;
        if (i7 == 0) {
            i13 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            q1Var = new org.telegram.ui.Cells.q1(this.h, i13, true, bnVar.Za, bnVar.Ba);
            q1Var.setResourcesProvider(bnVar.Ba);
            if (bnVar.Wc == null) {
                bnVar.Wc = new mm(bnVar);
            }
            q1Var.setDelegate(bnVar.Wc);
            q1Var.Xb = bnVar.f46191tc;
            if (bnVar.h == null) {
                q1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i7 == 1) {
                ?? u0Var = new org.telegram.ui.Cells.u0(context, bnVar.Ba, true);
                u0Var.setInvalidateColors(true);
                u0Var.setDelegate(new fl(this));
                q1Var = u0Var;
            } else {
                if (i7 == 2) {
                    ?? z1Var = new org.telegram.ui.Cells.z1(context, bnVar.Ba);
                    q1Var2 = z1Var;
                    if (!bnVar.S9()) {
                        org.telegram.ui.ActionBar.u6.U(z1Var.getTextView(), org.telegram.ui.ActionBar.n6.f29758wf, bnVar.Ba);
                        org.telegram.ui.ActionBar.u6.x(z1Var.getBackgroundLayout(), z1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.n6.f29777xf, bnVar.Ba, PorterDuff.Mode.MULTIPLY);
                        q1Var2 = z1Var;
                    }
                } else if (i7 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    ?? glVar = new gl(this, context, i12, bnVar.Ba);
                    glVar.setDelegate(new w0(this, 22));
                    q1Var2 = glVar;
                } else if (i7 == 4) {
                    q1Var2 = new org.telegram.ui.Cells.x0(context, bnVar.Ba);
                } else if (i7 == 6) {
                    i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    q1Var2 = new org.telegram.ui.Cells.sa(i11, context, bnVar.Ba);
                } else if (i7 == 7) {
                    q1Var2 = new org.telegram.ui.Cells.u0(context, bnVar.Ba, false);
                } else if (i7 == 8) {
                    i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    q1Var2 = new hl(this, context, i10, bnVar.Ba);
                } else if (i7 == 10) {
                    ?? y1Var = new org.telegram.ui.Cells.y1(context, bnVar.Ba);
                    if (bnVar.Wc == null) {
                        bnVar.Wc = new mm(bnVar);
                    }
                    y1Var.setDelegate(bnVar.Wc);
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
    public final void y(v4.f1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kl.y(v4.f1):void");
    }
}
