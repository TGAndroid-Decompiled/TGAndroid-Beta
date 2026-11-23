package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d8 implements Runnable {
    public final int f34397a = 0;
    public final e8 f34398b;
    public final ArrayList f34399c;
    public final String d;

    public d8(e8 e8Var, String str, ArrayList arrayList) {
        this.f34398b = e8Var;
        this.d = str;
        this.f34399c = arrayList;
    }

    @Override
    public final void run() {
        int i7;
        TLRPC.Document document;
        boolean z10;
        String str;
        int i10 = this.f34397a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.f34399c;
        e8 e8Var = this.f34398b;
        switch (i10) {
            case 0:
                e8Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new d8(e8Var, new ArrayList(), str3));
                    return;
                }
                String T0 = org.telegram.messenger.hd.E0().T0(lowerCase, true, false);
                if (!lowerCase.equals(T0) && T0.length() != 0) {
                    str2 = T0;
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
                                        document = gjVar.f24213k.media.webpage.document;
                                    } else {
                                        document = gjVar.f24213k.media.document;
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
                org.telegram.messenger.g0.g3(new d8(e8Var, arrayList2, str3));
                return;
            default:
                f8 f8Var = e8Var.f34698n;
                if (f8Var.f35131r1) {
                    f8Var.f35129q1 = true;
                    e8Var.d = arrayList;
                    e8Var.f34696e = str3;
                    e8Var.f();
                    f8Var.f35135t1.n0(0);
                    org.telegram.messenger.f3.q(null, null, 2131748047, new Object[]{str3}, f8Var.f35143x1);
                    return;
                }
                return;
        }
    }

    public d8(e8 e8Var, ArrayList arrayList, String str) {
        this.f34398b = e8Var;
        this.f34399c = arrayList;
        this.d = str;
    }
}
