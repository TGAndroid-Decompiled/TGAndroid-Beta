package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class mg implements Utilities.Callback2 {
    public final int f35290a;
    public final xn f35291b;
    public final String f35292c;

    public mg(xn xnVar, String str, int i10) {
        this.f35290a = i10;
        this.f35291b = xnVar;
        this.f35292c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f35290a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    xn xnVar = this.f35291b;
                    String str = this.f35292c;
                    if (booleanValue) {
                        xnVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    xnVar.getParentActivity();
                    nf.f.n(str);
                    return;
                }
                return;
            default:
                xn xnVar2 = this.f35291b;
                xnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f35292c;
                    if (booleanValue2) {
                        xnVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    nf.f.m(xnVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
