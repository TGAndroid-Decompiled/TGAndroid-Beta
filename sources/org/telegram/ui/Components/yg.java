package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class yg extends HashMap {
    public final int f30639a;
    public final Object f30640b;

    public yg(Object obj, int i10) {
        this.f30639a = i10;
        this.f30640b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f30639a) {
            case 0:
                int i10 = ((bh) this.f30640b).v;
                jj0 jj0Var = (jj0) super.get(obj);
                if (jj0Var == null) {
                    ah ahVar = (ah) obj;
                    jj0 jj0Var2 = new jj0(ahVar.f22644c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(ahVar, jj0Var2);
                    return jj0Var2;
                }
                return jj0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f30639a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f30640b).f46970f;
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
