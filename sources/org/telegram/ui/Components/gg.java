package org.telegram.ui.Components;

import java.util.HashMap;
public final class gg extends HashMap {
    public final int f33910a;
    public final Object f33911b;

    public gg(Object obj, int i7) {
        this.f33910a = i7;
        this.f33911b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f33910a) {
            case 0:
                int i7 = ((jg) this.f33911b).f34953w;
                zg0 zg0Var = (zg0) super.get(obj);
                if (zg0Var == null) {
                    ig igVar = (ig) obj;
                    zg0 zg0Var2 = new zg0(igVar.f34618c, org.telegram.messenger.g0.L(i7), org.telegram.messenger.g0.L(i7));
                    put(igVar, zg0Var2);
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
        switch (this.f33910a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f33911b).f59294f;
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
