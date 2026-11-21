package org.telegram.ui;
public final class qf implements org.telegram.messenger.q10 {
    public final int f51271a;
    public final bn f51272b;
    public final String f51273c;

    public qf(bn bnVar, String str, int i7) {
        this.f51271a = i7;
        this.f51272b = bnVar;
        this.f51273c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f51271a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    bn bnVar = this.f51272b;
                    String str = this.f51273c;
                    if (booleanValue) {
                        bnVar.getMessagesController().p(str, false);
                    }
                    bnVar.getParentActivity();
                    vf.c.o(str);
                    return;
                }
                return;
            default:
                bn bnVar2 = this.f51272b;
                bnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f51273c;
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
