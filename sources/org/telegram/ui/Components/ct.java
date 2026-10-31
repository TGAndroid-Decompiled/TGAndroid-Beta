package org.telegram.ui.Components;
public final class ct implements org.telegram.messenger.i20 {
    public final int f25156a;
    public final Object f25157b;

    public ct(Object obj, int i10) {
        this.f25156a = i10;
        this.f25157b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f25156a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f25157b).w());
            case 1:
                return ((a40) this.f25157b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((mt) this.f25157b).w());
        }
    }
}
