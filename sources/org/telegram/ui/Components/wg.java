package org.telegram.ui.Components;

import java.util.HashMap;
public final class wg extends HashMap {
    public final int f41643a;
    public final Object f41644b;

    public wg(Object obj, int i7) {
        this.f41643a = i7;
        this.f41644b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f41643a) {
            case 0:
                int i7 = ((zg) this.f41644b).f42849w;
                nh0 nh0Var = (nh0) super.get(obj);
                if (nh0Var == null) {
                    yg ygVar = (yg) obj;
                    nh0 nh0Var2 = new nh0(ygVar.f42458c, org.telegram.messenger.g0.L(i7), org.telegram.messenger.g0.L(i7));
                    put(ygVar, nh0Var2);
                    return nh0Var2;
                }
                return nh0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f41643a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f41644b).f61293f;
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
