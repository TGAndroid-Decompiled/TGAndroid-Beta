package org.telegram.ui.Components;
public final class ft implements org.telegram.messenger.q10 {
    public final int f35314a;
    public final Object f35315b;

    public ft(Object obj, int i7) {
        this.f35314a = i7;
        this.f35315b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f35314a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f35315b).w());
            case 1:
                return ((w30) this.f35315b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((ot) this.f35315b).w());
        }
    }
}
