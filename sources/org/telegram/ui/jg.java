package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class jg implements Utilities.Callback2 {
    public final int f34890a;
    public final wn f34891b;
    public final String f34892c;

    public jg(wn wnVar, String str, int i10) {
        this.f34890a = i10;
        this.f34891b = wnVar;
        this.f34892c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f34890a) {
            case 0:
                wn wnVar = this.f34891b;
                wnVar.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    String str = this.f34892c;
                    if (booleanValue) {
                        wnVar.getMessagesController().addWebBrowserException(str, true);
                    }
                    nf.f.m(wnVar.getParentActivity(), str, false, null);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    wn wnVar2 = this.f34891b;
                    String str2 = this.f34892c;
                    if (booleanValue2) {
                        wnVar2.getMessagesController().addWebBrowserException(str2, false);
                    }
                    wnVar2.getParentActivity();
                    nf.f.n(str2);
                    return;
                }
                return;
        }
    }
}
