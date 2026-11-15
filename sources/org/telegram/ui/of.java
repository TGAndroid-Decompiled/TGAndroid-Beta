package org.telegram.ui;
public final class of implements org.telegram.messenger.s10 {
    public final int f49941a;
    public final an f49942b;
    public final String f49943c;

    public of(an anVar, String str, int i7) {
        this.f49941a = i7;
        this.f49942b = anVar;
        this.f49943c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f49941a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    an anVar = this.f49942b;
                    String str = this.f49943c;
                    if (booleanValue) {
                        anVar.getMessagesController().p(str, false);
                    }
                    anVar.getParentActivity();
                    vf.c.o(str);
                    return;
                }
                return;
            default:
                an anVar2 = this.f49942b;
                anVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f49943c;
                    if (booleanValue2) {
                        anVar2.getMessagesController().p(str2, true);
                    }
                    vf.c.n(anVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
