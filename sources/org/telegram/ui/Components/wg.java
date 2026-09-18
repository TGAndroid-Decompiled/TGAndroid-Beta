package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class wg extends HashMap {
    public final int f29667a;
    public final Object f29668b;

    public wg(Object obj, int i10) {
        this.f29667a = i10;
        this.f29668b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f29667a) {
            case 0:
                int i10 = ((zg) this.f29668b).v;
                yi0 yi0Var = (yi0) super.get(obj);
                if (yi0Var == null) {
                    yg ygVar = (yg) obj;
                    yi0 yi0Var2 = new yi0(ygVar.f30203c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(ygVar, yi0Var2);
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
        switch (this.f29667a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f29668b).f46720f;
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
