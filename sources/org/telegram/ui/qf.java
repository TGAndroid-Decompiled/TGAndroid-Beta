package org.telegram.ui;
public final class qf implements org.telegram.messenger.v10 {
    public final int f49038a;
    public final cn f49039b;
    public final String f49040c;

    public qf(cn cnVar, String str, int i7) {
        this.f49038a = i7;
        this.f49039b = cnVar;
        this.f49040c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f49038a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    cn cnVar = this.f49039b;
                    String str = this.f49040c;
                    if (booleanValue) {
                        cnVar.getMessagesController().p(str, false);
                    }
                    cnVar.getParentActivity();
                    vf.c.o(str);
                    return;
                }
                return;
            default:
                cn cnVar2 = this.f49039b;
                cnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f49040c;
                    if (booleanValue2) {
                        cnVar2.getMessagesController().p(str2, true);
                    }
                    vf.c.n(cnVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
