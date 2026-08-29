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
public final class ki extends il0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final ni F;
    public final Context f30066c;
    public int d;
    public int f30067e;
    public int f30068f;
    public final ArrayList h = new ArrayList();
    public int f30069n;
    public int f30070r;
    public int f30071s;
    public int v;
    public int f30072w;
    public int f30073x;
    public int f30074y;

    public ki(ni niVar, Context context) {
        this.F = niVar;
        this.f30066c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final int h() {
        int i10 = this.E;
        ni niVar = this.F;
        if (niVar.D1 == null && (niVar.f30990b0 instanceof org.telegram.ui.tn) && !niVar.D) {
            return MediaDataController.getInstance(niVar.F1).inlineBots.size() + i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 >= this.E) {
            return 1;
        }
        if (i10 >= this.f30067e && i10 < this.f30068f) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void l() {
        TLRPC.Chat chat;
        int i10 = 0;
        this.E = 0;
        this.d = -1;
        this.f30069n = -1;
        this.f30070r = -1;
        this.f30071s = -1;
        this.v = -1;
        this.f30072w = -1;
        this.f30073x = -1;
        this.f30074y = -1;
        this.A = -1;
        this.C = -1;
        this.D = -1;
        this.B = -1;
        this.f30067e = -1;
        this.f30068f = -1;
        ni niVar = this.F;
        int i11 = niVar.F1;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
        boolean z10 = true;
        if (niVar.D) {
            this.E = 1;
            this.d = 0;
            int i12 = niVar.E;
            if (i12 == 0 || i7.n8.a(i12, 16)) {
                int i13 = this.E;
                this.E = i13 + 1;
                this.f30069n = i13;
            }
            int i14 = niVar.E;
            if (i14 == 0 || i7.n8.a(i14, 8192)) {
                int i15 = this.E;
                this.E = i15 + 1;
                this.A = i15;
            }
            int i16 = niVar.E;
            if (i16 == 0 || i7.n8.a(i16, 16384)) {
                int i17 = this.E;
                this.E = i17 + 1;
                this.B = i17;
            }
            int i18 = niVar.E;
            if (i18 == 0 || i7.n8.a(i18, 8)) {
                int i19 = this.E;
                this.E = i19 + 1;
                this.f30070r = i19;
            }
            int i20 = niVar.E;
            if (i20 == 0 || i7.n8.a(i20, 64)) {
                int i21 = this.E;
                this.E = i21 + 1;
                this.f30074y = i21;
            }
            int i22 = niVar.E;
            if (i22 == 0 || i7.n8.a(i22, 32768)) {
                int i23 = this.E;
                this.E = i23 + 1;
                this.C = i23;
            }
        } else if (!(o2Var instanceof org.telegram.ui.tn)) {
            this.d = 0;
            this.E = 2;
            this.f30069n = 1;
            if (niVar.S) {
                this.E = 3;
                this.f30070r = 2;
            }
        } else if (niVar.D1 != null) {
            int i24 = niVar.C1;
            if (i24 == -1) {
                this.d = 0;
                this.f30069n = 1;
                this.E = 3;
                this.f30070r = 2;
            } else {
                if (i24 == 0) {
                    this.E = 1;
                    this.d = 0;
                }
                if (i24 == 1) {
                    int i25 = this.E;
                    this.E = i25 + 1;
                    this.f30069n = i25;
                }
                if (i24 == 2) {
                    int i26 = this.E;
                    this.E = i26 + 1;
                    this.f30070r = i26;
                }
            }
        } else {
            TLRPC.User i27 = ((org.telegram.ui.tn) o2Var).i();
            if (o2Var instanceof org.telegram.ui.tn) {
                chat = ((org.telegram.ui.tn) o2Var).f42787e;
            } else {
                chat = null;
            }
            z10 = (i27 == null || ((org.telegram.ui.tn) o2Var).getMessagesController().getSendPaidMessagesStars(i27.f22539id) <= 0) ? false : false;
            int i28 = this.E;
            this.E = i28 + 1;
            this.d = i28;
            if ((niVar.H1 || niVar.I1) && !z10 && ((chat == null || !ChatObject.isMonoForum(chat)) && (o2Var instanceof org.telegram.ui.tn) && !((org.telegram.ui.tn) o2Var).c() && !((org.telegram.ui.tn) o2Var).w())) {
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) o2Var;
                if (tnVar.N3 != 5) {
                    this.f30067e = this.E;
                    ArrayList arrayList = this.h;
                    arrayList.clear();
                    ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i11).getAttachMenuBots().bots;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i10);
                        i10++;
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                        if (tL_attachMenuBot2.show_in_attach_menu) {
                            TLObject tLObject = tnVar.f42787e;
                            if (tLObject == null) {
                                tLObject = tnVar.i();
                            }
                            if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, tLObject)) {
                                arrayList.add(tL_attachMenuBot2);
                            }
                        }
                    }
                    int size2 = arrayList.size() + this.E;
                    this.E = size2;
                    this.f30068f = size2;
                }
            }
            int i29 = this.E;
            int i30 = i29 + 1;
            this.E = i30;
            this.f30069n = i29;
            boolean z11 = niVar.M1;
            if (z11) {
                this.E = i29 + 2;
                this.f30074y = i30;
            }
            if (z11 && MessagesController.getInstance(i11).richEditorAvailable()) {
                int i31 = this.E;
                this.E = i31 + 1;
                this.D = i31;
            }
            if (niVar.K1) {
                int i32 = this.E;
                this.E = i32 + 1;
                this.f30071s = i32;
            }
            if (niVar.L1) {
                int i33 = this.E;
                this.E = i33 + 1;
                this.v = i33;
            }
            if (niVar.M1) {
                int i34 = this.E;
                this.E = i34 + 1;
                this.f30072w = i34;
            }
            if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).N3 == 0 && i27 != null && !z10 && !i27.bot && !sf.s1.f(i11).f47949b.isEmpty()) {
                int i35 = this.E;
                this.E = i35 + 1;
                this.f30073x = i35;
            }
            int i36 = this.E;
            this.E = i36 + 1;
            this.f30070r = i36;
        }
        super.l();
    }

    @Override
    public final void v(f2.n1 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ki.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View hiVar;
        Context context = this.f30066c;
        ni niVar = this.F;
        if (i10 != 0) {
            hiVar = new gi(niVar, context);
        } else {
            hiVar = new hi(niVar, context);
        }
        hiVar.setImportantForAccessibility(1);
        hiVar.setFocusable(true);
        hiVar.setLayoutParams(new f2.x0(-2, -1));
        return new f2.n1(hiVar);
    }

    @Override
    public final void y(f2.n1 n1Var) {
    }
}
