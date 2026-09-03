package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class hg implements Utilities.Callback2 {
    public final int f37373a;
    public final xn f37374b;
    public final String f37375c;

    public hg(xn xnVar, String str, int i10) {
        this.f37373a = i10;
        this.f37374b = xnVar;
        this.f37375c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f37373a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    xn xnVar = this.f37374b;
                    String str = this.f37375c;
                    if (booleanValue) {
                        xnVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    xnVar.getParentActivity();
                    af.g.n(str);
                    return;
                }
                return;
            default:
                xn xnVar2 = this.f37374b;
                xnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f37375c;
                    if (booleanValue2) {
                        xnVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    af.g.m(xnVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
