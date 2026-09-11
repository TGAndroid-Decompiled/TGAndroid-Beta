package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class yg extends HashMap {
    public final int f32905a;
    public final Object f32906b;

    public yg(Object obj, int i10) {
        this.f32905a = i10;
        this.f32906b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f32905a) {
            case 0:
                int i10 = ((bh) this.f32906b).v;
                xi0 xi0Var = (xi0) super.get(obj);
                if (xi0Var == null) {
                    ah ahVar = (ah) obj;
                    xi0 xi0Var2 = new xi0(ahVar.f24373c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(ahVar, xi0Var2);
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
        switch (this.f32905a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((yc.g) this.f32906b).f49956f;
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
