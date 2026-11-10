package org.telegram.ui.Components;
public final class ps implements org.telegram.messenger.u10 {
    public final int f37069a;
    public final Object f37070b;

    public ps(Object obj, int i7) {
        this.f37069a = i7;
        this.f37070b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f37069a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f37070b).w());
            case 1:
                return ((i30) this.f37070b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((ys) this.f37070b).w());
        }
    }
}
