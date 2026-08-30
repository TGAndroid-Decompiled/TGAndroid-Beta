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
public final class ii extends rl0 {
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public final li G;
    public final Context f25720c;
    public int d;
    public int e;
    public int f25721f;
    public final ArrayList h = new ArrayList();
    public int f25722n;
    public int f25723r;
    public int f25724s;
    public int v;
    public int f25725w;
    public int f25726x;
    public int f25727y;

    public ii(li liVar, Context context) {
        this.G = liVar;
        this.f25720c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.F;
        li liVar = this.G;
        if (liVar.E1 == null && (liVar.f26689c0 instanceof org.telegram.ui.xn) && !liVar.E) {
            return MediaDataController.getInstance(liVar.G1).inlineBots.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.F) {
            return 1;
        }
        if (i10 >= this.e && i10 < this.f25721f) {
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
        this.f25722n = -1;
        this.f25723r = -1;
        this.f25724s = -1;
        this.v = -1;
        this.f25725w = -1;
        this.f25726x = -1;
        this.f25727y = -1;
        this.B = -1;
        this.D = -1;
        this.E = -1;
        this.C = -1;
        this.e = -1;
        this.f25721f = -1;
        li liVar = this.G;
        int i11 = liVar.G1;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
        boolean z4 = true;
        if (liVar.E) {
            this.F = 1;
            this.d = 0;
            int i12 = liVar.F;
            if (i12 == 0 || k7.w8.a(i12, 16)) {
                int i13 = this.F;
                this.F = i13 + 1;
                this.f25722n = i13;
            }
            int i14 = liVar.F;
            if (i14 == 0 || k7.w8.a(i14, 8192)) {
                int i15 = this.F;
                this.F = i15 + 1;
                this.B = i15;
            }
            int i16 = liVar.F;
            if (i16 == 0 || k7.w8.a(i16, 16384)) {
                int i17 = this.F;
                this.F = i17 + 1;
                this.C = i17;
            }
            int i18 = liVar.F;
            if (i18 == 0 || k7.w8.a(i18, 8)) {
                int i19 = this.F;
                this.F = i19 + 1;
                this.f25723r = i19;
            }
            int i20 = liVar.F;
            if (i20 == 0 || k7.w8.a(i20, 64)) {
                int i21 = this.F;
                this.F = i21 + 1;
                this.f25727y = i21;
            }
            int i22 = liVar.F;
            if (i22 == 0 || k7.w8.a(i22, 32768)) {
                int i23 = this.F;
                this.F = i23 + 1;
                this.D = i23;
            }
        } else if (!(p2Var instanceof org.telegram.ui.xn)) {
            this.d = 0;
            this.F = 2;
            this.f25722n = 1;
            if (liVar.T) {
                this.F = 3;
                this.f25723r = 2;
            }
        } else if (liVar.E1 != null) {
            int i24 = liVar.D1;
            if (i24 == -1) {
                this.d = 0;
                this.f25722n = 1;
                this.F = 3;
                this.f25723r = 2;
            } else {
                if (i24 == 0) {
                    this.F = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.F;
                    this.F = i25 + 1;
                    this.f25722n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.F;
                    this.F = i26 + 1;
                    this.f25723r = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.xn) p2Var).i();
            if (p2Var instanceof org.telegram.ui.xn) {
                chat = ((org.telegram.ui.xn) p2Var).e;
            } else {
                chat = null;
            }
            z4 = (i27 == null || ((org.telegram.ui.xn) p2Var).getMessagesController().getSendPaidMessagesStars(i27.f19331id) <= 0) ? false : false;
            int i28 = this.F;
            this.F = i28 + 1;
            this.d = i28;
            if ((liVar.I1 || liVar.J1) && !z4 && ((chat == null || !ChatObject.isMonoForum(chat)) && (p2Var instanceof org.telegram.ui.xn) && !((org.telegram.ui.xn) p2Var).c() && !((org.telegram.ui.xn) p2Var).v())) {
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) p2Var;
                if (xnVar.O3 != 5) {
                    this.e = this.F;
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
                    int size2 = arrayList.size() + this.F;
                    this.F = size2;
                    this.f25721f = size2;
                }
            }
            int i29 = this.F;
            int i30 = i29 + 1;
            this.F = i30;
            this.f25722n = i29;
            boolean z10 = liVar.N1;
            if (z10) {
                this.F = i29 + 2;
                this.f25727y = i30;
            }
            if (z10 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.F;
                this.F = i31 + 1;
                this.E = i31;
            }
            if (liVar.L1) {
                int i32 = this.F;
                this.F = i32 + 1;
                this.f25724s = i32;
            }
            if (liVar.M1) {
                int i33 = this.F;
                this.F = i33 + 1;
                this.v = i33;
            }
            if (liVar.N1) {
                int i34 = this.F;
                this.F = i34 + 1;
                this.f25725w = i34;
            }
            if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).O3 == 0 && i27 != null && !z4 && !i27.bot && !uf.p1.f(i11).f45417b.isEmpty()) {
                int i35 = this.F;
                this.F = i35 + 1;
                this.f25726x = i35;
            }
            int i36 = this.F;
            this.F = i36 + 1;
            this.f25723r = i36;
        }
        super.l();
    }

    @Override
    public final void v(f2.l1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ii.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View fiVar;
        Context context = this.f25720c;
        li liVar = this.G;
        if (i10 != 0) {
            fiVar = new ei(liVar, context);
        } else {
            fiVar = new fi(liVar, context);
        }
        fiVar.setImportantForAccessibility(1);
        fiVar.setFocusable(true);
        fiVar.setLayoutParams(new f2.w0(-2, -1));
        return new f2.l1(fiVar);
    }

    @Override
    public final void y(f2.l1 l1Var) {
    }
}
