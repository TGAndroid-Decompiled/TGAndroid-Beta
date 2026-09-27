package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class mg implements Utilities.Callback2 {
    public final int f35688a;
    public final xn f35689b;
    public final String f35690c;

    public mg(xn xnVar, String str, int i10) {
        this.f35688a = i10;
        this.f35689b = xnVar;
        this.f35690c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f35688a) {
            case 0:
                xn xnVar = this.f35689b;
                xnVar.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    String str = this.f35690c;
                    if (booleanValue) {
                        xnVar.getMessagesController().addWebBrowserException(str, true);
                    }
                    nf.f.m(xnVar.getParentActivity(), str, false, null);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    xn xnVar2 = this.f35689b;
                    String str2 = this.f35690c;
                    if (booleanValue2) {
                        xnVar2.getMessagesController().addWebBrowserException(str2, false);
                    }
                    xnVar2.getParentActivity();
                    nf.f.n(str2);
                    return;
                }
                return;
        }
    }
}
