package org.telegram.ui.Components;

import java.util.HashMap;
public final class fg extends HashMap {
    public final int f33541a;
    public final Object f33542b;

    public fg(Object obj, int i7) {
        this.f33541a = i7;
        this.f33542b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f33541a) {
            case 0:
                int i7 = ((ig) this.f33542b).f34617w;
                zg0 zg0Var = (zg0) super.get(obj);
                if (zg0Var == null) {
                    hg hgVar = (hg) obj;
                    zg0 zg0Var2 = new zg0(hgVar.f34336c, org.telegram.messenger.g0.L(i7), org.telegram.messenger.g0.L(i7));
                    put(hgVar, zg0Var2);
                    return zg0Var2;
                }
                return zg0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f33541a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f33542b).f59391f;
                if (str == null) {
                    lowerCase = str;
                } else {
                    lowerCase = str.toLowerCase();
                }
                hashMap.put(lowerCase, str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
