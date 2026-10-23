package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
public final class h4 implements Runnable {
    public final int f37725a;
    public final int f37726b;
    public final Object f37727c;
    public final Object d;

    public h4(int i10, Object obj, Object obj2, int i11) {
        this.f37725a = i11;
        this.f37726b = i10;
        this.f37727c = obj;
        this.d = obj2;
    }

    private final void a() {
        int i10;
        org.telegram.ui.Components.m21 m21Var = (org.telegram.ui.Components.m21) this.f37727c;
        String str = (String) this.d;
        int i11 = this.f37726b;
        org.telegram.ui.Components.l21 l21Var = m21Var.f28485r.f24548n;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                m21Var.d = -1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fz0(m21Var, m21Var.d, new ArrayList(), new ArrayList(), 2));
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
            int size = l21Var.d.size();
            for (int i13 = 0; i13 < size; i13++) {
                ArrayList arrayList3 = (ArrayList) l21Var.d.get(i13);
                String i14 = org.telegram.ui.ActionBar.k5.i(((org.telegram.ui.ActionBar.t6) arrayList3.get(0)).e);
                String lowerCase2 = i14.toLowerCase();
                int i15 = 0;
                while (true) {
                    if (i15 < i12) {
                        String str2 = strArr[i15];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.m21.E(i14, str2));
                            break;
                        }
                        i15++;
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fz0(m21Var, i11, arrayList, arrayList2, 2));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h4.run():void");
    }

    public h4(Object obj, int i10, Object obj2, int i11) {
        this.f37725a = i11;
        this.f37727c = obj;
        this.f37726b = i10;
        this.d = obj2;
    }

    public h4(Object obj, Object obj2, int i10, int i11) {
        this.f37725a = i11;
        this.f37727c = obj;
        this.d = obj2;
        this.f37726b = i10;
    }

    public h4(i4 i4Var, int i10, int[] iArr, int[] iArr2) {
        this.f37725a = 0;
        this.f37727c = i4Var;
        this.f37726b = i10;
        this.d = iArr2;
    }
}
