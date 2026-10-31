package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u7 implements Runnable {
    public final int f30852a = 0;
    public final v7 f30853b;
    public final ArrayList f30854c;
    public final String d;

    public u7(v7 v7Var, String str, ArrayList arrayList) {
        this.f30853b = v7Var;
        this.d = str;
        this.f30854c = arrayList;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.Document document;
        boolean z10;
        String str;
        int i11 = this.f30852a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.f30854c;
        v7 v7Var = this.f30853b;
        switch (i11) {
            case 0:
                v7Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.i0.g3(new u7(v7Var, new ArrayList(), str3));
                    return;
                }
                String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                if (!lowerCase.equals(R0) && R0.length() != 0) {
                    str2 = R0;
                }
                if (str2 != null) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i12 = i10 + 1;
                String[] strArr = new String[i12];
                strArr[0] = lowerCase;
                if (str2 != null) {
                    strArr[1] = str2;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 < i12) {
                            String str4 = strArr[i14];
                            String I0 = jjVar.I0();
                            if (I0 != null && I0.length() != 0) {
                                if (I0.toLowerCase().contains(str4)) {
                                    arrayList2.add(jjVar);
                                } else {
                                    if (jjVar.D == 0) {
                                        document = jjVar.f16337k.media.webpage.document;
                                    } else {
                                        document = jjVar.f16337k.media.document;
                                    }
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 < document.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i15);
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
                                                i15++;
                                            }
                                        } else {
                                            z10 = false;
                                        }
                                    }
                                    if (z10) {
                                        arrayList2.add(jjVar);
                                    }
                                }
                            }
                            i14++;
                        }
                    }
                }
                org.telegram.messenger.i0.g3(new u7(v7Var, arrayList2, str3));
                return;
            default:
                w7 w7Var = v7Var.f31156n;
                if (w7Var.f32060n1) {
                    w7Var.f32058m1 = true;
                    v7Var.d = arrayList;
                    v7Var.e = str3;
                    v7Var.f();
                    w7Var.f32064p1.n0(0);
                    org.telegram.messenger.m5.q(null, null, 2131748257, new Object[]{str3}, w7Var.f32072t1);
                    return;
                }
                return;
        }
    }

    public u7(v7 v7Var, ArrayList arrayList, String str) {
        this.f30853b = v7Var;
        this.f30854c = arrayList;
        this.d = str;
    }
}
