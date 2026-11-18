package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pi extends bk0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final si L;
    public final Context f38443c;
    public int d;
    public int f38444e;
    public int f38445f;
    public final ArrayList h = new ArrayList();
    public int f38446n;
    public int f38447r;
    public int f38448s;
    public int f38449w;
    public int f38450x;
    public int f38451y;

    public pi(si siVar, Context context) {
        this.L = siVar;
        this.f38443c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        int i7 = this.K;
        si siVar = this.L;
        if (siVar.F3 == null && (siVar.f39659a2 instanceof org.telegram.ui.bn) && !siVar.C1) {
            return org.telegram.messenger.ri.d0(siVar.H3).f26622k1.size() + i7;
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.K) {
            return 1;
        }
        if (i7 >= this.f38444e && i7 < this.f38445f) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        TLRPC.Chat chat;
        int i7 = 0;
        this.K = 0;
        this.d = -1;
        this.f38446n = -1;
        this.f38448s = -1;
        this.f38449w = -1;
        this.f38450x = -1;
        this.f38451y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.I = -1;
        this.J = -1;
        this.H = -1;
        this.f38444e = -1;
        this.f38445f = -1;
        this.f38447r = -1;
        si siVar = this.L;
        int i10 = siVar.H3;
        org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
        boolean z10 = true;
        if (siVar.C1) {
            this.K = 1;
            this.d = 0;
            int i11 = siVar.D1;
            if (i11 == 0 || c8.dd.a(i11, 16)) {
                int i12 = this.K;
                this.K = i12 + 1;
                this.f38446n = i12;
            }
            int i13 = siVar.D1;
            if (i13 == 0 || c8.dd.a(i13, 8192)) {
                int i14 = this.K;
                this.K = i14 + 1;
                this.G = i14;
            }
            int i15 = siVar.D1;
            if (i15 == 0 || c8.dd.a(i15, 16384)) {
                int i16 = this.K;
                this.K = i16 + 1;
                this.H = i16;
            }
            int i17 = siVar.D1;
            if (i17 == 0 || c8.dd.a(i17, 8)) {
                int i18 = this.K;
                this.K = i18 + 1;
                this.f38448s = i18;
            }
            int i19 = siVar.D1;
            if (i19 == 0 || c8.dd.a(i19, 64)) {
                int i20 = this.K;
                this.K = i20 + 1;
                this.F = i20;
            }
            int i21 = siVar.D1;
            if (i21 == 0 || c8.dd.a(i21, 32768)) {
                int i22 = this.K;
                this.K = i22 + 1;
                this.I = i22;
            }
        } else if (!(h2Var instanceof org.telegram.ui.bn)) {
            this.d = 0;
            this.K = 2;
            this.f38446n = 1;
            if (siVar.R1) {
                this.K = 3;
                this.f38448s = 2;
            }
        } else if (siVar.F3 != null) {
            int i23 = siVar.E3;
            if (i23 == -1) {
                this.d = 0;
                this.f38446n = 1;
                this.K = 3;
                this.f38448s = 2;
            } else {
                if (i23 == 0) {
                    this.K = 1;
                    this.d = 0;
                }
                if (i23 == 1) {
                    int i24 = this.K;
                    this.K = i24 + 1;
                    this.f38446n = i24;
                }
                if (i23 == 2) {
                    int i25 = this.K;
                    this.K = i25 + 1;
                    this.f38448s = i25;
                }
            }
        } else {
            TLRPC.User j3 = ((org.telegram.ui.bn) h2Var).j();
            if (h2Var instanceof org.telegram.ui.bn) {
                chat = ((org.telegram.ui.bn) h2Var).f45978e;
            } else {
                chat = null;
            }
            if (j3 == null || ((org.telegram.ui.bn) h2Var).getMessagesController().P1(j3.f28552id) <= 0) {
                z10 = false;
            }
            int i26 = this.K;
            this.d = i26;
            this.K = i26 + 2;
            this.f38446n = i26 + 1;
            if (((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i10).A7.f26159p0.f13998b).f24336c && ((org.telegram.ui.bn) h2Var).f46009g4 == 0 && si.h1(j3)) {
                int i27 = this.K;
                this.K = i27 + 1;
                this.f38447r = i27;
            }
            boolean z11 = siVar.O3;
            if (z11) {
                int i28 = this.K;
                this.K = i28 + 1;
                this.F = i28;
            }
            if (z11) {
                org.telegram.messenger.mp.u1(i10);
                boolean z12 = org.telegram.messenger.s2.f26721a;
                int i29 = this.K;
                this.K = i29 + 1;
                this.J = i29;
            }
            if (siVar.M3) {
                int i30 = this.K;
                this.K = i30 + 1;
                this.f38449w = i30;
            }
            if (siVar.O3) {
                int i31 = this.K;
                this.K = i31 + 1;
                this.f38451y = i31;
            }
            int i32 = this.K;
            int i33 = i32 + 1;
            this.K = i33;
            this.f38448s = i32;
            if (siVar.N3) {
                this.K = i32 + 2;
                this.f38450x = i33;
            }
            if ((h2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) h2Var).f46009g4 == 0 && j3 != null && !z10 && !j3.bot && !kg.w1.f(i10).f18520b.isEmpty()) {
                int i34 = this.K;
                this.K = i34 + 1;
                this.E = i34;
            }
            if ((siVar.J3 || siVar.K3) && !z10 && ((chat == null || !org.telegram.messenger.v3.p0(chat)) && (h2Var instanceof org.telegram.ui.bn) && !((org.telegram.ui.bn) h2Var).c() && !((org.telegram.ui.bn) h2Var).z())) {
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) h2Var;
                if (bnVar.f46009g4 != 5) {
                    this.f38444e = this.K;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = org.telegram.messenger.ri.d0(i10).f26599b.bots;
                    int size = arrayList2.size();
                    while (i7 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i7);
                        i7++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = bnVar.f45978e;
                            if (tLObject == null) {
                                tLObject = bnVar.j();
                            }
                            if (org.telegram.messenger.ri.v(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.K;
                    this.K = size2;
                    this.f38445f = size2;
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.f1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pi.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View miVar;
        Context context = this.f38443c;
        si siVar = this.L;
        if (i7 != 0) {
            miVar = new li(siVar, context);
        } else {
            miVar = new mi(siVar, context);
        }
        miVar.setImportantForAccessibility(1);
        miVar.setFocusable(true);
        miVar.setLayoutParams(new v4.q0(-2, -1));
        return new v4.f1(miVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
    }
}
