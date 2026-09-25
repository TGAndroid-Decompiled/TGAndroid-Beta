package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class yg extends HashMap {
    public final int f30601a;
    public final Object f30602b;

    public yg(Object obj, int i10) {
        this.f30601a = i10;
        this.f30602b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f30601a) {
            case 0:
                int i10 = ((bh) this.f30602b).v;
                ij0 ij0Var = (ij0) super.get(obj);
                if (ij0Var == null) {
                    ah ahVar = (ah) obj;
                    ij0 ij0Var2 = new ij0(ahVar.f22689c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(ahVar, ij0Var2);
                    return ij0Var2;
                }
                return ij0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f30601a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f30602b).f46972f;
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
