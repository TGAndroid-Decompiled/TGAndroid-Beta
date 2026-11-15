package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hi extends tj0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final ki L;
    public final Context f35258c;
    public int d;
    public int f35259e;
    public int f35260f;
    public final ArrayList h = new ArrayList();
    public int f35261n;
    public int f35262r;
    public int f35263s;
    public int f35264w;
    public int f35265x;
    public int f35266y;

    public hi(ki kiVar, Context context) {
        this.L = kiVar;
        this.f35258c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final int b() {
        int i7 = this.K;
        ki kiVar = this.L;
        if (kiVar.F3 == null && (kiVar.f36436a2 instanceof org.telegram.ui.an) && !kiVar.C1) {
            return org.telegram.messenger.si.b0(kiVar.H3).f26484k1.size() + i7;
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.K) {
            return 1;
        }
        if (i7 >= this.f35259e && i7 < this.f35260f) {
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
        this.f35261n = -1;
        this.f35263s = -1;
        this.f35264w = -1;
        this.f35265x = -1;
        this.f35266y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.I = -1;
        this.J = -1;
        this.H = -1;
        this.f35259e = -1;
        this.f35260f = -1;
        this.f35262r = -1;
        ki kiVar = this.L;
        int i10 = kiVar.H3;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36436a2;
        boolean z10 = true;
        if (kiVar.C1) {
            this.K = 1;
            this.d = 0;
            int i11 = kiVar.D1;
            if (i11 == 0 || c8.zc.a(i11, 16)) {
                int i12 = this.K;
                this.K = i12 + 1;
                this.f35261n = i12;
            }
            int i13 = kiVar.D1;
            if (i13 == 0 || c8.zc.a(i13, 8192)) {
                int i14 = this.K;
                this.K = i14 + 1;
                this.G = i14;
            }
            int i15 = kiVar.D1;
            if (i15 == 0 || c8.zc.a(i15, 16384)) {
                int i16 = this.K;
                this.K = i16 + 1;
                this.H = i16;
            }
            int i17 = kiVar.D1;
            if (i17 == 0 || c8.zc.a(i17, 8)) {
                int i18 = this.K;
                this.K = i18 + 1;
                this.f35263s = i18;
            }
            int i19 = kiVar.D1;
            if (i19 == 0 || c8.zc.a(i19, 64)) {
                int i20 = this.K;
                this.K = i20 + 1;
                this.F = i20;
            }
            int i21 = kiVar.D1;
            if (i21 == 0 || c8.zc.a(i21, 32768)) {
                int i22 = this.K;
                this.K = i22 + 1;
                this.I = i22;
            }
        } else if (!(e2Var instanceof org.telegram.ui.an)) {
            this.d = 0;
            this.K = 2;
            this.f35261n = 1;
            if (kiVar.R1) {
                this.K = 3;
                this.f35263s = 2;
            }
        } else if (kiVar.F3 != null) {
            int i23 = kiVar.E3;
            if (i23 == -1) {
                this.d = 0;
                this.f35261n = 1;
                this.K = 3;
                this.f35263s = 2;
            } else {
                if (i23 == 0) {
                    this.K = 1;
                    this.d = 0;
                }
                if (i23 == 1) {
                    int i24 = this.K;
                    this.K = i24 + 1;
                    this.f35261n = i24;
                }
                if (i23 == 2) {
                    int i25 = this.K;
                    this.K = i25 + 1;
                    this.f35263s = i25;
                }
            }
        } else {
            TLRPC.User j3 = ((org.telegram.ui.an) e2Var).j();
            if (e2Var instanceof org.telegram.ui.an) {
                chat = ((org.telegram.ui.an) e2Var).f45173e;
            } else {
                chat = null;
            }
            if (j3 == null || ((org.telegram.ui.an) e2Var).getMessagesController().N1(j3.f28200id) <= 0) {
                z10 = false;
            }
            int i26 = this.K;
            this.d = i26;
            this.K = i26 + 2;
            this.f35261n = i26 + 1;
            if (((org.telegram.messenger.h0) org.telegram.messenger.np.s1(i10).f25448y7.f25852j0.f14544b).f24006c && ((org.telegram.ui.an) e2Var).f45204g4 == 0 && ki.g1(j3)) {
                int i27 = this.K;
                this.K = i27 + 1;
                this.f35262r = i27;
            }
            boolean z11 = kiVar.O3;
            if (z11) {
                int i28 = this.K;
                this.K = i28 + 1;
                this.F = i28;
            }
            if (z11) {
                org.telegram.messenger.np.s1(i10);
                boolean z12 = org.telegram.messenger.r2.f26198a;
                int i29 = this.K;
                this.K = i29 + 1;
                this.J = i29;
            }
            if (kiVar.M3) {
                int i30 = this.K;
                this.K = i30 + 1;
                this.f35264w = i30;
            }
            if (kiVar.O3) {
                int i31 = this.K;
                this.K = i31 + 1;
                this.f35266y = i31;
            }
            int i32 = this.K;
            int i33 = i32 + 1;
            this.K = i33;
            this.f35263s = i32;
            if (kiVar.N3) {
                this.K = i32 + 2;
                this.f35265x = i33;
            }
            if ((e2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) e2Var).f45204g4 == 0 && j3 != null && !z10 && !j3.bot && !kg.v1.f(i10).f18124b.isEmpty()) {
                int i34 = this.K;
                this.K = i34 + 1;
                this.E = i34;
            }
            if ((kiVar.J3 || kiVar.K3) && !z10 && ((chat == null || !org.telegram.messenger.t3.p0(chat)) && (e2Var instanceof org.telegram.ui.an) && !((org.telegram.ui.an) e2Var).c() && !((org.telegram.ui.an) e2Var).z())) {
                org.telegram.ui.an anVar = (org.telegram.ui.an) e2Var;
                if (anVar.f45204g4 != 5) {
                    this.f35259e = this.K;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = org.telegram.messenger.si.b0(i10).f26461b.bots;
                    int size = arrayList2.size();
                    while (i7 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i7);
                        i7++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = anVar.f45173e;
                            if (tLObject == null) {
                                tLObject = anVar.j();
                            }
                            if (org.telegram.messenger.si.t(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.K;
                    this.K = size2;
                    this.f35260f = size2;
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.e1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hi.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View eiVar;
        Context context = this.f35258c;
        ki kiVar = this.L;
        if (i7 != 0) {
            eiVar = new di(kiVar, context);
        } else {
            eiVar = new ei(kiVar, context);
        }
        eiVar.setImportantForAccessibility(1);
        eiVar.setFocusable(true);
        eiVar.setLayoutParams(new v4.p0(-2, -1));
        return new v4.e1(eiVar);
    }

    @Override
    public final void y(v4.e1 e1Var) {
    }
}
