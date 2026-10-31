package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh extends sk0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final bi K;
    public final Context f33060c;
    public int d;
    public int e;
    public int f33061f;
    public final ArrayList h = new ArrayList();
    public int f33062n;
    public int f33063r;
    public int f33064s;
    public int f33065w;
    public int f33066x;
    public int f33067y;

    public zh(bi biVar, Context context) {
        this.K = biVar;
        this.f33060c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int b() {
        int i10 = this.J;
        bi biVar = this.K;
        if (biVar.B3 == null && (biVar.W1 instanceof org.telegram.ui.un) && !biVar.f24744y1) {
            return org.telegram.messenger.ui.b0(biVar.D3).f18327j1.size() + i10;
        }
        return i10;
    }

    @Override
    public final int d(int i10) {
        if (i10 >= this.J) {
            return 1;
        }
        if (i10 >= this.e && i10 < this.f33061f) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        TLRPC.Chat chat;
        int i10 = 0;
        this.J = 0;
        this.d = -1;
        this.f33062n = -1;
        this.f33064s = -1;
        this.f33065w = -1;
        this.f33066x = -1;
        this.f33067y = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.G = -1;
        this.e = -1;
        this.f33061f = -1;
        this.f33063r = -1;
        bi biVar = this.K;
        int i11 = biVar.D3;
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        boolean z10 = true;
        if (biVar.f24744y1) {
            this.J = 1;
            this.d = 0;
            int i12 = biVar.f24747z1;
            if (i12 == 0 || v7.u7.a(i12, 16)) {
                int i13 = this.J;
                this.J = i13 + 1;
                this.f33062n = i13;
            }
            int i14 = biVar.f24747z1;
            if (i14 == 0 || v7.u7.a(i14, 8192)) {
                int i15 = this.J;
                this.J = i15 + 1;
                this.F = i15;
            }
            int i16 = biVar.f24747z1;
            if (i16 == 0 || v7.u7.a(i16, 16384)) {
                int i17 = this.J;
                this.J = i17 + 1;
                this.G = i17;
            }
            int i18 = biVar.f24747z1;
            if (i18 == 0 || v7.u7.a(i18, 8)) {
                int i19 = this.J;
                this.J = i19 + 1;
                this.f33064s = i19;
            }
            int i20 = biVar.f24747z1;
            if (i20 == 0 || v7.u7.a(i20, 64)) {
                int i21 = this.J;
                this.J = i21 + 1;
                this.E = i21;
            }
            int i22 = biVar.f24747z1;
            if (i22 == 0 || v7.u7.a(i22, 32768)) {
                int i23 = this.J;
                this.J = i23 + 1;
                this.H = i23;
            }
        } else if (!(k2Var instanceof org.telegram.ui.un)) {
            this.d = 0;
            this.J = 2;
            this.f33062n = 1;
            if (biVar.N1) {
                this.J = 3;
                this.f33064s = 2;
            }
        } else if (biVar.B3 != null) {
            int i24 = biVar.A3;
            if (i24 == -1) {
                this.d = 0;
                this.f33062n = 1;
                this.J = 3;
                this.f33064s = 2;
            } else {
                if (i24 == 0) {
                    this.J = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.J;
                    this.J = i25 + 1;
                    this.f33062n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.J;
                    this.J = i26 + 1;
                    this.f33064s = i26;
                }
            }
        } else {
            TLRPC.User j10 = ((org.telegram.ui.un) k2Var).j();
            if (k2Var instanceof org.telegram.ui.un) {
                chat = ((org.telegram.ui.un) k2Var).e;
            } else {
                chat = null;
            }
            if (j10 == null || ((org.telegram.ui.un) k2Var).getMessagesController().M1(j10.f19942id) <= 0) {
                z10 = false;
            }
            int i27 = this.J;
            this.d = i27;
            this.J = i27 + 2;
            this.f33062n = i27 + 1;
            if (((org.telegram.messenger.j0) org.telegram.messenger.vp.r1(i11).f18957y7.f17841j0.f11587b).f16204c && ((org.telegram.ui.un) k2Var).f42248f4 == 0 && bi.f1(j10)) {
                int i28 = this.J;
                this.J = i28 + 1;
                this.f33063r = i28;
            }
            boolean z11 = biVar.K3;
            if (z11) {
                int i29 = this.J;
                this.J = i29 + 1;
                this.E = i29;
            }
            if (z11) {
                org.telegram.messenger.vp.r1(i11);
                boolean z12 = org.telegram.messenger.v2.f18448a;
                int i30 = this.J;
                this.J = i30 + 1;
                this.I = i30;
            }
            if (biVar.I3) {
                int i31 = this.J;
                this.J = i31 + 1;
                this.f33065w = i31;
            }
            if (biVar.K3) {
                int i32 = this.J;
                this.J = i32 + 1;
                this.f33067y = i32;
            }
            int i33 = this.J;
            int i34 = i33 + 1;
            this.J = i34;
            this.f33064s = i33;
            if (biVar.J3) {
                this.J = i33 + 2;
                this.f33066x = i34;
            }
            if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).f42248f4 == 0 && j10 != null && !z10 && !j10.bot && !ag.i3.f(i11).f567b.isEmpty()) {
                int i35 = this.J;
                this.J = i35 + 1;
                this.D = i35;
            }
            if ((biVar.F3 || biVar.G3) && !z10 && ((chat == null || !org.telegram.messenger.w3.p0(chat)) && (k2Var instanceof org.telegram.ui.un) && !((org.telegram.ui.un) k2Var).c() && !((org.telegram.ui.un) k2Var).z())) {
                org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
                if (unVar.f42248f4 != 5) {
                    this.e = this.J;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = org.telegram.messenger.ui.b0(i11).f18307b.bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = unVar.e;
                            if (tLObject == null) {
                                tLObject = unVar.j();
                            }
                            if (org.telegram.messenger.ui.t(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.J;
                    this.J = size2;
                    this.f33061f = size2;
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(s4.c1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zh.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View whVar;
        Context context = this.f33060c;
        bi biVar = this.K;
        if (i10 != 0) {
            whVar = new vh(biVar, context);
        } else {
            whVar = new wh(biVar, context);
        }
        whVar.setImportantForAccessibility(1);
        whVar.setFocusable(true);
        whVar.setLayoutParams(new s4.o0(-2, -1));
        return new s4.c1(whVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
    }
}
