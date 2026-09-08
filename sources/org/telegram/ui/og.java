package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class og implements Utilities.Callback2 {
    public final int f39265a;
    public final co f39266b;
    public final String f39267c;

    public og(co coVar, String str, int i10) {
        this.f39265a = i10;
        this.f39266b = coVar;
        this.f39267c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f39265a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    co coVar = this.f39266b;
                    String str = this.f39267c;
                    if (booleanValue) {
                        coVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    coVar.getParentActivity();
                    of.f.n(str);
                    return;
                }
                return;
            default:
                co coVar2 = this.f39266b;
                coVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f39267c;
                    if (booleanValue2) {
                        coVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    of.f.m(coVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
