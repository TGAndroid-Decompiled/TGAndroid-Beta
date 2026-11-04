package org.telegram.ui;
public final class nf implements org.telegram.messenger.n10 {
    public final int f47982a;
    public final wm f47983b;
    public final String f47984c;

    public nf(wm wmVar, String str, int i3) {
        this.f47982a = i3;
        this.f47983b = wmVar;
        this.f47984c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f47982a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    wm wmVar = this.f47983b;
                    String str = this.f47984c;
                    if (booleanValue) {
                        wmVar.getMessagesController().p(str, false);
                    }
                    wmVar.getParentActivity();
                    sf.c.o(str);
                    return;
                }
                return;
            default:
                wm wmVar2 = this.f47983b;
                wmVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f47984c;
                    if (booleanValue2) {
                        wmVar2.getMessagesController().p(str2, true);
                    }
                    sf.c.n(wmVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
