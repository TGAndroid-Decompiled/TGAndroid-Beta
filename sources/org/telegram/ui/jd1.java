package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class jd1 implements Runnable {

    public final int f39345a;

    public final kd1 f39346b;

    public final String f39347c;
    public final int d;

    public jd1(kd1 kd1Var, String str, int i10, int i11) {
        this.f39345a = i11;
        this.f39346b = kd1Var;
        this.f39347c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f39345a) {
            case 0:
                kd1 kd1Var = this.f39346b;
                String str = this.f39347c;
                int i10 = this.d;
                kd1Var.getClass();
                Utilities.searchQueue.postRunnable(new jd1(kd1Var, str, i10, 1));
                break;
            default:
                kd1 kd1Var2 = this.f39346b;
                String str2 = this.f39347c;
                int i11 = this.d;
                ld1 ld1Var = kd1Var2.h;
                ArrayList arrayList = ld1Var.f40059f;
                String lowerCase = str2.trim().toLowerCase();
                String str3 = null;
                if (lowerCase.length() != 0) {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str3 = translitString;
                    }
                    int i12 = (str3 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i12];
                    strArr[0] = lowerCase;
                    if (str3 != null) {
                        strArr[1] = str3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    ArrayList arrayList3 = new ArrayList();
                    int i14 = 0;
                    while (i14 < arrayList.size()) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i14);
                        int i15 = 0;
                        boolean z10 = false;
                        while (i15 < 2) {
                            String publicUsername = i15 == 0 ? chat.title : ChatObject.getPublicUsername(chat);
                            if (publicUsername != null) {
                                String lowerCase2 = publicUsername.toLowerCase();
                                while (i13 < i12) {
                                    String str4 = strArr[i13];
                                    if (!lowerCase2.startsWith(str4)) {
                                        int i16 = i13;
                                        if (!org.telegram.messenger.y1.x(" ", str4, lowerCase2)) {
                                            i13 = i16 + 1;
                                        }
                                    }
                                    z10 = true;
                                    if (z10) {
                                        arrayList2.add(chat);
                                        arrayList3.add((String) ld1Var.h.get(i14));
                                    }
                                    break;
                                }
                                if (z10) {
                                    arrayList2.add(chat);
                                    arrayList3.add((String) ld1Var.h.get(i14));
                                }
                                break;
                            }
                            i15++;
                            i13 = 0;
                        }
                        i14++;
                        i13 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new xs(kd1Var2, i11, arrayList2, arrayList3, 11));
                } else {
                    AndroidUtilities.runOnUIThread(new xs(kd1Var2, i11, str3, str3, 11));
                }
                break;
        }
    }
}
