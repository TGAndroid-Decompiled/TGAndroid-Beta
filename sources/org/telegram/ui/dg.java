package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class dg implements Utilities.Callback2 {
    public final int f36184a;
    public final sn f36185b;
    public final String f36186c;

    public dg(sn snVar, String str, int i10) {
        this.f36184a = i10;
        this.f36185b = snVar;
        this.f36186c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f36184a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    sn snVar = this.f36185b;
                    String str = this.f36186c;
                    if (booleanValue) {
                        snVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    snVar.getParentActivity();
                    pf.d.m(str);
                    return;
                }
                return;
            default:
                sn snVar2 = this.f36185b;
                snVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f36186c;
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
