package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c8 implements Runnable {
    public final int f33944a = 0;
    public final d8 f33945b;
    public final ArrayList f33946c;
    public final String d;

    public c8(d8 d8Var, String str, ArrayList arrayList) {
        this.f33945b = d8Var;
        this.d = str;
        this.f33946c = arrayList;
    }

    @Override
    public final void run() {
        int i7;
        TLRPC.Document document;
        boolean z10;
        String str;
        int i10 = this.f33944a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.f33946c;
        d8 d8Var = this.f33945b;
        switch (i10) {
            case 0:
                d8Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new c8(d8Var, new ArrayList(), str3));
                    return;
                }
                String T0 = org.telegram.messenger.gd.E0().T0(lowerCase, true, false);
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
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i12);
                    int i13 = 0;
                    while (true) {
                        if (i13 < i11) {
                            String str4 = strArr[i13];
                            String I0 = fjVar.I0();
                            if (I0 != null && I0.length() != 0) {
                                if (I0.toLowerCase().contains(str4)) {
                                    arrayList2.add(fjVar);
                                } else {
                                    if (fjVar.D == 0) {
                                        document = fjVar.f24073k.media.webpage.document;
                                    } else {
                                        document = fjVar.f24073k.media.document;
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
                                        arrayList2.add(fjVar);
                                    }
                                }
                            }
                            i13++;
                        }
                    }
                }
                org.telegram.messenger.g0.g3(new c8(d8Var, arrayList2, str3));
                return;
            default:
                e8 e8Var = d8Var.f34233n;
                if (e8Var.f34612r1) {
                    e8Var.f34610q1 = true;
                    d8Var.d = arrayList;
                    d8Var.f34231e = str3;
                    d8Var.f();
                    e8Var.f34616t1.n0(0);
                    org.telegram.messenger.f3.q(null, null, 2131748047, new Object[]{str3}, e8Var.f34624x1);
                    return;
                }
                return;
        }
    }

    public c8(d8 d8Var, ArrayList arrayList, String str) {
        this.f33945b = d8Var;
        this.f33946c = arrayList;
        this.d = str;
    }
}
