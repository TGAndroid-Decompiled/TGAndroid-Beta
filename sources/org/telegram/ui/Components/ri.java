package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ri extends dk0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final ui L;
    public final Context f39236c;
    public int d;
    public int f39237e;
    public int f39238f;
    public final ArrayList h = new ArrayList();
    public int f39239n;
    public int f39240r;
    public int f39241s;
    public int f39242w;
    public int f39243x;
    public int f39244y;

    public ri(ui uiVar, Context context) {
        this.L = uiVar;
        this.f39236c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        int i7 = this.K;
        ui uiVar = this.L;
        if (uiVar.F3 == null && (uiVar.f40367a2 instanceof org.telegram.ui.bn) && !uiVar.C1) {
            return org.telegram.messenger.si.d0(uiVar.H3).f26836k1.size() + i7;
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.K) {
            return 1;
        }
        if (i7 >= this.f39237e && i7 < this.f39238f) {
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
        this.f39239n = -1;
        this.f39241s = -1;
        this.f39242w = -1;
        this.f39243x = -1;
        this.f39244y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.I = -1;
        this.J = -1;
        this.H = -1;
        this.f39237e = -1;
        this.f39238f = -1;
        this.f39240r = -1;
        ui uiVar = this.L;
        int i10 = uiVar.H3;
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40367a2;
        boolean z10 = true;
        if (uiVar.C1) {
            this.K = 1;
            this.d = 0;
            int i11 = uiVar.D1;
            if (i11 == 0 || c8.dd.a(i11, 16)) {
                int i12 = this.K;
                this.K = i12 + 1;
                this.f39239n = i12;
            }
            int i13 = uiVar.D1;
            if (i13 == 0 || c8.dd.a(i13, 8192)) {
                int i14 = this.K;
                this.K = i14 + 1;
                this.G = i14;
            }
            int i15 = uiVar.D1;
            if (i15 == 0 || c8.dd.a(i15, 16384)) {
                int i16 = this.K;
                this.K = i16 + 1;
                this.H = i16;
            }
            int i17 = uiVar.D1;
            if (i17 == 0 || c8.dd.a(i17, 8)) {
                int i18 = this.K;
                this.K = i18 + 1;
                this.f39241s = i18;
            }
            int i19 = uiVar.D1;
            if (i19 == 0 || c8.dd.a(i19, 64)) {
                int i20 = this.K;
                this.K = i20 + 1;
                this.F = i20;
            }
            int i21 = uiVar.D1;
            if (i21 == 0 || c8.dd.a(i21, 32768)) {
                int i22 = this.K;
                this.K = i22 + 1;
                this.I = i22;
            }
        } else if (!(g2Var instanceof org.telegram.ui.bn)) {
            this.d = 0;
            this.K = 2;
            this.f39239n = 1;
            if (uiVar.R1) {
                this.K = 3;
                this.f39241s = 2;
            }
        } else if (uiVar.F3 != null) {
            int i23 = uiVar.E3;
            if (i23 == -1) {
                this.d = 0;
                this.f39239n = 1;
                this.K = 3;
                this.f39241s = 2;
            } else {
                if (i23 == 0) {
                    this.K = 1;
                    this.d = 0;
                }
                if (i23 == 1) {
                    int i24 = this.K;
                    this.K = i24 + 1;
                    this.f39239n = i24;
                }
                if (i23 == 2) {
                    int i25 = this.K;
                    this.K = i25 + 1;
                    this.f39241s = i25;
                }
            }
        } else {
            TLRPC.User j3 = ((org.telegram.ui.bn) g2Var).j();
            if (g2Var instanceof org.telegram.ui.bn) {
                chat = ((org.telegram.ui.bn) g2Var).f46005e;
            } else {
                chat = null;
            }
            if (j3 == null || ((org.telegram.ui.bn) g2Var).getMessagesController().P1(j3.f28583id) <= 0) {
                z10 = false;
            }
            int i26 = this.K;
            this.d = i26;
            this.K = i26 + 2;
            this.f39239n = i26 + 1;
            if (((org.telegram.messenger.h0) org.telegram.messenger.np.u1(i10).A7.f26239p0.f14030b).f24341c && ((org.telegram.ui.bn) g2Var).f46036g4 == 0 && ui.h1(j3)) {
                int i27 = this.K;
                this.K = i27 + 1;
                this.f39240r = i27;
            }
            boolean z11 = uiVar.O3;
            if (z11) {
                int i28 = this.K;
                this.K = i28 + 1;
                this.F = i28;
            }
            if (z11) {
                org.telegram.messenger.np.u1(i10);
                boolean z12 = org.telegram.messenger.s2.f26730a;
                int i29 = this.K;
                this.K = i29 + 1;
                this.J = i29;
            }
            if (uiVar.M3) {
                int i30 = this.K;
                this.K = i30 + 1;
                this.f39242w = i30;
            }
            if (uiVar.O3) {
                int i31 = this.K;
                this.K = i31 + 1;
                this.f39244y = i31;
            }
            int i32 = this.K;
            int i33 = i32 + 1;
            this.K = i33;
            this.f39241s = i32;
            if (uiVar.N3) {
                this.K = i32 + 2;
                this.f39243x = i33;
            }
            if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).f46036g4 == 0 && j3 != null && !z10 && !j3.bot && !kg.v1.f(i10).f18545b.isEmpty()) {
                int i34 = this.K;
                this.K = i34 + 1;
                this.E = i34;
            }
            if ((uiVar.J3 || uiVar.K3) && !z10 && ((chat == null || !org.telegram.messenger.v3.p0(chat)) && (g2Var instanceof org.telegram.ui.bn) && !((org.telegram.ui.bn) g2Var).c() && !((org.telegram.ui.bn) g2Var).z())) {
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) g2Var;
                if (bnVar.f46036g4 != 5) {
                    this.f39237e = this.K;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = org.telegram.messenger.si.d0(i10).f26813b.bots;
                    int size = arrayList2.size();
                    while (i7 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i7);
                        i7++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = bnVar.f46005e;
                            if (tLObject == null) {
                                tLObject = bnVar.j();
                            }
                            if (org.telegram.messenger.si.v(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.K;
                    this.K = size2;
                    this.f39238f = size2;
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.f1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ri.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View oiVar;
        Context context = this.f39236c;
        ui uiVar = this.L;
        if (i7 != 0) {
            oiVar = new ni(uiVar, context);
        } else {
            oiVar = new oi(uiVar, context);
        }
        oiVar.setImportantForAccessibility(1);
        oiVar.setFocusable(true);
        oiVar.setLayoutParams(new v4.q0(-2, -1));
        return new v4.f1(oiVar);
    }

    @Override
    public final void y(v4.f1 f1Var) {
    }
}
