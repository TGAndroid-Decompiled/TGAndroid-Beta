package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class mg implements Utilities.Callback2 {
    public final int f35660a;
    public final zn f35661b;
    public final String f35662c;

    public mg(zn znVar, String str, int i10) {
        this.f35660a = i10;
        this.f35661b = znVar;
        this.f35662c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f35660a) {
            case 0:
                zn znVar = this.f35661b;
                znVar.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    String str = this.f35662c;
                    if (booleanValue) {
                        znVar.getMessagesController().addWebBrowserException(str, true);
                    }
                    nf.f.m(znVar.getParentActivity(), str, false, null);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    zn znVar2 = this.f35661b;
                    String str2 = this.f35662c;
                    if (booleanValue2) {
                        znVar2.getMessagesController().addWebBrowserException(str2, false);
                    }
                    znVar2.getParentActivity();
                    nf.f.n(str2);
                    return;
                }
                return;
        }
    }
}
