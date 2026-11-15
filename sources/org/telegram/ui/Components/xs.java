package org.telegram.ui.Components;
public final class xs implements org.telegram.messenger.r10 {
    public final int f41756a;
    public final Object f41757b;

    public xs(Object obj, int i7) {
        this.f41756a = i7;
        this.f41757b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f41756a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f41757b).w());
            case 1:
                return ((l30) this.f41757b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((ft) this.f41757b).w());
        }
    }
}
