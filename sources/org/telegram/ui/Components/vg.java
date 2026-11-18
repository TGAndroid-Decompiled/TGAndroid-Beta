package org.telegram.ui.Components;

import java.util.HashMap;
public final class vg extends HashMap {
    public final int f40618a;
    public final Object f40619b;

    public vg(Object obj, int i7) {
        this.f40618a = i7;
        this.f40619b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f40618a) {
            case 0:
                int i7 = ((yg) this.f40619b).f42487w;
                mh0 mh0Var = (mh0) super.get(obj);
                if (mh0Var == null) {
                    xg xgVar = (xg) obj;
                    mh0 mh0Var2 = new mh0(xgVar.f42014c, org.telegram.messenger.g0.L(i7), org.telegram.messenger.g0.L(i7));
                    put(xgVar, mh0Var2);
                    return mh0Var2;
                }
                return mh0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f40618a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f40619b).f61163f;
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
