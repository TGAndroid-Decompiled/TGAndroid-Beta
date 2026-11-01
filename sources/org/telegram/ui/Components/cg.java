package org.telegram.ui.Components;

import java.util.HashMap;
public final class cg extends HashMap {
    public final int f25104a;
    public final Object f25105b;

    public cg(Object obj, int i10) {
        this.f25104a = i10;
        this.f25105b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f25104a) {
            case 0:
                int i10 = ((fg) this.f25105b).f26155w;
                ci0 ci0Var = (ci0) super.get(obj);
                if (ci0Var == null) {
                    eg egVar = (eg) obj;
                    ci0 ci0Var2 = new ci0(egVar.f25811c, org.telegram.messenger.i0.L(i10), org.telegram.messenger.i0.L(i10));
                    put(egVar, ci0Var2);
                    return ci0Var2;
                }
                return ci0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f25104a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((sc.h) this.f25105b).f48181f;
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
