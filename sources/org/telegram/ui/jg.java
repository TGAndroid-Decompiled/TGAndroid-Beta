package org.telegram.ui;
public final class jg implements org.telegram.messenger.j20 {
    public final int f38520a;
    public final un f38521b;
    public final String f38522c;

    public jg(un unVar, String str, int i10) {
        this.f38520a = i10;
        this.f38521b = unVar;
        this.f38522c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f38520a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    un unVar = this.f38521b;
                    String str = this.f38522c;
                    if (booleanValue) {
                        unVar.getMessagesController().p(str, false);
                    }
                    unVar.getParentActivity();
                    gf.f.m(str);
                    return;
                }
                return;
            default:
                un unVar2 = this.f38521b;
                unVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f38522c;
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
