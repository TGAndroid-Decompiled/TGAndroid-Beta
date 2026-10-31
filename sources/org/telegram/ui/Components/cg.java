package org.telegram.ui.Components;

import java.util.HashMap;
public final class cg extends HashMap {
    public final int f25069a;
    public final Object f25070b;

    public cg(Object obj, int i10) {
        this.f25069a = i10;
        this.f25070b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f25069a) {
            case 0:
                int i10 = ((fg) this.f25070b).f26056w;
                bi0 bi0Var = (bi0) super.get(obj);
                if (bi0Var == null) {
                    eg egVar = (eg) obj;
                    bi0 bi0Var2 = new bi0(egVar.f25777c, org.telegram.messenger.i0.L(i10), org.telegram.messenger.i0.L(i10));
                    put(egVar, bi0Var2);
                    return bi0Var2;
                }
                return bi0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f25069a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((sc.h) this.f25070b).f48170f;
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
