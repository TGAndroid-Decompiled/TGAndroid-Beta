package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class w7 implements Runnable {
    public final int f41308a = 0;
    public final x7 f41309b;
    public final ArrayList f41310c;
    public final String d;

    public w7(x7 x7Var, String str, ArrayList arrayList) {
        this.f41309b = x7Var;
        this.d = str;
        this.f41310c = arrayList;
    }

    @Override
    public final void run() {
        int i7;
        TLRPC.Document document;
        boolean z10;
        String str;
        int i10 = this.f41308a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.f41310c;
        x7 x7Var = this.f41309b;
        switch (i10) {
            case 0:
                x7Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new w7(x7Var, new ArrayList(), str3));
                    return;
                }
                String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
                if (!lowerCase.equals(S0) && S0.length() != 0) {
                    str2 = S0;
                }
                if (str2 != null) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                int i11 = i7 + 1;
                String[] strArr = new String[i11];
                strArr[0] = lowerCase;
                if (str2 != null) {
                    strArr[1] = str2;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i12);
                    int i13 = 0;
                    while (true) {
                        if (i13 < i11) {
                            String str4 = strArr[i13];
                            String I0 = gjVar.I0();
                            if (I0 != null && I0.length() != 0) {
                                if (I0.toLowerCase().contains(str4)) {
                                    arrayList2.add(gjVar);
                                } else {
                                    if (gjVar.D == 0) {
                                        document = gjVar.f23819k.media.webpage.document;
                                    } else {
                                        document = gjVar.f23819k.media.document;
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
                                        arrayList2.add(gjVar);
                                    }
                                }
                            }
                            i13++;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new w7(x7Var, arrayList2, str3));
                return;
            default:
                y7 y7Var = x7Var.f41614n;
                if (y7Var.f41906r1) {
                    y7Var.f41904q1 = true;
                    x7Var.d = arrayList;
                    x7Var.f41612e = str3;
                    x7Var.f();
                    y7Var.f41910t1.n0(0);
                    org.telegram.messenger.k5.q(null, null, 2131748240, new Object[]{str3}, y7Var.f41918x1);
                    return;
                }
                return;
        }
    }

    public w7(x7 x7Var, ArrayList arrayList, String str) {
        this.f41309b = x7Var;
        this.f41310c = arrayList;
        this.d = str;
    }
}
