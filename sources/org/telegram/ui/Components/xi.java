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
public final class xi extends vm0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final aj K;
    public final Context f32767c;
    public int d;
    public int f32768e;
    public int f32769f;
    public final ArrayList h = new ArrayList();
    public int f32770n;
    public int f32771r;
    public int f32772s;
    public int v;
    public int f32773w;
    public int f32774x;
    public int f32775y;

    public xi(aj ajVar, Context context) {
        this.K = ajVar;
        this.f32767c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.J;
        aj ajVar = this.K;
        if (ajVar.K1 == null && (ajVar.f24342f0 instanceof org.telegram.ui.eo) && !ajVar.H) {
            return MediaDataController.getInstance(ajVar.M1).inlineBots.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.J) {
            return 1;
        }
        if (i10 >= this.f32768e && i10 < this.f32769f) {
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
        this.f32770n = -1;
        this.f32772s = -1;
        this.v = -1;
        this.f32773w = -1;
        this.f32774x = -1;
        this.f32775y = -1;
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.G = -1;
        this.f32768e = -1;
        this.f32769f = -1;
        this.f32771r = -1;
        aj ajVar = this.K;
        int i11 = ajVar.M1;
        org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24342f0;
        boolean z10 = true;
        if (ajVar.H) {
            this.J = 1;
            this.d = 0;
            int i12 = ajVar.I;
            if (i12 == 0 || w7.f0.a(i12, 16)) {
                int i13 = this.J;
                this.J = i13 + 1;
                this.f32770n = i13;
            }
            int i14 = ajVar.I;
            if (i14 == 0 || w7.f0.a(i14, 8192)) {
                int i15 = this.J;
                this.J = i15 + 1;
                this.F = i15;
            }
            int i16 = ajVar.I;
            if (i16 == 0 || w7.f0.a(i16, 16384)) {
                int i17 = this.J;
                this.J = i17 + 1;
                this.G = i17;
            }
            int i18 = ajVar.I;
            if (i18 == 0 || w7.f0.a(i18, 8)) {
                int i19 = this.J;
                this.J = i19 + 1;
                this.f32772s = i19;
            }
            int i20 = ajVar.I;
            if (i20 == 0 || w7.f0.a(i20, 64)) {
                int i21 = this.J;
                this.J = i21 + 1;
                this.E = i21;
            }
            int i22 = ajVar.I;
            if (i22 == 0 || w7.f0.a(i22, 32768)) {
                int i23 = this.J;
                this.J = i23 + 1;
                this.H = i23;
            }
        } else if (!(m2Var instanceof org.telegram.ui.eo)) {
            this.d = 0;
            this.J = 2;
            this.f32770n = 1;
            if (ajVar.W) {
                this.J = 3;
                this.f32772s = 2;
            }
        } else if (ajVar.K1 != null) {
            int i24 = ajVar.J1;
            if (i24 == -1) {
                this.d = 0;
                this.f32770n = 1;
                this.J = 3;
                this.f32772s = 2;
            } else {
                if (i24 == 0) {
                    this.J = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.J;
                    this.J = i25 + 1;
                    this.f32770n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.J;
                    this.J = i26 + 1;
                    this.f32772s = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.eo) m2Var).i();
            if (m2Var instanceof org.telegram.ui.eo) {
                chat = ((org.telegram.ui.eo) m2Var).f37241e;
            } else {
                chat = null;
            }
            if (i27 == null || ((org.telegram.ui.eo) m2Var).getMessagesController().getSendPaidMessagesStars(i27.f19949id) <= 0) {
                z10 = false;
            }
            int i28 = this.J;
            this.d = i28;
            this.J = i28 + 2;
            this.f32770n = i28 + 1;
            if (MessagesController.getInstance(i11).config.walletAvailable.get() && ((org.telegram.ui.eo) m2Var).R3 == 0 && aj.v1(i27)) {
                int i29 = this.J;
                this.J = i29 + 1;
                this.f32771r = i29;
            }
            boolean z11 = ajVar.T1;
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
            if (ajVar.R1) {
                int i32 = this.J;
                this.J = i32 + 1;
                this.v = i32;
            }
            if (ajVar.T1) {
                int i33 = this.J;
                this.J = i33 + 1;
                this.f32774x = i33;
            }
            int i34 = this.J;
            int i35 = i34 + 1;
            this.J = i35;
            this.f32772s = i34;
            if (ajVar.S1) {
                this.J = i34 + 2;
                this.f32773w = i35;
            }
            if ((m2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) m2Var).R3 == 0 && i27 != null && !z10 && !i27.bot && !hg.c2.f(i11).f11181b.isEmpty()) {
                int i36 = this.J;
                this.J = i36 + 1;
                this.f32775y = i36;
            }
            if ((ajVar.O1 || ajVar.P1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (m2Var instanceof org.telegram.ui.eo) && !((org.telegram.ui.eo) m2Var).c() && !((org.telegram.ui.eo) m2Var).v())) {
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) m2Var;
                if (eoVar.R3 != 5) {
                    this.f32768e = this.J;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i11).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = eoVar.f37241e;
                            if (tLObject == null) {
                                tLObject = eoVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.J;
                    this.J = size2;
                    this.f32769f = size2;
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.d1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xi.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View uiVar;
        Context context = this.f32767c;
        aj ajVar = this.K;
        if (i10 != 0) {
            uiVar = new ti(ajVar, context);
        } else {
            uiVar = new ui(ajVar, context);
        }
        uiVar.setImportantForAccessibility(1);
        uiVar.setFocusable(true);
        uiVar.setLayoutParams(new s4.q0(-2, -1));
        return new s4.d1(uiVar);
    }

    @Override
    public final void y(s4.d1 d1Var) {
    }
}
