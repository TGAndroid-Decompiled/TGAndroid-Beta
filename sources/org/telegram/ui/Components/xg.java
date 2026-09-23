package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class xg extends HashMap {
    public final int f29991a;
    public final Object f29992b;

    public xg(Object obj, int i10) {
        this.f29991a = i10;
        this.f29992b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f29991a) {
            case 0:
                int i10 = ((ah) this.f29992b).v;
                yi0 yi0Var = (yi0) super.get(obj);
                if (yi0Var == null) {
                    zg zgVar = (zg) obj;
                    yi0 yi0Var2 = new yi0(zgVar.f30584c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(zgVar, yi0Var2);
                    return yi0Var2;
                }
                return yi0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f29991a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f29992b).f46646f;
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
