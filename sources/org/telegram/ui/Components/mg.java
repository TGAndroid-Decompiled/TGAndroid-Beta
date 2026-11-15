package org.telegram.ui.Components;

import java.util.HashMap;
public final class mg extends HashMap {
    public final int f37244a;
    public final Object f37245b;

    public mg(Object obj, int i7) {
        this.f37244a = i7;
        this.f37245b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f37244a) {
            case 0:
                int i7 = ((pg) this.f37245b).f38298w;
                ch0 ch0Var = (ch0) super.get(obj);
                if (ch0Var == null) {
                    og ogVar = (og) obj;
                    ch0 ch0Var2 = new ch0(ogVar.f37945c, org.telegram.messenger.g0.L(i7), org.telegram.messenger.g0.L(i7));
                    put(ogVar, ch0Var2);
                    return ch0Var2;
                }
                return ch0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f37244a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f37245b).f60598f;
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
