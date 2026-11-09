package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class ll extends org.telegram.ui.Components.qi0 {
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
    public final cn Q;
    public final Context h;
    public final boolean f47633n;
    public int f47634r;
    public int f47635s;
    public int f47636w;
    public int f47637x;
    public int f47638y;

    public ll(cn cnVar, Context context) {
        boolean z9;
        this.Q = cnVar;
        this.f37344e = new ArrayList();
        this.f37345f = new ArrayList();
        this.f47635s = -5;
        this.f47636w = -5;
        this.f47637x = -5;
        this.f47638y = -5;
        this.D = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.h = context;
        TLRPC.User user = cnVar.f44446f;
        if (user != null && user.bot) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f47633n = z9;
        C(true);
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final void K(boolean z9) {
        cn cnVar = this.Q;
        if (org.telegram.messenger.t10.u(cnVar.f44446f)) {
            if (z9) {
                cnVar.Sc = true;
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
        cn cnVar = this.Q;
        int childCount = cnVar.f44700z0.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = cnVar.f44700z0.getChildAt(i7);
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
        cn cnVar = this.Q;
        if (org.telegram.messenger.t10.v(cnVar.f44446f) && cnVar.b() == 0 && !cnVar.Sc && cnVar.f44451f4 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z9) {
        boolean z10;
        boolean z11;
        cn cnVar = this.Q;
        ArrayList arrayList = cnVar.K6;
        if (org.telegram.messenger.r2.f25212a) {
            org.telegram.messenger.a8.b("notify data set changed fragmentOpened=" + cnVar.f44439e6);
        }
        if (z9 && cnVar.f44439e6) {
            v4.l0 itemAnimator = cnVar.f44700z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.f44700z0.setItemAnimator(ejVar);
            }
        } else {
            cnVar.f44700z0.setItemAnimator(null);
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
            if (ijVar.f23259j0) {
                size--;
            } else {
                TLRPC.Message message = ijVar.f23262k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z10 = true;
                    }
                }
            }
        }
        z10 = false;
        boolean[] zArr = cnVar.S6;
        if ((zArr[0] && (cnVar.f44399b7 == 0 || zArr[1])) || z10) {
            z11 = ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow;
            cnVar.a7(z11);
        }
    }

    public final void P(int i7, boolean z9) {
        boolean z10;
        org.telegram.messenger.ij messageObject;
        String str;
        if (org.telegram.messenger.r2.f25212a) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i7);
            if (z9) {
                str = " with thanos effect";
            } else {
                str = "";
            }
            org.telegram.ui.Cells.f1.u(str, sb2);
        }
        cn cnVar = this.Q;
        z10 = ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow;
        if (!z10) {
            cnVar.f44700z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = cnVar.f44700z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.f44700z0.setItemAnimator(ejVar);
            }
        }
        if (z9 && cnVar.A0 != null) {
            v4.l0 itemAnimator2 = cnVar.f44700z0.getItemAnimator();
            ej ejVar2 = cnVar.A0;
            if (itemAnimator2 == ejVar2) {
                v4.d1 K = cnVar.f44700z0.K(i7);
                if (K == null) {
                    ejVar2.getClass();
                } else {
                    ejVar2.S.add(K);
                    View view = K.f57056a;
                    if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view).getMessageObject()) != null) {
                        messageObject.f23217a0 = true;
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
        cn cnVar = this.Q;
        ArrayList arrayList = cnVar.K6;
        if (cnVar.B0 != null && !this.L && !this.N) {
            int i11 = 0;
            if (!cnVar.P4 && cnVar.Z7 != null) {
                int childCount = cnVar.f44700z0.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = cnVar.f44700z0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.messenger.ij messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        org.telegram.messenger.ij ijVar = cnVar.Z7;
                        if (messageObject == ijVar) {
                            if (arrayList.indexOf(ijVar) >= 0) {
                                i10 = arrayList.indexOf(cnVar.Z7) + this.J;
                                i11 = cnVar.g9(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            g(i7);
            if (i10 != -1) {
                cnVar.B0.h1(i10, i11);
            }
        }
    }

    public final org.telegram.ui.Cells.q1 R(org.telegram.messenger.ij ijVar, boolean z9, boolean z10) {
        ArrayList arrayList;
        cn cnVar = this.Q;
        if (z9) {
            int childCount = cnVar.f44700z0.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                View childAt = cnVar.f44700z0.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == ijVar && TextUtils.equals(q1Var.f30084y5, q1Var.P5.f23262k.post_author)) {
                        q1Var.w3(ijVar, q1Var.getCurrentMessagesGroup(), q1Var.H2(), q1Var.I2(), q1Var.z2(), q1Var.D2());
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
            arrayList = cnVar.K6;
        }
        int indexOf = arrayList.indexOf(ijVar2);
        if (indexOf == -1) {
            return null;
        }
        if (z10) {
            int i10 = cn.f44369md;
            cn.f44369md = i10 + 1;
            ijVar2.f23264k1 = i10;
            O(true);
            return null;
        }
        Q(this.J + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ll.S():void");
    }

    public final void T() {
        int i7 = this.f47634r;
        int i10 = this.f47637x;
        int i11 = this.D;
        int i12 = this.f47635s;
        int i13 = this.f47636w;
        int i14 = this.E;
        int i15 = this.F;
        int i16 = this.J;
        int i17 = this.K;
        int i18 = this.G;
        int i19 = this.H;
        int i20 = this.I;
        S();
        if (i7 == this.f47634r && i10 == this.f47637x && i14 == this.E && i15 == this.F && i16 == this.J && i17 == this.K && i12 == this.f47635s && i13 == this.f47636w && i11 == this.D && i18 == this.G && i19 == this.H && i20 == this.I) {
            return;
        }
        O(false);
    }

    @Override
    public final int b() {
        this.f47638y = -5;
        cn cnVar = this.Q;
        a0.h hVar = cnVar.f44630t8;
        if (cnVar.f44412c6.get(cnVar.f44602r4, 0) != 0) {
            TLRPC.User user = cnVar.f44446f;
            if (user == null || !user.bot || cnVar.f44451f4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(cnVar.f44446f.f27105id)).description == null && ((TL_bots.BotInfo) hVar.f(cnVar.f44446f.f27105id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(cnVar.f44446f.f27105id)).description_document == null)) && !org.telegram.messenger.t10.z(cnVar.f44446f) && !org.telegram.messenger.t10.u(cnVar.f44446f))) {
                return 0;
            }
            this.f47638y = 0;
            return 1;
        }
        return this.f47634r;
    }

    @Override
    public final long c(int i7) {
        ArrayList arrayList;
        cn cnVar = this.Q;
        if (cnVar.f44412c6.get(cnVar.f44602r4, 0) == 0 || i7 != this.f47638y) {
            if (this.L) {
                arrayList = this.M;
            } else if (this.N) {
                arrayList = this.P;
            } else {
                arrayList = cnVar.K6;
            }
            int i10 = this.J;
            if (i7 >= i10 && i7 < this.K) {
                return ((org.telegram.messenger.ij) arrayList.get(i7 - i10)).f23264k1;
            }
            if (i7 != this.f47637x && i7 != this.f47638y) {
                if (i7 == this.E) {
                    return 2L;
                }
                if (i7 == this.F) {
                    return 3L;
                }
                if (i7 == this.f47635s) {
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
                if (i7 == this.f47636w) {
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
        cn cnVar = this.Q;
        if (cnVar.f44412c6.get(cnVar.f44602r4, 0) == 0 || i7 != this.f47638y) {
            if (i7 != this.f47635s && i7 != this.f47636w) {
                int i10 = this.J;
                if (i7 >= i10 && i7 < this.K) {
                    if (this.L) {
                        arrayList = this.M;
                    } else if (this.N) {
                        arrayList = this.P;
                    } else {
                        arrayList = cnVar.K6;
                    }
                    return ((org.telegram.messenger.ij) arrayList.get(i7 - i10)).U;
                } else if (i7 == this.f47637x) {
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
        if (org.telegram.messenger.r2.f25212a) {
            org.telegram.messenger.a8.b("notify item changed " + i7);
        }
        cn cnVar = this.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow;
        if (z9 && !cnVar.f44393b1) {
            v4.l0 itemAnimator = cnVar.f44700z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.f44700z0.setItemAnimator(ejVar);
            }
        } else {
            cnVar.f44700z0.setItemAnimator(null);
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
        if (org.telegram.messenger.r2.f25212a) {
            org.telegram.messenger.a8.b("notify item inserted " + i7);
        }
        cn cnVar = this.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow;
        if (!z9) {
            cnVar.f44700z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = cnVar.f44700z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.f44700z0.setItemAnimator(ejVar);
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
        if (org.telegram.messenger.r2.f25212a) {
            org.telegram.messenger.a8.b("notify item moved" + i7 + ":" + i10);
        }
        cn cnVar = this.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow;
        if (!z9) {
            cnVar.f44700z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = cnVar.f44700z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.f44700z0.setItemAnimator(ejVar);
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
        if (org.telegram.messenger.r2.f25212a) {
            org.telegram.messenger.a8.b("notify item range changed " + i7 + ":" + i10);
        }
        cn cnVar = this.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow;
        if (!z9) {
            cnVar.f44700z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = cnVar.f44700z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.f44700z0.setItemAnimator(ejVar);
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
        cn cnVar = this.Q;
        ArrayList arrayList = cnVar.K6;
        if (org.telegram.messenger.r2.f25212a) {
            org.telegram.messenger.a8.b("notify item range inserted " + i7 + ":" + i10);
        }
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow;
        if (!z9) {
            cnVar.f44700z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = cnVar.f44700z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.f44700z0.setItemAnimator(ejVar);
            }
        }
        S();
        if (i7 == 1 && i10 > 0 && (i11 = i7 + i10) >= (i12 = this.J) && i11 < this.K) {
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i11 - i12);
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get((i11 - this.J) - 1);
            if ((cnVar.f44432e != null && ijVar.Z0() == ijVar2.Z0()) || (cnVar.f44446f != null && ijVar.P3() == ijVar2.P3())) {
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
        if (org.telegram.messenger.r2.f25212a) {
            org.telegram.messenger.a8.b("notify item range removed" + i7 + ":" + i10);
        }
        cn cnVar = this.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow;
        if (!z9) {
            cnVar.f44700z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = cnVar.f44700z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.f44700z0.setItemAnimator(ejVar);
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
        if (org.telegram.messenger.r2.f25212a) {
            org.telegram.messenger.a8.b("notify item removed " + i7);
        }
        cn cnVar = this.Q;
        z9 = ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow;
        if (!z9) {
            cnVar.f44700z0.setItemAnimator(null);
        } else {
            v4.l0 itemAnimator = cnVar.f44700z0.getItemAnimator();
            ej ejVar = cnVar.A0;
            if (itemAnimator != ejVar) {
                cnVar.f44700z0.setItemAnimator(ejVar);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ll.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.q1 q1Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.q1 q1Var2;
        int i13;
        cn cnVar = this.Q;
        if (i7 == 0) {
            i13 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
            q1Var = new org.telegram.ui.Cells.q1(this.h, i13, true, cnVar.Xa, cnVar.f44709za);
            q1Var.setResourcesProvider(cnVar.f44709za);
            if (cnVar.Uc == null) {
                cnVar.Uc = new nm(cnVar);
            }
            q1Var.setDelegate(cnVar.Uc);
            q1Var.Wb = cnVar.f44610rc;
            if (cnVar.h == null) {
                q1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i7 == 1) {
                ?? t0Var = new org.telegram.ui.Cells.t0(context, cnVar.f44709za, true);
                t0Var.setInvalidateColors(true);
                t0Var.setDelegate(new gl(this));
                q1Var = t0Var;
            } else {
                if (i7 == 2) {
                    ?? z1Var = new org.telegram.ui.Cells.z1(context, cnVar.f44709za);
                    q1Var2 = z1Var;
                    if (!cnVar.R9()) {
                        org.telegram.ui.ActionBar.s6.U(z1Var.getTextView(), org.telegram.ui.ActionBar.l6.f28170tf, cnVar.f44709za);
                        org.telegram.ui.ActionBar.s6.x(z1Var.getBackgroundLayout(), z1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.l6.f28190uf, cnVar.f44709za, PorterDuff.Mode.MULTIPLY);
                        q1Var2 = z1Var;
                    }
                } else if (i7 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    ?? hlVar = new hl(this, context, i12, cnVar.f44709za);
                    hlVar.setDelegate(new w0(this, 22));
                    q1Var2 = hlVar;
                } else if (i7 == 4) {
                    q1Var2 = new org.telegram.ui.Cells.w0(context, cnVar.f44709za);
                } else if (i7 == 6) {
                    i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    q1Var2 = new org.telegram.ui.Cells.ra(i11, context, cnVar.f44709za);
                } else if (i7 == 7) {
                    q1Var2 = new org.telegram.ui.Cells.t0(context, cnVar.f44709za, false);
                } else if (i7 == 8) {
                    i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    q1Var2 = new il(this, context, i10, cnVar.f44709za);
                } else if (i7 == 10) {
                    ?? y1Var = new org.telegram.ui.Cells.y1(context, cnVar.f44709za);
                    if (cnVar.Uc == null) {
                        cnVar.Uc = new nm(cnVar);
                    }
                    y1Var.setDelegate(cnVar.Uc);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ll.y(v4.d1):void");
    }
}
