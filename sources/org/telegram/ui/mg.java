package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class mg implements Utilities.Callback2 {
    public final int f35740a;
    public final zn f35741b;
    public final String f35742c;

    public mg(zn znVar, String str, int i10) {
        this.f35740a = i10;
        this.f35741b = znVar;
        this.f35742c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f35740a) {
            case 0:
                zn znVar = this.f35741b;
                znVar.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    String str = this.f35742c;
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
                    zn znVar2 = this.f35741b;
                    String str2 = this.f35742c;
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
