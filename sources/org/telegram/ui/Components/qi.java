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
public final class qi extends mm0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final ti K;
    public final Context f31896c;
    public int d;
    public int e;
    public int f31897f;
    public final ArrayList h = new ArrayList();
    public int f31898n;
    public int f31899r;
    public int f31900s;
    public int v;
    public int f31901w;
    public int f31902x;
    public int f31903y;

    public qi(ti tiVar, Context context) {
        this.K = tiVar;
        this.f31896c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.J;
        ti tiVar = this.K;
        if (tiVar.K1 == null && (tiVar.f32990f0 instanceof org.telegram.ui.wn) && !tiVar.H) {
            return MediaDataController.getInstance(tiVar.M1).inlineBots.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.J) {
            return 1;
        }
        if (i10 >= this.e && i10 < this.f31897f) {
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
        this.f31898n = -1;
        this.f31900s = -1;
        this.v = -1;
        this.f31901w = -1;
        this.f31902x = -1;
        this.f31903y = -1;
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.G = -1;
        this.e = -1;
        this.f31897f = -1;
        this.f31899r = -1;
        ti tiVar = this.K;
        int i11 = tiVar.M1;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
        boolean z10 = true;
        if (tiVar.H) {
            this.J = 1;
            this.d = 0;
            int i12 = tiVar.I;
            if (i12 == 0 || a8.pf.a(i12, 16)) {
                int i13 = this.J;
                this.J = i13 + 1;
                this.f31898n = i13;
            }
            int i14 = tiVar.I;
            if (i14 == 0 || a8.pf.a(i14, 8192)) {
                int i15 = this.J;
                this.J = i15 + 1;
                this.F = i15;
            }
            int i16 = tiVar.I;
            if (i16 == 0 || a8.pf.a(i16, 16384)) {
                int i17 = this.J;
                this.J = i17 + 1;
                this.G = i17;
            }
            int i18 = tiVar.I;
            if (i18 == 0 || a8.pf.a(i18, 8)) {
                int i19 = this.J;
                this.J = i19 + 1;
                this.f31900s = i19;
            }
            int i20 = tiVar.I;
            if (i20 == 0 || a8.pf.a(i20, 64)) {
                int i21 = this.J;
                this.J = i21 + 1;
                this.E = i21;
            }
            int i22 = tiVar.I;
            if (i22 == 0 || a8.pf.a(i22, 32768)) {
                int i23 = this.J;
                this.J = i23 + 1;
                this.H = i23;
            }
        } else if (!(r2Var instanceof org.telegram.ui.wn)) {
            this.d = 0;
            this.J = 2;
            this.f31898n = 1;
            if (tiVar.W) {
                this.J = 3;
                this.f31900s = 2;
            }
        } else if (tiVar.K1 != null) {
            int i24 = tiVar.J1;
            if (i24 == -1) {
                this.d = 0;
                this.f31898n = 1;
                this.J = 3;
                this.f31900s = 2;
            } else {
                if (i24 == 0) {
                    this.J = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.J;
                    this.J = i25 + 1;
                    this.f31898n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.J;
                    this.J = i26 + 1;
                    this.f31900s = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.wn) r2Var).i();
            if (r2Var instanceof org.telegram.ui.wn) {
                chat = ((org.telegram.ui.wn) r2Var).e;
            } else {
                chat = null;
            }
            if (i27 == null || ((org.telegram.ui.wn) r2Var).getMessagesController().getSendPaidMessagesStars(i27.f22177id) <= 0) {
                z10 = false;
            }
            int i28 = this.J;
            this.d = i28;
            this.J = i28 + 2;
            this.f31898n = i28 + 1;
            if (MessagesController.getInstance(i11).config.walletAvailable.get() && ((org.telegram.ui.wn) r2Var).f45091d4 == 0 && ti.y1(i27)) {
                int i29 = this.J;
                this.J = i29 + 1;
                this.f31899r = i29;
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
                this.f31902x = i33;
            }
            int i34 = this.J;
            int i35 = i34 + 1;
            this.J = i35;
            this.f31900s = i34;
            if (tiVar.S1) {
                this.J = i34 + 2;
                this.f31901w = i35;
            }
            if ((r2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) r2Var).f45091d4 == 0 && i27 != null && !z10 && !i27.bot && !jg.c2.f(i11).f15659b.isEmpty()) {
                int i36 = this.J;
                this.J = i36 + 1;
                this.f31903y = i36;
            }
            if ((tiVar.O1 || tiVar.P1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (r2Var instanceof org.telegram.ui.wn) && !((org.telegram.ui.wn) r2Var).c() && !((org.telegram.ui.wn) r2Var).w())) {
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) r2Var;
                if (wnVar.f45091d4 != 5) {
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
                            TLObject tLObject = wnVar.e;
                            if (tLObject == null) {
                                tLObject = wnVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.J;
                    this.J = size2;
                    this.f31897f = size2;
                }
            }
        }
        super.l();
    }

    @Override
    public final void v(s4.e1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qi.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View niVar;
        Context context = this.f31896c;
        ti tiVar = this.K;
        if (i10 != 0) {
            niVar = new mi(tiVar, context);
        } else {
            niVar = new ni(tiVar, context);
        }
        niVar.setImportantForAccessibility(1);
        niVar.setFocusable(true);
        niVar.setLayoutParams(new s4.q0(-2, -1));
        return new s4.e1(niVar);
    }

    @Override
    public final void y(s4.e1 e1Var) {
    }
}
