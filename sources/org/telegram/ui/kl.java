package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class kl extends org.telegram.ui.Components.fj0 {
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
    public final boolean f49346n;
    public int f49347r;
    public int f49348s;
    public int f49349w;
    public int f49350x;
    public int f49351y;

    public kl(bn bnVar, Context context) {
        boolean z10;
        this.R = bnVar;
        this.f35244e = new ArrayList();
        this.f35245f = new ArrayList();
        this.f49348s = -5;
        this.f49349w = -5;
        this.f49350x = -5;
        this.f49351y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.J = -5;
        this.N = new ArrayList();
        this.Q = new ArrayList();
        this.h = context;
        TLRPC.User user = bnVar.f46019f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49346n = z10;
        C(true);
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void K(boolean z10) {
        bn bnVar = this.R;
        if (org.telegram.messenger.p10.v(bnVar.f46019f)) {
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

    public final void M(org.telegram.messenger.gj gjVar) {
        bn bnVar = this.R;
        int childCount = bnVar.A0.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = bnVar.A0.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.r1) {
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                if (r1Var.getMessageObject() == gjVar) {
                    r1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        bn bnVar = this.R;
        if (org.telegram.messenger.p10.w(bnVar.f46019f) && bnVar.d() == 0 && !bnVar.Uc && bnVar.f46036g4 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        bn bnVar = this.R;
        ArrayList arrayList = bnVar.M6;
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("notify data set changed fragmentOpened=" + bnVar.f46038g6);
        }
        if (z10 && bnVar.f46038g6) {
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
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(size);
            if (gjVar.f24219l0) {
                size--;
            } else {
                TLRPC.Message message = gjVar.f24213k;
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
        if ((zArr[0] && (bnVar.f45999d7 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow;
            bnVar.a7(z12);
        }
    }

    public final void P(int i7, boolean z10) {
        boolean z11;
        org.telegram.messenger.gj messageObject;
        String str;
        if (org.telegram.messenger.s2.f26730a) {
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
        z11 = ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow;
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
                    View view = K.f59165a;
                    if ((view instanceof org.telegram.ui.Cells.r1) && (messageObject = ((org.telegram.ui.Cells.r1) view).getMessageObject()) != null) {
                        messageObject.f24168a0 = true;
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
            if (!bnVar.R4 && bnVar.f45973b8 != null) {
                int childCount = bnVar.A0.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = bnVar.A0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.r1) {
                        org.telegram.messenger.gj messageObject = ((org.telegram.ui.Cells.r1) childAt).getMessageObject();
                        org.telegram.messenger.gj gjVar = bnVar.f45973b8;
                        if (messageObject == gjVar) {
                            if (arrayList.indexOf(gjVar) >= 0) {
                                i10 = arrayList.indexOf(bnVar.f45973b8) + this.K;
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

    public final org.telegram.ui.Cells.r1 R(org.telegram.messenger.gj gjVar, boolean z10, boolean z11) {
        ArrayList arrayList;
        bn bnVar = this.R;
        if (z10) {
            int childCount = bnVar.A0.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = bnVar.A0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.r1) {
                    org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                    if (r1Var.getMessageObject() == gjVar && TextUtils.equals(r1Var.f31692z5, r1Var.Q5.f24213k.post_author)) {
                        r1Var.y3(gjVar, r1Var.getCurrentMessagesGroup(), r1Var.K2(), r1Var.L2(), r1Var.C2(), r1Var.G2());
                        return r1Var;
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
            arrayList = bnVar.M6;
        }
        int indexOf = arrayList.indexOf(gjVar2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i10 = bn.f45942od;
            bn.f45942od = i10 + 1;
            gjVar2.f24223m1 = i10;
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
        int i7 = this.f49347r;
        int i10 = this.f49350x;
        int i11 = this.E;
        int i12 = this.f49348s;
        int i13 = this.f49349w;
        int i14 = this.F;
        int i15 = this.G;
        int i16 = this.K;
        int i17 = this.L;
        int i18 = this.H;
        int i19 = this.I;
        int i20 = this.J;
        S();
        if (i7 == this.f49347r && i10 == this.f49350x && i14 == this.F && i15 == this.G && i16 == this.K && i17 == this.L && i12 == this.f49348s && i13 == this.f49349w && i11 == this.E && i18 == this.H && i19 == this.I && i20 == this.J) {
            return;
        }
        O(false);
    }

    @Override
    public final int b() {
        this.f49351y = -5;
        bn bnVar = this.R;
        a0.h hVar = bnVar.f46231v8;
        if (bnVar.f46012e6.get(bnVar.f46191s4, 0) != 0) {
            TLRPC.User user = bnVar.f46019f;
            if (user == null || !user.bot || bnVar.f46036g4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(bnVar.f46019f.f28583id)).description == null && ((TL_bots.BotInfo) hVar.f(bnVar.f46019f.f28583id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(bnVar.f46019f.f28583id)).description_document == null)) && !org.telegram.messenger.p10.A(bnVar.f46019f) && !org.telegram.messenger.p10.v(bnVar.f46019f))) {
                return 0;
            }
            this.f49351y = 0;
            return 1;
        }
        return this.f49347r;
    }

    @Override
    public final long c(int i7) {
        ArrayList arrayList;
        bn bnVar = this.R;
        if (bnVar.f46012e6.get(bnVar.f46191s4, 0) == 0 || i7 != this.f49351y) {
            if (this.M) {
                arrayList = this.N;
            } else if (this.O) {
                arrayList = this.Q;
            } else {
                arrayList = bnVar.M6;
            }
            int i10 = this.K;
            if (i7 >= i10 && i7 < this.L) {
                return ((org.telegram.messenger.gj) arrayList.get(i7 - i10)).f24223m1;
            }
            if (i7 != this.f49350x && i7 != this.f49351y) {
                if (i7 == this.F) {
                    return 2L;
                }
                if (i7 == this.G) {
                    return 3L;
                }
                if (i7 == this.f49348s) {
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
                if (i7 == this.f49349w) {
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
        if (bnVar.f46012e6.get(bnVar.f46191s4, 0) == 0 || i7 != this.f49351y) {
            if (i7 != this.f49348s && i7 != this.f49349w) {
                int i10 = this.K;
                if (i7 >= i10 && i7 < this.L) {
                    if (this.M) {
                        arrayList = this.N;
                    } else if (this.O) {
                        arrayList = this.Q;
                    } else {
                        arrayList = bnVar.M6;
                    }
                    return ((org.telegram.messenger.gj) arrayList.get(i7 - i10)).U;
                } else if (i7 == this.f49350x) {
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
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("notify item changed " + i7);
        }
        bn bnVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow;
        if (z10 && !bnVar.f45980c1) {
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
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("notify item inserted " + i7);
        }
        bn bnVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow;
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
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("notify item moved" + i7 + ":" + i10);
        }
        bn bnVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow;
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
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("notify item range changed " + i7 + ":" + i10);
        }
        bn bnVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow;
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
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("notify item range inserted " + i7 + ":" + i10);
        }
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow;
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
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i11 - i12);
            org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList.get((i11 - this.K) - 1);
            if ((bnVar.f46005e != null && gjVar.Z0() == gjVar2.Z0()) || (bnVar.f46019f != null && gjVar.P3() == gjVar2.P3())) {
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
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("notify item range removed" + i7 + ":" + i10);
        }
        bn bnVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow;
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
        if (org.telegram.messenger.s2.f26730a) {
            org.telegram.messenger.a8.b("notify item removed " + i7);
        }
        bn bnVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow;
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
        org.telegram.ui.Cells.r1 r1Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.r1 r1Var2;
        int i13;
        bn bnVar = this.R;
        if (i7 == 0) {
            i13 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
            r1Var = new org.telegram.ui.Cells.r1(this.h, i13, true, bnVar.Za, bnVar.Ba);
            r1Var.setResourcesProvider(bnVar.Ba);
            if (bnVar.Wc == null) {
                bnVar.Wc = new mm(bnVar);
            }
            r1Var.setDelegate(bnVar.Wc);
            r1Var.Xb = bnVar.f46209tc;
            if (bnVar.h == null) {
                r1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i7 == 1) {
                ?? v0Var = new org.telegram.ui.Cells.v0(context, bnVar.Ba, true);
                v0Var.setInvalidateColors(true);
                v0Var.setDelegate(new fl(this));
                r1Var = v0Var;
            } else {
                if (i7 == 2) {
                    ?? a2Var = new org.telegram.ui.Cells.a2(context, bnVar.Ba);
                    r1Var2 = a2Var;
                    if (!bnVar.S9()) {
                        org.telegram.ui.ActionBar.t6.U(a2Var.getTextView(), org.telegram.ui.ActionBar.m6.f29743wf, bnVar.Ba);
                        org.telegram.ui.ActionBar.t6.x(a2Var.getBackgroundLayout(), a2Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.m6.f29762xf, bnVar.Ba, PorterDuff.Mode.MULTIPLY);
                        r1Var2 = a2Var;
                    }
                } else if (i7 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    ?? glVar = new gl(this, context, i12, bnVar.Ba);
                    glVar.setDelegate(new w0(this, 22));
                    r1Var2 = glVar;
                } else if (i7 == 4) {
                    r1Var2 = new org.telegram.ui.Cells.y0(context, bnVar.Ba);
                } else if (i7 == 6) {
                    i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    r1Var2 = new org.telegram.ui.Cells.ta(i11, context, bnVar.Ba);
                } else if (i7 == 7) {
                    r1Var2 = new org.telegram.ui.Cells.v0(context, bnVar.Ba, false);
                } else if (i7 == 8) {
                    i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    r1Var2 = new hl(this, context, i10, bnVar.Ba);
                } else if (i7 == 10) {
                    ?? z1Var = new org.telegram.ui.Cells.z1(context, bnVar.Ba);
                    if (bnVar.Wc == null) {
                        bnVar.Wc = new mm(bnVar);
                    }
                    z1Var.setDelegate(bnVar.Wc);
                    r1Var2 = z1Var;
                } else {
                    r1Var = null;
                }
                r1Var = r1Var2;
            }
        }
        return i5.c.q(r1Var, r1Var, -1, -2);
    }

    @Override
    public final void y(v4.f1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kl.y(v4.f1):void");
    }
}
