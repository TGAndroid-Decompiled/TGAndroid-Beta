package org.telegram.ui.Components;
public final class qs implements org.telegram.messenger.u10 {
    public final int f37416a;
    public final Object f37417b;

    public qs(Object obj, int i7) {
        this.f37416a = i7;
        this.f37417b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f37416a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f37417b).w());
            case 1:
                return ((i30) this.f37417b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((zs) this.f37417b).w());
        }
    }
}
