package org.telegram.ui.Components;
public final class ft implements org.telegram.messenger.q10 {
    public final int f35270a;
    public final Object f35271b;

    public ft(Object obj, int i7) {
        this.f35270a = i7;
        this.f35271b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f35270a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f35271b).w());
            case 1:
                return ((w30) this.f35271b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((ot) this.f35271b).w());
        }
    }
}
