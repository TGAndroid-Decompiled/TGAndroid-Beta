package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class bg implements Utilities.Callback2 {
    public final int f35631a;
    public final qn f35632b;
    public final String f35633c;

    public bg(qn qnVar, String str, int i10) {
        this.f35631a = i10;
        this.f35632b = qnVar;
        this.f35633c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f35631a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    qn qnVar = this.f35632b;
                    String str = this.f35633c;
                    if (booleanValue) {
                        qnVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    qnVar.getParentActivity();
                    pf.d.m(str);
                    return;
                }
                return;
            default:
                qn qnVar2 = this.f35632b;
                qnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f35633c;
                    if (booleanValue2) {
                        qnVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    pf.d.l(qnVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
