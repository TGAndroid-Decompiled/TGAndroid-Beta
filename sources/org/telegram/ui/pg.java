package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class pg implements Utilities.Callback2 {
    public final int f35832a;
    public final eo f35833b;
    public final String f35834c;

    public pg(eo eoVar, String str, int i10) {
        this.f35832a = i10;
        this.f35833b = eoVar;
        this.f35834c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f35832a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    eo eoVar = this.f35833b;
                    String str = this.f35834c;
                    if (booleanValue) {
                        eoVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    eoVar.getParentActivity();
                    nf.f.n(str);
                    return;
                }
                return;
            default:
                eo eoVar2 = this.f35833b;
                eoVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f35834c;
                    if (booleanValue2) {
                        eoVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    nf.f.m(eoVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
