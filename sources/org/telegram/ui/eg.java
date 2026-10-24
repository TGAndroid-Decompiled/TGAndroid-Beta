package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class eg implements Utilities.Callback2 {
    public final int f36902a;
    public final sn f36903b;
    public final String f36904c;

    public eg(sn snVar, String str, int i10) {
        this.f36902a = i10;
        this.f36903b = snVar;
        this.f36904c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f36902a) {
            case 0:
                sn snVar = this.f36903b;
                snVar.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    String str = this.f36904c;
                    if (booleanValue) {
                        snVar.getMessagesController().addWebBrowserException(str, true);
                    }
                    pf.d.l(snVar.getParentActivity(), str, false, null);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    sn snVar2 = this.f36903b;
                    String str2 = this.f36904c;
                    if (booleanValue2) {
                        snVar2.getMessagesController().addWebBrowserException(str2, false);
                    }
                    snVar2.getParentActivity();
                    pf.d.m(str2);
                    return;
                }
                return;
        }
    }
}
