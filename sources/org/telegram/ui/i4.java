package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
public final class i4 implements Runnable {
    public final int f37853a;
    public final int f37854b;
    public final Object f37855c;
    public final Object d;

    public i4(int i10, Object obj, Object obj2, int i11) {
        this.f37853a = i11;
        this.f37854b = i10;
        this.f37855c = obj;
        this.d = obj2;
    }

    private final void a() {
        int i10;
        org.telegram.ui.Components.j21 j21Var = (org.telegram.ui.Components.j21) this.f37855c;
        String str = (String) this.d;
        int i11 = this.f37854b;
        org.telegram.ui.Components.i21 i21Var = j21Var.f27392r.f24404n;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                j21Var.d = -1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cz0(j21Var, j21Var.d, new ArrayList(), new ArrayList(), 1));
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
            int size = i21Var.d.size();
            for (int i13 = 0; i13 < size; i13++) {
                ArrayList arrayList3 = (ArrayList) i21Var.d.get(i13);
                String i14 = org.telegram.ui.ActionBar.g5.i(((org.telegram.ui.ActionBar.j6) arrayList3.get(0)).f21463f);
                String lowerCase2 = i14.toLowerCase();
                int i15 = 0;
                while (true) {
                    if (i15 < i12) {
                        String str2 = strArr[i15];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.j21.E(i14, str2));
                            break;
                        }
                        i15++;
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cz0(j21Var, i11, arrayList, arrayList2, 1));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i4.run():void");
    }

    public i4(Object obj, int i10, Object obj2, int i11) {
        this.f37853a = i11;
        this.f37855c = obj;
        this.f37854b = i10;
        this.d = obj2;
    }

    public i4(Object obj, Object obj2, int i10, int i11) {
        this.f37853a = i11;
        this.f37855c = obj;
        this.d = obj2;
        this.f37854b = i10;
    }

    public i4(j4 j4Var, int i10, int[] iArr, int[] iArr2) {
        this.f37853a = 0;
        this.f37855c = j4Var;
        this.f37854b = i10;
        this.d = iArr2;
    }
}
