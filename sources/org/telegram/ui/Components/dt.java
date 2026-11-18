package org.telegram.ui.Components;
public final class dt implements org.telegram.messenger.p10 {
    public final int f34500a;
    public final Object f34501b;

    public dt(Object obj, int i7) {
        this.f34500a = i7;
        this.f34501b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f34500a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f34501b).w());
            case 1:
                return ((t30) this.f34501b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((mt) this.f34501b).w());
        }
    }
}
