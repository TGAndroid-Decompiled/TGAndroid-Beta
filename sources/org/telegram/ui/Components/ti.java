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
public final class ti extends vl0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final wi J;
    public final Context f28520c;
    public int d;
    public int e;
    public int f28521f;
    public final ArrayList h = new ArrayList();
    public int f28522n;
    public int f28523r;
    public int f28524s;
    public int v;
    public int f28525w;
    public int f28526x;
    public int f28527y;

    public ti(wi wiVar, Context context) {
        this.J = wiVar;
        this.f28520c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.I;
        wi wiVar = this.J;
        if (wiVar.H1 == null && (wiVar.f30006f0 instanceof org.telegram.ui.wn) && !wiVar.H) {
            return MediaDataController.getInstance(wiVar.J1).inlineBots.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.I) {
            return 1;
        }
        if (i10 >= this.e && i10 < this.f28521f) {
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
        this.f28522n = -1;
        this.f28523r = -1;
        this.f28524s = -1;
        this.v = -1;
        this.f28525w = -1;
        this.f28526x = -1;
        this.f28527y = -1;
        this.E = -1;
        this.G = -1;
        this.H = -1;
        this.F = -1;
        this.e = -1;
        this.f28521f = -1;
        wi wiVar = this.J;
        int i11 = wiVar.J1;
        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30006f0;
        boolean z10 = true;
        if (wiVar.H) {
            this.I = 1;
            this.d = 0;
            int i12 = wiVar.I;
            if (i12 == 0 || w7.d0.a(i12, 16)) {
                int i13 = this.I;
                this.I = i13 + 1;
                this.f28522n = i13;
            }
            int i14 = wiVar.I;
            if (i14 == 0 || w7.d0.a(i14, 8192)) {
                int i15 = this.I;
                this.I = i15 + 1;
                this.E = i15;
            }
            int i16 = wiVar.I;
            if (i16 == 0 || w7.d0.a(i16, 16384)) {
                int i17 = this.I;
                this.I = i17 + 1;
                this.F = i17;
            }
            int i18 = wiVar.I;
            if (i18 == 0 || w7.d0.a(i18, 8)) {
                int i19 = this.I;
                this.I = i19 + 1;
                this.f28523r = i19;
            }
            int i20 = wiVar.I;
            if (i20 == 0 || w7.d0.a(i20, 64)) {
                int i21 = this.I;
                this.I = i21 + 1;
                this.f28527y = i21;
            }
            int i22 = wiVar.I;
            if (i22 == 0 || w7.d0.a(i22, 32768)) {
                int i23 = this.I;
                this.I = i23 + 1;
                this.G = i23;
            }
        } else if (!(m2Var instanceof org.telegram.ui.wn)) {
            this.d = 0;
            this.I = 2;
            this.f28522n = 1;
            if (wiVar.W) {
                this.I = 3;
                this.f28523r = 2;
            }
        } else if (wiVar.H1 != null) {
            int i24 = wiVar.G1;
            if (i24 == -1) {
                this.d = 0;
                this.f28522n = 1;
                this.I = 3;
                this.f28523r = 2;
            } else {
                if (i24 == 0) {
                    this.I = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.I;
                    this.I = i25 + 1;
                    this.f28522n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.I;
                    this.I = i26 + 1;
                    this.f28523r = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.wn) m2Var).i();
            if (m2Var instanceof org.telegram.ui.wn) {
                chat = ((org.telegram.ui.wn) m2Var).e;
            } else {
                chat = null;
            }
            z10 = (i27 == null || ((org.telegram.ui.wn) m2Var).getMessagesController().getSendPaidMessagesStars(i27.f18483id) <= 0) ? false : false;
            int i28 = this.I;
            this.I = i28 + 1;
            this.d = i28;
            if ((wiVar.L1 || wiVar.M1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (m2Var instanceof org.telegram.ui.wn) && !((org.telegram.ui.wn) m2Var).c() && !((org.telegram.ui.wn) m2Var).v())) {
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) m2Var;
                if (wnVar.R3 != 5) {
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
                            TLObject tLObject = wnVar.e;
                            if (tLObject == null) {
                                tLObject = wnVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.I;
                    this.I = size2;
                    this.f28521f = size2;
                }
            }
            int i29 = this.I;
            int i30 = i29 + 1;
            this.I = i30;
            this.f28522n = i29;
            boolean z11 = wiVar.Q1;
            if (z11) {
                this.I = i29 + 2;
                this.f28527y = i30;
            }
            if (z11 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.I;
                this.I = i31 + 1;
                this.H = i31;
            }
            if (wiVar.O1) {
                int i32 = this.I;
                this.I = i32 + 1;
                this.f28524s = i32;
            }
            if (wiVar.P1) {
                int i33 = this.I;
                this.I = i33 + 1;
                this.v = i33;
            }
            if (wiVar.Q1) {
                int i34 = this.I;
                this.I = i34 + 1;
                this.f28525w = i34;
            }
            if ((m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).R3 == 0 && i27 != null && !z10 && !i27.bot && !hg.c2.f(i11).f10225b.isEmpty()) {
                int i35 = this.I;
                this.I = i35 + 1;
                this.f28526x = i35;
            }
            int i36 = this.I;
            this.I = i36 + 1;
            this.f28523r = i36;
        }
        super.l();
    }

    @Override
    public final void v(s4.c1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ti.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View qiVar;
        Context context = this.f28520c;
        wi wiVar = this.J;
        if (i10 != 0) {
            qiVar = new pi(wiVar, context);
        } else {
            qiVar = new qi(wiVar, context);
        }
        qiVar.setImportantForAccessibility(1);
        qiVar.setFocusable(true);
        qiVar.setLayoutParams(new s4.p0(-2, -1));
        return new s4.c1(qiVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
    }
}
