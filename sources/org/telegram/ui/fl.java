package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class fl extends org.telegram.ui.Components.ti0 {
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
    public final wm R;
    public final Context h;
    public final boolean f45296n;
    public int f45297r;
    public int f45298s;
    public int f45299w;
    public int f45300x;
    public int f45301y;

    public fl(wm wmVar, Context context) {
        boolean z10;
        this.R = wmVar;
        this.f38422e = new ArrayList();
        this.f38423f = new ArrayList();
        this.f45298s = -5;
        this.f45299w = -5;
        this.f45300x = -5;
        this.f45301y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.J = -5;
        this.N = new ArrayList();
        this.Q = new ArrayList();
        this.h = context;
        TLRPC.User user = wmVar.f51306f;
        if (user != null && user.bot) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45296n = z10;
        C(true);
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    public final void K(boolean z10) {
        wm wmVar = this.R;
        if (org.telegram.messenger.l10.u(wmVar.f51306f)) {
            if (z10) {
                wmVar.Rc = true;
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

    public final void M(org.telegram.messenger.zi ziVar) {
        wm wmVar = this.R;
        int childCount = wmVar.A0.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = wmVar.A0.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == ziVar) {
                    q1Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean N() {
        wm wmVar = this.R;
        if (org.telegram.messenger.l10.v(wmVar.f51306f) && wmVar.b() == 0 && !wmVar.Rc && wmVar.f51325g4 == 0) {
            return true;
        }
        return false;
    }

    public final void O(boolean z10) {
        boolean z11;
        boolean z12;
        wm wmVar = this.R;
        ArrayList arrayList = wmVar.L6;
        if (org.telegram.messenger.r2.f25040a) {
            org.telegram.messenger.a8.b("notify data set changed fragmentOpened=" + wmVar.f51313f6);
        }
        if (z10 && wmVar.f51313f6) {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        } else {
            wmVar.A0.setItemAnimator(null);
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
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(size);
            if (ziVar.f26864j0) {
                size--;
            } else {
                TLRPC.Message message = ziVar.f26868k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z11 = true;
                    }
                }
            }
        }
        z11 = false;
        boolean[] zArr = wmVar.T6;
        if ((zArr[0] && (wmVar.f51272c7 == 0 || zArr[1])) || z11) {
            z12 = ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow;
            wmVar.Z6(z12);
        }
    }

    public final void P(int i3, boolean z10) {
        boolean z11;
        org.telegram.messenger.zi messageObject;
        String str;
        if (org.telegram.messenger.r2.f25040a) {
            StringBuilder sb2 = new StringBuilder("notify item removed ");
            sb2.append(i3);
            if (z10) {
                str = " with thanos effect";
            } else {
                str = "";
            }
            k2.p1.w(str, sb2);
        }
        wm wmVar = this.R;
        z11 = ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow;
        if (!z11) {
            wmVar.A0.setItemAnimator(null);
        } else {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        }
        if (z10 && wmVar.B0 != null) {
            u4.m0 itemAnimator2 = wmVar.A0.getItemAnimator();
            yi yiVar2 = wmVar.B0;
            if (itemAnimator2 == yiVar2) {
                u4.d1 K = wmVar.A0.K(i3);
                if (K == null) {
                    yiVar2.getClass();
                } else {
                    yiVar2.S.add(K);
                    View view = K.f55540a;
                    if ((view instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) view).getMessageObject()) != null) {
                        messageObject.f26823a0 = true;
                    }
                }
            }
        }
        S();
        try {
            super.s(i3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void Q(int i3) {
        int i10;
        wm wmVar = this.R;
        ArrayList arrayList = wmVar.L6;
        if (wmVar.C0 != null && !this.M && !this.O) {
            int i11 = 0;
            if (!wmVar.Q4 && wmVar.f51245a8 != null) {
                int childCount = wmVar.A0.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = wmVar.A0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.messenger.zi messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        org.telegram.messenger.zi ziVar = wmVar.f51245a8;
                        if (messageObject == ziVar) {
                            if (arrayList.indexOf(ziVar) >= 0) {
                                i10 = arrayList.indexOf(wmVar.f51245a8) + this.K;
                                i11 = wmVar.f9(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            g(i3);
            if (i10 != -1) {
                wmVar.C0.h1(i10, i11);
            }
        }
    }

    public final org.telegram.ui.Cells.q1 R(org.telegram.messenger.zi ziVar, boolean z10, boolean z11) {
        ArrayList arrayList;
        wm wmVar = this.R;
        if (z10) {
            int childCount = wmVar.A0.getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = wmVar.A0.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject() == ziVar && TextUtils.equals(q1Var.f30152y5, q1Var.P5.f26868k.post_author)) {
                        q1Var.u3(ziVar, q1Var.getCurrentMessagesGroup(), q1Var.G2(), q1Var.H2(), q1Var.z2(), q1Var.C2());
                        return q1Var;
                    }
                }
                i3++;
                ziVar = ziVar;
            }
        }
        org.telegram.messenger.zi ziVar2 = ziVar;
        if (this.M) {
            arrayList = this.N;
        } else if (this.O) {
            arrayList = this.Q;
        } else {
            arrayList = wmVar.L6;
        }
        int indexOf = arrayList.indexOf(ziVar2);
        if (indexOf == -1) {
            return null;
        }
        if (z11) {
            int i10 = wm.f51229ld;
            wm.f51229ld = i10 + 1;
            ziVar2.k1 = i10;
            O(true);
            return null;
        }
        Q(this.K + indexOf);
        return null;
    }

    public final void S() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fl.S():void");
    }

    public final void T() {
        int i3 = this.f45297r;
        int i10 = this.f45300x;
        int i11 = this.E;
        int i12 = this.f45298s;
        int i13 = this.f45299w;
        int i14 = this.F;
        int i15 = this.G;
        int i16 = this.K;
        int i17 = this.L;
        int i18 = this.H;
        int i19 = this.I;
        int i20 = this.J;
        S();
        if (i3 == this.f45297r && i10 == this.f45300x && i14 == this.F && i15 == this.G && i16 == this.K && i17 == this.L && i12 == this.f45298s && i13 == this.f45299w && i11 == this.E && i18 == this.H && i19 == this.I && i20 == this.J) {
            return;
        }
        O(false);
    }

    @Override
    public final int b() {
        this.f45301y = -5;
        wm wmVar = this.R;
        a0.h hVar = wmVar.f51503u8;
        if (wmVar.f51284d6.get(wmVar.f51475s4, 0) != 0) {
            TLRPC.User user = wmVar.f51306f;
            if (user == null || !user.bot || wmVar.f51325g4 != 0 || ((hVar.m() <= 0 || (((TL_bots.BotInfo) hVar.f(wmVar.f51306f.f27150id)).description == null && ((TL_bots.BotInfo) hVar.f(wmVar.f51306f.f27150id)).description_photo == null && ((TL_bots.BotInfo) hVar.f(wmVar.f51306f.f27150id)).description_document == null)) && !org.telegram.messenger.l10.z(wmVar.f51306f) && !org.telegram.messenger.l10.u(wmVar.f51306f))) {
                return 0;
            }
            this.f45301y = 0;
            return 1;
        }
        return this.f45297r;
    }

    @Override
    public final long c(int i3) {
        ArrayList arrayList;
        wm wmVar = this.R;
        if (wmVar.f51284d6.get(wmVar.f51475s4, 0) == 0 || i3 != this.f45301y) {
            if (this.M) {
                arrayList = this.N;
            } else if (this.O) {
                arrayList = this.Q;
            } else {
                arrayList = wmVar.L6;
            }
            int i10 = this.K;
            if (i3 >= i10 && i3 < this.L) {
                return ((org.telegram.messenger.zi) arrayList.get(i3 - i10)).k1;
            }
            if (i3 != this.f45300x && i3 != this.f45301y) {
                if (i3 == this.F) {
                    return 2L;
                }
                if (i3 == this.G) {
                    return 3L;
                }
                if (i3 == this.f45298s) {
                    return 4L;
                }
                if (i3 == this.E) {
                    return 6L;
                }
                if (i3 == this.H) {
                    return 7L;
                }
                if (i3 == this.I) {
                    return 8L;
                }
                if (i3 == this.J) {
                    return 9L;
                }
                if (i3 == this.f45299w) {
                    return 10L;
                }
                return 5L;
            }
            return 1L;
        }
        return 1L;
    }

    @Override
    public final int d(int i3) {
        ArrayList arrayList;
        wm wmVar = this.R;
        if (wmVar.f51284d6.get(wmVar.f51475s4, 0) == 0 || i3 != this.f45301y) {
            if (i3 != this.f45298s && i3 != this.f45299w) {
                int i10 = this.K;
                if (i3 >= i10 && i3 < this.L) {
                    if (this.M) {
                        arrayList = this.N;
                    } else if (this.O) {
                        arrayList = this.Q;
                    } else {
                        arrayList = wmVar.L6;
                    }
                    return ((org.telegram.messenger.zi) arrayList.get(i3 - i10)).U;
                } else if (i3 == this.f45300x) {
                    return 3;
                } else {
                    if (i3 == this.E) {
                        return 6;
                    }
                    if (i3 != this.I && i3 != this.H) {
                        if (i3 == this.J) {
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
    public final void g(int i3) {
        boolean z10;
        if (org.telegram.messenger.r2.f25040a) {
            org.telegram.messenger.a8.b("notify item changed " + i3);
        }
        wm wmVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow;
        if (z10 && !wmVar.f51267c1) {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        } else {
            wmVar.A0.setItemAnimator(null);
        }
        S();
        try {
            super.g(i3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void i(int i3) {
        boolean z10;
        if (org.telegram.messenger.r2.f25040a) {
            org.telegram.messenger.a8.b("notify item inserted " + i3);
        }
        wm wmVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow;
        if (!z10) {
            wmVar.A0.setItemAnimator(null);
        } else {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        }
        S();
        try {
            super.i(i3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void j(int i3, int i10) {
        boolean z10;
        if (org.telegram.messenger.r2.f25040a) {
            org.telegram.messenger.a8.b("notify item moved" + i3 + ":" + i10);
        }
        wm wmVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow;
        if (!z10) {
            wmVar.A0.setItemAnimator(null);
        } else {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        }
        S();
        try {
            super.j(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void k(int i3, int i10) {
        boolean z10;
        if (org.telegram.messenger.r2.f25040a) {
            org.telegram.messenger.a8.b("notify item range changed " + i3 + ":" + i10);
        }
        wm wmVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow;
        if (!z10) {
            wmVar.A0.setItemAnimator(null);
        } else {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        }
        S();
        try {
            super.k(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void o(int i3, int i10) {
        boolean z10;
        int i11;
        int i12;
        wm wmVar = this.R;
        ArrayList arrayList = wmVar.L6;
        if (org.telegram.messenger.r2.f25040a) {
            org.telegram.messenger.a8.b("notify item range inserted " + i3 + ":" + i10);
        }
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow;
        if (!z10) {
            wmVar.A0.setItemAnimator(null);
        } else {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        }
        S();
        if (i3 == 1 && i10 > 0 && (i11 = i3 + i10) >= (i12 = this.K) && i11 < this.L) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i11 - i12);
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get((i11 - this.K) - 1);
            if ((wmVar.f51292e != null && ziVar.Z0() == ziVar2.Z0()) || (wmVar.f51306f != null && ziVar.Q3() == ziVar2.Q3())) {
                g(i3);
            }
        }
        try {
            super.o(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void p(int i3, int i10) {
        boolean z10;
        if (org.telegram.messenger.r2.f25040a) {
            org.telegram.messenger.a8.b("notify item range removed" + i3 + ":" + i10);
        }
        wm wmVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow;
        if (!z10) {
            wmVar.A0.setItemAnimator(null);
        } else {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        }
        S();
        try {
            super.p(i3, i10);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void s(int i3) {
        boolean z10;
        if (org.telegram.messenger.r2.f25040a) {
            org.telegram.messenger.a8.b("notify item removed " + i3);
        }
        wm wmVar = this.R;
        z10 = ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow;
        if (!z10) {
            wmVar.A0.setItemAnimator(null);
        } else {
            u4.m0 itemAnimator = wmVar.A0.getItemAnimator();
            yi yiVar = wmVar.B0;
            if (itemAnimator != yiVar) {
                wmVar.A0.setItemAnimator(yiVar);
            }
        }
        S();
        try {
            super.s(i3);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void t(u4.d1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fl.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.q1 q1Var;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.Cells.q1 q1Var2;
        int i13;
        wm wmVar = this.R;
        if (i3 == 0) {
            i13 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            q1Var = new org.telegram.ui.Cells.q1(this.h, i13, true, wmVar.Wa, wmVar.f51557ya);
            q1Var.setResourcesProvider(wmVar.f51557ya);
            if (wmVar.Tc == null) {
                wmVar.Tc = new hm(wmVar);
            }
            q1Var.setDelegate(wmVar.Tc);
            q1Var.Wb = wmVar.f51457qc;
            if (wmVar.h == null) {
                q1Var.setAllowAssistant(true);
            }
        } else {
            Context context = this.h;
            if (i3 == 1) {
                ?? t0Var = new org.telegram.ui.Cells.t0(context, wmVar.f51557ya, true);
                t0Var.setInvalidateColors(true);
                t0Var.setDelegate(new al(this));
                q1Var = t0Var;
            } else {
                if (i3 == 2) {
                    ?? z1Var = new org.telegram.ui.Cells.z1(context, wmVar.f51557ya);
                    q1Var2 = z1Var;
                    if (!wmVar.Q9()) {
                        org.telegram.ui.ActionBar.r6.V(z1Var.getTextView(), org.telegram.ui.ActionBar.k6.f28185tf, wmVar.f51557ya);
                        org.telegram.ui.ActionBar.r6.y(z1Var.getBackgroundLayout(), z1Var.getBackgroundLayout().getBackground(), org.telegram.ui.ActionBar.k6.f28204uf, wmVar.f51557ya, PorterDuff.Mode.MULTIPLY);
                        q1Var2 = z1Var;
                    }
                } else if (i3 == 3) {
                    i12 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    ?? blVar = new bl(this, context, i12, wmVar.f51557ya);
                    blVar.setDelegate(new x0(this, 22));
                    q1Var2 = blVar;
                } else if (i3 == 4) {
                    q1Var2 = new org.telegram.ui.Cells.w0(context, wmVar.f51557ya);
                } else if (i3 == 6) {
                    i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    q1Var2 = new org.telegram.ui.Cells.ra(i11, context, wmVar.f51557ya);
                } else if (i3 == 7) {
                    q1Var2 = new org.telegram.ui.Cells.t0(context, wmVar.f51557ya, false);
                } else if (i3 == 8) {
                    i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    q1Var2 = new cl(this, context, i10, wmVar.f51557ya);
                } else if (i3 == 10) {
                    ?? y1Var = new org.telegram.ui.Cells.y1(context, wmVar.f51557ya);
                    if (wmVar.Tc == null) {
                        wmVar.Tc = new hm(wmVar);
                    }
                    y1Var.setDelegate(wmVar.Tc);
                    q1Var2 = y1Var;
                } else {
                    q1Var = null;
                }
                q1Var = q1Var2;
            }
        }
        return k2.p1.p(q1Var, q1Var, -1, -2);
    }

    @Override
    public final void y(u4.d1 r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fl.y(u4.d1):void");
    }
}
