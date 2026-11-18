package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e8 implements Runnable {
    public final int f34636a = 0;
    public final f8 f34637b;
    public final ArrayList f34638c;
    public final String d;

    public e8(f8 f8Var, String str, ArrayList arrayList) {
        this.f34637b = f8Var;
        this.d = str;
        this.f34638c = arrayList;
    }

    @Override
    public final void run() {
        int i7;
        TLRPC.Document document;
        boolean z10;
        String str;
        int i10 = this.f34636a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.f34638c;
        f8 f8Var = this.f34637b;
        switch (i10) {
            case 0:
                f8Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new e8(f8Var, new ArrayList(), str3));
                    return;
                }
                String S0 = org.telegram.messenger.gd.E0().S0(lowerCase, true, false);
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
                                        document = fjVar.f23968k.media.webpage.document;
                                    } else {
                                        document = fjVar.f23968k.media.document;
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
                org.telegram.messenger.g0.g3(new e8(f8Var, arrayList2, str3));
                return;
            default:
                g8 g8Var = f8Var.f35022n;
                if (g8Var.f35406r1) {
                    g8Var.f35404q1 = true;
                    f8Var.d = arrayList;
                    f8Var.f35020e = str3;
                    f8Var.f();
                    g8Var.f35410t1.n0(0);
                    org.telegram.messenger.f3.q(null, null, 2131748048, new Object[]{str3}, g8Var.f35418x1);
                    return;
                }
                return;
        }
    }

    public e8(f8 f8Var, ArrayList arrayList, String str) {
        this.f34637b = f8Var;
        this.f34638c = arrayList;
        this.d = str;
    }
}
