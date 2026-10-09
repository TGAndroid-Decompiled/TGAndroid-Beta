package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class ah extends HashMap {
    public final int f24686a;
    public final Object f24687b;

    public ah(Object obj, int i10) {
        this.f24686a = i10;
        this.f24687b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f24686a) {
            case 0:
                int i10 = ((dh) this.f24687b).v;
                ck0 ck0Var = (ck0) super.get(obj);
                if (ck0Var == null) {
                    ch chVar = (ch) obj;
                    ck0 ck0Var2 = new ck0(chVar.f25374c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(chVar, ck0Var2);
                    return ck0Var2;
                }
                return ck0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f24686a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((zc.g) this.f24687b).f54349f;
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
