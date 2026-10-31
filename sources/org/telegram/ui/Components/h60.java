package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h60 implements Runnable {
    public final int f26630a;
    public final i60 f26631b;
    public final String f26632c;

    public h60(i60 i60Var, String str, int i10) {
        this.f26630a = i10;
        this.f26631b = i60Var;
        this.f26632c = str;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        String K;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        switch (this.f26630a) {
            case 0:
                i60 i60Var = this.f26631b;
                String str2 = this.f26632c;
                i60Var.getClass();
                org.telegram.messenger.i0.g3(new h60(i60Var, str2, 1));
                return;
            case 1:
                i60 i60Var2 = this.f26631b;
                String str3 = this.f26632c;
                zf.m1 m1Var = i60Var2.e;
                org.telegram.ui.tt ttVar = i60Var2.f26894n.f28299d2;
                boolean z11 = false;
                boolean z12 = false;
                if (ttVar != null) {
                    z11 = true;
                }
                if (ttVar != null) {
                    z12 = true;
                }
                m1Var.g(str3, true, z11, true, z12, 0L, false, 0, 0);
                org.telegram.messenger.r5 r5Var = Utilities.f14522g;
                h60 h60Var = new h60(i60Var2, str3, 2);
                i60Var2.h = h60Var;
                r5Var.c(h60Var);
                return;
            default:
                i60 i60Var3 = this.f26631b;
                String str4 = this.f26632c;
                ArrayList arrayList2 = i60Var3.f26894n.V1;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.i0.g3(new jg(i60Var3, new ArrayList(), new ArrayList(), 11));
                    return;
                }
                boolean z13 = true;
                ?? r62 = 0;
                String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                R0 = (lowerCase.equals(R0) || R0.length() == 0) ? null : null;
                if (R0 != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i11 = i10 + 1;
                String[] strArr = new String[i11];
                strArr[0] = lowerCase;
                if (R0 != null) {
                    strArr[1] = R0;
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    TLObject tLObject = (TLObject) arrayList2.get(i12);
                    boolean z14 = tLObject instanceof TLRPC.User;
                    if (z14) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        str = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                        K = org.telegram.messenger.h20.n(user);
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        str = chat.title;
                        K = org.telegram.messenger.w3.K(chat, r62);
                    }
                    String R02 = org.telegram.messenger.cd.D0().R0(str, z13, r62);
                    if (str.equals(R02)) {
                        R02 = null;
                    }
                    char c11 = r62;
                    int i13 = r62;
                    while (true) {
                        if (i13 < i11) {
                            String str5 = strArr[i13];
                            if (!str.startsWith(str5) && !sc.e.y(" ", str5, str) && (R02 == null || (!R02.startsWith(str5) && !sc.e.y(" ", str5, R02)))) {
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
                                        arrayList4.add(org.telegram.messenger.i0.r0(user2.first_name, user2.last_name, str5));
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList4.add(org.telegram.messenger.i0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                } else {
                                    obj = null;
                                    arrayList4.add(org.telegram.messenger.i0.r0(sc.e.h("@", K), null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                            } else {
                                char c12 = c10;
                                z13 = true;
                                arrayList2 = arrayList2;
                                c11 = c12;
                                i13++;
                            }
                        } else {
                            arrayList = arrayList2;
                            z10 = z13;
                        }
                    }
                    i12++;
                    z13 = z10;
                    arrayList2 = arrayList;
                    r62 = 0;
                }
                org.telegram.messenger.i0.g3(new jg(i60Var3, arrayList3, arrayList4, 11));
                return;
        }
    }
}
