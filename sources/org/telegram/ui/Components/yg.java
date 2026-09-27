package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class yg extends HashMap {
    public final int f30661a;
    public final Object f30662b;

    public yg(Object obj, int i10) {
        this.f30661a = i10;
        this.f30662b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f30661a) {
            case 0:
                int i10 = ((bh) this.f30662b).v;
                kj0 kj0Var = (kj0) super.get(obj);
                if (kj0Var == null) {
                    ah ahVar = (ah) obj;
                    kj0 kj0Var2 = new kj0(ahVar.f22679c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(ahVar, kj0Var2);
                    return kj0Var2;
                }
                return kj0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f30661a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f30662b).f47016f;
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
