package org.telegram.ui.Components;
public final class qs implements org.telegram.messenger.u10 {
    public final int f37501a;
    public final Object f37502b;

    public qs(Object obj, int i7) {
        this.f37501a = i7;
        this.f37502b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f37501a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f37502b).w());
            case 1:
                return ((i30) this.f37502b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((ys) this.f37502b).w());
        }
    }
}
