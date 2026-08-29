package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class bg implements Utilities.Callback2 {
    public final int f36787a;
    public final tn f36788b;
    public final String f36789c;

    public bg(tn tnVar, String str, int i10) {
        this.f36787a = i10;
        this.f36788b = tnVar;
        this.f36789c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f36787a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    tn tnVar = this.f36788b;
                    String str = this.f36789c;
                    if (booleanValue) {
                        tnVar.getMessagesController().addWebBrowserException(str, false);
                    }
                    tnVar.getParentActivity();
                    ye.d.n(str);
                    return;
                }
                return;
            default:
                tn tnVar2 = this.f36788b;
                tnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f36789c;
                    if (booleanValue2) {
                        tnVar2.getMessagesController().addWebBrowserException(str2, true);
                    }
                    ye.d.m(tnVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
