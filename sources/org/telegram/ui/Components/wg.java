package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class wg extends HashMap {
    public final int f29719a;
    public final Object f29720b;

    public wg(Object obj, int i10) {
        this.f29719a = i10;
        this.f29720b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f29719a) {
            case 0:
                int i10 = ((zg) this.f29720b).v;
                xi0 xi0Var = (xi0) super.get(obj);
                if (xi0Var == null) {
                    yg ygVar = (yg) obj;
                    xi0 xi0Var2 = new xi0(ygVar.f30241c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(ygVar, xi0Var2);
                    return xi0Var2;
                }
                return xi0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f29719a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f29720b).f46688f;
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
