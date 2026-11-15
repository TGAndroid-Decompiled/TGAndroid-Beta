package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yf implements Runnable {
    public final int f41992a;
    public final Object f41993b;
    public final Object f41994c;
    public final Object d;

    public yf(Object obj, Object obj2, Object obj3, int i7) {
        this.f41992a = i7;
        this.f41993b = obj;
        this.d = obj2;
        this.f41994c = obj3;
    }

    private final void a() {
        dq0 dq0Var;
        boolean z10;
        mr0 mr0Var = (mr0) this.f41993b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f41994c;
        ys0 ys0Var = mr0Var.f37367r;
        mr0Var.f37366n = 0;
        int b10 = mr0Var.b();
        if (tL_error == null) {
            TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
            ys0Var.f42152y1.getMessagesController().S3(messages_chats.chats, false);
            if (!messages_chats.chats.isEmpty() && messages_chats.chats.size() == 100) {
                z10 = false;
            } else {
                z10 = true;
            }
            mr0Var.h = z10;
            mr0Var.d.addAll(messages_chats.chats);
        } else {
            mr0Var.h = true;
        }
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = ys0Var.f42119n0;
            if (i7 < tr0VarArr.length) {
                tr0 tr0Var = tr0VarArr[i7];
                if (tr0Var.F == 6 && (dq0Var = tr0Var.h) != null && (mr0Var.f37365f || b10 == 0)) {
                    ys0Var.D(dq0Var, 0, null);
                }
                i7++;
            } else {
                mr0Var.f37364e = false;
                mr0Var.f37365f = true;
                mr0Var.f();
                return;
            }
        }
    }

    private final void b() {
        int i7;
        long B1;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        rr0 rr0Var = (rr0) this.f41993b;
        ArrayList arrayList2 = (ArrayList) this.f41994c;
        org.telegram.ui.ActionBar.e2 e2Var = rr0Var.f39050s.f42152y1;
        String lowerCase = ((String) this.d).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new yf(rr0Var, new ArrayList(), new ArrayList(), 25));
            return;
        }
        boolean z11 = true;
        boolean z12 = 0;
        String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
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
                    B1 = org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject).peer);
                }
                arrayList = arrayList2;
                z10 = z11;
                i11++;
                z11 = z10;
                arrayList2 = arrayList;
                z12 = 0;
            }
            TLRPC.User a22 = e2Var.getMessagesController().a2(Long.valueOf(B1));
            if (a22.f28200id != e2Var.getUserConfig().e()) {
                String lowerCase2 = org.telegram.messenger.q10.p(a22).toLowerCase();
                String S02 = org.telegram.messenger.hd.E0().S0(lowerCase2, z11, z12);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                boolean z13 = z12;
                for (int i12 = z12; i12 < i10; i12++) {
                    String str = strArr[i12];
                    if (!lowerCase2.startsWith(str) && !i5.c.A(" ", str, lowerCase2) && (S02 == null || (!S02.startsWith(str) && !i5.c.A(" ", str, S02)))) {
                        String n10 = org.telegram.messenger.q10.n(a22);
                        if (n10 != null && n10.startsWith(str)) {
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
                            arrayList3.add(org.telegram.messenger.g0.r0(a22.first_name, a22.last_name, str));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList3.add(org.telegram.messenger.g0.r0("@" + org.telegram.messenger.q10.n(a22), null, "@" + str));
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
        org.telegram.messenger.g0.h3(new yf(rr0Var, arrayList3, arrayList4, 25));
    }

    private final void c() {
        rr0 rr0Var = (rr0) this.f41993b;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f41994c;
        ys0 ys0Var = rr0Var.f39050s;
        if (!ys0Var.Y0) {
            return;
        }
        rr0Var.d = arrayList;
        rr0Var.f39049r--;
        if (!org.telegram.messenger.t3.T(rr0Var.f39048n)) {
            ArrayList arrayList3 = rr0Var.f39046e.f17349g;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
        }
        if (rr0Var.f39049r == 0) {
            int i7 = 0;
            while (true) {
                tr0[] tr0VarArr = ys0Var.f42119n0;
                if (i7 >= tr0VarArr.length) {
                    break;
                }
                tr0 tr0Var = tr0VarArr[i7];
                if (tr0Var.F == 7) {
                    if (rr0Var.h == 0) {
                        tr0Var.f39795w.e(false, true);
                    } else {
                        ys0Var.D(tr0Var.h, 0, null);
                    }
                }
                i7++;
            }
        }
        rr0Var.f();
    }

    private final void d() {
        int i7;
        TLRPC.Document document;
        boolean z10;
        String str;
        vr0 vr0Var = (vr0) this.f41993b;
        ArrayList arrayList = (ArrayList) this.f41994c;
        vr0Var.getClass();
        String lowerCase = ((String) this.d).trim().toLowerCase();
        if (lowerCase.length() == 0) {
            org.telegram.messenger.g0.h3(new hh0(12, vr0Var, new ArrayList()));
            return;
        }
        String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
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
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < i10) {
                    String str2 = strArr[i12];
                    String I0 = gjVar.I0();
                    if (I0 != null && I0.length() != 0) {
                        if (I0.toLowerCase().contains(str2)) {
                            arrayList2.add(gjVar);
                            break;
                        } else if (vr0Var.f41141r == 4) {
                            if (gjVar.D == 0) {
                                document = org.telegram.messenger.gj.n1(gjVar.f23819k).webpage.document;
                            } else {
                                document = org.telegram.messenger.gj.n1(gjVar.f23819k).document;
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
                                arrayList2.add(gjVar);
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
        org.telegram.messenger.g0.h3(new hh0(12, vr0Var, arrayList2));
    }

    private final void f() {
        bw0 bw0Var = (bw0) this.f41993b;
        String str = (String) this.d;
        org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) this.f41994c;
        if (!bw0Var.J) {
            bw0Var.U1.remove(str);
            if (!"application/x-tgsticker".equals(xyVar.d)) {
                bw0Var.S0(xyVar);
            } else {
                xyVar.f27626c = true;
                int indexOf = bw0Var.T1.indexOf(xyVar);
                if (indexOf >= 0) {
                    v4.e1 K = bw0Var.n1.K(indexOf);
                    if (K != null) {
                        ((org.telegram.ui.Cells.y7) K.f58535a).setSticker(xyVar);
                    }
                } else {
                    bw0Var.f33413o1.f();
                }
            }
            if (bw0Var.U1.isEmpty()) {
                bw0Var.Z0();
            }
        }
    }

    private final void g() {
        bw0 bw0Var = (bw0) this.f41993b;
        ArrayList arrayList = (ArrayList) this.d;
        Boolean bool = (Boolean) this.f41994c;
        bw0Var.T1 = arrayList;
        if (arrayList.isEmpty()) {
            bw0Var.dismiss();
            return;
        }
        bw0Var.f33413o1.f();
        if (bool.booleanValue()) {
            bw0Var.U1 = new HashMap();
            int size = bw0Var.T1.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) bw0Var.T1.get(i7);
                bw0Var.U1.put(xyVar.f27624a, xyVar);
                org.telegram.messenger.w7.G(bw0Var.f29679a).h0(false, 67108864, xyVar.f27624a, true);
            }
        }
        bw0Var.Z0();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yf.run():void");
    }

    public yf(nc0 nc0Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.f41992a = 16;
        this.f41993b = nc0Var;
        this.d = tL_error;
        this.f41994c = tLObject;
    }
}
