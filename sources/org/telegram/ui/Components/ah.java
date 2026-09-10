package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class ah extends HashMap {
    public final int f21492a;
    public final Object f21493b;

    public ah(Object obj, int i10) {
        this.f21492a = i10;
        this.f21493b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f21492a) {
            case 0:
                int i10 = ((dh) this.f21493b).v;
                hj0 hj0Var = (hj0) super.get(obj);
                if (hj0Var == null) {
                    ch chVar = (ch) obj;
                    hj0 hj0Var2 = new hj0(chVar.f22130c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(chVar, hj0Var2);
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
        switch (this.f21492a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f21493b).f46842f;
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
