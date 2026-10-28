package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ag implements Utilities.Callback2 {
    public final int f37770a;
    public final wn f37771b;
    public final String f37772c;

    public ag(wn wnVar, String str, int i10) {
        this.f37770a = i10;
        this.f37771b = wnVar;
        this.f37772c = str;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f37770a) {
            case 0:
                wn wnVar = this.f37771b;
                wnVar.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    String str = this.f37772c;
                    if (booleanValue) {
                        wnVar.getMessagesController().addWebBrowserException(str, true);
                    }
                    qf.d.l(wnVar.getParentActivity(), str, false, null);
                    return;
                }
                return;
            default:
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    wn wnVar2 = this.f37771b;
                    String str2 = this.f37772c;
                    if (booleanValue2) {
                        wnVar2.getMessagesController().addWebBrowserException(str2, false);
                    }
                    wnVar2.getParentActivity();
                    qf.d.m(str2);
                    return;
                }
                return;
        }
    }
}
