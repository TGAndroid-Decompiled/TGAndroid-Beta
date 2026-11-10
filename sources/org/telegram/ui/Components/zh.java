package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zh extends oj0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final ci K;
    public final Context f40997c;
    public int d;
    public int f40998e;
    public int f40999f;
    public final ArrayList h = new ArrayList();
    public int f41000n;
    public int f41001r;
    public int f41002s;
    public int f41003w;
    public int f41004x;
    public int f41005y;

    public zh(ci ciVar, Context context) {
        this.K = ciVar;
        this.f40997c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        int i7 = this.J;
        ci ciVar = this.K;
        if (ciVar.E3 == null && (ciVar.Z1 instanceof org.telegram.ui.cn) && !ciVar.B1) {
            return org.telegram.messenger.ui.b0(ciVar.G3).f25827j1.size() + i7;
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        if (i7 >= this.J) {
            return 1;
        }
        if (i7 >= this.f40998e && i7 < this.f40999f) {
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
        this.f41000n = -1;
        this.f41002s = -1;
        this.f41003w = -1;
        this.f41004x = -1;
        this.f41005y = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.G = -1;
        this.f40998e = -1;
        this.f40999f = -1;
        this.f41001r = -1;
        ci ciVar = this.K;
        int i10 = ciVar.G3;
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        boolean z9 = true;
        if (ciVar.B1) {
            this.J = 1;
            this.d = 0;
            int i11 = ciVar.C1;
            if (i11 == 0 || c8.zc.a(i11, 16)) {
                int i12 = this.J;
                this.J = i12 + 1;
                this.f41000n = i12;
            }
            int i13 = ciVar.C1;
            if (i13 == 0 || c8.zc.a(i13, 8192)) {
                int i14 = this.J;
                this.J = i14 + 1;
                this.F = i14;
            }
            int i15 = ciVar.C1;
            if (i15 == 0 || c8.zc.a(i15, 16384)) {
                int i16 = this.J;
                this.J = i16 + 1;
                this.G = i16;
            }
            int i17 = ciVar.C1;
            if (i17 == 0 || c8.zc.a(i17, 8)) {
                int i18 = this.J;
                this.J = i18 + 1;
                this.f41002s = i18;
            }
            int i19 = ciVar.C1;
            if (i19 == 0 || c8.zc.a(i19, 64)) {
                int i20 = this.J;
                this.J = i20 + 1;
                this.E = i20;
            }
            int i21 = ciVar.C1;
            if (i21 == 0 || c8.zc.a(i21, 32768)) {
                int i22 = this.J;
                this.J = i22 + 1;
                this.H = i22;
            }
        } else if (!(f2Var instanceof org.telegram.ui.cn)) {
            this.d = 0;
            this.J = 2;
            this.f41000n = 1;
            if (ciVar.Q1) {
                this.J = 3;
                this.f41002s = 2;
            }
        } else if (ciVar.E3 != null) {
            int i23 = ciVar.D3;
            if (i23 == -1) {
                this.d = 0;
                this.f41000n = 1;
                this.J = 3;
                this.f41002s = 2;
            } else {
                if (i23 == 0) {
                    this.J = 1;
                    this.d = 0;
                }
                if (i23 == 1) {
                    int i24 = this.J;
                    this.J = i24 + 1;
                    this.f41000n = i24;
                }
                if (i23 == 2) {
                    int i25 = this.J;
                    this.J = i25 + 1;
                    this.f41002s = i25;
                }
            }
        } else {
            TLRPC.User j3 = ((org.telegram.ui.cn) f2Var).j();
            if (f2Var instanceof org.telegram.ui.cn) {
                chat = ((org.telegram.ui.cn) f2Var).f44473e;
            } else {
                chat = null;
            }
            if (j3 == null || ((org.telegram.ui.cn) f2Var).getMessagesController().N1(j3.f27109id) <= 0) {
                z9 = false;
            }
            int i26 = this.J;
            this.d = i26;
            this.J = i26 + 2;
            this.f41000n = i26 + 1;
            if (((org.telegram.messenger.h0) org.telegram.messenger.qp.s1(i10).f24946x7.f24450j0.f13891b).f22784c && ((org.telegram.ui.cn) f2Var).f44492f4 == 0 && ci.g1(j3)) {
                int i27 = this.J;
                this.J = i27 + 1;
                this.f41001r = i27;
            }
            boolean z10 = ciVar.N3;
            if (z10) {
                int i28 = this.J;
                this.J = i28 + 1;
                this.E = i28;
            }
            if (z10) {
                org.telegram.messenger.qp.s1(i10);
                boolean z11 = org.telegram.messenger.r2.f25216a;
                int i29 = this.J;
                this.J = i29 + 1;
                this.I = i29;
            }
            if (ciVar.L3) {
                int i30 = this.J;
                this.J = i30 + 1;
                this.f41003w = i30;
            }
            if (ciVar.N3) {
                int i31 = this.J;
                this.J = i31 + 1;
                this.f41005y = i31;
            }
            int i32 = this.J;
            int i33 = i32 + 1;
            this.J = i33;
            this.f41002s = i32;
            if (ciVar.M3) {
                this.J = i32 + 2;
                this.f41004x = i33;
            }
            if ((f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).f44492f4 == 0 && j3 != null && !z9 && !j3.bot && !kg.t1.f(i10).f17551b.isEmpty()) {
                int i34 = this.J;
                this.J = i34 + 1;
                this.D = i34;
            }
            if ((ciVar.I3 || ciVar.J3) && !z9 && ((chat == null || !org.telegram.messenger.t3.p0(chat)) && (f2Var instanceof org.telegram.ui.cn) && !((org.telegram.ui.cn) f2Var).c() && !((org.telegram.ui.cn) f2Var).z())) {
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) f2Var;
                if (cnVar.f44492f4 != 5) {
                    this.f40998e = this.J;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = org.telegram.messenger.ui.b0(i10).f25806b.bots;
                    int size = arrayList2.size();
                    while (i7 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i7);
                        i7++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = cnVar.f44473e;
                            if (tLObject == null) {
                                tLObject = cnVar.j();
                            }
                            if (org.telegram.messenger.ui.t(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.J;
                    this.J = size2;
                    this.f40999f = size2;
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(v4.d1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zh.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View whVar;
        Context context = this.f40997c;
        ci ciVar = this.K;
        if (i7 != 0) {
            whVar = new vh(ciVar, context);
        } else {
            whVar = new wh(ciVar, context);
        }
        whVar.setImportantForAccessibility(1);
        whVar.setFocusable(true);
        whVar.setLayoutParams(new v4.o0(-2, -1));
        return new v4.d1(whVar);
    }

    @Override
    public final void y(v4.d1 d1Var) {
    }
}
