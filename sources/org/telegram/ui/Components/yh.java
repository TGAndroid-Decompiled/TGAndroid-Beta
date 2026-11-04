package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yh extends sj0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final bi L;
    public final Context f40714c;
    public int d;
    public int f40715e;
    public int f40716f;
    public final ArrayList h = new ArrayList();
    public int f40717n;
    public int f40718r;
    public int f40719s;
    public int f40720w;
    public int f40721x;
    public int f40722y;

    public yh(bi biVar, Context context) {
        this.L = biVar;
        this.f40714c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        int i3 = this.K;
        bi biVar = this.L;
        if (biVar.C3 == null && (biVar.X1 instanceof org.telegram.ui.wm) && !biVar.f32298z1) {
            return org.telegram.messenger.li.b0(biVar.E3).k1.size() + i3;
        }
        return i3;
    }

    @Override
    public final int d(int i3) {
        if (i3 >= this.K) {
            return 1;
        }
        if (i3 >= this.f40715e && i3 < this.f40716f) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        TLRPC.Chat chat;
        int i3 = 0;
        this.K = 0;
        this.d = -1;
        this.f40717n = -1;
        this.f40719s = -1;
        this.f40720w = -1;
        this.f40721x = -1;
        this.f40722y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.I = -1;
        this.J = -1;
        this.H = -1;
        this.f40715e = -1;
        this.f40716f = -1;
        this.f40718r = -1;
        bi biVar = this.L;
        int i10 = biVar.E3;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        boolean z10 = true;
        if (biVar.f32298z1) {
            this.K = 1;
            this.d = 0;
            int i11 = biVar.A1;
            if (i11 == 0 || x7.u.a(i11, 16)) {
                int i12 = this.K;
                this.K = i12 + 1;
                this.f40717n = i12;
            }
            int i13 = biVar.A1;
            if (i13 == 0 || x7.u.a(i13, 8192)) {
                int i14 = this.K;
                this.K = i14 + 1;
                this.G = i14;
            }
            int i15 = biVar.A1;
            if (i15 == 0 || x7.u.a(i15, 16384)) {
                int i16 = this.K;
                this.K = i16 + 1;
                this.H = i16;
            }
            int i17 = biVar.A1;
            if (i17 == 0 || x7.u.a(i17, 8)) {
                int i18 = this.K;
                this.K = i18 + 1;
                this.f40719s = i18;
            }
            int i19 = biVar.A1;
            if (i19 == 0 || x7.u.a(i19, 64)) {
                int i20 = this.K;
                this.K = i20 + 1;
                this.F = i20;
            }
            int i21 = biVar.A1;
            if (i21 == 0 || x7.u.a(i21, 32768)) {
                int i22 = this.K;
                this.K = i22 + 1;
                this.I = i22;
            }
        } else if (!(d2Var instanceof org.telegram.ui.wm)) {
            this.d = 0;
            this.K = 2;
            this.f40717n = 1;
            if (biVar.O1) {
                this.K = 3;
                this.f40719s = 2;
            }
        } else if (biVar.C3 != null) {
            int i23 = biVar.B3;
            if (i23 == -1) {
                this.d = 0;
                this.f40717n = 1;
                this.K = 3;
                this.f40719s = 2;
            } else {
                if (i23 == 0) {
                    this.K = 1;
                    this.d = 0;
                }
                if (i23 == 1) {
                    int i24 = this.K;
                    this.K = i24 + 1;
                    this.f40717n = i24;
                }
                if (i23 == 2) {
                    int i25 = this.K;
                    this.K = i25 + 1;
                    this.f40719s = i25;
                }
            }
        } else {
            TLRPC.User j10 = ((org.telegram.ui.wm) d2Var).j();
            if (d2Var instanceof org.telegram.ui.wm) {
                chat = ((org.telegram.ui.wm) d2Var).f51292e;
            } else {
                chat = null;
            }
            if (j10 == null || ((org.telegram.ui.wm) d2Var).getMessagesController().N1(j10.f27150id) <= 0) {
                z10 = false;
            }
            int i26 = this.K;
            this.d = i26;
            this.K = i26 + 2;
            this.f40717n = i26 + 1;
            if (((org.telegram.messenger.h0) org.telegram.messenger.hp.s1(i10).f23167x7.f24662j0.f13688b).f22814c && ((org.telegram.ui.wm) d2Var).f51325g4 == 0 && bi.g1(j10)) {
                int i27 = this.K;
                this.K = i27 + 1;
                this.f40718r = i27;
            }
            boolean z11 = biVar.L3;
            if (z11) {
                int i28 = this.K;
                this.K = i28 + 1;
                this.F = i28;
            }
            if (z11) {
                org.telegram.messenger.hp.s1(i10);
                boolean z12 = org.telegram.messenger.r2.f25040a;
                int i29 = this.K;
                this.K = i29 + 1;
                this.J = i29;
            }
            if (biVar.J3) {
                int i30 = this.K;
                this.K = i30 + 1;
                this.f40720w = i30;
            }
            if (biVar.L3) {
                int i31 = this.K;
                this.K = i31 + 1;
                this.f40722y = i31;
            }
            int i32 = this.K;
            int i33 = i32 + 1;
            this.K = i33;
            this.f40719s = i32;
            if (biVar.K3) {
                this.K = i32 + 2;
                this.f40721x = i33;
            }
            if ((d2Var instanceof org.telegram.ui.wm) && ((org.telegram.ui.wm) d2Var).f51325g4 == 0 && j10 != null && !z10 && !j10.bot && !lg.u1.f(i10).f18485b.isEmpty()) {
                int i34 = this.K;
                this.K = i34 + 1;
                this.E = i34;
            }
            if ((biVar.G3 || biVar.H3) && !z10 && ((chat == null || !org.telegram.messenger.t3.p0(chat)) && (d2Var instanceof org.telegram.ui.wm) && !((org.telegram.ui.wm) d2Var).c() && !((org.telegram.ui.wm) d2Var).z())) {
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) d2Var;
                if (wmVar.f51325g4 != 5) {
                    this.f40715e = this.K;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = org.telegram.messenger.li.b0(i10).f24011b.bots;
                    int size = arrayList2.size();
                    while (i3 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i3);
                        i3++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = wmVar.f51292e;
                            if (tLObject == null) {
                                tLObject = wmVar.j();
                            }
                            if (org.telegram.messenger.li.t(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.K;
                    this.K = size2;
                    this.f40716f = size2;
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(u4.d1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yh.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View vhVar;
        Context context = this.f40714c;
        bi biVar = this.L;
        if (i3 != 0) {
            vhVar = new uh(biVar, context);
        } else {
            vhVar = new vh(biVar, context);
        }
        vhVar.setImportantForAccessibility(1);
        vhVar.setFocusable(true);
        vhVar.setLayoutParams(new u4.p0(-2, -1));
        return new u4.d1(vhVar);
    }

    @Override
    public final void y(u4.d1 d1Var) {
    }
}
