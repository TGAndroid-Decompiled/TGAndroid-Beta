package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vi extends qm0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final yi K;
    public final Context f31879c;
    public int d;
    public int f31880e;
    public int f31881f;
    public final ArrayList h = new ArrayList();
    public int f31882n;
    public int f31883r;
    public int f31884s;
    public int v;
    public int f31885w;
    public int f31886x;
    public int f31887y;

    public vi(yi yiVar, Context context) {
        this.K = yiVar;
        this.f31879c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.J;
        yi yiVar = this.K;
        if (yiVar.K1 == null && (yiVar.f33289f0 instanceof org.telegram.ui.zn) && !yiVar.H) {
            return MediaDataController.getInstance(yiVar.M1).inlineBots.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.J) {
            return 1;
        }
        if (i10 >= this.f31880e && i10 < this.f31881f) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        TLRPC.Chat chat;
        int i10 = 0;
        this.J = 0;
        this.d = -1;
        this.f31882n = -1;
        this.f31884s = -1;
        this.v = -1;
        this.f31885w = -1;
        this.f31886x = -1;
        this.f31887y = -1;
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.G = -1;
        this.f31880e = -1;
        this.f31881f = -1;
        this.f31883r = -1;
        yi yiVar = this.K;
        int i11 = yiVar.M1;
        org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
        boolean z10 = true;
        if (yiVar.H) {
            this.J = 1;
            this.d = 0;
            int i12 = yiVar.I;
            if (i12 == 0 || w7.g0.a(i12, 16)) {
                int i13 = this.J;
                this.J = i13 + 1;
                this.f31882n = i13;
            }
            int i14 = yiVar.I;
            if (i14 == 0 || w7.g0.a(i14, 8192)) {
                int i15 = this.J;
                this.J = i15 + 1;
                this.F = i15;
            }
            int i16 = yiVar.I;
            if (i16 == 0 || w7.g0.a(i16, 16384)) {
                int i17 = this.J;
                this.J = i17 + 1;
                this.G = i17;
            }
            int i18 = yiVar.I;
            if (i18 == 0 || w7.g0.a(i18, 8)) {
                int i19 = this.J;
                this.J = i19 + 1;
                this.f31884s = i19;
            }
            int i20 = yiVar.I;
            if (i20 == 0 || w7.g0.a(i20, 64)) {
                int i21 = this.J;
                this.J = i21 + 1;
                this.E = i21;
            }
            int i22 = yiVar.I;
            if (i22 == 0 || w7.g0.a(i22, 32768)) {
                int i23 = this.J;
                this.J = i23 + 1;
                this.H = i23;
            }
        } else if (!(m2Var instanceof org.telegram.ui.zn)) {
            this.d = 0;
            this.J = 2;
            this.f31882n = 1;
            if (yiVar.W) {
                this.J = 3;
                this.f31884s = 2;
            }
        } else if (yiVar.K1 != null) {
            int i24 = yiVar.J1;
            if (i24 == -1) {
                this.d = 0;
                this.f31882n = 1;
                this.J = 3;
                this.f31884s = 2;
            } else {
                if (i24 == 0) {
                    this.J = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.J;
                    this.J = i25 + 1;
                    this.f31882n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.J;
                    this.J = i26 + 1;
                    this.f31884s = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.zn) m2Var).i();
            if (m2Var instanceof org.telegram.ui.zn) {
                chat = ((org.telegram.ui.zn) m2Var).f44786e;
            } else {
                chat = null;
            }
            if (i27 == null || ((org.telegram.ui.zn) m2Var).getMessagesController().getSendPaidMessagesStars(i27.f20215id) <= 0) {
                z10 = false;
            }
            int i28 = this.J;
            this.d = i28;
            this.J = i28 + 2;
            this.f31882n = i28 + 1;
            if (MessagesController.getInstance(i11).config.walletAvailable.get() && ((org.telegram.ui.zn) m2Var).R3 == 0 && yi.v1(i27)) {
                int i29 = this.J;
                this.J = i29 + 1;
                this.f31883r = i29;
            }
            boolean z11 = yiVar.T1;
            if (z11) {
                int i30 = this.J;
                this.J = i30 + 1;
                this.E = i30;
            }
            if (z11 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.J;
                this.J = i31 + 1;
                this.I = i31;
            }
            if (yiVar.R1) {
                int i32 = this.J;
                this.J = i32 + 1;
                this.v = i32;
            }
            if (yiVar.T1) {
                int i33 = this.J;
                this.J = i33 + 1;
                this.f31886x = i33;
            }
            int i34 = this.J;
            int i35 = i34 + 1;
            this.J = i35;
            this.f31884s = i34;
            if (yiVar.S1) {
                this.J = i34 + 2;
                this.f31885w = i35;
            }
            if ((m2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) m2Var).R3 == 0 && i27 != null && !z10 && !i27.bot && !hg.c2.f(i11).f11182b.isEmpty()) {
                int i36 = this.J;
                this.J = i36 + 1;
                this.f31887y = i36;
            }
            if ((yiVar.O1 || yiVar.P1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (m2Var instanceof org.telegram.ui.zn) && !((org.telegram.ui.zn) m2Var).c() && !((org.telegram.ui.zn) m2Var).v())) {
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) m2Var;
                if (znVar.R3 != 5) {
                    this.f31880e = this.J;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i11).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = znVar.f44786e;
                            if (tLObject == null) {
                                tLObject = znVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.J;
                    this.J = size2;
                    this.f31881f = size2;
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.d1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View siVar;
        Context context = this.f31879c;
        yi yiVar = this.K;
        if (i10 != 0) {
            siVar = new ri(yiVar, context);
        } else {
            siVar = new si(yiVar, context);
        }
        siVar.setImportantForAccessibility(1);
        siVar.setFocusable(true);
        siVar.setLayoutParams(new s4.q0(-2, -1));
        return new s4.d1(siVar);
    }

    @Override
    public final void y(s4.d1 d1Var) {
    }
}
