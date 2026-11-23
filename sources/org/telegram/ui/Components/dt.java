package org.telegram.ui.Components;
public final class dt implements org.telegram.messenger.o10 {
    public final int f34452a;
    public final Object f34453b;

    public dt(Object obj, int i7) {
        this.f34452a = i7;
        this.f34453b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f34452a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f34453b).w());
            case 1:
                return ((t30) this.f34453b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((mt) this.f34453b).w());
        }
    }
}
