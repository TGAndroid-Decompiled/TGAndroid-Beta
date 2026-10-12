package org.telegram.ui.Components;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
public final class ch extends HashMap {
    public final int f24941a;
    public final Object f24942b;

    public ch(Object obj, int i10) {
        this.f24941a = i10;
        this.f24942b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f24941a) {
            case 0:
                int i10 = ((fh) this.f24942b).v;
                fk0 fk0Var = (fk0) super.get(obj);
                if (fk0Var == null) {
                    eh ehVar = (eh) obj;
                    fk0 fk0Var2 = new fk0(ehVar.f25698c, AndroidUtilities.dp(i10), AndroidUtilities.dp(i10));
                    put(ehVar, fk0Var2);
                    return fk0Var2;
                }
                return fk0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f24941a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((zc.g) this.f24942b).f54575f;
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
