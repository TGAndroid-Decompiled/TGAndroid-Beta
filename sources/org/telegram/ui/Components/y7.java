package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y7 implements Runnable {
    public final int f40523a = 0;
    public final z7 f40524b;
    public final ArrayList f40525c;
    public final String d;

    public y7(z7 z7Var, String str, ArrayList arrayList) {
        this.f40524b = z7Var;
        this.d = str;
        this.f40525c = arrayList;
    }

    @Override
    public final void run() {
        int i7;
        TLRPC.Document document;
        boolean z9;
        String str;
        int i10 = this.f40523a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.f40525c;
        z7 z7Var = this.f40524b;
        switch (i10) {
            case 0:
                z7Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new y7(z7Var, new ArrayList(), str3));
                    return;
                }
                String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
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
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i12);
                    int i13 = 0;
                    while (true) {
                        if (i13 < i11) {
                            String str4 = strArr[i13];
                            String I0 = ijVar.I0();
                            if (I0 != null && I0.length() != 0) {
                                if (I0.toLowerCase().contains(str4)) {
                                    arrayList2.add(ijVar);
                                } else {
                                    if (ijVar.D == 0) {
                                        document = ijVar.f23266k.media.webpage.document;
                                    } else {
                                        document = ijVar.f23266k.media.document;
                                    }
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i14);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                String str5 = documentAttribute.performer;
                                                if (str5 != null) {
                                                    z9 = str5.toLowerCase().contains(str4);
                                                } else {
                                                    z9 = false;
                                                }
                                                if (!z9 && (str = documentAttribute.title) != null) {
                                                    z9 = str.toLowerCase().contains(str4);
                                                }
                                            } else {
                                                i14++;
                                            }
                                        } else {
                                            z9 = false;
                                        }
                                    }
                                    if (z9) {
                                        arrayList2.add(ijVar);
                                    }
                                }
                            }
                            i13++;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new y7(z7Var, arrayList2, str3));
                return;
            default:
                a8 a8Var = z7Var.f40892n;
                if (a8Var.f31752q1) {
                    a8Var.f31750p1 = true;
                    z7Var.d = arrayList;
                    z7Var.f40890e = str3;
                    z7Var.f();
                    a8Var.f31756s1.n0(0);
                    org.telegram.messenger.k5.r(null, null, 2131748240, new Object[]{str3}, a8Var.f31764w1);
                    return;
                }
                return;
        }
    }

    public y7(z7 z7Var, ArrayList arrayList, String str) {
        this.f40524b = z7Var;
        this.f40525c = arrayList;
        this.d = str;
    }
}
