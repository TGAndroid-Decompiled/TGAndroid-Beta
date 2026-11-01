package org.telegram.ui.Components;
public final class ct implements org.telegram.messenger.j20 {
    public final int f25235a;
    public final Object f25236b;

    public ct(Object obj, int i10) {
        this.f25235a = i10;
        this.f25236b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f25235a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f25236b).w());
            case 1:
                return ((a40) this.f25236b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((mt) this.f25236b).w());
        }
    }
}
