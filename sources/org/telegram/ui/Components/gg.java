package org.telegram.ui.Components;

import java.util.HashMap;
public final class gg extends HashMap {
    public final int f33946a;
    public final Object f33947b;

    public gg(Object obj, int i7) {
        this.f33946a = i7;
        this.f33947b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f33946a) {
            case 0:
                int i7 = ((jg) this.f33947b).f35008w;
                ah0 ah0Var = (ah0) super.get(obj);
                if (ah0Var == null) {
                    ig igVar = (ig) obj;
                    ah0 ah0Var2 = new ah0(igVar.f34736c, org.telegram.messenger.g0.L(i7), org.telegram.messenger.g0.L(i7));
                    put(igVar, ah0Var2);
                    return ah0Var2;
                }
                return ah0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f33946a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f33947b).f59393f;
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
