package org.telegram.ui.Components;

import java.util.HashMap;
public final class eg extends HashMap {
    public final int f33386a;
    public final Object f33387b;

    public eg(Object obj, int i3) {
        this.f33386a = i3;
        this.f33387b = obj;
    }

    @Override
    public Object get(Object obj) {
        switch (this.f33386a) {
            case 0:
                int i3 = ((hg) this.f33387b).f34383w;
                ch0 ch0Var = (ch0) super.get(obj);
                if (ch0Var == null) {
                    gg ggVar = (gg) obj;
                    ch0 ch0Var2 = new ch0(ggVar.f34091c, org.telegram.messenger.g0.L(i3), org.telegram.messenger.g0.L(i3));
                    put(ggVar, ch0Var2);
                    return ch0Var2;
                }
                return ch0Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f33386a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((vc.g) this.f33387b).f56548f;
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
