package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class zg extends HashMap {
    public final int f33491a;
    public final Object f33492b;

    public zg(Object obj, int i10) {
        this.f33491a = i10;
        this.f33492b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f33491a) {
            case 0:
                int i10 = ((ch) this.f33492b).v;
                kj0 kj0Var = (kj0) super.get(obj);
                if (kj0Var == null) {
                    bh bhVar = (bh) obj;
                    kj0 kj0Var2 = new kj0(bhVar.f24954c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(bhVar, kj0Var2);
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
        switch (this.f33491a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f33492b).f50838f;
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
