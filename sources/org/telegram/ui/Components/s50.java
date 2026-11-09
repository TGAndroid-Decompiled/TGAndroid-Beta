package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s50 implements Runnable {
    public final int f37922a;
    public final t50 f37923b;
    public final String f37924c;

    public s50(t50 t50Var, String str, int i7) {
        this.f37922a = i7;
        this.f37923b = t50Var;
        this.f37924c = str;
    }

    @Override
    public final void run() {
        int i7;
        String str;
        String K;
        ArrayList arrayList;
        boolean z9;
        char c10;
        Object obj;
        switch (this.f37922a) {
            case 0:
                t50 t50Var = this.f37923b;
                String str2 = this.f37924c;
                t50Var.getClass();
                org.telegram.messenger.g0.h3(new s50(t50Var, str2, 1));
                return;
            case 1:
                t50 t50Var2 = this.f37923b;
                String str3 = this.f37924c;
                jg.z1 z1Var = t50Var2.f38297e;
                org.telegram.ui.yr yrVar = t50Var2.f38299n.d2;
                boolean z10 = false;
                boolean z11 = false;
                if (yrVar != null) {
                    z10 = true;
                }
                if (yrVar != null) {
                    z11 = true;
                }
                z1Var.g(str3, true, z10, true, z11, 0L, false, 0, 0);
                org.telegram.messenger.p5 p5Var = Utilities.f21338g;
                s50 s50Var = new s50(t50Var2, str3, 2);
                t50Var2.h = s50Var;
                p5Var.c(s50Var);
                return;
            default:
                t50 t50Var3 = this.f37923b;
                String str4 = this.f37924c;
                ArrayList arrayList2 = t50Var3.f38299n.V1;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new ng(t50Var3, new ArrayList(), new ArrayList(), 11));
                    return;
                }
                boolean z12 = true;
                ?? r62 = 0;
                String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
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
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLObject tLObject = (TLObject) arrayList2.get(i11);
                    boolean z13 = tLObject instanceof TLRPC.User;
                    if (z13) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                        K = org.telegram.messenger.t10.n(user);
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        str = chat.title;
                        K = org.telegram.messenger.t3.K(chat, r62);
                    }
                    String S02 = org.telegram.messenger.id.E0().S0(str, z12, r62);
                    if (str.equals(S02)) {
                        S02 = null;
                    }
                    char c11 = r62;
                    int i12 = r62;
                    while (true) {
                        if (i12 < i10) {
                            String str5 = strArr[i12];
                            if (!str.startsWith(str5) && !jg.g.A(" ", str5, str) && (S02 == null || (!S02.startsWith(str5) && !jg.g.A(" ", str5, S02)))) {
                                if (K != null && K.startsWith(str5)) {
                                    c11 = 2;
                                }
                                c10 = c11;
                            } else {
                                c10 = 1;
                            }
                            if (c10 != 0) {
                                arrayList = arrayList2;
                                z9 = true;
                                if (c10 == 1) {
                                    if (z13) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, str5));
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList4.add(org.telegram.messenger.g0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                } else {
                                    obj = null;
                                    arrayList4.add(org.telegram.messenger.g0.r0(rf.b.i("@", K), null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                            } else {
                                char c12 = c10;
                                z12 = true;
                                arrayList2 = arrayList2;
                                c11 = c12;
                                i12++;
                            }
                        } else {
                            arrayList = arrayList2;
                            z9 = z12;
                        }
                    }
                    i11++;
                    z12 = z9;
                    arrayList2 = arrayList;
                    r62 = 0;
                }
                org.telegram.messenger.g0.h3(new ng(t50Var3, arrayList3, arrayList4, 11));
                return;
        }
    }
}
