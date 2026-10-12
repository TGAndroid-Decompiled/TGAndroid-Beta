package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class og implements Utilities.Callback2 {
    public final int f38949a;
    public final fo f38950b;
    public final String f38951c;

    public og(fo foVar, String str, int i10) {
        this.f38949a = i10;
        this.f38950b = foVar;
        this.f38951c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f38949a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    fo foVar = this.f38950b;
                    String str = this.f38951c;
                    if (booleanValue) {
                        foVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    foVar.getParentActivity();
                    pf.d.n(str);
                    return;
                }
                return;
            default:
                fo foVar2 = this.f38950b;
                foVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f38951c;
                    if (booleanValue2) {
                        foVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    pf.d.m(foVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
