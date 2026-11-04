package org.telegram.ui.Components;
public final class qs implements org.telegram.messenger.m10 {
    public final int f37519a;
    public final Object f37520b;

    public qs(Object obj, int i3) {
        this.f37519a = i3;
        this.f37520b = obj;
    }

    @Override
    public final Object run() {
        switch (this.f37519a) {
            case 0:
                return Boolean.valueOf(((EditTextBoldCursor) this.f37520b).w());
            case 1:
                return ((e30) this.f37520b).getCloseIntoObject();
            default:
                return Boolean.valueOf(((xs) this.f37520b).w());
        }
    }
}
