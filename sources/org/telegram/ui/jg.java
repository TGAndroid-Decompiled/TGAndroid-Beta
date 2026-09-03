package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class jg implements Utilities.Callback2 {
    public final int f35269a;
    public final zn f35270b;
    public final String f35271c;

    public jg(zn znVar, String str, int i10) {
        this.f35269a = i10;
        this.f35270b = znVar;
        this.f35271c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f35269a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    zn znVar = this.f35270b;
                    String str = this.f35271c;
                    if (booleanValue) {
                        znVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    znVar.getParentActivity();
                    ze.d.n(str);
                    return;
                }
                return;
            default:
                zn znVar2 = this.f35270b;
                znVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f35271c;
                    if (booleanValue2) {
                        znVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    ze.d.m(znVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
