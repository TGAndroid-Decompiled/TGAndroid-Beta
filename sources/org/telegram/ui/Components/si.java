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
public final class si extends kl0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final vi J;
    public final Context f30326c;
    public int d;
    public int f30327e;
    public int f30328f;
    public final ArrayList h = new ArrayList();
    public int f30329n;
    public int f30330r;
    public int f30331s;
    public int v;
    public int f30332w;
    public int f30333x;
    public int f30334y;

    public si(vi viVar, Context context) {
        this.J = viVar;
        this.f30326c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.I;
        vi viVar = this.J;
        if (viVar.H1 == null && (viVar.f31306f0 instanceof org.telegram.ui.co) && !viVar.H) {
            return MediaDataController.getInstance(viVar.J1).inlineBots.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.I) {
            return 1;
        }
        if (i10 >= this.f30327e && i10 < this.f30328f) {
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
        this.f30329n = -1;
        this.f30330r = -1;
        this.f30331s = -1;
        this.v = -1;
        this.f30332w = -1;
        this.f30333x = -1;
        this.f30334y = -1;
        this.E = -1;
        this.G = -1;
        this.H = -1;
        this.F = -1;
        this.f30327e = -1;
        this.f30328f = -1;
        vi viVar = this.J;
        int i11 = viVar.J1;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
        boolean z10 = true;
        if (viVar.H) {
            this.I = 1;
            this.d = 0;
            int i12 = viVar.I;
            if (i12 == 0 || w7.b0.a(i12, 16)) {
                int i13 = this.I;
                this.I = i13 + 1;
                this.f30329n = i13;
            }
            int i14 = viVar.I;
            if (i14 == 0 || w7.b0.a(i14, 8192)) {
                int i15 = this.I;
                this.I = i15 + 1;
                this.E = i15;
            }
            int i16 = viVar.I;
            if (i16 == 0 || w7.b0.a(i16, 16384)) {
                int i17 = this.I;
                this.I = i17 + 1;
                this.F = i17;
            }
            int i18 = viVar.I;
            if (i18 == 0 || w7.b0.a(i18, 8)) {
                int i19 = this.I;
                this.I = i19 + 1;
                this.f30330r = i19;
            }
            int i20 = viVar.I;
            if (i20 == 0 || w7.b0.a(i20, 64)) {
                int i21 = this.I;
                this.I = i21 + 1;
                this.f30334y = i21;
            }
            int i22 = viVar.I;
            if (i22 == 0 || w7.b0.a(i22, 32768)) {
                int i23 = this.I;
                this.I = i23 + 1;
                this.G = i23;
            }
        } else if (!(n2Var instanceof org.telegram.ui.co)) {
            this.d = 0;
            this.I = 2;
            this.f30329n = 1;
            if (viVar.W) {
                this.I = 3;
                this.f30330r = 2;
            }
        } else if (viVar.H1 != null) {
            int i24 = viVar.G1;
            if (i24 == -1) {
                this.d = 0;
                this.f30329n = 1;
                this.I = 3;
                this.f30330r = 2;
            } else {
                if (i24 == 0) {
                    this.I = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.I;
                    this.I = i25 + 1;
                    this.f30329n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.I;
                    this.I = i26 + 1;
                    this.f30330r = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.co) n2Var).i();
            if (n2Var instanceof org.telegram.ui.co) {
                chat = ((org.telegram.ui.co) n2Var).f35264e;
            } else {
                chat = null;
            }
            z10 = (i27 == null || ((org.telegram.ui.co) n2Var).getMessagesController().getSendPaidMessagesStars(i27.f20043id) <= 0) ? false : false;
            int i28 = this.I;
            this.I = i28 + 1;
            this.d = i28;
            if ((viVar.L1 || viVar.M1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (n2Var instanceof org.telegram.ui.co) && !((org.telegram.ui.co) n2Var).c() && !((org.telegram.ui.co) n2Var).v())) {
                org.telegram.ui.co coVar = (org.telegram.ui.co) n2Var;
                if (coVar.R3 != 5) {
                    this.f30327e = this.I;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i11).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = coVar.f35264e;
                            if (tLObject == null) {
                                tLObject = coVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.I;
                    this.I = size2;
                    this.f30328f = size2;
                }
            }
            int i29 = this.I;
            int i30 = i29 + 1;
            this.I = i30;
            this.f30329n = i29;
            boolean z11 = viVar.Q1;
            if (z11) {
                this.I = i29 + 2;
                this.f30334y = i30;
            }
            if (z11 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.I;
                this.I = i31 + 1;
                this.H = i31;
            }
            if (viVar.O1) {
                int i32 = this.I;
                this.I = i32 + 1;
                this.f30331s = i32;
            }
            if (viVar.P1) {
                int i33 = this.I;
                this.I = i33 + 1;
                this.v = i33;
            }
            if (viVar.Q1) {
                int i34 = this.I;
                this.I = i34 + 1;
                this.f30332w = i34;
            }
            if ((n2Var instanceof org.telegram.ui.co) && ((org.telegram.ui.co) n2Var).R3 == 0 && i27 != null && !z10 && !i27.bot && !ig.b2.f(i11).f12033b.isEmpty()) {
                int i35 = this.I;
                this.I = i35 + 1;
                this.f30333x = i35;
            }
            int i36 = this.I;
            this.I = i36 + 1;
            this.f30330r = i36;
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View piVar;
        Context context = this.f30326c;
        vi viVar = this.J;
        if (i10 != 0) {
            piVar = new oi(viVar, context);
        } else {
            piVar = new pi(viVar, context);
        }
        piVar.setImportantForAccessibility(1);
        piVar.setFocusable(true);
        piVar.setLayoutParams(new s4.p0(-2, -1));
        return new s4.c1(piVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
    }
}
