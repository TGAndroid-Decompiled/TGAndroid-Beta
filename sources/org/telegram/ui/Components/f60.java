package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f60 implements Runnable {
    public final int f35096a;
    public final g60 f35097b;
    public final String f35098c;

    public f60(g60 g60Var, String str, int i7) {
        this.f35096a = i7;
        this.f35097b = g60Var;
        this.f35098c = str;
    }

    @Override
    public final void run() {
        int i7;
        String str;
        String K;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        switch (this.f35096a) {
            case 0:
                g60 g60Var = this.f35097b;
                String str2 = this.f35098c;
                g60Var.getClass();
                org.telegram.messenger.g0.g3(new f60(g60Var, str2, 1));
                return;
            case 1:
                g60 g60Var2 = this.f35097b;
                String str3 = this.f35098c;
                jg.z1 z1Var = g60Var2.f35416e;
                org.telegram.ui.zr zrVar = g60Var2.f35418n.f37120h2;
                boolean z11 = false;
                boolean z12 = false;
                if (zrVar != null) {
                    z11 = true;
                }
                if (zrVar != null) {
                    z12 = true;
                }
                z1Var.g(str3, true, z11, true, z12, 0L, false, 0, 0);
                org.telegram.messenger.q5 q5Var = Utilities.f22809g;
                f60 f60Var = new f60(g60Var2, str3, 2);
                g60Var2.h = f60Var;
                q5Var.c(f60Var);
                return;
            default:
                g60 g60Var3 = this.f35097b;
                String str4 = this.f35098c;
                ArrayList arrayList2 = g60Var3.f35418n.Z1;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new g(g60Var3, new ArrayList(), new ArrayList(), 17));
                    return;
                }
                boolean z13 = true;
                ?? r62 = 0;
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
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLObject tLObject = (TLObject) arrayList2.get(i11);
                    boolean z14 = tLObject instanceof TLRPC.User;
                    if (z14) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                        K = org.telegram.messenger.o10.o(user);
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        str = chat.title;
                        K = org.telegram.messenger.v3.K(chat, r62);
                    }
                    String T02 = org.telegram.messenger.gd.E0().T0(str, z13, r62);
                    if (str.equals(T02)) {
                        T02 = null;
                    }
                    char c11 = r62;
                    int i12 = r62;
                    while (true) {
                        if (i12 < i10) {
                            String str5 = strArr[i12];
                            if (!str.startsWith(str5) && !i5.c.B(" ", str5, str) && (T02 == null || (!T02.startsWith(str5) && !i5.c.B(" ", str5, T02)))) {
                                if (K != null && K.startsWith(str5)) {
                                    c11 = 2;
                                }
                                c10 = c11;
                            } else {
                                c10 = 1;
                            }
                            if (c10 != 0) {
                                arrayList = arrayList2;
                                z10 = true;
                                if (c10 == 1) {
                                    if (z14) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, str5));
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList4.add(org.telegram.messenger.g0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                } else {
                                    obj = null;
                                    arrayList4.add(org.telegram.messenger.g0.r0(p5.c.k("@", K), null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                            } else {
                                char c12 = c10;
                                z13 = true;
                                arrayList2 = arrayList2;
                                c11 = c12;
                                i12++;
                            }
                        } else {
                            arrayList = arrayList2;
                            z10 = z13;
                        }
                    }
                    i11++;
                    z13 = z10;
                    arrayList2 = arrayList;
                    r62 = 0;
                }
                org.telegram.messenger.g0.g3(new g(g60Var3, arrayList3, arrayList4, 17));
                return;
        }
    }
}
