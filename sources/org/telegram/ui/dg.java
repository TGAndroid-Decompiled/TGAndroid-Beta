package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class dg implements Utilities.Callback2 {
    public final int f37534a;
    public final qn f37535b;
    public final String f37536c;

    public dg(qn qnVar, String str, int i9) {
        this.f37534a = i9;
        this.f37535b = qnVar;
        this.f37536c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f37534a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    qn qnVar = this.f37535b;
                    String str = this.f37536c;
                    if (booleanValue) {
                        qnVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    qnVar.getParentActivity();
                    ve.e.n(str);
                    return;
                }
                return;
            default:
                qn qnVar2 = this.f37535b;
                qnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f37536c;
                    if (booleanValue2) {
                        qnVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    ve.e.m(qnVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
