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
public final class vi extends ul0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final yi J;
    public final Context f27938c;
    public int d;
    public int e;
    public int f27939f;
    public final ArrayList h = new ArrayList();
    public int f27940n;
    public int f27941r;
    public int f27942s;
    public int v;
    public int f27943w;
    public int f27944x;
    public int f27945y;

    public vi(yi yiVar, Context context) {
        this.J = yiVar;
        this.f27938c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.I;
        yi yiVar = this.J;
        if (yiVar.H1 == null && (yiVar.f29366f0 instanceof org.telegram.ui.eo) && !yiVar.H) {
            return MediaDataController.getInstance(yiVar.J1).inlineBots.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.I) {
            return 1;
        }
        if (i10 >= this.e && i10 < this.f27939f) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        TLRPC.Chat chat;
        int i10 = 0;
        this.I = 0;
        this.d = -1;
        this.f27940n = -1;
        this.f27941r = -1;
        this.f27942s = -1;
        this.v = -1;
        this.f27943w = -1;
        this.f27944x = -1;
        this.f27945y = -1;
        this.E = -1;
        this.G = -1;
        this.H = -1;
        this.F = -1;
        this.e = -1;
        this.f27939f = -1;
        yi yiVar = this.J;
        int i11 = yiVar.J1;
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
        boolean z10 = true;
        if (yiVar.H) {
            this.I = 1;
            this.d = 0;
            int i12 = yiVar.I;
            if (i12 == 0 || w7.c0.a(i12, 16)) {
                int i13 = this.I;
                this.I = i13 + 1;
                this.f27940n = i13;
            }
            int i14 = yiVar.I;
            if (i14 == 0 || w7.c0.a(i14, 8192)) {
                int i15 = this.I;
                this.I = i15 + 1;
                this.E = i15;
            }
            int i16 = yiVar.I;
            if (i16 == 0 || w7.c0.a(i16, 16384)) {
                int i17 = this.I;
                this.I = i17 + 1;
                this.F = i17;
            }
            int i18 = yiVar.I;
            if (i18 == 0 || w7.c0.a(i18, 8)) {
                int i19 = this.I;
                this.I = i19 + 1;
                this.f27941r = i19;
            }
            int i20 = yiVar.I;
            if (i20 == 0 || w7.c0.a(i20, 64)) {
                int i21 = this.I;
                this.I = i21 + 1;
                this.f27945y = i21;
            }
            int i22 = yiVar.I;
            if (i22 == 0 || w7.c0.a(i22, 32768)) {
                int i23 = this.I;
                this.I = i23 + 1;
                this.G = i23;
            }
        } else if (!(p2Var instanceof org.telegram.ui.eo)) {
            this.d = 0;
            this.I = 2;
            this.f27940n = 1;
            if (yiVar.W) {
                this.I = 3;
                this.f27941r = 2;
            }
        } else if (yiVar.H1 != null) {
            int i24 = yiVar.G1;
            if (i24 == -1) {
                this.d = 0;
                this.f27940n = 1;
                this.I = 3;
                this.f27941r = 2;
            } else {
                if (i24 == 0) {
                    this.I = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.I;
                    this.I = i25 + 1;
                    this.f27940n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.I;
                    this.I = i26 + 1;
                    this.f27941r = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.eo) p2Var).i();
            if (p2Var instanceof org.telegram.ui.eo) {
                chat = ((org.telegram.ui.eo) p2Var).e;
            } else {
                chat = null;
            }
            z10 = (i27 == null || ((org.telegram.ui.eo) p2Var).getMessagesController().getSendPaidMessagesStars(i27.f17342id) <= 0) ? false : false;
            int i28 = this.I;
            this.I = i28 + 1;
            this.d = i28;
            if ((yiVar.L1 || yiVar.M1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (p2Var instanceof org.telegram.ui.eo) && !((org.telegram.ui.eo) p2Var).c() && !((org.telegram.ui.eo) p2Var).u())) {
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) p2Var;
                if (eoVar.R3 != 5) {
                    this.e = this.I;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i11).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = eoVar.e;
                            if (tLObject == null) {
                                tLObject = eoVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.I;
                    this.I = size2;
                    this.f27939f = size2;
                }
            }
            int i29 = this.I;
            int i30 = i29 + 1;
            this.I = i30;
            this.f27940n = i29;
            boolean z11 = yiVar.Q1;
            if (z11) {
                this.I = i29 + 2;
                this.f27945y = i30;
            }
            if (z11 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.I;
                this.I = i31 + 1;
                this.H = i31;
            }
            if (yiVar.O1) {
                int i32 = this.I;
                this.I = i32 + 1;
                this.f27942s = i32;
            }
            if (yiVar.P1) {
                int i33 = this.I;
                this.I = i33 + 1;
                this.v = i33;
            }
            if (yiVar.Q1) {
                int i34 = this.I;
                this.I = i34 + 1;
                this.f27943w = i34;
            }
            if ((p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).R3 == 0 && i27 != null && !z10 && !i27.bot && !gg.k2.f(i11).f8938b.isEmpty()) {
                int i35 = this.I;
                this.I = i35 + 1;
                this.f27944x = i35;
            }
            int i36 = this.I;
            this.I = i36 + 1;
            this.f27941r = i36;
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vi.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View siVar;
        Context context = this.f27938c;
        yi yiVar = this.J;
        if (i10 != 0) {
            siVar = new ri(yiVar, context);
        } else {
            siVar = new si(yiVar, context);
        }
        siVar.setImportantForAccessibility(1);
        siVar.setFocusable(true);
        siVar.setLayoutParams(new s4.p0(-2, -1));
        return new s4.c1(siVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
    }
}
