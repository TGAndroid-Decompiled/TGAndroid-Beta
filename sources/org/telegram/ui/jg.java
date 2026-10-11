package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class jg implements Utilities.Callback2 {
    public final int f39072a;
    public final zn f39073b;
    public final String f39074c;

    public jg(zn znVar, String str, int i10) {
        this.f39072a = i10;
        this.f39073b = znVar;
        this.f39074c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f39072a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    zn znVar = this.f39073b;
                    String str = this.f39074c;
                    if (booleanValue) {
                        znVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    znVar.getParentActivity();
                    of.f.n(str);
                    return;
                }
                return;
            default:
                zn znVar2 = this.f39073b;
                znVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f39074c;
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
