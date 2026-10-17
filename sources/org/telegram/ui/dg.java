package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class dg implements Utilities.Callback2 {
    public final int f36191a;
    public final sn f36192b;
    public final String f36193c;

    public dg(sn snVar, String str, int i10) {
        this.f36191a = i10;
        this.f36192b = snVar;
        this.f36193c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f36191a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    sn snVar = this.f36192b;
                    String str = this.f36193c;
                    if (booleanValue) {
                        snVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    snVar.getParentActivity();
                    pf.d.m(str);
                    return;
                }
                return;
            default:
                sn snVar2 = this.f36192b;
                snVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f36193c;
                    if (booleanValue2) {
                        snVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    pf.d.l(snVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
