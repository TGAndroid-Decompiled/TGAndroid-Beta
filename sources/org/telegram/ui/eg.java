package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class eg implements Utilities.Callback2 {

    public final int f37755a;

    public final rn f37756b;

    public final String f37757c;

    public eg(rn rnVar, String str, int i10) {
        this.f37755a = i10;
        this.f37756b = rnVar;
        this.f37757c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f37755a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean zBooleanValue = bool2.booleanValue();
                    rn rnVar = this.f37756b;
                    String str = this.f37757c;
                    if (zBooleanValue) {
                        rnVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    rnVar.getParentActivity();
                    we.e.n(str);
                }
                break;
            default:
                rn rnVar2 = this.f37756b;
                rnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean zBooleanValue2 = bool2.booleanValue();
                    String str2 = this.f37757c;
                    if (zBooleanValue2) {
                        rnVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    we.e.m(rnVar2.getParentActivity(), str2, false, null);
                }
                break;
        }
    }
}
