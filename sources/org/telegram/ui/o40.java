package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o40 implements Runnable {
    public final int f48182a;
    public final p40 f48183b;
    public final String f48184c;

    public o40(p40 p40Var, String str, int i3) {
        this.f48182a = i3;
        this.f48183b = p40Var;
        this.f48184c = str;
    }

    @Override
    public final void run() {
        boolean z10;
        int i3;
        String str;
        String K;
        ArrayList arrayList;
        boolean z11;
        char c2;
        Object obj;
        switch (this.f48182a) {
            case 0:
                p40 p40Var = this.f48183b;
                String str2 = this.f48184c;
                p40Var.getClass();
                org.telegram.messenger.g0.h3(new o40(p40Var, str2, 1));
                return;
            case 1:
                p40 p40Var2 = this.f48183b;
                String str3 = this.f48184c;
                kg.v1 v1Var = p40Var2.f48456f;
                r40 r40Var = p40Var2.J;
                if (!r40Var.P && !r40Var.Q) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                v1Var.g(str3, true, z10, true, false, 0L, false, 0, 0);
                org.telegram.messenger.p5 p5Var = Utilities.f21389g;
                o40 o40Var = new o40(p40Var2, str3, 2);
                p40Var2.h = o40Var;
                p5Var.c(o40Var);
                return;
            default:
                p40 p40Var3 = this.f48183b;
                String str4 = this.f48184c;
                ArrayList arrayList2 = p40Var3.f48458r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    org.telegram.messenger.g0.h3(new pp(p40Var3, new ArrayList(), new ArrayList(), 10));
                    return;
                }
                boolean z12 = true;
                ?? r62 = 0;
                String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
                S0 = (lowerCase.equals(S0) || S0.isEmpty()) ? null : null;
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
                    boolean z13 = tLObject instanceof TLRPC.User;
                    if (z13) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                        K = org.telegram.messenger.l10.n(user);
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            str = chat.title;
                            K = org.telegram.messenger.t3.K(chat, r62);
                        }
                        arrayList = arrayList2;
                        z11 = z12;
                        i11++;
                        z12 = z11;
                        arrayList2 = arrayList;
                        r62 = 0;
                    }
                    String S02 = org.telegram.messenger.bd.E0().S0(str, z12, r62);
                    if (str.equals(S02)) {
                        S02 = null;
                    }
                    char c10 = r62;
                    for (int i12 = r62; i12 < i10; i12++) {
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
                            z11 = true;
                            if (c2 == 1) {
                                if (z13) {
                                    TLRPC.User user2 = (TLRPC.User) tLObject;
                                    arrayList4.add(org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, str5));
                                } else if (tLObject instanceof TLRPC.Chat) {
                                    obj = null;
                                    arrayList4.add(org.telegram.messenger.g0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                }
                                obj = null;
                            } else {
                                obj = null;
                                arrayList4.add(org.telegram.messenger.g0.r0(t4.c.f("@", K), null, "@" + str5));
                            }
                            arrayList3.add(tLObject);
                            i11++;
                            z12 = z11;
                            arrayList2 = arrayList;
                            r62 = 0;
                        } else {
                            char c11 = c2;
                            z12 = true;
                            arrayList2 = arrayList2;
                            c10 = c11;
                        }
                    }
                    arrayList = arrayList2;
                    z11 = z12;
                    i11++;
                    z12 = z11;
                    arrayList2 = arrayList;
                    r62 = 0;
                }
                org.telegram.messenger.g0.h3(new pp(p40Var3, arrayList3, arrayList4, 10));
                return;
        }
    }
}
