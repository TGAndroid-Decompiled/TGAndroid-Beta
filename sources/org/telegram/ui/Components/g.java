package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class g implements Runnable {
    public final int f35339a;
    public final Object f35340b;
    public final Object f35341c;
    public final Object d;

    public g(Object obj, Object obj2, Object obj3, int i7) {
        this.f35339a = i7;
        this.f35340b = obj;
        this.f35341c = obj2;
        this.d = obj3;
    }

    private final void a() {
        jt0 jt0Var = (jt0) this.f35340b;
        c5.P(jt0Var.getContext(), null, jt0Var.I1, new vp0(jt0Var, (TL_stories.StoryItem) this.f35341c));
        ((a70) this.d).v();
    }

    private final void b() {
        jt0 jt0Var = (jt0) this.f35340b;
        String str = (String) this.f35341c;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
        or0 or0Var = new or0(jt0Var.getContext(), str, str, jt0Var.I1, g2Var);
        if (g2Var != null) {
            g2Var.showDialog(or0Var);
        } else {
            or0Var.show();
        }
    }

    private final void c() {
        nq0 nq0Var;
        boolean z10;
        wr0 wr0Var = (wr0) this.f35340b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f35341c;
        TLObject tLObject = (TLObject) this.d;
        jt0 jt0Var = wr0Var.f41892r;
        wr0Var.f41891n = 0;
        int b10 = wr0Var.b();
        if (tL_error == null) {
            TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
            jt0Var.f36689y1.getMessagesController().Z3(messages_chats.chats, false);
            if (!messages_chats.chats.isEmpty() && messages_chats.chats.size() == 100) {
                z10 = false;
            } else {
                z10 = true;
            }
            wr0Var.h = z10;
            wr0Var.d.addAll(messages_chats.chats);
        } else {
            wr0Var.h = true;
        }
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = jt0Var.f36656n0;
            if (i7 < ds0VarArr.length) {
                ds0 ds0Var = ds0VarArr[i7];
                if (ds0Var.F == 6 && (nq0Var = ds0Var.h) != null && (wr0Var.f41890f || b10 == 0)) {
                    jt0Var.D(nq0Var, 0, null);
                }
                i7++;
            } else {
                wr0Var.f41889e = false;
                wr0Var.f41890f = true;
                wr0Var.f();
                return;
            }
        }
    }

    private final void d() {
        int i7;
        long B1;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        bs0 bs0Var = (bs0) this.f35340b;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.g2 g2Var = bs0Var.f33922s.f36689y1;
        String lowerCase = ((String) this.f35341c).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.g3(new g(bs0Var, new ArrayList(), new ArrayList(), 29));
            return;
        }
        boolean z11 = true;
        boolean z12 = 0;
        String T0 = org.telegram.messenger.gd.E0().T0(lowerCase, true, false);
        T0 = (lowerCase.equals(T0) || T0.length() == 0) ? null : null;
        if (T0 != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i10 = i7 + 1;
        String[] strArr = new String[i10];
        strArr[0] = lowerCase;
        if (T0 != null) {
            strArr[1] = T0;
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
            TLRPC.User c22 = g2Var.getMessagesController().c2(Long.valueOf(B1));
            if (c22.f28580id != g2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.o10.q(c22).toLowerCase();
                String T02 = org.telegram.messenger.gd.E0().T0(lowerCase2, z11, z12);
                if (lowerCase2.equals(T02)) {
                    T02 = null;
                }
                boolean z13 = z12;
                for (int i12 = z12; i12 < i10; i12++) {
                    String str = strArr[i12];
                    if (!lowerCase2.startsWith(str) && !i5.c.B(" ", str, lowerCase2) && (T02 == null || (!T02.startsWith(str) && !i5.c.B(" ", str, T02)))) {
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
        org.telegram.messenger.g0.g3(new g(bs0Var, arrayList3, arrayList4, 29));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g.run():void");
    }

    public g(yc0 yc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f35339a = 20;
        this.f35340b = yc0Var;
        this.f35341c = tL_error;
        this.d = tLObject;
    }
}
