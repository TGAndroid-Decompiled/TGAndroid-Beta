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
public final class hi extends vk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final ki F;
    public final Context f29089c;
    public int d;
    public int f29090e;
    public int f29091f;
    public final ArrayList h = new ArrayList();
    public int f29092n;
    public int f29093r;
    public int f29094s;
    public int v;
    public int f29095w;
    public int f29096x;
    public int f29097y;

    public hi(ki kiVar, Context context) {
        this.F = kiVar;
        this.f29089c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i9 = this.E;
        ki kiVar = this.F;
        if (kiVar.D1 == null && (kiVar.f30099b0 instanceof org.telegram.ui.qn) && !kiVar.D) {
            return MediaDataController.getInstance(kiVar.F1).inlineBots.size() + i9;
        }
        return i9;
    }

    @Override
    public final int j(int i9) {
        if (i9 >= this.E) {
            return 1;
        }
        if (i9 >= this.f29090e && i9 < this.f29091f) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        TLRPC.Chat chat;
        int i9 = 0;
        this.E = 0;
        this.d = -1;
        this.f29092n = -1;
        this.f29093r = -1;
        this.f29094s = -1;
        this.v = -1;
        this.f29095w = -1;
        this.f29096x = -1;
        this.f29097y = -1;
        this.A = -1;
        this.C = -1;
        this.D = -1;
        this.B = -1;
        this.f29090e = -1;
        this.f29091f = -1;
        ki kiVar = this.F;
        int i10 = kiVar.F1;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
        boolean z10 = true;
        if (kiVar.D) {
            this.E = 1;
            this.d = 0;
            int i11 = kiVar.E;
            if (i11 == 0 || g7.z7.a(i11, 16)) {
                int i12 = this.E;
                this.E = i12 + 1;
                this.f29092n = i12;
            }
            int i13 = kiVar.E;
            if (i13 == 0 || g7.z7.a(i13, 8192)) {
                int i14 = this.E;
                this.E = i14 + 1;
                this.A = i14;
            }
            int i15 = kiVar.E;
            if (i15 == 0 || g7.z7.a(i15, 16384)) {
                int i16 = this.E;
                this.E = i16 + 1;
                this.B = i16;
            }
            int i17 = kiVar.E;
            if (i17 == 0 || g7.z7.a(i17, 8)) {
                int i18 = this.E;
                this.E = i18 + 1;
                this.f29093r = i18;
            }
            int i19 = kiVar.E;
            if (i19 == 0 || g7.z7.a(i19, 64)) {
                int i20 = this.E;
                this.E = i20 + 1;
                this.f29097y = i20;
            }
            int i21 = kiVar.E;
            if (i21 == 0 || g7.z7.a(i21, 32768)) {
                int i22 = this.E;
                this.E = i22 + 1;
                this.C = i22;
            }
        } else if (!(o2Var instanceof org.telegram.ui.qn)) {
            this.d = 0;
            this.E = 2;
            this.f29092n = 1;
            if (kiVar.S) {
                this.E = 3;
                this.f29093r = 2;
            }
        } else if (kiVar.D1 != null) {
            int i23 = kiVar.C1;
            if (i23 == -1) {
                this.d = 0;
                this.f29092n = 1;
                this.E = 3;
                this.f29093r = 2;
            } else {
                if (i23 == 0) {
                    this.E = 1;
                    this.d = 0;
                }
                if (i23 == 1) {
                    int i24 = this.E;
                    this.E = i24 + 1;
                    this.f29092n = i24;
                }
                if (i23 == 2) {
                    int i25 = this.E;
                    this.E = i25 + 1;
                    this.f29093r = i25;
                }
            }
        } else {
            TLRPC.User i26 = ((org.telegram.ui.qn) o2Var).i();
            if (o2Var instanceof org.telegram.ui.qn) {
                chat = ((org.telegram.ui.qn) o2Var).f41890e;
            } else {
                chat = null;
            }
            z10 = (i26 == null || ((org.telegram.ui.qn) o2Var).getMessagesController().getSendPaidMessagesStars(i26.f22527id) <= 0) ? false : false;
            int i27 = this.E;
            this.E = i27 + 1;
            this.d = i27;
            if ((kiVar.H1 || kiVar.I1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (o2Var instanceof org.telegram.ui.qn) && !((org.telegram.ui.qn) o2Var).c() && !((org.telegram.ui.qn) o2Var).w())) {
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) o2Var;
                if (qnVar.N3 != 5) {
                    this.f29090e = this.E;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i10).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i9 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i9);
                        i9++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = qnVar.f41890e;
                            if (tLObject == null) {
                                tLObject = qnVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.E;
                    this.E = size2;
                    this.f29091f = size2;
                }
            }
            int i28 = this.E;
            int i29 = i28 + 1;
            this.E = i29;
            this.f29092n = i28;
            boolean z11 = kiVar.M1;
            if (z11) {
                this.E = i28 + 2;
                this.f29097y = i29;
            }
            if (z11 && MessagesController.getInstance(i10).richEditorAvailable()) {
                int i30 = this.E;
                this.E = i30 + 1;
                this.D = i30;
            }
            if (kiVar.K1) {
                int i31 = this.E;
                this.E = i31 + 1;
                this.f29094s = i31;
            }
            if (kiVar.L1) {
                int i32 = this.E;
                this.E = i32 + 1;
                this.v = i32;
            }
            if (kiVar.M1) {
                int i33 = this.E;
                this.E = i33 + 1;
                this.f29095w = i33;
            }
            if ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).N3 == 0 && i26 != null && !z10 && !i26.bot && !pf.r1.f(i10).f45766b.isEmpty()) {
                int i34 = this.E;
                this.E = i34 + 1;
                this.f29096x = i34;
            }
            int i35 = this.E;
            this.E = i35 + 1;
            this.f29093r = i35;
        }
        super.l();
    }

    @Override
    public final void v(f2.q1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hi.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View eiVar;
        Context context = this.f29089c;
        ki kiVar = this.F;
        if (i9 != 0) {
            eiVar = new di(kiVar, context);
        } else {
            eiVar = new ei(kiVar, context);
        }
        eiVar.setImportantForAccessibility(1);
        eiVar.setFocusable(true);
        eiVar.setLayoutParams(new f2.a1(-2, -1));
        return new f2.q1(eiVar);
    }

    @Override
    public final void y(f2.q1 q1Var) {
    }
}
