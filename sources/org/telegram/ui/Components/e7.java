package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e7 implements Runnable {
    public final int f33298a;
    public final Object f33299b;
    public final Object f33300c;
    public final Object d;

    public e7(Object obj, Object obj2, Object obj3, int i3) {
        this.f33298a = i3;
        this.f33299b = obj;
        this.f33300c = obj2;
        this.d = obj3;
    }

    private final void a() {
        cq0 cq0Var;
        boolean z10;
        kr0 kr0Var = (kr0) this.f33299b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f33300c;
        TLObject tLObject = (TLObject) this.d;
        ws0 ws0Var = kr0Var.f35473n;
        int b10 = kr0Var.b();
        if (tL_error == null) {
            TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
            ws0Var.f40142y1.getMessagesController().S3(messages_chats.chats, false);
            if (!messages_chats.chats.isEmpty() && messages_chats.chats.size() == 100) {
                z10 = false;
            } else {
                z10 = true;
            }
            kr0Var.h = z10;
            kr0Var.d.addAll(messages_chats.chats);
        } else {
            kr0Var.h = true;
        }
        int i3 = 0;
        while (true) {
            rr0[] rr0VarArr = ws0Var.f40108n0;
            if (i3 < rr0VarArr.length) {
                rr0 rr0Var = rr0VarArr[i3];
                if (rr0Var.F == 6 && (cq0Var = rr0Var.h) != null && (kr0Var.f35472f || b10 == 0)) {
                    ws0Var.D(cq0Var, 0, null);
                }
                i3++;
            } else {
                kr0Var.f35471e = false;
                kr0Var.f35472f = true;
                kr0Var.f();
                return;
            }
        }
    }

    private final void b() {
        int i3;
        long C1;
        ArrayList arrayList;
        boolean z10;
        char c2;
        Object obj;
        pr0 pr0Var = (pr0) this.f33299b;
        ArrayList arrayList2 = (ArrayList) this.d;
        org.telegram.ui.ActionBar.d2 d2Var = pr0Var.f37231s.f40142y1;
        String lowerCase = ((String) this.f33300c).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new e7(pr0Var, new ArrayList(), new ArrayList(), 27));
            return;
        }
        boolean z11 = true;
        boolean z12 = 0;
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
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            TLObject tLObject = (TLObject) arrayList2.get(i11);
            if (tLObject instanceof TLRPC.ChatParticipant) {
                C1 = ((TLRPC.ChatParticipant) tLObject).user_id;
            } else {
                if (tLObject instanceof TLRPC.ChannelParticipant) {
                    C1 = org.telegram.messenger.zi.C1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z10 = z11;
                i11++;
                z11 = z10;
                arrayList2 = arrayList;
                z12 = 0;
            }
            TLRPC.User a22 = d2Var.getMessagesController().a2(Long.valueOf(C1));
            if (a22.f27150id != d2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.l10.p(a22).toLowerCase();
                String S02 = org.telegram.messenger.bd.E0().S0(lowerCase2, z11, z12);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                boolean z13 = z12;
                for (int i12 = z12; i12 < i10; i12++) {
                    String str = strArr[i12];
                    if (!lowerCase2.startsWith(str) && !k2.p1.z(" ", str, lowerCase2) && (S02 == null || (!S02.startsWith(str) && !k2.p1.z(" ", str, S02)))) {
                        String n4 = org.telegram.messenger.l10.n(a22);
                        if (n4 != null && n4.startsWith(str)) {
                            z13 = 2;
                        }
                        c2 = z13;
                    } else {
                        c2 = 1;
                    }
                    if (c2 != 0) {
                        arrayList = arrayList2;
                        z10 = true;
                        if (c2 == 1) {
                            arrayList3.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList3.add(org.telegram.messenger.g0.r0("@" + org.telegram.messenger.l10.n(a22), null, "@" + str));
                        }
                        arrayList4.add(tLObject);
                        i11++;
                        z11 = z10;
                        arrayList2 = arrayList;
                        z12 = 0;
                    } else {
                        z11 = true;
                        arrayList2 = arrayList2;
                        z13 = c2;
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
        org.telegram.messenger.g0.h3(new e7(pr0Var, arrayList3, arrayList4, 27));
    }

    private final void c() {
        pr0 pr0Var = (pr0) this.f33299b;
        ArrayList arrayList = (ArrayList) this.f33300c;
        ArrayList arrayList2 = (ArrayList) this.d;
        ws0 ws0Var = pr0Var.f37231s;
        if (!ws0Var.Y0) {
            return;
        }
        pr0Var.d = arrayList;
        pr0Var.f37230r--;
        if (!org.telegram.messenger.t3.T(pr0Var.f37229n)) {
            ArrayList arrayList3 = pr0Var.f37227e.f17211g;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
        }
        if (pr0Var.f37230r == 0) {
            int i3 = 0;
            while (true) {
                rr0[] rr0VarArr = ws0Var.f40108n0;
                if (i3 >= rr0VarArr.length) {
                    break;
                }
                rr0 rr0Var = rr0VarArr[i3];
                if (rr0Var.F == 7) {
                    if (pr0Var.h == 0) {
                        rr0Var.f37790w.e(false, true);
                    } else {
                        ws0Var.D(rr0Var.h, 0, null);
                    }
                }
                i3++;
            }
        }
        pr0Var.f();
    }

    private final void e() {
        int i3;
        TLRPC.Document document;
        boolean z10;
        String str;
        tr0 tr0Var = (tr0) this.f33299b;
        ArrayList arrayList = (ArrayList) this.d;
        tr0Var.getClass();
        String lowerCase = ((String) this.f33300c).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new j50(23, tr0Var, new ArrayList()));
            return;
        }
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
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < i10) {
                    String str2 = strArr[i12];
                    String I0 = ziVar.I0();
                    if (I0 != null && I0.length() != 0) {
                        if (I0.toLowerCase().contains(str2)) {
                            arrayList2.add(ziVar);
                            break;
                        } else if (tr0Var.f38542r == 4) {
                            if (ziVar.D == 0) {
                                document = org.telegram.messenger.zi.o1(ziVar.f26868k).webpage.document;
                            } else {
                                document = org.telegram.messenger.zi.o1(ziVar.f26868k).document;
                            }
                            int i13 = 0;
                            while (true) {
                                if (i13 < document.attributes.size()) {
                                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                        String str3 = documentAttribute.performer;
                                        if (str3 != null) {
                                            z10 = str3.toLowerCase().contains(str2);
                                        } else {
                                            z10 = false;
                                        }
                                        if (!z10 && (str = documentAttribute.title) != null) {
                                            z10 = str.toLowerCase().contains(str2);
                                        }
                                    } else {
                                        i13++;
                                    }
                                } else {
                                    z10 = false;
                                    break;
                                }
                            }
                            if (z10) {
                                arrayList2.add(ziVar);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i12++;
                }
            }
        }
        org.telegram.messenger.g0.h3(new j50(23, tr0Var, arrayList2));
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e7.run():void");
    }

    public e7(Object obj, TLObject tLObject, Object obj2, int i3) {
        this.f33298a = i3;
        this.f33299b = obj;
        this.d = tLObject;
        this.f33300c = obj2;
    }

    public e7(hc0 hc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f33298a = 18;
        this.f33299b = hc0Var;
        this.f33300c = tL_error;
        this.d = tLObject;
    }
}
