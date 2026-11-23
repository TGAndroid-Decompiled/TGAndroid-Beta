package org.telegram.ui.Components;

import java.util.HashMap;
public final class xg extends HashMap {
    public final int f42036a;
    public final Object f42037b;

    public xg(Object obj, int i7) {
        this.f42036a = i7;
        this.f42037b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f42036a) {
            case 0:
                int i7 = ((ah) this.f42037b).f33480w;
                oh0 oh0Var = (oh0) super.get(obj);
                if (oh0Var == null) {
                    zg zgVar = (zg) obj;
                    oh0 oh0Var2 = new oh0(zgVar.f42770c, org.telegram.messenger.g0.L(i7), org.telegram.messenger.g0.L(i7));
                    put(zgVar, oh0Var2);
                    return oh0Var2;
                }
                return oh0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f42036a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f42037b).f61174f;
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
