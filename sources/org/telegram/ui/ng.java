package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ng implements Utilities.Callback2 {
    public final int f38977a;
    public final yn f38978b;
    public final String f38979c;

    public ng(yn ynVar, String str, int i10) {
        this.f38977a = i10;
        this.f38978b = ynVar;
        this.f38979c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f38977a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    yn ynVar = this.f38978b;
                    String str = this.f38979c;
                    if (booleanValue) {
                        ynVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    ynVar.getParentActivity();
                    nf.f.n(str);
                    return;
                }
                return;
            default:
                yn ynVar2 = this.f38978b;
                ynVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f38979c;
                    if (booleanValue2) {
                        ynVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    nf.f.m(ynVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
