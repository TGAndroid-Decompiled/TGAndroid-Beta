package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class zg extends HashMap {
    public final int f30964a;
    public final Object f30965b;

    public zg(Object obj, int i10) {
        this.f30964a = i10;
        this.f30965b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f30964a) {
            case 0:
                int i10 = ((ch) this.f30965b).v;
                lj0 lj0Var = (lj0) super.get(obj);
                if (lj0Var == null) {
                    bh bhVar = (bh) obj;
                    lj0 lj0Var2 = new lj0(bhVar.f22939c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(bhVar, lj0Var2);
                    return lj0Var2;
                }
                return lj0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f30964a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f30965b).f47079f;
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
