package org.telegram.ui;
public final class fg implements org.telegram.messenger.k20 {
    public final int f37134a;
    public final un f37135b;
    public final String f37136c;

    public fg(un unVar, String str, int i10) {
        this.f37134a = i10;
        this.f37135b = unVar;
        this.f37136c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f37134a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    un unVar = this.f37135b;
                    String str = this.f37136c;
                    if (booleanValue) {
                        unVar.getMessagesController().p(str, false);
                    }
                    unVar.getParentActivity();
                    gf.f.m(str);
                    return;
                }
                return;
            default:
                un unVar2 = this.f37135b;
                unVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f37136c;
                    if (booleanValue2) {
                        unVar2.getMessagesController().p(str2, true);
                    }
                    gf.f.l(unVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
