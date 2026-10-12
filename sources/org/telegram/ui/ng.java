package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ng implements Utilities.Callback2 {
    public final int f40404a;
    public final eo f40405b;
    public final String f40406c;

    public ng(eo eoVar, String str, int i10) {
        this.f40404a = i10;
        this.f40405b = eoVar;
        this.f40406c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f40404a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    eo eoVar = this.f40405b;
                    String str = this.f40406c;
                    if (booleanValue) {
                        eoVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    eoVar.getParentActivity();
                    of.f.n(str);
                    return;
                }
                return;
            default:
                eo eoVar2 = this.f40405b;
                eoVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f40406c;
                    if (booleanValue2) {
                        eoVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    of.f.m(eoVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
