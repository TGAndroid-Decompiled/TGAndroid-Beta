package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qi extends dk0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final ti L;
    public final Context f38884c;
    public int d;
    public int f38885e;
    public int f38886f;
    public final ArrayList h = new ArrayList();
    public int f38887n;
    public int f38888r;
    public int f38889s;
    public int f38890w;
    public int f38891x;
    public int f38892y;

    public qi(ti tiVar, Context context) {
        this.L = tiVar;
        this.f38884c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        int i7 = this.K;
        ti tiVar = this.L;
        if (tiVar.F3 == null && (tiVar.f39956a2 instanceof org.telegram.ui.bn) && !tiVar.C1) {
            return org.telegram.messenger.ri.d0(tiVar.H3).f26723k1.size() + i7;
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.K) {
            return 1;
        }
        if (i7 >= this.f38885e && i7 < this.f38886f) {
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
        this.f38887n = -1;
        this.f38889s = -1;
        this.f38890w = -1;
        this.f38891x = -1;
        this.f38892y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.I = -1;
        this.J = -1;
        this.H = -1;
        this.f38885e = -1;
        this.f38886f = -1;
        this.f38888r = -1;
        ti tiVar = this.L;
        int i10 = tiVar.H3;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
        boolean z10 = true;
        if (tiVar.C1) {
            this.K = 1;
            this.d = 0;
            int i11 = tiVar.D1;
            if (i11 == 0 || c8.ed.a(i11, 16)) {
                int i12 = this.K;
                this.K = i12 + 1;
                this.f38887n = i12;
            }
            int i13 = tiVar.D1;
            if (i13 == 0 || c8.ed.a(i13, 8192)) {
                int i14 = this.K;
                this.K = i14 + 1;
                this.G = i14;
            }
            int i15 = tiVar.D1;
            if (i15 == 0 || c8.ed.a(i15, 16384)) {
                int i16 = this.K;
                this.K = i16 + 1;
                this.H = i16;
            }
            int i17 = tiVar.D1;
            if (i17 == 0 || c8.ed.a(i17, 8)) {
                int i18 = this.K;
                this.K = i18 + 1;
                this.f38889s = i18;
            }
            int i19 = tiVar.D1;
            if (i19 == 0 || c8.ed.a(i19, 64)) {
                int i20 = this.K;
                this.K = i20 + 1;
                this.F = i20;
            }
            int i21 = tiVar.D1;
            if (i21 == 0 || c8.ed.a(i21, 32768)) {
                int i22 = this.K;
                this.K = i22 + 1;
                this.I = i22;
            }
        } else if (!(g2Var instanceof org.telegram.ui.bn)) {
            this.d = 0;
            this.K = 2;
            this.f38887n = 1;
            if (tiVar.R1) {
                this.K = 3;
                this.f38889s = 2;
            }
        } else if (tiVar.F3 != null) {
            int i23 = tiVar.E3;
            if (i23 == -1) {
                this.d = 0;
                this.f38887n = 1;
                this.K = 3;
                this.f38889s = 2;
            } else {
                if (i23 == 0) {
                    this.K = 1;
                    this.d = 0;
                }
                if (i23 == 1) {
                    int i24 = this.K;
                    this.K = i24 + 1;
                    this.f38887n = i24;
                }
                if (i23 == 2) {
                    int i25 = this.K;
                    this.K = i25 + 1;
                    this.f38889s = i25;
                }
            }
        } else {
            TLRPC.User j3 = ((org.telegram.ui.bn) g2Var).j();
            if (g2Var instanceof org.telegram.ui.bn) {
                chat = ((org.telegram.ui.bn) g2Var).f46173e;
            } else {
                chat = null;
            }
            if (j3 == null || ((org.telegram.ui.bn) g2Var).getMessagesController().P1(j3.f28641id) <= 0) {
                z10 = false;
            }
            int i26 = this.K;
            this.d = i26;
            this.K = i26 + 2;
            this.f38887n = i26 + 1;
            if (((org.telegram.messenger.h0) org.telegram.messenger.mp.u1(i10).A7.f26254p0.f17372b).f24439c && ((org.telegram.ui.bn) g2Var).f46204g4 == 0 && ti.h1(j3)) {
                int i27 = this.K;
                this.K = i27 + 1;
                this.f38888r = i27;
            }
            boolean z11 = tiVar.O3;
            if (z11) {
                int i28 = this.K;
                this.K = i28 + 1;
                this.F = i28;
            }
            if (z11) {
                org.telegram.messenger.mp.u1(i10);
                boolean z12 = org.telegram.messenger.s2.f26829a;
                int i29 = this.K;
                this.K = i29 + 1;
                this.J = i29;
            }
            if (tiVar.M3) {
                int i30 = this.K;
                this.K = i30 + 1;
                this.f38890w = i30;
            }
            if (tiVar.O3) {
                int i31 = this.K;
                this.K = i31 + 1;
                this.f38892y = i31;
            }
            int i32 = this.K;
            int i33 = i32 + 1;
            this.K = i33;
            this.f38889s = i32;
            if (tiVar.N3) {
                this.K = i32 + 2;
                this.f38891x = i33;
            }
            if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).f46204g4 == 0 && j3 != null && !z10 && !j3.bot && !kg.w1.f(i10).f18615b.isEmpty()) {
                int i34 = this.K;
                this.K = i34 + 1;
                this.E = i34;
            }
            if ((tiVar.J3 || tiVar.K3) && !z10 && ((chat == null || !org.telegram.messenger.v3.p0(chat)) && (g2Var instanceof org.telegram.ui.bn) && !((org.telegram.ui.bn) g2Var).c() && !((org.telegram.ui.bn) g2Var).y())) {
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
                if (bnVar.f46204g4 != 5) {
                    this.f38885e = this.K;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = org.telegram.messenger.ri.d0(i10).f26700b.bots;
                    int size = arrayList2.size();
                    while (i7 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i7);
                        i7++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = bnVar.f46173e;
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
                    this.f38886f = size2;
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.f1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qi.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View niVar;
        Context context = this.f38884c;
        ti tiVar = this.L;
        if (i7 != 0) {
            niVar = new mi(tiVar, context);
        } else {
            niVar = new ni(tiVar, context);
        }
        niVar.setImportantForAccessibility(1);
        niVar.setFocusable(true);
        niVar.setLayoutParams(new v4.q0(-2, -1));
        return new v4.f1(niVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
    }
}
