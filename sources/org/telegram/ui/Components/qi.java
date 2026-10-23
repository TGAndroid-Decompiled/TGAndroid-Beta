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
public final class qi extends im0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final ti K;
    public final Context f29605c;
    public int d;
    public int e;
    public int f29606f;
    public final ArrayList h = new ArrayList();
    public int f29607n;
    public int f29608r;
    public int f29609s;
    public int v;
    public int f29610w;
    public int f29611x;
    public int f29612y;

    public qi(ti tiVar, Context context) {
        this.K = tiVar;
        this.f29605c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.J;
        ti tiVar = this.K;
        if (tiVar.K1 == null && (tiVar.f30550f0 instanceof org.telegram.ui.qn) && !tiVar.H) {
            return MediaDataController.getInstance(tiVar.M1).inlineBots.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.J) {
            return 1;
        }
        if (i10 >= this.e && i10 < this.f29606f) {
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
        this.f29607n = -1;
        this.f29609s = -1;
        this.v = -1;
        this.f29610w = -1;
        this.f29611x = -1;
        this.f29612y = -1;
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.G = -1;
        this.e = -1;
        this.f29606f = -1;
        this.f29608r = -1;
        ti tiVar = this.K;
        int i11 = tiVar.M1;
        org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30550f0;
        boolean z10 = true;
        if (tiVar.H) {
            this.J = 1;
            this.d = 0;
            int i12 = tiVar.I;
            if (i12 == 0 || w7.j6.a(i12, 16)) {
                int i13 = this.J;
                this.J = i13 + 1;
                this.f29607n = i13;
            }
            int i14 = tiVar.I;
            if (i14 == 0 || w7.j6.a(i14, 8192)) {
                int i15 = this.J;
                this.J = i15 + 1;
                this.F = i15;
            }
            int i16 = tiVar.I;
            if (i16 == 0 || w7.j6.a(i16, 16384)) {
                int i17 = this.J;
                this.J = i17 + 1;
                this.G = i17;
            }
            int i18 = tiVar.I;
            if (i18 == 0 || w7.j6.a(i18, 8)) {
                int i19 = this.J;
                this.J = i19 + 1;
                this.f29609s = i19;
            }
            int i20 = tiVar.I;
            if (i20 == 0 || w7.j6.a(i20, 64)) {
                int i21 = this.J;
                this.J = i21 + 1;
                this.E = i21;
            }
            int i22 = tiVar.I;
            if (i22 == 0 || w7.j6.a(i22, 32768)) {
                int i23 = this.J;
                this.J = i23 + 1;
                this.H = i23;
            }
        } else if (!(n2Var instanceof org.telegram.ui.qn)) {
            this.d = 0;
            this.J = 2;
            this.f29607n = 1;
            if (tiVar.W) {
                this.J = 3;
                this.f29609s = 2;
            }
        } else if (tiVar.K1 != null) {
            int i24 = tiVar.J1;
            if (i24 == -1) {
                this.d = 0;
                this.f29607n = 1;
                this.J = 3;
                this.f29609s = 2;
            } else {
                if (i24 == 0) {
                    this.J = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.J;
                    this.J = i25 + 1;
                    this.f29607n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.J;
                    this.J = i26 + 1;
                    this.f29609s = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.qn) n2Var).i();
            if (n2Var instanceof org.telegram.ui.qn) {
                chat = ((org.telegram.ui.qn) n2Var).e;
            } else {
                chat = null;
            }
            if (i27 == null || ((org.telegram.ui.qn) n2Var).getMessagesController().getSendPaidMessagesStars(i27.f20427id) <= 0) {
                z10 = false;
            }
            int i28 = this.J;
            this.d = i28;
            this.J = i28 + 2;
            this.f29607n = i28 + 1;
            if (MessagesController.getInstance(i11).config.walletAvailable.get() && ((org.telegram.ui.qn) n2Var).R3 == 0 && ti.v1(i27)) {
                int i29 = this.J;
                this.J = i29 + 1;
                this.f29608r = i29;
            }
            boolean z11 = tiVar.T1;
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
            if (tiVar.R1) {
                int i32 = this.J;
                this.J = i32 + 1;
                this.v = i32;
            }
            if (tiVar.T1) {
                int i33 = this.J;
                this.J = i33 + 1;
                this.f29611x = i33;
            }
            int i34 = this.J;
            int i35 = i34 + 1;
            this.J = i35;
            this.f29609s = i34;
            if (tiVar.S1) {
                this.J = i34 + 2;
                this.f29610w = i35;
            }
            if ((n2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) n2Var).R3 == 0 && i27 != null && !z10 && !i27.bot && !ig.a2.f(i11).f12826b.isEmpty()) {
                int i36 = this.J;
                this.J = i36 + 1;
                this.f29612y = i36;
            }
            if ((tiVar.O1 || tiVar.P1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (n2Var instanceof org.telegram.ui.qn) && !((org.telegram.ui.qn) n2Var).c() && !((org.telegram.ui.qn) n2Var).x())) {
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) n2Var;
                if (qnVar.R3 != 5) {
                    this.e = this.J;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i11).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = qnVar.e;
                            if (tLObject == null) {
                                tLObject = qnVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.J;
                    this.J = size2;
                    this.f29606f = size2;
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qi.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View niVar;
        Context context = this.f29605c;
        ti tiVar = this.K;
        if (i10 != 0) {
            niVar = new mi(tiVar, context);
        } else {
            niVar = new ni(tiVar, context);
        }
        niVar.setImportantForAccessibility(1);
        niVar.setFocusable(true);
        niVar.setLayoutParams(new s4.o0(-2, -1));
        return new s4.b1(niVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
    }
}
