package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class jg implements Utilities.Callback2 {
    public final int f38933a;
    public final zn f38934b;
    public final String f38935c;

    public jg(zn znVar, String str, int i10) {
        this.f38933a = i10;
        this.f38934b = znVar;
        this.f38935c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f38933a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    zn znVar = this.f38934b;
                    String str = this.f38935c;
                    if (booleanValue) {
                        znVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    znVar.getParentActivity();
                    of.f.n(str);
                    return;
                }
                return;
            default:
                zn znVar2 = this.f38934b;
                znVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f38935c;
                    if (booleanValue2) {
                        znVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    of.f.m(znVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
