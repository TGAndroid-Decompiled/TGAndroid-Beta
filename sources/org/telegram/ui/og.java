package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class og implements Utilities.Callback2 {
    public final int f38638a;
    public final fo f38639b;
    public final String f38640c;

    public og(fo foVar, String str, int i10) {
        this.f38638a = i10;
        this.f38639b = foVar;
        this.f38640c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f38638a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    fo foVar = this.f38639b;
                    String str = this.f38640c;
                    if (booleanValue) {
                        foVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    foVar.getParentActivity();
                    pf.d.m(str);
                    return;
                }
                return;
            default:
                fo foVar2 = this.f38639b;
                foVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f38640c;
                    if (booleanValue2) {
                        foVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    pf.d.l(foVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
