package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class k7 implements Runnable {
    public final int f36695a;
    public final Object f36696b;
    public final Object f36697c;
    public final Object d;

    public k7(Object obj, Object obj2, Object obj3, int i7) {
        this.f36695a = i7;
        this.f36696b = obj;
        this.f36697c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ql0 ql0Var = (ql0) this.f36696b;
        ArrayList arrayList = (ArrayList) this.f36697c;
        ArrayList arrayList2 = (ArrayList) this.d;
        int i7 = ql0Var.d;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            org.telegram.messenger.a6 q10 = org.telegram.messenger.a6.q(i7);
            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i10);
            if (fjVar != null && fjVar.F0() != null) {
                org.telegram.messenger.g0.g3(new org.telegram.messenger.v5(q10, fjVar.F0(), fjVar, 0));
            }
        }
        if (!arrayList2.isEmpty()) {
            org.telegram.messenger.a6.q(i7).j(arrayList2);
        }
        ql0Var.P = false;
        ql0Var.d(true);
    }

    private final void b() {
        km0 km0Var = (km0) this.f36696b;
        org.telegram.ui.cx cxVar = (org.telegram.ui.cx) this.f36697c;
        y60 y60Var = (y60) this.d;
        if (org.telegram.messenger.j10.i(km0Var.L0.K0).q()) {
            cxVar.getMessagesController().p0(true);
            km0Var.S();
            lc.b0(cxVar).c(org.telegram.messenger.gd.M0(2131754486, null)).j();
        } else {
            new ug.z0((org.telegram.ui.ActionBar.h2) cxVar, 3, true).show();
        }
        y60Var.v();
    }

    private final void c() {
        gt0 gt0Var = (gt0) this.f36696b;
        b5.P(gt0Var.getContext(), null, gt0Var.I1, new tp0(gt0Var, (TL_stories.StoryItem) this.f36697c));
        ((y60) this.d).v();
    }

    private final void d() {
        gt0 gt0Var = (gt0) this.f36696b;
        String str = (String) this.f36697c;
        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.d;
        mr0 mr0Var = new mr0(gt0Var.getContext(), str, str, gt0Var.I1, h2Var);
        if (h2Var != null) {
            h2Var.showDialog(mr0Var);
        } else {
            mr0Var.show();
        }
    }

    private final void f() {
        lq0 lq0Var;
        boolean z10;
        ur0 ur0Var = (ur0) this.f36696b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f36697c;
        TLObject tLObject = (TLObject) this.d;
        gt0 gt0Var = ur0Var.f40408r;
        ur0Var.f40407n = 0;
        int b10 = ur0Var.b();
        if (tL_error == null) {
            TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
            gt0Var.f35642y1.getMessagesController().Z3(messages_chats.chats, false);
            if (!messages_chats.chats.isEmpty() && messages_chats.chats.size() == 100) {
                z10 = false;
            } else {
                z10 = true;
            }
            ur0Var.h = z10;
            ur0Var.d.addAll(messages_chats.chats);
        } else {
            ur0Var.h = true;
        }
        int i7 = 0;
        while (true) {
            bs0[] bs0VarArr = gt0Var.f35609n0;
            if (i7 < bs0VarArr.length) {
                bs0 bs0Var = bs0VarArr[i7];
                if (bs0Var.F == 6 && (lq0Var = bs0Var.h) != null && (ur0Var.f40406f || b10 == 0)) {
                    gt0Var.D(lq0Var, 0, null);
                }
                i7++;
            } else {
                ur0Var.f40405e = false;
                ur0Var.f40406f = true;
                ur0Var.f();
                return;
            }
        }
    }

    private final void g() {
        int i7;
        long B1;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        zr0 zr0Var = (zr0) this.f36696b;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.h2 h2Var = zr0Var.f42942s.f35642y1;
        String lowerCase = ((String) this.f36697c).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.g3(new k7(zr0Var, new ArrayList(), new ArrayList(), 28));
            return;
        }
        boolean z11 = true;
        boolean z12 = 0;
        String S0 = org.telegram.messenger.gd.E0().S0(lowerCase, true, false);
        S0 = (lowerCase.equals(S0) || S0.length() == 0) ? null : null;
        if (S0 != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i10 = i7 + 1;
        String[] strArr = new String[i10];
        strArr[0] = lowerCase;
        if (S0 != null) {
            strArr[1] = S0;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i11);
            if (tLObject instanceof TLRPC.ChatParticipant) {
                B1 = ((TLRPC.ChatParticipant) tLObject).user_id;
            } else {
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    B1 = org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z10 = z11;
                i11++;
                z11 = z10;
                arrayList2 = arrayList;
                z12 = 0;
            }
            TLRPC.User c22 = h2Var.getMessagesController().c2(Long.valueOf(B1));
            if (c22.f28554id != h2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.o10.q(c22).toLowerCase();
                String S02 = org.telegram.messenger.gd.E0().S0(lowerCase2, z11, z12);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                boolean z13 = z12;
                for (int i12 = z12; i12 < i10; i12++) {
                    String str = strArr[i12];
                    if (!lowerCase2.startsWith(str) && !i5.c.B(" ", str, lowerCase2) && (S02 == null || (!S02.startsWith(str) && !i5.c.B(" ", str, S02)))) {
                        String o4 = org.telegram.messenger.o10.o(c22);
                        if (o4 != null && o4.startsWith(str)) {
                            z13 = 2;
                        }
                        c10 = z13;
                    } else {
                        c10 = 1;
                    }
                    if (c10 != 0) {
                        arrayList = arrayList2;
                        z10 = true;
                        if (c10 == 1) {
                            arrayList3.add(org.telegram.messenger.g0.r0(c22.first_name, c22.last_name, str));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList3.add(org.telegram.messenger.g0.r0("@" + org.telegram.messenger.o10.o(c22), null, "@" + str));
                        }
                        arrayList4.add(tLObject);
                        i11++;
                        z11 = z10;
                        arrayList2 = arrayList;
                        z12 = 0;
                    } else {
                        z11 = true;
                        arrayList2 = arrayList2;
                        z13 = c10;
                    }
                }
            }
            arrayList = arrayList2;
            z10 = z11;
            i11++;
            z11 = z10;
            arrayList2 = arrayList;
            z12 = 0;
        }
        org.telegram.messenger.g0.g3(new k7(zr0Var, arrayList3, arrayList4, 28));
    }

    private final void h() {
        zr0 zr0Var = (zr0) this.f36696b;
        ArrayList arrayList = (ArrayList) this.f36697c;
        ArrayList arrayList2 = (ArrayList) this.d;
        gt0 gt0Var = zr0Var.f42942s;
        if (!gt0Var.Y0) {
            return;
        }
        zr0Var.d = arrayList;
        zr0Var.f42941r--;
        if (!org.telegram.messenger.v3.T(zr0Var.f42940n)) {
            ArrayList arrayList3 = zr0Var.f42938e.f17735g;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
        }
        if (zr0Var.f42941r == 0) {
            int i7 = 0;
            while (true) {
                bs0[] bs0VarArr = gt0Var.f35609n0;
                if (i7 >= bs0VarArr.length) {
                    break;
                }
                bs0 bs0Var = bs0VarArr[i7];
                if (bs0Var.F == 7) {
                    if (zr0Var.h == 0) {
                        bs0Var.f33774w.e(false, true);
                    } else {
                        gt0Var.D(bs0Var.h, 0, null);
                    }
                }
                i7++;
            }
        }
        zr0Var.f();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k7.run():void");
    }

    public k7(Object obj, TLObject tLObject, Object obj2, int i7) {
        this.f36695a = i7;
        this.f36696b = obj;
        this.d = tLObject;
        this.f36697c = obj2;
    }

    public k7(xc0 xc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f36695a = 19;
        this.f36696b = xc0Var;
        this.f36697c = tL_error;
        this.d = tLObject;
    }
}
