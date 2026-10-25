package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ag implements Utilities.Callback2 {
    public final int f37781a;
    public final un f37782b;
    public final String f37783c;

    public ag(un unVar, String str, int i10) {
        this.f37781a = i10;
        this.f37782b = unVar;
        this.f37783c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f37781a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    un unVar = this.f37782b;
                    String str = this.f37783c;
                    if (booleanValue) {
                        unVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    unVar.getParentActivity();
                    qf.d.m(str);
                    return;
                }
                return;
            default:
                un unVar2 = this.f37782b;
                unVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f37783c;
                    if (booleanValue2) {
                        unVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    qf.d.l(unVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
