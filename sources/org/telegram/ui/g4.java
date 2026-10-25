package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
public final class g4 implements Runnable {
    public final int f39535a;
    public final int f39536b;
    public final Object f39537c;
    public final Object d;

    public g4(int i10, Object obj, Object obj2, int i11) {
        this.f39535a = i11;
        this.f39536b = i10;
        this.f39537c = obj;
        this.d = obj2;
    }

    private final void a() {
        int i10;
        org.telegram.ui.Components.u21 u21Var = (org.telegram.ui.Components.u21) this.f39537c;
        String str = (String) this.d;
        int i11 = this.f39536b;
        org.telegram.ui.Components.t21 t21Var = u21Var.f33230r.f26339n;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                u21Var.d = -1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zr0(u21Var, u21Var.d, new ArrayList(), new ArrayList(), 4));
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            translitString = (lowerCase.equals(translitString) || translitString.length() == 0) ? null : null;
            if (translitString != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            int i12 = i10 + 1;
            String[] strArr = new String[i12];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = t21Var.d.size();
            for (int i13 = 0; i13 < size; i13++) {
                ArrayList arrayList3 = (ArrayList) t21Var.d.get(i13);
                String c10 = org.telegram.ui.ActionBar.m5.c(((org.telegram.ui.ActionBar.h7) arrayList3.get(0)).e);
                String lowerCase2 = c10.toLowerCase();
                int i14 = 0;
                while (true) {
                    if (i14 < i12) {
                        String str2 = strArr[i14];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.u21.E(c10, str2));
                            break;
                        }
                        i14++;
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zr0(u21Var, i11, arrayList, arrayList2, 4));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g4.run():void");
    }

    public g4(Object obj, int i10, Object obj2, int i11) {
        this.f39535a = i11;
        this.f39537c = obj;
        this.f39536b = i10;
        this.d = obj2;
    }

    public g4(Object obj, Object obj2, int i10, int i11) {
        this.f39535a = i11;
        this.f39537c = obj;
        this.d = obj2;
        this.f39536b = i10;
    }

    public g4(h4 h4Var, int i10, int[] iArr, int[] iArr2) {
        this.f39535a = 0;
        this.f39537c = h4Var;
        this.f39536b = i10;
        this.d = iArr2;
    }
}
