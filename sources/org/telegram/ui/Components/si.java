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
public final class si extends lm0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final vi K;
    public final Context f29136c;
    public int d;
    public int e;
    public int f29137f;
    public final ArrayList h = new ArrayList();
    public int f29138n;
    public int f29139r;
    public int f29140s;
    public int v;
    public int f29141w;
    public int f29142x;
    public int f29143y;

    public si(vi viVar, Context context) {
        this.K = viVar;
        this.f29136c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.J;
        vi viVar = this.K;
        if (viVar.K1 == null && (viVar.f30001f0 instanceof org.telegram.ui.fo) && !viVar.H) {
            return MediaDataController.getInstance(viVar.M1).inlineBots.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.J) {
            return 1;
        }
        if (i10 >= this.e && i10 < this.f29137f) {
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
        this.f29138n = -1;
        this.f29140s = -1;
        this.v = -1;
        this.f29141w = -1;
        this.f29142x = -1;
        this.f29143y = -1;
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.G = -1;
        this.e = -1;
        this.f29137f = -1;
        this.f29139r = -1;
        vi viVar = this.K;
        int i11 = viVar.M1;
        org.telegram.ui.ActionBar.m2 m2Var = viVar.f30001f0;
        boolean z10 = true;
        if (viVar.H) {
            this.J = 1;
            this.d = 0;
            int i12 = viVar.I;
            if (i12 == 0 || w7.m6.a(i12, 16)) {
                int i13 = this.J;
                this.J = i13 + 1;
                this.f29138n = i13;
            }
            int i14 = viVar.I;
            if (i14 == 0 || w7.m6.a(i14, 8192)) {
                int i15 = this.J;
                this.J = i15 + 1;
                this.F = i15;
            }
            int i16 = viVar.I;
            if (i16 == 0 || w7.m6.a(i16, 16384)) {
                int i17 = this.J;
                this.J = i17 + 1;
                this.G = i17;
            }
            int i18 = viVar.I;
            if (i18 == 0 || w7.m6.a(i18, 8)) {
                int i19 = this.J;
                this.J = i19 + 1;
                this.f29140s = i19;
            }
            int i20 = viVar.I;
            if (i20 == 0 || w7.m6.a(i20, 64)) {
                int i21 = this.J;
                this.J = i21 + 1;
                this.E = i21;
            }
            int i22 = viVar.I;
            if (i22 == 0 || w7.m6.a(i22, 32768)) {
                int i23 = this.J;
                this.J = i23 + 1;
                this.H = i23;
            }
        } else if (!(m2Var instanceof org.telegram.ui.fo)) {
            this.d = 0;
            this.J = 2;
            this.f29138n = 1;
            if (viVar.W) {
                this.J = 3;
                this.f29140s = 2;
            }
        } else if (viVar.K1 != null) {
            int i24 = viVar.J1;
            if (i24 == -1) {
                this.d = 0;
                this.f29138n = 1;
                this.J = 3;
                this.f29140s = 2;
            } else {
                if (i24 == 0) {
                    this.J = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.J;
                    this.J = i25 + 1;
                    this.f29138n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.J;
                    this.J = i26 + 1;
                    this.f29140s = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.fo) m2Var).i();
            if (m2Var instanceof org.telegram.ui.fo) {
                chat = ((org.telegram.ui.fo) m2Var).e;
            } else {
                chat = null;
            }
            if (i27 == null || ((org.telegram.ui.fo) m2Var).getMessagesController().getSendPaidMessagesStars(i27.f19363id) <= 0) {
                z10 = false;
            }
            int i28 = this.J;
            this.d = i28;
            this.J = i28 + 2;
            this.f29138n = i28 + 1;
            if (MessagesController.getInstance(i11).config.walletAvailable.get() && ((org.telegram.ui.fo) m2Var).R3 == 0 && vi.v1(i27)) {
                int i29 = this.J;
                this.J = i29 + 1;
                this.f29139r = i29;
            }
            boolean z11 = viVar.T1;
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
            if (viVar.R1) {
                int i32 = this.J;
                this.J = i32 + 1;
                this.v = i32;
            }
            if (viVar.T1) {
                int i33 = this.J;
                this.J = i33 + 1;
                this.f29142x = i33;
            }
            int i34 = this.J;
            int i35 = i34 + 1;
            this.J = i35;
            this.f29140s = i34;
            if (viVar.S1) {
                this.J = i34 + 2;
                this.f29141w = i35;
            }
            if ((m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).R3 == 0 && i27 != null && !z10 && !i27.bot && !ig.b2.f(i11).f11448b.isEmpty()) {
                int i36 = this.J;
                this.J = i36 + 1;
                this.f29143y = i36;
            }
            if ((viVar.O1 || viVar.P1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (m2Var instanceof org.telegram.ui.fo) && !((org.telegram.ui.fo) m2Var).c() && !((org.telegram.ui.fo) m2Var).x())) {
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) m2Var;
                if (foVar.R3 != 5) {
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
                            TLObject tLObject = foVar.e;
                            if (tLObject == null) {
                                tLObject = foVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.J;
                    this.J = size2;
                    this.f29137f = size2;
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.b1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.si.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View piVar;
        Context context = this.f29136c;
        vi viVar = this.K;
        if (i10 != 0) {
            piVar = new oi(viVar, context);
        } else {
            piVar = new pi(viVar, context);
        }
        piVar.setImportantForAccessibility(1);
        piVar.setFocusable(true);
        piVar.setLayoutParams(new s4.o0(-2, -1));
        return new s4.b1(piVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
    }
}
