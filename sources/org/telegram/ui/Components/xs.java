package org.telegram.ui.Components;
public final class xs implements org.telegram.messenger.r10 {
    public final int f41748a;
    public final Object f41749b;

    public xs(Object obj, int i7) {
        this.f41748a = i7;
        this.f41749b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f41748a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f41749b).w());
            case 1:
                return ((l30) this.f41749b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((ft) this.f41749b).w());
        }
    }
}
