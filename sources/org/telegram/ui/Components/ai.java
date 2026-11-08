package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ai extends oj0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final di K;
    public final Context f31829c;
    public int d;
    public int f31830e;
    public int f31831f;
    public final ArrayList h = new ArrayList();
    public int f31832n;
    public int f31833r;
    public int f31834s;
    public int f31835w;
    public int f31836x;
    public int f31837y;

    public ai(di diVar, Context context) {
        this.K = diVar;
        this.f31829c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        int i7 = this.J;
        di diVar = this.K;
        if (diVar.B3 == null && (diVar.W1 instanceof org.telegram.ui.an) && !diVar.f33015y1) {
            return org.telegram.messenger.ui.b0(diVar.D3).f25823j1.size() + i7;
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.J) {
            return 1;
        }
        if (i7 >= this.f31830e && i7 < this.f31831f) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        TLRPC.Chat chat;
        int i7 = 0;
        this.J = 0;
        this.d = -1;
        this.f31832n = -1;
        this.f31834s = -1;
        this.f31835w = -1;
        this.f31836x = -1;
        this.f31837y = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.G = -1;
        this.f31830e = -1;
        this.f31831f = -1;
        this.f31833r = -1;
        di diVar = this.K;
        int i10 = diVar.D3;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        boolean z9 = true;
        if (diVar.f33015y1) {
            this.J = 1;
            this.d = 0;
            int i11 = diVar.f33019z1;
            if (i11 == 0 || c8.zc.a(i11, 16)) {
                int i12 = this.J;
                this.J = i12 + 1;
                this.f31832n = i12;
            }
            int i13 = diVar.f33019z1;
            if (i13 == 0 || c8.zc.a(i13, 8192)) {
                int i14 = this.J;
                this.J = i14 + 1;
                this.F = i14;
            }
            int i15 = diVar.f33019z1;
            if (i15 == 0 || c8.zc.a(i15, 16384)) {
                int i16 = this.J;
                this.J = i16 + 1;
                this.G = i16;
            }
            int i17 = diVar.f33019z1;
            if (i17 == 0 || c8.zc.a(i17, 8)) {
                int i18 = this.J;
                this.J = i18 + 1;
                this.f31834s = i18;
            }
            int i19 = diVar.f33019z1;
            if (i19 == 0 || c8.zc.a(i19, 64)) {
                int i20 = this.J;
                this.J = i20 + 1;
                this.E = i20;
            }
            int i21 = diVar.f33019z1;
            if (i21 == 0 || c8.zc.a(i21, 32768)) {
                int i22 = this.J;
                this.J = i22 + 1;
                this.H = i22;
            }
        } else if (!(f2Var instanceof org.telegram.ui.an)) {
            this.d = 0;
            this.J = 2;
            this.f31832n = 1;
            if (diVar.N1) {
                this.J = 3;
                this.f31834s = 2;
            }
        } else if (diVar.B3 != null) {
            int i23 = diVar.A3;
            if (i23 == -1) {
                this.d = 0;
                this.f31832n = 1;
                this.J = 3;
                this.f31834s = 2;
            } else {
                if (i23 == 0) {
                    this.J = 1;
                    this.d = 0;
                }
                if (i23 == 1) {
                    int i24 = this.J;
                    this.J = i24 + 1;
                    this.f31832n = i24;
                }
                if (i23 == 2) {
                    int i25 = this.J;
                    this.J = i25 + 1;
                    this.f31834s = i25;
                }
            }
        } else {
            TLRPC.User j3 = ((org.telegram.ui.an) f2Var).j();
            if (f2Var instanceof org.telegram.ui.an) {
                chat = ((org.telegram.ui.an) f2Var).f43777e;
            } else {
                chat = null;
            }
            if (j3 == null || ((org.telegram.ui.an) f2Var).getMessagesController().N1(j3.f27105id) <= 0) {
                z9 = false;
            }
            int i26 = this.J;
            this.d = i26;
            this.J = i26 + 2;
            this.f31832n = i26 + 1;
            if (((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i10).f24942x7.f24446j0.f13889b).f22780c && ((org.telegram.ui.an) f2Var).f43796f4 == 0 && di.g1(j3)) {
                int i27 = this.J;
                this.J = i27 + 1;
                this.f31833r = i27;
            }
            boolean z10 = diVar.K3;
            if (z10) {
                int i28 = this.J;
                this.J = i28 + 1;
                this.E = i28;
            }
            if (z10) {
                org.telegram.messenger.qp.s1(i10);
                boolean z11 = org.telegram.messenger.r2.f25212a;
                int i29 = this.J;
                this.J = i29 + 1;
                this.I = i29;
            }
            if (diVar.I3) {
                int i30 = this.J;
                this.J = i30 + 1;
                this.f31835w = i30;
            }
            if (diVar.K3) {
                int i31 = this.J;
                this.J = i31 + 1;
                this.f31837y = i31;
            }
            int i32 = this.J;
            int i33 = i32 + 1;
            this.J = i33;
            this.f31834s = i32;
            if (diVar.J3) {
                this.J = i32 + 2;
                this.f31836x = i33;
            }
            if ((f2Var instanceof org.telegram.ui.an) && ((org.telegram.ui.an) f2Var).f43796f4 == 0 && j3 != null && !z9 && !j3.bot && !kg.t1.f(i10).f17548b.isEmpty()) {
                int i34 = this.J;
                this.J = i34 + 1;
                this.D = i34;
            }
            if ((diVar.F3 || diVar.G3) && !z9 && ((chat == null || !org.telegram.messenger.t3.p0(chat)) && (f2Var instanceof org.telegram.ui.an) && !((org.telegram.ui.an) f2Var).c() && !((org.telegram.ui.an) f2Var).z())) {
                org.telegram.ui.an anVar = (org.telegram.ui.an) f2Var;
                if (anVar.f43796f4 != 5) {
                    this.f31830e = this.J;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = org.telegram.messenger.ui.b0(i10).f25802b.bots;
                    int size = arrayList2.size();
                    while (i7 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i7);
                        i7++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = anVar.f43777e;
                            if (tLObject == null) {
                                tLObject = anVar.j();
                            }
                            if (org.telegram.messenger.ui.t(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.J;
                    this.J = size2;
                    this.f31831f = size2;
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.d1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ai.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View xhVar;
        Context context = this.f31829c;
        di diVar = this.K;
        if (i7 != 0) {
            xhVar = new wh(diVar, context);
        } else {
            xhVar = new xh(diVar, context);
        }
        xhVar.setImportantForAccessibility(1);
        xhVar.setFocusable(true);
        xhVar.setLayoutParams(new v4.o0(-2, -1));
        return new v4.d1(xhVar);
    }

    @Override
    public final void y(v4.d1 d1Var) {
    }
}
