package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x7 implements Runnable {
    public final int f40256a = 0;
    public final y7 f40257b;
    public final ArrayList f40258c;
    public final String d;

    public x7(y7 y7Var, String str, ArrayList arrayList) {
        this.f40257b = y7Var;
        this.d = str;
        this.f40258c = arrayList;
    }

    @Override
    public final void run() {
        int i3;
        TLRPC.Document document;
        boolean z10;
        String str;
        int i10 = this.f40256a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.f40258c;
        y7 y7Var = this.f40257b;
        switch (i10) {
            case 0:
                y7Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new x7(y7Var, new ArrayList(), str3));
                    return;
                }
                String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
                if (!lowerCase.equals(S0) && S0.length() != 0) {
                    str2 = S0;
                }
                if (str2 != null) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int i11 = i3 + 1;
                String[] strArr = new String[i11];
                strArr[0] = lowerCase;
                if (str2 != null) {
                    strArr[1] = str2;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i12);
                    int i13 = 0;
                    while (true) {
                        if (i13 < i11) {
                            String str4 = strArr[i13];
                            String I0 = ziVar.I0();
                            if (I0 != null && I0.length() != 0) {
                                if (I0.toLowerCase().contains(str4)) {
                                    arrayList2.add(ziVar);
                                } else {
                                    if (ziVar.D == 0) {
                                        document = ziVar.f26868k.media.webpage.document;
                                    } else {
                                        document = ziVar.f26868k.media.document;
                                    }
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i14);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str5 = documentAttribute.performer;
                                                if (str5 != null) {
                                                    z10 = str5.toLowerCase().contains(str4);
                                                } else {
                                                    z10 = false;
                                                }
                                                if (!z10 && (str = documentAttribute.title) != null) {
                                                    z10 = str.toLowerCase().contains(str4);
                                                }
                                            } else {
                                                i14++;
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                    }
                                    if (z10) {
                                        arrayList2.add(ziVar);
                                    }
                                }
                            }
                            i13++;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new x7(y7Var, arrayList2, str3));
                return;
            default:
                z7 z7Var = y7Var.f40642n;
                if (z7Var.f40956o1) {
                    z7Var.f40954n1 = true;
                    y7Var.d = arrayList;
                    y7Var.f40640e = str3;
                    y7Var.f();
                    z7Var.f40960q1.n0(0);
                    org.telegram.messenger.k5.r(null, null, 2131748248, new Object[]{str3}, z7Var.f40968u1);
                    return;
                }
                return;
        }
    }

    public x7(y7 y7Var, ArrayList arrayList, String str) {
        this.f40257b = y7Var;
        this.f40258c = arrayList;
        this.d = str;
    }
}
