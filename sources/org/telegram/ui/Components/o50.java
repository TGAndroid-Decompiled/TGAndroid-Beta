package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o50 implements Runnable {
    public final int f36716a;
    public final p50 f36717b;
    public final String f36718c;

    public o50(p50 p50Var, String str, int i3) {
        this.f36716a = i3;
        this.f36717b = p50Var;
        this.f36718c = str;
    }

    @Override
    public final void run() {
        int i3;
        String str;
        String K;
        ArrayList arrayList;
        boolean z10;
        char c2;
        Object obj;
        switch (this.f36716a) {
            case 0:
                p50 p50Var = this.f36717b;
                String str2 = this.f36718c;
                p50Var.getClass();
                org.telegram.messenger.g0.h3(new o50(p50Var, str2, 1));
                return;
            case 1:
                p50 p50Var2 = this.f36717b;
                String str3 = this.f36718c;
                kg.v1 v1Var = p50Var2.f37066e;
                org.telegram.ui.ur urVar = p50Var2.f37068n.f38291e2;
                boolean z11 = false;
                boolean z12 = false;
                if (urVar != null) {
                    z11 = true;
                }
                if (urVar != null) {
                    z12 = true;
                }
                v1Var.g(str3, true, z11, true, z12, 0L, false, 0, 0);
                org.telegram.messenger.p5 p5Var = Utilities.f21389g;
                o50 o50Var = new o50(p50Var2, str3, 2);
                p50Var2.h = o50Var;
                p5Var.c(o50Var);
                return;
            default:
                p50 p50Var3 = this.f36717b;
                String str4 = this.f36718c;
                ArrayList arrayList2 = p50Var3.f37068n.W1;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new e7(p50Var3, new ArrayList(), new ArrayList(), 15));
                    return;
                }
                boolean z13 = true;
                ?? r62 = 0;
                String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
                S0 = (lowerCase.equals(S0) || S0.length() == 0) ? null : null;
                if (S0 != null) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int i10 = i3 + 1;
                String[] strArr = new String[i10];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLObject tLObject = (TLObject) arrayList2.get(i11);
                    boolean z14 = tLObject instanceof TLRPC.User;
                    if (z14) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                        K = org.telegram.messenger.l10.n(user);
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        str = chat.title;
                        K = org.telegram.messenger.t3.K(chat, r62);
                    }
                    String S02 = org.telegram.messenger.bd.E0().S0(str, z13, r62);
                    if (str.equals(S02)) {
                        S02 = null;
                    }
                    char c10 = r62;
                    int i12 = r62;
                    while (true) {
                        if (i12 < i10) {
                            String str5 = strArr[i12];
                            if (!str.startsWith(str5) && !k2.p1.z(" ", str5, str) && (S02 == null || (!S02.startsWith(str5) && !k2.p1.z(" ", str5, S02)))) {
                                if (K != null && K.startsWith(str5)) {
                                    c10 = 2;
                                }
                                c2 = c10;
                            } else {
                                c2 = 1;
                            }
                            if (c2 != 0) {
                                arrayList = arrayList2;
                                z10 = true;
                                if (c2 == 1) {
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
                                    arrayList4.add(org.telegram.messenger.g0.r0(t4.c.f("@", K), null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                            } else {
                                char c11 = c2;
                                z13 = true;
                                arrayList2 = arrayList2;
                                c10 = c11;
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
                org.telegram.messenger.g0.h3(new e7(p50Var3, arrayList3, arrayList4, 15));
                return;
        }
    }
}
