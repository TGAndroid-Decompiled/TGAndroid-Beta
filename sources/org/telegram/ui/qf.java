package org.telegram.ui;
public final class qf implements org.telegram.messenger.q10 {
    public final int f51216a;
    public final bn f51217b;
    public final String f51218c;

    public qf(bn bnVar, String str, int i7) {
        this.f51216a = i7;
        this.f51217b = bnVar;
        this.f51218c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f51216a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    bn bnVar = this.f51217b;
                    String str = this.f51218c;
                    if (booleanValue) {
                        bnVar.getMessagesController().p(str, false);
                    }
                    bnVar.getParentActivity();
                    vf.c.o(str);
                    return;
                }
                return;
            default:
                bn bnVar2 = this.f51217b;
                bnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f51218c;
                    if (booleanValue2) {
                        bnVar2.getMessagesController().p(str2, true);
                    }
                    vf.c.n(bnVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
