package org.telegram.ui.Components;
public final class qs implements org.telegram.messenger.u10 {
    public final int f37471a;
    public final Object f37472b;

    public qs(Object obj, int i7) {
        this.f37471a = i7;
        this.f37472b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f37471a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f37472b).w());
            case 1:
                return ((j30) this.f37472b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((zs) this.f37472b).w());
        }
    }
}
