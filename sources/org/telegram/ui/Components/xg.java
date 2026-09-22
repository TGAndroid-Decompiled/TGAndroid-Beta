package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class xg extends HashMap {
    public final int f30318a;
    public final Object f30319b;

    public xg(Object obj, int i10) {
        this.f30318a = i10;
        this.f30319b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f30318a) {
            case 0:
                int i10 = ((ah) this.f30319b).v;
                kj0 kj0Var = (kj0) super.get(obj);
                if (kj0Var == null) {
                    zg zgVar = (zg) obj;
                    kj0 kj0Var2 = new kj0(zgVar.f30888c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(zgVar, kj0Var2);
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
        switch (this.f30318a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f30319b).f47015f;
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
