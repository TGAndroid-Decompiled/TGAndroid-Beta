package org.telegram.ui.Components;
public final class qs implements org.telegram.messenger.u10 {
    public final int f37386a;
    public final Object f37387b;

    public qs(Object obj, int i7) {
        this.f37386a = i7;
        this.f37387b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f37386a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f37387b).w());
            case 1:
                return ((i30) this.f37387b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((ys) this.f37387b).w());
        }
    }
}
