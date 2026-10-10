package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class ah extends HashMap {
    public final int f24566a;
    public final Object f24567b;

    public ah(Object obj, int i10) {
        this.f24566a = i10;
        this.f24567b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f24566a) {
            case 0:
                int i10 = ((dh) this.f24567b).v;
                dk0 dk0Var = (dk0) super.get(obj);
                if (dk0Var == null) {
                    ch chVar = (ch) obj;
                    dk0 dk0Var2 = new dk0(chVar.f25298c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(chVar, dk0Var2);
                    return dk0Var2;
                }
                return dk0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f24566a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((zc.g) this.f24567b).f54395f;
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
