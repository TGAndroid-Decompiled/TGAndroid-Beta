package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class xg extends HashMap {
    public final int f30259a;
    public final Object f30260b;

    public xg(Object obj, int i10) {
        this.f30259a = i10;
        this.f30260b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f30259a) {
            case 0:
                int i10 = ((ah) this.f30260b).v;
                hj0 hj0Var = (hj0) super.get(obj);
                if (hj0Var == null) {
                    zg zgVar = (zg) obj;
                    hj0 hj0Var2 = new hj0(zgVar.f30815c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(zgVar, hj0Var2);
                    return hj0Var2;
                }
                return hj0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f30259a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f30260b).f46994f;
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
