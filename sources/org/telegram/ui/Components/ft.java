package org.telegram.ui.Components;
public final class ft implements org.telegram.messenger.p10 {
    public final int f35312a;
    public final Object f35313b;

    public ft(Object obj, int i7) {
        this.f35312a = i7;
        this.f35313b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f35312a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f35313b).w());
            case 1:
                return ((w30) this.f35313b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((ot) this.f35313b).w());
        }
    }
}
