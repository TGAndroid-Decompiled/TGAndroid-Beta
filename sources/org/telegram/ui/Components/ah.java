package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class ah extends HashMap {
    public final int f24514a;
    public final Object f24515b;

    public ah(Object obj, int i10) {
        this.f24514a = i10;
        this.f24515b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f24514a) {
            case 0:
                int i10 = ((dh) this.f24515b).v;
                ek0 ek0Var = (ek0) super.get(obj);
                if (ek0Var == null) {
                    ch chVar = (ch) obj;
                    ek0 ek0Var2 = new ek0(chVar.f25212c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(chVar, ek0Var2);
                    return ek0Var2;
                }
                return ek0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f24514a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((zc.g) this.f24515b).f54438f;
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
