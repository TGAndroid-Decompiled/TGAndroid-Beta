package org.telegram.ui.Wallet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public final class v3 {
    public final HashSet f43232a = new HashSet();
    public final HashMap f43233b = new HashMap();

    public static String c(int i7, String str) {
        if (str.length() <= (i7 * 2) + 1) {
            return str;
        }
        return str.substring(0, i7) + "…" + str.substring(str.length() - i7);
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) this.f43233b.get(str);
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    public final void b(int i7, ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            String c10 = c(i7, str);
            ArrayList arrayList2 = (ArrayList) hashMap.get(c10);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap.put(c10, arrayList2);
            }
            arrayList2.add(str);
        }
        for (ArrayList arrayList3 : hashMap.values()) {
            if (arrayList3.size() == 1) {
                String str2 = (String) arrayList3.get(0);
                this.f43233b.put(str2, c(i7, str2));
            } else {
                b(i7 + 1, arrayList3);
            }
        }
    }
}
