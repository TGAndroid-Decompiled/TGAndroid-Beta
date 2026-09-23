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
public final class ti extends ll0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final wi J;
    public final Context f28196c;
    public int d;
    public int e;
    public int f28197f;
    public final ArrayList h = new ArrayList();
    public int f28198n;
    public int f28199r;
    public int f28200s;
    public int v;
    public int f28201w;
    public int f28202x;
    public int f28203y;

    public ti(wi wiVar, Context context) {
        this.J = wiVar;
        this.f28196c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.I;
        wi wiVar = this.J;
        if (wiVar.H1 == null && (wiVar.f29665f0 instanceof org.telegram.ui.xn) && !wiVar.H) {
            return MediaDataController.getInstance(wiVar.J1).inlineBots.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.I) {
            return 1;
        }
        if (i10 >= this.e && i10 < this.f28197f) {
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
        this.f28198n = -1;
        this.f28199r = -1;
        this.f28200s = -1;
        this.v = -1;
        this.f28201w = -1;
        this.f28202x = -1;
        this.f28203y = -1;
        this.E = -1;
        this.G = -1;
        this.H = -1;
        this.F = -1;
        this.e = -1;
        this.f28197f = -1;
        wi wiVar = this.J;
        int i11 = wiVar.J1;
        org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
        boolean z10 = true;
        if (wiVar.H) {
            this.I = 1;
            this.d = 0;
            int i12 = wiVar.I;
            if (i12 == 0 || w7.c0.a(i12, 16)) {
                int i13 = this.I;
                this.I = i13 + 1;
                this.f28198n = i13;
            }
            int i14 = wiVar.I;
            if (i14 == 0 || w7.c0.a(i14, 8192)) {
                int i15 = this.I;
                this.I = i15 + 1;
                this.E = i15;
            }
            int i16 = wiVar.I;
            if (i16 == 0 || w7.c0.a(i16, 16384)) {
                int i17 = this.I;
                this.I = i17 + 1;
                this.F = i17;
            }
            int i18 = wiVar.I;
            if (i18 == 0 || w7.c0.a(i18, 8)) {
                int i19 = this.I;
                this.I = i19 + 1;
                this.f28199r = i19;
            }
            int i20 = wiVar.I;
            if (i20 == 0 || w7.c0.a(i20, 64)) {
                int i21 = this.I;
                this.I = i21 + 1;
                this.f28203y = i21;
            }
            int i22 = wiVar.I;
            if (i22 == 0 || w7.c0.a(i22, 32768)) {
                int i23 = this.I;
                this.I = i23 + 1;
                this.G = i23;
            }
        } else if (!(n2Var instanceof org.telegram.ui.xn)) {
            this.d = 0;
            this.I = 2;
            this.f28198n = 1;
            if (wiVar.W) {
                this.I = 3;
                this.f28199r = 2;
            }
        } else if (wiVar.H1 != null) {
            int i24 = wiVar.G1;
            if (i24 == -1) {
                this.d = 0;
                this.f28198n = 1;
                this.I = 3;
                this.f28199r = 2;
            } else {
                if (i24 == 0) {
                    this.I = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.I;
                    this.I = i25 + 1;
                    this.f28198n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.I;
                    this.I = i26 + 1;
                    this.f28199r = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.xn) n2Var).i();
            if (n2Var instanceof org.telegram.ui.xn) {
                chat = ((org.telegram.ui.xn) n2Var).e;
            } else {
                chat = null;
            }
            z10 = (i27 == null || ((org.telegram.ui.xn) n2Var).getMessagesController().getSendPaidMessagesStars(i27.f18230id) <= 0) ? false : false;
            int i28 = this.I;
            this.I = i28 + 1;
            this.d = i28;
            if ((wiVar.L1 || wiVar.M1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (n2Var instanceof org.telegram.ui.xn) && !((org.telegram.ui.xn) n2Var).c() && !((org.telegram.ui.xn) n2Var).v())) {
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) n2Var;
                if (xnVar.R3 != 5) {
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
                            TLObject tLObject = xnVar.e;
                            if (tLObject == null) {
                                tLObject = xnVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.I;
                    this.I = size2;
                    this.f28197f = size2;
                }
            }
            int i29 = this.I;
            int i30 = i29 + 1;
            this.I = i30;
            this.f28198n = i29;
            boolean z11 = wiVar.Q1;
            if (z11) {
                this.I = i29 + 2;
                this.f28203y = i30;
            }
            if (z11 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.I;
                this.I = i31 + 1;
                this.H = i31;
            }
            if (wiVar.O1) {
                int i32 = this.I;
                this.I = i32 + 1;
                this.f28200s = i32;
            }
            if (wiVar.P1) {
                int i33 = this.I;
                this.I = i33 + 1;
                this.v = i33;
            }
            if (wiVar.Q1) {
                int i34 = this.I;
                this.I = i34 + 1;
                this.f28201w = i34;
            }
            if ((n2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) n2Var).R3 == 0 && i27 != null && !z10 && !i27.bot && !hg.c2.f(i11).f10225b.isEmpty()) {
                int i35 = this.I;
                this.I = i35 + 1;
                this.f28202x = i35;
            }
            int i36 = this.I;
            this.I = i36 + 1;
            this.f28199r = i36;
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
        Context context = this.f28196c;
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
