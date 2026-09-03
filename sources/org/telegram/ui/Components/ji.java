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
public final class ji extends rl0 {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final mi G;
    public final Context f28113c;
    public int d;
    public int f28114e;
    public int f28115f;
    public final ArrayList h = new ArrayList();
    public int f28116n;
    public int f28117r;
    public int f28118s;
    public int v;
    public int f28119w;
    public int f28120x;
    public int f28121y;

    public ji(mi miVar, Context context) {
        this.G = miVar;
        this.f28113c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.F;
        mi miVar = this.G;
        if (miVar.E1 == null && (miVar.f29058c0 instanceof org.telegram.ui.xn) && !miVar.E) {
            return MediaDataController.getInstance(miVar.G1).inlineBots.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.F) {
            return 1;
        }
        if (i10 >= this.f28114e && i10 < this.f28115f) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        TLRPC.Chat chat;
        int i10 = 0;
        this.F = 0;
        this.d = -1;
        this.f28116n = -1;
        this.f28117r = -1;
        this.f28118s = -1;
        this.v = -1;
        this.f28119w = -1;
        this.f28120x = -1;
        this.f28121y = -1;
        this.B = -1;
        this.D = -1;
        this.E = -1;
        this.C = -1;
        this.f28114e = -1;
        this.f28115f = -1;
        mi miVar = this.G;
        int i11 = miVar.G1;
        org.telegram.ui.ActionBar.p2 p2Var = miVar.f29058c0;
        boolean z4 = true;
        if (miVar.E) {
            this.F = 1;
            this.d = 0;
            int i12 = miVar.F;
            if (i12 == 0 || k7.x8.a(i12, 16)) {
                int i13 = this.F;
                this.F = i13 + 1;
                this.f28116n = i13;
            }
            int i14 = miVar.F;
            if (i14 == 0 || k7.x8.a(i14, 8192)) {
                int i15 = this.F;
                this.F = i15 + 1;
                this.B = i15;
            }
            int i16 = miVar.F;
            if (i16 == 0 || k7.x8.a(i16, 16384)) {
                int i17 = this.F;
                this.F = i17 + 1;
                this.C = i17;
            }
            int i18 = miVar.F;
            if (i18 == 0 || k7.x8.a(i18, 8)) {
                int i19 = this.F;
                this.F = i19 + 1;
                this.f28117r = i19;
            }
            int i20 = miVar.F;
            if (i20 == 0 || k7.x8.a(i20, 64)) {
                int i21 = this.F;
                this.F = i21 + 1;
                this.f28121y = i21;
            }
            int i22 = miVar.F;
            if (i22 == 0 || k7.x8.a(i22, 32768)) {
                int i23 = this.F;
                this.F = i23 + 1;
                this.D = i23;
            }
        } else if (!(p2Var instanceof org.telegram.ui.xn)) {
            this.d = 0;
            this.F = 2;
            this.f28116n = 1;
            if (miVar.T) {
                this.F = 3;
                this.f28117r = 2;
            }
        } else if (miVar.E1 != null) {
            int i24 = miVar.D1;
            if (i24 == -1) {
                this.d = 0;
                this.f28116n = 1;
                this.F = 3;
                this.f28117r = 2;
            } else {
                if (i24 == 0) {
                    this.F = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.F;
                    this.F = i25 + 1;
                    this.f28116n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.F;
                    this.F = i26 + 1;
                    this.f28117r = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.xn) p2Var).i();
            if (p2Var instanceof org.telegram.ui.xn) {
                chat = ((org.telegram.ui.xn) p2Var).f43143e;
            } else {
                chat = null;
            }
            z4 = (i27 == null || ((org.telegram.ui.xn) p2Var).getMessagesController().getSendPaidMessagesStars(i27.f20992id) <= 0) ? false : false;
            int i28 = this.F;
            this.F = i28 + 1;
            this.d = i28;
            if ((miVar.I1 || miVar.J1) && !z4 && ((chat == null || !ChatObject.isMonoForum(chat)) && (p2Var instanceof org.telegram.ui.xn) && !((org.telegram.ui.xn) p2Var).c() && !((org.telegram.ui.xn) p2Var).w())) {
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
                if (xnVar.O3 != 5) {
                    this.f28114e = this.F;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i11).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = xnVar.f43143e;
                            if (tLObject == null) {
                                tLObject = xnVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.F;
                    this.F = size2;
                    this.f28115f = size2;
                }
            }
            int i29 = this.F;
            int i30 = i29 + 1;
            this.F = i30;
            this.f28116n = i29;
            boolean z10 = miVar.N1;
            if (z10) {
                this.F = i29 + 2;
                this.f28121y = i30;
            }
            if (z10 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.F;
                this.F = i31 + 1;
                this.E = i31;
            }
            if (miVar.L1) {
                int i32 = this.F;
                this.F = i32 + 1;
                this.f28118s = i32;
            }
            if (miVar.M1) {
                int i33 = this.F;
                this.F = i33 + 1;
                this.v = i33;
            }
            if (miVar.N1) {
                int i34 = this.F;
                this.F = i34 + 1;
                this.f28119w = i34;
            }
            if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).O3 == 0 && i27 != null && !z4 && !i27.bot && !vf.p1.f(i11).f49208b.isEmpty()) {
                int i35 = this.F;
                this.F = i35 + 1;
                this.f28120x = i35;
            }
            int i36 = this.F;
            this.F = i36 + 1;
            this.f28117r = i36;
        }
        super.l();
    }

    @Override
    public final void v(f2.m1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ji.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View giVar;
        Context context = this.f28113c;
        mi miVar = this.G;
        if (i10 != 0) {
            giVar = new fi(miVar, context);
        } else {
            giVar = new gi(miVar, context);
        }
        giVar.setImportantForAccessibility(1);
        giVar.setFocusable(true);
        giVar.setLayoutParams(new f2.x0(-2, -1));
        return new f2.m1(giVar);
    }

    @Override
    public final void y(f2.m1 m1Var) {
    }
}
