package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z7 implements Runnable {
    public final int f40903a = 0;
    public final a8 f40904b;
    public final ArrayList f40905c;
    public final String d;

    public z7(a8 a8Var, String str, ArrayList arrayList) {
        this.f40904b = a8Var;
        this.d = str;
        this.f40905c = arrayList;
    }

    @Override
    public final void run() {
        int i7;
        TLRPC.Document document;
        boolean z9;
        String str;
        int i10 = this.f40903a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.f40905c;
        a8 a8Var = this.f40904b;
        switch (i10) {
            case 0:
                a8Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new z7(a8Var, new ArrayList(), str3));
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
                                        document = ijVar.f23244k.media.webpage.document;
                                    } else {
                                        document = ijVar.f23244k.media.document;
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
                org.telegram.messenger.g0.h3(new z7(a8Var, arrayList2, str3));
                return;
            default:
                b8 b8Var = a8Var.f31721n;
                if (b8Var.n1) {
                    b8Var.f32076m1 = true;
                    a8Var.d = arrayList;
                    a8Var.f31719e = str3;
                    a8Var.f();
                    b8Var.f32081p1.n0(0);
                    org.telegram.messenger.k5.r(null, null, 2131748239, new Object[]{str3}, b8Var.f32089t1);
                    return;
                }
                return;
        }
    }

    public z7(a8 a8Var, ArrayList arrayList, String str) {
        this.f40904b = a8Var;
        this.f40905c = arrayList;
        this.d = str;
    }
}
