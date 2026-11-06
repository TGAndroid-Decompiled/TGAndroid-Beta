package org.telegram.ui.Components;
public final class qs implements org.telegram.messenger.u10 {
    public final int f37391a;
    public final Object f37392b;

    public qs(Object obj, int i7) {
        this.f37391a = i7;
        this.f37392b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f37391a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f37392b).w());
            case 1:
                return ((i30) this.f37392b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((ys) this.f37392b).w());
        }
    }
}
